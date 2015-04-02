/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.gymcalc.exercise.DifficultyValueEntry;
import de.gymcalc.exercise.Element;
import de.gymcalc.exercise.ElementEvent;
import de.gymcalc.exercise.ElementGroup;
import de.gymcalc.exercise.ElementInstance;
import de.gymcalc.exercise.ElementReferenceGroup;
import de.gymcalc.exercise.Exercise;
import de.gymcalc.exercise.ExerciseCont;
import de.gymcalc.exercise.ExerciseEvent;
import de.gymcalc.exercise.ExercisePackage;
import de.gymcalc.exercise.ExerciseRuleCont;
import de.gymcalc.exercise.Gadget;
import de.gymcalc.exercise.IElement;
import de.gymcalc.exercise.InitialValue;
import de.gymcalc.exercise.Rule;
import de.gymcalc.exercise.RuleElements;
import de.gymcalc.exercise.RuleFinalElement;
import de.gymcalc.exercise.RuleGroup;
import de.gymcalc.exercise.RuleSpecialGroup;
import de.gymcalc.exercise.Ruleset;

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
 * @see de.gymcalc.exercise.ExercisePackage
 * @generated
 */
public class ExerciseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExercisePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseSwitch() {
		if (modelPackage == null) {
			modelPackage = ExercisePackage.eINSTANCE;
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
			case ExercisePackage.EXERCISE: {
				Exercise exercise = (Exercise)theEObject;
				T result = caseExercise(exercise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.IELEMENT: {
				IElement iElement = (IElement)theEObject;
				T result = caseIElement(iElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseIElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.ELEMENT_INSTANCE: {
				ElementInstance elementInstance = (ElementInstance)theEObject;
				T result = caseElementInstance(elementInstance);
				if (result == null) result = caseIElement(elementInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.RULESET: {
				Ruleset ruleset = (Ruleset)theEObject;
				T result = caseRuleset(ruleset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.RULE_ELEMENTS: {
				RuleElements ruleElements = (RuleElements)theEObject;
				T result = caseRuleElements(ruleElements);
				if (result == null) result = caseRule(ruleElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.RULE_GROUP: {
				RuleGroup ruleGroup = (RuleGroup)theEObject;
				T result = caseRuleGroup(ruleGroup);
				if (result == null) result = caseRule(ruleGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.RULE_SPECIAL_GROUP: {
				RuleSpecialGroup ruleSpecialGroup = (RuleSpecialGroup)theEObject;
				T result = caseRuleSpecialGroup(ruleSpecialGroup);
				if (result == null) result = caseRuleGroup(ruleSpecialGroup);
				if (result == null) result = caseRule(ruleSpecialGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.RULE_FINAL_ELEMENT: {
				RuleFinalElement ruleFinalElement = (RuleFinalElement)theEObject;
				T result = caseRuleFinalElement(ruleFinalElement);
				if (result == null) result = caseRule(ruleFinalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.INITIAL_VALUE: {
				InitialValue initialValue = (InitialValue)theEObject;
				T result = caseInitialValue(initialValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.ELEMENT_GROUP: {
				ElementGroup elementGroup = (ElementGroup)theEObject;
				T result = caseElementGroup(elementGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.ELEMENT_REFERENCE_GROUP: {
				ElementReferenceGroup elementReferenceGroup = (ElementReferenceGroup)theEObject;
				T result = caseElementReferenceGroup(elementReferenceGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.GADGET: {
				Gadget gadget = (Gadget)theEObject;
				T result = caseGadget(gadget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.EXERCISE_RULE_CONT: {
				ExerciseRuleCont exerciseRuleCont = (ExerciseRuleCont)theEObject;
				T result = caseExerciseRuleCont(exerciseRuleCont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.EXERCISE_CONT: {
				ExerciseCont exerciseCont = (ExerciseCont)theEObject;
				T result = caseExerciseCont(exerciseCont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.DIFFICULTY_VALUE_ENTRY: {
				DifficultyValueEntry difficultyValueEntry = (DifficultyValueEntry)theEObject;
				T result = caseDifficultyValueEntry(difficultyValueEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.EXERCISE_EVENT: {
				ExerciseEvent exerciseEvent = (ExerciseEvent)theEObject;
				T result = caseExerciseEvent(exerciseEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExercisePackage.ELEMENT_EVENT: {
				ElementEvent elementEvent = (ElementEvent)theEObject;
				T result = caseElementEvent(elementEvent);
				if (result == null) result = caseExerciseEvent(elementEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exercise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exercise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExercise(Exercise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIElement(IElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementInstance(ElementInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruleset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruleset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleset(Ruleset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleElements(RuleElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleGroup(RuleGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Special Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Special Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleSpecialGroup(RuleSpecialGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Final Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Final Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleFinalElement(RuleFinalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialValue(InitialValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementGroup(ElementGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Reference Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Reference Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementReferenceGroup(ElementReferenceGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gadget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gadget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGadget(Gadget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Cont</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Cont</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExerciseRuleCont(ExerciseRuleCont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cont</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cont</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExerciseCont(ExerciseCont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Difficulty Value Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Difficulty Value Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifficultyValueEntry(DifficultyValueEntry object) {
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
	public T caseExerciseEvent(ExerciseEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementEvent(ElementEvent object) {
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

} //ExerciseSwitch
