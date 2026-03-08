/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationValue#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getEnumerationValue()
 * @model
 * @generated
 */
public interface EnumerationValue extends ValueType {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link lu.list.swrdi.formulaKPI.model.formulaKPI.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getEnumerationValue_Literals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getLiterals();

} // EnumerationValue
