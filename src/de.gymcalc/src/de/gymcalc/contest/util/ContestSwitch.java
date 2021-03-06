/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.util;

import de.gymcalc.contest.*;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.gymcalc.contest.AthletResultType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.LookupTableType;
import de.gymcalc.contest.LookupTablesType;
import de.gymcalc.contest.ResultType;
import de.gymcalc.contest.StationType;
import de.gymcalc.contest.TeamJuriResultType;
import de.gymcalc.contest.TeamResultType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.gymcalc.contest.ContestPackage
 * @generated
 */
public class ContestSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContestPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContestSwitch() {
		if (modelPackage == null) {
			modelPackage = ContestPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ContestPackage.CONTEST_TYPE: {
				ContestType contestType = (ContestType)theEObject;
				T result = caseContestType(contestType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.CLASS_TYPE: {
				ClassType classType = (ClassType)theEObject;
				T result = caseClassType(classType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.FINAL_CLASS_TYPE: {
				FinalClassType finalClassType = (FinalClassType)theEObject;
				T result = caseFinalClassType(finalClassType);
				if (result == null) result = caseClassType(finalClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.WINNER_TYPE: {
				WinnerType winnerType = (WinnerType)theEObject;
				T result = caseWinnerType(winnerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.ATHLET_TYPE: {
				AthletType athletType = (AthletType)theEObject;
				T result = caseAthletType(athletType);
				if (result == null) result = caseWinnerType(athletType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.TEAM_TYPE: {
				TeamType teamType = (TeamType)theEObject;
				T result = caseTeamType(teamType);
				if (result == null) result = caseWinnerType(teamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.CHAIN_TYPE: {
				ChainType chainType = (ChainType)theEObject;
				T result = caseChainType(chainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.FINAL_CHAIN_TYPE: {
				FinalChainType finalChainType = (FinalChainType)theEObject;
				T result = caseFinalChainType(finalChainType);
				if (result == null) result = caseChainType(finalChainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.DISZIPLINE_TYPE: {
				DisziplineType disziplineType = (DisziplineType)theEObject;
				T result = caseDisziplineType(disziplineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.STATION_TYPE: {
				StationType stationType = (StationType)theEObject;
				T result = caseStationType(stationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.RESULT_TYPE: {
				ResultType resultType = (ResultType)theEObject;
				T result = caseResultType(resultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.ATHLET_RESULT_TYPE: {
				AthletResultType athletResultType = (AthletResultType)theEObject;
				T result = caseAthletResultType(athletResultType);
				if (result == null) result = caseResultType(athletResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.TEAM_RESULT_TYPE: {
				TeamResultType teamResultType = (TeamResultType)theEObject;
				T result = caseTeamResultType(teamResultType);
				if (result == null) result = caseResultType(teamResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.JURI_RESULT_TYPE: {
				JuriResultType juriResultType = (JuriResultType)theEObject;
				T result = caseJuriResultType(juriResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.TEAM_JURI_RESULT_TYPE: {
				TeamJuriResultType teamJuriResultType = (TeamJuriResultType)theEObject;
				T result = caseTeamJuriResultType(teamJuriResultType);
				if (result == null) result = caseJuriResultType(teamJuriResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.JURIST_TYPE: {
				JuristType juristType = (JuristType)theEObject;
				T result = caseJuristType(juristType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.JURI_TYPE: {
				JuriType juriType = (JuriType)theEObject;
				T result = caseJuriType(juriType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.LOOKUP_TABLES_TYPE: {
				LookupTablesType lookupTablesType = (LookupTablesType)theEObject;
				T result = caseLookupTablesType(lookupTablesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.LOOKUP_TABLE_TYPE: {
				LookupTableType lookupTableType = (LookupTableType)theEObject;
				T result = caseLookupTableType(lookupTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.LOOKUP_MAPS_TYPE: {
				LookupMapsType lookupMapsType = (LookupMapsType)theEObject;
				T result = caseLookupMapsType(lookupMapsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.LOOKUP_MAP_TYPE: {
				LookupMapType lookupMapType = (LookupMapType)theEObject;
				T result = caseLookupMapType(lookupMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.JURI_RESULT_DETAIL_TYPE: {
				JuriResultDetailType juriResultDetailType = (JuriResultDetailType)theEObject;
				T result = caseJuriResultDetailType(juriResultDetailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.INT_TO_INT_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<Integer, Integer> intToIntEntry = (Map.Entry<Integer, Integer>)theEObject;
				T result = caseIntToIntEntry(intToIntEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContestPackage.AVERAGE_FUNCTION_TYPE: {
				AverageFunctionType averageFunctionType = (AverageFunctionType)theEObject;
				T result = caseAverageFunctionType(averageFunctionType);
				if (result == null) result = caseFunctionType(averageFunctionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassType(ClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalClassType(FinalClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContestType(ContestType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diszipline Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diszipline Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisziplineType(DisziplineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultType(ResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Athlet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Athlet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAthletType(AthletType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Team Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Team Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeamType(TeamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainType(ChainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Chain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Chain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalChainType(FinalChainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Station Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Station Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStationType(StationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Athlet Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Athlet Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAthletResultType(AthletResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Team Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Team Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeamResultType(TeamResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Juri Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Juri Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJuriResultType(JuriResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jurist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jurist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJuristType(JuristType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Juri Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Juri Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJuriType(JuriType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Winner Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Winner Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWinnerType(WinnerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Team Juri Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Team Juri Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeamJuriResultType(TeamJuriResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lookup Tables Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lookup Tables Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookupTablesType(LookupTablesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lookup Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lookup Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookupTableType(LookupTableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lookup Maps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lookup Maps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookupMapsType(LookupMapsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lookup Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lookup Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookupMapType(LookupMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Juri Result Detail Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Juri Result Detail Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJuriResultDetailType(JuriResultDetailType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int To Int Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int To Int Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntToIntEntry(Map.Entry<Integer, Integer> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Average Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Average Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAverageFunctionType(AverageFunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ContestSwitch
