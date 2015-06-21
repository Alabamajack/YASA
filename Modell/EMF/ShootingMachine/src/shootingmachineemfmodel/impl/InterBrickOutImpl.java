/**
 */
package shootingmachineemfmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import shootingmachineemfmodel.Brick;
import shootingmachineemfmodel.InterBrickOut;
import shootingmachineemfmodel.Message;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Brick Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.InterBrickOutImpl#getHasMessageInterBrickOut <em>Has Message Inter Brick Out</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.InterBrickOutImpl#getHasBrickInterBrickIn <em>Has Brick Inter Brick In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterBrickOutImpl extends InterBrickCommunicationImpl implements InterBrickOut {
	/**
	 * The cached value of the '{@link #getHasMessageInterBrickOut() <em>Has Message Inter Brick Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMessageInterBrickOut()
	 * @generated
	 * @ordered
	 */
	protected Message hasMessageInterBrickOut;

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
	protected InterBrickOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.INTER_BRICK_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getHasMessageInterBrickOut() {
		if (hasMessageInterBrickOut != null && hasMessageInterBrickOut.eIsProxy()) {
			InternalEObject oldHasMessageInterBrickOut = (InternalEObject)hasMessageInterBrickOut;
			hasMessageInterBrickOut = (Message)eResolveProxy(oldHasMessageInterBrickOut);
			if (hasMessageInterBrickOut != oldHasMessageInterBrickOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShootingmachineemfmodelPackage.INTER_BRICK_OUT__HAS_MESSAGE_INTER_BRICK_OUT, oldHasMessageInterBrickOut, hasMessageInterBrickOut));
			}
		}
		return hasMessageInterBrickOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetHasMessageInterBrickOut() {
		return hasMessageInterBrickOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMessageInterBrickOut(Message newHasMessageInterBrickOut) {
		Message oldHasMessageInterBrickOut = hasMessageInterBrickOut;
		hasMessageInterBrickOut = newHasMessageInterBrickOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.INTER_BRICK_OUT__HAS_MESSAGE_INTER_BRICK_OUT, oldHasMessageInterBrickOut, hasMessageInterBrickOut));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShootingmachineemfmodelPackage.INTER_BRICK_OUT__HAS_BRICK_INTER_BRICK_IN, oldHasBrickInterBrickIn, hasBrickInterBrickIn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.INTER_BRICK_OUT__HAS_BRICK_INTER_BRICK_IN, oldHasBrickInterBrickIn, hasBrickInterBrickIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.INTER_BRICK_OUT__HAS_MESSAGE_INTER_BRICK_OUT:
				if (resolve) return getHasMessageInterBrickOut();
				return basicGetHasMessageInterBrickOut();
			case ShootingmachineemfmodelPackage.INTER_BRICK_OUT__HAS_BRICK_INTER_BRICK_IN:
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_OUT__HAS_MESSAGE_INTER_BRICK_OUT:
				setHasMessageInterBrickOut((Message)newValue);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_OUT__HAS_BRICK_INTER_BRICK_IN:
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_OUT__HAS_MESSAGE_INTER_BRICK_OUT:
				setHasMessageInterBrickOut((Message)null);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_OUT__HAS_BRICK_INTER_BRICK_IN:
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_OUT__HAS_MESSAGE_INTER_BRICK_OUT:
				return hasMessageInterBrickOut != null;
			case ShootingmachineemfmodelPackage.INTER_BRICK_OUT__HAS_BRICK_INTER_BRICK_IN:
				return hasBrickInterBrickIn != null;
		}
		return super.eIsSet(featureID);
	}

} //InterBrickOutImpl
