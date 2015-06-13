/**
 */
package shootingmachineemfmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import shootingmachineemfmodel.Brick;
import shootingmachineemfmodel.InterBrickIn;
import shootingmachineemfmodel.Message;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Brick In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.InterBrickInImpl#getHasMessageInterBrickIn <em>Has Message Inter Brick In</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.InterBrickInImpl#getHasBrickInterBrickIn <em>Has Brick Inter Brick In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterBrickInImpl extends InterBrickCommunicationImpl implements InterBrickIn {
	/**
	 * The cached value of the '{@link #getHasMessageInterBrickIn() <em>Has Message Inter Brick In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMessageInterBrickIn()
	 * @generated
	 * @ordered
	 */
	protected Message hasMessageInterBrickIn;

	/**
	 * The cached value of the '{@link #getHasBrickInterBrickIn() <em>Has Brick Inter Brick In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBrickInterBrickIn()
	 * @generated
	 * @ordered
	 */
	protected Brick hasBrickInterBrickIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterBrickInImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.INTER_BRICK_IN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getHasMessageInterBrickIn() {
		if (hasMessageInterBrickIn != null && hasMessageInterBrickIn.eIsProxy()) {
			InternalEObject oldHasMessageInterBrickIn = (InternalEObject)hasMessageInterBrickIn;
			hasMessageInterBrickIn = (Message)eResolveProxy(oldHasMessageInterBrickIn);
			if (hasMessageInterBrickIn != oldHasMessageInterBrickIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShootingmachineemfmodelPackage.INTER_BRICK_IN__HAS_MESSAGE_INTER_BRICK_IN, oldHasMessageInterBrickIn, hasMessageInterBrickIn));
			}
		}
		return hasMessageInterBrickIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetHasMessageInterBrickIn() {
		return hasMessageInterBrickIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMessageInterBrickIn(Message newHasMessageInterBrickIn) {
		Message oldHasMessageInterBrickIn = hasMessageInterBrickIn;
		hasMessageInterBrickIn = newHasMessageInterBrickIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.INTER_BRICK_IN__HAS_MESSAGE_INTER_BRICK_IN, oldHasMessageInterBrickIn, hasMessageInterBrickIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brick getHasBrickInterBrickIn() {
		if (hasBrickInterBrickIn != null && hasBrickInterBrickIn.eIsProxy()) {
			InternalEObject oldHasBrickInterBrickIn = (InternalEObject)hasBrickInterBrickIn;
			hasBrickInterBrickIn = (Brick)eResolveProxy(oldHasBrickInterBrickIn);
			if (hasBrickInterBrickIn != oldHasBrickInterBrickIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShootingmachineemfmodelPackage.INTER_BRICK_IN__HAS_BRICK_INTER_BRICK_IN, oldHasBrickInterBrickIn, hasBrickInterBrickIn));
			}
		}
		return hasBrickInterBrickIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brick basicGetHasBrickInterBrickIn() {
		return hasBrickInterBrickIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasBrickInterBrickIn(Brick newHasBrickInterBrickIn) {
		Brick oldHasBrickInterBrickIn = hasBrickInterBrickIn;
		hasBrickInterBrickIn = newHasBrickInterBrickIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.INTER_BRICK_IN__HAS_BRICK_INTER_BRICK_IN, oldHasBrickInterBrickIn, hasBrickInterBrickIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.INTER_BRICK_IN__HAS_MESSAGE_INTER_BRICK_IN:
				if (resolve) return getHasMessageInterBrickIn();
				return basicGetHasMessageInterBrickIn();
			case ShootingmachineemfmodelPackage.INTER_BRICK_IN__HAS_BRICK_INTER_BRICK_IN:
				if (resolve) return getHasBrickInterBrickIn();
				return basicGetHasBrickInterBrickIn();
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_IN__HAS_MESSAGE_INTER_BRICK_IN:
				setHasMessageInterBrickIn((Message)newValue);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_IN__HAS_BRICK_INTER_BRICK_IN:
				setHasBrickInterBrickIn((Brick)newValue);
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_IN__HAS_MESSAGE_INTER_BRICK_IN:
				setHasMessageInterBrickIn((Message)null);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_IN__HAS_BRICK_INTER_BRICK_IN:
				setHasBrickInterBrickIn((Brick)null);
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_IN__HAS_MESSAGE_INTER_BRICK_IN:
				return hasMessageInterBrickIn != null;
			case ShootingmachineemfmodelPackage.INTER_BRICK_IN__HAS_BRICK_INTER_BRICK_IN:
				return hasBrickInterBrickIn != null;
		}
		return super.eIsSet(featureID);
	}

} //InterBrickInImpl
