/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.util;

import lu.list.swrdi.formulaKPI.model.formulaKPI.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage
 * @generated
 */
public class formulaKPISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static formulaKPIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formulaKPISwitch() {
		if (modelPackage == null) {
			modelPackage = formulaKPIPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case formulaKPIPackage.COMPUTATION: {
			Computation computation = (Computation) theEObject;
			T result = caseComputation(computation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.QUALITY_MODEL: {
			QualityModel qualityModel = (QualityModel) theEObject;
			T result = caseQualityModel(qualityModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.COMPUTABLE: {
			Computable computable = (Computable) theEObject;
			T result = caseComputable(computable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.DECLARATION: {
			Declaration declaration = (Declaration) theEObject;
			T result = caseDeclaration(declaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.KPI_FORMULA: {
			KPIFormula kpiFormula = (KPIFormula) theEObject;
			T result = caseKPIFormula(kpiFormula);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.QUALITY_ATTRIBUTE: {
			QualityAttribute qualityAttribute = (QualityAttribute) theEObject;
			T result = caseQualityAttribute(qualityAttribute);
			if (result == null)
				result = caseComputable(qualityAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.VALUE_TYPE: {
			ValueType valueType = (ValueType) theEObject;
			T result = caseValueType(valueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.METRIC: {
			Metric metric = (Metric) theEObject;
			T result = caseMetric(metric);
			if (result == null)
				result = caseDeclarable(metric);
			if (result == null)
				result = caseComputable(metric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.DECLARABLE: {
			Declarable declarable = (Declarable) theEObject;
			T result = caseDeclarable(declarable);
			if (result == null)
				result = caseComputable(declarable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.KPI: {
			KPI kpi = (KPI) theEObject;
			T result = caseKPI(kpi);
			if (result == null)
				result = caseDeclarable(kpi);
			if (result == null)
				result = caseComputable(kpi);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.PROVIDER: {
			Provider provider = (Provider) theEObject;
			T result = caseProvider(provider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.QUALITY_CHARACTERISTIC: {
			QualityCharacteristic qualityCharacteristic = (QualityCharacteristic) theEObject;
			T result = caseQualityCharacteristic(qualityCharacteristic);
			if (result == null)
				result = caseComputable(qualityCharacteristic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.INTEGER_VALUE: {
			IntegerValue integerValue = (IntegerValue) theEObject;
			T result = caseIntegerValue(integerValue);
			if (result == null)
				result = caseValueType(integerValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.REAL_VALUE: {
			RealValue realValue = (RealValue) theEObject;
			T result = caseRealValue(realValue);
			if (result == null)
				result = caseValueType(realValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.TEXTUAL_VALUE: {
			TextualValue textualValue = (TextualValue) theEObject;
			T result = caseTextualValue(textualValue);
			if (result == null)
				result = caseValueType(textualValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.BOOLEAN_VALUE: {
			BooleanValue booleanValue = (BooleanValue) theEObject;
			T result = caseBooleanValue(booleanValue);
			if (result == null)
				result = caseValueType(booleanValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.ENUMERATION_VALUE: {
			EnumerationValue enumerationValue = (EnumerationValue) theEObject;
			T result = caseEnumerationValue(enumerationValue);
			if (result == null)
				result = caseValueType(enumerationValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.AGGREGATION_VALUE: {
			AggregationValue aggregationValue = (AggregationValue) theEObject;
			T result = caseAggregationValue(aggregationValue);
			if (result == null)
				result = caseValueType(aggregationValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.ENUMERATION_LITERAL: {
			EnumerationLiteral enumerationLiteral = (EnumerationLiteral) theEObject;
			T result = caseEnumerationLiteral(enumerationLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.UNIT_VALUE: {
			UnitValue unitValue = (UnitValue) theEObject;
			T result = caseUnitValue(unitValue);
			if (result == null)
				result = caseValueType(unitValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.DRIFT_VALUE: {
			DriftValue driftValue = (DriftValue) theEObject;
			T result = caseDriftValue(driftValue);
			if (result == null)
				result = caseValueType(driftValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.MINIMUM: {
			Minimum minimum = (Minimum) theEObject;
			T result = caseMinimum(minimum);
			if (result == null)
				result = caseOperation(minimum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.AVERAGE: {
			Average average = (Average) theEObject;
			T result = caseAverage(average);
			if (result == null)
				result = caseOperation(average);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.MEDIAN: {
			Median median = (Median) theEObject;
			T result = caseMedian(median);
			if (result == null)
				result = caseOperation(median);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.STANDARD_DEVIATION: {
			StandardDeviation standardDeviation = (StandardDeviation) theEObject;
			T result = caseStandardDeviation(standardDeviation);
			if (result == null)
				result = caseOperation(standardDeviation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.MAXIMUM: {
			Maximum maximum = (Maximum) theEObject;
			T result = caseMaximum(maximum);
			if (result == null)
				result = caseOperation(maximum);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.BIN_OP: {
			BinOp binOp = (BinOp) theEObject;
			T result = caseBinOp(binOp);
			if (result == null)
				result = caseExpression(binOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.GREATER: {
			Greater greater = (Greater) theEObject;
			T result = caseGreater(greater);
			if (result == null)
				result = caseBinOp(greater);
			if (result == null)
				result = caseExpression(greater);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.MULTIPLY: {
			Multiply multiply = (Multiply) theEObject;
			T result = caseMultiply(multiply);
			if (result == null)
				result = caseBinOp(multiply);
			if (result == null)
				result = caseExpression(multiply);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.MINUS: {
			Minus minus = (Minus) theEObject;
			T result = caseMinus(minus);
			if (result == null)
				result = caseBinOp(minus);
			if (result == null)
				result = caseExpression(minus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.PLUS: {
			Plus plus = (Plus) theEObject;
			T result = casePlus(plus);
			if (result == null)
				result = caseBinOp(plus);
			if (result == null)
				result = caseExpression(plus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.LESS_EQ: {
			LessEq lessEq = (LessEq) theEObject;
			T result = caseLessEq(lessEq);
			if (result == null)
				result = caseBinOp(lessEq);
			if (result == null)
				result = caseExpression(lessEq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.GREATER_EQ: {
			GreaterEq greaterEq = (GreaterEq) theEObject;
			T result = caseGreaterEq(greaterEq);
			if (result == null)
				result = caseBinOp(greaterEq);
			if (result == null)
				result = caseExpression(greaterEq);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseBinOp(and);
			if (result == null)
				result = caseExpression(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.NOT: {
			Not not = (Not) theEObject;
			T result = caseNot(not);
			if (result == null)
				result = caseExpression(not);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.LITERAL: {
			Literal literal = (Literal) theEObject;
			T result = caseLiteral(literal);
			if (result == null)
				result = caseExpression(literal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.REAL_CONSTANT: {
			RealConstant realConstant = (RealConstant) theEObject;
			T result = caseRealConstant(realConstant);
			if (result == null)
				result = caseLiteral(realConstant);
			if (result == null)
				result = caseExpression(realConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.UNARY_MINUS: {
			UnaryMinus unaryMinus = (UnaryMinus) theEObject;
			T result = caseUnaryMinus(unaryMinus);
			if (result == null)
				result = caseExpression(unaryMinus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.DIVIDE: {
			Divide divide = (Divide) theEObject;
			T result = caseDivide(divide);
			if (result == null)
				result = caseBinOp(divide);
			if (result == null)
				result = caseExpression(divide);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.LESS: {
			Less less = (Less) theEObject;
			T result = caseLess(less);
			if (result == null)
				result = caseBinOp(less);
			if (result == null)
				result = caseExpression(less);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.INEQUALITY: {
			Inequality inequality = (Inequality) theEObject;
			T result = caseInequality(inequality);
			if (result == null)
				result = caseBinOp(inequality);
			if (result == null)
				result = caseExpression(inequality);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.EQUALITY: {
			Equality equality = (Equality) theEObject;
			T result = caseEquality(equality);
			if (result == null)
				result = caseBinOp(equality);
			if (result == null)
				result = caseExpression(equality);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseBinOp(or);
			if (result == null)
				result = caseExpression(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.MIN_OP: {
			MinOp minOp = (MinOp) theEObject;
			T result = caseMinOp(minOp);
			if (result == null)
				result = caseExpression(minOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.CONDITIONAL_OP: {
			ConditionalOp conditionalOp = (ConditionalOp) theEObject;
			T result = caseConditionalOp(conditionalOp);
			if (result == null)
				result = caseExpression(conditionalOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.THRESHOLD_OP: {
			ThresholdOp thresholdOp = (ThresholdOp) theEObject;
			T result = caseThresholdOp(thresholdOp);
			if (result == null)
				result = caseExpression(thresholdOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.WEIGHTED_SUM_OP: {
			WeightedSumOp weightedSumOp = (WeightedSumOp) theEObject;
			T result = caseWeightedSumOp(weightedSumOp);
			if (result == null)
				result = caseExpression(weightedSumOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.AVG_OP: {
			AvgOp avgOp = (AvgOp) theEObject;
			T result = caseAvgOp(avgOp);
			if (result == null)
				result = caseExpression(avgOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.MAX_OP: {
			MaxOp maxOp = (MaxOp) theEObject;
			T result = caseMaxOp(maxOp);
			if (result == null)
				result = caseExpression(maxOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.TEXT_CONSTANT: {
			TextConstant textConstant = (TextConstant) theEObject;
			T result = caseTextConstant(textConstant);
			if (result == null)
				result = caseLiteral(textConstant);
			if (result == null)
				result = caseExpression(textConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.ENUM_LITERAL_REF: {
			EnumLiteralRef enumLiteralRef = (EnumLiteralRef) theEObject;
			T result = caseEnumLiteralRef(enumLiteralRef);
			if (result == null)
				result = caseExpression(enumLiteralRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.INT_CONSTANT: {
			IntConstant intConstant = (IntConstant) theEObject;
			T result = caseIntConstant(intConstant);
			if (result == null)
				result = caseLiteral(intConstant);
			if (result == null)
				result = caseExpression(intConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.UNIT_CONSTANT: {
			UnitConstant unitConstant = (UnitConstant) theEObject;
			T result = caseUnitConstant(unitConstant);
			if (result == null)
				result = caseLiteral(unitConstant);
			if (result == null)
				result = caseExpression(unitConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.BOOL_CONSTANT: {
			BoolConstant boolConstant = (BoolConstant) theEObject;
			T result = caseBoolConstant(boolConstant);
			if (result == null)
				result = caseLiteral(boolConstant);
			if (result == null)
				result = caseExpression(boolConstant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case formulaKPIPackage.COMPUTABLE_REF: {
			ComputableRef computableRef = (ComputableRef) theEObject;
			T result = caseComputableRef(computableRef);
			if (result == null)
				result = caseExpression(computableRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputation(Computation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityModel(QualityModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputable(Computable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPIFormula(KPIFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityAttribute(QualityAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declarable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declarable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarable(Declarable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KPI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KPI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKPI(KPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvider(Provider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityCharacteristic(QualityCharacteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealValue(RealValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualValue(TextualValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationValue(EnumerationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationValue(AggregationValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitValue(UnitValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drift Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drift Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDriftValue(DriftValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinimum(Minimum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Average</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Average</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAverage(Average object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Median</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Median</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedian(Median object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardDeviation(StandardDeviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximum(Maximum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bin Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bin Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinOp(BinOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreater(Greater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiply(Multiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Eq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessEq(LessEq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Eq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterEq(GreaterEq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealConstant(RealConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryMinus(UnaryMinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivide(Divide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLess(Less object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inequality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inequality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInequality(Inequality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquality(Equality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinOp(MinOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalOp(ConditionalOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threshold Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threshold Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThresholdOp(ThresholdOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weighted Sum Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weighted Sum Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightedSumOp(WeightedSumOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avg Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avg Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvgOp(AvgOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxOp(MaxOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextConstant(TextConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteralRef(EnumLiteralRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntConstant(IntConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitConstant(UnitConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolConstant(BoolConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computable Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computable Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputableRef(ComputableRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //formulaKPISwitch
