/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import lu.list.swrdi.formulaKPI.model.formulaKPI.Expression;
import lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weighted Sum Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.WeightedSumOpImpl#getList <em>List</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.WeightedSumOpImpl#getWeights <em>Weights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeightedSumOpImpl extends MinimalEObjectImpl.Container implements WeightedSumOp {
	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected Expression list;

	/**
	 * The cached value of the '{@link #getWeights() <em>Weights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeights()
	 * @generated
	 * @ordered
	 */
	protected Expression weights;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeightedSumOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formulaKPIPackage.Literals.WEIGHTED_SUM_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getList() {
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(Expression newList, NotificationChain msgs) {
		Expression oldList = list;
		list = newList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					formulaKPIPackage.WEIGHTED_SUM_OP__LIST, oldList, newList);
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
	public void setList(Expression newList) {
		if (newList != list) {
			NotificationChain msgs = null;
			if (list != null)
				msgs = ((InternalEObject) list).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.WEIGHTED_SUM_OP__LIST, null, msgs);
			if (newList != null)
				msgs = ((InternalEObject) newList).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.WEIGHTED_SUM_OP__LIST, null, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.WEIGHTED_SUM_OP__LIST, newList,
					newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getWeights() {
		return weights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeights(Expression newWeights, NotificationChain msgs) {
		Expression oldWeights = weights;
		weights = newWeights;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS, oldWeights, newWeights);
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
	public void setWeights(Expression newWeights) {
		if (newWeights != weights) {
			NotificationChain msgs = null;
			if (weights != null)
				msgs = ((InternalEObject) weights).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS, null, msgs);
			if (newWeights != null)
				msgs = ((InternalEObject) newWeights).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS, null, msgs);
			msgs = basicSetWeights(newWeights, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS,
					newWeights, newWeights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case formulaKPIPackage.WEIGHTED_SUM_OP__LIST:
			return basicSetList(null, msgs);
		case formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS:
			return basicSetWeights(null, msgs);
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
		case formulaKPIPackage.WEIGHTED_SUM_OP__LIST:
			return getList();
		case formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS:
			return getWeights();
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
		case formulaKPIPackage.WEIGHTED_SUM_OP__LIST:
			setList((Expression) newValue);
			return;
		case formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS:
			setWeights((Expression) newValue);
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
		case formulaKPIPackage.WEIGHTED_SUM_OP__LIST:
			setList((Expression) null);
			return;
		case formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS:
			setWeights((Expression) null);
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
		case formulaKPIPackage.WEIGHTED_SUM_OP__LIST:
			return list != null;
		case formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS:
			return weights != null;
		}
		return super.eIsSet(featureID);
	}

} //WeightedSumOpImpl
