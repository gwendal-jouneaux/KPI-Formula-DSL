/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weighted Sum Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp#getWeights <em>Weights</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getWeightedSumOp()
 * @model
 * @generated
 */
public interface WeightedSumOp extends Expression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link lu.list.swrdi.formulaKPI.model.formulaKPI.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getWeightedSumOp_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Weights</b></em>' containment reference list.
	 * The list contents are of type {@link lu.list.swrdi.formulaKPI.model.formulaKPI.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weights</em>' containment reference list.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getWeightedSumOp_Weights()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getWeights();

} // WeightedSumOp
