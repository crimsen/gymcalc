/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.impl;

import de.gymcalc.contest.*;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContestFactoryImpl extends EFactoryImpl implements ContestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContestFactory init() {
		try {
			ContestFactory theContestFactory = (ContestFactory)EPackage.Registry.INSTANCE.getEFactory(ContestPackage.eNS_URI);
			if (theContestFactory != null) {
				return theContestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ContestPackage.CONTEST_TYPE: return createContestType();
			case ContestPackage.CLASS_TYPE: return createClassType();
			case ContestPackage.FINAL_CLASS_TYPE: return createFinalClassType();
			case ContestPackage.WINNER_TYPE: return createWinnerType();
			case ContestPackage.ATHLET_TYPE: return createAthletType();
			case ContestPackage.TEAM_TYPE: return createTeamType();
			case ContestPackage.CHAIN_TYPE: return createChainType();
			case ContestPackage.FINAL_CHAIN_TYPE: return createFinalChainType();
			case ContestPackage.DISZIPLINE_TYPE: return createDisziplineType();
			case ContestPackage.STATION_TYPE: return createStationType();
			case ContestPackage.RESULT_TYPE: return createResultType();
			case ContestPackage.ATHLET_RESULT_TYPE: return createAthletResultType();
			case ContestPackage.TEAM_RESULT_TYPE: return createTeamResultType();
			case ContestPackage.JURI_RESULT_TYPE: return createJuriResultType();
			case ContestPackage.TEAM_JURI_RESULT_TYPE: return createTeamJuriResultType();
			case ContestPackage.JURIST_TYPE: return createJuristType();
			case ContestPackage.JURI_TYPE: return createJuriType();
			case ContestPackage.LOOKUP_TABLES_TYPE: return createLookupTablesType();
			case ContestPackage.LOOKUP_TABLE_TYPE: return createLookupTableType();
			case ContestPackage.LOOKUP_MAPS_TYPE: return createLookupMapsType();
			case ContestPackage.LOOKUP_MAP_TYPE: return createLookupMapType();
			case ContestPackage.JURI_RESULT_DETAIL_TYPE: return createJuriResultDetailType();
			case ContestPackage.INT_TO_INT_ENTRY: return (EObject)createIntToIntEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassType createClassType() {
		ClassTypeImpl classType = new ClassTypeImpl();
		return classType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalClassType createFinalClassType() {
		FinalClassTypeImpl finalClassType = new FinalClassTypeImpl();
		return finalClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContestType createContestType() {
		ContestTypeImpl contestType = new ContestTypeImpl();
		return contestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisziplineType createDisziplineType() {
		DisziplineTypeImpl disziplineType = new DisziplineTypeImpl();
		return disziplineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType createResultType() {
		ResultTypeImpl resultType = new ResultTypeImpl();
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AthletType createAthletType() {
		AthletTypeImpl athletType = new AthletTypeImpl();
		return athletType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamType createTeamType() {
		TeamTypeImpl teamType = new TeamTypeImpl();
		return teamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainType createChainType() {
		ChainTypeImpl chainType = new ChainTypeImpl();
		return chainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalChainType createFinalChainType() {
		FinalChainTypeImpl finalChainType = new FinalChainTypeImpl();
		return finalChainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StationType createStationType() {
		StationTypeImpl stationType = new StationTypeImpl();
		return stationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AthletResultType createAthletResultType() {
		AthletResultTypeImpl athletResultType = new AthletResultTypeImpl();
		return athletResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamResultType createTeamResultType() {
		TeamResultTypeImpl teamResultType = new TeamResultTypeImpl();
		return teamResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JuriResultType createJuriResultType() {
		JuriResultTypeImpl juriResultType = new JuriResultTypeImpl();
		return juriResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JuristType createJuristType() {
		JuristTypeImpl juristType = new JuristTypeImpl();
		return juristType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JuriType createJuriType() {
		JuriTypeImpl juriType = new JuriTypeImpl();
		return juriType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WinnerType createWinnerType() {
		WinnerTypeImpl winnerType = new WinnerTypeImpl();
		return winnerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamJuriResultType createTeamJuriResultType() {
		TeamJuriResultTypeImpl teamJuriResultType = new TeamJuriResultTypeImpl();
		return teamJuriResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupTablesType createLookupTablesType() {
		LookupTablesTypeImpl lookupTablesType = new LookupTablesTypeImpl();
		return lookupTablesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupTableType createLookupTableType() {
		LookupTableTypeImpl lookupTableType = new LookupTableTypeImpl();
		return lookupTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupMapsType createLookupMapsType() {
		LookupMapsTypeImpl lookupMapsType = new LookupMapsTypeImpl();
		return lookupMapsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupMapType createLookupMapType() {
		LookupMapTypeImpl lookupMapType = new LookupMapTypeImpl();
		return lookupMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JuriResultDetailType createJuriResultDetailType() {
		JuriResultDetailTypeImpl juriResultDetailType = new JuriResultDetailTypeImpl();
		return juriResultDetailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Integer, Integer> createIntToIntEntry() {
		IntToIntEntryImpl intToIntEntry = new IntToIntEntryImpl();
		return intToIntEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContestPackage getContestPackage() {
		return (ContestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContestPackage getPackage() {
		return ContestPackage.eINSTANCE;
	}

} //ContestFactoryImpl
