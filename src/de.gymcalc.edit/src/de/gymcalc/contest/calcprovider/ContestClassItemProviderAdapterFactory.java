package de.gymcalc.contest.calcprovider;

import org.eclipse.emf.common.notify.Adapter;
import de.gymcalc.contest.provider.ContestTableItemProviderAdapterFactory;

public class ContestClassItemProviderAdapterFactory extends
		ContestTableItemProviderAdapterFactory {

	/**
	 * This keeps track of the one adapter used for all {@link com.pls.mcds.library.ConfigBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContestClassItemProvider contestClassItemProvider;

	/* (non-Javadoc)
	 */
	@Override
	public Adapter createContestTypeAdapter() {
		if (contestClassItemProvider == null) {
			contestClassItemProvider = new ContestClassItemProvider(this);
		}
		return contestClassItemProvider;
	}

}
