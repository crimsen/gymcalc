/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise.impl;

import de.gymcalc.exercise.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ExerciseFactoryImpl extends EFactoryImpl implements ExerciseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExerciseFactory init() {
		try {
			ExerciseFactory theExerciseFactory = (ExerciseFactory)EPackage.Registry.INSTANCE.getEFactory(ExercisePackage.eNS_URI);
			if (theExerciseFactory != null) {
				return theExerciseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExerciseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseFactoryImpl() {
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
			case ExercisePackage.EXERCISE: return createExercise();
			case ExercisePackage.ELEMENT: return createElement();
			case ExercisePackage.ELEMENT_INSTANCE: return createElementInstance();
			case ExercisePackage.RULESET: return createRuleset();
			case ExercisePackage.RULE: return createRule();
			case ExercisePackage.RULE_ELEMENTS: return createRuleElements();
			case ExercisePackage.RULE_GROUP: return createRuleGroup();
			case ExercisePackage.RULE_SPECIAL_GROUP: return createRuleSpecialGroup();
			case ExercisePackage.RULE_FINAL_ELEMENT: return createRuleFinalElement();
			case ExercisePackage.INITIAL_VALUE: return createInitialValue();
			case ExercisePackage.ELEMENT_GROUP: return createElementGroup();
			case ExercisePackage.ELEMENT_REFERENCE_GROUP: return createElementReferenceGroup();
			case ExercisePackage.GADGET: return createGadget();
			case ExercisePackage.EXERCISE_RULE_CONT: return createExerciseRuleCont();
			case ExercisePackage.EXERCISE_CONT: return createExerciseCont();
			case ExercisePackage.DIFFICULTY_VALUE_ENTRY: return createDifficultyValueEntry();
			case ExercisePackage.EXERCISE_EVENT: return createExerciseEvent();
			case ExercisePackage.ELEMENT_EVENT: return createElementEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExercisePackage.DIFFICULTY:
				return createDifficultyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExercisePackage.DIFFICULTY:
				return convertDifficultyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exercise createExercise() {
		ExerciseImpl exercise = new ExerciseImpl();
		return exercise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementInstance createElementInstance() {
		ElementInstanceImpl elementInstance = new ElementInstanceImpl();
		return elementInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ruleset createRuleset() {
		RulesetImpl ruleset = new RulesetImpl();
		return ruleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElements createRuleElements() {
		RuleElementsImpl ruleElements = new RuleElementsImpl();
		return ruleElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleGroup createRuleGroup() {
		RuleGroupImpl ruleGroup = new RuleGroupImpl();
		return ruleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSpecialGroup createRuleSpecialGroup() {
		RuleSpecialGroupImpl ruleSpecialGroup = new RuleSpecialGroupImpl();
		return ruleSpecialGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleFinalElement createRuleFinalElement() {
		RuleFinalElementImpl ruleFinalElement = new RuleFinalElementImpl();
		return ruleFinalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialValue createInitialValue() {
		InitialValueImpl initialValue = new InitialValueImpl();
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroup createElementGroup() {
		ElementGroupImpl elementGroup = new ElementGroupImpl();
		return elementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementReferenceGroup createElementReferenceGroup() {
		ElementReferenceGroupImpl elementReferenceGroup = new ElementReferenceGroupImpl();
		return elementReferenceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gadget createGadget() {
		GadgetImpl gadget = new GadgetImpl();
		return gadget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseRuleCont createExerciseRuleCont() {
		ExerciseRuleContImpl exerciseRuleCont = new ExerciseRuleContImpl();
		return exerciseRuleCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseCont createExerciseCont() {
		ExerciseContImpl exerciseCont = new ExerciseContImpl();
		return exerciseCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifficultyValueEntry createDifficultyValueEntry() {
		DifficultyValueEntryImpl difficultyValueEntry = new DifficultyValueEntryImpl();
		return difficultyValueEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExerciseEvent createExerciseEvent() {
		ExerciseEventImpl exerciseEvent = new ExerciseEventImpl();
		return exerciseEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementEvent createElementEvent() {
		ElementEventImpl elementEvent = new ElementEventImpl();
		return elementEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Difficulty createDifficultyFromString(EDataType eDataType, String initialValue) {
		Difficulty result = Difficulty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDifficultyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExercisePackage getExercisePackage() {
		return (ExercisePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExercisePackage getPackage() {
		return ExercisePackage.eINSTANCE;
	}

} //ExerciseFactoryImpl
