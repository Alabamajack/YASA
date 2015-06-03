/**
 */
package shootingmachineemfmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import shootingmachineemfmodel.HWExtern;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Extern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.HWExternImpl#getPortnumber <em>Portnumber</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWExternImpl extends HWInputImpl implements HWExtern {
	/**
	 * The default value of the '{@link #getPortnumber() <em>Portnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortnumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PORTNUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPortnumber() <em>Portnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortnumber()
	 * @generated
	 * @ordered
	 */
	protected int portnumber = PORTNUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWExternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.HW_EXTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortnumber() {
		return portnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortnumber(int newPortnumber) {
		int oldPortnumber = portnumber;
		portnumber = newPortnumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.HW_EXTERN__PORTNUMBER, oldPortnumber, portnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.HW_EXTERN__PORTNUMBER:
				return getPortnumber();
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
			case ShootingmachineemfmodelPackage.HW_EXTERN__PORTNUMBER:
				setPortnumber((Integer)newValue);
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
			case ShootingmachineemfmodelPackage.HW_EXTERN__PORTNUMBER:
				setPortnumber(PORTNUMBER_EDEFAULT);
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
			case ShootingmachineemfmodelPackage.HW_EXTERN__PORTNUMBER:
				return portnumber != PORTNUMBER_EDEFAULT;
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
		result.append(" (Portnumber: ");
		result.append(portnumber);
		result.append(')');
		return result.toString();
	}

} //HWExternImpl
