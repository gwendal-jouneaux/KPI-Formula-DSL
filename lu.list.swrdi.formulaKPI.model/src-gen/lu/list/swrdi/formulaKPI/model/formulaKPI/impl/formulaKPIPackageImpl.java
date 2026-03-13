/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import lu.list.swrdi.formulaKPI.model.formulaKPI.Accumulator;
import lu.list.swrdi.formulaKPI.model.formulaKPI.AggregationValue;
import lu.list.swrdi.formulaKPI.model.formulaKPI.And;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Average;
import lu.list.swrdi.formulaKPI.model.formulaKPI.AvgOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.BoolConstant;
import lu.list.swrdi.formulaKPI.model.formulaKPI.BooleanValue;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Computable;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ComputableRef;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Computation;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Declarable;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Divide;
import lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue;
import lu.list.swrdi.formulaKPI.model.formulaKPI.EnumLiteralRef;
import lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationLiteral;
import lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationValue;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Equality;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Expression;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Greater;
import lu.list.swrdi.formulaKPI.model.formulaKPI.GreaterEq;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Inequality;
import lu.list.swrdi.formulaKPI.model.formulaKPI.IntConstant;
import lu.list.swrdi.formulaKPI.model.formulaKPI.IntegerValue;
import lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Less;
import lu.list.swrdi.formulaKPI.model.formulaKPI.LessEq;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ListFilter;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ListIteration;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ListIterator;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ListLiteral;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ListOperation;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ListReduce;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ListSize;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Literal;
import lu.list.swrdi.formulaKPI.model.formulaKPI.MaxOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Maximum;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Median;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Metric;
import lu.list.swrdi.formulaKPI.model.formulaKPI.MinOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Minimum;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Minus;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Multiply;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Not;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Operation;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Or;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Plus;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Provider;
import lu.list.swrdi.formulaKPI.model.formulaKPI.QualityAttribute;
import lu.list.swrdi.formulaKPI.model.formulaKPI.QualityCharacteristic;
import lu.list.swrdi.formulaKPI.model.formulaKPI.QualityModel;
import lu.list.swrdi.formulaKPI.model.formulaKPI.RealConstant;
import lu.list.swrdi.formulaKPI.model.formulaKPI.RealValue;
import lu.list.swrdi.formulaKPI.model.formulaKPI.StandardDeviation;
import lu.list.swrdi.formulaKPI.model.formulaKPI.SumOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.TextConstant;
import lu.list.swrdi.formulaKPI.model.formulaKPI.TextualValue;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.UnaryMinus;
import lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant;
import lu.list.swrdi.formulaKPI.model.formulaKPI.UnitValue;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ValueType;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit;
import lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.WindowUnit;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIFactory;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class formulaKPIPackageImpl extends EPackageImpl implements formulaKPIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kpiFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kpiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driftValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass averageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medianEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardDeviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessEqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryMinusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inequalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thresholdOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weightedSumOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sumOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avgOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listIterationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listReduceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computableRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accumulatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum windowUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueUnitEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private formulaKPIPackageImpl() {
		super(eNS_URI, formulaKPIFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link formulaKPIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static formulaKPIPackage init() {
		if (isInited)
			return (formulaKPIPackage) EPackage.Registry.INSTANCE.getEPackage(formulaKPIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredformulaKPIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		formulaKPIPackageImpl theformulaKPIPackage = registeredformulaKPIPackage instanceof formulaKPIPackageImpl
				? (formulaKPIPackageImpl) registeredformulaKPIPackage
				: new formulaKPIPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theformulaKPIPackage.createPackageContents();

		// Initialize created meta-data
		theformulaKPIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theformulaKPIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(formulaKPIPackage.eNS_URI, theformulaKPIPackage);
		return theformulaKPIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputation() {
		return computationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputation_Computed() {
		return (EReference) computationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputation_Formula() {
		return (EReference) computationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityModel() {
		return qualityModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityModel_Qualitycharacteristics() {
		return (EReference) qualityModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputable() {
		return computableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputable_Name() {
		return (EAttribute) computableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclaration_Declared() {
		return (EReference) declarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKPIFormula() {
		return kpiFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPIFormula_Declarations() {
		return (EReference) kpiFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPIFormula_Computations() {
		return (EReference) kpiFormulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityAttribute() {
		return qualityAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityAttribute_Metrics() {
		return (EReference) qualityAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_Provider() {
		return (EReference) metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarable() {
		return declarableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarable_Type() {
		return (EReference) declarableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKPI() {
		return kpiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_Name() {
		return (EAttribute) providerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvider_Description() {
		return (EAttribute) providerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityCharacteristic() {
		return qualityCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityCharacteristic_Qualityattributes() {
		return (EReference) qualityCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealValue() {
		return realValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualValue() {
		return textualValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationValue() {
		return enumerationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationValue_Literals() {
		return (EReference) enumerationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationValue() {
		return aggregationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregationValue_Window() {
		return (EAttribute) aggregationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregationValue_WindowUnit() {
		return (EAttribute) aggregationValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationValue_Operation() {
		return (EReference) aggregationValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumerationLiteral_Name() {
		return (EAttribute) enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitValue() {
		return unitValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitValue_Unit() {
		return (EAttribute) unitValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDriftValue() {
		return driftValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDriftValue_Window() {
		return (EAttribute) driftValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDriftValue_WindowUnit() {
		return (EAttribute) driftValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDriftValue_Operation() {
		return (EReference) driftValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinimum() {
		return minimumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAverage() {
		return averageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedian() {
		return medianEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardDeviation() {
		return standardDeviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaximum() {
		return maximumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinOp() {
		return binOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinOp_Right() {
		return (EReference) binOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinOp_Left() {
		return (EReference) binOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreater() {
		return greaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiply() {
		return multiplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinus() {
		return minusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlus() {
		return plusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessEq() {
		return lessEqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterEq() {
		return greaterEqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNot_Expression() {
		return (EReference) notEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealConstant() {
		return realConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealConstant_Value() {
		return (EAttribute) realConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryMinus() {
		return unaryMinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryMinus_Expression() {
		return (EReference) unaryMinusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivide() {
		return divideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLess() {
		return lessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInequality() {
		return inequalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquality() {
		return equalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListSize() {
		return listSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListSize_Expression() {
		return (EReference) listSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListLiteral() {
		return listLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListLiteral_Elements() {
		return (EReference) listLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinOp() {
		return minOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinOp_List() {
		return (EReference) minOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalOp() {
		return conditionalOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalOp_Results() {
		return (EReference) conditionalOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalOp_Conditions() {
		return (EReference) conditionalOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThresholdOp() {
		return thresholdOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThresholdOp_Expression() {
		return (EReference) thresholdOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThresholdOp_Threshold() {
		return (EReference) thresholdOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeightedSumOp() {
		return weightedSumOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeightedSumOp_List() {
		return (EReference) weightedSumOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWeightedSumOp_Weights() {
		return (EReference) weightedSumOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSumOp() {
		return sumOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSumOp_List() {
		return (EReference) sumOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvgOp() {
		return avgOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvgOp_List() {
		return (EReference) avgOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxOp() {
		return maxOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaxOp_List() {
		return (EReference) maxOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOperation() {
		return listOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOperation_Lists() {
		return (EReference) listOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOperation_Iterators() {
		return (EReference) listOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListOperation_Expression() {
		return (EReference) listOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListIteration() {
		return listIterationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListReduce() {
		return listReduceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListReduce_Accumulator() {
		return (EReference) listReduceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListFilter() {
		return listFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListIterator() {
		return listIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextConstant() {
		return textConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextConstant_Value() {
		return (EAttribute) textConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteralRef() {
		return enumLiteralRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumLiteralRef_Literal() {
		return (EReference) enumLiteralRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntConstant() {
		return intConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntConstant_Value() {
		return (EAttribute) intConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitConstant() {
		return unitConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitConstant_Value() {
		return (EAttribute) unitConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitConstant_Unit() {
		return (EAttribute) unitConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolConstant() {
		return boolConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolConstant_Value() {
		return (EAttribute) boolConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputableRef() {
		return computableRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputableRef_Computable() {
		return (EReference) computableRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccumulator() {
		return accumulatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWindowUnit() {
		return windowUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValueUnit() {
		return valueUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formulaKPIFactory getformulaKPIFactory() {
		return (formulaKPIFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		computationEClass = createEClass(COMPUTATION);
		createEReference(computationEClass, COMPUTATION__COMPUTED);
		createEReference(computationEClass, COMPUTATION__FORMULA);

		qualityModelEClass = createEClass(QUALITY_MODEL);
		createEReference(qualityModelEClass, QUALITY_MODEL__QUALITYCHARACTERISTICS);

		computableEClass = createEClass(COMPUTABLE);
		createEAttribute(computableEClass, COMPUTABLE__NAME);

		declarationEClass = createEClass(DECLARATION);
		createEReference(declarationEClass, DECLARATION__DECLARED);

		kpiFormulaEClass = createEClass(KPI_FORMULA);
		createEReference(kpiFormulaEClass, KPI_FORMULA__DECLARATIONS);
		createEReference(kpiFormulaEClass, KPI_FORMULA__COMPUTATIONS);

		qualityAttributeEClass = createEClass(QUALITY_ATTRIBUTE);
		createEReference(qualityAttributeEClass, QUALITY_ATTRIBUTE__METRICS);

		valueTypeEClass = createEClass(VALUE_TYPE);

		metricEClass = createEClass(METRIC);
		createEReference(metricEClass, METRIC__PROVIDER);

		declarableEClass = createEClass(DECLARABLE);
		createEReference(declarableEClass, DECLARABLE__TYPE);

		operationEClass = createEClass(OPERATION);

		expressionEClass = createEClass(EXPRESSION);

		kpiEClass = createEClass(KPI);

		providerEClass = createEClass(PROVIDER);
		createEAttribute(providerEClass, PROVIDER__NAME);
		createEAttribute(providerEClass, PROVIDER__DESCRIPTION);

		qualityCharacteristicEClass = createEClass(QUALITY_CHARACTERISTIC);
		createEReference(qualityCharacteristicEClass, QUALITY_CHARACTERISTIC__QUALITYATTRIBUTES);

		integerValueEClass = createEClass(INTEGER_VALUE);

		realValueEClass = createEClass(REAL_VALUE);

		textualValueEClass = createEClass(TEXTUAL_VALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);

		enumerationValueEClass = createEClass(ENUMERATION_VALUE);
		createEReference(enumerationValueEClass, ENUMERATION_VALUE__LITERALS);

		aggregationValueEClass = createEClass(AGGREGATION_VALUE);
		createEAttribute(aggregationValueEClass, AGGREGATION_VALUE__WINDOW);
		createEAttribute(aggregationValueEClass, AGGREGATION_VALUE__WINDOW_UNIT);
		createEReference(aggregationValueEClass, AGGREGATION_VALUE__OPERATION);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__NAME);

		unitValueEClass = createEClass(UNIT_VALUE);
		createEAttribute(unitValueEClass, UNIT_VALUE__UNIT);

		driftValueEClass = createEClass(DRIFT_VALUE);
		createEAttribute(driftValueEClass, DRIFT_VALUE__WINDOW);
		createEAttribute(driftValueEClass, DRIFT_VALUE__WINDOW_UNIT);
		createEReference(driftValueEClass, DRIFT_VALUE__OPERATION);

		minimumEClass = createEClass(MINIMUM);

		averageEClass = createEClass(AVERAGE);

		medianEClass = createEClass(MEDIAN);

		standardDeviationEClass = createEClass(STANDARD_DEVIATION);

		maximumEClass = createEClass(MAXIMUM);

		binOpEClass = createEClass(BIN_OP);
		createEReference(binOpEClass, BIN_OP__RIGHT);
		createEReference(binOpEClass, BIN_OP__LEFT);

		greaterEClass = createEClass(GREATER);

		multiplyEClass = createEClass(MULTIPLY);

		minusEClass = createEClass(MINUS);

		plusEClass = createEClass(PLUS);

		lessEqEClass = createEClass(LESS_EQ);

		greaterEqEClass = createEClass(GREATER_EQ);

		andEClass = createEClass(AND);

		notEClass = createEClass(NOT);
		createEReference(notEClass, NOT__EXPRESSION);

		literalEClass = createEClass(LITERAL);

		realConstantEClass = createEClass(REAL_CONSTANT);
		createEAttribute(realConstantEClass, REAL_CONSTANT__VALUE);

		unaryMinusEClass = createEClass(UNARY_MINUS);
		createEReference(unaryMinusEClass, UNARY_MINUS__EXPRESSION);

		divideEClass = createEClass(DIVIDE);

		lessEClass = createEClass(LESS);

		inequalityEClass = createEClass(INEQUALITY);

		equalityEClass = createEClass(EQUALITY);

		orEClass = createEClass(OR);

		listSizeEClass = createEClass(LIST_SIZE);
		createEReference(listSizeEClass, LIST_SIZE__EXPRESSION);

		listLiteralEClass = createEClass(LIST_LITERAL);
		createEReference(listLiteralEClass, LIST_LITERAL__ELEMENTS);

		minOpEClass = createEClass(MIN_OP);
		createEReference(minOpEClass, MIN_OP__LIST);

		conditionalOpEClass = createEClass(CONDITIONAL_OP);
		createEReference(conditionalOpEClass, CONDITIONAL_OP__RESULTS);
		createEReference(conditionalOpEClass, CONDITIONAL_OP__CONDITIONS);

		thresholdOpEClass = createEClass(THRESHOLD_OP);
		createEReference(thresholdOpEClass, THRESHOLD_OP__EXPRESSION);
		createEReference(thresholdOpEClass, THRESHOLD_OP__THRESHOLD);

		weightedSumOpEClass = createEClass(WEIGHTED_SUM_OP);
		createEReference(weightedSumOpEClass, WEIGHTED_SUM_OP__LIST);
		createEReference(weightedSumOpEClass, WEIGHTED_SUM_OP__WEIGHTS);

		sumOpEClass = createEClass(SUM_OP);
		createEReference(sumOpEClass, SUM_OP__LIST);

		avgOpEClass = createEClass(AVG_OP);
		createEReference(avgOpEClass, AVG_OP__LIST);

		maxOpEClass = createEClass(MAX_OP);
		createEReference(maxOpEClass, MAX_OP__LIST);

		listOperationEClass = createEClass(LIST_OPERATION);
		createEReference(listOperationEClass, LIST_OPERATION__LISTS);
		createEReference(listOperationEClass, LIST_OPERATION__ITERATORS);
		createEReference(listOperationEClass, LIST_OPERATION__EXPRESSION);

		listIterationEClass = createEClass(LIST_ITERATION);

		listReduceEClass = createEClass(LIST_REDUCE);
		createEReference(listReduceEClass, LIST_REDUCE__ACCUMULATOR);

		listFilterEClass = createEClass(LIST_FILTER);

		listIteratorEClass = createEClass(LIST_ITERATOR);

		textConstantEClass = createEClass(TEXT_CONSTANT);
		createEAttribute(textConstantEClass, TEXT_CONSTANT__VALUE);

		enumLiteralRefEClass = createEClass(ENUM_LITERAL_REF);
		createEReference(enumLiteralRefEClass, ENUM_LITERAL_REF__LITERAL);

		intConstantEClass = createEClass(INT_CONSTANT);
		createEAttribute(intConstantEClass, INT_CONSTANT__VALUE);

		unitConstantEClass = createEClass(UNIT_CONSTANT);
		createEAttribute(unitConstantEClass, UNIT_CONSTANT__VALUE);
		createEAttribute(unitConstantEClass, UNIT_CONSTANT__UNIT);

		boolConstantEClass = createEClass(BOOL_CONSTANT);
		createEAttribute(boolConstantEClass, BOOL_CONSTANT__VALUE);

		computableRefEClass = createEClass(COMPUTABLE_REF);
		createEReference(computableRefEClass, COMPUTABLE_REF__COMPUTABLE);

		accumulatorEClass = createEClass(ACCUMULATOR);

		// Create enums
		windowUnitEEnum = createEEnum(WINDOW_UNIT);
		valueUnitEEnum = createEEnum(VALUE_UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		qualityAttributeEClass.getESuperTypes().add(this.getComputable());
		metricEClass.getESuperTypes().add(this.getDeclarable());
		declarableEClass.getESuperTypes().add(this.getComputable());
		kpiEClass.getESuperTypes().add(this.getDeclarable());
		qualityCharacteristicEClass.getESuperTypes().add(this.getComputable());
		integerValueEClass.getESuperTypes().add(this.getValueType());
		realValueEClass.getESuperTypes().add(this.getValueType());
		textualValueEClass.getESuperTypes().add(this.getValueType());
		booleanValueEClass.getESuperTypes().add(this.getValueType());
		enumerationValueEClass.getESuperTypes().add(this.getValueType());
		aggregationValueEClass.getESuperTypes().add(this.getValueType());
		unitValueEClass.getESuperTypes().add(this.getValueType());
		driftValueEClass.getESuperTypes().add(this.getValueType());
		minimumEClass.getESuperTypes().add(this.getOperation());
		averageEClass.getESuperTypes().add(this.getOperation());
		medianEClass.getESuperTypes().add(this.getOperation());
		standardDeviationEClass.getESuperTypes().add(this.getOperation());
		maximumEClass.getESuperTypes().add(this.getOperation());
		binOpEClass.getESuperTypes().add(this.getExpression());
		greaterEClass.getESuperTypes().add(this.getBinOp());
		multiplyEClass.getESuperTypes().add(this.getBinOp());
		minusEClass.getESuperTypes().add(this.getBinOp());
		plusEClass.getESuperTypes().add(this.getBinOp());
		lessEqEClass.getESuperTypes().add(this.getBinOp());
		greaterEqEClass.getESuperTypes().add(this.getBinOp());
		andEClass.getESuperTypes().add(this.getBinOp());
		notEClass.getESuperTypes().add(this.getExpression());
		literalEClass.getESuperTypes().add(this.getExpression());
		realConstantEClass.getESuperTypes().add(this.getLiteral());
		unaryMinusEClass.getESuperTypes().add(this.getExpression());
		divideEClass.getESuperTypes().add(this.getBinOp());
		lessEClass.getESuperTypes().add(this.getBinOp());
		inequalityEClass.getESuperTypes().add(this.getBinOp());
		equalityEClass.getESuperTypes().add(this.getBinOp());
		orEClass.getESuperTypes().add(this.getBinOp());
		listSizeEClass.getESuperTypes().add(this.getExpression());
		listLiteralEClass.getESuperTypes().add(this.getLiteral());
		minOpEClass.getESuperTypes().add(this.getExpression());
		conditionalOpEClass.getESuperTypes().add(this.getExpression());
		thresholdOpEClass.getESuperTypes().add(this.getExpression());
		weightedSumOpEClass.getESuperTypes().add(this.getExpression());
		sumOpEClass.getESuperTypes().add(this.getExpression());
		avgOpEClass.getESuperTypes().add(this.getExpression());
		maxOpEClass.getESuperTypes().add(this.getExpression());
		listOperationEClass.getESuperTypes().add(this.getExpression());
		listIterationEClass.getESuperTypes().add(this.getListOperation());
		listReduceEClass.getESuperTypes().add(this.getListOperation());
		listFilterEClass.getESuperTypes().add(this.getListOperation());
		listIteratorEClass.getESuperTypes().add(this.getComputable());
		textConstantEClass.getESuperTypes().add(this.getLiteral());
		enumLiteralRefEClass.getESuperTypes().add(this.getExpression());
		intConstantEClass.getESuperTypes().add(this.getLiteral());
		unitConstantEClass.getESuperTypes().add(this.getLiteral());
		boolConstantEClass.getESuperTypes().add(this.getLiteral());
		computableRefEClass.getESuperTypes().add(this.getExpression());
		accumulatorEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(computationEClass, Computation.class, "Computation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputation_Computed(), this.getComputable(), null, "computed", null, 1, 1, Computation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComputation_Formula(), this.getExpression(), null, "formula", null, 1, 1, Computation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityModelEClass, QualityModel.class, "QualityModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityModel_Qualitycharacteristics(), this.getQualityCharacteristic(), null,
				"qualitycharacteristics", null, 0, -1, QualityModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computableEClass, Computable.class, "Computable", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Computable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclaration_Declared(), this.getDeclarable(), null, "declared", null, 1, 1, Declaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kpiFormulaEClass, KPIFormula.class, "KPIFormula", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKPIFormula_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1,
				KPIFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKPIFormula_Computations(), this.getComputation(), null, "computations", null, 0, -1,
				KPIFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityAttributeEClass, QualityAttribute.class, "QualityAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityAttribute_Metrics(), this.getMetric(), null, "metrics", null, 0, -1,
				QualityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(metricEClass, Metric.class, "Metric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetric_Provider(), this.getProvider(), null, "provider", null, 0, 1, Metric.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declarableEClass, Declarable.class, "Declarable", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclarable_Type(), this.getValueType(), null, "type", null, 1, 1, Declarable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(kpiEClass, lu.list.swrdi.formulaKPI.model.formulaKPI.KPI.class, "KPI", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProvider_Name(), ecorePackage.getEString(), "name", null, 0, 1, Provider.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProvider_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Provider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityCharacteristicEClass, QualityCharacteristic.class, "QualityCharacteristic", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityCharacteristic_Qualityattributes(), this.getQualityAttribute(), null,
				"qualityattributes", null, 0, -1, QualityCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(realValueEClass, RealValue.class, "RealValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(textualValueEClass, TextualValue.class, "TextualValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationValueEClass, EnumerationValue.class, "EnumerationValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationValue_Literals(), this.getEnumerationLiteral(), null, "literals", null, 1, -1,
				EnumerationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregationValueEClass, AggregationValue.class, "AggregationValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregationValue_Window(), ecorePackage.getEInt(), "window", null, 0, 1,
				AggregationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregationValue_WindowUnit(), this.getWindowUnit(), "windowUnit", null, 0, 1,
				AggregationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAggregationValue_Operation(), this.getOperation(), null, "operation", null, 1, 1,
				AggregationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(unitValueEClass, UnitValue.class, "UnitValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitValue_Unit(), this.getValueUnit(), "unit", null, 0, 1, UnitValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(driftValueEClass, DriftValue.class, "DriftValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDriftValue_Window(), ecorePackage.getEInt(), "window", null, 0, 1, DriftValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDriftValue_WindowUnit(), this.getWindowUnit(), "windowUnit", null, 0, 1, DriftValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDriftValue_Operation(), this.getOperation(), null, "operation", null, 1, 1, DriftValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minimumEClass, Minimum.class, "Minimum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(averageEClass, Average.class, "Average", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(medianEClass, Median.class, "Median", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardDeviationEClass, StandardDeviation.class, "StandardDeviation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(maximumEClass, Maximum.class, "Maximum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binOpEClass, BinOp.class, "BinOp", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinOp_Right(), this.getExpression(), null, "right", null, 1, 1, BinOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBinOp_Left(), this.getExpression(), null, "left", null, 1, 1, BinOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(greaterEClass, Greater.class, "Greater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplyEClass, Multiply.class, "Multiply", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessEqEClass, LessEq.class, "LessEq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterEqEClass, GreaterEq.class, "GreaterEq", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNot_Expression(), this.getExpression(), null, "expression", null, 1, 1, Not.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(realConstantEClass, RealConstant.class, "RealConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealConstant_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, RealConstant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryMinusEClass, UnaryMinus.class, "UnaryMinus", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryMinus_Expression(), this.getExpression(), null, "expression", null, 1, 1,
				UnaryMinus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divideEClass, Divide.class, "Divide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessEClass, Less.class, "Less", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inequalityEClass, Inequality.class, "Inequality", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalityEClass, Equality.class, "Equality", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listSizeEClass, ListSize.class, "ListSize", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListSize_Expression(), this.getExpression(), null, "expression", null, 1, 1, ListSize.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listLiteralEClass, ListLiteral.class, "ListLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListLiteral_Elements(), this.getExpression(), null, "elements", null, 0, -1,
				ListLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minOpEClass, MinOp.class, "MinOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinOp_List(), this.getExpression(), null, "list", null, 1, 1, MinOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(conditionalOpEClass, ConditionalOp.class, "ConditionalOp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalOp_Results(), this.getExpression(), null, "results", null, 0, -1,
				ConditionalOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalOp_Conditions(), this.getExpression(), null, "conditions", null, 0, -1,
				ConditionalOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thresholdOpEClass, ThresholdOp.class, "ThresholdOp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThresholdOp_Expression(), this.getExpression(), null, "expression", null, 1, 1,
				ThresholdOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThresholdOp_Threshold(), this.getExpression(), null, "threshold", null, 1, 1,
				ThresholdOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(weightedSumOpEClass, WeightedSumOp.class, "WeightedSumOp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWeightedSumOp_List(), this.getExpression(), null, "list", null, 1, 1, WeightedSumOp.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWeightedSumOp_Weights(), this.getExpression(), null, "weights", null, 1, 1,
				WeightedSumOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sumOpEClass, SumOp.class, "SumOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSumOp_List(), this.getExpression(), null, "list", null, 1, 1, SumOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(avgOpEClass, AvgOp.class, "AvgOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvgOp_List(), this.getExpression(), null, "list", null, 1, 1, AvgOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(maxOpEClass, MaxOp.class, "MaxOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaxOp_List(), this.getExpression(), null, "list", null, 1, 1, MaxOp.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(listOperationEClass, ListOperation.class, "ListOperation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListOperation_Lists(), this.getExpression(), null, "lists", null, 1, -1, ListOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListOperation_Iterators(), this.getListIterator(), null, "iterators", null, 1, -1,
				ListOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListOperation_Expression(), this.getExpression(), null, "expression", null, 1, 1,
				ListOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listIterationEClass, ListIteration.class, "ListIteration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(listReduceEClass, ListReduce.class, "ListReduce", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListReduce_Accumulator(), this.getExpression(), null, "accumulator", null, 1, 1,
				ListReduce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listFilterEClass, ListFilter.class, "ListFilter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(listIteratorEClass, ListIterator.class, "ListIterator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(textConstantEClass, TextConstant.class, "TextConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextConstant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumLiteralRefEClass, EnumLiteralRef.class, "EnumLiteralRef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumLiteralRef_Literal(), this.getEnumerationLiteral(), null, "literal", null, 1, 1,
				EnumLiteralRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intConstantEClass, IntConstant.class, "IntConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntConstant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitConstantEClass, UnitConstant.class, "UnitConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitConstant_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, UnitConstant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitConstant_Unit(), this.getValueUnit(), "unit", null, 0, 1, UnitConstant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolConstantEClass, BoolConstant.class, "BoolConstant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, BoolConstant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computableRefEClass, ComputableRef.class, "ComputableRef", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputableRef_Computable(), this.getComputable(), null, "computable", null, 1, 1,
				ComputableRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accumulatorEClass, Accumulator.class, "Accumulator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(windowUnitEEnum, WindowUnit.class, "WindowUnit");
		addEEnumLiteral(windowUnitEEnum, WindowUnit.SEC);
		addEEnumLiteral(windowUnitEEnum, WindowUnit.MIN);
		addEEnumLiteral(windowUnitEEnum, WindowUnit.HOUR);
		addEEnumLiteral(windowUnitEEnum, WindowUnit.DAY);
		addEEnumLiteral(windowUnitEEnum, WindowUnit.MEASUREMENT);

		initEEnum(valueUnitEEnum, ValueUnit.class, "ValueUnit");
		addEEnumLiteral(valueUnitEEnum, ValueUnit.MILLI);
		addEEnumLiteral(valueUnitEEnum, ValueUnit.SEC);
		addEEnumLiteral(valueUnitEEnum, ValueUnit.MIN);
		addEEnumLiteral(valueUnitEEnum, ValueUnit.HOUR);
		addEEnumLiteral(valueUnitEEnum, ValueUnit.LITERS);
		addEEnumLiteral(valueUnitEEnum, ValueUnit.M3);
		addEEnumLiteral(valueUnitEEnum, ValueUnit.WH);
		addEEnumLiteral(valueUnitEEnum, ValueUnit.KWH);
		addEEnumLiteral(valueUnitEEnum, ValueUnit.GCO_2EQ);
		addEEnumLiteral(valueUnitEEnum, ValueUnit.KG_CO_2EQ);

		// Create resource
		createResource(eNS_URI);
	}

} //formulaKPIPackageImpl
