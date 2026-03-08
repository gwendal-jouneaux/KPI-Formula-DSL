/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import lu.list.swrdi.formulaKPI.model.formulaKPI.Computable;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ComputableRef;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computable Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ComputableRefImpl#getComputable <em>Computable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputableRefImpl extends MinimalEObjectImpl.Container implements ComputableRef {
	/**
	 * The cached value of the '{@link #getComputable() <em>Computable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputable()
	 * @generated
	 * @ordered
	 */
	protected Computable computable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputableRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formulaKPIPackage.Literals.COMPUTABLE_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computable getComputable() {
		if (computable != null && computable.eIsProxy()) {
			InternalEObject oldComputable = (InternalEObject) computable;
			computable = (Computable) eResolveProxy(oldComputable);
			if (computable != oldComputable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							formulaKPIPackage.COMPUTABLE_REF__COMPUTABLE, oldComputable, computable));
			}
		}
		return computable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computable basicGetComputable() {
		return computable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputable(Computable newComputable) {
		Computable oldComputable = computable;
		computable = newComputable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.COMPUTABLE_REF__COMPUTABLE,
					oldComputable, computable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case formulaKPIPackage.COMPUTABLE_REF__COMPUTABLE:
			if (resolve)
				return getComputable();
			return basicGetComputable();
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
		case formulaKPIPackage.COMPUTABLE_REF__COMPUTABLE:
			setComputable((Computable) newValue);
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
		case formulaKPIPackage.COMPUTABLE_REF__COMPUTABLE:
			setComputable((Computable) null);
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
		case formulaKPIPackage.COMPUTABLE_REF__COMPUTABLE:
			return computable != null;
		}
		return super.eIsSet(featureID);
	}

} //ComputableRefImpl
