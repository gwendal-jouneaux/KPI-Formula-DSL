/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import java.util.Collection;

import lu.list.swrdi.formulaKPI.model.formulaKPI.QualityCharacteristic;
import lu.list.swrdi.formulaKPI.model.formulaKPI.QualityModel;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.QualityModelImpl#getQualitycharacteristics <em>Qualitycharacteristics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityModelImpl extends MinimalEObjectImpl.Container implements QualityModel {
	/**
	 * The cached value of the '{@link #getQualitycharacteristics() <em>Qualitycharacteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualitycharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<QualityCharacteristic> qualitycharacteristics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formulaKPIPackage.Literals.QUALITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualityCharacteristic> getQualitycharacteristics() {
		if (qualitycharacteristics == null) {
			qualitycharacteristics = new EObjectContainmentEList<QualityCharacteristic>(QualityCharacteristic.class,
					this, formulaKPIPackage.QUALITY_MODEL__QUALITYCHARACTERISTICS);
		}
		return qualitycharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case formulaKPIPackage.QUALITY_MODEL__QUALITYCHARACTERISTICS:
			return ((InternalEList<?>) getQualitycharacteristics()).basicRemove(otherEnd, msgs);
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
		case formulaKPIPackage.QUALITY_MODEL__QUALITYCHARACTERISTICS:
			return getQualitycharacteristics();
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
		case formulaKPIPackage.QUALITY_MODEL__QUALITYCHARACTERISTICS:
			getQualitycharacteristics().clear();
			getQualitycharacteristics().addAll((Collection<? extends QualityCharacteristic>) newValue);
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
		case formulaKPIPackage.QUALITY_MODEL__QUALITYCHARACTERISTICS:
			getQualitycharacteristics().clear();
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
		case formulaKPIPackage.QUALITY_MODEL__QUALITYCHARACTERISTICS:
			return qualitycharacteristics != null && !qualitycharacteristics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QualityModelImpl
