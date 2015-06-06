/**
 */
package shootingmachineemfmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.Ports#getHasMessagePorts <em>Has Message Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getPorts()
 * @model abstract="true"
 * @generated
 */
public interface Ports extends EObject {

	/**
	 * Returns the value of the '<em><b>Has Message Ports</b></em>' reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Message Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Message Ports</em>' reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getPorts_HasMessagePorts()
	 * @model
	 * @generated
	 */
	EList<Message> getHasMessagePorts();
} // Ports