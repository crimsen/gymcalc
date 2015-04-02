/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.exercise;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.DisziplineType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exercise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.gymcalc.exercise.Exercise#getElements <em>Elements</em>}</li>
 *   <li>{@link de.gymcalc.exercise.Exercise#getFinalelement <em>Finalelement</em>}</li>
 *   <li>{@link de.gymcalc.exercise.Exercise#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link de.gymcalc.exercise.Exercise#getAthlet <em>Athlet</em>}</li>
 *   <li>{@link de.gymcalc.exercise.Exercise#getDiszipline <em>Diszipline</em>}</li>
 *   <li>{@link de.gymcalc.exercise.Exercise#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.gymcalc.exercise.Exercise#getVideoRef <em>Video Ref</em>}</li>
 *   <li>{@link de.gymcalc.exercise.Exercise#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.gymcalc.exercise.ExercisePackage#getExercise()
 * @model
 * @generated
 */
public interface Exercise extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.exercise.ElementInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see de.gymcalc.exercise.ExercisePackage#getExercise_Elements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ElementInstance> getElements();

	/**
	 * Returns the value of the '<em><b>Finalelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalelement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalelement</em>' containment reference.
	 * @see #setFinalelement(ElementInstance)
	 * @see de.gymcalc.exercise.ExercisePackage#getExercise_Finalelement()
	 * @model containment="true"
	 * @generated
	 */
	ElementInstance getFinalelement();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.Exercise#getFinalelement <em>Finalelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalelement</em>' containment reference.
	 * @see #getFinalelement()
	 * @generated
	 */
	void setFinalelement(ElementInstance value);

	/**
	 * Returns the value of the '<em><b>Ruleset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruleset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruleset</em>' reference.
	 * @see #setRuleset(Ruleset)
	 * @see de.gymcalc.exercise.ExercisePackage#getExercise_Ruleset()
	 * @model required="true"
	 * @generated
	 */
	Ruleset getRuleset();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.Exercise#getRuleset <em>Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruleset</em>' reference.
	 * @see #getRuleset()
	 * @generated
	 */
	void setRuleset(Ruleset value);

	/**
	 * Returns the value of the '<em><b>Athlet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Athlet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Athlet</em>' reference.
	 * @see #setAthlet(AthletType)
	 * @see de.gymcalc.exercise.ExercisePackage#getExercise_Athlet()
	 * @model required="true"
	 * @generated
	 */
	AthletType getAthlet();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.Exercise#getAthlet <em>Athlet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Athlet</em>' reference.
	 * @see #getAthlet()
	 * @generated
	 */
	void setAthlet(AthletType value);

	/**
	 * Returns the value of the '<em><b>Diszipline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diszipline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diszipline</em>' reference.
	 * @see #setDiszipline(DisziplineType)
	 * @see de.gymcalc.exercise.ExercisePackage#getExercise_Diszipline()
	 * @model required="true"
	 * @generated
	 */
	DisziplineType getDiszipline();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.Exercise#getDiszipline <em>Diszipline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diszipline</em>' reference.
	 * @see #getDiszipline()
	 * @generated
	 */
	void setDiszipline(DisziplineType value);

	/**
	 * Returns the value of the '<em><b>Initial Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Value</em>' attribute.
	 * @see #setInitialValue(double)
	 * @see de.gymcalc.exercise.ExercisePackage#getExercise_InitialValue()
	 * @model default="0.0" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 * @generated
	 */
	double getInitialValue();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.Exercise#getInitialValue <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Value</em>' attribute.
	 * @see #getInitialValue()
	 * @generated
	 */
	void setInitialValue(double value);

	/**
	 * Returns the value of the '<em><b>Video Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Ref</em>' attribute.
	 * @see #setVideoRef(String)
	 * @see de.gymcalc.exercise.ExercisePackage#getExercise_VideoRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 * @generated
	 */
	String getVideoRef();

	/**
	 * Sets the value of the '{@link de.gymcalc.exercise.Exercise#getVideoRef <em>Video Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Ref</em>' attribute.
	 * @see #getVideoRef()
	 * @generated
	 */
	void setVideoRef(String value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link de.gymcalc.exercise.ExerciseEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see de.gymcalc.exercise.ExercisePackage#getExercise_Events()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExerciseEvent> getEvents();

} // Exercise
