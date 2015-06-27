/**
 */
package shootingmachineemfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.HWOutput#getHas_OSPORTS_OUT <em>Has OSPORTS OUT</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getHWOutput()
 * @model abstract="true"
 * @generated
 */
public interface HWOutput extends HWPorts {

	/**
	 * Returns the value of the '<em><b>Has OSPORTS OUT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has OSPORTS OUT</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has OSPORTS OUT</em>' reference.
	 * @see #setHas_OSPORTS_OUT(OSPortOUT)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getHWOutput_Has_OSPORTS_OUT()
	 * @model
	 * @generated
	 */
	OSPortOUT getHas_OSPORTS_OUT();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.HWOutput#getHas_OSPORTS_OUT <em>Has OSPORTS OUT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has OSPORTS OUT</em>' reference.
	 * @see #getHas_OSPORTS_OUT()
	 * @generated
	 */
	void setHas_OSPORTS_OUT(OSPortOUT value);
} // HWOutput
