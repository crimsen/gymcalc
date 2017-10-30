/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.gymcalc.contest.ContestFactory
 * @model kind="package"
 * @generated
 */
public interface ContestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gymcalc.de/contest/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "contest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContestPackage eINSTANCE = de.gymcalc.contest.impl.ContestPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.ClassTypeImpl <em>Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.ClassTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 1;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.ContestTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.ContestTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getContestType()
	 * @generated
	 */
	int CONTEST_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_TYPE__DATE = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_TYPE__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_TYPE__CHAIN = 4;

	/**
	 * The feature id for the '<em><b>Juri</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_TYPE__JURI = 5;

	/**
	 * The feature id for the '<em><b>Station</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_TYPE__STATION = 6;

	/**
	 * The feature id for the '<em><b>Addressbook</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_TYPE__ADDRESSBOOK = 7;

	/**
	 * The feature id for the '<em><b>Lookuptables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_TYPE__LOOKUPTABLES = 8;

	/**
	 * The feature id for the '<em><b>Lookupmaps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_TYPE__LOOKUPMAPS = 9;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_TYPE__VERSION = 10;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEST_TYPE_FEATURE_COUNT = 11;

	/**
	 * The feature id for the '<em><b>Diszipline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__DISZIPLINE = 0;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__WINNER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Calculationkey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__CALCULATIONKEY = 3;

	/**
	 * The number of structural features of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.FinalClassTypeImpl <em>Final Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.FinalClassTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getFinalClassType()
	 * @generated
	 */
	int FINAL_CLASS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Diszipline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CLASS_TYPE__DISZIPLINE = CLASS_TYPE__DISZIPLINE;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CLASS_TYPE__WINNER = CLASS_TYPE__WINNER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CLASS_TYPE__NAME = CLASS_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Calculationkey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CLASS_TYPE__CALCULATIONKEY = CLASS_TYPE__CALCULATIONKEY;

	/**
	 * The feature id for the '<em><b>Originating Diszipline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CLASS_TYPE__ORIGINATING_DISZIPLINE = CLASS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Final Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CLASS_TYPE_FEATURE_COUNT = CLASS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.DisziplineTypeImpl <em>Diszipline Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.DisziplineTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getDisziplineType()
	 * @generated
	 */
	int DISZIPLINE_TYPE = 8;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.ResultTypeImpl <em>Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.ResultTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getResultType()
	 * @generated
	 */
	int RESULT_TYPE = 10;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.WinnerTypeImpl <em>Winner Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.WinnerTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getWinnerType()
	 * @generated
	 */
	int WINNER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINNER_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINNER_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINNER_TYPE__RESULT = 2;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINNER_TYPE__ORGANIZATION = 3;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINNER_TYPE__DISABLE = 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINNER_TYPE__CLASS = 5;

	/**
	 * The number of structural features of the '<em>Winner Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINNER_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.AthletTypeImpl <em>Athlet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.AthletTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getAthletType()
	 * @generated
	 */
	int ATHLET_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_TYPE__ID = WINNER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_TYPE__NAME = WINNER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_TYPE__RESULT = WINNER_TYPE__RESULT;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_TYPE__ORGANIZATION = WINNER_TYPE__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_TYPE__DISABLE = WINNER_TYPE__DISABLE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_TYPE__CLASS = WINNER_TYPE__CLASS;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_TYPE__PERSON = WINNER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_TYPE__TEAM = WINNER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_TYPE__CHAIN = WINNER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Athlet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_TYPE_FEATURE_COUNT = WINNER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.TeamTypeImpl <em>Team Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.TeamTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getTeamType()
	 * @generated
	 */
	int TEAM_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_TYPE__ID = WINNER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_TYPE__NAME = WINNER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_TYPE__RESULT = WINNER_TYPE__RESULT;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_TYPE__ORGANIZATION = WINNER_TYPE__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_TYPE__DISABLE = WINNER_TYPE__DISABLE;

	/**
	 * The feature id for the '<em><b>Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_TYPE__CLASS = WINNER_TYPE__CLASS;

	/**
	 * The feature id for the '<em><b>Athlet</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_TYPE__ATHLET = WINNER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Team Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_TYPE_FEATURE_COUNT = WINNER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.ChainTypeImpl <em>Chain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.ChainTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getChainType()
	 * @generated
	 */
	int CHAIN_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Athlet</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TYPE__ATHLET = 1;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TYPE__STATION = 2;

	/**
	 * The number of structural features of the '<em>Chain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.FinalChainTypeImpl <em>Final Chain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.FinalChainTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getFinalChainType()
	 * @generated
	 */
	int FINAL_CHAIN_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CHAIN_TYPE__NAME = CHAIN_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Athlet</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CHAIN_TYPE__ATHLET = CHAIN_TYPE__ATHLET;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CHAIN_TYPE__STATION = CHAIN_TYPE__STATION;

	/**
	 * The feature id for the '<em><b>Final Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CHAIN_TYPE__FINAL_CLASS = CHAIN_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order Map</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CHAIN_TYPE__ORDER_MAP = CHAIN_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Final Chain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_CHAIN_TYPE_FEATURE_COUNT = CHAIN_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISZIPLINE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISZIPLINE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Station</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISZIPLINE_TYPE__STATION = 2;

	/**
	 * The feature id for the '<em><b>Lookuptable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISZIPLINE_TYPE__LOOKUPTABLE = 3;

	/**
	 * The feature id for the '<em><b>Calculationkey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISZIPLINE_TYPE__CALCULATIONKEY = 4;

	/**
	 * The feature id for the '<em><b>Calculation Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISZIPLINE_TYPE__CALCULATION_FUNCTION = 5;

	/**
	 * The number of structural features of the '<em>Diszipline Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISZIPLINE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.StationTypeImpl <em>Station Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.StationTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getStationType()
	 * @generated
	 */
	int STATION_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Station Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__RANK = 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__POINTS = 1;

	/**
	 * The feature id for the '<em><b>Juriresult</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE__JURIRESULT = 2;

	/**
	 * The number of structural features of the '<em>Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.AthletResultTypeImpl <em>Athlet Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.AthletResultTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getAthletResultType()
	 * @generated
	 */
	int ATHLET_RESULT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_RESULT_TYPE__RANK = RESULT_TYPE__RANK;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_RESULT_TYPE__POINTS = RESULT_TYPE__POINTS;

	/**
	 * The feature id for the '<em><b>Juriresult</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_RESULT_TYPE__JURIRESULT = RESULT_TYPE__JURIRESULT;

	/**
	 * The number of structural features of the '<em>Athlet Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLET_RESULT_TYPE_FEATURE_COUNT = RESULT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.TeamResultTypeImpl <em>Team Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.TeamResultTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getTeamResultType()
	 * @generated
	 */
	int TEAM_RESULT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_RESULT_TYPE__RANK = RESULT_TYPE__RANK;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_RESULT_TYPE__POINTS = RESULT_TYPE__POINTS;

	/**
	 * The feature id for the '<em><b>Juriresult</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_RESULT_TYPE__JURIRESULT = RESULT_TYPE__JURIRESULT;

	/**
	 * The number of structural features of the '<em>Team Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_RESULT_TYPE_FEATURE_COUNT = RESULT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.JuriResultTypeImpl <em>Juri Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.JuriResultTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getJuriResultType()
	 * @generated
	 */
	int JURI_RESULT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Diszipline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURI_RESULT_TYPE__DISZIPLINE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURI_RESULT_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Juri Result Detail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURI_RESULT_TYPE__JURI_RESULT_DETAIL = 2;

	/**
	 * The number of structural features of the '<em>Juri Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURI_RESULT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.JuristTypeImpl <em>Jurist Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.JuristTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getJuristType()
	 * @generated
	 */
	int JURIST_TYPE = 15;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.JuriTypeImpl <em>Juri Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.JuriTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getJuriType()
	 * @generated
	 */
	int JURI_TYPE = 16;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.TeamJuriResultTypeImpl <em>Team Juri Result Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.TeamJuriResultTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getTeamJuriResultType()
	 * @generated
	 */
	int TEAM_JURI_RESULT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Diszipline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_JURI_RESULT_TYPE__DISZIPLINE = JURI_RESULT_TYPE__DISZIPLINE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_JURI_RESULT_TYPE__VALUE = JURI_RESULT_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Juri Result Detail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_JURI_RESULT_TYPE__JURI_RESULT_DETAIL = JURI_RESULT_TYPE__JURI_RESULT_DETAIL;

	/**
	 * The feature id for the '<em><b>Juri Result</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_JURI_RESULT_TYPE__JURI_RESULT = JURI_RESULT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Team Juri Result Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_JURI_RESULT_TYPE_FEATURE_COUNT = JURI_RESULT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURIST_TYPE__PERSON = 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURIST_TYPE__ORGANIZATION = 1;

	/**
	 * The feature id for the '<em><b>Juri</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURIST_TYPE__JURI = 2;

	/**
	 * The number of structural features of the '<em>Jurist Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURIST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Jurist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURI_TYPE__JURIST = 0;

	/**
	 * The feature id for the '<em><b>Diszipline</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURI_TYPE__DISZIPLINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURI_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Juri Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURI_TYPE_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.LookupTablesTypeImpl <em>Lookup Tables Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.LookupTablesTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getLookupTablesType()
	 * @generated
	 */
	int LOOKUP_TABLES_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TABLES_TYPE__TABLE = 0;

	/**
	 * The number of structural features of the '<em>Lookup Tables Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TABLES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.LookupTableTypeImpl <em>Lookup Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.LookupTableTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getLookupTableType()
	 * @generated
	 */
	int LOOKUP_TABLE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TABLE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Min Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TABLE_TYPE__MIN_VAL = 1;

	/**
	 * The feature id for the '<em><b>Max Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TABLE_TYPE__MAX_VAL = 2;

	/**
	 * The feature id for the '<em><b>Disziplines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TABLE_TYPE__DISZIPLINES = 3;

	/**
	 * The number of structural features of the '<em>Lookup Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_TABLE_TYPE_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.LookupMapsTypeImpl <em>Lookup Maps Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.LookupMapsTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getLookupMapsType()
	 * @generated
	 */
	int LOOKUP_MAPS_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MAPS_TYPE__MAP = 0;

	/**
	 * The number of structural features of the '<em>Lookup Maps Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MAPS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.LookupMapTypeImpl <em>Lookup Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.LookupMapTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getLookupMapType()
	 * @generated
	 */
	int LOOKUP_MAP_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MAP_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MAP_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MAP_TYPE__ENTRIES = 2;

	/**
	 * The number of structural features of the '<em>Lookup Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_MAP_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.JuriResultDetailTypeImpl <em>Juri Result Detail Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.JuriResultDetailTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getJuriResultDetailType()
	 * @generated
	 */
	int JURI_RESULT_DETAIL_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURI_RESULT_DETAIL_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURI_RESULT_DETAIL_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Juri Result Detail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JURI_RESULT_DETAIL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.IntToIntEntryImpl <em>Int To Int Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.IntToIntEntryImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getIntToIntEntry()
	 * @generated
	 */
	int INT_TO_INT_ENTRY = 22;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_INT_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_INT_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Int To Int Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TO_INT_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.FunctionTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 23;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.gymcalc.contest.impl.AverageFunctionTypeImpl <em>Average Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.gymcalc.contest.impl.AverageFunctionTypeImpl
	 * @see de.gymcalc.contest.impl.ContestPackageImpl#getAverageFunctionType()
	 * @generated
	 */
	int AVERAGE_FUNCTION_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Disziplines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_FUNCTION_TYPE__DISZIPLINES = FUNCTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Average Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_FUNCTION_TYPE_FEATURE_COUNT = FUNCTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Type</em>'.
	 * @see de.gymcalc.contest.ClassType
	 * @generated
	 */
	EClass getClassType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.contest.ClassType#getDiszipline <em>Diszipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diszipline</em>'.
	 * @see de.gymcalc.contest.ClassType#getDiszipline()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Diszipline();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.contest.ClassType#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Winner</em>'.
	 * @see de.gymcalc.contest.ClassType#getWinner()
	 * @see #getClassType()
	 * @generated
	 */
	EReference getClassType_Winner();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.ClassType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.contest.ClassType#getName()
	 * @see #getClassType()
	 * @generated
	 */
	EAttribute getClassType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.ClassType#getCalculationkey <em>Calculationkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculationkey</em>'.
	 * @see de.gymcalc.contest.ClassType#getCalculationkey()
	 * @see #getClassType()
	 * @generated
	 */
	EAttribute getClassType_Calculationkey();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.FinalClassType <em>Final Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Class Type</em>'.
	 * @see de.gymcalc.contest.FinalClassType
	 * @generated
	 */
	EClass getFinalClassType();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.contest.FinalClassType#getOriginatingDiszipline <em>Originating Diszipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Originating Diszipline</em>'.
	 * @see de.gymcalc.contest.FinalClassType#getOriginatingDiszipline()
	 * @see #getFinalClassType()
	 * @generated
	 */
	EReference getFinalClassType_OriginatingDiszipline();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.ContestType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.gymcalc.contest.ContestType
	 * @generated
	 */
	EClass getContestType();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.ContestType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.gymcalc.contest.ContestType#getId()
	 * @see #getContestType()
	 * @generated
	 */
	EAttribute getContestType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.ContestType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.contest.ContestType#getName()
	 * @see #getContestType()
	 * @generated
	 */
	EAttribute getContestType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.ContestType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see de.gymcalc.contest.ContestType#getDate()
	 * @see #getContestType()
	 * @generated
	 */
	EAttribute getContestType_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.contest.ContestType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see de.gymcalc.contest.ContestType#getClass_()
	 * @see #getContestType()
	 * @generated
	 */
	EReference getContestType_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.contest.ContestType#getChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chain</em>'.
	 * @see de.gymcalc.contest.ContestType#getChain()
	 * @see #getContestType()
	 * @generated
	 */
	EReference getContestType_Chain();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.contest.ContestType#getJuri <em>Juri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Juri</em>'.
	 * @see de.gymcalc.contest.ContestType#getJuri()
	 * @see #getContestType()
	 * @generated
	 */
	EReference getContestType_Juri();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.contest.ContestType#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Station</em>'.
	 * @see de.gymcalc.contest.ContestType#getStation()
	 * @see #getContestType()
	 * @generated
	 */
	EReference getContestType_Station();

	/**
	 * Returns the meta object for the containment reference '{@link de.gymcalc.contest.ContestType#getAddressbook <em>Addressbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Addressbook</em>'.
	 * @see de.gymcalc.contest.ContestType#getAddressbook()
	 * @see #getContestType()
	 * @generated
	 */
	EReference getContestType_Addressbook();

	/**
	 * Returns the meta object for the containment reference '{@link de.gymcalc.contest.ContestType#getLookuptables <em>Lookuptables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookuptables</em>'.
	 * @see de.gymcalc.contest.ContestType#getLookuptables()
	 * @see #getContestType()
	 * @generated
	 */
	EReference getContestType_Lookuptables();

	/**
	 * Returns the meta object for the containment reference '{@link de.gymcalc.contest.ContestType#getLookupmaps <em>Lookupmaps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookupmaps</em>'.
	 * @see de.gymcalc.contest.ContestType#getLookupmaps()
	 * @see #getContestType()
	 * @generated
	 */
	EReference getContestType_Lookupmaps();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.ContestType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.gymcalc.contest.ContestType#getVersion()
	 * @see #getContestType()
	 * @generated
	 */
	EAttribute getContestType_Version();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.DisziplineType <em>Diszipline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diszipline Type</em>'.
	 * @see de.gymcalc.contest.DisziplineType
	 * @generated
	 */
	EClass getDisziplineType();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.DisziplineType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.gymcalc.contest.DisziplineType#getId()
	 * @see #getDisziplineType()
	 * @generated
	 */
	EAttribute getDisziplineType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.DisziplineType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.contest.DisziplineType#getName()
	 * @see #getDisziplineType()
	 * @generated
	 */
	EAttribute getDisziplineType_Name();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.contest.DisziplineType#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Station</em>'.
	 * @see de.gymcalc.contest.DisziplineType#getStation()
	 * @see #getDisziplineType()
	 * @generated
	 */
	EReference getDisziplineType_Station();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.contest.DisziplineType#getLookuptable <em>Lookuptable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lookuptable</em>'.
	 * @see de.gymcalc.contest.DisziplineType#getLookuptable()
	 * @see #getDisziplineType()
	 * @generated
	 */
	EReference getDisziplineType_Lookuptable();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.DisziplineType#getCalculationkey <em>Calculationkey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculationkey</em>'.
	 * @see de.gymcalc.contest.DisziplineType#getCalculationkey()
	 * @see #getDisziplineType()
	 * @generated
	 */
	EAttribute getDisziplineType_Calculationkey();

	/**
	 * Returns the meta object for the containment reference '{@link de.gymcalc.contest.DisziplineType#getCalculationFunction <em>Calculation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculation Function</em>'.
	 * @see de.gymcalc.contest.DisziplineType#getCalculationFunction()
	 * @see #getDisziplineType()
	 * @generated
	 */
	EReference getDisziplineType_CalculationFunction();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Type</em>'.
	 * @see de.gymcalc.contest.ResultType
	 * @generated
	 */
	EClass getResultType();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.ResultType#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see de.gymcalc.contest.ResultType#getRank()
	 * @see #getResultType()
	 * @generated
	 */
	EAttribute getResultType_Rank();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.ResultType#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see de.gymcalc.contest.ResultType#getPoints()
	 * @see #getResultType()
	 * @generated
	 */
	EAttribute getResultType_Points();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.contest.ResultType#getJuriresult <em>Juriresult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Juriresult</em>'.
	 * @see de.gymcalc.contest.ResultType#getJuriresult()
	 * @see #getResultType()
	 * @generated
	 */
	EReference getResultType_Juriresult();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.AthletType <em>Athlet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Athlet Type</em>'.
	 * @see de.gymcalc.contest.AthletType
	 * @generated
	 */
	EClass getAthletType();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.contest.AthletType#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see de.gymcalc.contest.AthletType#getPerson()
	 * @see #getAthletType()
	 * @generated
	 */
	EReference getAthletType_Person();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.contest.AthletType#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see de.gymcalc.contest.AthletType#getTeam()
	 * @see #getAthletType()
	 * @generated
	 */
	EReference getAthletType_Team();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.contest.AthletType#getChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chain</em>'.
	 * @see de.gymcalc.contest.AthletType#getChain()
	 * @see #getAthletType()
	 * @generated
	 */
	EReference getAthletType_Chain();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.TeamType <em>Team Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Type</em>'.
	 * @see de.gymcalc.contest.TeamType
	 * @generated
	 */
	EClass getTeamType();

	/**
	 * Returns the meta object for the reference list '{@link de.gymcalc.contest.TeamType#getAthlet <em>Athlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Athlet</em>'.
	 * @see de.gymcalc.contest.TeamType#getAthlet()
	 * @see #getTeamType()
	 * @generated
	 */
	EReference getTeamType_Athlet();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.ChainType <em>Chain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Type</em>'.
	 * @see de.gymcalc.contest.ChainType
	 * @generated
	 */
	EClass getChainType();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.ChainType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.contest.ChainType#getName()
	 * @see #getChainType()
	 * @generated
	 */
	EAttribute getChainType_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.gymcalc.contest.ChainType#getAthlet <em>Athlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Athlet</em>'.
	 * @see de.gymcalc.contest.ChainType#getAthlet()
	 * @see #getChainType()
	 * @generated
	 */
	EReference getChainType_Athlet();

	/**
	 * Returns the meta object for the reference list '{@link de.gymcalc.contest.ChainType#getStation <em>Station</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Station</em>'.
	 * @see de.gymcalc.contest.ChainType#getStation()
	 * @see #getChainType()
	 * @generated
	 */
	EReference getChainType_Station();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.FinalChainType <em>Final Chain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Chain Type</em>'.
	 * @see de.gymcalc.contest.FinalChainType
	 * @generated
	 */
	EClass getFinalChainType();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.contest.FinalChainType#getFinalClass <em>Final Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Final Class</em>'.
	 * @see de.gymcalc.contest.FinalChainType#getFinalClass()
	 * @see #getFinalChainType()
	 * @generated
	 */
	EReference getFinalChainType_FinalClass();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.contest.FinalChainType#getOrderMap <em>Order Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Order Map</em>'.
	 * @see de.gymcalc.contest.FinalChainType#getOrderMap()
	 * @see #getFinalChainType()
	 * @generated
	 */
	EReference getFinalChainType_OrderMap();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.StationType <em>Station Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Station Type</em>'.
	 * @see de.gymcalc.contest.StationType
	 * @generated
	 */
	EClass getStationType();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.StationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.gymcalc.contest.StationType#getId()
	 * @see #getStationType()
	 * @generated
	 */
	EAttribute getStationType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.StationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.contest.StationType#getName()
	 * @see #getStationType()
	 * @generated
	 */
	EAttribute getStationType_Name();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.AthletResultType <em>Athlet Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Athlet Result Type</em>'.
	 * @see de.gymcalc.contest.AthletResultType
	 * @generated
	 */
	EClass getAthletResultType();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.TeamResultType <em>Team Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Result Type</em>'.
	 * @see de.gymcalc.contest.TeamResultType
	 * @generated
	 */
	EClass getTeamResultType();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.JuriResultType <em>Juri Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Juri Result Type</em>'.
	 * @see de.gymcalc.contest.JuriResultType
	 * @generated
	 */
	EClass getJuriResultType();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.contest.JuriResultType#getDiszipline <em>Diszipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diszipline</em>'.
	 * @see de.gymcalc.contest.JuriResultType#getDiszipline()
	 * @see #getJuriResultType()
	 * @generated
	 */
	EReference getJuriResultType_Diszipline();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.JuriResultType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.gymcalc.contest.JuriResultType#getValue()
	 * @see #getJuriResultType()
	 * @generated
	 */
	EAttribute getJuriResultType_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.contest.JuriResultType#getJuriResultDetail <em>Juri Result Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Juri Result Detail</em>'.
	 * @see de.gymcalc.contest.JuriResultType#getJuriResultDetail()
	 * @see #getJuriResultType()
	 * @generated
	 */
	EReference getJuriResultType_JuriResultDetail();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.JuristType <em>Jurist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jurist Type</em>'.
	 * @see de.gymcalc.contest.JuristType
	 * @generated
	 */
	EClass getJuristType();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.contest.JuristType#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see de.gymcalc.contest.JuristType#getPerson()
	 * @see #getJuristType()
	 * @generated
	 */
	EReference getJuristType_Person();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.contest.JuristType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see de.gymcalc.contest.JuristType#getOrganization()
	 * @see #getJuristType()
	 * @generated
	 */
	EReference getJuristType_Organization();

	/**
	 * Returns the meta object for the container reference '{@link de.gymcalc.contest.JuristType#getJuri <em>Juri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Juri</em>'.
	 * @see de.gymcalc.contest.JuristType#getJuri()
	 * @see #getJuristType()
	 * @generated
	 */
	EReference getJuristType_Juri();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.JuriType <em>Juri Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Juri Type</em>'.
	 * @see de.gymcalc.contest.JuriType
	 * @generated
	 */
	EClass getJuriType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.contest.JuriType#getJurist <em>Jurist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jurist</em>'.
	 * @see de.gymcalc.contest.JuriType#getJurist()
	 * @see #getJuriType()
	 * @generated
	 */
	EReference getJuriType_Jurist();

	/**
	 * Returns the meta object for the reference list '{@link de.gymcalc.contest.JuriType#getDiszipline <em>Diszipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diszipline</em>'.
	 * @see de.gymcalc.contest.JuriType#getDiszipline()
	 * @see #getJuriType()
	 * @generated
	 */
	EReference getJuriType_Diszipline();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.JuriType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.contest.JuriType#getName()
	 * @see #getJuriType()
	 * @generated
	 */
	EAttribute getJuriType_Name();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.WinnerType <em>Winner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Winner Type</em>'.
	 * @see de.gymcalc.contest.WinnerType
	 * @generated
	 */
	EClass getWinnerType();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.WinnerType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.gymcalc.contest.WinnerType#getId()
	 * @see #getWinnerType()
	 * @generated
	 */
	EAttribute getWinnerType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.WinnerType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.contest.WinnerType#getName()
	 * @see #getWinnerType()
	 * @generated
	 */
	EAttribute getWinnerType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.gymcalc.contest.WinnerType#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see de.gymcalc.contest.WinnerType#getResult()
	 * @see #getWinnerType()
	 * @generated
	 */
	EReference getWinnerType_Result();

	/**
	 * Returns the meta object for the reference '{@link de.gymcalc.contest.WinnerType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see de.gymcalc.contest.WinnerType#getOrganization()
	 * @see #getWinnerType()
	 * @generated
	 */
	EReference getWinnerType_Organization();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.WinnerType#getDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable</em>'.
	 * @see de.gymcalc.contest.WinnerType#getDisable()
	 * @see #getWinnerType()
	 * @generated
	 */
	EAttribute getWinnerType_Disable();

	/**
	 * Returns the meta object for the container reference '{@link de.gymcalc.contest.WinnerType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Class</em>'.
	 * @see de.gymcalc.contest.WinnerType#getClass_()
	 * @see #getWinnerType()
	 * @generated
	 */
	EReference getWinnerType_Class();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.TeamJuriResultType <em>Team Juri Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Juri Result Type</em>'.
	 * @see de.gymcalc.contest.TeamJuriResultType
	 * @generated
	 */
	EClass getTeamJuriResultType();

	/**
	 * Returns the meta object for the reference list '{@link de.gymcalc.contest.TeamJuriResultType#getJuriResult <em>Juri Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Juri Result</em>'.
	 * @see de.gymcalc.contest.TeamJuriResultType#getJuriResult()
	 * @see #getTeamJuriResultType()
	 * @generated
	 */
	EReference getTeamJuriResultType_JuriResult();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.LookupTablesType <em>Lookup Tables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Tables Type</em>'.
	 * @see de.gymcalc.contest.LookupTablesType
	 * @generated
	 */
	EClass getLookupTablesType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.contest.LookupTablesType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see de.gymcalc.contest.LookupTablesType#getTable()
	 * @see #getLookupTablesType()
	 * @generated
	 */
	EReference getLookupTablesType_Table();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.LookupTableType <em>Lookup Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Table Type</em>'.
	 * @see de.gymcalc.contest.LookupTableType
	 * @generated
	 */
	EClass getLookupTableType();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.LookupTableType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.gymcalc.contest.LookupTableType#getId()
	 * @see #getLookupTableType()
	 * @generated
	 */
	EAttribute getLookupTableType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.LookupTableType#getMinVal <em>Min Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Val</em>'.
	 * @see de.gymcalc.contest.LookupTableType#getMinVal()
	 * @see #getLookupTableType()
	 * @generated
	 */
	EAttribute getLookupTableType_MinVal();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.LookupTableType#getMaxVal <em>Max Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Val</em>'.
	 * @see de.gymcalc.contest.LookupTableType#getMaxVal()
	 * @see #getLookupTableType()
	 * @generated
	 */
	EAttribute getLookupTableType_MaxVal();

	/**
	 * Returns the meta object for the reference list '{@link de.gymcalc.contest.LookupTableType#getDisziplines <em>Disziplines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disziplines</em>'.
	 * @see de.gymcalc.contest.LookupTableType#getDisziplines()
	 * @see #getLookupTableType()
	 * @generated
	 */
	EReference getLookupTableType_Disziplines();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.LookupMapsType <em>Lookup Maps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Maps Type</em>'.
	 * @see de.gymcalc.contest.LookupMapsType
	 * @generated
	 */
	EClass getLookupMapsType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.gymcalc.contest.LookupMapsType#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Map</em>'.
	 * @see de.gymcalc.contest.LookupMapsType#getMap()
	 * @see #getLookupMapsType()
	 * @generated
	 */
	EReference getLookupMapsType_Map();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.LookupMapType <em>Lookup Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Map Type</em>'.
	 * @see de.gymcalc.contest.LookupMapType
	 * @generated
	 */
	EClass getLookupMapType();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.LookupMapType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.gymcalc.contest.LookupMapType#getId()
	 * @see #getLookupMapType()
	 * @generated
	 */
	EAttribute getLookupMapType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.LookupMapType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.gymcalc.contest.LookupMapType#getName()
	 * @see #getLookupMapType()
	 * @generated
	 */
	EAttribute getLookupMapType_Name();

	/**
	 * Returns the meta object for the map '{@link de.gymcalc.contest.LookupMapType#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entries</em>'.
	 * @see de.gymcalc.contest.LookupMapType#getEntries()
	 * @see #getLookupMapType()
	 * @generated
	 */
	EReference getLookupMapType_Entries();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.JuriResultDetailType <em>Juri Result Detail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Juri Result Detail Type</em>'.
	 * @see de.gymcalc.contest.JuriResultDetailType
	 * @generated
	 */
	EClass getJuriResultDetailType();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.JuriResultDetailType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.gymcalc.contest.JuriResultDetailType#getKey()
	 * @see #getJuriResultDetailType()
	 * @generated
	 */
	EAttribute getJuriResultDetailType_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.gymcalc.contest.JuriResultDetailType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.gymcalc.contest.JuriResultDetailType#getValue()
	 * @see #getJuriResultDetailType()
	 * @generated
	 */
	EAttribute getJuriResultDetailType_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Int To Int Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int To Int Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EIntegerObject"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject"
	 * @generated
	 */
	EClass getIntToIntEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntToIntEntry()
	 * @generated
	 */
	EAttribute getIntToIntEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIntToIntEntry()
	 * @generated
	 */
	EAttribute getIntToIntEntry_Value();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see de.gymcalc.contest.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for class '{@link de.gymcalc.contest.AverageFunctionType <em>Average Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Average Function Type</em>'.
	 * @see de.gymcalc.contest.AverageFunctionType
	 * @generated
	 */
	EClass getAverageFunctionType();

	/**
	 * Returns the meta object for the reference list '{@link de.gymcalc.contest.AverageFunctionType#getDisziplines <em>Disziplines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disziplines</em>'.
	 * @see de.gymcalc.contest.AverageFunctionType#getDisziplines()
	 * @see #getAverageFunctionType()
	 * @generated
	 */
	EReference getAverageFunctionType_Disziplines();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContestFactory getContestFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.ClassTypeImpl <em>Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.ClassTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getClassType()
		 * @generated
		 */
		EClass CLASS_TYPE = eINSTANCE.getClassType();

		/**
		 * The meta object literal for the '<em><b>Diszipline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__DISZIPLINE = eINSTANCE.getClassType_Diszipline();

		/**
		 * The meta object literal for the '<em><b>Winner</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_TYPE__WINNER = eINSTANCE.getClassType_Winner();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_TYPE__NAME = eINSTANCE.getClassType_Name();

		/**
		 * The meta object literal for the '<em><b>Calculationkey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_TYPE__CALCULATIONKEY = eINSTANCE.getClassType_Calculationkey();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.FinalClassTypeImpl <em>Final Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.FinalClassTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getFinalClassType()
		 * @generated
		 */
		EClass FINAL_CLASS_TYPE = eINSTANCE.getFinalClassType();

		/**
		 * The meta object literal for the '<em><b>Originating Diszipline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_CLASS_TYPE__ORIGINATING_DISZIPLINE = eINSTANCE.getFinalClassType_OriginatingDiszipline();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.ContestTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.ContestTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getContestType()
		 * @generated
		 */
		EClass CONTEST_TYPE = eINSTANCE.getContestType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEST_TYPE__ID = eINSTANCE.getContestType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEST_TYPE__NAME = eINSTANCE.getContestType_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEST_TYPE__DATE = eINSTANCE.getContestType_Date();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST_TYPE__CLASS = eINSTANCE.getContestType_Class();

		/**
		 * The meta object literal for the '<em><b>Chain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST_TYPE__CHAIN = eINSTANCE.getContestType_Chain();

		/**
		 * The meta object literal for the '<em><b>Juri</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST_TYPE__JURI = eINSTANCE.getContestType_Juri();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST_TYPE__STATION = eINSTANCE.getContestType_Station();

		/**
		 * The meta object literal for the '<em><b>Addressbook</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST_TYPE__ADDRESSBOOK = eINSTANCE.getContestType_Addressbook();

		/**
		 * The meta object literal for the '<em><b>Lookuptables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST_TYPE__LOOKUPTABLES = eINSTANCE.getContestType_Lookuptables();

		/**
		 * The meta object literal for the '<em><b>Lookupmaps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEST_TYPE__LOOKUPMAPS = eINSTANCE.getContestType_Lookupmaps();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEST_TYPE__VERSION = eINSTANCE.getContestType_Version();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.DisziplineTypeImpl <em>Diszipline Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.DisziplineTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getDisziplineType()
		 * @generated
		 */
		EClass DISZIPLINE_TYPE = eINSTANCE.getDisziplineType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISZIPLINE_TYPE__ID = eINSTANCE.getDisziplineType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISZIPLINE_TYPE__NAME = eINSTANCE.getDisziplineType_Name();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISZIPLINE_TYPE__STATION = eINSTANCE.getDisziplineType_Station();

		/**
		 * The meta object literal for the '<em><b>Lookuptable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISZIPLINE_TYPE__LOOKUPTABLE = eINSTANCE.getDisziplineType_Lookuptable();

		/**
		 * The meta object literal for the '<em><b>Calculationkey</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISZIPLINE_TYPE__CALCULATIONKEY = eINSTANCE.getDisziplineType_Calculationkey();

		/**
		 * The meta object literal for the '<em><b>Calculation Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISZIPLINE_TYPE__CALCULATION_FUNCTION = eINSTANCE.getDisziplineType_CalculationFunction();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.ResultTypeImpl <em>Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.ResultTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getResultType()
		 * @generated
		 */
		EClass RESULT_TYPE = eINSTANCE.getResultType();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_TYPE__RANK = eINSTANCE.getResultType_Rank();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESULT_TYPE__POINTS = eINSTANCE.getResultType_Points();

		/**
		 * The meta object literal for the '<em><b>Juriresult</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_TYPE__JURIRESULT = eINSTANCE.getResultType_Juriresult();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.AthletTypeImpl <em>Athlet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.AthletTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getAthletType()
		 * @generated
		 */
		EClass ATHLET_TYPE = eINSTANCE.getAthletType();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATHLET_TYPE__PERSON = eINSTANCE.getAthletType_Person();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATHLET_TYPE__TEAM = eINSTANCE.getAthletType_Team();

		/**
		 * The meta object literal for the '<em><b>Chain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATHLET_TYPE__CHAIN = eINSTANCE.getAthletType_Chain();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.TeamTypeImpl <em>Team Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.TeamTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getTeamType()
		 * @generated
		 */
		EClass TEAM_TYPE = eINSTANCE.getTeamType();

		/**
		 * The meta object literal for the '<em><b>Athlet</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_TYPE__ATHLET = eINSTANCE.getTeamType_Athlet();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.ChainTypeImpl <em>Chain Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.ChainTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getChainType()
		 * @generated
		 */
		EClass CHAIN_TYPE = eINSTANCE.getChainType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAIN_TYPE__NAME = eINSTANCE.getChainType_Name();

		/**
		 * The meta object literal for the '<em><b>Athlet</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_TYPE__ATHLET = eINSTANCE.getChainType_Athlet();

		/**
		 * The meta object literal for the '<em><b>Station</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_TYPE__STATION = eINSTANCE.getChainType_Station();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.FinalChainTypeImpl <em>Final Chain Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.FinalChainTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getFinalChainType()
		 * @generated
		 */
		EClass FINAL_CHAIN_TYPE = eINSTANCE.getFinalChainType();

		/**
		 * The meta object literal for the '<em><b>Final Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_CHAIN_TYPE__FINAL_CLASS = eINSTANCE.getFinalChainType_FinalClass();

		/**
		 * The meta object literal for the '<em><b>Order Map</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINAL_CHAIN_TYPE__ORDER_MAP = eINSTANCE.getFinalChainType_OrderMap();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.StationTypeImpl <em>Station Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.StationTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getStationType()
		 * @generated
		 */
		EClass STATION_TYPE = eINSTANCE.getStationType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION_TYPE__ID = eINSTANCE.getStationType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATION_TYPE__NAME = eINSTANCE.getStationType_Name();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.AthletResultTypeImpl <em>Athlet Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.AthletResultTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getAthletResultType()
		 * @generated
		 */
		EClass ATHLET_RESULT_TYPE = eINSTANCE.getAthletResultType();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.TeamResultTypeImpl <em>Team Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.TeamResultTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getTeamResultType()
		 * @generated
		 */
		EClass TEAM_RESULT_TYPE = eINSTANCE.getTeamResultType();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.JuriResultTypeImpl <em>Juri Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.JuriResultTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getJuriResultType()
		 * @generated
		 */
		EClass JURI_RESULT_TYPE = eINSTANCE.getJuriResultType();

		/**
		 * The meta object literal for the '<em><b>Diszipline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JURI_RESULT_TYPE__DISZIPLINE = eINSTANCE.getJuriResultType_Diszipline();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JURI_RESULT_TYPE__VALUE = eINSTANCE.getJuriResultType_Value();

		/**
		 * The meta object literal for the '<em><b>Juri Result Detail</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JURI_RESULT_TYPE__JURI_RESULT_DETAIL = eINSTANCE.getJuriResultType_JuriResultDetail();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.JuristTypeImpl <em>Jurist Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.JuristTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getJuristType()
		 * @generated
		 */
		EClass JURIST_TYPE = eINSTANCE.getJuristType();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JURIST_TYPE__PERSON = eINSTANCE.getJuristType_Person();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JURIST_TYPE__ORGANIZATION = eINSTANCE.getJuristType_Organization();

		/**
		 * The meta object literal for the '<em><b>Juri</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JURIST_TYPE__JURI = eINSTANCE.getJuristType_Juri();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.JuriTypeImpl <em>Juri Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.JuriTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getJuriType()
		 * @generated
		 */
		EClass JURI_TYPE = eINSTANCE.getJuriType();

		/**
		 * The meta object literal for the '<em><b>Jurist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JURI_TYPE__JURIST = eINSTANCE.getJuriType_Jurist();

		/**
		 * The meta object literal for the '<em><b>Diszipline</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JURI_TYPE__DISZIPLINE = eINSTANCE.getJuriType_Diszipline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JURI_TYPE__NAME = eINSTANCE.getJuriType_Name();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.WinnerTypeImpl <em>Winner Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.WinnerTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getWinnerType()
		 * @generated
		 */
		EClass WINNER_TYPE = eINSTANCE.getWinnerType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINNER_TYPE__ID = eINSTANCE.getWinnerType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINNER_TYPE__NAME = eINSTANCE.getWinnerType_Name();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINNER_TYPE__RESULT = eINSTANCE.getWinnerType_Result();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINNER_TYPE__ORGANIZATION = eINSTANCE.getWinnerType_Organization();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINNER_TYPE__DISABLE = eINSTANCE.getWinnerType_Disable();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINNER_TYPE__CLASS = eINSTANCE.getWinnerType_Class();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.TeamJuriResultTypeImpl <em>Team Juri Result Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.TeamJuriResultTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getTeamJuriResultType()
		 * @generated
		 */
		EClass TEAM_JURI_RESULT_TYPE = eINSTANCE.getTeamJuriResultType();

		/**
		 * The meta object literal for the '<em><b>Juri Result</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_JURI_RESULT_TYPE__JURI_RESULT = eINSTANCE.getTeamJuriResultType_JuriResult();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.LookupTablesTypeImpl <em>Lookup Tables Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.LookupTablesTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getLookupTablesType()
		 * @generated
		 */
		EClass LOOKUP_TABLES_TYPE = eINSTANCE.getLookupTablesType();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TABLES_TYPE__TABLE = eINSTANCE.getLookupTablesType_Table();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.LookupTableTypeImpl <em>Lookup Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.LookupTableTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getLookupTableType()
		 * @generated
		 */
		EClass LOOKUP_TABLE_TYPE = eINSTANCE.getLookupTableType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_TABLE_TYPE__ID = eINSTANCE.getLookupTableType_Id();

		/**
		 * The meta object literal for the '<em><b>Min Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_TABLE_TYPE__MIN_VAL = eINSTANCE.getLookupTableType_MinVal();

		/**
		 * The meta object literal for the '<em><b>Max Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_TABLE_TYPE__MAX_VAL = eINSTANCE.getLookupTableType_MaxVal();

		/**
		 * The meta object literal for the '<em><b>Disziplines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_TABLE_TYPE__DISZIPLINES = eINSTANCE.getLookupTableType_Disziplines();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.LookupMapsTypeImpl <em>Lookup Maps Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.LookupMapsTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getLookupMapsType()
		 * @generated
		 */
		EClass LOOKUP_MAPS_TYPE = eINSTANCE.getLookupMapsType();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_MAPS_TYPE__MAP = eINSTANCE.getLookupMapsType_Map();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.LookupMapTypeImpl <em>Lookup Map Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.LookupMapTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getLookupMapType()
		 * @generated
		 */
		EClass LOOKUP_MAP_TYPE = eINSTANCE.getLookupMapType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MAP_TYPE__ID = eINSTANCE.getLookupMapType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_MAP_TYPE__NAME = eINSTANCE.getLookupMapType_Name();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_MAP_TYPE__ENTRIES = eINSTANCE.getLookupMapType_Entries();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.JuriResultDetailTypeImpl <em>Juri Result Detail Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.JuriResultDetailTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getJuriResultDetailType()
		 * @generated
		 */
		EClass JURI_RESULT_DETAIL_TYPE = eINSTANCE.getJuriResultDetailType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JURI_RESULT_DETAIL_TYPE__KEY = eINSTANCE.getJuriResultDetailType_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JURI_RESULT_DETAIL_TYPE__VALUE = eINSTANCE.getJuriResultDetailType_Value();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.IntToIntEntryImpl <em>Int To Int Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.IntToIntEntryImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getIntToIntEntry()
		 * @generated
		 */
		EClass INT_TO_INT_ENTRY = eINSTANCE.getIntToIntEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_TO_INT_ENTRY__KEY = eINSTANCE.getIntToIntEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_TO_INT_ENTRY__VALUE = eINSTANCE.getIntToIntEntry_Value();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.FunctionTypeImpl <em>Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.FunctionTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getFunctionType()
		 * @generated
		 */
		EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

		/**
		 * The meta object literal for the '{@link de.gymcalc.contest.impl.AverageFunctionTypeImpl <em>Average Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.gymcalc.contest.impl.AverageFunctionTypeImpl
		 * @see de.gymcalc.contest.impl.ContestPackageImpl#getAverageFunctionType()
		 * @generated
		 */
		EClass AVERAGE_FUNCTION_TYPE = eINSTANCE.getAverageFunctionType();

		/**
		 * The meta object literal for the '<em><b>Disziplines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVERAGE_FUNCTION_TYPE__DISZIPLINES = eINSTANCE.getAverageFunctionType_Disziplines();

	}

} //ContestPackage
