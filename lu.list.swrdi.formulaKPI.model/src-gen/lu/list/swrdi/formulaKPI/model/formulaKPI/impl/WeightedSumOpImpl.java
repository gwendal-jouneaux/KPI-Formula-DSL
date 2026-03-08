/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import java.util.Collection;

import lu.list.swrdi.formulaKPI.model.formulaKPI.Expression;
import lu.list.swrdi.formulaKPI.model.formulaKPI.WeightedSumOp;
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
 * An implementation of the model object '<em><b>Weighted Sum Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.WeightedSumOpImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.WeightedSumOpImpl#getWeights <em>Weights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeightedSumOpImpl extends MinimalEObjectImpl.Container implements WeightedSumOp {
	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expressions;

	/**
	 * The cached value of the '{@link #getWeights() <em>Weights</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeights()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> weights;

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
	public EList<Expression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<Expression>(Expression.class, this,
					formulaKPIPackage.WEIGHTED_SUM_OP__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getWeights() {
		if (weights == null) {
			weights = new EObjectContainmentEList<Expression>(Expression.class, this,
					formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS);
		}
		return weights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case formulaKPIPackage.WEIGHTED_SUM_OP__EXPRESSIONS:
			return ((InternalEList<?>) getExpressions()).basicRemove(otherEnd, msgs);
		case formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS:
			return ((InternalEList<?>) getWeights()).basicRemove(otherEnd, msgs);
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
		case formulaKPIPackage.WEIGHTED_SUM_OP__EXPRESSIONS:
			return getExpressions();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case formulaKPIPackage.WEIGHTED_SUM_OP__EXPRESSIONS:
			getExpressions().clear();
			getExpressions().addAll((Collection<? extends Expression>) newValue);
			return;
		case formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS:
			getWeights().clear();
			getWeights().addAll((Collection<? extends Expression>) newValue);
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
		case formulaKPIPackage.WEIGHTED_SUM_OP__EXPRESSIONS:
			getExpressions().clear();
			return;
		case formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS:
			getWeights().clear();
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
		case formulaKPIPackage.WEIGHTED_SUM_OP__EXPRESSIONS:
			return expressions != null && !expressions.isEmpty();
		case formulaKPIPackage.WEIGHTED_SUM_OP__WEIGHTS:
			return weights != null && !weights.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WeightedSumOpImpl
