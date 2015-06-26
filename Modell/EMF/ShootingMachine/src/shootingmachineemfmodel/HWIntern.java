/**
 */
package shootingmachineemfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Intern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.HWIntern#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getHWIntern()
 * @model
 * @generated
 */
public interface HWIntern extends HWInput {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link shootingmachineemfmodel.HWType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see shootingmachineemfmodel.HWType
	 * @see #setType(HWType)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getHWIntern_Type()
	 * @model extendedMetaData="kind='attribute'"
	 * @generated
	 */
	HWType getType();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.HWIntern#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see shootingmachineemfmodel.HWType
	 * @see #getType()
	 * @generated
	 */
	void setType(HWType value);
} // HWIntern
