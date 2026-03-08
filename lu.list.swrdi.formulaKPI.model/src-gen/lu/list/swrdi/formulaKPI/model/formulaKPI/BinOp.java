/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp#getRight <em>Right</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getBinOp()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BinOp extends Expression {
	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getBinOp_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getBinOp_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.BinOp#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

} // BinOp
