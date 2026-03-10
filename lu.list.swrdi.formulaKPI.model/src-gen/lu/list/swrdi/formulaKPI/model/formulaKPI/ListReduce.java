/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Reduce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ListReduce#getAccumulator <em>Accumulator</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getListReduce()
 * @model
 * @generated
 */
public interface ListReduce extends ListOperation {
	/**
	 * Returns the value of the '<em><b>Accumulator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accumulator</em>' containment reference.
	 * @see #setAccumulator(Expression)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getListReduce_Accumulator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAccumulator();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.ListReduce#getAccumulator <em>Accumulator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accumulator</em>' containment reference.
	 * @see #getAccumulator()
	 * @generated
	 */
	void setAccumulator(Expression value);

} // ListReduce
