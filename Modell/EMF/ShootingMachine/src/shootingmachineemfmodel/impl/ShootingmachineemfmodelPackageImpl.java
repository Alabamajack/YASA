/**
 */
package shootingmachineemfmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import shootingmachineemfmodel.Alarm;
import shootingmachineemfmodel.Brick;
import shootingmachineemfmodel.Client;
import shootingmachineemfmodel.Component;
import shootingmachineemfmodel.Connections;
import shootingmachineemfmodel.Counter;
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
import shootingmachineemfmodel.Ports;
import shootingmachineemfmodel.Receiver;
import shootingmachineemfmodel.ReceiverPorts;
import shootingmachineemfmodel.SA_Component;
import shootingmachineemfmodel.SW_Component;
import shootingmachineemfmodel.SendEvent;
import shootingmachineemfmodel.Sender;
import shootingmachineemfmodel.SenderPorts;
import shootingmachineemfmodel.Server;
import shootingmachineemfmodel.ShootingmachineemfmodelFactory;
import shootingmachineemfmodel.ShootingmachineemfmodelPackage;
import shootingmachineemfmodel.Standardclass;
import shootingmachineemfmodel.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShootingmachineemfmodelPackageImpl extends EPackageImpl implements ShootingmachineemfmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brickEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sA_ComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sW_ComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderPortsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiverPortsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardclassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interBrickCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwPortsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwInternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwExternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see shootingmachineemfmodel.ShootingmachineemfmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ShootingmachineemfmodelPackageImpl() {
		super(eNS_URI, ShootingmachineemfmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ShootingmachineemfmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ShootingmachineemfmodelPackage init() {
		if (isInited) return (ShootingmachineemfmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ShootingmachineemfmodelPackage.eNS_URI);

		// Obtain or create and register package
		ShootingmachineemfmodelPackageImpl theShootingmachineemfmodelPackage = (ShootingmachineemfmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ShootingmachineemfmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ShootingmachineemfmodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theShootingmachineemfmodelPackage.createPackageContents();

		// Initialize created meta-data
		theShootingmachineemfmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theShootingmachineemfmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ShootingmachineemfmodelPackage.eNS_URI, theShootingmachineemfmodelPackage);
		return theShootingmachineemfmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_HasComponent() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_HasBrick() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_HasConnections() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_HasInterBrickCommunicationSystem() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_HasHWPortsComponent() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrick() {
		return brickEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrick_HasTaskBrick() {
		return (EReference)brickEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrick_HasEventBrick() {
		return (EReference)brickEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrick_HasAlarmBrick() {
		return (EReference)brickEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrick_HasHWPortsBrick() {
		return (EReference)brickEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrick_HasInterBrickCommunicationBrick() {
		return (EReference)brickEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSA_Component() {
		return sA_ComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSA_Component_HasPortsSAC() {
		return (EReference)sA_ComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSA_Component_HasRunnableSAC() {
		return (EReference)sA_ComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSW_Component() {
		return sW_ComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSW_Component_HasPortsSWC() {
		return (EReference)sW_ComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSW_Component_HasRunnableSWC() {
		return (EReference)sW_ComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorts() {
		return portsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPorts_HasMessagePorts() {
		return (EReference)portsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSenderPorts() {
		return senderPortsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiverPorts() {
		return receiverPortsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSender() {
		return senderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendEvent() {
		return sendEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiver() {
		return receiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetEvent() {
		return getEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardclass() {
		return standardclassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardclass_Name() {
		return (EAttribute)standardclassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_HasEvent() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_HasAlarm() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_HasRunnable() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlarm() {
		return alarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarm_HasCounter() {
		return (EReference)alarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCounter() {
		return counterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnections() {
		return connectionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnections_HasReceiverPorts() {
		return (EReference)connectionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnections_HasSenderPorts() {
		return (EReference)connectionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnable() {
		return runnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunnable_Name() {
		return (EAttribute)runnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterBrickCommunication() {
		return interBrickCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterBrickCommunication_HasBrickInterBrickCommunication() {
		return (EReference)interBrickCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterBrickCommunication_HasMessageInterBrickCommunication() {
		return (EReference)interBrickCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterBrickCommunication_MessageID() {
		return (EAttribute)interBrickCommunicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterBrickCommunication_Name() {
		return (EAttribute)interBrickCommunicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWPorts() {
		return hwPortsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWInput() {
		return hwInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWOutput() {
		return hwOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWIntern() {
		return hwInternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWExtern() {
		return hwExternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHWExtern_Portnumber() {
		return (EAttribute)hwExternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotor() {
		return motorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplay() {
		return displayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageHeader() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MyMessage() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Name() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShootingmachineemfmodelFactory getShootingmachineemfmodelFactory() {
		return (ShootingmachineemfmodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__HAS_COMPONENT);
		createEReference(systemEClass, SYSTEM__HAS_BRICK);
		createEReference(systemEClass, SYSTEM__HAS_CONNECTIONS);
		createEReference(systemEClass, SYSTEM__HAS_INTER_BRICK_COMMUNICATION_SYSTEM);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__HAS_HW_PORTS_COMPONENT);

		brickEClass = createEClass(BRICK);
		createEReference(brickEClass, BRICK__HAS_TASK_BRICK);
		createEReference(brickEClass, BRICK__HAS_EVENT_BRICK);
		createEReference(brickEClass, BRICK__HAS_ALARM_BRICK);
		createEReference(brickEClass, BRICK__HAS_HW_PORTS_BRICK);
		createEReference(brickEClass, BRICK__HAS_INTER_BRICK_COMMUNICATION_BRICK);

		sA_ComponentEClass = createEClass(SA_COMPONENT);
		createEReference(sA_ComponentEClass, SA_COMPONENT__HAS_PORTS_SAC);
		createEReference(sA_ComponentEClass, SA_COMPONENT__HAS_RUNNABLE_SAC);

		sW_ComponentEClass = createEClass(SW_COMPONENT);
		createEReference(sW_ComponentEClass, SW_COMPONENT__HAS_PORTS_SWC);
		createEReference(sW_ComponentEClass, SW_COMPONENT__HAS_RUNNABLE_SWC);

		portsEClass = createEClass(PORTS);
		createEReference(portsEClass, PORTS__HAS_MESSAGE_PORTS);

		senderPortsEClass = createEClass(SENDER_PORTS);

		receiverPortsEClass = createEClass(RECEIVER_PORTS);

		senderEClass = createEClass(SENDER);

		clientEClass = createEClass(CLIENT);

		sendEventEClass = createEClass(SEND_EVENT);

		receiverEClass = createEClass(RECEIVER);

		serverEClass = createEClass(SERVER);

		getEventEClass = createEClass(GET_EVENT);

		standardclassEClass = createEClass(STANDARDCLASS);
		createEAttribute(standardclassEClass, STANDARDCLASS__NAME);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__HAS_EVENT);
		createEReference(taskEClass, TASK__HAS_ALARM);
		createEReference(taskEClass, TASK__HAS_RUNNABLE);

		eventEClass = createEClass(EVENT);

		alarmEClass = createEClass(ALARM);
		createEReference(alarmEClass, ALARM__HAS_COUNTER);

		counterEClass = createEClass(COUNTER);

		connectionsEClass = createEClass(CONNECTIONS);
		createEReference(connectionsEClass, CONNECTIONS__HAS_RECEIVER_PORTS);
		createEReference(connectionsEClass, CONNECTIONS__HAS_SENDER_PORTS);

		runnableEClass = createEClass(RUNNABLE);
		createEAttribute(runnableEClass, RUNNABLE__NAME);

		interBrickCommunicationEClass = createEClass(INTER_BRICK_COMMUNICATION);
		createEReference(interBrickCommunicationEClass, INTER_BRICK_COMMUNICATION__HAS_BRICK_INTER_BRICK_COMMUNICATION);
		createEReference(interBrickCommunicationEClass, INTER_BRICK_COMMUNICATION__HAS_MESSAGE_INTER_BRICK_COMMUNICATION);
		createEAttribute(interBrickCommunicationEClass, INTER_BRICK_COMMUNICATION__MESSAGE_ID);
		createEAttribute(interBrickCommunicationEClass, INTER_BRICK_COMMUNICATION__NAME);

		hwPortsEClass = createEClass(HW_PORTS);

		hwInputEClass = createEClass(HW_INPUT);

		hwOutputEClass = createEClass(HW_OUTPUT);

		hwInternEClass = createEClass(HW_INTERN);

		hwExternEClass = createEClass(HW_EXTERN);
		createEAttribute(hwExternEClass, HW_EXTERN__PORTNUMBER);

		motorEClass = createEClass(MOTOR);

		displayEClass = createEClass(DISPLAY);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_HEADER);
		createEAttribute(messageEClass, MESSAGE__MY_MESSAGE);
		createEAttribute(messageEClass, MESSAGE__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sA_ComponentEClass.getESuperTypes().add(this.getComponent());
		sW_ComponentEClass.getESuperTypes().add(this.getComponent());
		senderPortsEClass.getESuperTypes().add(this.getPorts());
		receiverPortsEClass.getESuperTypes().add(this.getPorts());
		senderEClass.getESuperTypes().add(this.getSenderPorts());
		clientEClass.getESuperTypes().add(this.getSenderPorts());
		sendEventEClass.getESuperTypes().add(this.getSenderPorts());
		receiverEClass.getESuperTypes().add(this.getReceiverPorts());
		serverEClass.getESuperTypes().add(this.getReceiverPorts());
		getEventEClass.getESuperTypes().add(this.getReceiverPorts());
		taskEClass.getESuperTypes().add(this.getStandardclass());
		eventEClass.getESuperTypes().add(this.getStandardclass());
		alarmEClass.getESuperTypes().add(this.getStandardclass());
		counterEClass.getESuperTypes().add(this.getStandardclass());
		hwInputEClass.getESuperTypes().add(this.getHWPorts());
		hwOutputEClass.getESuperTypes().add(this.getHWPorts());
		hwInternEClass.getESuperTypes().add(this.getHWInput());
		hwExternEClass.getESuperTypes().add(this.getHWInput());
		motorEClass.getESuperTypes().add(this.getHWOutput());
		displayEClass.getESuperTypes().add(this.getHWOutput());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemEClass, shootingmachineemfmodel.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_HasComponent(), this.getComponent(), null, "hasComponent", null, 1, -1, shootingmachineemfmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_HasBrick(), this.getBrick(), null, "hasBrick", null, 1, -1, shootingmachineemfmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_HasConnections(), this.getConnections(), null, "hasConnections", null, 0, -1, shootingmachineemfmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_HasInterBrickCommunicationSystem(), this.getInterBrickCommunication(), null, "hasInterBrickCommunicationSystem", null, 0, -1, shootingmachineemfmodel.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_HasHWPortsComponent(), this.getHWPorts(), null, "hasHWPortsComponent", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brickEClass, Brick.class, "Brick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBrick_HasTaskBrick(), this.getTask(), null, "hasTaskBrick", null, 1, -1, Brick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrick_HasEventBrick(), this.getEvent(), null, "hasEventBrick", null, 0, -1, Brick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrick_HasAlarmBrick(), this.getAlarm(), null, "hasAlarmBrick", null, 0, -1, Brick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrick_HasHWPortsBrick(), this.getHWPorts(), null, "hasHWPortsBrick", null, 0, -1, Brick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrick_HasInterBrickCommunicationBrick(), this.getInterBrickCommunication(), null, "hasInterBrickCommunicationBrick", null, 1, 1, Brick.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sA_ComponentEClass, SA_Component.class, "SA_Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSA_Component_HasPortsSAC(), this.getPorts(), null, "hasPortsSAC", null, 0, -1, SA_Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSA_Component_HasRunnableSAC(), this.getRunnable(), null, "hasRunnableSAC", null, 0, -1, SA_Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sW_ComponentEClass, SW_Component.class, "SW_Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSW_Component_HasPortsSWC(), this.getPorts(), null, "hasPortsSWC", null, 0, -1, SW_Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSW_Component_HasRunnableSWC(), this.getRunnable(), null, "hasRunnableSWC", null, 0, -1, SW_Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portsEClass, Ports.class, "Ports", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPorts_HasMessagePorts(), this.getMessage(), null, "hasMessagePorts", null, 0, -1, Ports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senderPortsEClass, SenderPorts.class, "SenderPorts", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receiverPortsEClass, ReceiverPorts.class, "ReceiverPorts", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(senderEClass, Sender.class, "Sender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendEventEClass, SendEvent.class, "SendEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receiverEClass, Receiver.class, "Receiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getEventEClass, GetEvent.class, "GetEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardclassEClass, Standardclass.class, "Standardclass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardclass_Name(), ecorePackage.getEString(), "name", null, 0, 1, Standardclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_HasEvent(), this.getEvent(), null, "hasEvent", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_HasAlarm(), this.getAlarm(), null, "hasAlarm", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_HasRunnable(), this.getRunnable(), null, "hasRunnable", null, 1, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alarmEClass, Alarm.class, "Alarm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlarm_HasCounter(), this.getCounter(), null, "hasCounter", null, 1, 1, Alarm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(counterEClass, Counter.class, "Counter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionsEClass, Connections.class, "Connections", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnections_HasReceiverPorts(), this.getReceiverPorts(), null, "hasReceiverPorts", null, 1, -1, Connections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnections_HasSenderPorts(), this.getSenderPorts(), null, "hasSenderPorts", null, 1, 1, Connections.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runnableEClass, shootingmachineemfmodel.Runnable.class, "Runnable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunnable_Name(), ecorePackage.getEString(), "name", null, 0, 1, shootingmachineemfmodel.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interBrickCommunicationEClass, InterBrickCommunication.class, "InterBrickCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterBrickCommunication_HasBrickInterBrickCommunication(), this.getBrick(), null, "hasBrickInterBrickCommunication", null, 1, 1, InterBrickCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterBrickCommunication_HasMessageInterBrickCommunication(), this.getMessage(), null, "hasMessageInterBrickCommunication", null, 1, 1, InterBrickCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterBrickCommunication_MessageID(), ecorePackage.getEInt(), "messageID", null, 0, 1, InterBrickCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterBrickCommunication_Name(), ecorePackage.getEString(), "name", null, 0, 1, InterBrickCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwPortsEClass, HWPorts.class, "HWPorts", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hwInputEClass, HWInput.class, "HWInput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hwOutputEClass, HWOutput.class, "HWOutput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hwInternEClass, HWIntern.class, "HWIntern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hwExternEClass, HWExtern.class, "HWExtern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHWExtern_Portnumber(), ecorePackage.getEInt(), "Portnumber", null, 0, 1, HWExtern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motorEClass, Motor.class, "Motor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(displayEClass, Display.class, "Display", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_MessageHeader(), ecorePackage.getEChar(), "MessageHeader", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_MyMessage(), ecorePackage.getEString(), "myMessage", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ShootingmachineemfmodelPackageImpl