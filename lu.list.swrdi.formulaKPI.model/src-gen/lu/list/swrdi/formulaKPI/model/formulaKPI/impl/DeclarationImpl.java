/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import lu.list.swrdi.formulaKPI.model.formulaKPI.Declarable;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.DeclarationImpl#getDeclared <em>Declared</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationImpl extends MinimalEObjectImpl.Container implements Declaration {
	/**
	 * The cached value of the '{@link #getDeclared() <em>Declared</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclared()
	 * @generated
	 * @ordered
	 */
	protected Declarable declared;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formulaKPIPackage.Literals.DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declarable getDeclared() {
		return declared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclared(Declarable newDeclared, NotificationChain msgs) {
		Declarable oldDeclared = declared;
		declared = newDeclared;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					formulaKPIPackage.DECLARATION__DECLARED, oldDeclared, newDeclared);
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
	public void setDeclared(Declarable newDeclared) {
		if (newDeclared != declared) {
			NotificationChain msgs = null;
			if (declared != null)
				msgs = ((InternalEObject) declared).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.DECLARATION__DECLARED, null, msgs);
			if (newDeclared != null)
				msgs = ((InternalEObject) newDeclared).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.DECLARATION__DECLARED, null, msgs);
			msgs = basicSetDeclared(newDeclared, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.DECLARATION__DECLARED, newDeclared,
					newDeclared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case formulaKPIPackage.DECLARATION__DECLARED:
			return basicSetDeclared(null, msgs);
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
		case formulaKPIPackage.DECLARATION__DECLARED:
			return getDeclared();
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
		case formulaKPIPackage.DECLARATION__DECLARED:
			setDeclared((Declarable) newValue);
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
		case formulaKPIPackage.DECLARATION__DECLARED:
			setDeclared((Declarable) null);
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
		case formulaKPIPackage.DECLARATION__DECLARED:
			return declared != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclarationImpl
