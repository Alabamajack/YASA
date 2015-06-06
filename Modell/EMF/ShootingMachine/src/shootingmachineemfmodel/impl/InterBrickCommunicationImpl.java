/**
 */
package shootingmachineemfmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import shootingmachineemfmodel.Brick;
import shootingmachineemfmodel.InterBrickCommunication;
import shootingmachineemfmodel.Message;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Brick Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.InterBrickCommunicationImpl#getHasBrickInterBrickCommunication <em>Has Brick Inter Brick Communication</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.InterBrickCommunicationImpl#getHasMessageInterBrickCommunication <em>Has Message Inter Brick Communication</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.InterBrickCommunicationImpl#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.InterBrickCommunicationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterBrickCommunicationImpl extends MinimalEObjectImpl.Container implements InterBrickCommunication {
	/**
	 * The cached value of the '{@link #getHasBrickInterBrickCommunication() <em>Has Brick Inter Brick Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBrickInterBrickCommunication()
	 * @generated
	 * @ordered
	 */
	protected Brick hasBrickInterBrickCommunication;

	/**
	 * The cached value of the '{@link #getHasMessageInterBrickCommunication() <em>Has Message Inter Brick Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMessageInterBrickCommunication()
	 * @generated
	 * @ordered
	 */
	protected Message hasMessageInterBrickCommunication;

	/**
	 * The default value of the '{@link #getMessageID() <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageID()
	 * @generated
	 * @ordered
	 */
	protected static final int MESSAGE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMessageID() <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageID()
	 * @generated
	 * @ordered
	 */
	protected int messageID = MESSAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterBrickCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.INTER_BRICK_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brick getHasBrickInterBrickCommunication() {
		if (hasBrickInterBrickCommunication != null && hasBrickInterBrickCommunication.eIsProxy()) {
			InternalEObject oldHasBrickInterBrickCommunication = (InternalEObject)hasBrickInterBrickCommunication;
			hasBrickInterBrickCommunication = (Brick)eResolveProxy(oldHasBrickInterBrickCommunication);
			if (hasBrickInterBrickCommunication != oldHasBrickInterBrickCommunication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_BRICK_INTER_BRICK_COMMUNICATION, oldHasBrickInterBrickCommunication, hasBrickInterBrickCommunication));
			}
		}
		return hasBrickInterBrickCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brick basicGetHasBrickInterBrickCommunication() {
		return hasBrickInterBrickCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasBrickInterBrickCommunication(Brick newHasBrickInterBrickCommunication) {
		Brick oldHasBrickInterBrickCommunication = hasBrickInterBrickCommunication;
		hasBrickInterBrickCommunication = newHasBrickInterBrickCommunication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_BRICK_INTER_BRICK_COMMUNICATION, oldHasBrickInterBrickCommunication, hasBrickInterBrickCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getHasMessageInterBrickCommunication() {
		return hasMessageInterBrickCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasMessageInterBrickCommunication(Message newHasMessageInterBrickCommunication, NotificationChain msgs) {
		Message oldHasMessageInterBrickCommunication = hasMessageInterBrickCommunication;
		hasMessageInterBrickCommunication = newHasMessageInterBrickCommunication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_MESSAGE_INTER_BRICK_COMMUNICATION, oldHasMessageInterBrickCommunication, newHasMessageInterBrickCommunication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMessageInterBrickCommunication(Message newHasMessageInterBrickCommunication) {
		if (newHasMessageInterBrickCommunication != hasMessageInterBrickCommunication) {
			NotificationChain msgs = null;
			if (hasMessageInterBrickCommunication != null)
				msgs = ((InternalEObject)hasMessageInterBrickCommunication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_MESSAGE_INTER_BRICK_COMMUNICATION, null, msgs);
			if (newHasMessageInterBrickCommunication != null)
				msgs = ((InternalEObject)newHasMessageInterBrickCommunication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_MESSAGE_INTER_BRICK_COMMUNICATION, null, msgs);
			msgs = basicSetHasMessageInterBrickCommunication(newHasMessageInterBrickCommunication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_MESSAGE_INTER_BRICK_COMMUNICATION, newHasMessageInterBrickCommunication, newHasMessageInterBrickCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMessageID() {
		return messageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageID(int newMessageID) {
		int oldMessageID = messageID;
		messageID = newMessageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__MESSAGE_ID, oldMessageID, messageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_MESSAGE_INTER_BRICK_COMMUNICATION:
				return basicSetHasMessageInterBrickCommunication(null, msgs);
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_BRICK_INTER_BRICK_COMMUNICATION:
				if (resolve) return getHasBrickInterBrickCommunication();
				return basicGetHasBrickInterBrickCommunication();
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_MESSAGE_INTER_BRICK_COMMUNICATION:
				return getHasMessageInterBrickCommunication();
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__MESSAGE_ID:
				return getMessageID();
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__NAME:
				return getName();
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_BRICK_INTER_BRICK_COMMUNICATION:
				setHasBrickInterBrickCommunication((Brick)newValue);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_MESSAGE_INTER_BRICK_COMMUNICATION:
				setHasMessageInterBrickCommunication((Message)newValue);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__MESSAGE_ID:
				setMessageID((Integer)newValue);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__NAME:
				setName((String)newValue);
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_BRICK_INTER_BRICK_COMMUNICATION:
				setHasBrickInterBrickCommunication((Brick)null);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_MESSAGE_INTER_BRICK_COMMUNICATION:
				setHasMessageInterBrickCommunication((Message)null);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__MESSAGE_ID:
				setMessageID(MESSAGE_ID_EDEFAULT);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__NAME:
				setName(NAME_EDEFAULT);
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_BRICK_INTER_BRICK_COMMUNICATION:
				return hasBrickInterBrickCommunication != null;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_MESSAGE_INTER_BRICK_COMMUNICATION:
				return hasMessageInterBrickCommunication != null;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__MESSAGE_ID:
				return messageID != MESSAGE_ID_EDEFAULT;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (messageID: ");
		result.append(messageID);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InterBrickCommunicationImpl