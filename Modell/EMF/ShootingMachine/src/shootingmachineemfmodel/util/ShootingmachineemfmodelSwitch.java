/**
 */
package shootingmachineemfmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import shootingmachineemfmodel.Alarm;
import shootingmachineemfmodel.Brick;
import shootingmachineemfmodel.Client;
import shootingmachineemfmodel.Component;
import shootingmachineemfmodel.Connections;
import shootingmachineemfmodel.Display;
import shootingmachineemfmodel.Event;
import shootingmachineemfmodel.GetEvent;
import shootingmachineemfmodel.HWExtern;
import shootingmachineemfmodel.HWInput;
import shootingmachineemfmodel.HWIntern;
import shootingmachineemfmodel.HWOutput;
import shootingmachineemfmodel.HWPorts;
import shootingmachineemfmodel.InterBrickCommunication;
import shootingmachineemfmodel.Message;
import shootingmachineemfmodel.Motor;
import shootingmachineemfmodel.OSPortIN;
import shootingmachineemfmodel.OSPortOUT;
import shootingmachineemfmodel.Ports;
import shootingmachineemfmodel.Receiver;
import shootingmachineemfmodel.ReceiverPorts;
import shootingmachineemfmodel.SA_Component;
import shootingmachineemfmodel.SW_Component;
import shootingmachineemfmodel.SendEvent;
import shootingmachineemfmodel.Sender;
import shootingmachineemfmodel.SenderPorts;
import shootingmachineemfmodel.Server;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;
import shootingmachineemfmodel.Standardclass;
import shootingmachineemfmodel.Task;
import shootingmachineemfmodel.ToplevelSystem;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage
 * @generated
 */
public class ShootingmachineemfmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ShootingmachineemfmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShootingmachineemfmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = ShootingmachineemfmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ShootingmachineemfmodelPackage.TOPLEVEL_SYSTEM: {
				ToplevelSystem toplevelSystem = (ToplevelSystem)theEObject;
				T result = caseToplevelSystem(toplevelSystem);
				if (result == null) result = caseStandardclass(toplevelSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseStandardclass(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.BRICK: {
				Brick brick = (Brick)theEObject;
				T result = caseBrick(brick);
				if (result == null) result = caseStandardclass(brick);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.SA_COMPONENT: {
				SA_Component sA_Component = (SA_Component)theEObject;
				T result = caseSA_Component(sA_Component);
				if (result == null) result = caseComponent(sA_Component);
				if (result == null) result = caseStandardclass(sA_Component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.SW_COMPONENT: {
				SW_Component sW_Component = (SW_Component)theEObject;
				T result = caseSW_Component(sW_Component);
				if (result == null) result = caseComponent(sW_Component);
				if (result == null) result = caseStandardclass(sW_Component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.PORTS: {
				Ports ports = (Ports)theEObject;
				T result = casePorts(ports);
				if (result == null) result = caseStandardclass(ports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.SENDER_PORTS: {
				SenderPorts senderPorts = (SenderPorts)theEObject;
				T result = caseSenderPorts(senderPorts);
				if (result == null) result = casePorts(senderPorts);
				if (result == null) result = caseStandardclass(senderPorts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.RECEIVER_PORTS: {
				ReceiverPorts receiverPorts = (ReceiverPorts)theEObject;
				T result = caseReceiverPorts(receiverPorts);
				if (result == null) result = casePorts(receiverPorts);
				if (result == null) result = caseStandardclass(receiverPorts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.SENDER: {
				Sender sender = (Sender)theEObject;
				T result = caseSender(sender);
				if (result == null) result = caseSenderPorts(sender);
				if (result == null) result = casePorts(sender);
				if (result == null) result = caseStandardclass(sender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.CLIENT: {
				Client client = (Client)theEObject;
				T result = caseClient(client);
				if (result == null) result = caseSenderPorts(client);
				if (result == null) result = casePorts(client);
				if (result == null) result = caseStandardclass(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.SEND_EVENT: {
				SendEvent sendEvent = (SendEvent)theEObject;
				T result = caseSendEvent(sendEvent);
				if (result == null) result = caseSenderPorts(sendEvent);
				if (result == null) result = casePorts(sendEvent);
				if (result == null) result = caseStandardclass(sendEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.RECEIVER: {
				Receiver receiver = (Receiver)theEObject;
				T result = caseReceiver(receiver);
				if (result == null) result = caseReceiverPorts(receiver);
				if (result == null) result = casePorts(receiver);
				if (result == null) result = caseStandardclass(receiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = caseReceiverPorts(server);
				if (result == null) result = casePorts(server);
				if (result == null) result = caseStandardclass(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.GET_EVENT: {
				GetEvent getEvent = (GetEvent)theEObject;
				T result = caseGetEvent(getEvent);
				if (result == null) result = caseReceiverPorts(getEvent);
				if (result == null) result = casePorts(getEvent);
				if (result == null) result = caseStandardclass(getEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.STANDARDCLASS: {
				Standardclass standardclass = (Standardclass)theEObject;
				T result = caseStandardclass(standardclass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseStandardclass(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseStandardclass(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.ALARM: {
				Alarm alarm = (Alarm)theEObject;
				T result = caseAlarm(alarm);
				if (result == null) result = caseStandardclass(alarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.CONNECTIONS: {
				Connections connections = (Connections)theEObject;
				T result = caseConnections(connections);
				if (result == null) result = caseStandardclass(connections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.RUNNABLE: {
				shootingmachineemfmodel.Runnable runnable = (shootingmachineemfmodel.Runnable)theEObject;
				T result = caseRunnable(runnable);
				if (result == null) result = caseStandardclass(runnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.INTER_BRICK_COMMUNICATION: {
				InterBrickCommunication interBrickCommunication = (InterBrickCommunication)theEObject;
				T result = caseInterBrickCommunication(interBrickCommunication);
				if (result == null) result = caseStandardclass(interBrickCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.HW_PORTS: {
				HWPorts hwPorts = (HWPorts)theEObject;
				T result = caseHWPorts(hwPorts);
				if (result == null) result = caseStandardclass(hwPorts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.HW_INPUT: {
				HWInput hwInput = (HWInput)theEObject;
				T result = caseHWInput(hwInput);
				if (result == null) result = caseHWPorts(hwInput);
				if (result == null) result = caseStandardclass(hwInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.HW_OUTPUT: {
				HWOutput hwOutput = (HWOutput)theEObject;
				T result = caseHWOutput(hwOutput);
				if (result == null) result = caseHWPorts(hwOutput);
				if (result == null) result = caseStandardclass(hwOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.HW_INTERN: {
				HWIntern hwIntern = (HWIntern)theEObject;
				T result = caseHWIntern(hwIntern);
				if (result == null) result = caseHWInput(hwIntern);
				if (result == null) result = caseHWPorts(hwIntern);
				if (result == null) result = caseStandardclass(hwIntern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.HW_EXTERN: {
				HWExtern hwExtern = (HWExtern)theEObject;
				T result = caseHWExtern(hwExtern);
				if (result == null) result = caseHWInput(hwExtern);
				if (result == null) result = caseHWPorts(hwExtern);
				if (result == null) result = caseStandardclass(hwExtern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.MOTOR: {
				Motor motor = (Motor)theEObject;
				T result = caseMotor(motor);
				if (result == null) result = caseHWOutput(motor);
				if (result == null) result = caseHWPorts(motor);
				if (result == null) result = caseStandardclass(motor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.DISPLAY: {
				Display display = (Display)theEObject;
				T result = caseDisplay(display);
				if (result == null) result = caseHWOutput(display);
				if (result == null) result = caseHWPorts(display);
				if (result == null) result = caseStandardclass(display);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseStandardclass(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.OS_PORT_IN: {
				OSPortIN osPortIN = (OSPortIN)theEObject;
				T result = caseOSPortIN(osPortIN);
				if (result == null) result = caseReceiverPorts(osPortIN);
				if (result == null) result = casePorts(osPortIN);
				if (result == null) result = caseStandardclass(osPortIN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShootingmachineemfmodelPackage.OS_PORT_OUT: {
				OSPortOUT osPortOUT = (OSPortOUT)theEObject;
				T result = caseOSPortOUT(osPortOUT);
				if (result == null) result = caseSenderPorts(osPortOUT);
				if (result == null) result = casePorts(osPortOUT);
				if (result == null) result = caseStandardclass(osPortOUT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toplevel System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toplevel System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToplevelSystem(ToplevelSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrick(Brick object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SA Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SA Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSA_Component(SA_Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SW Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SW Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSW_Component(SW_Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorts(Ports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSenderPorts(SenderPorts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receiver Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receiver Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiverPorts(ReceiverPorts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSender(Sender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClient(Client object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendEvent(SendEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiver(Receiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetEvent(GetEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standardclass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standardclass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardclass(Standardclass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlarm(Alarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnections(Connections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunnable(shootingmachineemfmodel.Runnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Brick Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Brick Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterBrickCommunication(InterBrickCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Ports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Ports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWPorts(HWPorts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWInput(HWInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWOutput(HWOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Intern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Intern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWIntern(HWIntern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Extern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Extern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWExtern(HWExtern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotor(Motor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplay(Display object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OS Port IN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OS Port IN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSPortIN(OSPortIN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OS Port OUT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OS Port OUT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSPortOUT(OSPortOUT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ShootingmachineemfmodelSwitch
