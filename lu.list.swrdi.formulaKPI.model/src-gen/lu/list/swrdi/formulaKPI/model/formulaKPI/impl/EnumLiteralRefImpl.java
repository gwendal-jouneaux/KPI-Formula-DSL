/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI.impl;

import lu.list.swrdi.formulaKPI.model.formulaKPI.EnumLiteralRef;
import lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationLiteral;
import lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Literal Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.impl.EnumLiteralRefImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumLiteralRefImpl extends MinimalEObjectImpl.Container implements EnumLiteralRef {
	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral literal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumLiteralRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formulaKPIPackage.Literals.ENUM_LITERAL_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getLiteral() {
		if (literal != null && literal.eIsProxy()) {
			InternalEObject oldLiteral = (InternalEObject) literal;
			literal = (EnumerationLiteral) eResolveProxy(oldLiteral);
			if (literal != oldLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							formulaKPIPackage.ENUM_LITERAL_REF__LITERAL, oldLiteral, literal));
			}
		}
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(EnumerationLiteral newLiteral) {
		EnumerationLiteral oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formulaKPIPackage.ENUM_LITERAL_REF__LITERAL,
					oldLiteral, literal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case formulaKPIPackage.ENUM_LITERAL_REF__LITERAL:
			if (resolve)
				return getLiteral();
			return basicGetLiteral();
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
		case formulaKPIPackage.ENUM_LITERAL_REF__LITERAL:
			setLiteral((EnumerationLiteral) newValue);
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
		case formulaKPIPackage.ENUM_LITERAL_REF__LITERAL:
			setLiteral((EnumerationLiteral) null);
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
		case formulaKPIPackage.ENUM_LITERAL_REF__LITERAL:
			return literal != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumLiteralRefImpl
