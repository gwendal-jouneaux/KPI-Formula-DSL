/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weighted Sum Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp#getList <em>List</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp#getWeights <em>Weights</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getWeightedSumOp()
 * @model
 * @generated
 */
public interface WeightedSumOp extends Expression {
	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(Expression)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getWeightedSumOp_List()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getList();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(Expression value);

	/**
	 * Returns the value of the '<em><b>Weights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weights</em>' containment reference.
	 * @see #setWeights(Expression)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getWeightedSumOp_Weights()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getWeights();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp#getWeights <em>Weights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weights</em>' containment reference.
	 * @see #getWeights()
	 * @generated
	 */
	void setWeights(Expression value);

} // WeightedSumOp
