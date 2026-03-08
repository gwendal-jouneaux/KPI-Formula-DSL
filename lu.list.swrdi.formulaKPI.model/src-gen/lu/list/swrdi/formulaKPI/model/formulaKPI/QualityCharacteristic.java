/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityCharacteristic#getQualityattributes <em>Qualityattributes</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getQualityCharacteristic()
 * @model
 * @generated
 */
public interface QualityCharacteristic extends Computable {
	/**
	 * Returns the value of the '<em><b>Qualityattributes</b></em>' containment reference list.
	 * The list contents are of type {@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualityattributes</em>' containment reference list.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getQualityCharacteristic_Qualityattributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<QualityAttribute> getQualityattributes();

} // QualityCharacteristic
