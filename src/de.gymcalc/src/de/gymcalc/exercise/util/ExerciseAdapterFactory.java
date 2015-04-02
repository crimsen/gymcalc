/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.util;

import de.gymcalc.exercise.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.gymcalc.exercise.ExercisePackage
 * @generated
 */
public class ExerciseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExercisePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExercisePackage.eINSTANCE;
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
	protected ExerciseSwitch<Adapter> modelSwitch =
		new ExerciseSwitch<Adapter>() {
			@Override
			public Adapter caseExercise(Exercise object) {
				return createExerciseAdapter();
			}
			@Override
			public Adapter caseIElement(IElement object) {
				return createIElementAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseElementInstance(ElementInstance object) {
				return createElementInstanceAdapter();
			}
			@Override
			public Adapter caseRuleset(Ruleset object) {
				return createRulesetAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseRuleElements(RuleElements object) {
				return createRuleElementsAdapter();
			}
			@Override
			public Adapter caseRuleGroup(RuleGroup object) {
				return createRuleGroupAdapter();
			}
			@Override
			public Adapter caseRuleSpecialGroup(RuleSpecialGroup object) {
				return createRuleSpecialGroupAdapter();
			}
			@Override
			public Adapter caseRuleFinalElement(RuleFinalElement object) {
				return createRuleFinalElementAdapter();
			}
			@Override
			public Adapter caseInitialValue(InitialValue object) {
				return createInitialValueAdapter();
			}
			@Override
			public Adapter caseElementGroup(ElementGroup object) {
				return createElementGroupAdapter();
			}
			@Override
			public Adapter caseElementReferenceGroup(ElementReferenceGroup object) {
				return createElementReferenceGroupAdapter();
			}
			@Override
			public Adapter caseGadget(Gadget object) {
				return createGadgetAdapter();
			}
			@Override
			public Adapter caseExerciseRuleCont(ExerciseRuleCont object) {
				return createExerciseRuleContAdapter();
			}
			@Override
			public Adapter caseExerciseCont(ExerciseCont object) {
				return createExerciseContAdapter();
			}
			@Override
			public Adapter caseDifficultyValueEntry(DifficultyValueEntry object) {
				return createDifficultyValueEntryAdapter();
			}
			@Override
			public Adapter caseExerciseEvent(ExerciseEvent object) {
				return createExerciseEventAdapter();
			}
			@Override
			public Adapter caseElementEvent(ElementEvent object) {
				return createElementEventAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.Exercise <em>Exercise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.Exercise
	 * @generated
	 */
	public Adapter createExerciseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.IElement <em>IElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.IElement
	 * @generated
	 */
	public Adapter createIElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.ElementInstance <em>Element Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.ElementInstance
	 * @generated
	 */
	public Adapter createElementInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.Ruleset <em>Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.Ruleset
	 * @generated
	 */
	public Adapter createRulesetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.RuleElements <em>Rule Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.RuleElements
	 * @generated
	 */
	public Adapter createRuleElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.RuleGroup <em>Rule Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.RuleGroup
	 * @generated
	 */
	public Adapter createRuleGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.RuleSpecialGroup <em>Rule Special Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.RuleSpecialGroup
	 * @generated
	 */
	public Adapter createRuleSpecialGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.RuleFinalElement <em>Rule Final Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.RuleFinalElement
	 * @generated
	 */
	public Adapter createRuleFinalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.InitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.InitialValue
	 * @generated
	 */
	public Adapter createInitialValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.ElementGroup <em>Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.ElementGroup
	 * @generated
	 */
	public Adapter createElementGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.ElementReferenceGroup <em>Element Reference Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.ElementReferenceGroup
	 * @generated
	 */
	public Adapter createElementReferenceGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.Gadget <em>Gadget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.Gadget
	 * @generated
	 */
	public Adapter createGadgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.ExerciseRuleCont <em>Rule Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.ExerciseRuleCont
	 * @generated
	 */
	public Adapter createExerciseRuleContAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.ExerciseCont <em>Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.ExerciseCont
	 * @generated
	 */
	public Adapter createExerciseContAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.DifficultyValueEntry <em>Difficulty Value Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.DifficultyValueEntry
	 * @generated
	 */
	public Adapter createDifficultyValueEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.ExerciseEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.ExerciseEvent
	 * @generated
	 */
	public Adapter createExerciseEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.exercise.ElementEvent <em>Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.exercise.ElementEvent
	 * @generated
	 */
	public Adapter createElementEventAdapter() {
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

} //ExerciseAdapterFactory
