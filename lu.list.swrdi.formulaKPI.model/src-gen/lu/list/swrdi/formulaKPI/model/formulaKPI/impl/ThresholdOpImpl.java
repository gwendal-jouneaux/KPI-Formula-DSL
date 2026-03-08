/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import lu.list.swrdi.formulaKPI.model.formulaKPI.Expression;
import lu.list.swrdi.formulaKPI.model.formulaKPI.ThresholdOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Threshold Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ThresholdOpImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ThresholdOpImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThresholdOpImpl extends MinimalEObjectImpl.Container implements ThresholdOp {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected Expression threshold;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThresholdOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formulaKPIPackage.Literals.THRESHOLD_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs) {
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					formulaKPIPackage.THRESHOLD_OP__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(Expression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject) expression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.THRESHOLD_OP__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject) newExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.THRESHOLD_OP__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.THRESHOLD_OP__EXPRESSION,
					newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreshold(Expression newThreshold, NotificationChain msgs) {
		Expression oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					formulaKPIPackage.THRESHOLD_OP__THRESHOLD, oldThreshold, newThreshold);
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
	public void setThreshold(Expression newThreshold) {
		if (newThreshold != threshold) {
			NotificationChain msgs = null;
			if (threshold != null)
				msgs = ((InternalEObject) threshold).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.THRESHOLD_OP__THRESHOLD, null, msgs);
			if (newThreshold != null)
				msgs = ((InternalEObject) newThreshold).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.THRESHOLD_OP__THRESHOLD, null, msgs);
			msgs = basicSetThreshold(newThreshold, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.THRESHOLD_OP__THRESHOLD,
					newThreshold, newThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case formulaKPIPackage.THRESHOLD_OP__EXPRESSION:
			return basicSetExpression(null, msgs);
		case formulaKPIPackage.THRESHOLD_OP__THRESHOLD:
			return basicSetThreshold(null, msgs);
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
		case formulaKPIPackage.THRESHOLD_OP__EXPRESSION:
			return getExpression();
		case formulaKPIPackage.THRESHOLD_OP__THRESHOLD:
			return getThreshold();
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
		case formulaKPIPackage.THRESHOLD_OP__EXPRESSION:
			setExpression((Expression) newValue);
			return;
		case formulaKPIPackage.THRESHOLD_OP__THRESHOLD:
			setThreshold((Expression) newValue);
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
		case formulaKPIPackage.THRESHOLD_OP__EXPRESSION:
			setExpression((Expression) null);
			return;
		case formulaKPIPackage.THRESHOLD_OP__THRESHOLD:
			setThreshold((Expression) null);
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
		case formulaKPIPackage.THRESHOLD_OP__EXPRESSION:
			return expression != null;
		case formulaKPIPackage.THRESHOLD_OP__THRESHOLD:
			return threshold != null;
		}
		return super.eIsSet(featureID);
	}

} //ThresholdOpImpl
