/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.provider;

import de.gymcalc.contest.util.ContestAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContestItemProviderAdapterFactory extends ContestAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContestItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.ClassType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassTypeItemProvider classTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.ClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassTypeAdapter() {
		if (classTypeItemProvider == null) {
			classTypeItemProvider = new ClassTypeItemProvider(this);
		}

		return classTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.FinalClassType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalClassTypeItemProvider finalClassTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.FinalClassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinalClassTypeAdapter() {
		if (finalClassTypeItemProvider == null) {
			finalClassTypeItemProvider = new FinalClassTypeItemProvider(this);
		}

		return finalClassTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.ContestType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContestTypeItemProvider contestTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.ContestType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContestTypeAdapter() {
		if (contestTypeItemProvider == null) {
			contestTypeItemProvider = new ContestTypeItemProvider(this);
		}

		return contestTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.DisziplineType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisziplineTypeItemProvider disziplineTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.DisziplineType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDisziplineTypeAdapter() {
		if (disziplineTypeItemProvider == null) {
			disziplineTypeItemProvider = new DisziplineTypeItemProvider(this);
		}

		return disziplineTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.ResultType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultTypeItemProvider resultTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.ResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResultTypeAdapter() {
		if (resultTypeItemProvider == null) {
			resultTypeItemProvider = new ResultTypeItemProvider(this);
		}

		return resultTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.AthletType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AthletTypeItemProvider athletTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.AthletType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAthletTypeAdapter() {
		if (athletTypeItemProvider == null) {
			athletTypeItemProvider = new AthletTypeItemProvider(this);
		}

		return athletTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.TeamType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamTypeItemProvider teamTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.TeamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTeamTypeAdapter() {
		if (teamTypeItemProvider == null) {
			teamTypeItemProvider = new TeamTypeItemProvider(this);
		}

		return teamTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.ChainType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainTypeItemProvider chainTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.ChainType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChainTypeAdapter() {
		if (chainTypeItemProvider == null) {
			chainTypeItemProvider = new ChainTypeItemProvider(this);
		}

		return chainTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.FinalChainType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalChainTypeItemProvider finalChainTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.FinalChainType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinalChainTypeAdapter() {
		if (finalChainTypeItemProvider == null) {
			finalChainTypeItemProvider = new FinalChainTypeItemProvider(this);
		}

		return finalChainTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.StationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StationTypeItemProvider stationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.StationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStationTypeAdapter() {
		if (stationTypeItemProvider == null) {
			stationTypeItemProvider = new StationTypeItemProvider(this);
		}

		return stationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.AthletResultType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AthletResultTypeItemProvider athletResultTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.AthletResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAthletResultTypeAdapter() {
		if (athletResultTypeItemProvider == null) {
			athletResultTypeItemProvider = new AthletResultTypeItemProvider(this);
		}

		return athletResultTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.TeamResultType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamResultTypeItemProvider teamResultTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.TeamResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTeamResultTypeAdapter() {
		if (teamResultTypeItemProvider == null) {
			teamResultTypeItemProvider = new TeamResultTypeItemProvider(this);
		}

		return teamResultTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.JuriResultType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JuriResultTypeItemProvider juriResultTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.JuriResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJuriResultTypeAdapter() {
		if (juriResultTypeItemProvider == null) {
			juriResultTypeItemProvider = new JuriResultTypeItemProvider(this);
		}

		return juriResultTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.JuristType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JuristTypeItemProvider juristTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.JuristType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJuristTypeAdapter() {
		if (juristTypeItemProvider == null) {
			juristTypeItemProvider = new JuristTypeItemProvider(this);
		}

		return juristTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.JuriType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JuriTypeItemProvider juriTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.JuriType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJuriTypeAdapter() {
		if (juriTypeItemProvider == null) {
			juriTypeItemProvider = new JuriTypeItemProvider(this);
		}

		return juriTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.WinnerType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WinnerTypeItemProvider winnerTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.WinnerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWinnerTypeAdapter() {
		if (winnerTypeItemProvider == null) {
			winnerTypeItemProvider = new WinnerTypeItemProvider(this);
		}

		return winnerTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.TeamJuriResultType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamJuriResultTypeItemProvider teamJuriResultTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.TeamJuriResultType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTeamJuriResultTypeAdapter() {
		if (teamJuriResultTypeItemProvider == null) {
			teamJuriResultTypeItemProvider = new TeamJuriResultTypeItemProvider(this);
		}

		return teamJuriResultTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.LookupTablesType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookupTablesTypeItemProvider lookupTablesTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.LookupTablesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLookupTablesTypeAdapter() {
		if (lookupTablesTypeItemProvider == null) {
			lookupTablesTypeItemProvider = new LookupTablesTypeItemProvider(this);
		}

		return lookupTablesTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.LookupTableType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookupTableTypeItemProvider lookupTableTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.LookupTableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLookupTableTypeAdapter() {
		if (lookupTableTypeItemProvider == null) {
			lookupTableTypeItemProvider = new LookupTableTypeItemProvider(this);
		}

		return lookupTableTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.LookupMapsType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookupMapsTypeItemProvider lookupMapsTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.LookupMapsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLookupMapsTypeAdapter() {
		if (lookupMapsTypeItemProvider == null) {
			lookupMapsTypeItemProvider = new LookupMapsTypeItemProvider(this);
		}

		return lookupMapsTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.LookupMapType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookupMapTypeItemProvider lookupMapTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.LookupMapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLookupMapTypeAdapter() {
		if (lookupMapTypeItemProvider == null) {
			lookupMapTypeItemProvider = new LookupMapTypeItemProvider(this);
		}

		return lookupMapTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.gymcalc.contest.JuriResultDetailType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JuriResultDetailTypeItemProvider juriResultDetailTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.gymcalc.contest.JuriResultDetailType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJuriResultDetailTypeAdapter() {
		if (juriResultDetailTypeItemProvider == null) {
			juriResultDetailTypeItemProvider = new JuriResultDetailTypeItemProvider(this);
		}

		return juriResultDetailTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntToIntEntryItemProvider intToIntEntryItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntToIntEntryAdapter() {
		if (intToIntEntryItemProvider == null) {
			intToIntEntryItemProvider = new IntToIntEntryItemProvider(this);
		}

		return intToIntEntryItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (contestTypeItemProvider != null) contestTypeItemProvider.dispose();
		if (classTypeItemProvider != null) classTypeItemProvider.dispose();
		if (finalClassTypeItemProvider != null) finalClassTypeItemProvider.dispose();
		if (winnerTypeItemProvider != null) winnerTypeItemProvider.dispose();
		if (athletTypeItemProvider != null) athletTypeItemProvider.dispose();
		if (teamTypeItemProvider != null) teamTypeItemProvider.dispose();
		if (chainTypeItemProvider != null) chainTypeItemProvider.dispose();
		if (finalChainTypeItemProvider != null) finalChainTypeItemProvider.dispose();
		if (disziplineTypeItemProvider != null) disziplineTypeItemProvider.dispose();
		if (stationTypeItemProvider != null) stationTypeItemProvider.dispose();
		if (resultTypeItemProvider != null) resultTypeItemProvider.dispose();
		if (athletResultTypeItemProvider != null) athletResultTypeItemProvider.dispose();
		if (teamResultTypeItemProvider != null) teamResultTypeItemProvider.dispose();
		if (juriResultTypeItemProvider != null) juriResultTypeItemProvider.dispose();
		if (teamJuriResultTypeItemProvider != null) teamJuriResultTypeItemProvider.dispose();
		if (juristTypeItemProvider != null) juristTypeItemProvider.dispose();
		if (juriTypeItemProvider != null) juriTypeItemProvider.dispose();
		if (lookupTablesTypeItemProvider != null) lookupTablesTypeItemProvider.dispose();
		if (lookupTableTypeItemProvider != null) lookupTableTypeItemProvider.dispose();
		if (lookupMapsTypeItemProvider != null) lookupMapsTypeItemProvider.dispose();
		if (lookupMapTypeItemProvider != null) lookupMapTypeItemProvider.dispose();
		if (juriResultDetailTypeItemProvider != null) juriResultDetailTypeItemProvider.dispose();
		if (intToIntEntryItemProvider != null) intToIntEntryItemProvider.dispose();
	}

}
