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

import shootingmachineemfmodel.Alarm;
import shootingmachineemfmodel.Brick;
import shootingmachineemfmodel.Event;
import shootingmachineemfmodel.HWPorts;
import shootingmachineemfmodel.InterBrickIn;
import shootingmachineemfmodel.InterBrickOut;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;
import shootingmachineemfmodel.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Brick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.BrickImpl#getHasTaskBrick <em>Has Task Brick</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.BrickImpl#getHasEventBrick <em>Has Event Brick</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.BrickImpl#getHasAlarmBrick <em>Has Alarm Brick</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.BrickImpl#getHasHWPortsBrick <em>Has HW Ports Brick</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.BrickImpl#getHasInterBrickInBrick <em>Has Inter Brick In Brick</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.BrickImpl#getHasInterBrickOutBrick <em>Has Inter Brick Out Brick</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BrickImpl extends StandardclassImpl implements Brick {
	/**
	 * The cached value of the '{@link #getHasTaskBrick() <em>Has Task Brick</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTaskBrick()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> hasTaskBrick;

	/**
	 * The cached value of the '{@link #getHasEventBrick() <em>Has Event Brick</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEventBrick()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> hasEventBrick;

	/**
	 * The cached value of the '{@link #getHasAlarmBrick() <em>Has Alarm Brick</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAlarmBrick()
	 * @generated
	 * @ordered
	 */
	protected EList<Alarm> hasAlarmBrick;

	/**
	 * The cached value of the '{@link #getHasHWPortsBrick() <em>Has HW Ports Brick</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHWPortsBrick()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPorts> hasHWPortsBrick;

	/**
	 * The cached value of the '{@link #getHasInterBrickInBrick() <em>Has Inter Brick In Brick</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInterBrickInBrick()
	 * @generated
	 * @ordered
	 */
	protected InterBrickIn hasInterBrickInBrick;

	/**
	 * The cached value of the '{@link #getHasInterBrickOutBrick() <em>Has Inter Brick Out Brick</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInterBrickOutBrick()
	 * @generated
	 * @ordered
	 */
	protected InterBrickOut hasInterBrickOutBrick;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrickImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.BRICK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getHasTaskBrick() {
		if (hasTaskBrick == null) {
			hasTaskBrick = new EObjectContainmentEList<Task>(Task.class, this, ShootingmachineemfmodelPackage.BRICK__HAS_TASK_BRICK);
		}
		return hasTaskBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getHasEventBrick() {
		if (hasEventBrick == null) {
			hasEventBrick = new EObjectContainmentEList<Event>(Event.class, this, ShootingmachineemfmodelPackage.BRICK__HAS_EVENT_BRICK);
		}
		return hasEventBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alarm> getHasAlarmBrick() {
		if (hasAlarmBrick == null) {
			hasAlarmBrick = new EObjectContainmentEList<Alarm>(Alarm.class, this, ShootingmachineemfmodelPackage.BRICK__HAS_ALARM_BRICK);
		}
		return hasAlarmBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPorts> getHasHWPortsBrick() {
		if (hasHWPortsBrick == null) {
			hasHWPortsBrick = new EObjectContainmentEList<HWPorts>(HWPorts.class, this, ShootingmachineemfmodelPackage.BRICK__HAS_HW_PORTS_BRICK);
		}
		return hasHWPortsBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterBrickIn getHasInterBrickInBrick() {
		if (hasInterBrickInBrick != null && hasInterBrickInBrick.eIsProxy()) {
			InternalEObject oldHasInterBrickInBrick = (InternalEObject)hasInterBrickInBrick;
			hasInterBrickInBrick = (InterBrickIn)eResolveProxy(oldHasInterBrickInBrick);
			if (hasInterBrickInBrick != oldHasInterBrickInBrick) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShootingmachineemfmodelPackage.BRICK__HAS_INTER_BRICK_IN_BRICK, oldHasInterBrickInBrick, hasInterBrickInBrick));
			}
		}
		return hasInterBrickInBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterBrickIn basicGetHasInterBrickInBrick() {
		return hasInterBrickInBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInterBrickInBrick(InterBrickIn newHasInterBrickInBrick) {
		InterBrickIn oldHasInterBrickInBrick = hasInterBrickInBrick;
		hasInterBrickInBrick = newHasInterBrickInBrick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.BRICK__HAS_INTER_BRICK_IN_BRICK, oldHasInterBrickInBrick, hasInterBrickInBrick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterBrickOut getHasInterBrickOutBrick() {
		if (hasInterBrickOutBrick != null && hasInterBrickOutBrick.eIsProxy()) {
			InternalEObject oldHasInterBrickOutBrick = (InternalEObject)hasInterBrickOutBrick;
			hasInterBrickOutBrick = (InterBrickOut)eResolveProxy(oldHasInterBrickOutBrick);
			if (hasInterBrickOutBrick != oldHasInterBrickOutBrick) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShootingmachineemfmodelPackage.BRICK__HAS_INTER_BRICK_OUT_BRICK, oldHasInterBrickOutBrick, hasInterBrickOutBrick));
			}
		}
		return hasInterBrickOutBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterBrickOut basicGetHasInterBrickOutBrick() {
		return hasInterBrickOutBrick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInterBrickOutBrick(InterBrickOut newHasInterBrickOutBrick) {
		InterBrickOut oldHasInterBrickOutBrick = hasInterBrickOutBrick;
		hasInterBrickOutBrick = newHasInterBrickOutBrick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.BRICK__HAS_INTER_BRICK_OUT_BRICK, oldHasInterBrickOutBrick, hasInterBrickOutBrick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.BRICK__HAS_TASK_BRICK:
				return ((InternalEList<?>)getHasTaskBrick()).basicRemove(otherEnd, msgs);
			case ShootingmachineemfmodelPackage.BRICK__HAS_EVENT_BRICK:
				return ((InternalEList<?>)getHasEventBrick()).basicRemove(otherEnd, msgs);
			case ShootingmachineemfmodelPackage.BRICK__HAS_ALARM_BRICK:
				return ((InternalEList<?>)getHasAlarmBrick()).basicRemove(otherEnd, msgs);
			case ShootingmachineemfmodelPackage.BRICK__HAS_HW_PORTS_BRICK:
				return ((InternalEList<?>)getHasHWPortsBrick()).basicRemove(otherEnd, msgs);
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
			case ShootingmachineemfmodelPackage.BRICK__HAS_TASK_BRICK:
				return getHasTaskBrick();
			case ShootingmachineemfmodelPackage.BRICK__HAS_EVENT_BRICK:
				return getHasEventBrick();
			case ShootingmachineemfmodelPackage.BRICK__HAS_ALARM_BRICK:
				return getHasAlarmBrick();
			case ShootingmachineemfmodelPackage.BRICK__HAS_HW_PORTS_BRICK:
				return getHasHWPortsBrick();
			case ShootingmachineemfmodelPackage.BRICK__HAS_INTER_BRICK_IN_BRICK:
				if (resolve) return getHasInterBrickInBrick();
				return basicGetHasInterBrickInBrick();
			case ShootingmachineemfmodelPackage.BRICK__HAS_INTER_BRICK_OUT_BRICK:
				if (resolve) return getHasInterBrickOutBrick();
				return basicGetHasInterBrickOutBrick();
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
			case ShootingmachineemfmodelPackage.BRICK__HAS_TASK_BRICK:
				getHasTaskBrick().clear();
				getHasTaskBrick().addAll((Collection<? extends Task>)newValue);
				return;
			case ShootingmachineemfmodelPackage.BRICK__HAS_EVENT_BRICK:
				getHasEventBrick().clear();
				getHasEventBrick().addAll((Collection<? extends Event>)newValue);
				return;
			case ShootingmachineemfmodelPackage.BRICK__HAS_ALARM_BRICK:
				getHasAlarmBrick().clear();
				getHasAlarmBrick().addAll((Collection<? extends Alarm>)newValue);
				return;
			case ShootingmachineemfmodelPackage.BRICK__HAS_HW_PORTS_BRICK:
				getHasHWPortsBrick().clear();
				getHasHWPortsBrick().addAll((Collection<? extends HWPorts>)newValue);
				return;
			case ShootingmachineemfmodelPackage.BRICK__HAS_INTER_BRICK_IN_BRICK:
				setHasInterBrickInBrick((InterBrickIn)newValue);
				return;
			case ShootingmachineemfmodelPackage.BRICK__HAS_INTER_BRICK_OUT_BRICK:
				setHasInterBrickOutBrick((InterBrickOut)newValue);
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
			case ShootingmachineemfmodelPackage.BRICK__HAS_TASK_BRICK:
				getHasTaskBrick().clear();
				return;
			case ShootingmachineemfmodelPackage.BRICK__HAS_EVENT_BRICK:
				getHasEventBrick().clear();
				return;
			case ShootingmachineemfmodelPackage.BRICK__HAS_ALARM_BRICK:
				getHasAlarmBrick().clear();
				return;
			case ShootingmachineemfmodelPackage.BRICK__HAS_HW_PORTS_BRICK:
				getHasHWPortsBrick().clear();
				return;
			case ShootingmachineemfmodelPackage.BRICK__HAS_INTER_BRICK_IN_BRICK:
				setHasInterBrickInBrick((InterBrickIn)null);
				return;
			case ShootingmachineemfmodelPackage.BRICK__HAS_INTER_BRICK_OUT_BRICK:
				setHasInterBrickOutBrick((InterBrickOut)null);
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
			case ShootingmachineemfmodelPackage.BRICK__HAS_TASK_BRICK:
				return hasTaskBrick != null && !hasTaskBrick.isEmpty();
			case ShootingmachineemfmodelPackage.BRICK__HAS_EVENT_BRICK:
				return hasEventBrick != null && !hasEventBrick.isEmpty();
			case ShootingmachineemfmodelPackage.BRICK__HAS_ALARM_BRICK:
				return hasAlarmBrick != null && !hasAlarmBrick.isEmpty();
			case ShootingmachineemfmodelPackage.BRICK__HAS_HW_PORTS_BRICK:
				return hasHWPortsBrick != null && !hasHWPortsBrick.isEmpty();
			case ShootingmachineemfmodelPackage.BRICK__HAS_INTER_BRICK_IN_BRICK:
				return hasInterBrickInBrick != null;
			case ShootingmachineemfmodelPackage.BRICK__HAS_INTER_BRICK_OUT_BRICK:
				return hasInterBrickOutBrick != null;
		}
		return super.eIsSet(featureID);
	}

} //BrickImpl
