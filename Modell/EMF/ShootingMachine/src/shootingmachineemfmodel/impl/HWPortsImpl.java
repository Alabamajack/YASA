/**
 */
package shootingmachineemfmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import shootingmachineemfmodel.HWPort;
import shootingmachineemfmodel.HWPorts;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Ports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.HWPortsImpl#getPortname <em>Portname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HWPortsImpl extends StandardclassImpl implements HWPorts {
	/**
	 * The default value of the '{@link #getPortname() <em>Portname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortname()
	 * @generated
	 * @ordered
	 */
	protected static final HWPort PORTNAME_EDEFAULT = HWPort.NXT_PORT_S1;

	/**
	 * The cached value of the '{@link #getPortname() <em>Portname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortname()
	 * @generated
	 * @ordered
	 */
	protected HWPort portname = PORTNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWPortsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.HW_PORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWPort getPortname() {
		return portname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortname(HWPort newPortname) {
		HWPort oldPortname = portname;
		portname = newPortname == null ? PORTNAME_EDEFAULT : newPortname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.HW_PORTS__PORTNAME, oldPortname, portname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.HW_PORTS__PORTNAME:
				return getPortname();
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
			case ShootingmachineemfmodelPackage.HW_PORTS__PORTNAME:
				setPortname((HWPort)newValue);
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
			case ShootingmachineemfmodelPackage.HW_PORTS__PORTNAME:
				setPortname(PORTNAME_EDEFAULT);
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
			case ShootingmachineemfmodelPackage.HW_PORTS__PORTNAME:
				return portname != PORTNAME_EDEFAULT;
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
		result.append(" (Portname: ");
		result.append(portname);
		result.append(')');
		return result.toString();
	}

} //HWPortsImpl
