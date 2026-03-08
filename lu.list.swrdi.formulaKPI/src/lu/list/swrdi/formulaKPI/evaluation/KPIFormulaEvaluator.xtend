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
import java.util.ArrayList

class KPIFormulaEvaluator implements lu.list.swrdi.formulaKPI.evaluation.KPIFormula {
	KPIFormula ast;
	Map<String, Double> computedValues;
	Map<String, Double> computedKPIs;
	
	new(KPIFormula ast) {
		this.ast = ast
		this.computedValues = {}
		this.computedKPIs = {}
	}	
	
	override evaluate(Map<?, Double> metricValues) {
		ast.interpret(metricValues)
		for(kpi: this.computedKPIs.keySet){
			return this.computedKPIs.get(kpi)
		}
	}
	
	def dispatch double interpret(KPIFormula node, Map<?, Double> metricValues){
		for (declaration : node.declarations) {
			declaration.interpret(metricValues)
		}
		for (computation : node.computations) {
			computation.interpret(metricValues)
		}
		return 0.0
	}
	
	def dispatch double interpret(Declaration node, Map<?, Double> metricValues){
		return 0.0
	}
	
	def dispatch double interpret(Computation node, Map<?, Double> metricValues){
		val value = node.formula.interpret(metricValues)
		node.computed.interpret(metricValues)
		this.computedValues.replace(node.computed.name, value)
		this.computedKPIs.replace(node.computed.name, value)
		return 0.0
	}
	
	def dispatch double interpret(KPI node, Map<?, Double> metricValues){
		this.computedValues.put(node.name, 0.0)
		this.computedKPIs.put(node.name, 0.0)
		return 0.0
	}
	
	def dispatch double interpret(Metric node, Map<?, Double> metricValues){
		this.computedValues.put(node.name, 0.0)
		return 0.0
	}
	
	def dispatch double interpret(ConditionalOp node, Map<?, Double> metricValues){
        // invariant : results.size - condition.size = 1
		for(var i = 0; i < node.conditions.size; i++){
			if(node.conditions.get(i).interpret(metricValues) > 0.5){
				return node.results.get(i).interpret(metricValues)
			}
		}
		return node.results.get(node.results.size - 1).interpret(metricValues)
	}
	
	def dispatch double interpret(Or node, Map<?, Double> metricValues){
		val left = node.left.interpret(metricValues) > 0.5
		val right = node.right.interpret(metricValues) > 0.5
		return left || right ? 1 : 0
	}
	
	def dispatch double interpret(And node, Map<?, Double> metricValues){
		val left = node.left.interpret(metricValues) > 0.5
		val right = node.right.interpret(metricValues) > 0.5
		return left && right ? 1 : 0
	}
	
	def dispatch double interpret(Equality node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues) == node.right.interpret(metricValues) ? 1 : 0
	}
	
	def dispatch double interpret(Inequality node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues) != node.right.interpret(metricValues) ? 1 : 0
	}
	
	def dispatch double interpret(GreaterEq node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues) >= node.right.interpret(metricValues) ? 1 : 0
	}
	
	def dispatch double interpret(LessEq node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues) <= node.right.interpret(metricValues) ? 1 : 0
	}
	
	def dispatch double interpret(Greater node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues) > node.right.interpret(metricValues) ? 1 : 0
	}
	
	def dispatch double interpret(Less node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues) < node.right.interpret(metricValues) ? 1 : 0
	}
	
	def dispatch double interpret(Plus node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues) + node.right.interpret(metricValues)
	}
	
	def dispatch double interpret(Minus node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues) - node.right.interpret(metricValues)
	}
	
	def dispatch double interpret(Multiply node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues) * node.right.interpret(metricValues)
	}
	
	def dispatch double interpret(Divide node, Map<?, Double> metricValues){
		return node.left.interpret(metricValues) / node.right.interpret(metricValues)
	}
	
	def dispatch double interpret(Not node, Map<?, Double> metricValues){
		return node.expression.interpret(metricValues) > 0.5 ? 0 : 1
	}
	
	def dispatch double interpret(UnaryMinus node, Map<?, Double> metricValues){
		return - node.expression.interpret(metricValues)
	}
	
	def dispatch double interpret(AvgOp node, Map<?, Double> metricValues){
		var sum = 0.0
		var count = 0
		for(expr: node.expressions){
			sum += expr.interpret(metricValues)
			count++
		}
		if(count <= 0){
			return 0.0
		}
		return sum / count
	}
	
	def dispatch double interpret(WeightedSumOp node, Map<?, Double> metricValues){
		var sum = 0.0
		var count = 0
		for(var i = 0; i < node.expressions.size; i++){
			sum += node.expressions.get(i).interpret(metricValues) * node.weights.get(i).interpret(metricValues)
		}
		return sum
	}
	
	def dispatch double interpret(MinOp node, Map<?, Double> metricValues){
		val results = new ArrayList()
		for(expr: node.expressions){
			results.add(expr.interpret(metricValues))
		}
		return results.min
	}
	
	def dispatch double interpret(MaxOp node, Map<?, Double> metricValues){
		val results = new ArrayList()
		for(expr: node.expressions){
			results.add(expr.interpret(metricValues))
		}
		return results.max
	}
	
	def dispatch double interpret(ThresholdOp node, Map<?, Double> metricValues){
		val value = node.expression.interpret(metricValues)
		val thresh = node.threshold.interpret(metricValues)
		return value >= thresh ? 1 : 0
	}
	
	def dispatch double interpret(IntConstant node, Map<?, Double> metricValues){
		return node.value
	}
	
	def dispatch double interpret(RealConstant node, Map<?, Double> metricValues){
		return node.value
	}
	
	def dispatch double interpret(TextConstant node, Map<?, Double> metricValues){
		return 0.0
	}
	
	def dispatch double interpret(BoolConstant node, Map<?, Double> metricValues){
		return node.value == "true" ? 1 : 0
	}
	
	def dispatch double interpret(UnitConstant node, Map<?, Double> metricValues){
		return node.value
	}
	
	def dispatch double interpret(EnumLiteralRef node, Map<?, Double> metricValues){
		return 0.0
	}
	
	def dispatch double interpret(ComputableRef node, Map<?, Double> metricValues){
		if(metricValues.containsKey(node.computable.name)){
			return metricValues.get(node.computable.name)
		}
		if(this.computedValues.containsKey(node.computable.name)){
			return metricValues.get(node.computable.name)
		}
		return 0.0
		
	}
	
}