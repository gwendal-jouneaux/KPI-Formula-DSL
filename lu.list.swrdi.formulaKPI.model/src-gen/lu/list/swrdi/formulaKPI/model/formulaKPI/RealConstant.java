/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.RealConstant#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getRealConstant()
 * @model
 * @generated
 */
public interface RealConstant extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getRealConstant_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.RealConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // RealConstant
