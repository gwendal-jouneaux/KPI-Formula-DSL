/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computation#getComputed <em>Computed</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computation#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getComputation()
 * @model
 * @generated
 */
public interface Computation extends EObject {
	/**
	 * Returns the value of the '<em><b>Computed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed</em>' reference.
	 * @see #setComputed(Computable)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getComputation_Computed()
	 * @model required="true"
	 * @generated
	 */
	Computable getComputed();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computation#getComputed <em>Computed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed</em>' reference.
	 * @see #getComputed()
	 * @generated
	 */
	void setComputed(Computable value);

	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(Expression)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getComputation_Formula()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getFormula();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computation#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(Expression value);

} // Computation
