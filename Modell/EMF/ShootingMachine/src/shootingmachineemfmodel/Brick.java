/**
 */
package shootingmachineemfmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.Brick#getHasTaskBrick <em>Has Task Brick</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Brick#getHasEventBrick <em>Has Event Brick</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Brick#getHasAlarmBrick <em>Has Alarm Brick</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Brick#getHasHWPortsBrick <em>Has HW Ports Brick</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Brick#isIsMaster <em>Is Master</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getBrick()
 * @model
 * @generated
 */
public interface Brick extends Standardclass {
	/**
	 * Returns the value of the '<em><b>Has Task Brick</b></em>' containment reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Task Brick</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Task Brick</em>' containment reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getBrick_HasTaskBrick()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getHasTaskBrick();

	/**
	 * Returns the value of the '<em><b>Has Event Brick</b></em>' containment reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Event Brick</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Event Brick</em>' containment reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getBrick_HasEventBrick()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getHasEventBrick();

	/**
	 * Returns the value of the '<em><b>Has Alarm Brick</b></em>' containment reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Alarm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Alarm Brick</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Alarm Brick</em>' containment reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getBrick_HasAlarmBrick()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alarm> getHasAlarmBrick();

	/**
	 * Returns the value of the '<em><b>Has HW Ports Brick</b></em>' containment reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.HWPorts}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has HW Ports Brick</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has HW Ports Brick</em>' containment reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getBrick_HasHWPortsBrick()
	 * @model containment="true" upper="7"
	 * @generated
	 */
	EList<HWPorts> getHasHWPortsBrick();

	/**
	 * Returns the value of the '<em><b>Is Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Master</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Master</em>' attribute.
	 * @see #setIsMaster(boolean)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getBrick_IsMaster()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsMaster();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.Brick#isIsMaster <em>Is Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Master</em>' attribute.
	 * @see #isIsMaster()
	 * @generated
	 */
	void setIsMaster(boolean value);

} // Brick
