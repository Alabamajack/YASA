/**
 */
package shootingmachineemfmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.Connections#getHasReceiverPorts <em>Has Receiver Ports</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Connections#getHasSenderPorts <em>Has Sender Ports</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Connections#getHasInterBrickCommunicationSystem <em>Has Inter Brick Communication System</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Connections#getHasMessage <em>Has Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getConnections()
 * @model
 * @generated
 */
public interface Connections extends Standardclass {
	/**
	 * Returns the value of the '<em><b>Has Receiver Ports</b></em>' reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.ReceiverPorts}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Receiver Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Receiver Ports</em>' reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getConnections_HasReceiverPorts()
	 * @model required="true"
	 * @generated
	 */
	EList<ReceiverPorts> getHasReceiverPorts();

	/**
	 * Returns the value of the '<em><b>Has Sender Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Sender Ports</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Sender Ports</em>' reference.
	 * @see #setHasSenderPorts(SenderPorts)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getConnections_HasSenderPorts()
	 * @model required="true"
	 * @generated
	 */
	SenderPorts getHasSenderPorts();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.Connections#getHasSenderPorts <em>Has Sender Ports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Sender Ports</em>' reference.
	 * @see #getHasSenderPorts()
	 * @generated
	 */
	void setHasSenderPorts(SenderPorts value);

	/**
	 * Returns the value of the '<em><b>Has Inter Brick Communication System</b></em>' containment reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.InterBrickCommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Inter Brick Communication System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Inter Brick Communication System</em>' containment reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getConnections_HasInterBrickCommunicationSystem()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<InterBrickCommunication> getHasInterBrickCommunicationSystem();

	/**
	 * Returns the value of the '<em><b>Has Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Message</em>' containment reference.
	 * @see #setHasMessage(Message)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getConnections_HasMessage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Message getHasMessage();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.Connections#getHasMessage <em>Has Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Message</em>' containment reference.
	 * @see #getHasMessage()
	 * @generated
	 */
	void setHasMessage(Message value);

} // Connections
