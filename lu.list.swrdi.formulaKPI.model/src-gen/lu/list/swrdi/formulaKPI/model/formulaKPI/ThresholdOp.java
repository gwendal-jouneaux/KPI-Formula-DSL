/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threshold Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp#getExpression <em>Expression</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getThresholdOp()
 * @model
 * @generated
 */
public interface ThresholdOp extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getThresholdOp_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' containment reference.
	 * @see #setThreshold(Expression)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getThresholdOp_Threshold()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getThreshold();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp#getThreshold <em>Threshold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' containment reference.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(Expression value);

} // ThresholdOp
