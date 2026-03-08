/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drift Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue#getWindow <em>Window</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue#getWindowUnit <em>Window Unit</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getDriftValue()
 * @model
 * @generated
 */
public interface DriftValue extends ValueType {
	/**
	 * Returns the value of the '<em><b>Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' attribute.
	 * @see #setWindow(int)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getDriftValue_Window()
	 * @model
	 * @generated
	 */
	int getWindow();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue#getWindow <em>Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window</em>' attribute.
	 * @see #getWindow()
	 * @generated
	 */
	void setWindow(int value);

	/**
	 * Returns the value of the '<em><b>Window Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link lu.list.swrdi.formulaKPI.model.formulaKPI.WindowUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window Unit</em>' attribute.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.WindowUnit
	 * @see #setWindowUnit(WindowUnit)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getDriftValue_WindowUnit()
	 * @model
	 * @generated
	 */
	WindowUnit getWindowUnit();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue#getWindowUnit <em>Window Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Unit</em>' attribute.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.WindowUnit
	 * @see #getWindowUnit()
	 * @generated
	 */
	void setWindowUnit(WindowUnit value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getDriftValue_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.DriftValue#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // DriftValue
