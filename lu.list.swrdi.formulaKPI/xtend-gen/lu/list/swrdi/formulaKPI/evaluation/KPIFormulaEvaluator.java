package lu.list.swrdi.formulaKPI.evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import lu.list.swrdi.formulaKPI.model.formulaKPI.And;
import lu.list.swrdi.formulaKPI.model.formulaKPI.AvgOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.BoolConstant;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ComputableRef;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Computation;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Divide;
import lu.list.swrdi.formulaKPI.model.formulaKPI.EnumLiteralRef;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Equality;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Expression;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Greater;
import lu.list.swrdi.formulaKPI.model.formulaKPI.GreaterEq;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Inequality;
import lu.list.swrdi.formulaKPI.model.formulaKPI.IntConstant;
import lu.list.swrdi.formulaKPI.model.formulaKPI.KPI;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Less;
import lu.list.swrdi.formulaKPI.model.formulaKPI.LessEq;
import lu.list.swrdi.formulaKPI.model.formulaKPI.MaxOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Metric;
import lu.list.swrdi.formulaKPI.model.formulaKPI.MinOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Minus;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Multiply;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Not;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Or;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Plus;
import lu.list.swrdi.formulaKPI.model.formulaKPI.RealConstant;
import lu.list.swrdi.formulaKPI.model.formulaKPI.TextConstant;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.UnaryMinus;
import lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant;
import lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;

@SuppressWarnings("all")
public class KPIFormulaEvaluator implements KPIFormula {
  private lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula ast;

  private Map<String, Double> computedValues;

  private Map<String, Double> computedKPIs;

  public KPIFormulaEvaluator(final lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula ast) {
    this.ast = ast;
    this.computedValues = null;
    this.computedKPIs = null;
  }

  @Override
  public double evaluate(final Map<?, Double> metricValues) {
    this.interpret(this.ast, metricValues);
    Set<String> _keySet = this.computedKPIs.keySet();
    for (final String kpi : _keySet) {
      return (this.computedKPIs.get(kpi)).doubleValue();
    }
    return 0;
  }

  protected double _interpret(final lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula node, final Map<?, Double> metricValues) {
    EList<Declaration> _declarations = node.getDeclarations();
    for (final Declaration declaration : _declarations) {
      this.interpret(declaration, metricValues);
    }
    EList<Computation> _computations = node.getComputations();
    for (final Computation computation : _computations) {
      this.interpret(computation, metricValues);
    }
    return 0.0;
  }

  protected double _interpret(final Declaration node, final Map<?, Double> metricValues) {
    return 0.0;
  }

  protected double _interpret(final Computation node, final Map<?, Double> metricValues) {
    final double value = this.interpret(node.getFormula(), metricValues);
    this.interpret(node.getComputed(), metricValues);
    this.computedValues.replace(node.getComputed().getName(), Double.valueOf(value));
    this.computedKPIs.replace(node.getComputed().getName(), Double.valueOf(value));
    return 0.0;
  }

  protected double _interpret(final KPI node, final Map<?, Double> metricValues) {
    this.computedValues.put(node.getName(), Double.valueOf(0.0));
    this.computedKPIs.put(node.getName(), Double.valueOf(0.0));
    return 0.0;
  }

  protected double _interpret(final Metric node, final Map<?, Double> metricValues) {
    this.computedValues.put(node.getName(), Double.valueOf(0.0));
    return 0.0;
  }

  protected double _interpret(final ConditionalOp node, final Map<?, Double> metricValues) {
    for (int i = 0; (i < node.getConditions().size()); i++) {
      double _interpret = this.interpret(node.getConditions().get(i), metricValues);
      boolean _greaterThan = (_interpret > 0.5);
      if (_greaterThan) {
        return this.interpret(node.getResults().get(i), metricValues);
      }
    }
    EList<Expression> _results = node.getResults();
    int _size = node.getResults().size();
    int _minus = (_size - 1);
    return this.interpret(_results.get(_minus), metricValues);
  }

  protected double _interpret(final Or node, final Map<?, Double> metricValues) {
    double _interpret = this.interpret(node.getLeft(), metricValues);
    final boolean left = (_interpret > 0.5);
    double _interpret_1 = this.interpret(node.getRight(), metricValues);
    final boolean right = (_interpret_1 > 0.5);
    int _xifexpression = (int) 0;
    if ((left || right)) {
      _xifexpression = 1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }

  protected double _interpret(final And node, final Map<?, Double> metricValues) {
    double _interpret = this.interpret(node.getLeft(), metricValues);
    final boolean left = (_interpret > 0.5);
    double _interpret_1 = this.interpret(node.getRight(), metricValues);
    final boolean right = (_interpret_1 > 0.5);
    int _xifexpression = (int) 0;
    if ((left && right)) {
      _xifexpression = 1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }

  protected double _interpret(final Equality node, final Map<?, Double> metricValues) {
    int _xifexpression = (int) 0;
    double _interpret = this.interpret(node.getLeft(), metricValues);
    double _interpret_1 = this.interpret(node.getRight(), metricValues);
    boolean _equals = (_interpret == _interpret_1);
    if (_equals) {
      _xifexpression = 1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }

  protected double _interpret(final Inequality node, final Map<?, Double> metricValues) {
    int _xifexpression = (int) 0;
    double _interpret = this.interpret(node.getLeft(), metricValues);
    double _interpret_1 = this.interpret(node.getRight(), metricValues);
    boolean _notEquals = (_interpret != _interpret_1);
    if (_notEquals) {
      _xifexpression = 1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }

  protected double _interpret(final GreaterEq node, final Map<?, Double> metricValues) {
    int _xifexpression = (int) 0;
    double _interpret = this.interpret(node.getLeft(), metricValues);
    double _interpret_1 = this.interpret(node.getRight(), metricValues);
    boolean _greaterEqualsThan = (_interpret >= _interpret_1);
    if (_greaterEqualsThan) {
      _xifexpression = 1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }

  protected double _interpret(final LessEq node, final Map<?, Double> metricValues) {
    int _xifexpression = (int) 0;
    double _interpret = this.interpret(node.getLeft(), metricValues);
    double _interpret_1 = this.interpret(node.getRight(), metricValues);
    boolean _lessEqualsThan = (_interpret <= _interpret_1);
    if (_lessEqualsThan) {
      _xifexpression = 1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }

  protected double _interpret(final Greater node, final Map<?, Double> metricValues) {
    int _xifexpression = (int) 0;
    double _interpret = this.interpret(node.getLeft(), metricValues);
    double _interpret_1 = this.interpret(node.getRight(), metricValues);
    boolean _greaterThan = (_interpret > _interpret_1);
    if (_greaterThan) {
      _xifexpression = 1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }

  protected double _interpret(final Less node, final Map<?, Double> metricValues) {
    int _xifexpression = (int) 0;
    double _interpret = this.interpret(node.getLeft(), metricValues);
    double _interpret_1 = this.interpret(node.getRight(), metricValues);
    boolean _lessThan = (_interpret < _interpret_1);
    if (_lessThan) {
      _xifexpression = 1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }

  protected double _interpret(final Plus node, final Map<?, Double> metricValues) {
    double _interpret = this.interpret(node.getLeft(), metricValues);
    double _interpret_1 = this.interpret(node.getRight(), metricValues);
    return (_interpret + _interpret_1);
  }

  protected double _interpret(final Minus node, final Map<?, Double> metricValues) {
    double _interpret = this.interpret(node.getLeft(), metricValues);
    double _interpret_1 = this.interpret(node.getRight(), metricValues);
    return (_interpret - _interpret_1);
  }

  protected double _interpret(final Multiply node, final Map<?, Double> metricValues) {
    double _interpret = this.interpret(node.getLeft(), metricValues);
    double _interpret_1 = this.interpret(node.getRight(), metricValues);
    return (_interpret * _interpret_1);
  }

  protected double _interpret(final Divide node, final Map<?, Double> metricValues) {
    double _interpret = this.interpret(node.getLeft(), metricValues);
    double _interpret_1 = this.interpret(node.getRight(), metricValues);
    return (_interpret / _interpret_1);
  }

  protected double _interpret(final Not node, final Map<?, Double> metricValues) {
    int _xifexpression = (int) 0;
    double _interpret = this.interpret(node.getExpression(), metricValues);
    boolean _greaterThan = (_interpret > 0.5);
    if (_greaterThan) {
      _xifexpression = 0;
    } else {
      _xifexpression = 1;
    }
    return _xifexpression;
  }

  protected double _interpret(final UnaryMinus node, final Map<?, Double> metricValues) {
    double _interpret = this.interpret(node.getExpression(), metricValues);
    return (-_interpret);
  }

  protected double _interpret(final AvgOp node, final Map<?, Double> metricValues) {
    double sum = 0.0;
    int count = 0;
    EList<Expression> _expressions = node.getExpressions();
    for (final Expression expr : _expressions) {
      {
        double _sum = sum;
        double _interpret = this.interpret(expr, metricValues);
        sum = (_sum + _interpret);
        count++;
      }
    }
    if ((count <= 0)) {
      return 0.0;
    }
    return (sum / count);
  }

  protected double _interpret(final WeightedSumOp node, final Map<?, Double> metricValues) {
    double sum = 0.0;
    int count = 0;
    for (int i = 0; (i < node.getExpressions().size()); i++) {
      double _sum = sum;
      double _interpret = this.interpret(node.getExpressions().get(i), metricValues);
      double _interpret_1 = this.interpret(node.getWeights().get(i), metricValues);
      double _multiply = (_interpret * _interpret_1);
      sum = (_sum + _multiply);
    }
    return sum;
  }

  protected double _interpret(final MinOp node, final Map<?, Double> metricValues) {
    final ArrayList<Double> results = new ArrayList<Double>();
    EList<Expression> _expressions = node.getExpressions();
    for (final Expression expr : _expressions) {
      results.add(Double.valueOf(this.interpret(expr, metricValues)));
    }
    return (double) IterableExtensions.<Double>min(results);
  }

  protected double _interpret(final MaxOp node, final Map<?, Double> metricValues) {
    final ArrayList<Double> results = new ArrayList<Double>();
    EList<Expression> _expressions = node.getExpressions();
    for (final Expression expr : _expressions) {
      results.add(Double.valueOf(this.interpret(expr, metricValues)));
    }
    return (double) IterableExtensions.<Double>max(results);
  }

  protected double _interpret(final ThresholdOp node, final Map<?, Double> metricValues) {
    final double value = this.interpret(node.getExpression(), metricValues);
    final double thresh = this.interpret(node.getThreshold(), metricValues);
    int _xifexpression = (int) 0;
    if ((value >= thresh)) {
      _xifexpression = 1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }

  protected double _interpret(final IntConstant node, final Map<?, Double> metricValues) {
    return node.getValue();
  }

  protected double _interpret(final RealConstant node, final Map<?, Double> metricValues) {
    return node.getValue();
  }

  protected double _interpret(final TextConstant node, final Map<?, Double> metricValues) {
    return 0.0;
  }

  protected double _interpret(final BoolConstant node, final Map<?, Double> metricValues) {
    int _xifexpression = (int) 0;
    String _value = node.getValue();
    boolean _equals = Objects.equals(_value, "true");
    if (_equals) {
      _xifexpression = 1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }

  protected double _interpret(final UnitConstant node, final Map<?, Double> metricValues) {
    return node.getValue();
  }

  protected double _interpret(final EnumLiteralRef node, final Map<?, Double> metricValues) {
    return 0.0;
  }

  protected double _interpret(final ComputableRef node, final Map<?, Double> metricValues) {
    boolean _containsKey = metricValues.containsKey(node.getComputable().getName());
    if (_containsKey) {
      return (metricValues.get(node.getComputable().getName())).doubleValue();
    }
    boolean _containsKey_1 = this.computedValues.containsKey(node.getComputable().getName());
    if (_containsKey_1) {
      return (metricValues.get(node.getComputable().getName())).doubleValue();
    }
    return 0.0;
  }

  @XbaseGenerated
  public double interpret(final EObject node, final Map<?, Double> metricValues) {
    if (node instanceof And) {
      return _interpret((And)node, metricValues);
    } else if (node instanceof BoolConstant) {
      return _interpret((BoolConstant)node, metricValues);
    } else if (node instanceof Divide) {
      return _interpret((Divide)node, metricValues);
    } else if (node instanceof Equality) {
      return _interpret((Equality)node, metricValues);
    } else if (node instanceof Greater) {
      return _interpret((Greater)node, metricValues);
    } else if (node instanceof GreaterEq) {
      return _interpret((GreaterEq)node, metricValues);
    } else if (node instanceof Inequality) {
      return _interpret((Inequality)node, metricValues);
    } else if (node instanceof IntConstant) {
      return _interpret((IntConstant)node, metricValues);
    } else if (node instanceof KPI) {
      return _interpret((KPI)node, metricValues);
    } else if (node instanceof Less) {
      return _interpret((Less)node, metricValues);
    } else if (node instanceof LessEq) {
      return _interpret((LessEq)node, metricValues);
    } else if (node instanceof Metric) {
      return _interpret((Metric)node, metricValues);
    } else if (node instanceof Minus) {
      return _interpret((Minus)node, metricValues);
    } else if (node instanceof Multiply) {
      return _interpret((Multiply)node, metricValues);
    } else if (node instanceof Or) {
      return _interpret((Or)node, metricValues);
    } else if (node instanceof Plus) {
      return _interpret((Plus)node, metricValues);
    } else if (node instanceof RealConstant) {
      return _interpret((RealConstant)node, metricValues);
    } else if (node instanceof TextConstant) {
      return _interpret((TextConstant)node, metricValues);
    } else if (node instanceof UnitConstant) {
      return _interpret((UnitConstant)node, metricValues);
    } else if (node instanceof AvgOp) {
      return _interpret((AvgOp)node, metricValues);
    } else if (node instanceof ComputableRef) {
      return _interpret((ComputableRef)node, metricValues);
    } else if (node instanceof ConditionalOp) {
      return _interpret((ConditionalOp)node, metricValues);
    } else if (node instanceof EnumLiteralRef) {
      return _interpret((EnumLiteralRef)node, metricValues);
    } else if (node instanceof MaxOp) {
      return _interpret((MaxOp)node, metricValues);
    } else if (node instanceof MinOp) {
      return _interpret((MinOp)node, metricValues);
    } else if (node instanceof Not) {
      return _interpret((Not)node, metricValues);
    } else if (node instanceof ThresholdOp) {
      return _interpret((ThresholdOp)node, metricValues);
    } else if (node instanceof UnaryMinus) {
      return _interpret((UnaryMinus)node, metricValues);
    } else if (node instanceof WeightedSumOp) {
      return _interpret((WeightedSumOp)node, metricValues);
    } else if (node instanceof Computation) {
      return _interpret((Computation)node, metricValues);
    } else if (node instanceof Declaration) {
      return _interpret((Declaration)node, metricValues);
    } else if (node instanceof lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula) {
      return _interpret((lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula)node, metricValues);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node, metricValues).toString());
    }
  }
}
