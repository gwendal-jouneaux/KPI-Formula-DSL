/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration#getDeclared <em>Declared</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Declared</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declared</em>' containment reference.
	 * @see #setDeclared(Declarable)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getDeclaration_Declared()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Declarable getDeclared();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration#getDeclared <em>Declared</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declared</em>' containment reference.
	 * @see #getDeclared()
	 * @generated
	 */
	void setDeclared(Declarable value);

} // Declaration
