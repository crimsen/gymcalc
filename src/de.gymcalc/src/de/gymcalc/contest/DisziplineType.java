/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diszipline Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.DisziplineType#getId <em>Id</em>}</li>
 *   <li>{@link de.gymcalc.contest.DisziplineType#getName <em>Name</em>}</li>
 *   <li>{@link de.gymcalc.contest.DisziplineType#getStation <em>Station</em>}</li>
 *   <li>{@link de.gymcalc.contest.DisziplineType#getLookuptable <em>Lookuptable</em>}</li>
 *   <li>{@link de.gymcalc.contest.DisziplineType#getCalculationkey <em>Calculationkey</em>}</li>
 *   <li>{@link de.gymcalc.contest.DisziplineType#getCalculationFunction <em>Calculation Function</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.contest.ContestPackage#getDisziplineType()
 * @model
 * @generated
 */
public interface DisziplineType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.gymcalc.contest.ContestPackage#getDisziplineType_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.DisziplineType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.gymcalc.contest.ContestPackage#getDisziplineType_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.DisziplineType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Station</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Station</em>' reference.
	 * @see #setStation(StationType)
	 * @see de.gymcalc.contest.ContestPackage#getDisziplineType_Station()
	 * @model
	 * @generated
	 */
	StationType getStation();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.DisziplineType#getStation <em>Station</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Station</em>' reference.
	 * @see #getStation()
	 * @generated
	 */
	void setStation(StationType value);

	/**
	 * Returns the value of the '<em><b>Lookuptable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.gymcalc.contest.LookupTableType#getDisziplines <em>Disziplines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lookuptable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lookuptable</em>' reference.
	 * @see #setLookuptable(LookupTableType)
	 * @see de.gymcalc.contest.ContestPackage#getDisziplineType_Lookuptable()
	 * @see de.gymcalc.contest.LookupTableType#getDisziplines
	 * @model opposite="disziplines" transient="true"
	 * @generated
	 */
	LookupTableType getLookuptable();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.DisziplineType#getLookuptable <em>Lookuptable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookuptable</em>' reference.
	 * @see #getLookuptable()
	 * @generated
	 */
	void setLookuptable(LookupTableType value);

	/**
	 * Returns the value of the '<em><b>Calculationkey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculationkey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculationkey</em>' attribute.
	 * @see #setCalculationkey(String)
	 * @see de.gymcalc.contest.ContestPackage#getDisziplineType_Calculationkey()
	 * @model
	 * @generated
	 */
	String getCalculationkey();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.DisziplineType#getCalculationkey <em>Calculationkey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculationkey</em>' attribute.
	 * @see #getCalculationkey()
	 * @generated
	 */
	void setCalculationkey(String value);

	/**
	 * Returns the value of the '<em><b>Calculation Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calculation Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation Function</em>' containment reference.
	 * @see #setCalculationFunction(FunctionType)
	 * @see de.gymcalc.contest.ContestPackage#getDisziplineType_CalculationFunction()
	 * @model containment="true"
	 * @generated
	 */
	FunctionType getCalculationFunction();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.DisziplineType#getCalculationFunction <em>Calculation Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Function</em>' containment reference.
	 * @see #getCalculationFunction()
	 * @generated
	 */
	void setCalculationFunction(FunctionType value);

} // DisziplineType