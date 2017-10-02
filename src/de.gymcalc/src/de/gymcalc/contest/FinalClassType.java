/**
 */
package de.gymcalc.contest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.FinalClassType#getOriginatingDiszipline <em>Originating Diszipline</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.contest.ContestPackage#getFinalClassType()
 * @model
 * @generated
 */
public interface FinalClassType extends ClassType {
	/**
	 * Returns the value of the '<em><b>Originating Diszipline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originating Diszipline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originating Diszipline</em>' reference.
	 * @see #setOriginatingDiszipline(DisziplineType)
	 * @see de.gymcalc.contest.ContestPackage#getFinalClassType_OriginatingDiszipline()
	 * @model
	 * @generated
	 */
	DisziplineType getOriginatingDiszipline();

	/**
	 * Sets the value of the '{@link de.gymcalc.contest.FinalClassType#getOriginatingDiszipline <em>Originating Diszipline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originating Diszipline</em>' reference.
	 * @see #getOriginatingDiszipline()
	 * @generated
	 */
	void setOriginatingDiszipline(DisziplineType value);

} // FinalClassType
