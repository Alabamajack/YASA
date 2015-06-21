/**
 */
package shootingmachineemfmodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import shootingmachineemfmodel.Brick;
import shootingmachineemfmodel.InterBrickCommunication;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Brick Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.InterBrickCommunicationImpl#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.InterBrickCommunicationImpl#getHasIBCOut <em>Has IBC Out</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.InterBrickCommunicationImpl#getHasIBCIn <em>Has IBC In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InterBrickCommunicationImpl extends StandardclassImpl implements InterBrickCommunication {
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
	 * The cached value of the '{@link #getHasIBCOut() <em>Has IBC Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIBCOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Brick> hasIBCOut;

	/**
	 * The cached value of the '{@link #getHasIBCIn() <em>Has IBC In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIBCIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Brick> hasIBCIn;

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
	public EList<Brick> getHasIBCOut() {
		if (hasIBCOut == null) {
			hasIBCOut = new EObjectResolvingEList<Brick>(Brick.class, this, ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_IBC_OUT);
		}
		return hasIBCOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Brick> getHasIBCIn() {
		if (hasIBCIn == null) {
			hasIBCIn = new EObjectResolvingEList<Brick>(Brick.class, this, ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_IBC_IN);
		}
		return hasIBCIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__MESSAGE_ID:
				return getMessageID();
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_IBC_OUT:
				return getHasIBCOut();
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_IBC_IN:
				return getHasIBCIn();
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__MESSAGE_ID:
				setMessageID((Integer)newValue);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_IBC_OUT:
				getHasIBCOut().clear();
				getHasIBCOut().addAll((Collection<? extends Brick>)newValue);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_IBC_IN:
				getHasIBCIn().clear();
				getHasIBCIn().addAll((Collection<? extends Brick>)newValue);
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__MESSAGE_ID:
				setMessageID(MESSAGE_ID_EDEFAULT);
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_IBC_OUT:
				getHasIBCOut().clear();
				return;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_IBC_IN:
				getHasIBCIn().clear();
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
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__MESSAGE_ID:
				return messageID != MESSAGE_ID_EDEFAULT;
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_IBC_OUT:
				return hasIBCOut != null && !hasIBCOut.isEmpty();
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION__HAS_IBC_IN:
				return hasIBCIn != null && !hasIBCIn.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //InterBrickCommunicationImpl
