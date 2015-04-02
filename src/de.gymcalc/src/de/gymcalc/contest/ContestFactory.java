/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.gymcalc.contest.ContestPackage
 * @generated
 */
public interface ContestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContestFactory eINSTANCE = de.gymcalc.contest.impl.ContestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Type</em>'.
	 * @generated
	 */
	ClassType createClassType();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	ContestType createContestType();

	/**
	 * Returns a new object of class '<em>Diszipline Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diszipline Type</em>'.
	 * @generated
	 */
	DisziplineType createDisziplineType();

	/**
	 * Returns a new object of class '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Type</em>'.
	 * @generated
	 */
	ResultType createResultType();

	/**
	 * Returns a new object of class '<em>Athlet Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Athlet Type</em>'.
	 * @generated
	 */
	AthletType createAthletType();

	/**
	 * Returns a new object of class '<em>Team Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team Type</em>'.
	 * @generated
	 */
	TeamType createTeamType();

	/**
	 * Returns a new object of class '<em>Chain Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chain Type</em>'.
	 * @generated
	 */
	ChainType createChainType();

	/**
	 * Returns a new object of class '<em>Station Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Station Type</em>'.
	 * @generated
	 */
	StationType createStationType();

	/**
	 * Returns a new object of class '<em>Athlet Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Athlet Result Type</em>'.
	 * @generated
	 */
	AthletResultType createAthletResultType();

	/**
	 * Returns a new object of class '<em>Team Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team Result Type</em>'.
	 * @generated
	 */
	TeamResultType createTeamResultType();

	/**
	 * Returns a new object of class '<em>Juri Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Juri Result Type</em>'.
	 * @generated
	 */
	JuriResultType createJuriResultType();

	/**
	 * Returns a new object of class '<em>Jurist Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jurist Type</em>'.
	 * @generated
	 */
	JuristType createJuristType();

	/**
	 * Returns a new object of class '<em>Juri Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Juri Type</em>'.
	 * @generated
	 */
	JuriType createJuriType();

	/**
	 * Returns a new object of class '<em>Winner Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Winner Type</em>'.
	 * @generated
	 */
	WinnerType createWinnerType();

	/**
	 * Returns a new object of class '<em>Team Juri Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team Juri Result Type</em>'.
	 * @generated
	 */
	TeamJuriResultType createTeamJuriResultType();

	/**
	 * Returns a new object of class '<em>Lookup Tables Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lookup Tables Type</em>'.
	 * @generated
	 */
	LookupTablesType createLookupTablesType();

	/**
	 * Returns a new object of class '<em>Lookup Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lookup Table Type</em>'.
	 * @generated
	 */
	LookupTableType createLookupTableType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContestPackage getContestPackage();

} //ContestFactory
