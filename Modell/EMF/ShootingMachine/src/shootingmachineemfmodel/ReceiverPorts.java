/**
 */
package shootingmachineemfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receiver Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.ReceiverPorts#isBlockierend <em>Blockierend</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getReceiverPorts()
 * @model abstract="true"
 * @generated
 */
public interface ReceiverPorts extends Ports {

	/**
	 * Returns the value of the '<em><b>Blockierend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockierend</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockierend</em>' attribute.
	 * @see #setBlockierend(boolean)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getReceiverPorts_Blockierend()
	 * @model
	 * @generated
	 */
	boolean isBlockierend();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.ReceiverPorts#isBlockierend <em>Blockierend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blockierend</em>' attribute.
	 * @see #isBlockierend()
	 * @generated
	 */
	void setBlockierend(boolean value);
} // ReceiverPorts
