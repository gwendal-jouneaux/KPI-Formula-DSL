/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import java.util.Collection;

import lu.list.swrdi.formulaKPI.model.formulaKPI.QualityAttribute;
import lu.list.swrdi.formulaKPI.model.formulaKPI.QualityCharacteristic;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityCharacteristicImpl#getName <em>Name</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityCharacteristicImpl#getQualityattributes <em>Qualityattributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityCharacteristicImpl extends MinimalEObjectImpl.Container implements QualityCharacteristic {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQualityattributes() <em>Qualityattributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityattributes()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityAttribute> qualityattributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formulaKPIPackage.Literals.QUALITY_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.QUALITY_CHARACTERISTIC__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualityAttribute> getQualityattributes() {
		if (qualityattributes == null) {
			qualityattributes = new EObjectContainmentEList<QualityAttribute>(QualityAttribute.class, this,
					formulaKPIPackage.QUALITY_CHARACTERISTIC__QUALITYATTRIBUTES);
		}
		return qualityattributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case formulaKPIPackage.QUALITY_CHARACTERISTIC__QUALITYATTRIBUTES:
			return ((InternalEList<?>) getQualityattributes()).basicRemove(otherEnd, msgs);
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
		case formulaKPIPackage.QUALITY_CHARACTERISTIC__NAME:
			return getName();
		case formulaKPIPackage.QUALITY_CHARACTERISTIC__QUALITYATTRIBUTES:
			return getQualityattributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case formulaKPIPackage.QUALITY_CHARACTERISTIC__NAME:
			setName((String) newValue);
			return;
		case formulaKPIPackage.QUALITY_CHARACTERISTIC__QUALITYATTRIBUTES:
			getQualityattributes().clear();
			getQualityattributes().addAll((Collection<? extends QualityAttribute>) newValue);
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
		case formulaKPIPackage.QUALITY_CHARACTERISTIC__NAME:
			setName(NAME_EDEFAULT);
			return;
		case formulaKPIPackage.QUALITY_CHARACTERISTIC__QUALITYATTRIBUTES:
			getQualityattributes().clear();
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
		case formulaKPIPackage.QUALITY_CHARACTERISTIC__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case formulaKPIPackage.QUALITY_CHARACTERISTIC__QUALITYATTRIBUTES:
			return qualityattributes != null && !qualityattributes.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //QualityCharacteristicImpl
