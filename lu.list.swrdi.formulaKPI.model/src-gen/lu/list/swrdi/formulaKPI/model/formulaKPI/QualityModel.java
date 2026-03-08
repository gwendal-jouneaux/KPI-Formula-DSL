/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityModel#getQualitycharacteristics <em>Qualitycharacteristics</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getQualityModel()
 * @model
 * @generated
 */
public interface QualityModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualitycharacteristics</b></em>' containment reference list.
	 * The list contents are of type {@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualitycharacteristics</em>' containment reference list.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getQualityModel_Qualitycharacteristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<QualityCharacteristic> getQualitycharacteristics();

} // QualityModel
