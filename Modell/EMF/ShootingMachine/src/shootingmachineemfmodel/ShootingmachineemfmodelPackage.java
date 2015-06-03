/**
 */
package shootingmachineemfmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see shootingmachineemfmodel.ShootingmachineemfmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ShootingmachineemfmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shootingmachineemfmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://shootingmachineemfmodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "shootingmachineemfmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShootingmachineemfmodelPackage eINSTANCE = shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.SystemImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Has Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__HAS_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Has Brick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__HAS_BRICK = 1;

	/**
	 * The feature id for the '<em><b>Has Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__HAS_CONNECTIONS = 2;

	/**
	 * The feature id for the '<em><b>Has Inter Brick Communication System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__HAS_INTER_BRICK_COMMUNICATION_SYSTEM = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ComponentImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Has HW Ports Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HAS_HW_PORTS_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.BrickImpl <em>Brick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.BrickImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getBrick()
	 * @generated
	 */
	int BRICK = 2;

	/**
	 * The feature id for the '<em><b>Has Task Brick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__HAS_TASK_BRICK = 0;

	/**
	 * The feature id for the '<em><b>Has Event Brick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__HAS_EVENT_BRICK = 1;

	/**
	 * The feature id for the '<em><b>Has Alarm Brick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__HAS_ALARM_BRICK = 2;

	/**
	 * The feature id for the '<em><b>Has HW Ports Brick</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__HAS_HW_PORTS_BRICK = 3;

	/**
	 * The feature id for the '<em><b>Has Inter Brick Communication Brick</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__HAS_INTER_BRICK_COMMUNICATION_BRICK = 4;

	/**
	 * The number of structural features of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.SA_ComponentImpl <em>SA Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.SA_ComponentImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSA_Component()
	 * @generated
	 */
	int SA_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Has HW Ports Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT__HAS_HW_PORTS_COMPONENT = COMPONENT__HAS_HW_PORTS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Has Ports SAC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT__HAS_PORTS_SAC = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Runnable SAC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT__HAS_RUNNABLE_SAC = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SA Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SA Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SA_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.SW_ComponentImpl <em>SW Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.SW_ComponentImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSW_Component()
	 * @generated
	 */
	int SW_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Has HW Ports Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT__HAS_HW_PORTS_COMPONENT = COMPONENT__HAS_HW_PORTS_COMPONENT;

	/**
	 * The feature id for the '<em><b>Has Ports SWC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT__HAS_PORTS_SWC = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Runnable SWC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT__HAS_RUNNABLE_SWC = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SW Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>SW Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.StandardclassImpl <em>Standardclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.StandardclassImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getStandardclass()
	 * @generated
	 */
	int STANDARDCLASS = 14;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.TaskImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 15;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.PortsImpl <em>Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.PortsImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getPorts()
	 * @generated
	 */
	int PORTS = 5;

	/**
	 * The feature id for the '<em><b>Has Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS__HAS_MESSAGE_PORTS = 0;

	/**
	 * The number of structural features of the '<em>Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.SenderPortsImpl <em>Sender Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.SenderPortsImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSenderPorts()
	 * @generated
	 */
	int SENDER_PORTS = 6;

	/**
	 * The feature id for the '<em><b>Has Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_PORTS__HAS_MESSAGE_PORTS = PORTS__HAS_MESSAGE_PORTS;

	/**
	 * The number of structural features of the '<em>Sender Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_PORTS_FEATURE_COUNT = PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sender Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_PORTS_OPERATION_COUNT = PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ReceiverPortsImpl <em>Receiver Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ReceiverPortsImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getReceiverPorts()
	 * @generated
	 */
	int RECEIVER_PORTS = 7;

	/**
	 * The feature id for the '<em><b>Has Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PORTS__HAS_MESSAGE_PORTS = PORTS__HAS_MESSAGE_PORTS;

	/**
	 * The number of structural features of the '<em>Receiver Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PORTS_FEATURE_COUNT = PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Receiver Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_PORTS_OPERATION_COUNT = PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.SenderImpl <em>Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.SenderImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSender()
	 * @generated
	 */
	int SENDER = 8;

	/**
	 * The feature id for the '<em><b>Has Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__HAS_MESSAGE_PORTS = SENDER_PORTS__HAS_MESSAGE_PORTS;

	/**
	 * The number of structural features of the '<em>Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_FEATURE_COUNT = SENDER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_OPERATION_COUNT = SENDER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ClientImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 9;

	/**
	 * The feature id for the '<em><b>Has Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__HAS_MESSAGE_PORTS = SENDER_PORTS__HAS_MESSAGE_PORTS;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = SENDER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = SENDER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.SendEventImpl <em>Send Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.SendEventImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSendEvent()
	 * @generated
	 */
	int SEND_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Has Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT__HAS_MESSAGE_PORTS = SENDER_PORTS__HAS_MESSAGE_PORTS;

	/**
	 * The number of structural features of the '<em>Send Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT_FEATURE_COUNT = SENDER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Send Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_EVENT_OPERATION_COUNT = SENDER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ReceiverImpl <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ReceiverImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 11;

	/**
	 * The feature id for the '<em><b>Has Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER__HAS_MESSAGE_PORTS = RECEIVER_PORTS__HAS_MESSAGE_PORTS;

	/**
	 * The number of structural features of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_FEATURE_COUNT = RECEIVER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_OPERATION_COUNT = RECEIVER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ServerImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 12;

	/**
	 * The feature id for the '<em><b>Has Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__HAS_MESSAGE_PORTS = RECEIVER_PORTS__HAS_MESSAGE_PORTS;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = RECEIVER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = RECEIVER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.GetEventImpl <em>Get Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.GetEventImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getGetEvent()
	 * @generated
	 */
	int GET_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Has Message Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EVENT__HAS_MESSAGE_PORTS = RECEIVER_PORTS__HAS_MESSAGE_PORTS;

	/**
	 * The number of structural features of the '<em>Get Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EVENT_FEATURE_COUNT = RECEIVER_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Get Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_EVENT_OPERATION_COUNT = RECEIVER_PORTS_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDCLASS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Standardclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDCLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Standardclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARDCLASS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = STANDARDCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Has Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAS_EVENT = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Alarm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAS_ALARM = STANDARDCLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Runnable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__HAS_RUNNABLE = STANDARDCLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.EventImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = STANDARDCLASS__NAME;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.AlarmImpl <em>Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.AlarmImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getAlarm()
	 * @generated
	 */
	int ALARM = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__NAME = STANDARDCLASS__NAME;

	/**
	 * The feature id for the '<em><b>Has Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__HAS_COUNTER = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.CounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.CounterImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getCounter()
	 * @generated
	 */
	int COUNTER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__NAME = STANDARDCLASS__NAME;

	/**
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_FEATURE_COUNT = STANDARDCLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_OPERATION_COUNT = STANDARDCLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.ConnectionsImpl <em>Connections</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.ConnectionsImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getConnections()
	 * @generated
	 */
	int CONNECTIONS = 19;

	/**
	 * The feature id for the '<em><b>Has Receiver Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__HAS_RECEIVER_PORTS = 0;

	/**
	 * The feature id for the '<em><b>Has Sender Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS__HAS_SENDER_PORTS = 1;

	/**
	 * The number of structural features of the '<em>Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Connections</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.RunnableImpl <em>Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.RunnableImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getRunnable()
	 * @generated
	 */
	int RUNNABLE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.InterBrickCommunicationImpl <em>Inter Brick Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.InterBrickCommunicationImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getInterBrickCommunication()
	 * @generated
	 */
	int INTER_BRICK_COMMUNICATION = 21;

	/**
	 * The feature id for the '<em><b>Has Brick Inter Brick Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION__HAS_BRICK_INTER_BRICK_COMMUNICATION = 0;

	/**
	 * The feature id for the '<em><b>Has Message Inter Brick Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION__HAS_MESSAGE_INTER_BRICK_COMMUNICATION = 1;

	/**
	 * The feature id for the '<em><b>Message ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION__MESSAGE_ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Inter Brick Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Inter Brick Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_BRICK_COMMUNICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.HWPortsImpl <em>HW Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.HWPortsImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWPorts()
	 * @generated
	 */
	int HW_PORTS = 22;

	/**
	 * The number of structural features of the '<em>HW Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>HW Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_PORTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.HWInputImpl <em>HW Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.HWInputImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWInput()
	 * @generated
	 */
	int HW_INPUT = 23;

	/**
	 * The number of structural features of the '<em>HW Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INPUT_FEATURE_COUNT = HW_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HW Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INPUT_OPERATION_COUNT = HW_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.HWOutputImpl <em>HW Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.HWOutputImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWOutput()
	 * @generated
	 */
	int HW_OUTPUT = 24;

	/**
	 * The number of structural features of the '<em>HW Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_OUTPUT_FEATURE_COUNT = HW_PORTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HW Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_OUTPUT_OPERATION_COUNT = HW_PORTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.HWInternImpl <em>HW Intern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.HWInternImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWIntern()
	 * @generated
	 */
	int HW_INTERN = 25;

	/**
	 * The number of structural features of the '<em>HW Intern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INTERN_FEATURE_COUNT = HW_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HW Intern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_INTERN_OPERATION_COUNT = HW_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.HWExternImpl <em>HW Extern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.HWExternImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWExtern()
	 * @generated
	 */
	int HW_EXTERN = 26;

	/**
	 * The feature id for the '<em><b>Portnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_EXTERN__PORTNUMBER = HW_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HW Extern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_EXTERN_FEATURE_COUNT = HW_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HW Extern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_EXTERN_OPERATION_COUNT = HW_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.MotorImpl <em>Motor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.MotorImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getMotor()
	 * @generated
	 */
	int MOTOR = 27;

	/**
	 * The number of structural features of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_FEATURE_COUNT = HW_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Motor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTOR_OPERATION_COUNT = HW_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.DisplayImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 28;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = HW_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_OPERATION_COUNT = HW_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link shootingmachineemfmodel.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see shootingmachineemfmodel.impl.MessageImpl
	 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 29;

	/**
	 * The feature id for the '<em><b>Message Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MESSAGE_HEADER = 0;

	/**
	 * The feature id for the '<em><b>My Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MY_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see shootingmachineemfmodel.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.System#getHasComponent <em>Has Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Component</em>'.
	 * @see shootingmachineemfmodel.System#getHasComponent()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_HasComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.System#getHasBrick <em>Has Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Brick</em>'.
	 * @see shootingmachineemfmodel.System#getHasBrick()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_HasBrick();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.System#getHasConnections <em>Has Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Connections</em>'.
	 * @see shootingmachineemfmodel.System#getHasConnections()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_HasConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.System#getHasInterBrickCommunicationSystem <em>Has Inter Brick Communication System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Inter Brick Communication System</em>'.
	 * @see shootingmachineemfmodel.System#getHasInterBrickCommunicationSystem()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_HasInterBrickCommunicationSystem();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see shootingmachineemfmodel.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.Component#getHasHWPortsComponent <em>Has HW Ports Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has HW Ports Component</em>'.
	 * @see shootingmachineemfmodel.Component#getHasHWPortsComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_HasHWPortsComponent();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Brick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brick</em>'.
	 * @see shootingmachineemfmodel.Brick
	 * @generated
	 */
	EClass getBrick();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.Brick#getHasTaskBrick <em>Has Task Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Task Brick</em>'.
	 * @see shootingmachineemfmodel.Brick#getHasTaskBrick()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_HasTaskBrick();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.Brick#getHasEventBrick <em>Has Event Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Event Brick</em>'.
	 * @see shootingmachineemfmodel.Brick#getHasEventBrick()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_HasEventBrick();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.Brick#getHasAlarmBrick <em>Has Alarm Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Alarm Brick</em>'.
	 * @see shootingmachineemfmodel.Brick#getHasAlarmBrick()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_HasAlarmBrick();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.Brick#getHasHWPortsBrick <em>Has HW Ports Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has HW Ports Brick</em>'.
	 * @see shootingmachineemfmodel.Brick#getHasHWPortsBrick()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_HasHWPortsBrick();

	/**
	 * Returns the meta object for the reference '{@link shootingmachineemfmodel.Brick#getHasInterBrickCommunicationBrick <em>Has Inter Brick Communication Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Inter Brick Communication Brick</em>'.
	 * @see shootingmachineemfmodel.Brick#getHasInterBrickCommunicationBrick()
	 * @see #getBrick()
	 * @generated
	 */
	EReference getBrick_HasInterBrickCommunicationBrick();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.SA_Component <em>SA Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SA Component</em>'.
	 * @see shootingmachineemfmodel.SA_Component
	 * @generated
	 */
	EClass getSA_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.SA_Component#getHasPortsSAC <em>Has Ports SAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Ports SAC</em>'.
	 * @see shootingmachineemfmodel.SA_Component#getHasPortsSAC()
	 * @see #getSA_Component()
	 * @generated
	 */
	EReference getSA_Component_HasPortsSAC();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.SA_Component#getHasRunnableSAC <em>Has Runnable SAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Runnable SAC</em>'.
	 * @see shootingmachineemfmodel.SA_Component#getHasRunnableSAC()
	 * @see #getSA_Component()
	 * @generated
	 */
	EReference getSA_Component_HasRunnableSAC();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.SW_Component <em>SW Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SW Component</em>'.
	 * @see shootingmachineemfmodel.SW_Component
	 * @generated
	 */
	EClass getSW_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.SW_Component#getHasPortsSWC <em>Has Ports SWC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Ports SWC</em>'.
	 * @see shootingmachineemfmodel.SW_Component#getHasPortsSWC()
	 * @see #getSW_Component()
	 * @generated
	 */
	EReference getSW_Component_HasPortsSWC();

	/**
	 * Returns the meta object for the containment reference list '{@link shootingmachineemfmodel.SW_Component#getHasRunnableSWC <em>Has Runnable SWC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Runnable SWC</em>'.
	 * @see shootingmachineemfmodel.SW_Component#getHasRunnableSWC()
	 * @see #getSW_Component()
	 * @generated
	 */
	EReference getSW_Component_HasRunnableSWC();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Ports <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ports</em>'.
	 * @see shootingmachineemfmodel.Ports
	 * @generated
	 */
	EClass getPorts();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.Ports#getHasMessagePorts <em>Has Message Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Message Ports</em>'.
	 * @see shootingmachineemfmodel.Ports#getHasMessagePorts()
	 * @see #getPorts()
	 * @generated
	 */
	EReference getPorts_HasMessagePorts();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.SenderPorts <em>Sender Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender Ports</em>'.
	 * @see shootingmachineemfmodel.SenderPorts
	 * @generated
	 */
	EClass getSenderPorts();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.ReceiverPorts <em>Receiver Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver Ports</em>'.
	 * @see shootingmachineemfmodel.ReceiverPorts
	 * @generated
	 */
	EClass getReceiverPorts();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender</em>'.
	 * @see shootingmachineemfmodel.Sender
	 * @generated
	 */
	EClass getSender();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see shootingmachineemfmodel.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.SendEvent <em>Send Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Event</em>'.
	 * @see shootingmachineemfmodel.SendEvent
	 * @generated
	 */
	EClass getSendEvent();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver</em>'.
	 * @see shootingmachineemfmodel.Receiver
	 * @generated
	 */
	EClass getReceiver();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see shootingmachineemfmodel.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.GetEvent <em>Get Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Event</em>'.
	 * @see shootingmachineemfmodel.GetEvent
	 * @generated
	 */
	EClass getGetEvent();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Standardclass <em>Standardclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standardclass</em>'.
	 * @see shootingmachineemfmodel.Standardclass
	 * @generated
	 */
	EClass getStandardclass();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Standardclass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shootingmachineemfmodel.Standardclass#getName()
	 * @see #getStandardclass()
	 * @generated
	 */
	EAttribute getStandardclass_Name();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see shootingmachineemfmodel.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.Task#getHasEvent <em>Has Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Event</em>'.
	 * @see shootingmachineemfmodel.Task#getHasEvent()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_HasEvent();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.Task#getHasAlarm <em>Has Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Alarm</em>'.
	 * @see shootingmachineemfmodel.Task#getHasAlarm()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_HasAlarm();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.Task#getHasRunnable <em>Has Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Runnable</em>'.
	 * @see shootingmachineemfmodel.Task#getHasRunnable()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_HasRunnable();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see shootingmachineemfmodel.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm</em>'.
	 * @see shootingmachineemfmodel.Alarm
	 * @generated
	 */
	EClass getAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link shootingmachineemfmodel.Alarm#getHasCounter <em>Has Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Counter</em>'.
	 * @see shootingmachineemfmodel.Alarm#getHasCounter()
	 * @see #getAlarm()
	 * @generated
	 */
	EReference getAlarm_HasCounter();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see shootingmachineemfmodel.Counter
	 * @generated
	 */
	EClass getCounter();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Connections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connections</em>'.
	 * @see shootingmachineemfmodel.Connections
	 * @generated
	 */
	EClass getConnections();

	/**
	 * Returns the meta object for the reference list '{@link shootingmachineemfmodel.Connections#getHasReceiverPorts <em>Has Receiver Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Receiver Ports</em>'.
	 * @see shootingmachineemfmodel.Connections#getHasReceiverPorts()
	 * @see #getConnections()
	 * @generated
	 */
	EReference getConnections_HasReceiverPorts();

	/**
	 * Returns the meta object for the reference '{@link shootingmachineemfmodel.Connections#getHasSenderPorts <em>Has Sender Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Sender Ports</em>'.
	 * @see shootingmachineemfmodel.Connections#getHasSenderPorts()
	 * @see #getConnections()
	 * @generated
	 */
	EReference getConnections_HasSenderPorts();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable</em>'.
	 * @see shootingmachineemfmodel.Runnable
	 * @generated
	 */
	EClass getRunnable();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Runnable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shootingmachineemfmodel.Runnable#getName()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_Name();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.InterBrickCommunication <em>Inter Brick Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Brick Communication</em>'.
	 * @see shootingmachineemfmodel.InterBrickCommunication
	 * @generated
	 */
	EClass getInterBrickCommunication();

	/**
	 * Returns the meta object for the reference '{@link shootingmachineemfmodel.InterBrickCommunication#getHasBrickInterBrickCommunication <em>Has Brick Inter Brick Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Brick Inter Brick Communication</em>'.
	 * @see shootingmachineemfmodel.InterBrickCommunication#getHasBrickInterBrickCommunication()
	 * @see #getInterBrickCommunication()
	 * @generated
	 */
	EReference getInterBrickCommunication_HasBrickInterBrickCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link shootingmachineemfmodel.InterBrickCommunication#getHasMessageInterBrickCommunication <em>Has Message Inter Brick Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Message Inter Brick Communication</em>'.
	 * @see shootingmachineemfmodel.InterBrickCommunication#getHasMessageInterBrickCommunication()
	 * @see #getInterBrickCommunication()
	 * @generated
	 */
	EReference getInterBrickCommunication_HasMessageInterBrickCommunication();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.InterBrickCommunication#getMessageID <em>Message ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message ID</em>'.
	 * @see shootingmachineemfmodel.InterBrickCommunication#getMessageID()
	 * @see #getInterBrickCommunication()
	 * @generated
	 */
	EAttribute getInterBrickCommunication_MessageID();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.InterBrickCommunication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shootingmachineemfmodel.InterBrickCommunication#getName()
	 * @see #getInterBrickCommunication()
	 * @generated
	 */
	EAttribute getInterBrickCommunication_Name();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.HWPorts <em>HW Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Ports</em>'.
	 * @see shootingmachineemfmodel.HWPorts
	 * @generated
	 */
	EClass getHWPorts();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.HWInput <em>HW Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Input</em>'.
	 * @see shootingmachineemfmodel.HWInput
	 * @generated
	 */
	EClass getHWInput();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.HWOutput <em>HW Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Output</em>'.
	 * @see shootingmachineemfmodel.HWOutput
	 * @generated
	 */
	EClass getHWOutput();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.HWIntern <em>HW Intern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Intern</em>'.
	 * @see shootingmachineemfmodel.HWIntern
	 * @generated
	 */
	EClass getHWIntern();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.HWExtern <em>HW Extern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Extern</em>'.
	 * @see shootingmachineemfmodel.HWExtern
	 * @generated
	 */
	EClass getHWExtern();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.HWExtern#getPortnumber <em>Portnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portnumber</em>'.
	 * @see shootingmachineemfmodel.HWExtern#getPortnumber()
	 * @see #getHWExtern()
	 * @generated
	 */
	EAttribute getHWExtern_Portnumber();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Motor <em>Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motor</em>'.
	 * @see shootingmachineemfmodel.Motor
	 * @generated
	 */
	EClass getMotor();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display</em>'.
	 * @see shootingmachineemfmodel.Display
	 * @generated
	 */
	EClass getDisplay();

	/**
	 * Returns the meta object for class '{@link shootingmachineemfmodel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see shootingmachineemfmodel.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Message#getMessageHeader <em>Message Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Header</em>'.
	 * @see shootingmachineemfmodel.Message#getMessageHeader()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MessageHeader();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Message#getMyMessage <em>My Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>My Message</em>'.
	 * @see shootingmachineemfmodel.Message#getMyMessage()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_MyMessage();

	/**
	 * Returns the meta object for the attribute '{@link shootingmachineemfmodel.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see shootingmachineemfmodel.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShootingmachineemfmodelFactory getShootingmachineemfmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.SystemImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Has Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__HAS_COMPONENT = eINSTANCE.getSystem_HasComponent();

		/**
		 * The meta object literal for the '<em><b>Has Brick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__HAS_BRICK = eINSTANCE.getSystem_HasBrick();

		/**
		 * The meta object literal for the '<em><b>Has Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__HAS_CONNECTIONS = eINSTANCE.getSystem_HasConnections();

		/**
		 * The meta object literal for the '<em><b>Has Inter Brick Communication System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__HAS_INTER_BRICK_COMMUNICATION_SYSTEM = eINSTANCE.getSystem_HasInterBrickCommunicationSystem();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ComponentImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Has HW Ports Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__HAS_HW_PORTS_COMPONENT = eINSTANCE.getComponent_HasHWPortsComponent();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.BrickImpl <em>Brick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.BrickImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getBrick()
		 * @generated
		 */
		EClass BRICK = eINSTANCE.getBrick();

		/**
		 * The meta object literal for the '<em><b>Has Task Brick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__HAS_TASK_BRICK = eINSTANCE.getBrick_HasTaskBrick();

		/**
		 * The meta object literal for the '<em><b>Has Event Brick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__HAS_EVENT_BRICK = eINSTANCE.getBrick_HasEventBrick();

		/**
		 * The meta object literal for the '<em><b>Has Alarm Brick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__HAS_ALARM_BRICK = eINSTANCE.getBrick_HasAlarmBrick();

		/**
		 * The meta object literal for the '<em><b>Has HW Ports Brick</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__HAS_HW_PORTS_BRICK = eINSTANCE.getBrick_HasHWPortsBrick();

		/**
		 * The meta object literal for the '<em><b>Has Inter Brick Communication Brick</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRICK__HAS_INTER_BRICK_COMMUNICATION_BRICK = eINSTANCE.getBrick_HasInterBrickCommunicationBrick();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.SA_ComponentImpl <em>SA Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.SA_ComponentImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSA_Component()
		 * @generated
		 */
		EClass SA_COMPONENT = eINSTANCE.getSA_Component();

		/**
		 * The meta object literal for the '<em><b>Has Ports SAC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SA_COMPONENT__HAS_PORTS_SAC = eINSTANCE.getSA_Component_HasPortsSAC();

		/**
		 * The meta object literal for the '<em><b>Has Runnable SAC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SA_COMPONENT__HAS_RUNNABLE_SAC = eINSTANCE.getSA_Component_HasRunnableSAC();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.SW_ComponentImpl <em>SW Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.SW_ComponentImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSW_Component()
		 * @generated
		 */
		EClass SW_COMPONENT = eINSTANCE.getSW_Component();

		/**
		 * The meta object literal for the '<em><b>Has Ports SWC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_COMPONENT__HAS_PORTS_SWC = eINSTANCE.getSW_Component_HasPortsSWC();

		/**
		 * The meta object literal for the '<em><b>Has Runnable SWC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_COMPONENT__HAS_RUNNABLE_SWC = eINSTANCE.getSW_Component_HasRunnableSWC();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.PortsImpl <em>Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.PortsImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getPorts()
		 * @generated
		 */
		EClass PORTS = eINSTANCE.getPorts();

		/**
		 * The meta object literal for the '<em><b>Has Message Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTS__HAS_MESSAGE_PORTS = eINSTANCE.getPorts_HasMessagePorts();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.SenderPortsImpl <em>Sender Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.SenderPortsImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSenderPorts()
		 * @generated
		 */
		EClass SENDER_PORTS = eINSTANCE.getSenderPorts();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ReceiverPortsImpl <em>Receiver Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ReceiverPortsImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getReceiverPorts()
		 * @generated
		 */
		EClass RECEIVER_PORTS = eINSTANCE.getReceiverPorts();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.SenderImpl <em>Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.SenderImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSender()
		 * @generated
		 */
		EClass SENDER = eINSTANCE.getSender();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ClientImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.SendEventImpl <em>Send Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.SendEventImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getSendEvent()
		 * @generated
		 */
		EClass SEND_EVENT = eINSTANCE.getSendEvent();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ReceiverImpl <em>Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ReceiverImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getReceiver()
		 * @generated
		 */
		EClass RECEIVER = eINSTANCE.getReceiver();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ServerImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.GetEventImpl <em>Get Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.GetEventImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getGetEvent()
		 * @generated
		 */
		EClass GET_EVENT = eINSTANCE.getGetEvent();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.StandardclassImpl <em>Standardclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.StandardclassImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getStandardclass()
		 * @generated
		 */
		EClass STANDARDCLASS = eINSTANCE.getStandardclass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARDCLASS__NAME = eINSTANCE.getStandardclass_Name();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.TaskImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Has Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HAS_EVENT = eINSTANCE.getTask_HasEvent();

		/**
		 * The meta object literal for the '<em><b>Has Alarm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HAS_ALARM = eINSTANCE.getTask_HasAlarm();

		/**
		 * The meta object literal for the '<em><b>Has Runnable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__HAS_RUNNABLE = eINSTANCE.getTask_HasRunnable();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.EventImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.AlarmImpl <em>Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.AlarmImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getAlarm()
		 * @generated
		 */
		EClass ALARM = eINSTANCE.getAlarm();

		/**
		 * The meta object literal for the '<em><b>Has Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALARM__HAS_COUNTER = eINSTANCE.getAlarm_HasCounter();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.CounterImpl <em>Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.CounterImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getCounter()
		 * @generated
		 */
		EClass COUNTER = eINSTANCE.getCounter();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.ConnectionsImpl <em>Connections</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.ConnectionsImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getConnections()
		 * @generated
		 */
		EClass CONNECTIONS = eINSTANCE.getConnections();

		/**
		 * The meta object literal for the '<em><b>Has Receiver Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS__HAS_RECEIVER_PORTS = eINSTANCE.getConnections_HasReceiverPorts();

		/**
		 * The meta object literal for the '<em><b>Has Sender Ports</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIONS__HAS_SENDER_PORTS = eINSTANCE.getConnections_HasSenderPorts();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.RunnableImpl <em>Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.RunnableImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getRunnable()
		 * @generated
		 */
		EClass RUNNABLE = eINSTANCE.getRunnable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE__NAME = eINSTANCE.getRunnable_Name();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.InterBrickCommunicationImpl <em>Inter Brick Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.InterBrickCommunicationImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getInterBrickCommunication()
		 * @generated
		 */
		EClass INTER_BRICK_COMMUNICATION = eINSTANCE.getInterBrickCommunication();

		/**
		 * The meta object literal for the '<em><b>Has Brick Inter Brick Communication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_BRICK_COMMUNICATION__HAS_BRICK_INTER_BRICK_COMMUNICATION = eINSTANCE.getInterBrickCommunication_HasBrickInterBrickCommunication();

		/**
		 * The meta object literal for the '<em><b>Has Message Inter Brick Communication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_BRICK_COMMUNICATION__HAS_MESSAGE_INTER_BRICK_COMMUNICATION = eINSTANCE.getInterBrickCommunication_HasMessageInterBrickCommunication();

		/**
		 * The meta object literal for the '<em><b>Message ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTER_BRICK_COMMUNICATION__MESSAGE_ID = eINSTANCE.getInterBrickCommunication_MessageID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTER_BRICK_COMMUNICATION__NAME = eINSTANCE.getInterBrickCommunication_Name();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.HWPortsImpl <em>HW Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.HWPortsImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWPorts()
		 * @generated
		 */
		EClass HW_PORTS = eINSTANCE.getHWPorts();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.HWInputImpl <em>HW Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.HWInputImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWInput()
		 * @generated
		 */
		EClass HW_INPUT = eINSTANCE.getHWInput();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.HWOutputImpl <em>HW Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.HWOutputImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWOutput()
		 * @generated
		 */
		EClass HW_OUTPUT = eINSTANCE.getHWOutput();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.HWInternImpl <em>HW Intern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.HWInternImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWIntern()
		 * @generated
		 */
		EClass HW_INTERN = eINSTANCE.getHWIntern();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.HWExternImpl <em>HW Extern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.HWExternImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getHWExtern()
		 * @generated
		 */
		EClass HW_EXTERN = eINSTANCE.getHWExtern();

		/**
		 * The meta object literal for the '<em><b>Portnumber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_EXTERN__PORTNUMBER = eINSTANCE.getHWExtern_Portnumber();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.MotorImpl <em>Motor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.MotorImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getMotor()
		 * @generated
		 */
		EClass MOTOR = eINSTANCE.getMotor();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.DisplayImpl <em>Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.DisplayImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getDisplay()
		 * @generated
		 */
		EClass DISPLAY = eINSTANCE.getDisplay();

		/**
		 * The meta object literal for the '{@link shootingmachineemfmodel.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see shootingmachineemfmodel.impl.MessageImpl
		 * @see shootingmachineemfmodel.impl.ShootingmachineemfmodelPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Message Header</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MESSAGE_HEADER = eINSTANCE.getMessage_MessageHeader();

		/**
		 * The meta object literal for the '<em><b>My Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__MY_MESSAGE = eINSTANCE.getMessage_MyMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

	}

} //ShootingmachineemfmodelPackage
