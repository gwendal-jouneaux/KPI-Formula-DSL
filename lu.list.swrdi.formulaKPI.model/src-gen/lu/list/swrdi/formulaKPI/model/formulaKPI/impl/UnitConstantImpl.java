/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import lu.list.swrdi.formulaKPI.model.formulaKPI.UnitConstant;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ValueUnit;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnitConstantImpl#getValue <em>Value</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.UnitConstantImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitConstantImpl extends MinimalEObjectImpl.Container implements UnitConstant {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final ValueUnit UNIT_EDEFAULT = ValueUnit.MILLI;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected ValueUnit unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formulaKPIPackage.Literals.UNIT_CONSTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.UNIT_CONSTANT__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(ValueUnit newUnit) {
		ValueUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.UNIT_CONSTANT__UNIT, oldUnit,
					unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case formulaKPIPackage.UNIT_CONSTANT__VALUE:
			return getValue();
		case formulaKPIPackage.UNIT_CONSTANT__UNIT:
			return getUnit();
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
		case formulaKPIPackage.UNIT_CONSTANT__VALUE:
			setValue((Double) newValue);
			return;
		case formulaKPIPackage.UNIT_CONSTANT__UNIT:
			setUnit((ValueUnit) newValue);
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
		case formulaKPIPackage.UNIT_CONSTANT__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case formulaKPIPackage.UNIT_CONSTANT__UNIT:
			setUnit(UNIT_EDEFAULT);
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
		case formulaKPIPackage.UNIT_CONSTANT__VALUE:
			return value != VALUE_EDEFAULT;
		case formulaKPIPackage.UNIT_CONSTANT__UNIT:
			return unit != UNIT_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //UnitConstantImpl
