/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hiphops.util;

import hiphops.AllocAlternative;
import hiphops.BasicEvent;
import hiphops.BasicEvents;
import hiphops.Component;
import hiphops.DescribedClass;
import hiphops.FData;
import hiphops.Hazard;
import hiphops.HiphopsPackage;
import hiphops.Implementation;
import hiphops.Line;
import hiphops.Model;
import hiphops.NamedClass;
import hiphops.OutputDeviation;
import hiphops.OutputDeviations;
import hiphops.Port;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hiphops.HiphopsPackage
 * @generated
 */
public class HiphopsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HiphopsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HiphopsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HiphopsPackage.eINSTANCE;
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
	protected HiphopsSwitch<Adapter> modelSwitch =
		new HiphopsSwitch<Adapter>() {
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseSystem(hiphops.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseImplementation(Implementation object) {
				return createImplementationAdapter();
			}
			@Override
			public Adapter caseFData(FData object) {
				return createFDataAdapter();
			}
			@Override
			public Adapter caseOutputDeviation(OutputDeviation object) {
				return createOutputDeviationAdapter();
			}
			@Override
			public Adapter caseOutputDeviations(OutputDeviations object) {
				return createOutputDeviationsAdapter();
			}
			@Override
			public Adapter caseBasicEvent(BasicEvent object) {
				return createBasicEventAdapter();
			}
			@Override
			public Adapter caseBasicEvents(BasicEvents object) {
				return createBasicEventsAdapter();
			}
			@Override
			public Adapter caseNamedClass(NamedClass object) {
				return createNamedClassAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter caseDescribedClass(DescribedClass object) {
				return createDescribedClassAdapter();
			}
			@Override
			public Adapter caseAllocAlternative(AllocAlternative object) {
				return createAllocAlternativeAdapter();
			}
			@Override
			public Adapter caseHazard(Hazard object) {
				return createHazardAdapter();
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
	 * Creates a new adapter for an object of class '{@link hiphops.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.Implementation
	 * @generated
	 */
	public Adapter createImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.FData <em>FData</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.FData
	 * @generated
	 */
	public Adapter createFDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.OutputDeviation <em>Output Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.OutputDeviation
	 * @generated
	 */
	public Adapter createOutputDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.OutputDeviations <em>Output Deviations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.OutputDeviations
	 * @generated
	 */
	public Adapter createOutputDeviationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.BasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.BasicEvent
	 * @generated
	 */
	public Adapter createBasicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.BasicEvents <em>Basic Events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.BasicEvents
	 * @generated
	 */
	public Adapter createBasicEventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.NamedClass <em>Named Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.NamedClass
	 * @generated
	 */
	public Adapter createNamedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.DescribedClass <em>Described Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.DescribedClass
	 * @generated
	 */
	public Adapter createDescribedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.AllocAlternative <em>Alloc Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.AllocAlternative
	 * @generated
	 */
	public Adapter createAllocAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hiphops.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hiphops.Hazard
	 * @generated
	 */
	public Adapter createHazardAdapter() {
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

} //HiphopsAdapterFactory
