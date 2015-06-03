/**
 */
package shootingmachineemfmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import shootingmachineemfmodel.Message;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.MessageImpl#getMessageHeader <em>Message Header</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.MessageImpl#getMyMessage <em>My Message</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.MessageImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message {
	/**
	 * The default value of the '{@link #getMessageHeader() <em>Message Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageHeader()
	 * @generated
	 * @ordered
	 */
	protected static final char MESSAGE_HEADER_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getMessageHeader() <em>Message Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageHeader()
	 * @generated
	 * @ordered
	 */
	protected char messageHeader = MESSAGE_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMyMessage() <em>My Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MY_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMyMessage() <em>My Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyMessage()
	 * @generated
	 * @ordered
	 */
	protected String myMessage = MY_MESSAGE_EDEFAULT;

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
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getMessageHeader() {
		return messageHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageHeader(char newMessageHeader) {
		char oldMessageHeader = messageHeader;
		messageHeader = newMessageHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.MESSAGE__MESSAGE_HEADER, oldMessageHeader, messageHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMyMessage() {
		return myMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyMessage(String newMyMessage) {
		String oldMyMessage = myMessage;
		myMessage = newMyMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.MESSAGE__MY_MESSAGE, oldMyMessage, myMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.MESSAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.MESSAGE__MESSAGE_HEADER:
				return getMessageHeader();
			case ShootingmachineemfmodelPackage.MESSAGE__MY_MESSAGE:
				return getMyMessage();
			case ShootingmachineemfmodelPackage.MESSAGE__NAME:
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
			case ShootingmachineemfmodelPackage.MESSAGE__MESSAGE_HEADER:
				setMessageHeader((Character)newValue);
				return;
			case ShootingmachineemfmodelPackage.MESSAGE__MY_MESSAGE:
				setMyMessage((String)newValue);
				return;
			case ShootingmachineemfmodelPackage.MESSAGE__NAME:
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
			case ShootingmachineemfmodelPackage.MESSAGE__MESSAGE_HEADER:
				setMessageHeader(MESSAGE_HEADER_EDEFAULT);
				return;
			case ShootingmachineemfmodelPackage.MESSAGE__MY_MESSAGE:
				setMyMessage(MY_MESSAGE_EDEFAULT);
				return;
			case ShootingmachineemfmodelPackage.MESSAGE__NAME:
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
			case ShootingmachineemfmodelPackage.MESSAGE__MESSAGE_HEADER:
				return messageHeader != MESSAGE_HEADER_EDEFAULT;
			case ShootingmachineemfmodelPackage.MESSAGE__MY_MESSAGE:
				return MY_MESSAGE_EDEFAULT == null ? myMessage != null : !MY_MESSAGE_EDEFAULT.equals(myMessage);
			case ShootingmachineemfmodelPackage.MESSAGE__NAME:
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
		result.append(" (MessageHeader: ");
		result.append(messageHeader);
		result.append(", myMessage: ");
		result.append(myMessage);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
