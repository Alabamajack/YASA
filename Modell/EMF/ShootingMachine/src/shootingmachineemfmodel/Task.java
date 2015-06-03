/**
 */
package shootingmachineemfmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.Task#getHasEvent <em>Has Event</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Task#getHasAlarm <em>Has Alarm</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Task#getHasRunnable <em>Has Runnable</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Standardclass {
	/**
	 * Returns the value of the '<em><b>Has Event</b></em>' reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Event</em>' reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getTask_HasEvent()
	 * @model
	 * @generated
	 */
	EList<Event> getHasEvent();

	/**
	 * Returns the value of the '<em><b>Has Alarm</b></em>' reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Alarm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Alarm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Alarm</em>' reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getTask_HasAlarm()
	 * @model
	 * @generated
	 */
	EList<Alarm> getHasAlarm();

	/**
	 * Returns the value of the '<em><b>Has Runnable</b></em>' reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Runnable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Runnable</em>' reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getTask_HasRunnable()
	 * @model required="true"
	 * @generated
	 */
	EList<shootingmachineemfmodel.Runnable> getHasRunnable();

} // Task
