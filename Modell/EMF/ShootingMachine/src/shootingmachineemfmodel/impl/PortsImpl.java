/**
 */
package shootingmachineemfmodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
public abstract class PortsImpl extends MinimalEObjectImpl.Container implements Ports {
	/**
	 * The cached value of the '{@link #getHasMessagePorts() <em>Has Message Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMessagePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> hasMessagePorts;

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
	public EList<Message> getHasMessagePorts() {
		if (hasMessagePorts == null) {
			hasMessagePorts = new EObjectResolvingEList<Message>(Message.class, this, ShootingmachineemfmodelPackage.PORTS__HAS_MESSAGE_PORTS);
		}
		return hasMessagePorts;
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
				return getHasMessagePorts();
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
				getHasMessagePorts().clear();
				getHasMessagePorts().addAll((Collection<? extends Message>)newValue);
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
				getHasMessagePorts().clear();
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
				return hasMessagePorts != null && !hasMessagePorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PortsImpl
