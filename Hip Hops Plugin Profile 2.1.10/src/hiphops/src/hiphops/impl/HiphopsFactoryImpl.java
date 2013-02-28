/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.impl;

import hiphops.AllocAlternative;
import hiphops.BasicEvent;
import hiphops.BasicEvents;
import hiphops.Component;
import hiphops.DescribedClass;
import hiphops.FData;
import hiphops.Hazard;
import hiphops.HiphopsFactory;
import hiphops.HiphopsPackage;
import hiphops.Implementation;
import hiphops.Line;
import hiphops.Model;
import hiphops.NamedClass;
import hiphops.OutputDeviation;
import hiphops.OutputDeviations;
import hiphops.Port;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HiphopsFactoryImpl extends EFactoryImpl implements HiphopsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HiphopsFactory init() {
		try {
			HiphopsFactory theHiphopsFactory = (HiphopsFactory)EPackage.Registry.INSTANCE.getEFactory("http://md.kth.se/hiphops"); 
			if (theHiphopsFactory != null) {
				return theHiphopsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HiphopsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HiphopsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HiphopsPackage.MODEL: return createModel();
			case HiphopsPackage.SYSTEM: return createSystem();
			case HiphopsPackage.COMPONENT: return createComponent();
			case HiphopsPackage.PORT: return createPort();
			case HiphopsPackage.IMPLEMENTATION: return createImplementation();
			case HiphopsPackage.FDATA: return createFData();
			case HiphopsPackage.OUTPUT_DEVIATION: return createOutputDeviation();
			case HiphopsPackage.OUTPUT_DEVIATIONS: return createOutputDeviations();
			case HiphopsPackage.BASIC_EVENT: return createBasicEvent();
			case HiphopsPackage.BASIC_EVENTS: return createBasicEvents();
			case HiphopsPackage.NAMED_CLASS: return createNamedClass();
			case HiphopsPackage.LINE: return createLine();
			case HiphopsPackage.DESCRIBED_CLASS: return createDescribedClass();
			case HiphopsPackage.ALLOC_ALTERNATIVE: return createAllocAlternative();
			case HiphopsPackage.HAZARD: return createHazard();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hiphops.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementation createImplementation() {
		ImplementationImpl implementation = new ImplementationImpl();
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FData createFData() {
		FDataImpl fData = new FDataImpl();
		return fData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDeviation createOutputDeviation() {
		OutputDeviationImpl outputDeviation = new OutputDeviationImpl();
		return outputDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDeviations createOutputDeviations() {
		OutputDeviationsImpl outputDeviations = new OutputDeviationsImpl();
		return outputDeviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicEvent createBasicEvent() {
		BasicEventImpl basicEvent = new BasicEventImpl();
		return basicEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicEvents createBasicEvents() {
		BasicEventsImpl basicEvents = new BasicEventsImpl();
		return basicEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedClass createNamedClass() {
		NamedClassImpl namedClass = new NamedClassImpl();
		return namedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribedClass createDescribedClass() {
		DescribedClassImpl describedClass = new DescribedClassImpl();
		return describedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocAlternative createAllocAlternative() {
		AllocAlternativeImpl allocAlternative = new AllocAlternativeImpl();
		return allocAlternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard createHazard() {
		HazardImpl hazard = new HazardImpl();
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HiphopsPackage getHiphopsPackage() {
		return (HiphopsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HiphopsPackage getPackage() {
		return HiphopsPackage.eINSTANCE;
	}

} //HiphopsFactoryImpl
