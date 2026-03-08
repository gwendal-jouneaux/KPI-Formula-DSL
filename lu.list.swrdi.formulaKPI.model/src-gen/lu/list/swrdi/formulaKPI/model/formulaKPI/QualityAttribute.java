/**
 */
package lu.list.swrdi.formulaKPI.model.formulaKPI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.list.swrdi.formulaKPI.model.formulaKPI.QualityAttribute#getMetrics <em>Metrics</em>}</li>
 * </ul>
 *
 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getQualityAttribute()
 * @model
 * @generated
 */
public interface QualityAttribute extends Computable {
	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' reference list.
	 * The list contents are of type {@link lu.list.swrdi.formulaKPI.model.formulaKPI.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' reference list.
	 * @see lu.list.swrdi.formulaKPI.model.formulaKPI.formulaKPIPackage#getQualityAttribute_Metrics()
	 * @model
	 * @generated
	 */
	EList<Metric> getMetrics();

} // QualityAttribute
