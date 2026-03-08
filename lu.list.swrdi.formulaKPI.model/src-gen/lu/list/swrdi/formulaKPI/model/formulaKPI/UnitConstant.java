/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant#getValue <em>Value</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getUnitConstant()
 * @model
 * @generated
 */
public interface UnitConstant extends Literal {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getUnitConstant_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit
	 * @see #setUnit(ValueUnit)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getUnitConstant_Unit()
	 * @model
	 * @generated
	 */
	ValueUnit getUnit();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(ValueUnit value);

} // UnitConstant
