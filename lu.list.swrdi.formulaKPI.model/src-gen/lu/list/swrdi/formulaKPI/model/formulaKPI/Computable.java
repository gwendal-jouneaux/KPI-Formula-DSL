/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getComputable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Computable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getComputable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Computable
