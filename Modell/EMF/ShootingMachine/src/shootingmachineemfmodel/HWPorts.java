/**
 */
package shootingmachineemfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.HWPorts#getPortname <em>Portname</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getHWPorts()
 * @model abstract="true"
 * @generated
 */
public interface HWPorts extends Standardclass {
	/**
	 * Returns the value of the '<em><b>Portname</b></em>' attribute.
	 * The literals are from the enumeration {@link shootingmachineemfmodel.HWPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portname</em>' attribute.
	 * @see shootingmachineemfmodel.HWPort
	 * @see #setPortname(HWPort)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getHWPorts_Portname()
	 * @model
	 * @generated
	 */
	HWPort getPortname();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.HWPorts#getPortname <em>Portname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portname</em>' attribute.
	 * @see shootingmachineemfmodel.HWPort
	 * @see #getPortname()
	 * @generated
	 */
	void setPortname(HWPort value);

} // HWPorts
