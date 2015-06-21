/**
 */
package shootingmachineemfmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
import shootingmachineemfmodel.InterBrickIn;
import shootingmachineemfmodel.InterBrickOut;
import shootingmachineemfmodel.Message;
import shootingmachineemfmodel.Motor;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage
 * @generated
 */
public class ShootingmachineemfmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ShootingmachineemfmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShootingmachineemfmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ShootingmachineemfmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShootingmachineemfmodelSwitch<Adapter> modelSwitch =
		new ShootingmachineemfmodelSwitch<Adapter>() {
			@Override
			public Adapter caseToplevelSystem(ToplevelSystem object) {
				return createToplevelSystemAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseBrick(Brick object) {
				return createBrickAdapter();
			}
			@Override
			public Adapter caseSA_Component(SA_Component object) {
				return createSA_ComponentAdapter();
			}
			@Override
			public Adapter caseSW_Component(SW_Component object) {
				return createSW_ComponentAdapter();
			}
			@Override
			public Adapter casePorts(Ports object) {
				return createPortsAdapter();
			}
			@Override
			public Adapter caseSenderPorts(SenderPorts object) {
				return createSenderPortsAdapter();
			}
			@Override
			public Adapter caseReceiverPorts(ReceiverPorts object) {
				return createReceiverPortsAdapter();
			}
			@Override
			public Adapter caseSender(Sender object) {
				return createSenderAdapter();
			}
			@Override
			public Adapter caseClient(Client object) {
				return createClientAdapter();
			}
			@Override
			public Adapter caseSendEvent(SendEvent object) {
				return createSendEventAdapter();
			}
			@Override
			public Adapter caseReceiver(Receiver object) {
				return createReceiverAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseGetEvent(GetEvent object) {
				return createGetEventAdapter();
			}
			@Override
			public Adapter caseStandardclass(Standardclass object) {
				return createStandardclassAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseAlarm(Alarm object) {
				return createAlarmAdapter();
			}
			@Override
			public Adapter caseConnections(Connections object) {
				return createConnectionsAdapter();
			}
			@Override
			public Adapter caseRunnable(shootingmachineemfmodel.Runnable object) {
				return createRunnableAdapter();
			}
			@Override
			public Adapter caseInterBrickCommunication(InterBrickCommunication object) {
				return createInterBrickCommunicationAdapter();
			}
			@Override
			public Adapter caseHWPorts(HWPorts object) {
				return createHWPortsAdapter();
			}
			@Override
			public Adapter caseHWInput(HWInput object) {
				return createHWInputAdapter();
			}
			@Override
			public Adapter caseHWOutput(HWOutput object) {
				return createHWOutputAdapter();
			}
			@Override
			public Adapter caseHWIntern(HWIntern object) {
				return createHWInternAdapter();
			}
			@Override
			public Adapter caseHWExtern(HWExtern object) {
				return createHWExternAdapter();
			}
			@Override
			public Adapter caseMotor(Motor object) {
				return createMotorAdapter();
			}
			@Override
			public Adapter caseDisplay(Display object) {
				return createDisplayAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseInterBrickIn(InterBrickIn object) {
				return createInterBrickInAdapter();
			}
			@Override
			public Adapter caseInterBrickOut(InterBrickOut object) {
				return createInterBrickOutAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.ToplevelSystem <em>Toplevel System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.ToplevelSystem
	 * @generated
	 */
	public Adapter createToplevelSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Brick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Brick
	 * @generated
	 */
	public Adapter createBrickAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.SA_Component <em>SA Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.SA_Component
	 * @generated
	 */
	public Adapter createSA_ComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.SW_Component <em>SW Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.SW_Component
	 * @generated
	 */
	public Adapter createSW_ComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Ports <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Ports
	 * @generated
	 */
	public Adapter createPortsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.SenderPorts <em>Sender Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.SenderPorts
	 * @generated
	 */
	public Adapter createSenderPortsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.ReceiverPorts <em>Receiver Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.ReceiverPorts
	 * @generated
	 */
	public Adapter createReceiverPortsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Sender
	 * @generated
	 */
	public Adapter createSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.SendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.SendEvent
	 * @generated
	 */
	public Adapter createSendEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Receiver
	 * @generated
	 */
	public Adapter createReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.GetEvent <em>Get Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.GetEvent
	 * @generated
	 */
	public Adapter createGetEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Standardclass <em>Standardclass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Standardclass
	 * @generated
	 */
	public Adapter createStandardclassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Alarm
	 * @generated
	 */
	public Adapter createAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Connections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Connections
	 * @generated
	 */
	public Adapter createConnectionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Runnable
	 * @generated
	 */
	public Adapter createRunnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.InterBrickCommunication <em>Inter Brick Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.InterBrickCommunication
	 * @generated
	 */
	public Adapter createInterBrickCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.HWPorts <em>HW Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.HWPorts
	 * @generated
	 */
	public Adapter createHWPortsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.HWInput <em>HW Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.HWInput
	 * @generated
	 */
	public Adapter createHWInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.HWOutput <em>HW Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.HWOutput
	 * @generated
	 */
	public Adapter createHWOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.HWIntern <em>HW Intern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.HWIntern
	 * @generated
	 */
	public Adapter createHWInternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.HWExtern <em>HW Extern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.HWExtern
	 * @generated
	 */
	public Adapter createHWExternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Motor
	 * @generated
	 */
	public Adapter createMotorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Display
	 * @generated
	 */
	public Adapter createDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.InterBrickIn <em>Inter Brick In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.InterBrickIn
	 * @generated
	 */
	public Adapter createInterBrickInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link shootingmachineemfmodel.InterBrickOut <em>Inter Brick Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see shootingmachineemfmodel.InterBrickOut
	 * @generated
	 */
	public Adapter createInterBrickOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ShootingmachineemfmodelAdapterFactory
