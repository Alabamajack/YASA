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
import shootingmachineemfmodel.SA_Component;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SA Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.SA_ComponentImpl#getHasPortsSAC <em>Has Ports SAC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SA_ComponentImpl extends ComponentImpl implements SA_Component {
	/**
	 * The cached value of the '{@link #getHasPortsSAC() <em>Has Ports SAC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPortsSAC()
	 * @generated
	 * @ordered
	 */
	protected EList<Ports> hasPortsSAC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SA_ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.SA_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ports> getHasPortsSAC() {
		if (hasPortsSAC == null) {
			hasPortsSAC = new EObjectContainmentEList<Ports>(Ports.class, this, ShootingmachineemfmodelPackage.SA_COMPONENT__HAS_PORTS_SAC);
		}
		return hasPortsSAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.SA_COMPONENT__HAS_PORTS_SAC:
				return ((InternalEList<?>)getHasPortsSAC()).basicRemove(otherEnd, msgs);
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
			case ShootingmachineemfmodelPackage.SA_COMPONENT__HAS_PORTS_SAC:
				return getHasPortsSAC();
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
			case ShootingmachineemfmodelPackage.SA_COMPONENT__HAS_PORTS_SAC:
				getHasPortsSAC().clear();
				getHasPortsSAC().addAll((Collection<? extends Ports>)newValue);
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
			case ShootingmachineemfmodelPackage.SA_COMPONENT__HAS_PORTS_SAC:
				getHasPortsSAC().clear();
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
			case ShootingmachineemfmodelPackage.SA_COMPONENT__HAS_PORTS_SAC:
				return hasPortsSAC != null && !hasPortsSAC.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SA_ComponentImpl
