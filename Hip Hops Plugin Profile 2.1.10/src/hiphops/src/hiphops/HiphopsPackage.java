/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hiphops.HiphopsFactory
 * @model kind="package"
 * @generated
 */
public interface HiphopsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hiphops";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://md.kth.se/hiphops";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hiphops";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HiphopsPackage eINSTANCE = hiphops.impl.HiphopsPackageImpl.init();

	/**
	 * The meta object id for the '{@link hiphops.impl.NamedClassImpl <em>Named Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.NamedClassImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getNamedClass()
	 * @generated
	 */
	int NAMED_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CLASS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hiphops.impl.DescribedClassImpl <em>Described Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.DescribedClassImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getDescribedClass()
	 * @generated
	 */
	int DESCRIBED_CLASS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_CLASS__NAME = NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_CLASS__DESCRIPTION = NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Described Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_CLASS_FEATURE_COUNT = NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hiphops.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.ModelImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DESCRIPTION = DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SYSTEM = DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simulation X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SIMULATION_X = DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__HAZARDS = DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hiphops.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.SystemImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DESCRIPTION = DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__COMPONENT = DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LINES = DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hiphops.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.ComponentImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PORTS = DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENT_TYPE = DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTATION = DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALLOCATION = DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Impalternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPALTERNATIVES = DESCRIBED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Allocalternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ALLOCALTERNATIVES = DESCRIBED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = DESCRIBED_CLASS_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link hiphops.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.PortImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_TYPE = DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hiphops.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.ImplementationImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__NAME = DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__DESCRIPTION = DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>FData</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__FDATA = DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exclude From Optimization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__EXCLUDE_FROM_OPTIMIZATION = DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__SYSTEM = DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>HBlock Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__HBLOCK_TYPE = DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__COST = DESCRIBED_CLASS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = DESCRIBED_CLASS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link hiphops.impl.FDataImpl <em>FData</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.FDataImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getFData()
	 * @generated
	 */
	int FDATA = 5;

	/**
	 * The feature id for the '<em><b>Output Deviations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDATA__OUTPUT_DEVIATIONS = 0;

	/**
	 * The feature id for the '<em><b>Basic Events</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDATA__BASIC_EVENTS = 1;

	/**
	 * The number of structural features of the '<em>FData</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FDATA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hiphops.impl.OutputDeviationImpl <em>Output Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.OutputDeviationImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getOutputDeviation()
	 * @generated
	 */
	int OUTPUT_DEVIATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVIATION__NAME = NAMED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Default String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVIATION__DEFAULT_STRING = NAMED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVIATION__SYSTEM_OUT_PORT = NAMED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVIATION_FEATURE_COUNT = NAMED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hiphops.impl.OutputDeviationsImpl <em>Output Deviations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.OutputDeviationsImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getOutputDeviations()
	 * @generated
	 */
	int OUTPUT_DEVIATIONS = 7;

	/**
	 * The feature id for the '<em><b>Output Deviation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVIATIONS__OUTPUT_DEVIATION = 0;

	/**
	 * The number of structural features of the '<em>Output Deviations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DEVIATIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hiphops.impl.BasicEventImpl <em>Basic Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.BasicEventImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getBasicEvent()
	 * @generated
	 */
	int BASIC_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__NAME = DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__DESCRIPTION = DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT__DEFAULT_STRING = DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENT_FEATURE_COUNT = DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hiphops.impl.BasicEventsImpl <em>Basic Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.BasicEventsImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getBasicEvents()
	 * @generated
	 */
	int BASIC_EVENTS = 9;

	/**
	 * The feature id for the '<em><b>Basic Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENTS__BASIC_EVENT = 0;

	/**
	 * The number of structural features of the '<em>Basic Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_EVENTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hiphops.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.LineImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NAME = DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__DESCRIPTION = DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONNECTIONS = DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>P1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__P1 = DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>P2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__P2 = DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = DESCRIBED_CLASS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hiphops.impl.AllocAlternativeImpl <em>Alloc Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.AllocAlternativeImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getAllocAlternative()
	 * @generated
	 */
	int ALLOC_ALTERNATIVE = 13;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC_ALTERNATIVE__ALLOCATION = 0;

	/**
	 * The number of structural features of the '<em>Alloc Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC_ALTERNATIVE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hiphops.impl.HazardImpl <em>Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hiphops.impl.HazardImpl
	 * @see hiphops.impl.HiphopsPackageImpl#getHazard()
	 * @generated
	 */
	int HAZARD = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__NAME = DESCRIBED_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__DESCRIPTION = DESCRIBED_CLASS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Safety Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__SAFETY_REQUIREMENT = DESCRIBED_CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__SEVERITY = DESCRIBED_CLASS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__LOGIC = DESCRIBED_CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_FEATURE_COUNT = DESCRIBED_CLASS_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link hiphops.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see hiphops.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hiphops.Model#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System</em>'.
	 * @see hiphops.Model#getSystem()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_System();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Model#getSimulationX <em>Simulation X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation X</em>'.
	 * @see hiphops.Model#getSimulationX()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_SimulationX();

	/**
	 * Returns the meta object for the reference list '{@link hiphops.Model#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazards</em>'.
	 * @see hiphops.Model#getHazards()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Hazards();

	/**
	 * Returns the meta object for class '{@link hiphops.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see hiphops.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link hiphops.System#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see hiphops.System#getComponent()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link hiphops.System#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see hiphops.System#getLines()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Lines();

	/**
	 * Returns the meta object for class '{@link hiphops.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see hiphops.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link hiphops.Component#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see hiphops.Component#getPorts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ports();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Component#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type</em>'.
	 * @see hiphops.Component#getComponentType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ComponentType();

	/**
	 * Returns the meta object for the containment reference '{@link hiphops.Component#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see hiphops.Component#getImplementation()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Component#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation</em>'.
	 * @see hiphops.Component#getAllocation()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Allocation();

	/**
	 * Returns the meta object for the reference list '{@link hiphops.Component#getImpalternatives <em>Impalternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Impalternatives</em>'.
	 * @see hiphops.Component#getImpalternatives()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Impalternatives();

	/**
	 * Returns the meta object for the reference list '{@link hiphops.Component#getAllocalternatives <em>Allocalternatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocalternatives</em>'.
	 * @see hiphops.Component#getAllocalternatives()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Allocalternatives();

	/**
	 * Returns the meta object for class '{@link hiphops.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see hiphops.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Port#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Type</em>'.
	 * @see hiphops.Port#getPortType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_PortType();

	/**
	 * Returns the meta object for class '{@link hiphops.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see hiphops.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link hiphops.Implementation#getFData <em>FData</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FData</em>'.
	 * @see hiphops.Implementation#getFData()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_FData();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Implementation#isExcludeFromOptimization <em>Exclude From Optimization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude From Optimization</em>'.
	 * @see hiphops.Implementation#isExcludeFromOptimization()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_ExcludeFromOptimization();

	/**
	 * Returns the meta object for the containment reference list '{@link hiphops.Implementation#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System</em>'.
	 * @see hiphops.Implementation#getSystem()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_System();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Implementation#getH_BlockType <em>HBlock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HBlock Type</em>'.
	 * @see hiphops.Implementation#getH_BlockType()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_H_BlockType();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Implementation#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see hiphops.Implementation#getCost()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_Cost();

	/**
	 * Returns the meta object for class '{@link hiphops.FData <em>FData</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FData</em>'.
	 * @see hiphops.FData
	 * @generated
	 */
	EClass getFData();

	/**
	 * Returns the meta object for the containment reference '{@link hiphops.FData#getOutputDeviations <em>Output Deviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Deviations</em>'.
	 * @see hiphops.FData#getOutputDeviations()
	 * @see #getFData()
	 * @generated
	 */
	EReference getFData_OutputDeviations();

	/**
	 * Returns the meta object for the containment reference '{@link hiphops.FData#getBasicEvents <em>Basic Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic Events</em>'.
	 * @see hiphops.FData#getBasicEvents()
	 * @see #getFData()
	 * @generated
	 */
	EReference getFData_BasicEvents();

	/**
	 * Returns the meta object for class '{@link hiphops.OutputDeviation <em>Output Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Deviation</em>'.
	 * @see hiphops.OutputDeviation
	 * @generated
	 */
	EClass getOutputDeviation();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.OutputDeviation#getDefaultString <em>Default String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default String</em>'.
	 * @see hiphops.OutputDeviation#getDefaultString()
	 * @see #getOutputDeviation()
	 * @generated
	 */
	EAttribute getOutputDeviation_DefaultString();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.OutputDeviation#isSystemOutPort <em>System Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Out Port</em>'.
	 * @see hiphops.OutputDeviation#isSystemOutPort()
	 * @see #getOutputDeviation()
	 * @generated
	 */
	EAttribute getOutputDeviation_SystemOutPort();

	/**
	 * Returns the meta object for class '{@link hiphops.OutputDeviations <em>Output Deviations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Deviations</em>'.
	 * @see hiphops.OutputDeviations
	 * @generated
	 */
	EClass getOutputDeviations();

	/**
	 * Returns the meta object for the containment reference list '{@link hiphops.OutputDeviations#getOutputDeviation <em>Output Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Deviation</em>'.
	 * @see hiphops.OutputDeviations#getOutputDeviation()
	 * @see #getOutputDeviations()
	 * @generated
	 */
	EReference getOutputDeviations_OutputDeviation();

	/**
	 * Returns the meta object for class '{@link hiphops.BasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Event</em>'.
	 * @see hiphops.BasicEvent
	 * @generated
	 */
	EClass getBasicEvent();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.BasicEvent#getDefaultString <em>Default String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default String</em>'.
	 * @see hiphops.BasicEvent#getDefaultString()
	 * @see #getBasicEvent()
	 * @generated
	 */
	EAttribute getBasicEvent_DefaultString();

	/**
	 * Returns the meta object for class '{@link hiphops.BasicEvents <em>Basic Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Events</em>'.
	 * @see hiphops.BasicEvents
	 * @generated
	 */
	EClass getBasicEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link hiphops.BasicEvents#getBasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Event</em>'.
	 * @see hiphops.BasicEvents#getBasicEvent()
	 * @see #getBasicEvents()
	 * @generated
	 */
	EReference getBasicEvents_BasicEvent();

	/**
	 * Returns the meta object for class '{@link hiphops.NamedClass <em>Named Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Class</em>'.
	 * @see hiphops.NamedClass
	 * @generated
	 */
	EClass getNamedClass();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.NamedClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hiphops.NamedClass#getName()
	 * @see #getNamedClass()
	 * @generated
	 */
	EAttribute getNamedClass_Name();

	/**
	 * Returns the meta object for class '{@link hiphops.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see hiphops.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Line#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connections</em>'.
	 * @see hiphops.Line#getConnections()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Connections();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Line#getP1 <em>P1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>P1</em>'.
	 * @see hiphops.Line#getP1()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_P1();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Line#getP2 <em>P2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>P2</em>'.
	 * @see hiphops.Line#getP2()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_P2();

	/**
	 * Returns the meta object for class '{@link hiphops.DescribedClass <em>Described Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described Class</em>'.
	 * @see hiphops.DescribedClass
	 * @generated
	 */
	EClass getDescribedClass();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.DescribedClass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see hiphops.DescribedClass#getDescription()
	 * @see #getDescribedClass()
	 * @generated
	 */
	EAttribute getDescribedClass_Description();

	/**
	 * Returns the meta object for class '{@link hiphops.AllocAlternative <em>Alloc Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alloc Alternative</em>'.
	 * @see hiphops.AllocAlternative
	 * @generated
	 */
	EClass getAllocAlternative();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.AllocAlternative#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation</em>'.
	 * @see hiphops.AllocAlternative#getAllocation()
	 * @see #getAllocAlternative()
	 * @generated
	 */
	EAttribute getAllocAlternative_Allocation();

	/**
	 * Returns the meta object for class '{@link hiphops.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard</em>'.
	 * @see hiphops.Hazard
	 * @generated
	 */
	EClass getHazard();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Hazard#getSafetyRequirement <em>Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety Requirement</em>'.
	 * @see hiphops.Hazard#getSafetyRequirement()
	 * @see #getHazard()
	 * @generated
	 */
	EAttribute getHazard_SafetyRequirement();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Hazard#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see hiphops.Hazard#getSeverity()
	 * @see #getHazard()
	 * @generated
	 */
	EAttribute getHazard_Severity();

	/**
	 * Returns the meta object for the attribute '{@link hiphops.Hazard#getLogic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logic</em>'.
	 * @see hiphops.Hazard#getLogic()
	 * @see #getHazard()
	 * @generated
	 */
	EAttribute getHazard_Logic();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HiphopsFactory getHiphopsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hiphops.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.ModelImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SYSTEM = eINSTANCE.getModel_System();

		/**
		 * The meta object literal for the '<em><b>Simulation X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__SIMULATION_X = eINSTANCE.getModel_SimulationX();

		/**
		 * The meta object literal for the '<em><b>Hazards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__HAZARDS = eINSTANCE.getModel_Hazards();

		/**
		 * The meta object literal for the '{@link hiphops.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.SystemImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__COMPONENT = eINSTANCE.getSystem_Component();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__LINES = eINSTANCE.getSystem_Lines();

		/**
		 * The meta object literal for the '{@link hiphops.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.ComponentImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMPONENT_TYPE = eINSTANCE.getComponent_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IMPLEMENTATION = eINSTANCE.getComponent_Implementation();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ALLOCATION = eINSTANCE.getComponent_Allocation();

		/**
		 * The meta object literal for the '<em><b>Impalternatives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IMPALTERNATIVES = eINSTANCE.getComponent_Impalternatives();

		/**
		 * The meta object literal for the '<em><b>Allocalternatives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ALLOCALTERNATIVES = eINSTANCE.getComponent_Allocalternatives();

		/**
		 * The meta object literal for the '{@link hiphops.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.PortImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Port Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PORT_TYPE = eINSTANCE.getPort_PortType();

		/**
		 * The meta object literal for the '{@link hiphops.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.ImplementationImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '<em><b>FData</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__FDATA = eINSTANCE.getImplementation_FData();

		/**
		 * The meta object literal for the '<em><b>Exclude From Optimization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__EXCLUDE_FROM_OPTIMIZATION = eINSTANCE.getImplementation_ExcludeFromOptimization();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__SYSTEM = eINSTANCE.getImplementation_System();

		/**
		 * The meta object literal for the '<em><b>HBlock Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__HBLOCK_TYPE = eINSTANCE.getImplementation_H_BlockType();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__COST = eINSTANCE.getImplementation_Cost();

		/**
		 * The meta object literal for the '{@link hiphops.impl.FDataImpl <em>FData</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.FDataImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getFData()
		 * @generated
		 */
		EClass FDATA = eINSTANCE.getFData();

		/**
		 * The meta object literal for the '<em><b>Output Deviations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FDATA__OUTPUT_DEVIATIONS = eINSTANCE.getFData_OutputDeviations();

		/**
		 * The meta object literal for the '<em><b>Basic Events</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FDATA__BASIC_EVENTS = eINSTANCE.getFData_BasicEvents();

		/**
		 * The meta object literal for the '{@link hiphops.impl.OutputDeviationImpl <em>Output Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.OutputDeviationImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getOutputDeviation()
		 * @generated
		 */
		EClass OUTPUT_DEVIATION = eINSTANCE.getOutputDeviation();

		/**
		 * The meta object literal for the '<em><b>Default String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DEVIATION__DEFAULT_STRING = eINSTANCE.getOutputDeviation_DefaultString();

		/**
		 * The meta object literal for the '<em><b>System Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_DEVIATION__SYSTEM_OUT_PORT = eINSTANCE.getOutputDeviation_SystemOutPort();

		/**
		 * The meta object literal for the '{@link hiphops.impl.OutputDeviationsImpl <em>Output Deviations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.OutputDeviationsImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getOutputDeviations()
		 * @generated
		 */
		EClass OUTPUT_DEVIATIONS = eINSTANCE.getOutputDeviations();

		/**
		 * The meta object literal for the '<em><b>Output Deviation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DEVIATIONS__OUTPUT_DEVIATION = eINSTANCE.getOutputDeviations_OutputDeviation();

		/**
		 * The meta object literal for the '{@link hiphops.impl.BasicEventImpl <em>Basic Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.BasicEventImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getBasicEvent()
		 * @generated
		 */
		EClass BASIC_EVENT = eINSTANCE.getBasicEvent();

		/**
		 * The meta object literal for the '<em><b>Default String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_EVENT__DEFAULT_STRING = eINSTANCE.getBasicEvent_DefaultString();

		/**
		 * The meta object literal for the '{@link hiphops.impl.BasicEventsImpl <em>Basic Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.BasicEventsImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getBasicEvents()
		 * @generated
		 */
		EClass BASIC_EVENTS = eINSTANCE.getBasicEvents();

		/**
		 * The meta object literal for the '<em><b>Basic Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_EVENTS__BASIC_EVENT = eINSTANCE.getBasicEvents_BasicEvent();

		/**
		 * The meta object literal for the '{@link hiphops.impl.NamedClassImpl <em>Named Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.NamedClassImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getNamedClass()
		 * @generated
		 */
		EClass NAMED_CLASS = eINSTANCE.getNamedClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_CLASS__NAME = eINSTANCE.getNamedClass_Name();

		/**
		 * The meta object literal for the '{@link hiphops.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.LineImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__CONNECTIONS = eINSTANCE.getLine_Connections();

		/**
		 * The meta object literal for the '<em><b>P1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__P1 = eINSTANCE.getLine_P1();

		/**
		 * The meta object literal for the '<em><b>P2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__P2 = eINSTANCE.getLine_P2();

		/**
		 * The meta object literal for the '{@link hiphops.impl.DescribedClassImpl <em>Described Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.DescribedClassImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getDescribedClass()
		 * @generated
		 */
		EClass DESCRIBED_CLASS = eINSTANCE.getDescribedClass();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED_CLASS__DESCRIPTION = eINSTANCE.getDescribedClass_Description();

		/**
		 * The meta object literal for the '{@link hiphops.impl.AllocAlternativeImpl <em>Alloc Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.AllocAlternativeImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getAllocAlternative()
		 * @generated
		 */
		EClass ALLOC_ALTERNATIVE = eINSTANCE.getAllocAlternative();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOC_ALTERNATIVE__ALLOCATION = eINSTANCE.getAllocAlternative_Allocation();

		/**
		 * The meta object literal for the '{@link hiphops.impl.HazardImpl <em>Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hiphops.impl.HazardImpl
		 * @see hiphops.impl.HiphopsPackageImpl#getHazard()
		 * @generated
		 */
		EClass HAZARD = eINSTANCE.getHazard();

		/**
		 * The meta object literal for the '<em><b>Safety Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD__SAFETY_REQUIREMENT = eINSTANCE.getHazard_SafetyRequirement();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD__SEVERITY = eINSTANCE.getHazard_Severity();

		/**
		 * The meta object literal for the '<em><b>Logic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD__LOGIC = eINSTANCE.getHazard_Logic();

	}

} //HiphopsPackage
