/**
 */
package shootingmachineemfmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import shootingmachineemfmodel.Message;
import shootingmachineemfmodel.Ports;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.PortsImpl#getHasMessagePorts <em>Has Message Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PortsImpl extends StandardclassImpl implements Ports {
	/**
	 * The cached value of the '{@link #getHasMessagePorts() <em>Has Message Ports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMessagePorts()
	 * @generated
	 * @ordered
	 */
	protected Message hasMessagePorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.PORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getHasMessagePorts() {
		if (hasMessagePorts != null && hasMessagePorts.eIsProxy()) {
			InternalEObject oldHasMessagePorts = (InternalEObject)hasMessagePorts;
			hasMessagePorts = (Message)eResolveProxy(oldHasMessagePorts);
			if (hasMessagePorts != oldHasMessagePorts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShootingmachineemfmodelPackage.PORTS__HAS_MESSAGE_PORTS, oldHasMessagePorts, hasMessagePorts));
			}
		}
		return hasMessagePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetHasMessagePorts() {
		return hasMessagePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMessagePorts(Message newHasMessagePorts) {
		Message oldHasMessagePorts = hasMessagePorts;
		hasMessagePorts = newHasMessagePorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.PORTS__HAS_MESSAGE_PORTS, oldHasMessagePorts, hasMessagePorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.PORTS__HAS_MESSAGE_PORTS:
				if (resolve) return getHasMessagePorts();
				return basicGetHasMessagePorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.PORTS__HAS_MESSAGE_PORTS:
				setHasMessagePorts((Message)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.PORTS__HAS_MESSAGE_PORTS:
				setHasMessagePorts((Message)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.PORTS__HAS_MESSAGE_PORTS:
				return hasMessagePorts != null;
		}
		return super.eIsSet(featureID);
	}

} //PortsImpl
