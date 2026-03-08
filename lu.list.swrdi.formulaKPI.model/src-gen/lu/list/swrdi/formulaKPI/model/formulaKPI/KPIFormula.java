/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPI Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula#getComputations <em>Computations</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getKPIFormula()
 * @model
 * @generated
 */
public interface KPIFormula extends EObject {
	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getKPIFormula_Declarations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Declaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Computations</b></em>' containment reference list.
	 * The list contents are of type {@link lu.list.swrdi.formulaKPI.model.formulaKPI.Computation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computations</em>' containment reference list.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getKPIFormula_Computations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Computation> getComputations();

} // KPIFormula
