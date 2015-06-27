/**
 */
package shootingmachineemfmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import shootingmachineemfmodel.HWInput;
import shootingmachineemfmodel.OSPortIN;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.HWInputImpl#getHas_OSPORTS_IN <em>Has OSPORTS IN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HWInputImpl extends HWPortsImpl implements HWInput {
	/**
	 * The cached value of the '{@link #getHas_OSPORTS_IN() <em>Has OSPORTS IN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_OSPORTS_IN()
	 * @generated
	 * @ordered
	 */
	protected OSPortIN has_OSPORTS_IN;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.HW_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSPortIN getHas_OSPORTS_IN() {
		if (has_OSPORTS_IN != null && has_OSPORTS_IN.eIsProxy()) {
			InternalEObject oldHas_OSPORTS_IN = (InternalEObject)has_OSPORTS_IN;
			has_OSPORTS_IN = (OSPortIN)eResolveProxy(oldHas_OSPORTS_IN);
			if (has_OSPORTS_IN != oldHas_OSPORTS_IN) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShootingmachineemfmodelPackage.HW_INPUT__HAS_OSPORTS_IN, oldHas_OSPORTS_IN, has_OSPORTS_IN));
			}
		}
		return has_OSPORTS_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSPortIN basicGetHas_OSPORTS_IN() {
		return has_OSPORTS_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_OSPORTS_IN(OSPortIN newHas_OSPORTS_IN) {
		OSPortIN oldHas_OSPORTS_IN = has_OSPORTS_IN;
		has_OSPORTS_IN = newHas_OSPORTS_IN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.HW_INPUT__HAS_OSPORTS_IN, oldHas_OSPORTS_IN, has_OSPORTS_IN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.HW_INPUT__HAS_OSPORTS_IN:
				if (resolve) return getHas_OSPORTS_IN();
				return basicGetHas_OSPORTS_IN();
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
			case ShootingmachineemfmodelPackage.HW_INPUT__HAS_OSPORTS_IN:
				setHas_OSPORTS_IN((OSPortIN)newValue);
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
			case ShootingmachineemfmodelPackage.HW_INPUT__HAS_OSPORTS_IN:
				setHas_OSPORTS_IN((OSPortIN)null);
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
			case ShootingmachineemfmodelPackage.HW_INPUT__HAS_OSPORTS_IN:
				return has_OSPORTS_IN != null;
		}
		return super.eIsSet(featureID);
	}

} //HWInputImpl
