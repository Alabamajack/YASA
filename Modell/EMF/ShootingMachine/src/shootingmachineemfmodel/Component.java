/**
 */
package shootingmachineemfmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.Component#getHasHWPortsComponent <em>Has HW Ports Component</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Component#getHasRunnable <em>Has Runnable</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends Standardclass {
	/**
	 * Returns the value of the '<em><b>Has HW Ports Component</b></em>' reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.HWPorts}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has HW Ports Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has HW Ports Component</em>' reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getComponent_HasHWPortsComponent()
	 * @model
	 * @generated
	 */
	EList<HWPorts> getHasHWPortsComponent();

	/**
	 * Returns the value of the '<em><b>Has Runnable</b></em>' containment reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Runnable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Runnable</em>' containment reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getComponent_HasRunnable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<shootingmachineemfmodel.Runnable> getHasRunnable();

} // Component
