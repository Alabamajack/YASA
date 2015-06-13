/**
 */
package shootingmachineemfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Brick Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.InterBrickOut#getHasMessageInterBrickOut <em>Has Message Inter Brick Out</em>}</li>
 *   <li>{@link shootingmachineemfmodel.InterBrickOut#getHasBrickInterBrickIn <em>Has Brick Inter Brick In</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickOut()
 * @model
 * @generated
 */
public interface InterBrickOut extends InterBrickCommunication {
	/**
	 * Returns the value of the '<em><b>Has Message Inter Brick Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Message Inter Brick Out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Message Inter Brick Out</em>' containment reference.
	 * @see #setHasMessageInterBrickOut(Message)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickOut_HasMessageInterBrickOut()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Message getHasMessageInterBrickOut();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.InterBrickOut#getHasMessageInterBrickOut <em>Has Message Inter Brick Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Message Inter Brick Out</em>' containment reference.
	 * @see #getHasMessageInterBrickOut()
	 * @generated
	 */
	void setHasMessageInterBrickOut(Message value);

	/**
	 * Returns the value of the '<em><b>Has Brick Inter Brick In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Brick Inter Brick In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Brick Inter Brick In</em>' reference.
	 * @see #setHasBrickInterBrickIn(Brick)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickOut_HasBrickInterBrickIn()
	 * @model
	 * @generated
	 */
	Brick getHasBrickInterBrickIn();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.InterBrickOut#getHasBrickInterBrickIn <em>Has Brick Inter Brick In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Brick Inter Brick In</em>' reference.
	 * @see #getHasBrickInterBrickIn()
	 * @generated
	 */
	void setHasBrickInterBrickIn(Brick value);

} // InterBrickOut
