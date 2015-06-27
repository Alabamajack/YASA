/**
 */
package shootingmachineemfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.HWInput#getHas_OSPORTS_IN <em>Has OSPORTS IN</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getHWInput()
 * @model abstract="true"
 * @generated
 */
public interface HWInput extends HWPorts {

	/**
	 * Returns the value of the '<em><b>Has OSPORTS IN</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has OSPORTS IN</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has OSPORTS IN</em>' reference.
	 * @see #setHas_OSPORTS_IN(OSPortIN)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getHWInput_Has_OSPORTS_IN()
	 * @model
	 * @generated
	 */
	OSPortIN getHas_OSPORTS_IN();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.HWInput#getHas_OSPORTS_IN <em>Has OSPORTS IN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has OSPORTS IN</em>' reference.
	 * @see #getHas_OSPORTS_IN()
	 * @generated
	 */
	void setHas_OSPORTS_IN(OSPortIN value);
} // HWInput
