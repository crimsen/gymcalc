/**
 */
package de.gymcalc.contest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Average Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.gymcalc.contest.AverageFunctionType#getDisziplines <em>Disziplines</em>}</li>
 * </ul>
 *
 * @see de.gymcalc.contest.ContestPackage#getAverageFunctionType()
 * @model
 * @generated
 */
public interface AverageFunctionType extends FunctionType {
	/**
	 * Returns the value of the '<em><b>Disziplines</b></em>' reference list.
	 * The list contents are of type {@link de.gymcalc.contest.DisziplineType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disziplines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disziplines</em>' reference list.
	 * @see de.gymcalc.contest.ContestPackage#getAverageFunctionType_Disziplines()
	 * @model
	 * @generated
	 */
	EList<DisziplineType> getDisziplines();

} // AverageFunctionType
