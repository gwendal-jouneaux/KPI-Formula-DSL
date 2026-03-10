/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.util;

import lu.list.swrdi.formulaKPI.model.formulaKPI.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage
 * @generated
 */
public class formulaKPIAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static formulaKPIPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formulaKPIAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = formulaKPIPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected formulaKPISwitch<Adapter> modelSwitch = new formulaKPISwitch<Adapter>() {
		@Override
		public Adapter caseComputation(Computation object) {
			return createComputationAdapter();
		}

		@Override
		public Adapter caseQualityModel(QualityModel object) {
			return createQualityModelAdapter();
		}

		@Override
		public Adapter caseComputable(Computable object) {
			return createComputableAdapter();
		}

		@Override
		public Adapter caseDeclaration(Declaration object) {
			return createDeclarationAdapter();
		}

		@Override
		public Adapter caseKPIFormula(KPIFormula object) {
			return createKPIFormulaAdapter();
		}

		@Override
		public Adapter caseQualityAttribute(QualityAttribute object) {
			return createQualityAttributeAdapter();
		}

		@Override
		public Adapter caseValueType(ValueType object) {
			return createValueTypeAdapter();
		}

		@Override
		public Adapter caseMetric(Metric object) {
			return createMetricAdapter();
		}

		@Override
		public Adapter caseDeclarable(Declarable object) {
			return createDeclarableAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseKPI(KPI object) {
			return createKPIAdapter();
		}

		@Override
		public Adapter caseProvider(Provider object) {
			return createProviderAdapter();
		}

		@Override
		public Adapter caseQualityCharacteristic(QualityCharacteristic object) {
			return createQualityCharacteristicAdapter();
		}

		@Override
		public Adapter caseIntegerValue(IntegerValue object) {
			return createIntegerValueAdapter();
		}

		@Override
		public Adapter caseRealValue(RealValue object) {
			return createRealValueAdapter();
		}

		@Override
		public Adapter caseTextualValue(TextualValue object) {
			return createTextualValueAdapter();
		}

		@Override
		public Adapter caseBooleanValue(BooleanValue object) {
			return createBooleanValueAdapter();
		}

		@Override
		public Adapter caseEnumerationValue(EnumerationValue object) {
			return createEnumerationValueAdapter();
		}

		@Override
		public Adapter caseAggregationValue(AggregationValue object) {
			return createAggregationValueAdapter();
		}

		@Override
		public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
			return createEnumerationLiteralAdapter();
		}

		@Override
		public Adapter caseUnitValue(UnitValue object) {
			return createUnitValueAdapter();
		}

		@Override
		public Adapter caseDriftValue(DriftValue object) {
			return createDriftValueAdapter();
		}

		@Override
		public Adapter caseMinimum(Minimum object) {
			return createMinimumAdapter();
		}

		@Override
		public Adapter caseAverage(Average object) {
			return createAverageAdapter();
		}

		@Override
		public Adapter caseMedian(Median object) {
			return createMedianAdapter();
		}

		@Override
		public Adapter caseStandardDeviation(StandardDeviation object) {
			return createStandardDeviationAdapter();
		}

		@Override
		public Adapter caseMaximum(Maximum object) {
			return createMaximumAdapter();
		}

		@Override
		public Adapter caseBinOp(BinOp object) {
			return createBinOpAdapter();
		}

		@Override
		public Adapter caseGreater(Greater object) {
			return createGreaterAdapter();
		}

		@Override
		public Adapter caseMultiply(Multiply object) {
			return createMultiplyAdapter();
		}

		@Override
		public Adapter caseMinus(Minus object) {
			return createMinusAdapter();
		}

		@Override
		public Adapter casePlus(Plus object) {
			return createPlusAdapter();
		}

		@Override
		public Adapter caseLessEq(LessEq object) {
			return createLessEqAdapter();
		}

		@Override
		public Adapter caseGreaterEq(GreaterEq object) {
			return createGreaterEqAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseLiteral(Literal object) {
			return createLiteralAdapter();
		}

		@Override
		public Adapter caseRealConstant(RealConstant object) {
			return createRealConstantAdapter();
		}

		@Override
		public Adapter caseUnaryMinus(UnaryMinus object) {
			return createUnaryMinusAdapter();
		}

		@Override
		public Adapter caseDivide(Divide object) {
			return createDivideAdapter();
		}

		@Override
		public Adapter caseLess(Less object) {
			return createLessAdapter();
		}

		@Override
		public Adapter caseInequality(Inequality object) {
			return createInequalityAdapter();
		}

		@Override
		public Adapter caseEquality(Equality object) {
			return createEqualityAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter caseListSize(ListSize object) {
			return createListSizeAdapter();
		}

		@Override
		public Adapter caseListLiteral(ListLiteral object) {
			return createListLiteralAdapter();
		}

		@Override
		public Adapter caseMinOp(MinOp object) {
			return createMinOpAdapter();
		}

		@Override
		public Adapter caseConditionalOp(ConditionalOp object) {
			return createConditionalOpAdapter();
		}

		@Override
		public Adapter caseThresholdOp(ThresholdOp object) {
			return createThresholdOpAdapter();
		}

		@Override
		public Adapter caseWeightedSumOp(WeightedSumOp object) {
			return createWeightedSumOpAdapter();
		}

		@Override
		public Adapter caseAvgOp(AvgOp object) {
			return createAvgOpAdapter();
		}

		@Override
		public Adapter caseMaxOp(MaxOp object) {
			return createMaxOpAdapter();
		}

		@Override
		public Adapter caseListOperation(ListOperation object) {
			return createListOperationAdapter();
		}

		@Override
		public Adapter caseListIteration(ListIteration object) {
			return createListIterationAdapter();
		}

		@Override
		public Adapter caseListReduce(ListReduce object) {
			return createListReduceAdapter();
		}

		@Override
		public Adapter caseListFilter(ListFilter object) {
			return createListFilterAdapter();
		}

		@Override
		public Adapter caseListIterator(ListIterator object) {
			return createListIteratorAdapter();
		}

		@Override
		public Adapter caseTextConstant(TextConstant object) {
			return createTextConstantAdapter();
		}

		@Override
		public Adapter caseEnumLiteralRef(EnumLiteralRef object) {
			return createEnumLiteralRefAdapter();
		}

		@Override
		public Adapter caseIntConstant(IntConstant object) {
			return createIntConstantAdapter();
		}

		@Override
		public Adapter caseUnitConstant(UnitConstant object) {
			return createUnitConstantAdapter();
		}

		@Override
		public Adapter caseBoolConstant(BoolConstant object) {
			return createBoolConstantAdapter();
		}

		@Override
		public Adapter caseComputableRef(ComputableRef object) {
			return createComputableRefAdapter();
		}

		@Override
		public Adapter caseAccumulator(Accumulator object) {
			return createAccumulatorAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computation <em>Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Computation
	 * @generated
	 */
	public Adapter createComputationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityModel <em>Quality Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.QualityModel
	 * @generated
	 */
	public Adapter createQualityModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computable <em>Computable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Computable
	 * @generated
	 */
	public Adapter createComputableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula <em>KPI Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula
	 * @generated
	 */
	public Adapter createKPIFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityAttribute <em>Quality Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.QualityAttribute
	 * @generated
	 */
	public Adapter createQualityAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Declarable <em>Declarable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Declarable
	 * @generated
	 */
	public Adapter createDeclarableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.KPI <em>KPI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.KPI
	 * @generated
	 */
	public Adapter createKPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Provider
	 * @generated
	 */
	public Adapter createProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityCharacteristic <em>Quality Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.QualityCharacteristic
	 * @generated
	 */
	public Adapter createQualityCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.IntegerValue
	 * @generated
	 */
	public Adapter createIntegerValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.RealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.RealValue
	 * @generated
	 */
	public Adapter createRealValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.TextualValue <em>Textual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.TextualValue
	 * @generated
	 */
	public Adapter createTextualValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationValue <em>Enumeration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationValue
	 * @generated
	 */
	public Adapter createEnumerationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.AggregationValue <em>Aggregation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.AggregationValue
	 * @generated
	 */
	public Adapter createAggregationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitValue <em>Unit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.UnitValue
	 * @generated
	 */
	public Adapter createUnitValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue <em>Drift Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue
	 * @generated
	 */
	public Adapter createDriftValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Minimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Minimum
	 * @generated
	 */
	public Adapter createMinimumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Average <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Average
	 * @generated
	 */
	public Adapter createAverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Median <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Median
	 * @generated
	 */
	public Adapter createMedianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.StandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.StandardDeviation
	 * @generated
	 */
	public Adapter createStandardDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Maximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Maximum
	 * @generated
	 */
	public Adapter createMaximumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp <em>Bin Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp
	 * @generated
	 */
	public Adapter createBinOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Greater
	 * @generated
	 */
	public Adapter createGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Multiply
	 * @generated
	 */
	public Adapter createMultiplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.LessEq <em>Less Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.LessEq
	 * @generated
	 */
	public Adapter createLessEqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.GreaterEq <em>Greater Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.GreaterEq
	 * @generated
	 */
	public Adapter createGreaterEqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.RealConstant <em>Real Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.RealConstant
	 * @generated
	 */
	public Adapter createRealConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnaryMinus <em>Unary Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.UnaryMinus
	 * @generated
	 */
	public Adapter createUnaryMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Divide
	 * @generated
	 */
	public Adapter createDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Less
	 * @generated
	 */
	public Adapter createLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Inequality <em>Inequality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Inequality
	 * @generated
	 */
	public Adapter createInequalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Equality
	 * @generated
	 */
	public Adapter createEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ListSize <em>List Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ListSize
	 * @generated
	 */
	public Adapter createListSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ListLiteral <em>List Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ListLiteral
	 * @generated
	 */
	public Adapter createListLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.MinOp <em>Min Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.MinOp
	 * @generated
	 */
	public Adapter createMinOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp <em>Conditional Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp
	 * @generated
	 */
	public Adapter createConditionalOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp <em>Threshold Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp
	 * @generated
	 */
	public Adapter createThresholdOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp <em>Weighted Sum Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp
	 * @generated
	 */
	public Adapter createWeightedSumOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.AvgOp <em>Avg Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.AvgOp
	 * @generated
	 */
	public Adapter createAvgOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.MaxOp <em>Max Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.MaxOp
	 * @generated
	 */
	public Adapter createMaxOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ListOperation <em>List Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ListOperation
	 * @generated
	 */
	public Adapter createListOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ListIteration <em>List Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ListIteration
	 * @generated
	 */
	public Adapter createListIterationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ListReduce <em>List Reduce</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ListReduce
	 * @generated
	 */
	public Adapter createListReduceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ListFilter <em>List Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ListFilter
	 * @generated
	 */
	public Adapter createListFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ListIterator <em>List Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ListIterator
	 * @generated
	 */
	public Adapter createListIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.TextConstant <em>Text Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.TextConstant
	 * @generated
	 */
	public Adapter createTextConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.EnumLiteralRef <em>Enum Literal Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.EnumLiteralRef
	 * @generated
	 */
	public Adapter createEnumLiteralRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.IntConstant
	 * @generated
	 */
	public Adapter createIntConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant <em>Unit Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant
	 * @generated
	 */
	public Adapter createUnitConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.BoolConstant
	 * @generated
	 */
	public Adapter createBoolConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ComputableRef <em>Computable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ComputableRef
	 * @generated
	 */
	public Adapter createComputableRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Accumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Accumulator
	 * @generated
	 */
	public Adapter createAccumulatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //formulaKPIAdapterFactory
