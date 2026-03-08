/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import lu.list.swrdi.formulaKPI.model.formulaKPI.Computable;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Computation;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Expression;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ComputationImpl#getComputed <em>Computed</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ComputationImpl#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputationImpl extends MinimalEObjectImpl.Container implements Computation {
	/**
	 * The cached value of the '{@link #getComputed() <em>Computed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputed()
	 * @generated
	 * @ordered
	 */
	protected Computable computed;

	/**
	 * The cached value of the '{@link #getFormula() <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormula()
	 * @generated
	 * @ordered
	 */
	protected Expression formula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formulaKPIPackage.Literals.COMPUTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computable getComputed() {
		if (computed != null && computed.eIsProxy()) {
			InternalEObject oldComputed = (InternalEObject) computed;
			computed = (Computable) eResolveProxy(oldComputed);
			if (computed != oldComputed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, formulaKPIPackage.COMPUTATION__COMPUTED,
							oldComputed, computed));
			}
		}
		return computed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computable basicGetComputed() {
		return computed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputed(Computable newComputed) {
		Computable oldComputed = computed;
		computed = newComputed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.COMPUTATION__COMPUTED, oldComputed,
					computed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFormula() {
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormula(Expression newFormula, NotificationChain msgs) {
		Expression oldFormula = formula;
		formula = newFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					formulaKPIPackage.COMPUTATION__FORMULA, oldFormula, newFormula);
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
	public void setFormula(Expression newFormula) {
		if (newFormula != formula) {
			NotificationChain msgs = null;
			if (formula != null)
				msgs = ((InternalEObject) formula).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.COMPUTATION__FORMULA, null, msgs);
			if (newFormula != null)
				msgs = ((InternalEObject) newFormula).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.COMPUTATION__FORMULA, null, msgs);
			msgs = basicSetFormula(newFormula, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.COMPUTATION__FORMULA, newFormula,
					newFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case formulaKPIPackage.COMPUTATION__FORMULA:
			return basicSetFormula(null, msgs);
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
		case formulaKPIPackage.COMPUTATION__COMPUTED:
			if (resolve)
				return getComputed();
			return basicGetComputed();
		case formulaKPIPackage.COMPUTATION__FORMULA:
			return getFormula();
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
		case formulaKPIPackage.COMPUTATION__COMPUTED:
			setComputed((Computable) newValue);
			return;
		case formulaKPIPackage.COMPUTATION__FORMULA:
			setFormula((Expression) newValue);
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
		case formulaKPIPackage.COMPUTATION__COMPUTED:
			setComputed((Computable) null);
			return;
		case formulaKPIPackage.COMPUTATION__FORMULA:
			setFormula((Expression) null);
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
		case formulaKPIPackage.COMPUTATION__COMPUTED:
			return computed != null;
		case formulaKPIPackage.COMPUTATION__FORMULA:
			return formula != null;
		}
		return super.eIsSet(featureID);
	}

} //ComputationImpl
