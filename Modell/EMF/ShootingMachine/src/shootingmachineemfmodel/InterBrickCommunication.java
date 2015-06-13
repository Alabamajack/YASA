/**
 */
package shootingmachineemfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Brick Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.InterBrickCommunication#getMessageID <em>Message ID</em>}</li>
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

} // InterBrickCommunication
