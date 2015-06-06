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
 *   <li>{@link shootingmachineemfmodel.InterBrickCommunication#getHasBrickInterBrickCommunication <em>Has Brick Inter Brick Communication</em>}</li>
 *   <li>{@link shootingmachineemfmodel.InterBrickCommunication#getHasMessageInterBrickCommunication <em>Has Message Inter Brick Communication</em>}</li>
 *   <li>{@link shootingmachineemfmodel.InterBrickCommunication#getMessageID <em>Message ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickCommunication()
 * @model
 * @generated
 */
public interface InterBrickCommunication extends Standardclass {
	/**
	 * Returns the value of the '<em><b>Has Brick Inter Brick Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Brick Inter Brick Communication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Brick Inter Brick Communication</em>' reference.
	 * @see #setHasBrickInterBrickCommunication(Brick)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickCommunication_HasBrickInterBrickCommunication()
	 * @model required="true"
	 * @generated
	 */
	Brick getHasBrickInterBrickCommunication();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.InterBrickCommunication#getHasBrickInterBrickCommunication <em>Has Brick Inter Brick Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Brick Inter Brick Communication</em>' reference.
	 * @see #getHasBrickInterBrickCommunication()
	 * @generated
	 */
	void setHasBrickInterBrickCommunication(Brick value);

	/**
	 * Returns the value of the '<em><b>Has Message Inter Brick Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Message Inter Brick Communication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Message Inter Brick Communication</em>' containment reference.
	 * @see #setHasMessageInterBrickCommunication(Message)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickCommunication_HasMessageInterBrickCommunication()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Message getHasMessageInterBrickCommunication();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.InterBrickCommunication#getHasMessageInterBrickCommunication <em>Has Message Inter Brick Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Message Inter Brick Communication</em>' containment reference.
	 * @see #getHasMessageInterBrickCommunication()
	 * @generated
	 */
	void setHasMessageInterBrickCommunication(Message value);

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
