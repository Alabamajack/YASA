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
 *   <li>{@link shootingmachineemfmodel.Task#isAUTOSTART <em>AUTOSTART</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Task#getPRIORITY <em>PRIORITY</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Task#getACTIVATION <em>ACTIVATION</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>AUTOSTART</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AUTOSTART</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AUTOSTART</em>' attribute.
	 * @see #setAUTOSTART(boolean)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getTask_AUTOSTART()
	 * @model
	 * @generated
	 */
	boolean isAUTOSTART();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.Task#isAUTOSTART <em>AUTOSTART</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AUTOSTART</em>' attribute.
	 * @see #isAUTOSTART()
	 * @generated
	 */
	void setAUTOSTART(boolean value);

	/**
	 * Returns the value of the '<em><b>PRIORITY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRIORITY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRIORITY</em>' attribute.
	 * @see #setPRIORITY(int)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getTask_PRIORITY()
	 * @model
	 * @generated
	 */
	int getPRIORITY();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.Task#getPRIORITY <em>PRIORITY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRIORITY</em>' attribute.
	 * @see #getPRIORITY()
	 * @generated
	 */
	void setPRIORITY(int value);

	/**
	 * Returns the value of the '<em><b>ACTIVATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ACTIVATION</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACTIVATION</em>' attribute.
	 * @see #setACTIVATION(int)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getTask_ACTIVATION()
	 * @model
	 * @generated
	 */
	int getACTIVATION();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.Task#getACTIVATION <em>ACTIVATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACTIVATION</em>' attribute.
	 * @see #getACTIVATION()
	 * @generated
	 */
	void setACTIVATION(int value);

} // Task
