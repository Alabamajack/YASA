/**
 */
package shootingmachineemfmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.Message#getMessageHeader <em>Message Header</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Message#getMyMessage <em>My Message</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Message#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Header</em>' attribute.
	 * @see #setMessageHeader(char)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getMessage_MessageHeader()
	 * @model
	 * @generated
	 */
	char getMessageHeader();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.Message#getMessageHeader <em>Message Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Header</em>' attribute.
	 * @see #getMessageHeader()
	 * @generated
	 */
	void setMessageHeader(char value);

	/**
	 * Returns the value of the '<em><b>My Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Message</em>' attribute.
	 * @see #setMyMessage(String)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getMessage_MyMessage()
	 * @model
	 * @generated
	 */
	String getMyMessage();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.Message#getMyMessage <em>My Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Message</em>' attribute.
	 * @see #getMyMessage()
	 * @generated
	 */
	void setMyMessage(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getMessage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.Message#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Message
