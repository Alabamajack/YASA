/**
 */
package shootingmachineemfmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import shootingmachineemfmodel.Ports;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.RunnableImpl#getApplicationcode <em>Applicationcode</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.RunnableImpl#getHasSWPorts <em>Has SW Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunnableImpl extends StandardclassImpl implements shootingmachineemfmodel.Runnable {
	/**
	 * The default value of the '{@link #getApplicationcode() <em>Applicationcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationcode()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATIONCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationcode() <em>Applicationcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationcode()
	 * @generated
	 * @ordered
	 */
	protected String applicationcode = APPLICATIONCODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasSWPorts() <em>Has SW Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSWPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Ports> hasSWPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.RUNNABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationcode() {
		return applicationcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationcode(String newApplicationcode) {
		String oldApplicationcode = applicationcode;
		applicationcode = newApplicationcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.RUNNABLE__APPLICATIONCODE, oldApplicationcode, applicationcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ports> getHasSWPorts() {
		if (hasSWPorts == null) {
			hasSWPorts = new EObjectContainmentEList<Ports>(Ports.class, this, ShootingmachineemfmodelPackage.RUNNABLE__HAS_SW_PORTS);
		}
		return hasSWPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.RUNNABLE__HAS_SW_PORTS:
				return ((InternalEList<?>)getHasSWPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.RUNNABLE__APPLICATIONCODE:
				return getApplicationcode();
			case ShootingmachineemfmodelPackage.RUNNABLE__HAS_SW_PORTS:
				return getHasSWPorts();
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
			case ShootingmachineemfmodelPackage.RUNNABLE__APPLICATIONCODE:
				setApplicationcode((String)newValue);
				return;
			case ShootingmachineemfmodelPackage.RUNNABLE__HAS_SW_PORTS:
				getHasSWPorts().clear();
				getHasSWPorts().addAll((Collection<? extends Ports>)newValue);
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
			case ShootingmachineemfmodelPackage.RUNNABLE__APPLICATIONCODE:
				setApplicationcode(APPLICATIONCODE_EDEFAULT);
				return;
			case ShootingmachineemfmodelPackage.RUNNABLE__HAS_SW_PORTS:
				getHasSWPorts().clear();
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
			case ShootingmachineemfmodelPackage.RUNNABLE__APPLICATIONCODE:
				return APPLICATIONCODE_EDEFAULT == null ? applicationcode != null : !APPLICATIONCODE_EDEFAULT.equals(applicationcode);
			case ShootingmachineemfmodelPackage.RUNNABLE__HAS_SW_PORTS:
				return hasSWPorts != null && !hasSWPorts.isEmpty();
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
		result.append(" (applicationcode: ");
		result.append(applicationcode);
		result.append(')');
		return result.toString();
	}

} //RunnableImpl
