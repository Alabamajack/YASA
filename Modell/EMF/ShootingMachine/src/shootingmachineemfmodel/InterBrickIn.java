/**
 */
package shootingmachineemfmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Brick In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.InterBrickIn#getHasMessageInterBrickIn <em>Has Message Inter Brick In</em>}</li>
 *   <li>{@link shootingmachineemfmodel.InterBrickIn#getHasBrickInterBrickIn <em>Has Brick Inter Brick In</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickIn()
 * @model
 * @generated
 */
public interface InterBrickIn extends InterBrickCommunication {
	/**
	 * Returns the value of the '<em><b>Has Message Inter Brick In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Message Inter Brick In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Message Inter Brick In</em>' reference.
	 * @see #setHasMessageInterBrickIn(Message)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickIn_HasMessageInterBrickIn()
	 * @model required="true"
	 * @generated
	 */
	Message getHasMessageInterBrickIn();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.InterBrickIn#getHasMessageInterBrickIn <em>Has Message Inter Brick In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Message Inter Brick In</em>' reference.
	 * @see #getHasMessageInterBrickIn()
	 * @generated
	 */
	void setHasMessageInterBrickIn(Message value);

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
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getInterBrickIn_HasBrickInterBrickIn()
	 * @model
	 * @generated
	 */
	Brick getHasBrickInterBrickIn();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.InterBrickIn#getHasBrickInterBrickIn <em>Has Brick Inter Brick In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Brick Inter Brick In</em>' reference.
	 * @see #getHasBrickInterBrickIn()
	 * @generated
	 */
	void setHasBrickInterBrickIn(Brick value);

} // InterBrickIn
