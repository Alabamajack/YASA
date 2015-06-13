/**
 */
package shootingmachineemfmodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import shootingmachineemfmodel.Ports;
import shootingmachineemfmodel.SW_Component;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SW Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.SW_ComponentImpl#getHasPortsSWC <em>Has Ports SWC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SW_ComponentImpl extends ComponentImpl implements SW_Component {
	/**
	 * The cached value of the '{@link #getHasPortsSWC() <em>Has Ports SWC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPortsSWC()
	 * @generated
	 * @ordered
	 */
	protected EList<Ports> hasPortsSWC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SW_ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.SW_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ports> getHasPortsSWC() {
		if (hasPortsSWC == null) {
			hasPortsSWC = new EObjectContainmentEList<Ports>(Ports.class, this, ShootingmachineemfmodelPackage.SW_COMPONENT__HAS_PORTS_SWC);
		}
		return hasPortsSWC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.SW_COMPONENT__HAS_PORTS_SWC:
				return ((InternalEList<?>)getHasPortsSWC()).basicRemove(otherEnd, msgs);
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
			case ShootingmachineemfmodelPackage.SW_COMPONENT__HAS_PORTS_SWC:
				return getHasPortsSWC();
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
			case ShootingmachineemfmodelPackage.SW_COMPONENT__HAS_PORTS_SWC:
				getHasPortsSWC().clear();
				getHasPortsSWC().addAll((Collection<? extends Ports>)newValue);
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
			case ShootingmachineemfmodelPackage.SW_COMPONENT__HAS_PORTS_SWC:
				getHasPortsSWC().clear();
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
			case ShootingmachineemfmodelPackage.SW_COMPONENT__HAS_PORTS_SWC:
				return hasPortsSWC != null && !hasPortsSWC.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SW_ComponentImpl
