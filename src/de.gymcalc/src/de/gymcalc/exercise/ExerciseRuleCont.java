/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Cont</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.ExerciseRuleCont#getGadgets <em>Gadgets</em>}</li>
 *   <li>{@link de.gymcalc.exercise.ExerciseRuleCont#getRulesets <em>Rulesets</em>}</li>
 *   <li>{@link de.gymcalc.exercise.ExerciseRuleCont#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getExerciseRuleCont()
 * @model
 * @generated
 */
public interface ExerciseRuleCont extends EObject {
	/**
	 * Returns the value of the '<em><b>Gadgets</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.exercise.Gadget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gadgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gadgets</em>' containment reference list.
	 * @see de.gymcalc.exercise.ExercisePackage#getExerciseRuleCont_Gadgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gadget> getGadgets();

	/**
	 * Returns the value of the '<em><b>Rulesets</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.exercise.Ruleset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rulesets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rulesets</em>' containment reference list.
	 * @see de.gymcalc.exercise.ExercisePackage#getExerciseRuleCont_Rulesets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ruleset> getRulesets();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.exercise.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see de.gymcalc.exercise.ExercisePackage#getExerciseRuleCont_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // ExerciseRuleCont
