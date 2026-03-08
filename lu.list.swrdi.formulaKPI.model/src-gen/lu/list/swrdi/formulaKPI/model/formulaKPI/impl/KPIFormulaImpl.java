/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import java.util.Collection;

import lu.list.swrdi.formulaKPI.model.formulaKPI.Computation;
import lu.list.swrdi.formulaKPI.model.formulaKPI.Declaration;
import lu.list.swrdi.formulaKPI.model.formulaKPI.KPIFormula;
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
 * An implementation of the model object '<em><b>KPI Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.KPIFormulaImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.KPIFormulaImpl#getComputations <em>Computations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KPIFormulaImpl extends MinimalEObjectImpl.Container implements KPIFormula {
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declarations;

	/**
	 * The cached value of the '{@link #getComputations() <em>Computations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputations()
	 * @generated
	 * @ordered
	 */
	protected EList<Computation> computations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KPIFormulaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formulaKPIPackage.Literals.KPI_FORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Declaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<Declaration>(Declaration.class, this,
					formulaKPIPackage.KPI_FORMULA__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Computation> getComputations() {
		if (computations == null) {
			computations = new EObjectContainmentEList<Computation>(Computation.class, this,
					formulaKPIPackage.KPI_FORMULA__COMPUTATIONS);
		}
		return computations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case formulaKPIPackage.KPI_FORMULA__DECLARATIONS:
			return ((InternalEList<?>) getDeclarations()).basicRemove(otherEnd, msgs);
		case formulaKPIPackage.KPI_FORMULA__COMPUTATIONS:
			return ((InternalEList<?>) getComputations()).basicRemove(otherEnd, msgs);
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
		case formulaKPIPackage.KPI_FORMULA__DECLARATIONS:
			return getDeclarations();
		case formulaKPIPackage.KPI_FORMULA__COMPUTATIONS:
			return getComputations();
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
		case formulaKPIPackage.KPI_FORMULA__DECLARATIONS:
			getDeclarations().clear();
			getDeclarations().addAll((Collection<? extends Declaration>) newValue);
			return;
		case formulaKPIPackage.KPI_FORMULA__COMPUTATIONS:
			getComputations().clear();
			getComputations().addAll((Collection<? extends Computation>) newValue);
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
		case formulaKPIPackage.KPI_FORMULA__DECLARATIONS:
			getDeclarations().clear();
			return;
		case formulaKPIPackage.KPI_FORMULA__COMPUTATIONS:
			getComputations().clear();
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
		case formulaKPIPackage.KPI_FORMULA__DECLARATIONS:
			return declarations != null && !declarations.isEmpty();
		case formulaKPIPackage.KPI_FORMULA__COMPUTATIONS:
			return computations != null && !computations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KPIFormulaImpl
