/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIFactory
 * @model kind="package"
 * @generated
 */
public interface formulaKPIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "formulaKPI";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.list.lu/formulaKPI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "formulaKPI";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	formulaKPIPackage eINSTANCE = lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl.init();

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ComputationImpl <em>Computation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ComputationImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getComputation()
	 * @generated
	 */
	int COMPUTATION = 0;

	/**
	 * The feature id for the '<em><b>Computed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION__COMPUTED = 0;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION__FORMULA = 1;

	/**
	 * The number of structural features of the '<em>Computation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Computation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityModelImpl <em>Quality Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityModelImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getQualityModel()
	 * @generated
	 */
	int QUALITY_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Qualitycharacteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL__QUALITYCHARACTERISTICS = 0;

	/**
	 * The number of structural features of the '<em>Quality Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Quality Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computable <em>Computable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Computable
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getComputable()
	 * @generated
	 */
	int COMPUTABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Computable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Computable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DeclarationImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Declared</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DECLARED = 0;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.KPIFormulaImpl <em>KPI Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.KPIFormulaImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getKPIFormula()
	 * @generated
	 */
	int KPI_FORMULA = 4;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_FORMULA__DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Computations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_FORMULA__COMPUTATIONS = 1;

	/**
	 * The number of structural features of the '<em>KPI Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_FORMULA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>KPI Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_FORMULA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityAttributeImpl <em>Quality Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityAttributeImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getQualityAttribute()
	 * @generated
	 */
	int QUALITY_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__NAME = COMPUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE__METRICS = COMPUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quality Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE_FEATURE_COUNT = COMPUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quality Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ATTRIBUTE_OPERATION_COUNT = COMPUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ValueType <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ValueType
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Declarable <em>Declarable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Declarable
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getDeclarable()
	 * @generated
	 */
	int DECLARABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARABLE__NAME = COMPUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARABLE__TYPE = COMPUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Declarable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARABLE_FEATURE_COUNT = COMPUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Declarable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARABLE_OPERATION_COUNT = COMPUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MetricImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = DECLARABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__TYPE = DECLARABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__PROVIDER = DECLARABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = DECLARABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = DECLARABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Operation <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Operation
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 9;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Expression
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.KPIImpl <em>KPI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.KPIImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getKPI()
	 * @generated
	 */
	int KPI = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__NAME = DECLARABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI__TYPE = DECLARABLE__TYPE;

	/**
	 * The number of structural features of the '<em>KPI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_FEATURE_COUNT = DECLARABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KPI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPI_OPERATION_COUNT = DECLARABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ProviderImpl <em>Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ProviderImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityCharacteristicImpl <em>Quality Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityCharacteristicImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getQualityCharacteristic()
	 * @generated
	 */
	int QUALITY_CHARACTERISTIC = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CHARACTERISTIC__NAME = COMPUTABLE__NAME;

	/**
	 * The feature id for the '<em><b>Qualityattributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CHARACTERISTIC__QUALITYATTRIBUTES = COMPUTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quality Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CHARACTERISTIC_FEATURE_COUNT = COMPUTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quality Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_CHARACTERISTIC_OPERATION_COUNT = COMPUTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.IntegerValueImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 14;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.RealValueImpl <em>Real Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.RealValueImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getRealValue()
	 * @generated
	 */
	int REAL_VALUE = 15;

	/**
	 * The number of structural features of the '<em>Real Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_VALUE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.TextualValueImpl <em>Textual Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.TextualValueImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getTextualValue()
	 * @generated
	 */
	int TEXTUAL_VALUE = 16;

	/**
	 * The number of structural features of the '<em>Textual Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Textual Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_VALUE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.BooleanValueImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 17;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumerationValueImpl <em>Enumeration Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumerationValueImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getEnumerationValue()
	 * @generated
	 */
	int ENUMERATION_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE__LITERALS = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AggregationValueImpl <em>Aggregation Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AggregationValueImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getAggregationValue()
	 * @generated
	 */
	int AGGREGATION_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_VALUE__WINDOW = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Window Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_VALUE__WINDOW_UNIT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_VALUE__OPERATION = VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aggregation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Aggregation Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_VALUE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumerationLiteralImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnitValueImpl <em>Unit Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnitValueImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getUnitValue()
	 * @generated
	 */
	int UNIT_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_VALUE__UNIT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unit Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_VALUE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DriftValueImpl <em>Drift Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DriftValueImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getDriftValue()
	 * @generated
	 */
	int DRIFT_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIFT_VALUE__WINDOW = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Window Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIFT_VALUE__WINDOW_UNIT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIFT_VALUE__OPERATION = VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Drift Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIFT_VALUE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Drift Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIFT_VALUE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MinimumImpl <em>Minimum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MinimumImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMinimum()
	 * @generated
	 */
	int MINIMUM = 23;

	/**
	 * The number of structural features of the '<em>Minimum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minimum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AverageImpl <em>Average</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AverageImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getAverage()
	 * @generated
	 */
	int AVERAGE = 24;

	/**
	 * The number of structural features of the '<em>Average</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Average</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MedianImpl <em>Median</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MedianImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMedian()
	 * @generated
	 */
	int MEDIAN = 25;

	/**
	 * The number of structural features of the '<em>Median</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Median</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAN_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.StandardDeviationImpl <em>Standard Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.StandardDeviationImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getStandardDeviation()
	 * @generated
	 */
	int STANDARD_DEVIATION = 26;

	/**
	 * The number of structural features of the '<em>Standard Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DEVIATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Standard Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_DEVIATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MaximumImpl <em>Maximum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MaximumImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMaximum()
	 * @generated
	 */
	int MAXIMUM = 27;

	/**
	 * The number of structural features of the '<em>Maximum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Maximum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp <em>Bin Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getBinOp()
	 * @generated
	 */
	int BIN_OP = 28;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bin Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bin Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIN_OP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.GreaterImpl <em>Greater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.GreaterImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getGreater()
	 * @generated
	 */
	int GREATER = 29;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__RIGHT = BIN_OP__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER__LEFT = BIN_OP__LEFT;

	/**
	 * The number of structural features of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MultiplyImpl <em>Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MultiplyImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMultiply()
	 * @generated
	 */
	int MULTIPLY = 30;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__RIGHT = BIN_OP__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__LEFT = BIN_OP__LEFT;

	/**
	 * The number of structural features of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MinusImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 31;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__RIGHT = BIN_OP__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__LEFT = BIN_OP__LEFT;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.PlusImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 32;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT = BIN_OP__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT = BIN_OP__LEFT;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.LessEqImpl <em>Less Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.LessEqImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getLessEq()
	 * @generated
	 */
	int LESS_EQ = 33;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQ__RIGHT = BIN_OP__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQ__LEFT = BIN_OP__LEFT;

	/**
	 * The number of structural features of the '<em>Less Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQ_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_EQ_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.GreaterEqImpl <em>Greater Eq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.GreaterEqImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getGreaterEq()
	 * @generated
	 */
	int GREATER_EQ = 34;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQ__RIGHT = BIN_OP__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQ__LEFT = BIN_OP__LEFT;

	/**
	 * The number of structural features of the '<em>Greater Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQ_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Greater Eq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_EQ_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AndImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 35;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RIGHT = BIN_OP__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LEFT = BIN_OP__LEFT;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.NotImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 36;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Literal <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Literal
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 37;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.RealConstantImpl <em>Real Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.RealConstantImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getRealConstant()
	 * @generated
	 */
	int REAL_CONSTANT = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_CONSTANT_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnaryMinusImpl <em>Unary Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnaryMinusImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getUnaryMinus()
	 * @generated
	 */
	int UNARY_MINUS = 39;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_MINUS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DivideImpl <em>Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DivideImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getDivide()
	 * @generated
	 */
	int DIVIDE = 40;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__RIGHT = BIN_OP__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__LEFT = BIN_OP__LEFT;

	/**
	 * The number of structural features of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.LessImpl <em>Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.LessImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getLess()
	 * @generated
	 */
	int LESS = 41;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__RIGHT = BIN_OP__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS__LEFT = BIN_OP__LEFT;

	/**
	 * The number of structural features of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.InequalityImpl <em>Inequality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.InequalityImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getInequality()
	 * @generated
	 */
	int INEQUALITY = 42;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY__RIGHT = BIN_OP__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY__LEFT = BIN_OP__LEFT;

	/**
	 * The number of structural features of the '<em>Inequality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inequality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INEQUALITY_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EqualityImpl <em>Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EqualityImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getEquality()
	 * @generated
	 */
	int EQUALITY = 43;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__RIGHT = BIN_OP__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__LEFT = BIN_OP__LEFT;

	/**
	 * The number of structural features of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.OrImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getOr()
	 * @generated
	 */
	int OR = 44;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RIGHT = BIN_OP__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LEFT = BIN_OP__LEFT;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BIN_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BIN_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MinOpImpl <em>Min Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MinOpImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMinOp()
	 * @generated
	 */
	int MIN_OP = 45;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OP__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Min Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Min Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ConditionalOpImpl <em>Conditional Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ConditionalOpImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getConditionalOp()
	 * @generated
	 */
	int CONDITIONAL_OP = 46;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OP__RESULTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OP__CONDITIONS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conditional Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ThresholdOpImpl <em>Threshold Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ThresholdOpImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getThresholdOp()
	 * @generated
	 */
	int THRESHOLD_OP = 47;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_OP__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_OP__THRESHOLD = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Threshold Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_OP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Threshold Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_OP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.WeightedSumOpImpl <em>Weighted Sum Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.WeightedSumOpImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getWeightedSumOp()
	 * @generated
	 */
	int WEIGHTED_SUM_OP = 48;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_SUM_OP__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_SUM_OP__WEIGHTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weighted Sum Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_SUM_OP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Weighted Sum Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_SUM_OP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AvgOpImpl <em>Avg Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AvgOpImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getAvgOp()
	 * @generated
	 */
	int AVG_OP = 49;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_OP__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Avg Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_OP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Avg Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVG_OP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MaxOpImpl <em>Max Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MaxOpImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMaxOp()
	 * @generated
	 */
	int MAX_OP = 50;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OP__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Max Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Max Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.TextConstantImpl <em>Text Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.TextConstantImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getTextConstant()
	 * @generated
	 */
	int TEXT_CONSTANT = 51;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTANT__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTANT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONSTANT_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumLiteralRefImpl <em>Enum Literal Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumLiteralRefImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getEnumLiteralRef()
	 * @generated
	 */
	int ENUM_LITERAL_REF = 52;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_REF__LITERAL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Literal Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Literal Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.IntConstantImpl <em>Int Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.IntConstantImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getIntConstant()
	 * @generated
	 */
	int INT_CONSTANT = 53;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_CONSTANT_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnitConstantImpl <em>Unit Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnitConstantImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getUnitConstant()
	 * @generated
	 */
	int UNIT_CONSTANT = 54;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONSTANT__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONSTANT__UNIT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unit Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONSTANT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unit Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CONSTANT_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.BoolConstantImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getBoolConstant()
	 * @generated
	 */
	int BOOL_CONSTANT = 55;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_CONSTANT_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ComputableRefImpl <em>Computable Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ComputableRefImpl
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getComputableRef()
	 * @generated
	 */
	int COMPUTABLE_REF = 56;

	/**
	 * The feature id for the '<em><b>Computable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLE_REF__COMPUTABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Computable Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTABLE_REF_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WindowUnit <em>Window Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.WindowUnit
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getWindowUnit()
	 * @generated
	 */
	int WINDOW_UNIT = 57;

	/**
	 * The meta object id for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit <em>Value Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getValueUnit()
	 * @generated
	 */
	int VALUE_UNIT = 58;

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computation <em>Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computation</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Computation
	 * @generated
	 */
	EClass getComputation();

	/**
	 * Returns the meta object for the reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computation#getComputed <em>Computed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computed</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Computation#getComputed()
	 * @see #getComputation()
	 * @generated
	 */
	EReference getComputation_Computed();

	/**
	 * Returns the meta object for the containment reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computation#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Computation#getFormula()
	 * @see #getComputation()
	 * @generated
	 */
	EReference getComputation_Formula();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityModel <em>Quality Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Model</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.QualityModel
	 * @generated
	 */
	EClass getQualityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityModel#getQualitycharacteristics <em>Qualitycharacteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualitycharacteristics</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.QualityModel#getQualitycharacteristics()
	 * @see #getQualityModel()
	 * @generated
	 */
	EReference getQualityModel_Qualitycharacteristics();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computable <em>Computable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computable</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Computable
	 * @generated
	 */
	EClass getComputable();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Computable#getName()
	 * @see #getComputable()
	 * @generated
	 */
	EAttribute getComputable_Name();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration#getDeclared <em>Declared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Declared</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration#getDeclared()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Declared();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula <em>KPI Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPI Formula</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula
	 * @generated
	 */
	EClass getKPIFormula();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula#getDeclarations()
	 * @see #getKPIFormula()
	 * @generated
	 */
	EReference getKPIFormula_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula#getComputations <em>Computations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Computations</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula#getComputations()
	 * @see #getKPIFormula()
	 * @generated
	 */
	EReference getKPIFormula_Computations();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityAttribute <em>Quality Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Attribute</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.QualityAttribute
	 * @generated
	 */
	EClass getQualityAttribute();

	/**
	 * Returns the meta object for the reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityAttribute#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metrics</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.QualityAttribute#getMetrics()
	 * @see #getQualityAttribute()
	 * @generated
	 */
	EReference getQualityAttribute_Metrics();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Metric#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Metric#getProvider()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Provider();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Declarable <em>Declarable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarable</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Declarable
	 * @generated
	 */
	EClass getDeclarable();

	/**
	 * Returns the meta object for the containment reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Declarable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Declarable#getType()
	 * @see #getDeclarable()
	 * @generated
	 */
	EReference getDeclarable_Type();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.KPI <em>KPI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPI</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.KPI
	 * @generated
	 */
	EClass getKPI();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Provider
	 * @generated
	 */
	EClass getProvider();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Provider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Provider#getName()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Name();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Provider#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Provider#getDescription()
	 * @see #getProvider()
	 * @generated
	 */
	EAttribute getProvider_Description();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityCharacteristic <em>Quality Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Characteristic</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.QualityCharacteristic
	 * @generated
	 */
	EClass getQualityCharacteristic();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityCharacteristic#getQualityattributes <em>Qualityattributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualityattributes</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.QualityCharacteristic#getQualityattributes()
	 * @see #getQualityCharacteristic()
	 * @generated
	 */
	EReference getQualityCharacteristic_Qualityattributes();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.RealValue <em>Real Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.RealValue
	 * @generated
	 */
	EClass getRealValue();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.TextualValue <em>Textual Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.TextualValue
	 * @generated
	 */
	EClass getTextualValue();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationValue <em>Enumeration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationValue
	 * @generated
	 */
	EClass getEnumerationValue();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationValue#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationValue#getLiterals()
	 * @see #getEnumerationValue()
	 * @generated
	 */
	EReference getEnumerationValue_Literals();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.AggregationValue <em>Aggregation Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.AggregationValue
	 * @generated
	 */
	EClass getAggregationValue();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.AggregationValue#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.AggregationValue#getWindow()
	 * @see #getAggregationValue()
	 * @generated
	 */
	EAttribute getAggregationValue_Window();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.AggregationValue#getWindowUnit <em>Window Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window Unit</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.AggregationValue#getWindowUnit()
	 * @see #getAggregationValue()
	 * @generated
	 */
	EAttribute getAggregationValue_WindowUnit();

	/**
	 * Returns the meta object for the containment reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.AggregationValue#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.AggregationValue#getOperation()
	 * @see #getAggregationValue()
	 * @generated
	 */
	EReference getAggregationValue_Operation();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationLiteral#getName()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EAttribute getEnumerationLiteral_Name();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitValue <em>Unit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.UnitValue
	 * @generated
	 */
	EClass getUnitValue();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitValue#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.UnitValue#getUnit()
	 * @see #getUnitValue()
	 * @generated
	 */
	EAttribute getUnitValue_Unit();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue <em>Drift Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drift Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue
	 * @generated
	 */
	EClass getDriftValue();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue#getWindow()
	 * @see #getDriftValue()
	 * @generated
	 */
	EAttribute getDriftValue_Window();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue#getWindowUnit <em>Window Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window Unit</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue#getWindowUnit()
	 * @see #getDriftValue()
	 * @generated
	 */
	EAttribute getDriftValue_WindowUnit();

	/**
	 * Returns the meta object for the containment reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue#getOperation()
	 * @see #getDriftValue()
	 * @generated
	 */
	EReference getDriftValue_Operation();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Minimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minimum</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Minimum
	 * @generated
	 */
	EClass getMinimum();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Average <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Average</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Average
	 * @generated
	 */
	EClass getAverage();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Median <em>Median</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Median</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Median
	 * @generated
	 */
	EClass getMedian();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.StandardDeviation <em>Standard Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Deviation</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.StandardDeviation
	 * @generated
	 */
	EClass getStandardDeviation();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Maximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maximum</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Maximum
	 * @generated
	 */
	EClass getMaximum();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp <em>Bin Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bin Op</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp
	 * @generated
	 */
	EClass getBinOp();

	/**
	 * Returns the meta object for the containment reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp#getRight()
	 * @see #getBinOp()
	 * @generated
	 */
	EReference getBinOp_Right();

	/**
	 * Returns the meta object for the containment reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp#getLeft()
	 * @see #getBinOp()
	 * @generated
	 */
	EReference getBinOp_Left();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Greater
	 * @generated
	 */
	EClass getGreater();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Multiply
	 * @generated
	 */
	EClass getMultiply();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.LessEq <em>Less Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Eq</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.LessEq
	 * @generated
	 */
	EClass getLessEq();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.GreaterEq <em>Greater Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Eq</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.GreaterEq
	 * @generated
	 */
	EClass getGreaterEq();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Not#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Not#getExpression()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Expression();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.RealConstant <em>Real Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Constant</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.RealConstant
	 * @generated
	 */
	EClass getRealConstant();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.RealConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.RealConstant#getValue()
	 * @see #getRealConstant()
	 * @generated
	 */
	EAttribute getRealConstant_Value();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnaryMinus <em>Unary Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Minus</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.UnaryMinus
	 * @generated
	 */
	EClass getUnaryMinus();

	/**
	 * Returns the meta object for the containment reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnaryMinus#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.UnaryMinus#getExpression()
	 * @see #getUnaryMinus()
	 * @generated
	 */
	EReference getUnaryMinus_Expression();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Divide
	 * @generated
	 */
	EClass getDivide();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Less <em>Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Less
	 * @generated
	 */
	EClass getLess();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Inequality <em>Inequality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inequality</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Inequality
	 * @generated
	 */
	EClass getInequality();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Equality
	 * @generated
	 */
	EClass getEquality();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.MinOp <em>Min Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Op</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.MinOp
	 * @generated
	 */
	EClass getMinOp();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.MinOp#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.MinOp#getExpressions()
	 * @see #getMinOp()
	 * @generated
	 */
	EReference getMinOp_Expressions();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp <em>Conditional Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Op</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp
	 * @generated
	 */
	EClass getConditionalOp();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp#getResults()
	 * @see #getConditionalOp()
	 * @generated
	 */
	EReference getConditionalOp_Results();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp#getConditions()
	 * @see #getConditionalOp()
	 * @generated
	 */
	EReference getConditionalOp_Conditions();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp <em>Threshold Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold Op</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp
	 * @generated
	 */
	EClass getThresholdOp();

	/**
	 * Returns the meta object for the containment reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp#getExpression()
	 * @see #getThresholdOp()
	 * @generated
	 */
	EReference getThresholdOp_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Threshold</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp#getThreshold()
	 * @see #getThresholdOp()
	 * @generated
	 */
	EReference getThresholdOp_Threshold();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp <em>Weighted Sum Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weighted Sum Op</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp
	 * @generated
	 */
	EClass getWeightedSumOp();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp#getExpressions()
	 * @see #getWeightedSumOp()
	 * @generated
	 */
	EReference getWeightedSumOp_Expressions();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp#getWeights <em>Weights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weights</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp#getWeights()
	 * @see #getWeightedSumOp()
	 * @generated
	 */
	EReference getWeightedSumOp_Weights();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.AvgOp <em>Avg Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avg Op</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.AvgOp
	 * @generated
	 */
	EClass getAvgOp();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.AvgOp#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.AvgOp#getExpressions()
	 * @see #getAvgOp()
	 * @generated
	 */
	EReference getAvgOp_Expressions();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.MaxOp <em>Max Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Op</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.MaxOp
	 * @generated
	 */
	EClass getMaxOp();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.MaxOp#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.MaxOp#getExpressions()
	 * @see #getMaxOp()
	 * @generated
	 */
	EReference getMaxOp_Expressions();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.TextConstant <em>Text Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Constant</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.TextConstant
	 * @generated
	 */
	EClass getTextConstant();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.TextConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.TextConstant#getValue()
	 * @see #getTextConstant()
	 * @generated
	 */
	EAttribute getTextConstant_Value();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.EnumLiteralRef <em>Enum Literal Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal Ref</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.EnumLiteralRef
	 * @generated
	 */
	EClass getEnumLiteralRef();

	/**
	 * Returns the meta object for the reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.EnumLiteralRef#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.EnumLiteralRef#getLiteral()
	 * @see #getEnumLiteralRef()
	 * @generated
	 */
	EReference getEnumLiteralRef_Literal();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.IntConstant <em>Int Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Constant</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.IntConstant
	 * @generated
	 */
	EClass getIntConstant();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.IntConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.IntConstant#getValue()
	 * @see #getIntConstant()
	 * @generated
	 */
	EAttribute getIntConstant_Value();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant <em>Unit Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Constant</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant
	 * @generated
	 */
	EClass getUnitConstant();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant#getValue()
	 * @see #getUnitConstant()
	 * @generated
	 */
	EAttribute getUnitConstant_Value();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant#getUnit()
	 * @see #getUnitConstant()
	 * @generated
	 */
	EAttribute getUnitConstant_Unit();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BoolConstant <em>Bool Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Constant</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.BoolConstant
	 * @generated
	 */
	EClass getBoolConstant();

	/**
	 * Returns the meta object for the attribute '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BoolConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.BoolConstant#getValue()
	 * @see #getBoolConstant()
	 * @generated
	 */
	EAttribute getBoolConstant_Value();

	/**
	 * Returns the meta object for class '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ComputableRef <em>Computable Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computable Ref</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ComputableRef
	 * @generated
	 */
	EClass getComputableRef();

	/**
	 * Returns the meta object for the reference '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ComputableRef#getComputable <em>Computable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computable</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ComputableRef#getComputable()
	 * @see #getComputableRef()
	 * @generated
	 */
	EReference getComputableRef_Computable();

	/**
	 * Returns the meta object for enum '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WindowUnit <em>Window Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Window Unit</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.WindowUnit
	 * @generated
	 */
	EEnum getWindowUnit();

	/**
	 * Returns the meta object for enum '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit <em>Value Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Value Unit</em>'.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit
	 * @generated
	 */
	EEnum getValueUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	formulaKPIFactory getformulaKPIFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ComputationImpl <em>Computation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ComputationImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getComputation()
		 * @generated
		 */
		EClass COMPUTATION = eINSTANCE.getComputation();

		/**
		 * The meta object literal for the '<em><b>Computed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTATION__COMPUTED = eINSTANCE.getComputation_Computed();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTATION__FORMULA = eINSTANCE.getComputation_Formula();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityModelImpl <em>Quality Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityModelImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getQualityModel()
		 * @generated
		 */
		EClass QUALITY_MODEL = eINSTANCE.getQualityModel();

		/**
		 * The meta object literal for the '<em><b>Qualitycharacteristics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_MODEL__QUALITYCHARACTERISTICS = eINSTANCE.getQualityModel_Qualitycharacteristics();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computable <em>Computable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Computable
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getComputable()
		 * @generated
		 */
		EClass COMPUTABLE = eINSTANCE.getComputable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTABLE__NAME = eINSTANCE.getComputable_Name();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DeclarationImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Declared</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__DECLARED = eINSTANCE.getDeclaration_Declared();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.KPIFormulaImpl <em>KPI Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.KPIFormulaImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getKPIFormula()
		 * @generated
		 */
		EClass KPI_FORMULA = eINSTANCE.getKPIFormula();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPI_FORMULA__DECLARATIONS = eINSTANCE.getKPIFormula_Declarations();

		/**
		 * The meta object literal for the '<em><b>Computations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPI_FORMULA__COMPUTATIONS = eINSTANCE.getKPIFormula_Computations();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityAttributeImpl <em>Quality Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityAttributeImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getQualityAttribute()
		 * @generated
		 */
		EClass QUALITY_ATTRIBUTE = eINSTANCE.getQualityAttribute();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_ATTRIBUTE__METRICS = eINSTANCE.getQualityAttribute_Metrics();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ValueType <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ValueType
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MetricImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__PROVIDER = eINSTANCE.getMetric_Provider();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Declarable <em>Declarable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Declarable
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getDeclarable()
		 * @generated
		 */
		EClass DECLARABLE = eINSTANCE.getDeclarable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARABLE__TYPE = eINSTANCE.getDeclarable_Type();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Operation <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Operation
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Expression
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.KPIImpl <em>KPI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.KPIImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getKPI()
		 * @generated
		 */
		EClass KPI = eINSTANCE.getKPI();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ProviderImpl <em>Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ProviderImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getProvider()
		 * @generated
		 */
		EClass PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__NAME = eINSTANCE.getProvider_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVIDER__DESCRIPTION = eINSTANCE.getProvider_Description();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityCharacteristicImpl <em>Quality Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityCharacteristicImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getQualityCharacteristic()
		 * @generated
		 */
		EClass QUALITY_CHARACTERISTIC = eINSTANCE.getQualityCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Qualityattributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_CHARACTERISTIC__QUALITYATTRIBUTES = eINSTANCE.getQualityCharacteristic_Qualityattributes();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.IntegerValueImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.RealValueImpl <em>Real Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.RealValueImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getRealValue()
		 * @generated
		 */
		EClass REAL_VALUE = eINSTANCE.getRealValue();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.TextualValueImpl <em>Textual Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.TextualValueImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getTextualValue()
		 * @generated
		 */
		EClass TEXTUAL_VALUE = eINSTANCE.getTextualValue();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.BooleanValueImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumerationValueImpl <em>Enumeration Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumerationValueImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getEnumerationValue()
		 * @generated
		 */
		EClass ENUMERATION_VALUE = eINSTANCE.getEnumerationValue();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_VALUE__LITERALS = eINSTANCE.getEnumerationValue_Literals();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AggregationValueImpl <em>Aggregation Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AggregationValueImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getAggregationValue()
		 * @generated
		 */
		EClass AGGREGATION_VALUE = eINSTANCE.getAggregationValue();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_VALUE__WINDOW = eINSTANCE.getAggregationValue_Window();

		/**
		 * The meta object literal for the '<em><b>Window Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_VALUE__WINDOW_UNIT = eINSTANCE.getAggregationValue_WindowUnit();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_VALUE__OPERATION = eINSTANCE.getAggregationValue_Operation();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumerationLiteralImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_LITERAL__NAME = eINSTANCE.getEnumerationLiteral_Name();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnitValueImpl <em>Unit Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnitValueImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getUnitValue()
		 * @generated
		 */
		EClass UNIT_VALUE = eINSTANCE.getUnitValue();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_VALUE__UNIT = eINSTANCE.getUnitValue_Unit();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DriftValueImpl <em>Drift Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DriftValueImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getDriftValue()
		 * @generated
		 */
		EClass DRIFT_VALUE = eINSTANCE.getDriftValue();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIFT_VALUE__WINDOW = eINSTANCE.getDriftValue_Window();

		/**
		 * The meta object literal for the '<em><b>Window Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIFT_VALUE__WINDOW_UNIT = eINSTANCE.getDriftValue_WindowUnit();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIFT_VALUE__OPERATION = eINSTANCE.getDriftValue_Operation();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MinimumImpl <em>Minimum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MinimumImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMinimum()
		 * @generated
		 */
		EClass MINIMUM = eINSTANCE.getMinimum();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AverageImpl <em>Average</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AverageImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getAverage()
		 * @generated
		 */
		EClass AVERAGE = eINSTANCE.getAverage();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MedianImpl <em>Median</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MedianImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMedian()
		 * @generated
		 */
		EClass MEDIAN = eINSTANCE.getMedian();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.StandardDeviationImpl <em>Standard Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.StandardDeviationImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getStandardDeviation()
		 * @generated
		 */
		EClass STANDARD_DEVIATION = eINSTANCE.getStandardDeviation();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MaximumImpl <em>Maximum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MaximumImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMaximum()
		 * @generated
		 */
		EClass MAXIMUM = eINSTANCE.getMaximum();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp <em>Bin Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getBinOp()
		 * @generated
		 */
		EClass BIN_OP = eINSTANCE.getBinOp();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_OP__RIGHT = eINSTANCE.getBinOp_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIN_OP__LEFT = eINSTANCE.getBinOp_Left();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.GreaterImpl <em>Greater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.GreaterImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getGreater()
		 * @generated
		 */
		EClass GREATER = eINSTANCE.getGreater();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MultiplyImpl <em>Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MultiplyImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMultiply()
		 * @generated
		 */
		EClass MULTIPLY = eINSTANCE.getMultiply();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MinusImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.PlusImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.LessEqImpl <em>Less Eq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.LessEqImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getLessEq()
		 * @generated
		 */
		EClass LESS_EQ = eINSTANCE.getLessEq();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.GreaterEqImpl <em>Greater Eq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.GreaterEqImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getGreaterEq()
		 * @generated
		 */
		EClass GREATER_EQ = eINSTANCE.getGreaterEq();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AndImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.NotImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__EXPRESSION = eINSTANCE.getNot_Expression();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Literal <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.Literal
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.RealConstantImpl <em>Real Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.RealConstantImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getRealConstant()
		 * @generated
		 */
		EClass REAL_CONSTANT = eINSTANCE.getRealConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_CONSTANT__VALUE = eINSTANCE.getRealConstant_Value();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnaryMinusImpl <em>Unary Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnaryMinusImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getUnaryMinus()
		 * @generated
		 */
		EClass UNARY_MINUS = eINSTANCE.getUnaryMinus();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_MINUS__EXPRESSION = eINSTANCE.getUnaryMinus_Expression();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DivideImpl <em>Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DivideImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getDivide()
		 * @generated
		 */
		EClass DIVIDE = eINSTANCE.getDivide();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.LessImpl <em>Less</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.LessImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getLess()
		 * @generated
		 */
		EClass LESS = eINSTANCE.getLess();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.InequalityImpl <em>Inequality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.InequalityImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getInequality()
		 * @generated
		 */
		EClass INEQUALITY = eINSTANCE.getInequality();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EqualityImpl <em>Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EqualityImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getEquality()
		 * @generated
		 */
		EClass EQUALITY = eINSTANCE.getEquality();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.OrImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MinOpImpl <em>Min Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MinOpImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMinOp()
		 * @generated
		 */
		EClass MIN_OP = eINSTANCE.getMinOp();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIN_OP__EXPRESSIONS = eINSTANCE.getMinOp_Expressions();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ConditionalOpImpl <em>Conditional Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ConditionalOpImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getConditionalOp()
		 * @generated
		 */
		EClass CONDITIONAL_OP = eINSTANCE.getConditionalOp();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_OP__RESULTS = eINSTANCE.getConditionalOp_Results();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_OP__CONDITIONS = eINSTANCE.getConditionalOp_Conditions();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ThresholdOpImpl <em>Threshold Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ThresholdOpImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getThresholdOp()
		 * @generated
		 */
		EClass THRESHOLD_OP = eINSTANCE.getThresholdOp();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THRESHOLD_OP__EXPRESSION = eINSTANCE.getThresholdOp_Expression();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THRESHOLD_OP__THRESHOLD = eINSTANCE.getThresholdOp_Threshold();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.WeightedSumOpImpl <em>Weighted Sum Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.WeightedSumOpImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getWeightedSumOp()
		 * @generated
		 */
		EClass WEIGHTED_SUM_OP = eINSTANCE.getWeightedSumOp();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEIGHTED_SUM_OP__EXPRESSIONS = eINSTANCE.getWeightedSumOp_Expressions();

		/**
		 * The meta object literal for the '<em><b>Weights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEIGHTED_SUM_OP__WEIGHTS = eINSTANCE.getWeightedSumOp_Weights();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AvgOpImpl <em>Avg Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AvgOpImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getAvgOp()
		 * @generated
		 */
		EClass AVG_OP = eINSTANCE.getAvgOp();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVG_OP__EXPRESSIONS = eINSTANCE.getAvgOp_Expressions();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MaxOpImpl <em>Max Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.MaxOpImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getMaxOp()
		 * @generated
		 */
		EClass MAX_OP = eINSTANCE.getMaxOp();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAX_OP__EXPRESSIONS = eINSTANCE.getMaxOp_Expressions();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.TextConstantImpl <em>Text Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.TextConstantImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getTextConstant()
		 * @generated
		 */
		EClass TEXT_CONSTANT = eINSTANCE.getTextConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONSTANT__VALUE = eINSTANCE.getTextConstant_Value();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumLiteralRefImpl <em>Enum Literal Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumLiteralRefImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getEnumLiteralRef()
		 * @generated
		 */
		EClass ENUM_LITERAL_REF = eINSTANCE.getEnumLiteralRef();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL_REF__LITERAL = eINSTANCE.getEnumLiteralRef_Literal();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.IntConstantImpl <em>Int Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.IntConstantImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getIntConstant()
		 * @generated
		 */
		EClass INT_CONSTANT = eINSTANCE.getIntConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_CONSTANT__VALUE = eINSTANCE.getIntConstant_Value();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnitConstantImpl <em>Unit Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnitConstantImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getUnitConstant()
		 * @generated
		 */
		EClass UNIT_CONSTANT = eINSTANCE.getUnitConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_CONSTANT__VALUE = eINSTANCE.getUnitConstant_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_CONSTANT__UNIT = eINSTANCE.getUnitConstant_Unit();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.BoolConstantImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getBoolConstant()
		 * @generated
		 */
		EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ComputableRefImpl <em>Computable Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ComputableRefImpl
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getComputableRef()
		 * @generated
		 */
		EClass COMPUTABLE_REF = eINSTANCE.getComputableRef();

		/**
		 * The meta object literal for the '<em><b>Computable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTABLE_REF__COMPUTABLE = eINSTANCE.getComputableRef_Computable();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WindowUnit <em>Window Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.WindowUnit
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getWindowUnit()
		 * @generated
		 */
		EEnum WINDOW_UNIT = eINSTANCE.getWindowUnit();

		/**
		 * The meta object literal for the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit <em>Value Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit
		 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.impl.formulaKPIPackageImpl#getValueUnit()
		 * @generated
		 */
		EEnum VALUE_UNIT = eINSTANCE.getValueUnit();

	}

} //formulaKPIPackage
