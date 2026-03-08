/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp#getResults <em>Results</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getConditionalOp()
 * @model
 * @generated
 */
public interface ConditionalOp extends Expression {
	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link lu.list.swrdi.formulaKPI.model.formulaKPI.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getConditionalOp_Results()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getResults();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link lu.list.swrdi.formulaKPI.model.formulaKPI.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getConditionalOp_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getConditions();

} // ConditionalOp
