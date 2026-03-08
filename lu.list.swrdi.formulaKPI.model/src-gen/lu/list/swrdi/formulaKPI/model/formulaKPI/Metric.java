/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Metric#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getMetric()
 * @model
 * @generated
 */
public interface Metric extends Declarable {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(Provider)
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getMetric_Provider()
	 * @model
	 * @generated
	 */
	Provider getProvider();

	/**
	 * Sets the value of the '{@link lu.list.swrdi.formulaKPI.model.formulaKPI.Metric#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Provider value);

} // Metric
