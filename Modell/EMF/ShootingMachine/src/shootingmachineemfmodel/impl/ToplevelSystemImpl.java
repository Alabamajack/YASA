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

import shootingmachineemfmodel.Brick;
import shootingmachineemfmodel.Component;
import shootingmachineemfmodel.Connections;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;
import shootingmachineemfmodel.ToplevelSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toplevel System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.ToplevelSystemImpl#getHasComponent <em>Has Component</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.ToplevelSystemImpl#getHasBrick <em>Has Brick</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.ToplevelSystemImpl#getHasConnections <em>Has Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ToplevelSystemImpl extends StandardclassImpl implements ToplevelSystem {
	/**
	 * The cached value of the '{@link #getHasComponent() <em>Has Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> hasComponent;

	/**
	 * The cached value of the '{@link #getHasBrick() <em>Has Brick</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBrick()
	 * @generated
	 * @ordered
	 */
	protected EList<Brick> hasBrick;

	/**
	 * The cached value of the '{@link #getHasConnections() <em>Has Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connections> hasConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToplevelSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.TOPLEVEL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getHasComponent() {
		if (hasComponent == null) {
			hasComponent = new EObjectContainmentEList<Component>(Component.class, this, ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_COMPONENT);
		}
		return hasComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Brick> getHasBrick() {
		if (hasBrick == null) {
			hasBrick = new EObjectContainmentEList<Brick>(Brick.class, this, ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_BRICK);
		}
		return hasBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connections> getHasConnections() {
		if (hasConnections == null) {
			hasConnections = new EObjectContainmentEList<Connections>(Connections.class, this, ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_CONNECTIONS);
		}
		return hasConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_COMPONENT:
				return ((InternalEList<?>)getHasComponent()).basicRemove(otherEnd, msgs);
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_BRICK:
				return ((InternalEList<?>)getHasBrick()).basicRemove(otherEnd, msgs);
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_CONNECTIONS:
				return ((InternalEList<?>)getHasConnections()).basicRemove(otherEnd, msgs);
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
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_COMPONENT:
				return getHasComponent();
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_BRICK:
				return getHasBrick();
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_CONNECTIONS:
				return getHasConnections();
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
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_COMPONENT:
				getHasComponent().clear();
				getHasComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_BRICK:
				getHasBrick().clear();
				getHasBrick().addAll((Collection<? extends Brick>)newValue);
				return;
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_CONNECTIONS:
				getHasConnections().clear();
				getHasConnections().addAll((Collection<? extends Connections>)newValue);
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
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_COMPONENT:
				getHasComponent().clear();
				return;
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_BRICK:
				getHasBrick().clear();
				return;
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_CONNECTIONS:
				getHasConnections().clear();
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
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_COMPONENT:
				return hasComponent != null && !hasComponent.isEmpty();
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_BRICK:
				return hasBrick != null && !hasBrick.isEmpty();
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM__HAS_CONNECTIONS:
				return hasConnections != null && !hasConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ToplevelSystemImpl
