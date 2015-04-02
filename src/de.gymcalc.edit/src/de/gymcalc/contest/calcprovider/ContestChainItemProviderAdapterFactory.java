package de.gymcalc.contest.calcprovider;

import org.eclipse.emf.common.notify.Adapter;

import de.gymcalc.contest.provider.ContestTableItemProviderAdapterFactory;

public class ContestChainItemProviderAdapterFactory extends
		ContestTableItemProviderAdapterFactory {

	/**
	 * This keeps track of the one adapter used for all {@link com.pls.mcds.library.ConfigBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContestChainItemProvider contestChainItemProvider;

	/* (non-Javadoc)
	 */
	@Override
	public Adapter createContestTypeAdapter() {
		if (contestChainItemProvider == null) {
			contestChainItemProvider = new ContestChainItemProvider(this);
		}
		return contestChainItemProvider;
	}

}
