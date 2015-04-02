/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.util;

import de.gymcalc.contest.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.gymcalc.contest.ContestPackage
 * @generated
 */
public class ContestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContestSwitch<Adapter> modelSwitch =
		new ContestSwitch<Adapter>() {
			@Override
			public Adapter caseContestType(ContestType object) {
				return createContestTypeAdapter();
			}
			@Override
			public Adapter caseClassType(ClassType object) {
				return createClassTypeAdapter();
			}
			@Override
			public Adapter caseWinnerType(WinnerType object) {
				return createWinnerTypeAdapter();
			}
			@Override
			public Adapter caseAthletType(AthletType object) {
				return createAthletTypeAdapter();
			}
			@Override
			public Adapter caseTeamType(TeamType object) {
				return createTeamTypeAdapter();
			}
			@Override
			public Adapter caseChainType(ChainType object) {
				return createChainTypeAdapter();
			}
			@Override
			public Adapter caseDisziplineType(DisziplineType object) {
				return createDisziplineTypeAdapter();
			}
			@Override
			public Adapter caseStationType(StationType object) {
				return createStationTypeAdapter();
			}
			@Override
			public Adapter caseResultType(ResultType object) {
				return createResultTypeAdapter();
			}
			@Override
			public Adapter caseAthletResultType(AthletResultType object) {
				return createAthletResultTypeAdapter();
			}
			@Override
			public Adapter caseTeamResultType(TeamResultType object) {
				return createTeamResultTypeAdapter();
			}
			@Override
			public Adapter caseJuriResultType(JuriResultType object) {
				return createJuriResultTypeAdapter();
			}
			@Override
			public Adapter caseTeamJuriResultType(TeamJuriResultType object) {
				return createTeamJuriResultTypeAdapter();
			}
			@Override
			public Adapter caseJuristType(JuristType object) {
				return createJuristTypeAdapter();
			}
			@Override
			public Adapter caseJuriType(JuriType object) {
				return createJuriTypeAdapter();
			}
			@Override
			public Adapter caseLookupTablesType(LookupTablesType object) {
				return createLookupTablesTypeAdapter();
			}
			@Override
			public Adapter caseLookupTableType(LookupTableType object) {
				return createLookupTableTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.ClassType
	 * @generated
	 */
	public Adapter createClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.ContestType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.ContestType
	 * @generated
	 */
	public Adapter createContestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.DisziplineType <em>Diszipline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.DisziplineType
	 * @generated
	 */
	public Adapter createDisziplineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.ResultType
	 * @generated
	 */
	public Adapter createResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.AthletType <em>Athlet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.AthletType
	 * @generated
	 */
	public Adapter createAthletTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.TeamType <em>Team Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.TeamType
	 * @generated
	 */
	public Adapter createTeamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.ChainType <em>Chain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.ChainType
	 * @generated
	 */
	public Adapter createChainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.StationType <em>Station Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.StationType
	 * @generated
	 */
	public Adapter createStationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.AthletResultType <em>Athlet Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.AthletResultType
	 * @generated
	 */
	public Adapter createAthletResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.TeamResultType <em>Team Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.TeamResultType
	 * @generated
	 */
	public Adapter createTeamResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.JuriResultType <em>Juri Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.JuriResultType
	 * @generated
	 */
	public Adapter createJuriResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.JuristType <em>Jurist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.JuristType
	 * @generated
	 */
	public Adapter createJuristTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.JuriType <em>Juri Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.JuriType
	 * @generated
	 */
	public Adapter createJuriTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.WinnerType <em>Winner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.WinnerType
	 * @generated
	 */
	public Adapter createWinnerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.TeamJuriResultType <em>Team Juri Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.TeamJuriResultType
	 * @generated
	 */
	public Adapter createTeamJuriResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.LookupTablesType <em>Lookup Tables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.LookupTablesType
	 * @generated
	 */
	public Adapter createLookupTablesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.gymcalc.contest.LookupTableType <em>Lookup Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.gymcalc.contest.LookupTableType
	 * @generated
	 */
	public Adapter createLookupTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ContestAdapterFactory
