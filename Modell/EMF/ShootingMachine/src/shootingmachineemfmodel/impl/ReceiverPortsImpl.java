/**
 */
package shootingmachineemfmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import shootingmachineemfmodel.ReceiverPorts;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receiver Ports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.ReceiverPortsImpl#isBlockierend <em>Blockierend</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ReceiverPortsImpl extends PortsImpl implements ReceiverPorts {
	/**
	 * The default value of the '{@link #isBlockierend() <em>Blockierend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlockierend()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOCKIEREND_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isBlockierend() <em>Blockierend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlockierend()
	 * @generated
	 * @ordered
	 */
	protected boolean blockierend = BLOCKIEREND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiverPortsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.RECEIVER_PORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlockierend() {
		return blockierend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockierend(boolean newBlockierend) {
		boolean oldBlockierend = blockierend;
		blockierend = newBlockierend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.RECEIVER_PORTS__BLOCKIEREND, oldBlockierend, blockierend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.RECEIVER_PORTS__BLOCKIEREND:
				return isBlockierend();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.RECEIVER_PORTS__BLOCKIEREND:
				setBlockierend((Boolean)newValue);
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
			case ShootingmachineemfmodelPackage.RECEIVER_PORTS__BLOCKIEREND:
				setBlockierend(BLOCKIEREND_EDEFAULT);
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
			case ShootingmachineemfmodelPackage.RECEIVER_PORTS__BLOCKIEREND:
				return blockierend != BLOCKIEREND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (blockierend: ");
		result.append(blockierend);
		result.append(')');
		return result.toString();
	}

} //ReceiverPortsImpl
