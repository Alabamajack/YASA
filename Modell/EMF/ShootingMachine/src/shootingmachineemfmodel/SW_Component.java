/**
 */
package shootingmachineemfmodel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SW Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.SW_Component#getHasPortsSWC <em>Has Ports SWC</em>}</li>
 *   <li>{@link shootingmachineemfmodel.SW_Component#getHasRunnableSWC <em>Has Runnable SWC</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getSW_Component()
 * @model
 * @generated
 */
public interface SW_Component extends Component {
	/**
	 * Returns the value of the '<em><b>Has Ports SWC</b></em>' containment reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Ports}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Ports SWC</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Ports SWC</em>' containment reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getSW_Component_HasPortsSWC()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ports> getHasPortsSWC();

	/**
	 * Returns the value of the '<em><b>Has Runnable SWC</b></em>' containment reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Runnable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Runnable SWC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Runnable SWC</em>' containment reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getSW_Component_HasRunnableSWC()
	 * @model containment="true"
	 * @generated
	 */
	EList<shootingmachineemfmodel.Runnable> getHasRunnableSWC();

} // SW_Component