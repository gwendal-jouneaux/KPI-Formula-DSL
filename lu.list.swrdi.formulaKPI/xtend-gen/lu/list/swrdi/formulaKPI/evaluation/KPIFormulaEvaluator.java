package lu.list.swrdi.formulaKPI.evaluation;

import java.util.Arrays;
import java.util.List;
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
import lu.list.swrdi.formulaKPI.model.formulaKPI.ListLiteral;
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
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;

@SuppressWarnings("all")
public class KPIFormulaEvaluator implements KPIFormula {
  private lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula ast;

  private Map<String, Value> computedValues;

  private Map<String, Value> computedKPIs;

  public KPIFormulaEvaluator(final lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula ast) {
    this.ast = ast;
    this.computedValues = CollectionLiterals.<String, Value>newHashMap();
    this.computedKPIs = CollectionLiterals.<String, Value>newHashMap();
  }

  @Override
  public double evaluate(final Map<?, Double> metricValues) {
    this.interpret(this.ast, metricValues);
    Set<String> _keySet = this.computedKPIs.keySet();
    for (final String kpi : _keySet) {
      {
        final Value value = this.computedKPIs.get(kpi);
        if ((value instanceof Value.DoubleValue)) {
          return (((Value.DoubleValue) value).getValue()).doubleValue();
        }
      }
    }
    return 0.0;
  }

  protected Value _interpret(final lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula node, final Map<?, Double> metricValues) {
    EList<Declaration> _declarations = node.getDeclarations();
    for (final Declaration declaration : _declarations) {
      this.interpret(declaration, metricValues);
    }
    EList<Computation> _computations = node.getComputations();
    for (final Computation computation : _computations) {
      this.interpret(computation, metricValues);
    }
    return new Value.NullValue();
  }

  protected Value _interpret(final Declaration node, final Map<?, Double> metricValues) {
    return this.interpret(node.getDeclared(), metricValues);
  }

  protected Value _interpret(final Computation node, final Map<?, Double> metricValues) {
    final Value value = this.interpret(node.getFormula(), metricValues);
    this.interpret(node.getComputed(), metricValues);
    this.computedValues.replace(node.getComputed().getName(), value);
    this.computedKPIs.replace(node.getComputed().getName(), value);
    return new Value.NullValue();
  }

  protected Value _interpret(final KPI node, final Map<?, Double> metricValues) {
    String _name = node.getName();
    Value.DoubleValue _doubleValue = new Value.DoubleValue(0);
    this.computedValues.put(_name, _doubleValue);
    String _name_1 = node.getName();
    Value.DoubleValue _doubleValue_1 = new Value.DoubleValue(0);
    this.computedKPIs.put(_name_1, _doubleValue_1);
    return new Value.NullValue();
  }

  protected Value _interpret(final Metric node, final Map<?, Double> metricValues) {
    String _name = node.getName();
    Value.DoubleValue _doubleValue = new Value.DoubleValue(0);
    this.computedValues.put(_name, _doubleValue);
    return new Value.NullValue();
  }

  protected Value _interpret(final ConditionalOp node, final Map<?, Double> metricValues) {
    for (int i = 0; (i < node.getConditions().size()); i++) {
      {
        Object _value = this.interpret(node.getConditions().get(i), metricValues).getValue();
        final Double condValue = ((Double) _value);
        if (((condValue).doubleValue() > 0.5)) {
          return this.interpret(node.getResults().get(i), metricValues);
        }
      }
    }
    EList<Expression> _results = node.getResults();
    int _size = node.getResults().size();
    int _minus = (_size - 1);
    return this.interpret(_results.get(_minus), metricValues);
  }

  protected Value _interpret(final Or node, final Map<?, Double> metricValues) {
    final Value left = this.interpret(node.getLeft(), metricValues);
    final Value right = this.interpret(node.getRight(), metricValues);
    if ((left instanceof Value.ListValue)) {
      if ((right instanceof Value.ListValue)) {
        final Value.ListValue<Object> out = new Value.ListValue<Object>();
        out.getValue().addAll(((Value.ListValue)left).getValue());
        out.getValue().addAll(((Value.ListValue)right).getValue());
        return out;
      } else {
        final Value.ListValue<Object> out_1 = new Value.ListValue<Object>();
        out_1.getValue().addAll(((Value.ListValue)left).getValue());
        out_1.getValue().add(right);
        return out_1;
      }
    } else {
      if ((right instanceof Value.ListValue)) {
        final Value.ListValue<Object> out_2 = new Value.ListValue<Object>();
        out_2.getValue().add(left);
        out_2.getValue().addAll(((Value.ListValue)right).getValue());
        return out_2;
      } else {
        Value.DoubleValue _xifexpression = null;
        if ((((((Double) left.getValue())).doubleValue() > 0.5) || ((((Double) right.getValue())).doubleValue() > 0.5))) {
          _xifexpression = new Value.DoubleValue(1);
        } else {
          _xifexpression = new Value.DoubleValue(0);
        }
        return _xifexpression;
      }
    }
  }

  protected Value _interpret(final And node, final Map<?, Double> metricValues) {
    final Value left = this.interpret(node.getLeft(), metricValues);
    final Value right = this.interpret(node.getRight(), metricValues);
    if ((left instanceof Value.ListValue)) {
      if ((right instanceof Value.ListValue)) {
        final Value.ListValue<Object> out = new Value.ListValue<Object>();
        out.getValue().addAll(((Value.ListValue)left).getValue());
        out.getValue().retainAll(((Value.ListValue)right).getValue());
        return out;
      } else {
        final Value.ListValue<Object> out_1 = new Value.ListValue<Object>();
        boolean _contains = ((Value.ListValue)left).getValue().contains(right);
        if (_contains) {
          out_1.getValue().add(right);
        }
        return out_1;
      }
    } else {
      if ((right instanceof Value.ListValue)) {
        final Value.ListValue<Object> out_2 = new Value.ListValue<Object>();
        boolean _contains_1 = ((Value.ListValue)right).getValue().contains(left);
        if (_contains_1) {
          out_2.getValue().add(left);
        }
        return out_2;
      } else {
        Value.DoubleValue _xifexpression = null;
        if ((((((Double) left.getValue())).doubleValue() > 0.5) && ((((Double) right.getValue())).doubleValue() > 0.5))) {
          _xifexpression = new Value.DoubleValue(1);
        } else {
          _xifexpression = new Value.DoubleValue(0);
        }
        return _xifexpression;
      }
    }
  }

  protected Value _interpret(final Equality node, final Map<?, Double> metricValues) {
    Value.DoubleValue _xifexpression = null;
    boolean _equals = this.interpret(node.getLeft(), metricValues).equals(this.interpret(node.getRight(), metricValues));
    if (_equals) {
      _xifexpression = new Value.DoubleValue(1);
    } else {
      _xifexpression = new Value.DoubleValue(0);
    }
    return _xifexpression;
  }

  protected Value _interpret(final Inequality node, final Map<?, Double> metricValues) {
    Value.DoubleValue _xifexpression = null;
    boolean _equals = this.interpret(node.getLeft(), metricValues).equals(this.interpret(node.getRight(), metricValues));
    boolean _not = (!_equals);
    if (_not) {
      _xifexpression = new Value.DoubleValue(1);
    } else {
      _xifexpression = new Value.DoubleValue(0);
    }
    return _xifexpression;
  }

  protected Value _interpret(final GreaterEq node, final Map<?, Double> metricValues) {
    Value.DoubleValue _xifexpression = null;
    int _compareTo = this.interpret(node.getLeft(), metricValues).compareTo(this.interpret(node.getRight(), metricValues));
    boolean _greaterEqualsThan = (_compareTo >= 0);
    if (_greaterEqualsThan) {
      _xifexpression = new Value.DoubleValue(1);
    } else {
      _xifexpression = new Value.DoubleValue(0);
    }
    return _xifexpression;
  }

  protected Value _interpret(final LessEq node, final Map<?, Double> metricValues) {
    Value.DoubleValue _xifexpression = null;
    int _compareTo = this.interpret(node.getLeft(), metricValues).compareTo(this.interpret(node.getRight(), metricValues));
    boolean _lessEqualsThan = (_compareTo <= 0);
    if (_lessEqualsThan) {
      _xifexpression = new Value.DoubleValue(1);
    } else {
      _xifexpression = new Value.DoubleValue(0);
    }
    return _xifexpression;
  }

  protected Value _interpret(final Greater node, final Map<?, Double> metricValues) {
    Value.DoubleValue _xifexpression = null;
    int _compareTo = this.interpret(node.getLeft(), metricValues).compareTo(this.interpret(node.getRight(), metricValues));
    boolean _greaterThan = (_compareTo > 0);
    if (_greaterThan) {
      _xifexpression = new Value.DoubleValue(1);
    } else {
      _xifexpression = new Value.DoubleValue(0);
    }
    return _xifexpression;
  }

  protected Value _interpret(final Less node, final Map<?, Double> metricValues) {
    Value.DoubleValue _xifexpression = null;
    int _compareTo = this.interpret(node.getLeft(), metricValues).compareTo(this.interpret(node.getRight(), metricValues));
    boolean _lessThan = (_compareTo < 0);
    if (_lessThan) {
      _xifexpression = new Value.DoubleValue(1);
    } else {
      _xifexpression = new Value.DoubleValue(0);
    }
    return _xifexpression;
  }

  protected Value _interpret(final Plus node, final Map<?, Double> metricValues) {
    final Value left = this.interpret(node.getLeft(), metricValues);
    final Value right = this.interpret(node.getRight(), metricValues);
    if ((left instanceof Value.ListValue)) {
      if ((right instanceof Value.ListValue)) {
        final Value.ListValue<Object> out = new Value.ListValue<Object>();
        out.getValue().addAll(((Value.ListValue)left).getValue());
        out.getValue().addAll(((Value.ListValue)right).getValue());
        return out;
      } else {
        final Value.ListValue<Object> out_1 = new Value.ListValue<Object>();
        out_1.getValue().addAll(((Value.ListValue)left).getValue());
        out_1.getValue().add(right);
        return out_1;
      }
    } else {
      if ((right instanceof Value.ListValue)) {
        final Value.ListValue<Object> out_2 = new Value.ListValue<Object>();
        out_2.getValue().add(left);
        out_2.getValue().addAll(((Value.ListValue)right).getValue());
        return out_2;
      } else {
        Object _value = left.getValue();
        Object _value_1 = right.getValue();
        double _plus = DoubleExtensions.operator_plus(((Double) _value), ((Double) _value_1));
        return new Value.DoubleValue(_plus);
      }
    }
  }

  protected Value _interpret(final Minus node, final Map<?, Double> metricValues) {
    final Value left = this.interpret(node.getLeft(), metricValues);
    final Value right = this.interpret(node.getRight(), metricValues);
    Object _value = left.getValue();
    Object _value_1 = right.getValue();
    double _minus = DoubleExtensions.operator_minus(((Double) _value), ((Double) _value_1));
    return new Value.DoubleValue(_minus);
  }

  protected Value _interpret(final Multiply node, final Map<?, Double> metricValues) {
    final Value left = this.interpret(node.getLeft(), metricValues);
    final Value right = this.interpret(node.getRight(), metricValues);
    Object _value = left.getValue();
    Object _value_1 = right.getValue();
    double _multiply = DoubleExtensions.operator_multiply(((Double) _value), ((Double) _value_1));
    return new Value.DoubleValue(_multiply);
  }

  protected Value _interpret(final Divide node, final Map<?, Double> metricValues) {
    final Value left = this.interpret(node.getLeft(), metricValues);
    final Value right = this.interpret(node.getRight(), metricValues);
    Object _value = left.getValue();
    Object _value_1 = right.getValue();
    double _divide = DoubleExtensions.operator_divide(((Double) _value), ((Double) _value_1));
    return new Value.DoubleValue(_divide);
  }

  protected Value _interpret(final Not node, final Map<?, Double> metricValues) {
    Value.DoubleValue _xifexpression = null;
    Value _interpret = this.interpret(node.getExpression(), metricValues);
    boolean _greaterThan = (_interpret.compareTo(Double.valueOf(0.5)) > 0);
    if (_greaterThan) {
      _xifexpression = new Value.DoubleValue(1);
    } else {
      _xifexpression = new Value.DoubleValue(0);
    }
    return _xifexpression;
  }

  protected Value _interpret(final UnaryMinus node, final Map<?, Double> metricValues) {
    final Value value = this.interpret(node.getExpression(), metricValues);
    Object _value = value.getValue();
    double _minus = DoubleExtensions.operator_minus(((Double) _value));
    return new Value.DoubleValue(_minus);
  }

  protected Value _interpret(final AvgOp node, final Map<?, Double> metricValues) {
    double sum = 0.0;
    int count = 0;
    Value _interpret = this.interpret(node.getList(), metricValues);
    final List list = ((Value.ListValue) _interpret).getValue();
    for (final Object elem : list) {
      {
        double _sum = sum;
        Double _value = ((Value.DoubleValue) elem).getValue();
        sum = (_sum + (_value).doubleValue());
        count++;
      }
    }
    if ((count <= 0)) {
      return new Value.DoubleValue(0);
    }
    return new Value.DoubleValue((sum / count));
  }

  protected Value _interpret(final WeightedSumOp node, final Map<?, Double> metricValues) {
    double sum = 0.0;
    Value _interpret = this.interpret(node.getList(), metricValues);
    final List elements = ((Value.ListValue) _interpret).getValue();
    Value _interpret_1 = this.interpret(node.getWeights(), metricValues);
    final List weights = ((Value.ListValue) _interpret_1).getValue();
    for (int i = 0; (i < elements.size()); i++) {
      double _sum = sum;
      Object _get = elements.get(i);
      Double _value = ((Value.DoubleValue) _get).getValue();
      Object _get_1 = weights.get(i);
      Double _value_1 = ((Value.DoubleValue) _get_1).getValue();
      double _multiply = DoubleExtensions.operator_multiply(_value, _value_1);
      sum = (_sum + _multiply);
    }
    return new Value.DoubleValue(sum);
  }

  protected Value _interpret(final MinOp node, final Map<?, Double> metricValues) {
    Value _interpret = this.interpret(node.getList(), metricValues);
    final List<Value<Value>> elements = ((Value.ListValue<Value>) _interpret).getValue();
    return IterableExtensions.<Value<Value>>min(elements);
  }

  protected Value _interpret(final MaxOp node, final Map<?, Double> metricValues) {
    Value _interpret = this.interpret(node.getList(), metricValues);
    final List<Value<Value>> elements = ((Value.ListValue<Value>) _interpret).getValue();
    return IterableExtensions.<Value<Value>>max(elements);
  }

  protected Value _interpret(final ThresholdOp node, final Map<?, Double> metricValues) {
    final Value value = this.interpret(node.getExpression(), metricValues);
    final Value thresh = this.interpret(node.getThreshold(), metricValues);
    Value.DoubleValue _xifexpression = null;
    boolean _greaterEqualsThan = (value.compareTo(thresh) >= 0);
    if (_greaterEqualsThan) {
      _xifexpression = new Value.DoubleValue(1);
    } else {
      _xifexpression = new Value.DoubleValue(0);
    }
    return _xifexpression;
  }

  protected Value _interpret(final IntConstant node, final Map<?, Double> metricValues) {
    int _value = node.getValue();
    return new Value.DoubleValue(_value);
  }

  protected Value _interpret(final RealConstant node, final Map<?, Double> metricValues) {
    double _value = node.getValue();
    return new Value.DoubleValue(_value);
  }

  protected Value _interpret(final TextConstant node, final Map<?, Double> metricValues) {
    int _length = node.getValue().length();
    return new Value.DoubleValue(_length);
  }

  protected Value _interpret(final BoolConstant node, final Map<?, Double> metricValues) {
    Value.DoubleValue _xifexpression = null;
    String _value = node.getValue();
    boolean _equals = Objects.equals(_value, "true");
    if (_equals) {
      _xifexpression = new Value.DoubleValue(1);
    } else {
      _xifexpression = new Value.DoubleValue(0);
    }
    return _xifexpression;
  }

  protected Value _interpret(final UnitConstant node, final Map<?, Double> metricValues) {
    double _value = node.getValue();
    return new Value.DoubleValue(_value);
  }

  protected Value _interpret(final EnumLiteralRef node, final Map<?, Double> metricValues) {
    return new Value.DoubleValue(0);
  }

  protected Value _interpret(final ComputableRef node, final Map<?, Double> metricValues) {
    boolean _containsKey = metricValues.containsKey(node.getComputable().getName());
    if (_containsKey) {
      Double _get = metricValues.get(node.getComputable().getName());
      return new Value.DoubleValue((_get).doubleValue());
    }
    boolean _containsKey_1 = this.computedValues.containsKey(node.getComputable().getName());
    if (_containsKey_1) {
      return this.computedValues.get(node.getComputable().getName());
    }
    return new Value.DoubleValue(0);
  }

  protected Value _interpret(final ListLiteral node, final Map<?, Double> metricValues) {
    final Value.ListValue<Object> result = new Value.ListValue<Object>();
    EList<Expression> _elements = node.getElements();
    for (final Expression elem : _elements) {
      result.getValue().add(this.interpret(elem, metricValues));
    }
    return result;
  }

  @XbaseGenerated
  public Value interpret(final EObject node, final Map<?, Double> metricValues) {
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
    } else if (node instanceof ListLiteral) {
      return _interpret((ListLiteral)node, metricValues);
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
