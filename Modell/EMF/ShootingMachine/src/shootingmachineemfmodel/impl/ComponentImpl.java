/**
 */
package shootingmachineemfmodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import shootingmachineemfmodel.Component;
import shootingmachineemfmodel.HWPorts;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.ComponentImpl#getHasHWPortsComponent <em>Has HW Ports Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentImpl extends StandardclassImpl implements Component {
	/**
	 * The cached value of the '{@link #getHasHWPortsComponent() <em>Has HW Ports Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHWPortsComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPorts> hasHWPortsComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPorts> getHasHWPortsComponent() {
		if (hasHWPortsComponent == null) {
			hasHWPortsComponent = new EObjectResolvingEList<HWPorts>(HWPorts.class, this, ShootingmachineemfmodelPackage.COMPONENT__HAS_HW_PORTS_COMPONENT);
		}
		return hasHWPortsComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.COMPONENT__HAS_HW_PORTS_COMPONENT:
				return getHasHWPortsComponent();
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
			case ShootingmachineemfmodelPackage.COMPONENT__HAS_HW_PORTS_COMPONENT:
				getHasHWPortsComponent().clear();
				getHasHWPortsComponent().addAll((Collection<? extends HWPorts>)newValue);
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
			case ShootingmachineemfmodelPackage.COMPONENT__HAS_HW_PORTS_COMPONENT:
				getHasHWPortsComponent().clear();
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
			case ShootingmachineemfmodelPackage.COMPONENT__HAS_HW_PORTS_COMPONENT:
				return hasHWPortsComponent != null && !hasHWPortsComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
