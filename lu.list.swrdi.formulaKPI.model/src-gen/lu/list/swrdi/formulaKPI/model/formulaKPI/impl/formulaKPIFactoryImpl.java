/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import lu.list.swrdi.formulaKPI.model.formulaKPI.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class formulaKPIFactoryImpl extends EFactoryImpl implements formulaKPIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static formulaKPIFactory init() {
		try {
			formulaKPIFactory theformulaKPIFactory = (formulaKPIFactory) EPackage.Registry.INSTANCE
					.getEFactory(formulaKPIPackage.eNS_URI);
			if (theformulaKPIFactory != null) {
				return theformulaKPIFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new formulaKPIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formulaKPIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case formulaKPIPackage.COMPUTATION:
			return createComputation();
		case formulaKPIPackage.QUALITY_MODEL:
			return createQualityModel();
		case formulaKPIPackage.DECLARATION:
			return createDeclaration();
		case formulaKPIPackage.KPI_FORMULA:
			return createKPIFormula();
		case formulaKPIPackage.QUALITY_ATTRIBUTE:
			return createQualityAttribute();
		case formulaKPIPackage.METRIC:
			return createMetric();
		case formulaKPIPackage.KPI:
			return createKPI();
		case formulaKPIPackage.PROVIDER:
			return createProvider();
		case formulaKPIPackage.QUALITY_CHARACTERISTIC:
			return createQualityCharacteristic();
		case formulaKPIPackage.INTEGER_VALUE:
			return createIntegerValue();
		case formulaKPIPackage.REAL_VALUE:
			return createRealValue();
		case formulaKPIPackage.TEXTUAL_VALUE:
			return createTextualValue();
		case formulaKPIPackage.BOOLEAN_VALUE:
			return createBooleanValue();
		case formulaKPIPackage.ENUMERATION_VALUE:
			return createEnumerationValue();
		case formulaKPIPackage.AGGREGATION_VALUE:
			return createAggregationValue();
		case formulaKPIPackage.ENUMERATION_LITERAL:
			return createEnumerationLiteral();
		case formulaKPIPackage.UNIT_VALUE:
			return createUnitValue();
		case formulaKPIPackage.DRIFT_VALUE:
			return createDriftValue();
		case formulaKPIPackage.MINIMUM:
			return createMinimum();
		case formulaKPIPackage.AVERAGE:
			return createAverage();
		case formulaKPIPackage.MEDIAN:
			return createMedian();
		case formulaKPIPackage.STANDARD_DEVIATION:
			return createStandardDeviation();
		case formulaKPIPackage.MAXIMUM:
			return createMaximum();
		case formulaKPIPackage.GREATER:
			return createGreater();
		case formulaKPIPackage.MULTIPLY:
			return createMultiply();
		case formulaKPIPackage.MINUS:
			return createMinus();
		case formulaKPIPackage.PLUS:
			return createPlus();
		case formulaKPIPackage.LESS_EQ:
			return createLessEq();
		case formulaKPIPackage.GREATER_EQ:
			return createGreaterEq();
		case formulaKPIPackage.AND:
			return createAnd();
		case formulaKPIPackage.NOT:
			return createNot();
		case formulaKPIPackage.REAL_CONSTANT:
			return createRealConstant();
		case formulaKPIPackage.UNARY_MINUS:
			return createUnaryMinus();
		case formulaKPIPackage.DIVIDE:
			return createDivide();
		case formulaKPIPackage.LESS:
			return createLess();
		case formulaKPIPackage.INEQUALITY:
			return createInequality();
		case formulaKPIPackage.EQUALITY:
			return createEquality();
		case formulaKPIPackage.OR:
			return createOr();
		case formulaKPIPackage.MIN_OP:
			return createMinOp();
		case formulaKPIPackage.CONDITIONAL_OP:
			return createConditionalOp();
		case formulaKPIPackage.THRESHOLD_OP:
			return createThresholdOp();
		case formulaKPIPackage.WEIGHTED_SUM_OP:
			return createWeightedSumOp();
		case formulaKPIPackage.AVG_OP:
			return createAvgOp();
		case formulaKPIPackage.MAX_OP:
			return createMaxOp();
		case formulaKPIPackage.TEXT_CONSTANT:
			return createTextConstant();
		case formulaKPIPackage.ENUM_LITERAL_REF:
			return createEnumLiteralRef();
		case formulaKPIPackage.INT_CONSTANT:
			return createIntConstant();
		case formulaKPIPackage.UNIT_CONSTANT:
			return createUnitConstant();
		case formulaKPIPackage.BOOL_CONSTANT:
			return createBoolConstant();
		case formulaKPIPackage.COMPUTABLE_REF:
			return createComputableRef();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case formulaKPIPackage.WINDOW_UNIT:
			return createWindowUnitFromString(eDataType, initialValue);
		case formulaKPIPackage.VALUE_UNIT:
			return createValueUnitFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case formulaKPIPackage.WINDOW_UNIT:
			return convertWindowUnitToString(eDataType, instanceValue);
		case formulaKPIPackage.VALUE_UNIT:
			return convertValueUnitToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computation createComputation() {
		ComputationImpl computation = new ComputationImpl();
		return computation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityModel createQualityModel() {
		QualityModelImpl qualityModel = new QualityModelImpl();
		return qualityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPIFormula createKPIFormula() {
		KPIFormulaImpl kpiFormula = new KPIFormulaImpl();
		return kpiFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityAttribute createQualityAttribute() {
		QualityAttributeImpl qualityAttribute = new QualityAttributeImpl();
		return qualityAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPI createKPI() {
		KPIImpl kpi = new KPIImpl();
		return kpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityCharacteristic createQualityCharacteristic() {
		QualityCharacteristicImpl qualityCharacteristic = new QualityCharacteristicImpl();
		return qualityCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealValue createRealValue() {
		RealValueImpl realValue = new RealValueImpl();
		return realValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualValue createTextualValue() {
		TextualValueImpl textualValue = new TextualValueImpl();
		return textualValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationValue createEnumerationValue() {
		EnumerationValueImpl enumerationValue = new EnumerationValueImpl();
		return enumerationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationValue createAggregationValue() {
		AggregationValueImpl aggregationValue = new AggregationValueImpl();
		return aggregationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitValue createUnitValue() {
		UnitValueImpl unitValue = new UnitValueImpl();
		return unitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriftValue createDriftValue() {
		DriftValueImpl driftValue = new DriftValueImpl();
		return driftValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minimum createMinimum() {
		MinimumImpl minimum = new MinimumImpl();
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Average createAverage() {
		AverageImpl average = new AverageImpl();
		return average;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Median createMedian() {
		MedianImpl median = new MedianImpl();
		return median;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardDeviation createStandardDeviation() {
		StandardDeviationImpl standardDeviation = new StandardDeviationImpl();
		return standardDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Maximum createMaximum() {
		MaximumImpl maximum = new MaximumImpl();
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Greater createGreater() {
		GreaterImpl greater = new GreaterImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiply createMultiply() {
		MultiplyImpl multiply = new MultiplyImpl();
		return multiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessEq createLessEq() {
		LessEqImpl lessEq = new LessEqImpl();
		return lessEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterEq createGreaterEq() {
		GreaterEqImpl greaterEq = new GreaterEqImpl();
		return greaterEq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealConstant createRealConstant() {
		RealConstantImpl realConstant = new RealConstantImpl();
		return realConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryMinus createUnaryMinus() {
		UnaryMinusImpl unaryMinus = new UnaryMinusImpl();
		return unaryMinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Divide createDivide() {
		DivideImpl divide = new DivideImpl();
		return divide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Less createLess() {
		LessImpl less = new LessImpl();
		return less;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inequality createInequality() {
		InequalityImpl inequality = new InequalityImpl();
		return inequality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equality createEquality() {
		EqualityImpl equality = new EqualityImpl();
		return equality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinOp createMinOp() {
		MinOpImpl minOp = new MinOpImpl();
		return minOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalOp createConditionalOp() {
		ConditionalOpImpl conditionalOp = new ConditionalOpImpl();
		return conditionalOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThresholdOp createThresholdOp() {
		ThresholdOpImpl thresholdOp = new ThresholdOpImpl();
		return thresholdOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightedSumOp createWeightedSumOp() {
		WeightedSumOpImpl weightedSumOp = new WeightedSumOpImpl();
		return weightedSumOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvgOp createAvgOp() {
		AvgOpImpl avgOp = new AvgOpImpl();
		return avgOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxOp createMaxOp() {
		MaxOpImpl maxOp = new MaxOpImpl();
		return maxOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextConstant createTextConstant() {
		TextConstantImpl textConstant = new TextConstantImpl();
		return textConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralRef createEnumLiteralRef() {
		EnumLiteralRefImpl enumLiteralRef = new EnumLiteralRefImpl();
		return enumLiteralRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntConstant createIntConstant() {
		IntConstantImpl intConstant = new IntConstantImpl();
		return intConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitConstant createUnitConstant() {
		UnitConstantImpl unitConstant = new UnitConstantImpl();
		return unitConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolConstant createBoolConstant() {
		BoolConstantImpl boolConstant = new BoolConstantImpl();
		return boolConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputableRef createComputableRef() {
		ComputableRefImpl computableRef = new ComputableRefImpl();
		return computableRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowUnit createWindowUnitFromString(EDataType eDataType, String initialValue) {
		WindowUnit result = WindowUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindowUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueUnit createValueUnitFromString(EDataType eDataType, String initialValue) {
		ValueUnit result = ValueUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formulaKPIPackage getformulaKPIPackage() {
		return (formulaKPIPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static formulaKPIPackage getPackage() {
		return formulaKPIPackage.eINSTANCE;
	}

} //formulaKPIFactoryImpl
