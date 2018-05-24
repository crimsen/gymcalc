/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.gymcalc.addressbook.AddressBookPackage;
import de.gymcalc.addressbook.impl.AddressBookPackageImpl;
import de.gymcalc.contest.AthletResultType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.AverageFunctionType;
import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestFactory;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.FinalChainType;
import de.gymcalc.contest.FinalClassType;
import de.gymcalc.contest.FunctionType;
import de.gymcalc.contest.JuriResultDetailType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.LookupMapType;
import de.gymcalc.contest.LookupMapsType;
import de.gymcalc.contest.LookupTableType;
import de.gymcalc.contest.LookupTablesType;
import de.gymcalc.contest.ResultType;
import de.gymcalc.contest.StationType;
import de.gymcalc.contest.TeamJuriResultType;
import de.gymcalc.contest.TeamResultType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;
import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContestPackageImpl extends EPackageImpl implements ContestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disziplineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass athletTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalChainTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass athletResultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamResultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass juriResultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass juristTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass juriTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass winnerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamJuriResultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookupTablesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookupTableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookupMapsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookupMapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass juriResultDetailTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intToIntEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass averageFunctionTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.gymcalc.contest.ContestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContestPackageImpl() {
		super(eNS_URI, ContestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ContestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContestPackage init() {
		if (isInited) return (ContestPackage)EPackage.Registry.INSTANCE.getEPackage(ContestPackage.eNS_URI);

		// Obtain or create and register package
		ContestPackageImpl theContestPackage = (ContestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ContestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ContestPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AddressBookPackageImpl theAddressBookPackage = (AddressBookPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AddressBookPackage.eNS_URI) instanceof AddressBookPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AddressBookPackage.eNS_URI) : AddressBookPackage.eINSTANCE);

		// Create package meta-data objects
		theContestPackage.createPackageContents();
		theAddressBookPackage.createPackageContents();

		// Initialize created meta-data
		theContestPackage.initializePackageContents();
		theAddressBookPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContestPackage.eNS_URI, theContestPackage);
		return theContestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassType() {
		return classTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassType_Diszipline() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassType_Winner() {
		return (EReference)classTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassType_Name() {
		return (EAttribute)classTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassType_Calculationkey() {
		return (EAttribute)classTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalClassType() {
		return finalClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalClassType_OriginatingDiszipline() {
		return (EReference)finalClassTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContestType() {
		return contestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContestType_Id() {
		return (EAttribute)contestTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContestType_Name() {
		return (EAttribute)contestTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContestType_Date() {
		return (EAttribute)contestTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContestType_Class() {
		return (EReference)contestTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContestType_Chain() {
		return (EReference)contestTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContestType_Juri() {
		return (EReference)contestTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContestType_Station() {
		return (EReference)contestTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContestType_Addressbook() {
		return (EReference)contestTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContestType_Lookuptables() {
		return (EReference)contestTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContestType_Lookupmaps() {
		return (EReference)contestTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContestType_Version() {
		return (EAttribute)contestTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisziplineType() {
		return disziplineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisziplineType_Id() {
		return (EAttribute)disziplineTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisziplineType_Name() {
		return (EAttribute)disziplineTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisziplineType_Station() {
		return (EReference)disziplineTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisziplineType_Lookuptable() {
		return (EReference)disziplineTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisziplineType_Calculationkey() {
		return (EAttribute)disziplineTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisziplineType_CalculationFunction() {
		return (EReference)disziplineTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultType() {
		return resultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Rank() {
		return (EAttribute)resultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultType_Points() {
		return (EAttribute)resultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultType_Juriresult() {
		return (EReference)resultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAthletType() {
		return athletTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAthletType_Person() {
		return (EReference)athletTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAthletType_Team() {
		return (EReference)athletTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAthletType_Chain() {
		return (EReference)athletTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeamType() {
		return teamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamType_Athlet() {
		return (EReference)teamTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainType() {
		return chainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChainType_Name() {
		return (EAttribute)chainTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainType_Athlet() {
		return (EReference)chainTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainType_Station() {
		return (EReference)chainTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalChainType() {
		return finalChainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalChainType_FinalClass() {
		return (EReference)finalChainTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinalChainType_OrderMap() {
		return (EReference)finalChainTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStationType() {
		return stationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationType_Id() {
		return (EAttribute)stationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStationType_Name() {
		return (EAttribute)stationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAthletResultType() {
		return athletResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeamResultType() {
		return teamResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJuriResultType() {
		return juriResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJuriResultType_Diszipline() {
		return (EReference)juriResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJuriResultType_Value() {
		return (EAttribute)juriResultTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJuriResultType_JuriResultDetail() {
		return (EReference)juriResultTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJuristType() {
		return juristTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJuristType_Person() {
		return (EReference)juristTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJuristType_Organization() {
		return (EReference)juristTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJuristType_Juri() {
		return (EReference)juristTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJuristType_WishApparatus() {
		return (EAttribute)juristTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJuristType_License() {
		return (EAttribute)juristTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJuriType() {
		return juriTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJuriType_Jurist() {
		return (EReference)juriTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJuriType_Diszipline() {
		return (EReference)juriTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJuriType_Name() {
		return (EAttribute)juriTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWinnerType() {
		return winnerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWinnerType_Id() {
		return (EAttribute)winnerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWinnerType_Name() {
		return (EAttribute)winnerTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWinnerType_Result() {
		return (EReference)winnerTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWinnerType_Organization() {
		return (EReference)winnerTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWinnerType_Disable() {
		return (EAttribute)winnerTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWinnerType_Class() {
		return (EReference)winnerTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeamJuriResultType() {
		return teamJuriResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTeamJuriResultType_JuriResult() {
		return (EReference)teamJuriResultTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookupTablesType() {
		return lookupTablesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupTablesType_Table() {
		return (EReference)lookupTablesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookupTableType() {
		return lookupTableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupTableType_Id() {
		return (EAttribute)lookupTableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupTableType_MinVal() {
		return (EAttribute)lookupTableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupTableType_MaxVal() {
		return (EAttribute)lookupTableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupTableType_Disziplines() {
		return (EReference)lookupTableTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookupMapsType() {
		return lookupMapsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupMapsType_Map() {
		return (EReference)lookupMapsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookupMapType() {
		return lookupMapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupMapType_Id() {
		return (EAttribute)lookupMapTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookupMapType_Name() {
		return (EAttribute)lookupMapTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookupMapType_Entries() {
		return (EReference)lookupMapTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJuriResultDetailType() {
		return juriResultDetailTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJuriResultDetailType_Key() {
		return (EAttribute)juriResultDetailTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJuriResultDetailType_Value() {
		return (EAttribute)juriResultDetailTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntToIntEntry() {
		return intToIntEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntToIntEntry_Key() {
		return (EAttribute)intToIntEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntToIntEntry_Value() {
		return (EAttribute)intToIntEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAverageFunctionType() {
		return averageFunctionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAverageFunctionType_Disziplines() {
		return (EReference)averageFunctionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContestFactory getContestFactory() {
		return (ContestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contestTypeEClass = createEClass(CONTEST_TYPE);
		createEAttribute(contestTypeEClass, CONTEST_TYPE__ID);
		createEAttribute(contestTypeEClass, CONTEST_TYPE__NAME);
		createEAttribute(contestTypeEClass, CONTEST_TYPE__DATE);
		createEReference(contestTypeEClass, CONTEST_TYPE__CLASS);
		createEReference(contestTypeEClass, CONTEST_TYPE__CHAIN);
		createEReference(contestTypeEClass, CONTEST_TYPE__JURI);
		createEReference(contestTypeEClass, CONTEST_TYPE__STATION);
		createEReference(contestTypeEClass, CONTEST_TYPE__ADDRESSBOOK);
		createEReference(contestTypeEClass, CONTEST_TYPE__LOOKUPTABLES);
		createEReference(contestTypeEClass, CONTEST_TYPE__LOOKUPMAPS);
		createEAttribute(contestTypeEClass, CONTEST_TYPE__VERSION);

		classTypeEClass = createEClass(CLASS_TYPE);
		createEReference(classTypeEClass, CLASS_TYPE__DISZIPLINE);
		createEReference(classTypeEClass, CLASS_TYPE__WINNER);
		createEAttribute(classTypeEClass, CLASS_TYPE__NAME);
		createEAttribute(classTypeEClass, CLASS_TYPE__CALCULATIONKEY);

		finalClassTypeEClass = createEClass(FINAL_CLASS_TYPE);
		createEReference(finalClassTypeEClass, FINAL_CLASS_TYPE__ORIGINATING_DISZIPLINE);

		winnerTypeEClass = createEClass(WINNER_TYPE);
		createEAttribute(winnerTypeEClass, WINNER_TYPE__ID);
		createEAttribute(winnerTypeEClass, WINNER_TYPE__NAME);
		createEReference(winnerTypeEClass, WINNER_TYPE__RESULT);
		createEReference(winnerTypeEClass, WINNER_TYPE__ORGANIZATION);
		createEAttribute(winnerTypeEClass, WINNER_TYPE__DISABLE);
		createEReference(winnerTypeEClass, WINNER_TYPE__CLASS);

		athletTypeEClass = createEClass(ATHLET_TYPE);
		createEReference(athletTypeEClass, ATHLET_TYPE__PERSON);
		createEReference(athletTypeEClass, ATHLET_TYPE__TEAM);
		createEReference(athletTypeEClass, ATHLET_TYPE__CHAIN);

		teamTypeEClass = createEClass(TEAM_TYPE);
		createEReference(teamTypeEClass, TEAM_TYPE__ATHLET);

		chainTypeEClass = createEClass(CHAIN_TYPE);
		createEAttribute(chainTypeEClass, CHAIN_TYPE__NAME);
		createEReference(chainTypeEClass, CHAIN_TYPE__ATHLET);
		createEReference(chainTypeEClass, CHAIN_TYPE__STATION);

		finalChainTypeEClass = createEClass(FINAL_CHAIN_TYPE);
		createEReference(finalChainTypeEClass, FINAL_CHAIN_TYPE__FINAL_CLASS);
		createEReference(finalChainTypeEClass, FINAL_CHAIN_TYPE__ORDER_MAP);

		disziplineTypeEClass = createEClass(DISZIPLINE_TYPE);
		createEAttribute(disziplineTypeEClass, DISZIPLINE_TYPE__ID);
		createEAttribute(disziplineTypeEClass, DISZIPLINE_TYPE__NAME);
		createEReference(disziplineTypeEClass, DISZIPLINE_TYPE__STATION);
		createEReference(disziplineTypeEClass, DISZIPLINE_TYPE__LOOKUPTABLE);
		createEAttribute(disziplineTypeEClass, DISZIPLINE_TYPE__CALCULATIONKEY);
		createEReference(disziplineTypeEClass, DISZIPLINE_TYPE__CALCULATION_FUNCTION);

		stationTypeEClass = createEClass(STATION_TYPE);
		createEAttribute(stationTypeEClass, STATION_TYPE__ID);
		createEAttribute(stationTypeEClass, STATION_TYPE__NAME);

		resultTypeEClass = createEClass(RESULT_TYPE);
		createEAttribute(resultTypeEClass, RESULT_TYPE__RANK);
		createEAttribute(resultTypeEClass, RESULT_TYPE__POINTS);
		createEReference(resultTypeEClass, RESULT_TYPE__JURIRESULT);

		athletResultTypeEClass = createEClass(ATHLET_RESULT_TYPE);

		teamResultTypeEClass = createEClass(TEAM_RESULT_TYPE);

		juriResultTypeEClass = createEClass(JURI_RESULT_TYPE);
		createEReference(juriResultTypeEClass, JURI_RESULT_TYPE__DISZIPLINE);
		createEAttribute(juriResultTypeEClass, JURI_RESULT_TYPE__VALUE);
		createEReference(juriResultTypeEClass, JURI_RESULT_TYPE__JURI_RESULT_DETAIL);

		teamJuriResultTypeEClass = createEClass(TEAM_JURI_RESULT_TYPE);
		createEReference(teamJuriResultTypeEClass, TEAM_JURI_RESULT_TYPE__JURI_RESULT);

		juristTypeEClass = createEClass(JURIST_TYPE);
		createEReference(juristTypeEClass, JURIST_TYPE__PERSON);
		createEReference(juristTypeEClass, JURIST_TYPE__ORGANIZATION);
		createEReference(juristTypeEClass, JURIST_TYPE__JURI);
		createEAttribute(juristTypeEClass, JURIST_TYPE__WISH_APPARATUS);
		createEAttribute(juristTypeEClass, JURIST_TYPE__LICENSE);

		juriTypeEClass = createEClass(JURI_TYPE);
		createEReference(juriTypeEClass, JURI_TYPE__JURIST);
		createEReference(juriTypeEClass, JURI_TYPE__DISZIPLINE);
		createEAttribute(juriTypeEClass, JURI_TYPE__NAME);

		lookupTablesTypeEClass = createEClass(LOOKUP_TABLES_TYPE);
		createEReference(lookupTablesTypeEClass, LOOKUP_TABLES_TYPE__TABLE);

		lookupTableTypeEClass = createEClass(LOOKUP_TABLE_TYPE);
		createEAttribute(lookupTableTypeEClass, LOOKUP_TABLE_TYPE__ID);
		createEAttribute(lookupTableTypeEClass, LOOKUP_TABLE_TYPE__MIN_VAL);
		createEAttribute(lookupTableTypeEClass, LOOKUP_TABLE_TYPE__MAX_VAL);
		createEReference(lookupTableTypeEClass, LOOKUP_TABLE_TYPE__DISZIPLINES);

		lookupMapsTypeEClass = createEClass(LOOKUP_MAPS_TYPE);
		createEReference(lookupMapsTypeEClass, LOOKUP_MAPS_TYPE__MAP);

		lookupMapTypeEClass = createEClass(LOOKUP_MAP_TYPE);
		createEAttribute(lookupMapTypeEClass, LOOKUP_MAP_TYPE__ID);
		createEAttribute(lookupMapTypeEClass, LOOKUP_MAP_TYPE__NAME);
		createEReference(lookupMapTypeEClass, LOOKUP_MAP_TYPE__ENTRIES);

		juriResultDetailTypeEClass = createEClass(JURI_RESULT_DETAIL_TYPE);
		createEAttribute(juriResultDetailTypeEClass, JURI_RESULT_DETAIL_TYPE__KEY);
		createEAttribute(juriResultDetailTypeEClass, JURI_RESULT_DETAIL_TYPE__VALUE);

		intToIntEntryEClass = createEClass(INT_TO_INT_ENTRY);
		createEAttribute(intToIntEntryEClass, INT_TO_INT_ENTRY__KEY);
		createEAttribute(intToIntEntryEClass, INT_TO_INT_ENTRY__VALUE);

		functionTypeEClass = createEClass(FUNCTION_TYPE);

		averageFunctionTypeEClass = createEClass(AVERAGE_FUNCTION_TYPE);
		createEReference(averageFunctionTypeEClass, AVERAGE_FUNCTION_TYPE__DISZIPLINES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AddressBookPackage theAddressBookPackage = (AddressBookPackage)EPackage.Registry.INSTANCE.getEPackage(AddressBookPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAddressBookPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		finalClassTypeEClass.getESuperTypes().add(this.getClassType());
		athletTypeEClass.getESuperTypes().add(this.getWinnerType());
		teamTypeEClass.getESuperTypes().add(this.getWinnerType());
		finalChainTypeEClass.getESuperTypes().add(this.getChainType());
		athletResultTypeEClass.getESuperTypes().add(this.getResultType());
		teamResultTypeEClass.getESuperTypes().add(this.getResultType());
		teamJuriResultTypeEClass.getESuperTypes().add(this.getJuriResultType());
		averageFunctionTypeEClass.getESuperTypes().add(this.getFunctionType());

		// Initialize classes and features; add operations and parameters
		initEClass(contestTypeEClass, ContestType.class, "ContestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContestType_Id(), ecorePackage.getEString(), "id", null, 1, 1, ContestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContestType_Name(), ecorePackage.getEString(), "name", null, 1, 1, ContestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContestType_Date(), ecorePackage.getEDate(), "date", null, 0, 1, ContestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContestType_Class(), this.getClassType(), null, "class", null, 0, -1, ContestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContestType_Chain(), this.getChainType(), null, "chain", null, 0, -1, ContestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContestType_Juri(), this.getJuriType(), null, "juri", null, 0, -1, ContestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContestType_Station(), this.getStationType(), null, "station", null, 0, -1, ContestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContestType_Addressbook(), theAddressBookPackage.getAddressBookType(), null, "addressbook", null, 0, 1, ContestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContestType_Lookuptables(), this.getLookupTablesType(), null, "lookuptables", null, 0, 1, ContestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContestType_Lookupmaps(), this.getLookupMapsType(), null, "lookupmaps", null, 0, 1, ContestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContestType_Version(), ecorePackage.getEInt(), "version", "1", 1, 1, ContestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classTypeEClass, ClassType.class, "ClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassType_Diszipline(), this.getDisziplineType(), null, "diszipline", null, 0, -1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassType_Winner(), this.getWinnerType(), this.getWinnerType_Class(), "winner", null, 0, -1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassType_Name(), ecorePackage.getEString(), "name", null, 1, 1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassType_Calculationkey(), ecorePackage.getEString(), "calculationkey", null, 0, 1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalClassTypeEClass, FinalClassType.class, "FinalClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinalClassType_OriginatingDiszipline(), this.getDisziplineType(), null, "originatingDiszipline", null, 0, 1, FinalClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(winnerTypeEClass, WinnerType.class, "WinnerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWinnerType_Id(), ecorePackage.getEString(), "id", null, 1, 1, WinnerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWinnerType_Name(), ecorePackage.getEString(), "name", "", 1, 1, WinnerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWinnerType_Result(), this.getResultType(), null, "result", null, 0, 1, WinnerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWinnerType_Organization(), theAddressBookPackage.getOrganizationType(), null, "organization", null, 0, 1, WinnerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWinnerType_Disable(), ecorePackage.getEString(), "disable", null, 0, 1, WinnerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWinnerType_Class(), this.getClassType(), this.getClassType_Winner(), "class", null, 1, 1, WinnerType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(athletTypeEClass, AthletType.class, "AthletType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAthletType_Person(), theAddressBookPackage.getPersonType(), null, "person", null, 1, 1, AthletType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAthletType_Team(), this.getTeamType(), this.getTeamType_Athlet(), "team", null, 0, 1, AthletType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAthletType_Chain(), this.getChainType(), this.getChainType_Athlet(), "chain", null, 0, 1, AthletType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamTypeEClass, TeamType.class, "TeamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeamType_Athlet(), this.getAthletType(), this.getAthletType_Team(), "athlet", null, 1, -1, TeamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainTypeEClass, ChainType.class, "ChainType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChainType_Name(), ecorePackage.getEString(), "name", null, 1, 1, ChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainType_Athlet(), this.getAthletType(), this.getAthletType_Chain(), "athlet", null, 0, -1, ChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainType_Station(), this.getStationType(), null, "station", null, 0, -1, ChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalChainTypeEClass, FinalChainType.class, "FinalChainType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinalChainType_FinalClass(), this.getFinalClassType(), null, "finalClass", null, 0, 1, FinalChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFinalChainType_OrderMap(), this.getLookupMapType(), null, "orderMap", null, 0, 1, FinalChainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disziplineTypeEClass, DisziplineType.class, "DisziplineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisziplineType_Id(), ecorePackage.getEString(), "id", null, 1, 1, DisziplineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisziplineType_Name(), ecorePackage.getEString(), "name", null, 1, 1, DisziplineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisziplineType_Station(), this.getStationType(), null, "station", null, 0, 1, DisziplineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisziplineType_Lookuptable(), this.getLookupTableType(), this.getLookupTableType_Disziplines(), "lookuptable", null, 0, 1, DisziplineType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisziplineType_Calculationkey(), ecorePackage.getEString(), "calculationkey", null, 0, 1, DisziplineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisziplineType_CalculationFunction(), this.getFunctionType(), null, "calculationFunction", null, 0, 1, DisziplineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stationTypeEClass, StationType.class, "StationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStationType_Id(), ecorePackage.getEString(), "id", null, 1, 1, StationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStationType_Name(), ecorePackage.getEString(), "name", null, 1, 1, StationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resultTypeEClass, ResultType.class, "ResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultType_Rank(), ecorePackage.getEInt(), "rank", "-1", 1, 1, ResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultType_Points(), ecorePackage.getEDouble(), "points", "0.0", 0, 1, ResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultType_Juriresult(), this.getJuriResultType(), null, "juriresult", null, 0, -1, ResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(athletResultTypeEClass, AthletResultType.class, "AthletResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(teamResultTypeEClass, TeamResultType.class, "TeamResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(juriResultTypeEClass, JuriResultType.class, "JuriResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJuriResultType_Diszipline(), this.getDisziplineType(), null, "diszipline", null, 1, 1, JuriResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJuriResultType_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, JuriResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJuriResultType_JuriResultDetail(), this.getJuriResultDetailType(), null, "juriResultDetail", null, 0, -1, JuriResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamJuriResultTypeEClass, TeamJuriResultType.class, "TeamJuriResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeamJuriResultType_JuriResult(), this.getJuriResultType(), null, "juriResult", null, 1, -1, TeamJuriResultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(juristTypeEClass, JuristType.class, "JuristType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJuristType_Person(), theAddressBookPackage.getPersonType(), null, "person", null, 1, 1, JuristType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJuristType_Organization(), theAddressBookPackage.getOrganizationType(), null, "organization", null, 0, 1, JuristType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJuristType_Juri(), this.getJuriType(), this.getJuriType_Jurist(), "juri", null, 1, 1, JuristType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJuristType_WishApparatus(), ecorePackage.getEString(), "wishApparatus", null, 0, 1, JuristType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJuristType_License(), ecorePackage.getEString(), "license", null, 0, 1, JuristType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(juristTypeEClass, ecorePackage.getEString(), "getName", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(juriTypeEClass, JuriType.class, "JuriType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJuriType_Jurist(), this.getJuristType(), this.getJuristType_Juri(), "jurist", null, 0, -1, JuriType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJuriType_Diszipline(), this.getDisziplineType(), null, "diszipline", null, 0, -1, JuriType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJuriType_Name(), ecorePackage.getEString(), "name", null, 1, 1, JuriType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lookupTablesTypeEClass, LookupTablesType.class, "LookupTablesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLookupTablesType_Table(), this.getLookupTableType(), null, "table", null, 0, -1, LookupTablesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lookupTableTypeEClass, LookupTableType.class, "LookupTableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLookupTableType_Id(), ecorePackage.getEString(), "id", null, 1, 1, LookupTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupTableType_MinVal(), ecorePackage.getEDouble(), "minVal", null, 1, 1, LookupTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupTableType_MaxVal(), ecorePackage.getEDouble(), "maxVal", null, 1, 1, LookupTableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLookupTableType_Disziplines(), this.getDisziplineType(), this.getDisziplineType_Lookuptable(), "disziplines", null, 0, -1, LookupTableType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(lookupTableTypeEClass, ecorePackage.getEDouble(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lookupMapsTypeEClass, LookupMapsType.class, "LookupMapsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLookupMapsType_Map(), this.getLookupMapType(), null, "map", null, 0, -1, LookupMapsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lookupMapTypeEClass, LookupMapType.class, "LookupMapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLookupMapType_Id(), ecorePackage.getEString(), "id", null, 1, 1, LookupMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookupMapType_Name(), ecorePackage.getEString(), "name", null, 0, 1, LookupMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLookupMapType_Entries(), this.getIntToIntEntry(), null, "entries", null, 0, -1, LookupMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(juriResultDetailTypeEClass, JuriResultDetailType.class, "JuriResultDetailType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJuriResultDetailType_Key(), ecorePackage.getEString(), "key", null, 0, 1, JuriResultDetailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJuriResultDetailType_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, JuriResultDetailType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intToIntEntryEClass, Map.Entry.class, "IntToIntEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntToIntEntry_Key(), ecorePackage.getEIntegerObject(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntToIntEntry_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionTypeEClass, FunctionType.class, "FunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(averageFunctionTypeEClass, AverageFunctionType.class, "AverageFunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAverageFunctionType_Disziplines(), this.getDisziplineType(), null, "disziplines", null, 0, -1, AverageFunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ContestPackageImpl
