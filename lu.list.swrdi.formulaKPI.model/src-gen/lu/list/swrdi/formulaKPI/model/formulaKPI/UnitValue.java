/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitValue#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getUnitValue()
 * @model
 * @generated
 */
public interface UnitValue extends ValueType {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit
	 * @see #setUnit(ValueUnit)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getUnitValue_Unit()
	 * @model
	 * @generated
	 */
	ValueUnit getUnit();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.UnitValue#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(ValueUnit value);

} // UnitValue
