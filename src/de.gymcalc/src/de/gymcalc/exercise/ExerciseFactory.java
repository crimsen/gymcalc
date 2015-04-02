/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.gymcalc.exercise.ExercisePackage
 * @generated
 */
public interface ExerciseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExerciseFactory eINSTANCE = de.gymcalc.exercise.impl.ExerciseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Exercise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exercise</em>'.
	 * @generated
	 */
	Exercise createExercise();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Element Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Instance</em>'.
	 * @generated
	 */
	ElementInstance createElementInstance();

	/**
	 * Returns a new object of class '<em>Ruleset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruleset</em>'.
	 * @generated
	 */
	Ruleset createRuleset();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Rule Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Elements</em>'.
	 * @generated
	 */
	RuleElements createRuleElements();

	/**
	 * Returns a new object of class '<em>Rule Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Group</em>'.
	 * @generated
	 */
	RuleGroup createRuleGroup();

	/**
	 * Returns a new object of class '<em>Rule Special Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Special Group</em>'.
	 * @generated
	 */
	RuleSpecialGroup createRuleSpecialGroup();

	/**
	 * Returns a new object of class '<em>Rule Final Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Final Element</em>'.
	 * @generated
	 */
	RuleFinalElement createRuleFinalElement();

	/**
	 * Returns a new object of class '<em>Initial Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Value</em>'.
	 * @generated
	 */
	InitialValue createInitialValue();

	/**
	 * Returns a new object of class '<em>Element Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Group</em>'.
	 * @generated
	 */
	ElementGroup createElementGroup();

	/**
	 * Returns a new object of class '<em>Element Reference Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Reference Group</em>'.
	 * @generated
	 */
	ElementReferenceGroup createElementReferenceGroup();

	/**
	 * Returns a new object of class '<em>Gadget</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gadget</em>'.
	 * @generated
	 */
	Gadget createGadget();

	/**
	 * Returns a new object of class '<em>Rule Cont</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Cont</em>'.
	 * @generated
	 */
	ExerciseRuleCont createExerciseRuleCont();

	/**
	 * Returns a new object of class '<em>Cont</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cont</em>'.
	 * @generated
	 */
	ExerciseCont createExerciseCont();

	/**
	 * Returns a new object of class '<em>Difficulty Value Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Difficulty Value Entry</em>'.
	 * @generated
	 */
	DifficultyValueEntry createDifficultyValueEntry();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	ExerciseEvent createExerciseEvent();

	/**
	 * Returns a new object of class '<em>Element Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Event</em>'.
	 * @generated
	 */
	ElementEvent createElementEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExercisePackage getExercisePackage();

} //ExerciseFactory
