/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.gymcalc.exercise.ExerciseFactory
 * @model kind="package"
 * @generated
 */
public interface ExercisePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exercise";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gymcalc.de/exercise/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exercise";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExercisePackage eINSTANCE = de.gymcalc.exercise.impl.ExercisePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.ExerciseImpl <em>Exercise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.ExerciseImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getExercise()
	 * @generated
	 */
	int EXERCISE = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Finalelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__FINALELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Ruleset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__RULESET = 2;

	/**
	 * The feature id for the '<em><b>Athlet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__ATHLET = 3;

	/**
	 * The feature id for the '<em><b>Diszipline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__DISZIPLINE = 4;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__INITIAL_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Video Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__VIDEO_REF = 6;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE__EVENTS = 7;

	/**
	 * The number of structural features of the '<em>Exercise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.IElementImpl <em>IElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.IElementImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getIElement()
	 * @generated
	 */
	int IELEMENT = 1;

	/**
	 * The number of structural features of the '<em>IElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.ElementImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__GROUP = IELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = IELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DIFFICULTY = IELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = IELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = IELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.ElementInstanceImpl <em>Element Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.ElementInstanceImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getElementInstance()
	 * @generated
	 */
	int ELEMENT_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INSTANCE__ELEMENT = IELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INSTANCE_FEATURE_COUNT = IELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.RulesetImpl <em>Ruleset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.RulesetImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getRuleset()
	 * @generated
	 */
	int RULESET = 4;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULESET__RULES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULESET__NAME = 1;

	/**
	 * The number of structural features of the '<em>Ruleset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULESET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.RuleImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.RuleElementsImpl <em>Rule Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.RuleElementsImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getRuleElements()
	 * @generated
	 */
	int RULE_ELEMENTS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENTS__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Min Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENTS__MIN_DIFFICULTY = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Count Of Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENTS__COUNT_OF_ELEMENTS = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Difficulty Value Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENTS__DIFFICULTY_VALUE_MAP = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENTS_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.RuleGroupImpl <em>Rule Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.RuleGroupImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getRuleGroup()
	 * @generated
	 */
	int RULE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_GROUP__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Count Of Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_GROUP__COUNT_OF_GROUPS = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_GROUP__MIN_DIFFICULTY = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_GROUP_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.RuleSpecialGroupImpl <em>Rule Special Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.RuleSpecialGroupImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getRuleSpecialGroup()
	 * @generated
	 */
	int RULE_SPECIAL_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SPECIAL_GROUP__NAME = RULE_GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Count Of Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SPECIAL_GROUP__COUNT_OF_GROUPS = RULE_GROUP__COUNT_OF_GROUPS;

	/**
	 * The feature id for the '<em><b>Min Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SPECIAL_GROUP__MIN_DIFFICULTY = RULE_GROUP__MIN_DIFFICULTY;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SPECIAL_GROUP__GROUPS = RULE_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Special Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SPECIAL_GROUP_FEATURE_COUNT = RULE_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.RuleFinalElementImpl <em>Rule Final Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.RuleFinalElementImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getRuleFinalElement()
	 * @generated
	 */
	int RULE_FINAL_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FINAL_ELEMENT__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Difficulty Value Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FINAL_ELEMENT__DIFFICULTY_VALUE_MAP = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Final Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FINAL_ELEMENT_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.InitialValueImpl <em>Initial Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.InitialValueImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getInitialValue()
	 * @generated
	 */
	int INITIAL_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Excercise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE__EXCERCISE = 0;

	/**
	 * The feature id for the '<em><b>Ruleset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE__RULESET = 1;

	/**
	 * The number of structural features of the '<em>Initial Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.ElementGroupImpl <em>Element Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.ElementGroupImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getElementGroup()
	 * @generated
	 */
	int ELEMENT_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP__NUMBER = 2;

	/**
	 * The number of structural features of the '<em>Element Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_GROUP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.ElementReferenceGroupImpl <em>Element Reference Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.ElementReferenceGroupImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getElementReferenceGroup()
	 * @generated
	 */
	int ELEMENT_REFERENCE_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_GROUP__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Element Reference Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFERENCE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.GadgetImpl <em>Gadget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.GadgetImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getGadget()
	 * @generated
	 */
	int GADGET = 13;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GADGET__GROUPS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GADGET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Reference Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GADGET__REFERENCE_GROUPS = 2;

	/**
	 * The number of structural features of the '<em>Gadget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GADGET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.ExerciseRuleContImpl <em>Rule Cont</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.ExerciseRuleContImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getExerciseRuleCont()
	 * @generated
	 */
	int EXERCISE_RULE_CONT = 14;

	/**
	 * The feature id for the '<em><b>Gadgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_RULE_CONT__GADGETS = 0;

	/**
	 * The feature id for the '<em><b>Rulesets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_RULE_CONT__RULESETS = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_RULE_CONT__RULES = 2;

	/**
	 * The number of structural features of the '<em>Rule Cont</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_RULE_CONT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.ExerciseContImpl <em>Cont</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.ExerciseContImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getExerciseCont()
	 * @generated
	 */
	int EXERCISE_CONT = 15;

	/**
	 * The feature id for the '<em><b>Exercises</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_CONT__EXERCISES = 0;

	/**
	 * The number of structural features of the '<em>Cont</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_CONT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.DifficultyValueEntryImpl <em>Difficulty Value Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.DifficultyValueEntryImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getDifficultyValueEntry()
	 * @generated
	 */
	int DIFFICULTY_VALUE_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_VALUE_ENTRY__DIFFICULTY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_VALUE_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Difficulty Value Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFICULTY_VALUE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.ExerciseEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.ExerciseEventImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getExerciseEvent()
	 * @generated
	 */
	int EXERCISE_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_EVENT__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_EVENT__DURATION_TIME = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXERCISE_EVENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.impl.ElementEventImpl <em>Element Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.impl.ElementEventImpl
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getElementEvent()
	 * @generated
	 */
	int ELEMENT_EVENT = 18;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EVENT__START_TIME = EXERCISE_EVENT__START_TIME;

	/**
	 * The feature id for the '<em><b>Duration Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EVENT__DURATION_TIME = EXERCISE_EVENT__DURATION_TIME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EVENT__ELEMENT = EXERCISE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EVENT_FEATURE_COUNT = EXERCISE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gymcalc.exercise.Difficulty <em>Difficulty</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.exercise.Difficulty
	 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getDifficulty()
	 * @generated
	 */
	int DIFFICULTY = 19;


	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.Exercise <em>Exercise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exercise</em>'.
	 * @see de.gymcalc.exercise.Exercise
	 * @generated
	 */
	EClass getExercise();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.exercise.Exercise#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.gymcalc.exercise.Exercise#getElements()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link de.gymcalc.exercise.Exercise#getFinalelement <em>Finalelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finalelement</em>'.
	 * @see de.gymcalc.exercise.Exercise#getFinalelement()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Finalelement();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.exercise.Exercise#getRuleset <em>Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ruleset</em>'.
	 * @see de.gymcalc.exercise.Exercise#getRuleset()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Ruleset();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.exercise.Exercise#getAthlet <em>Athlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Athlet</em>'.
	 * @see de.gymcalc.exercise.Exercise#getAthlet()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Athlet();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.exercise.Exercise#getDiszipline <em>Diszipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diszipline</em>'.
	 * @see de.gymcalc.exercise.Exercise#getDiszipline()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Diszipline();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.Exercise#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see de.gymcalc.exercise.Exercise#getInitialValue()
	 * @see #getExercise()
	 * @generated
	 */
	EAttribute getExercise_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.Exercise#getVideoRef <em>Video Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Video Ref</em>'.
	 * @see de.gymcalc.exercise.Exercise#getVideoRef()
	 * @see #getExercise()
	 * @generated
	 */
	EAttribute getExercise_VideoRef();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.exercise.Exercise#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see de.gymcalc.exercise.Exercise#getEvents()
	 * @see #getExercise()
	 * @generated
	 */
	EReference getExercise_Events();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.IElement <em>IElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IElement</em>'.
	 * @see de.gymcalc.exercise.IElement
	 * @generated
	 */
	EClass getIElement();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see de.gymcalc.exercise.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the container reference '{@link de.gymcalc.exercise.Element#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see de.gymcalc.exercise.Element#getGroup()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Group();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.exercise.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.Element#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see de.gymcalc.exercise.Element#getDifficulty()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Difficulty();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.gymcalc.exercise.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.ElementInstance <em>Element Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Instance</em>'.
	 * @see de.gymcalc.exercise.ElementInstance
	 * @generated
	 */
	EClass getElementInstance();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.exercise.ElementInstance#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see de.gymcalc.exercise.ElementInstance#getElement()
	 * @see #getElementInstance()
	 * @generated
	 */
	EReference getElementInstance_Element();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.Ruleset <em>Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruleset</em>'.
	 * @see de.gymcalc.exercise.Ruleset
	 * @generated
	 */
	EClass getRuleset();

	/**
	 * Returns the meta object for the reference list '{@link de.gymcalc.exercise.Ruleset#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rules</em>'.
	 * @see de.gymcalc.exercise.Ruleset#getRules()
	 * @see #getRuleset()
	 * @generated
	 */
	EReference getRuleset_Rules();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.Ruleset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.exercise.Ruleset#getName()
	 * @see #getRuleset()
	 * @generated
	 */
	EAttribute getRuleset_Name();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see de.gymcalc.exercise.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.exercise.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.RuleElements <em>Rule Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Elements</em>'.
	 * @see de.gymcalc.exercise.RuleElements
	 * @generated
	 */
	EClass getRuleElements();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.RuleElements#getMinDifficulty <em>Min Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Difficulty</em>'.
	 * @see de.gymcalc.exercise.RuleElements#getMinDifficulty()
	 * @see #getRuleElements()
	 * @generated
	 */
	EAttribute getRuleElements_MinDifficulty();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.RuleElements#getCountOfElements <em>Count Of Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Of Elements</em>'.
	 * @see de.gymcalc.exercise.RuleElements#getCountOfElements()
	 * @see #getRuleElements()
	 * @generated
	 */
	EAttribute getRuleElements_CountOfElements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.exercise.RuleElements#getDifficultyValueMap <em>Difficulty Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difficulty Value Map</em>'.
	 * @see de.gymcalc.exercise.RuleElements#getDifficultyValueMap()
	 * @see #getRuleElements()
	 * @generated
	 */
	EReference getRuleElements_DifficultyValueMap();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.RuleGroup <em>Rule Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Group</em>'.
	 * @see de.gymcalc.exercise.RuleGroup
	 * @generated
	 */
	EClass getRuleGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.RuleGroup#getCountOfGroups <em>Count Of Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Of Groups</em>'.
	 * @see de.gymcalc.exercise.RuleGroup#getCountOfGroups()
	 * @see #getRuleGroup()
	 * @generated
	 */
	EAttribute getRuleGroup_CountOfGroups();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.RuleGroup#getMinDifficulty <em>Min Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Difficulty</em>'.
	 * @see de.gymcalc.exercise.RuleGroup#getMinDifficulty()
	 * @see #getRuleGroup()
	 * @generated
	 */
	EAttribute getRuleGroup_MinDifficulty();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.RuleSpecialGroup <em>Rule Special Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Special Group</em>'.
	 * @see de.gymcalc.exercise.RuleSpecialGroup
	 * @generated
	 */
	EClass getRuleSpecialGroup();

	/**
	 * Returns the meta object for the reference list '{@link de.gymcalc.exercise.RuleSpecialGroup#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see de.gymcalc.exercise.RuleSpecialGroup#getGroups()
	 * @see #getRuleSpecialGroup()
	 * @generated
	 */
	EReference getRuleSpecialGroup_Groups();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.RuleFinalElement <em>Rule Final Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Final Element</em>'.
	 * @see de.gymcalc.exercise.RuleFinalElement
	 * @generated
	 */
	EClass getRuleFinalElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.exercise.RuleFinalElement#getDifficultyValueMap <em>Difficulty Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Difficulty Value Map</em>'.
	 * @see de.gymcalc.exercise.RuleFinalElement#getDifficultyValueMap()
	 * @see #getRuleFinalElement()
	 * @generated
	 */
	EReference getRuleFinalElement_DifficultyValueMap();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.InitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Value</em>'.
	 * @see de.gymcalc.exercise.InitialValue
	 * @generated
	 */
	EClass getInitialValue();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.exercise.InitialValue#getExcercise <em>Excercise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Excercise</em>'.
	 * @see de.gymcalc.exercise.InitialValue#getExcercise()
	 * @see #getInitialValue()
	 * @generated
	 */
	EReference getInitialValue_Excercise();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.exercise.InitialValue#getRuleset <em>Ruleset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ruleset</em>'.
	 * @see de.gymcalc.exercise.InitialValue#getRuleset()
	 * @see #getInitialValue()
	 * @generated
	 */
	EReference getInitialValue_Ruleset();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.ElementGroup <em>Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Group</em>'.
	 * @see de.gymcalc.exercise.ElementGroup
	 * @generated
	 */
	EClass getElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.exercise.ElementGroup#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.gymcalc.exercise.ElementGroup#getElements()
	 * @see #getElementGroup()
	 * @generated
	 */
	EReference getElementGroup_Elements();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.ElementGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.exercise.ElementGroup#getName()
	 * @see #getElementGroup()
	 * @generated
	 */
	EAttribute getElementGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.ElementGroup#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see de.gymcalc.exercise.ElementGroup#getNumber()
	 * @see #getElementGroup()
	 * @generated
	 */
	EAttribute getElementGroup_Number();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.ElementReferenceGroup <em>Element Reference Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Reference Group</em>'.
	 * @see de.gymcalc.exercise.ElementReferenceGroup
	 * @generated
	 */
	EClass getElementReferenceGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.ElementReferenceGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.exercise.ElementReferenceGroup#getName()
	 * @see #getElementReferenceGroup()
	 * @generated
	 */
	EAttribute getElementReferenceGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.gymcalc.exercise.ElementReferenceGroup#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see de.gymcalc.exercise.ElementReferenceGroup#getElements()
	 * @see #getElementReferenceGroup()
	 * @generated
	 */
	EReference getElementReferenceGroup_Elements();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.Gadget <em>Gadget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gadget</em>'.
	 * @see de.gymcalc.exercise.Gadget
	 * @generated
	 */
	EClass getGadget();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.exercise.Gadget#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see de.gymcalc.exercise.Gadget#getGroups()
	 * @see #getGadget()
	 * @generated
	 */
	EReference getGadget_Groups();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.Gadget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.exercise.Gadget#getName()
	 * @see #getGadget()
	 * @generated
	 */
	EAttribute getGadget_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.exercise.Gadget#getReferenceGroups <em>Reference Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Groups</em>'.
	 * @see de.gymcalc.exercise.Gadget#getReferenceGroups()
	 * @see #getGadget()
	 * @generated
	 */
	EReference getGadget_ReferenceGroups();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.ExerciseRuleCont <em>Rule Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Cont</em>'.
	 * @see de.gymcalc.exercise.ExerciseRuleCont
	 * @generated
	 */
	EClass getExerciseRuleCont();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.exercise.ExerciseRuleCont#getGadgets <em>Gadgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gadgets</em>'.
	 * @see de.gymcalc.exercise.ExerciseRuleCont#getGadgets()
	 * @see #getExerciseRuleCont()
	 * @generated
	 */
	EReference getExerciseRuleCont_Gadgets();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.exercise.ExerciseRuleCont#getRulesets <em>Rulesets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rulesets</em>'.
	 * @see de.gymcalc.exercise.ExerciseRuleCont#getRulesets()
	 * @see #getExerciseRuleCont()
	 * @generated
	 */
	EReference getExerciseRuleCont_Rulesets();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.exercise.ExerciseRuleCont#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see de.gymcalc.exercise.ExerciseRuleCont#getRules()
	 * @see #getExerciseRuleCont()
	 * @generated
	 */
	EReference getExerciseRuleCont_Rules();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.ExerciseCont <em>Cont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cont</em>'.
	 * @see de.gymcalc.exercise.ExerciseCont
	 * @generated
	 */
	EClass getExerciseCont();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.exercise.ExerciseCont#getExercises <em>Exercises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exercises</em>'.
	 * @see de.gymcalc.exercise.ExerciseCont#getExercises()
	 * @see #getExerciseCont()
	 * @generated
	 */
	EReference getExerciseCont_Exercises();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.DifficultyValueEntry <em>Difficulty Value Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difficulty Value Entry</em>'.
	 * @see de.gymcalc.exercise.DifficultyValueEntry
	 * @generated
	 */
	EClass getDifficultyValueEntry();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.DifficultyValueEntry#getDifficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Difficulty</em>'.
	 * @see de.gymcalc.exercise.DifficultyValueEntry#getDifficulty()
	 * @see #getDifficultyValueEntry()
	 * @generated
	 */
	EAttribute getDifficultyValueEntry_Difficulty();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.DifficultyValueEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.gymcalc.exercise.DifficultyValueEntry#getValue()
	 * @see #getDifficultyValueEntry()
	 * @generated
	 */
	EAttribute getDifficultyValueEntry_Value();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.ExerciseEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see de.gymcalc.exercise.ExerciseEvent
	 * @generated
	 */
	EClass getExerciseEvent();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.ExerciseEvent#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see de.gymcalc.exercise.ExerciseEvent#getStartTime()
	 * @see #getExerciseEvent()
	 * @generated
	 */
	EAttribute getExerciseEvent_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.exercise.ExerciseEvent#getDurationTime <em>Duration Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Time</em>'.
	 * @see de.gymcalc.exercise.ExerciseEvent#getDurationTime()
	 * @see #getExerciseEvent()
	 * @generated
	 */
	EAttribute getExerciseEvent_DurationTime();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.exercise.ElementEvent <em>Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Event</em>'.
	 * @see de.gymcalc.exercise.ElementEvent
	 * @generated
	 */
	EClass getElementEvent();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.exercise.ElementEvent#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see de.gymcalc.exercise.ElementEvent#getElement()
	 * @see #getElementEvent()
	 * @generated
	 */
	EReference getElementEvent_Element();

	/**
	 * Returns the meta object for enum '{@link de.gymcalc.exercise.Difficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Difficulty</em>'.
	 * @see de.gymcalc.exercise.Difficulty
	 * @generated
	 */
	EEnum getDifficulty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExerciseFactory getExerciseFactory();

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
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.ExerciseImpl <em>Exercise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.ExerciseImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getExercise()
		 * @generated
		 */
		EClass EXERCISE = eINSTANCE.getExercise();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__ELEMENTS = eINSTANCE.getExercise_Elements();

		/**
		 * The meta object literal for the '<em><b>Finalelement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__FINALELEMENT = eINSTANCE.getExercise_Finalelement();

		/**
		 * The meta object literal for the '<em><b>Ruleset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__RULESET = eINSTANCE.getExercise_Ruleset();

		/**
		 * The meta object literal for the '<em><b>Athlet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__ATHLET = eINSTANCE.getExercise_Athlet();

		/**
		 * The meta object literal for the '<em><b>Diszipline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__DISZIPLINE = eINSTANCE.getExercise_Diszipline();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXERCISE__INITIAL_VALUE = eINSTANCE.getExercise_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Video Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXERCISE__VIDEO_REF = eINSTANCE.getExercise_VideoRef();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE__EVENTS = eINSTANCE.getExercise_Events();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.IElementImpl <em>IElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.IElementImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getIElement()
		 * @generated
		 */
		EClass IELEMENT = eINSTANCE.getIElement();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.ElementImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__GROUP = eINSTANCE.getElement_Group();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DIFFICULTY = eINSTANCE.getElement_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.ElementInstanceImpl <em>Element Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.ElementInstanceImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getElementInstance()
		 * @generated
		 */
		EClass ELEMENT_INSTANCE = eINSTANCE.getElementInstance();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_INSTANCE__ELEMENT = eINSTANCE.getElementInstance_Element();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.RulesetImpl <em>Ruleset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.RulesetImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getRuleset()
		 * @generated
		 */
		EClass RULESET = eINSTANCE.getRuleset();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULESET__RULES = eINSTANCE.getRuleset_Rules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULESET__NAME = eINSTANCE.getRuleset_Name();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.RuleImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.RuleElementsImpl <em>Rule Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.RuleElementsImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getRuleElements()
		 * @generated
		 */
		EClass RULE_ELEMENTS = eINSTANCE.getRuleElements();

		/**
		 * The meta object literal for the '<em><b>Min Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ELEMENTS__MIN_DIFFICULTY = eINSTANCE.getRuleElements_MinDifficulty();

		/**
		 * The meta object literal for the '<em><b>Count Of Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_ELEMENTS__COUNT_OF_ELEMENTS = eINSTANCE.getRuleElements_CountOfElements();

		/**
		 * The meta object literal for the '<em><b>Difficulty Value Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_ELEMENTS__DIFFICULTY_VALUE_MAP = eINSTANCE.getRuleElements_DifficultyValueMap();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.RuleGroupImpl <em>Rule Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.RuleGroupImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getRuleGroup()
		 * @generated
		 */
		EClass RULE_GROUP = eINSTANCE.getRuleGroup();

		/**
		 * The meta object literal for the '<em><b>Count Of Groups</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_GROUP__COUNT_OF_GROUPS = eINSTANCE.getRuleGroup_CountOfGroups();

		/**
		 * The meta object literal for the '<em><b>Min Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_GROUP__MIN_DIFFICULTY = eINSTANCE.getRuleGroup_MinDifficulty();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.RuleSpecialGroupImpl <em>Rule Special Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.RuleSpecialGroupImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getRuleSpecialGroup()
		 * @generated
		 */
		EClass RULE_SPECIAL_GROUP = eINSTANCE.getRuleSpecialGroup();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SPECIAL_GROUP__GROUPS = eINSTANCE.getRuleSpecialGroup_Groups();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.RuleFinalElementImpl <em>Rule Final Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.RuleFinalElementImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getRuleFinalElement()
		 * @generated
		 */
		EClass RULE_FINAL_ELEMENT = eINSTANCE.getRuleFinalElement();

		/**
		 * The meta object literal for the '<em><b>Difficulty Value Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_FINAL_ELEMENT__DIFFICULTY_VALUE_MAP = eINSTANCE.getRuleFinalElement_DifficultyValueMap();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.InitialValueImpl <em>Initial Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.InitialValueImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getInitialValue()
		 * @generated
		 */
		EClass INITIAL_VALUE = eINSTANCE.getInitialValue();

		/**
		 * The meta object literal for the '<em><b>Excercise</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_VALUE__EXCERCISE = eINSTANCE.getInitialValue_Excercise();

		/**
		 * The meta object literal for the '<em><b>Ruleset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_VALUE__RULESET = eINSTANCE.getInitialValue_Ruleset();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.ElementGroupImpl <em>Element Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.ElementGroupImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getElementGroup()
		 * @generated
		 */
		EClass ELEMENT_GROUP = eINSTANCE.getElementGroup();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_GROUP__ELEMENTS = eINSTANCE.getElementGroup_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_GROUP__NAME = eINSTANCE.getElementGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_GROUP__NUMBER = eINSTANCE.getElementGroup_Number();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.ElementReferenceGroupImpl <em>Element Reference Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.ElementReferenceGroupImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getElementReferenceGroup()
		 * @generated
		 */
		EClass ELEMENT_REFERENCE_GROUP = eINSTANCE.getElementReferenceGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_REFERENCE_GROUP__NAME = eINSTANCE.getElementReferenceGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_REFERENCE_GROUP__ELEMENTS = eINSTANCE.getElementReferenceGroup_Elements();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.GadgetImpl <em>Gadget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.GadgetImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getGadget()
		 * @generated
		 */
		EClass GADGET = eINSTANCE.getGadget();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GADGET__GROUPS = eINSTANCE.getGadget_Groups();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GADGET__NAME = eINSTANCE.getGadget_Name();

		/**
		 * The meta object literal for the '<em><b>Reference Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GADGET__REFERENCE_GROUPS = eINSTANCE.getGadget_ReferenceGroups();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.ExerciseRuleContImpl <em>Rule Cont</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.ExerciseRuleContImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getExerciseRuleCont()
		 * @generated
		 */
		EClass EXERCISE_RULE_CONT = eINSTANCE.getExerciseRuleCont();

		/**
		 * The meta object literal for the '<em><b>Gadgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE_RULE_CONT__GADGETS = eINSTANCE.getExerciseRuleCont_Gadgets();

		/**
		 * The meta object literal for the '<em><b>Rulesets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE_RULE_CONT__RULESETS = eINSTANCE.getExerciseRuleCont_Rulesets();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE_RULE_CONT__RULES = eINSTANCE.getExerciseRuleCont_Rules();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.ExerciseContImpl <em>Cont</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.ExerciseContImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getExerciseCont()
		 * @generated
		 */
		EClass EXERCISE_CONT = eINSTANCE.getExerciseCont();

		/**
		 * The meta object literal for the '<em><b>Exercises</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXERCISE_CONT__EXERCISES = eINSTANCE.getExerciseCont_Exercises();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.DifficultyValueEntryImpl <em>Difficulty Value Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.DifficultyValueEntryImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getDifficultyValueEntry()
		 * @generated
		 */
		EClass DIFFICULTY_VALUE_ENTRY = eINSTANCE.getDifficultyValueEntry();

		/**
		 * The meta object literal for the '<em><b>Difficulty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFICULTY_VALUE_ENTRY__DIFFICULTY = eINSTANCE.getDifficultyValueEntry_Difficulty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFFICULTY_VALUE_ENTRY__VALUE = eINSTANCE.getDifficultyValueEntry_Value();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.ExerciseEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.ExerciseEventImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getExerciseEvent()
		 * @generated
		 */
		EClass EXERCISE_EVENT = eINSTANCE.getExerciseEvent();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXERCISE_EVENT__START_TIME = eINSTANCE.getExerciseEvent_StartTime();

		/**
		 * The meta object literal for the '<em><b>Duration Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXERCISE_EVENT__DURATION_TIME = eINSTANCE.getExerciseEvent_DurationTime();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.impl.ElementEventImpl <em>Element Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.impl.ElementEventImpl
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getElementEvent()
		 * @generated
		 */
		EClass ELEMENT_EVENT = eINSTANCE.getElementEvent();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_EVENT__ELEMENT = eINSTANCE.getElementEvent_Element();

		/**
		 * The meta object literal for the '{@link de.gymcalc.exercise.Difficulty <em>Difficulty</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.exercise.Difficulty
		 * @see de.gymcalc.exercise.impl.ExercisePackageImpl#getDifficulty()
		 * @generated
		 */
		EEnum DIFFICULTY = eINSTANCE.getDifficulty();

	}

} //ExercisePackage
