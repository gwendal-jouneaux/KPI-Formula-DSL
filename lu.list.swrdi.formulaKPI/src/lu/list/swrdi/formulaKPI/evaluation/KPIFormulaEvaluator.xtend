package lu.list.swrdi.formulaKPI.evaluation

import java.util.Map
import lu.list.swrdi.formulaKPI.model.formulaKPI.And
import lu.list.swrdi.formulaKPI.model.formulaKPI.AvgOp
import lu.list.swrdi.formulaKPI.model.formulaKPI.BoolConstant
import lu.list.swrdi.formulaKPI.model.formulaKPI.ComputableRef
import lu.list.swrdi.formulaKPI.model.formulaKPI.Computation
import lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp
import lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration
import lu.list.swrdi.formulaKPI.model.formulaKPI.Divide
import lu.list.swrdi.formulaKPI.model.formulaKPI.EnumLiteralRef
import lu.list.swrdi.formulaKPI.model.formulaKPI.Equality
import lu.list.swrdi.formulaKPI.model.formulaKPI.Greater
import lu.list.swrdi.formulaKPI.model.formulaKPI.GreaterEq
import lu.list.swrdi.formulaKPI.model.formulaKPI.Inequality
import lu.list.swrdi.formulaKPI.model.formulaKPI.IntConstant
import lu.list.swrdi.formulaKPI.model.formulaKPI.KPI
import lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula
import lu.list.swrdi.formulaKPI.model.formulaKPI.Less
import lu.list.swrdi.formulaKPI.model.formulaKPI.LessEq
import lu.list.swrdi.formulaKPI.model.formulaKPI.ListLiteral
import lu.list.swrdi.formulaKPI.model.formulaKPI.MaxOp
import lu.list.swrdi.formulaKPI.model.formulaKPI.Metric
import lu.list.swrdi.formulaKPI.model.formulaKPI.MinOp
import lu.list.swrdi.formulaKPI.model.formulaKPI.Minus
import lu.list.swrdi.formulaKPI.model.formulaKPI.Multiply
import lu.list.swrdi.formulaKPI.model.formulaKPI.Not
import lu.list.swrdi.formulaKPI.model.formulaKPI.Or
import lu.list.swrdi.formulaKPI.model.formulaKPI.Plus
import lu.list.swrdi.formulaKPI.model.formulaKPI.RealConstant
import lu.list.swrdi.formulaKPI.model.formulaKPI.TextConstant
import lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp
import lu.list.swrdi.formulaKPI.model.formulaKPI.UnaryMinus
import lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant
import lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp
import lu.list.swrdi.formulaKPI.evaluation.Value.NullValue
import lu.list.swrdi.formulaKPI.evaluation.Value.ListValue
import lu.list.swrdi.formulaKPI.evaluation.Value.DoubleValue

class KPIFormulaEvaluator implements lu.list.swrdi.formulaKPI.evaluation.KPIFormula {
	KPIFormula ast;
	Map<String, Value> computedValues;
	Map<String, Value> computedKPIs;
	
	new(KPIFormula ast) {
		this.ast = ast
		this.computedValues = newHashMap()
		this.computedKPIs = newHashMap()
	}	
	
	override evaluate(Map<?, Double> metricValues) {
		ast.interpret(metricValues)
		for(kpi: this.computedKPIs.keySet){
			val value = this.computedKPIs.get(kpi)
			if(value instanceof DoubleValue){
				return (value as DoubleValue).getValue()
			}
		}
		return 0.0
	}
	
	def dispatch Value interpret(KPIFormula node, Map<?, Double> metricValues){
		for (declaration : node.declarations) {
			declaration.interpret(metricValues)
		}
		for (computation : node.computations) {
			computation.interpret(metricValues)
		}
		return new NullValue()
	}
	
	def dispatch Value interpret(Declaration node, Map<?, Double> metricValues){
		return node.declared.interpret(metricValues)
	}
	
	def dispatch Value interpret(Computation node, Map<?, Double> metricValues){
		val value = node.formula.interpret(metricValues)
		node.computed.interpret(metricValues)
		this.computedValues.replace(node.computed.name, value)
		this.computedKPIs.replace(node.computed.name, value)
		return new NullValue()
	}
	
	def dispatch Value interpret(KPI node, Map<?, Double> metricValues){
		this.computedValues.put(node.name, new DoubleValue(0))
		this.computedKPIs.put(node.name, new DoubleValue(0))
		return new NullValue()
	}
	
	def dispatch Value interpret(Metric node, Map<?, Double> metricValues){
		this.computedValues.put(node.name, new DoubleValue(0))
		return new NullValue()
	}
	
	def dispatch Value interpret(ConditionalOp node, Map<?, Double> metricValues){
        // invariant : results.size - condition.size = 1
		for(var i = 0; i < node.conditions.size; i++){
			val condValue = node.conditions.get(i).interpret(metricValues).value as Double
			if(condValue > 0.5){
				return node.results.get(i).interpret(metricValues)
			}
		}
		return node.results.get(node.results.size - 1).interpret(metricValues)
	}
	
	def dispatch Value interpret(Or node, Map<?, Double> metricValues){
		val left = node.left.interpret(metricValues)
		val right = node.right.interpret(metricValues)
		if(left instanceof ListValue){
			if(right instanceof ListValue){
				val out = new ListValue()
				out.value.addAll(left.value)
				out.value.addAll(right.value)
				return out
			} else {
				val out = new ListValue()
				out.value.addAll(left.value)
				out.value.add(right)
				return out
			}
		} else {
			if(right instanceof ListValue){
				val out = new ListValue()
				out.value.add(left)
				out.value.addAll(right.value)
				return out
			} else {
				return left.value as Double > 0.5 || right.value as Double > 0.5 ? new DoubleValue(1) : new DoubleValue(0)
			}
		}
	}
	
	def dispatch Value interpret(And node, Map<?, Double> metricValues){
		val left = node.left.interpret(metricValues)
		val right = node.right.interpret(metricValues)
		if(left instanceof ListValue){
			if(right instanceof ListValue){
				val out = new ListValue()
				out.value.addAll(left.value)
				out.value.retainAll(right.value)
				return out
			} else {
				val out = new ListValue()
				if(left.value.contains(right)){
					out.value.add(right)
				}
				return out
			}
		} else {
			if(right instanceof ListValue){
				val out = new ListValue()
				if(right.value.contains(left)){
					out.value.add(left)
				}
				return out
			} else {
				return left.value as Double > 0.5 && right.value as Double > 0.5 ? new DoubleValue(1) : new DoubleValue(0)
			}
		}
	}
	
	def dispatch Value interpret(Equality node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues).equals(node.right.interpret(metricValues)) ? new DoubleValue(1) : new DoubleValue(0)
	}
	
	def dispatch Value interpret(Inequality node, Map<?, Double> metricValues){
		return !node.left.interpret(metricValues).equals(node.right.interpret(metricValues)) ? new DoubleValue(1) : new DoubleValue(0)
	}
	
	def dispatch Value interpret(GreaterEq node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues).compareTo(node.right.interpret(metricValues)) >= 0 ? new DoubleValue(1) : new DoubleValue(0)
	}
	
	def dispatch Value interpret(LessEq node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues).compareTo(node.right.interpret(metricValues)) <= 0 ? new DoubleValue(1) : new DoubleValue(0)
	}
	
	def dispatch Value interpret(Greater node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues).compareTo(node.right.interpret(metricValues)) > 0 ? new DoubleValue(1) : new DoubleValue(0)
	}
	
	def dispatch Value interpret(Less node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues).compareTo(node.right.interpret(metricValues)) < 0 ? new DoubleValue(1) : new DoubleValue(0)
	}
	
	def dispatch Value interpret(Plus node, Map<?, Double> metricValues){
		val left = node.left.interpret(metricValues)
		val right = node.right.interpret(metricValues)
		if(left instanceof ListValue){
			if(right instanceof ListValue){
				val out = new ListValue()
				out.value.addAll(left.value)
				out.value.addAll(right.value)
				return out
			} else {
				val out = new ListValue()
				out.value.addAll(left.value)
				out.value.add(right)
				return out
			}
		} else {
			if(right instanceof ListValue){
				val out = new ListValue()
				out.value.add(left)
				out.value.addAll(right.value)
				return out
			} else {
				return new DoubleValue(left.value as Double + right.value as Double)
			}
		}
	}
	
	def dispatch Value interpret(Minus node, Map<?, Double> metricValues){
		val left = node.left.interpret(metricValues)
		val right = node.right.interpret(metricValues)
		return new DoubleValue(left.value as Double - right.value as Double)
	}
	
	def dispatch Value interpret(Multiply node, Map<?, Double> metricValues){
		val left = node.left.interpret(metricValues)
		val right = node.right.interpret(metricValues)
		return new DoubleValue(left.value as Double * right.value as Double)
	}
	
	def dispatch Value interpret(Divide node, Map<?, Double> metricValues){
		val left = node.left.interpret(metricValues)
		val right = node.right.interpret(metricValues)
		return new DoubleValue(left.value as Double / right.value as Double)
	}
	
	def dispatch Value interpret(Not node, Map<?, Double> metricValues){
		return node.expression.interpret(metricValues) > 0.5 ? new DoubleValue(1) : new DoubleValue(0)
	}
	
	def dispatch Value interpret(UnaryMinus node, Map<?, Double> metricValues){
		val value = node.expression.interpret(metricValues)
		return new DoubleValue(- value.value as Double)
	}
	
	def dispatch Value interpret(AvgOp node, Map<?, Double> metricValues){
		var sum = 0.0
		var count = 0
		val list = (node.list.interpret(metricValues) as ListValue).value
		for(elem: list){
			sum += (elem as DoubleValue).value
			count++
		}
		if(count <= 0){
			return new DoubleValue(0)
		}
		return new DoubleValue(sum / count)
	}
	
	def dispatch Value interpret(WeightedSumOp node, Map<?, Double> metricValues){
		var sum = 0.0
		val elements = (node.list.interpret(metricValues) as ListValue).value
		val weights = (node.weights.interpret(metricValues) as ListValue).value
		for(var i = 0; i < elements.size; i++){
			sum += (elements.get(i) as DoubleValue).value * (weights.get(i) as DoubleValue).value
		}
		return new DoubleValue(sum)
	}
	
	def dispatch Value interpret(MinOp node, Map<?, Double> metricValues){
		val elements = (node.list.interpret(metricValues) as ListValue<Value>).value
		return elements.min
	}
	
	def dispatch Value interpret(MaxOp node, Map<?, Double> metricValues){
		val elements = (node.list.interpret(metricValues) as ListValue<Value>).value
		return elements.max
	}
	
	def dispatch Value interpret(ThresholdOp node, Map<?, Double> metricValues){
		val value = node.expression.interpret(metricValues)
		val thresh = node.threshold.interpret(metricValues)
		return value >= thresh ? new DoubleValue(1) : new DoubleValue(0)
	}
	
	def dispatch Value interpret(IntConstant node, Map<?, Double> metricValues){
		return new DoubleValue(node.value)
	}
	
	def dispatch Value interpret(RealConstant node, Map<?, Double> metricValues){
		return new DoubleValue(node.value)
	}
	
	def dispatch Value interpret(TextConstant node, Map<?, Double> metricValues){
		return new DoubleValue(node.value.length)
	}
	
	def dispatch Value interpret(BoolConstant node, Map<?, Double> metricValues){
		return node.value == "true" ? new DoubleValue(1) : new DoubleValue(0)
	}
	
	def dispatch Value interpret(UnitConstant node, Map<?, Double> metricValues){
		return new DoubleValue(node.value)
	}
	
	def dispatch Value interpret(EnumLiteralRef node, Map<?, Double> metricValues){
		return new DoubleValue(0)
	}
	
	def dispatch Value interpret(ComputableRef node, Map<?, Double> metricValues){
		if(metricValues.containsKey(node.computable.name)){
			return new DoubleValue(metricValues.get(node.computable.name))
		}
		if(this.computedValues.containsKey(node.computable.name)){
			return this.computedValues.get(node.computable.name)
		}
		return new DoubleValue(0)
		
	}
	
	def dispatch Value interpret(ListLiteral node, Map<?, Double> metricValues){
		val result = new ListValue()
		for(elem: node.elements){
			result.value.add(elem.interpret(metricValues))
		}
		return result
	}
	
}