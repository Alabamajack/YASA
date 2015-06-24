/**
 */
package shootingmachineemfmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runnable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.Runnable#getApplicationcode <em>Applicationcode</em>}</li>
 *   <li>{@link shootingmachineemfmodel.Runnable#getHasSWPorts <em>Has SW Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getRunnable()
 * @model
 * @generated
 */
public interface Runnable extends Standardclass {
	/**
	 * Returns the value of the '<em><b>Applicationcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicationcode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicationcode</em>' attribute.
	 * @see #setApplicationcode(String)
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getRunnable_Applicationcode()
	 * @model
	 * @generated
	 */
	String getApplicationcode();

	/**
	 * Sets the value of the '{@link shootingmachineemfmodel.Runnable#getApplicationcode <em>Applicationcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicationcode</em>' attribute.
	 * @see #getApplicationcode()
	 * @generated
	 */
	void setApplicationcode(String value);

	/**
	 * Returns the value of the '<em><b>Has SW Ports</b></em>' containment reference list.
	 * The list contents are of type {@link shootingmachineemfmodel.Ports}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has SW Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has SW Ports</em>' containment reference list.
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#getRunnable_HasSWPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ports> getHasSWPorts();

} // Runnable
