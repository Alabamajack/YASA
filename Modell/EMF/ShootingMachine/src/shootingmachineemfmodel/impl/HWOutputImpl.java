/**
 */
package shootingmachineemfmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import shootingmachineemfmodel.HWOutput;
import shootingmachineemfmodel.OSPortOUT;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.HWOutputImpl#getHas_OSPORTS_OUT <em>Has OSPORTS OUT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HWOutputImpl extends HWPortsImpl implements HWOutput {
	/**
	 * The cached value of the '{@link #getHas_OSPORTS_OUT() <em>Has OSPORTS OUT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_OSPORTS_OUT()
	 * @generated
	 * @ordered
	 */
	protected OSPortOUT has_OSPORTS_OUT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.HW_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSPortOUT getHas_OSPORTS_OUT() {
		if (has_OSPORTS_OUT != null && has_OSPORTS_OUT.eIsProxy()) {
			InternalEObject oldHas_OSPORTS_OUT = (InternalEObject)has_OSPORTS_OUT;
			has_OSPORTS_OUT = (OSPortOUT)eResolveProxy(oldHas_OSPORTS_OUT);
			if (has_OSPORTS_OUT != oldHas_OSPORTS_OUT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShootingmachineemfmodelPackage.HW_OUTPUT__HAS_OSPORTS_OUT, oldHas_OSPORTS_OUT, has_OSPORTS_OUT));
			}
		}
		return has_OSPORTS_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSPortOUT basicGetHas_OSPORTS_OUT() {
		return has_OSPORTS_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_OSPORTS_OUT(OSPortOUT newHas_OSPORTS_OUT) {
		OSPortOUT oldHas_OSPORTS_OUT = has_OSPORTS_OUT;
		has_OSPORTS_OUT = newHas_OSPORTS_OUT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.HW_OUTPUT__HAS_OSPORTS_OUT, oldHas_OSPORTS_OUT, has_OSPORTS_OUT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.HW_OUTPUT__HAS_OSPORTS_OUT:
				if (resolve) return getHas_OSPORTS_OUT();
				return basicGetHas_OSPORTS_OUT();
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
			case ShootingmachineemfmodelPackage.HW_OUTPUT__HAS_OSPORTS_OUT:
				setHas_OSPORTS_OUT((OSPortOUT)newValue);
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
			case ShootingmachineemfmodelPackage.HW_OUTPUT__HAS_OSPORTS_OUT:
				setHas_OSPORTS_OUT((OSPortOUT)null);
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
			case ShootingmachineemfmodelPackage.HW_OUTPUT__HAS_OSPORTS_OUT:
				return has_OSPORTS_OUT != null;
		}
		return super.eIsSet(featureID);
	}

} //HWOutputImpl
