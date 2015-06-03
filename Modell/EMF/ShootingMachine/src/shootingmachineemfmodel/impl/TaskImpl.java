/**
 */
package shootingmachineemfmodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import shootingmachineemfmodel.Alarm;
import shootingmachineemfmodel.Event;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;
import shootingmachineemfmodel.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.TaskImpl#getHasEvent <em>Has Event</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.TaskImpl#getHasAlarm <em>Has Alarm</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.TaskImpl#getHasRunnable <em>Has Runnable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends StandardclassImpl implements Task {
	/**
	 * The cached value of the '{@link #getHasEvent() <em>Has Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> hasEvent;

	/**
	 * The cached value of the '{@link #getHasAlarm() <em>Has Alarm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAlarm()
	 * @generated
	 * @ordered
	 */
	protected EList<Alarm> hasAlarm;

	/**
	 * The cached value of the '{@link #getHasRunnable() <em>Has Runnable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRunnable()
	 * @generated
	 * @ordered
	 */
	protected EList<shootingmachineemfmodel.Runnable> hasRunnable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getHasEvent() {
		if (hasEvent == null) {
			hasEvent = new EObjectResolvingEList<Event>(Event.class, this, ShootingmachineemfmodelPackage.TASK__HAS_EVENT);
		}
		return hasEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alarm> getHasAlarm() {
		if (hasAlarm == null) {
			hasAlarm = new EObjectResolvingEList<Alarm>(Alarm.class, this, ShootingmachineemfmodelPackage.TASK__HAS_ALARM);
		}
		return hasAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<shootingmachineemfmodel.Runnable> getHasRunnable() {
		if (hasRunnable == null) {
			hasRunnable = new EObjectResolvingEList<shootingmachineemfmodel.Runnable>(shootingmachineemfmodel.Runnable.class, this, ShootingmachineemfmodelPackage.TASK__HAS_RUNNABLE);
		}
		return hasRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.TASK__HAS_EVENT:
				return getHasEvent();
			case ShootingmachineemfmodelPackage.TASK__HAS_ALARM:
				return getHasAlarm();
			case ShootingmachineemfmodelPackage.TASK__HAS_RUNNABLE:
				return getHasRunnable();
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
			case ShootingmachineemfmodelPackage.TASK__HAS_EVENT:
				getHasEvent().clear();
				getHasEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case ShootingmachineemfmodelPackage.TASK__HAS_ALARM:
				getHasAlarm().clear();
				getHasAlarm().addAll((Collection<? extends Alarm>)newValue);
				return;
			case ShootingmachineemfmodelPackage.TASK__HAS_RUNNABLE:
				getHasRunnable().clear();
				getHasRunnable().addAll((Collection<? extends shootingmachineemfmodel.Runnable>)newValue);
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
			case ShootingmachineemfmodelPackage.TASK__HAS_EVENT:
				getHasEvent().clear();
				return;
			case ShootingmachineemfmodelPackage.TASK__HAS_ALARM:
				getHasAlarm().clear();
				return;
			case ShootingmachineemfmodelPackage.TASK__HAS_RUNNABLE:
				getHasRunnable().clear();
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
			case ShootingmachineemfmodelPackage.TASK__HAS_EVENT:
				return hasEvent != null && !hasEvent.isEmpty();
			case ShootingmachineemfmodelPackage.TASK__HAS_ALARM:
				return hasAlarm != null && !hasAlarm.isEmpty();
			case ShootingmachineemfmodelPackage.TASK__HAS_RUNNABLE:
				return hasRunnable != null && !hasRunnable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
