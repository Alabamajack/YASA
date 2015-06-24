/**
 */
package shootingmachineemfmodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Brick Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.InterBrickCommunication#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link shootingmachineemfmodel.InterBrickCommunication#getHasIBCOut <em>Has IBC Out</em>}</li>
 *   <li>{@link shootingmachineemfmodel.InterBrickCommunication#getHasIBCIn <em>Has IBC In</em>}</li>
 *   <li>{@link shootingmachineemfmodel.InterBrickCommunication#getHasReceiverPort <em>Has Receiver Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickCommunication()
 * @model abstract="true"
 * @generated
 */
public interface InterBrickCommunication extends Standardclass {
	/**
	 * Returns the value of the '<em><b>Message ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message ID</em>' attribute.
	 * @see #setMessageID(int)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickCommunication_MessageID()
	 * @model
	 * @generated
	 */
	int getMessageID();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.InterBrickCommunication#getMessageID <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message ID</em>' attribute.
	 * @see #getMessageID()
	 * @generated
	 */
	void setMessageID(int value);

	/**
	 * Returns the value of the '<em><b>Has IBC Out</b></em>' reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Brick}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has IBC Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has IBC Out</em>' reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickCommunication_HasIBCOut()
	 * @model
	 * @generated
	 */
	EList<Brick> getHasIBCOut();

	/**
	 * Returns the value of the '<em><b>Has IBC In</b></em>' reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Brick}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has IBC In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has IBC In</em>' reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickCommunication_HasIBCIn()
	 * @model
	 * @generated
	 */
	EList<Brick> getHasIBCIn();

	/**
	 * Returns the value of the '<em><b>Has Receiver Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Receiver Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Receiver Port</em>' reference.
	 * @see #setHasReceiverPort(ReceiverPorts)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickCommunication_HasReceiverPort()
	 * @model required="true"
	 * @generated
	 */
	ReceiverPorts getHasReceiverPort();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.InterBrickCommunication#getHasReceiverPort <em>Has Receiver Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Receiver Port</em>' reference.
	 * @see #getHasReceiverPort()
	 * @generated
	 */
	void setHasReceiverPort(ReceiverPorts value);

} // InterBrickCommunication
