/**
 */
package shootingmachineemfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.Ports#getHasMessagePorts <em>Has Message Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getPorts()
 * @model abstract="true"
 * @generated
 */
public interface Ports extends Standardclass {

	/**
	 * Returns the value of the '<em><b>Has Message Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Message Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Message Ports</em>' reference.
	 * @see #setHasMessagePorts(Message)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getPorts_HasMessagePorts()
	 * @model required="true"
	 * @generated
	 */
	Message getHasMessagePorts();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.Ports#getHasMessagePorts <em>Has Message Ports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Message Ports</em>' reference.
	 * @see #getHasMessagePorts()
	 * @generated
	 */
	void setHasMessagePorts(Message value);
} // Ports
