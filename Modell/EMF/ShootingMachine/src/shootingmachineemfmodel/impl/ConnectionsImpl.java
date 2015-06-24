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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import shootingmachineemfmodel.Connections;
import shootingmachineemfmodel.InterBrickCommunication;
import shootingmachineemfmodel.Message;
import shootingmachineemfmodel.ReceiverPorts;
import shootingmachineemfmodel.SenderPorts;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connections</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link shootingmachineemfmodel.impl.ConnectionsImpl#getHasReceiverPorts <em>Has Receiver Ports</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.ConnectionsImpl#getHasSenderPorts <em>Has Sender Ports</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.ConnectionsImpl#getHasInterBrickCommunicationSystem <em>Has Inter Brick Communication System</em>}</li>
 *   <li>{@link shootingmachineemfmodel.impl.ConnectionsImpl#getHasMessage <em>Has Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionsImpl extends StandardclassImpl implements Connections {
	/**
	 * The cached value of the '{@link #getHasReceiverPorts() <em>Has Receiver Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasReceiverPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ReceiverPorts> hasReceiverPorts;

	/**
	 * The cached value of the '{@link #getHasSenderPorts() <em>Has Sender Ports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSenderPorts()
	 * @generated
	 * @ordered
	 */
	protected SenderPorts hasSenderPorts;

	/**
	 * The cached value of the '{@link #getHasInterBrickCommunicationSystem() <em>Has Inter Brick Communication System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInterBrickCommunicationSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<InterBrickCommunication> hasInterBrickCommunicationSystem;

	/**
	 * The cached value of the '{@link #getHasMessage() <em>Has Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMessage()
	 * @generated
	 * @ordered
	 */
	protected Message hasMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShootingmachineemfmodelPackage.Literals.CONNECTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReceiverPorts> getHasReceiverPorts() {
		if (hasReceiverPorts == null) {
			hasReceiverPorts = new EObjectResolvingEList<ReceiverPorts>(ReceiverPorts.class, this, ShootingmachineemfmodelPackage.CONNECTIONS__HAS_RECEIVER_PORTS);
		}
		return hasReceiverPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPorts getHasSenderPorts() {
		if (hasSenderPorts != null && hasSenderPorts.eIsProxy()) {
			InternalEObject oldHasSenderPorts = (InternalEObject)hasSenderPorts;
			hasSenderPorts = (SenderPorts)eResolveProxy(oldHasSenderPorts);
			if (hasSenderPorts != oldHasSenderPorts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShootingmachineemfmodelPackage.CONNECTIONS__HAS_SENDER_PORTS, oldHasSenderPorts, hasSenderPorts));
			}
		}
		return hasSenderPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenderPorts basicGetHasSenderPorts() {
		return hasSenderPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSenderPorts(SenderPorts newHasSenderPorts) {
		SenderPorts oldHasSenderPorts = hasSenderPorts;
		hasSenderPorts = newHasSenderPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.CONNECTIONS__HAS_SENDER_PORTS, oldHasSenderPorts, hasSenderPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterBrickCommunication> getHasInterBrickCommunicationSystem() {
		if (hasInterBrickCommunicationSystem == null) {
			hasInterBrickCommunicationSystem = new EObjectContainmentEList<InterBrickCommunication>(InterBrickCommunication.class, this, ShootingmachineemfmodelPackage.CONNECTIONS__HAS_INTER_BRICK_COMMUNICATION_SYSTEM);
		}
		return hasInterBrickCommunicationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getHasMessage() {
		return hasMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasMessage(Message newHasMessage, NotificationChain msgs) {
		Message oldHasMessage = hasMessage;
		hasMessage = newHasMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.CONNECTIONS__HAS_MESSAGE, oldHasMessage, newHasMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMessage(Message newHasMessage) {
		if (newHasMessage != hasMessage) {
			NotificationChain msgs = null;
			if (hasMessage != null)
				msgs = ((InternalEObject)hasMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShootingmachineemfmodelPackage.CONNECTIONS__HAS_MESSAGE, null, msgs);
			if (newHasMessage != null)
				msgs = ((InternalEObject)newHasMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShootingmachineemfmodelPackage.CONNECTIONS__HAS_MESSAGE, null, msgs);
			msgs = basicSetHasMessage(newHasMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShootingmachineemfmodelPackage.CONNECTIONS__HAS_MESSAGE, newHasMessage, newHasMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_INTER_BRICK_COMMUNICATION_SYSTEM:
				return ((InternalEList<?>)getHasInterBrickCommunicationSystem()).basicRemove(otherEnd, msgs);
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_MESSAGE:
				return basicSetHasMessage(null, msgs);
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
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_RECEIVER_PORTS:
				return getHasReceiverPorts();
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_SENDER_PORTS:
				if (resolve) return getHasSenderPorts();
				return basicGetHasSenderPorts();
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_INTER_BRICK_COMMUNICATION_SYSTEM:
				return getHasInterBrickCommunicationSystem();
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_MESSAGE:
				return getHasMessage();
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
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_RECEIVER_PORTS:
				getHasReceiverPorts().clear();
				getHasReceiverPorts().addAll((Collection<? extends ReceiverPorts>)newValue);
				return;
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_SENDER_PORTS:
				setHasSenderPorts((SenderPorts)newValue);
				return;
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_INTER_BRICK_COMMUNICATION_SYSTEM:
				getHasInterBrickCommunicationSystem().clear();
				getHasInterBrickCommunicationSystem().addAll((Collection<? extends InterBrickCommunication>)newValue);
				return;
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_MESSAGE:
				setHasMessage((Message)newValue);
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
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_RECEIVER_PORTS:
				getHasReceiverPorts().clear();
				return;
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_SENDER_PORTS:
				setHasSenderPorts((SenderPorts)null);
				return;
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_INTER_BRICK_COMMUNICATION_SYSTEM:
				getHasInterBrickCommunicationSystem().clear();
				return;
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_MESSAGE:
				setHasMessage((Message)null);
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
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_RECEIVER_PORTS:
				return hasReceiverPorts != null && !hasReceiverPorts.isEmpty();
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_SENDER_PORTS:
				return hasSenderPorts != null;
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_INTER_BRICK_COMMUNICATION_SYSTEM:
				return hasInterBrickCommunicationSystem != null && !hasInterBrickCommunicationSystem.isEmpty();
			case ShootingmachineemfmodelPackage.CONNECTIONS__HAS_MESSAGE:
				return hasMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionsImpl
