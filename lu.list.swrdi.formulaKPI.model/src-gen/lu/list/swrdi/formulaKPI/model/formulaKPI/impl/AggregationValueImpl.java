/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import lu.list.swrdi.formulaKPI.model.formulaKPI.AggregationValue;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Operation;
import lu.list.swrdi.formulaKPI.model.formulaKPI.WindowUnit;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AggregationValueImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AggregationValueImpl#getWindowUnit <em>Window Unit</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.AggregationValueImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationValueImpl extends MinimalEObjectImpl.Container implements AggregationValue {
	/**
	 * The default value of the '{@link #getWindow() <em>Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected static final int WINDOW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWindow() <em>Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected int window = WINDOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getWindowUnit() <em>Window Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowUnit()
	 * @generated
	 * @ordered
	 */
	protected static final WindowUnit WINDOW_UNIT_EDEFAULT = WindowUnit.SEC;

	/**
	 * The cached value of the '{@link #getWindowUnit() <em>Window Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowUnit()
	 * @generated
	 * @ordered
	 */
	protected WindowUnit windowUnit = WINDOW_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formulaKPIPackage.Literals.AGGREGATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWindow() {
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindow(int newWindow) {
		int oldWindow = window;
		window = newWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.AGGREGATION_VALUE__WINDOW,
					oldWindow, window));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowUnit getWindowUnit() {
		return windowUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindowUnit(WindowUnit newWindowUnit) {
		WindowUnit oldWindowUnit = windowUnit;
		windowUnit = newWindowUnit == null ? WINDOW_UNIT_EDEFAULT : newWindowUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.AGGREGATION_VALUE__WINDOW_UNIT,
					oldWindowUnit, windowUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					formulaKPIPackage.AGGREGATION_VALUE__OPERATION, oldOperation, newOperation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject) operation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.AGGREGATION_VALUE__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject) newOperation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.AGGREGATION_VALUE__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.AGGREGATION_VALUE__OPERATION,
					newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case formulaKPIPackage.AGGREGATION_VALUE__OPERATION:
			return basicSetOperation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case formulaKPIPackage.AGGREGATION_VALUE__WINDOW:
			return getWindow();
		case formulaKPIPackage.AGGREGATION_VALUE__WINDOW_UNIT:
			return getWindowUnit();
		case formulaKPIPackage.AGGREGATION_VALUE__OPERATION:
			return getOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case formulaKPIPackage.AGGREGATION_VALUE__WINDOW:
			setWindow((Integer) newValue);
			return;
		case formulaKPIPackage.AGGREGATION_VALUE__WINDOW_UNIT:
			setWindowUnit((WindowUnit) newValue);
			return;
		case formulaKPIPackage.AGGREGATION_VALUE__OPERATION:
			setOperation((Operation) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case formulaKPIPackage.AGGREGATION_VALUE__WINDOW:
			setWindow(WINDOW_EDEFAULT);
			return;
		case formulaKPIPackage.AGGREGATION_VALUE__WINDOW_UNIT:
			setWindowUnit(WINDOW_UNIT_EDEFAULT);
			return;
		case formulaKPIPackage.AGGREGATION_VALUE__OPERATION:
			setOperation((Operation) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case formulaKPIPackage.AGGREGATION_VALUE__WINDOW:
			return window != WINDOW_EDEFAULT;
		case formulaKPIPackage.AGGREGATION_VALUE__WINDOW_UNIT:
			return windowUnit != WINDOW_UNIT_EDEFAULT;
		case formulaKPIPackage.AGGREGATION_VALUE__OPERATION:
			return operation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (window: ");
		result.append(window);
		result.append(", windowUnit: ");
		result.append(windowUnit);
		result.append(')');
		return result.toString();
	}

} //AggregationValueImpl
