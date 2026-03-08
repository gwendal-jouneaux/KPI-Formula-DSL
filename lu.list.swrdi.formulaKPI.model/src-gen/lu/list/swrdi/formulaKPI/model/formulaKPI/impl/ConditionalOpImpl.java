/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import java.util.Collection;

import lu.list.swrdi.formulaKPI.model.formulaKPI.ConditionalOp;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Expression;
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
 * An implementation of the model object '<em><b>Conditional Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ConditionalOpImpl#getResults <em>Results</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.ConditionalOpImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalOpImpl extends MinimalEObjectImpl.Container implements ConditionalOp {
	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> results;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formulaKPIPackage.Literals.CONDITIONAL_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<Expression>(Expression.class, this,
					formulaKPIPackage.CONDITIONAL_OP__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Expression>(Expression.class, this,
					formulaKPIPackage.CONDITIONAL_OP__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case formulaKPIPackage.CONDITIONAL_OP__RESULTS:
			return ((InternalEList<?>) getResults()).basicRemove(otherEnd, msgs);
		case formulaKPIPackage.CONDITIONAL_OP__CONDITIONS:
			return ((InternalEList<?>) getConditions()).basicRemove(otherEnd, msgs);
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
		case formulaKPIPackage.CONDITIONAL_OP__RESULTS:
			return getResults();
		case formulaKPIPackage.CONDITIONAL_OP__CONDITIONS:
			return getConditions();
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
		case formulaKPIPackage.CONDITIONAL_OP__RESULTS:
			getResults().clear();
			getResults().addAll((Collection<? extends Expression>) newValue);
			return;
		case formulaKPIPackage.CONDITIONAL_OP__CONDITIONS:
			getConditions().clear();
			getConditions().addAll((Collection<? extends Expression>) newValue);
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
		case formulaKPIPackage.CONDITIONAL_OP__RESULTS:
			getResults().clear();
			return;
		case formulaKPIPackage.CONDITIONAL_OP__CONDITIONS:
			getConditions().clear();
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
		case formulaKPIPackage.CONDITIONAL_OP__RESULTS:
			return results != null && !results.isEmpty();
		case formulaKPIPackage.CONDITIONAL_OP__CONDITIONS:
			return conditions != null && !conditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionalOpImpl
