/*
 * Created on 23.10.2006
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package de.gymcalc.contest.provider;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;

import de.gymcalc.contest.calcprovider.AthletTableItemProvider;
import de.gymcalc.contest.calcprovider.ChainTableItemProvider;
import de.gymcalc.contest.calcprovider.ClassTableItemProvider;
import de.gymcalc.contest.calcprovider.TeamTableItemProvider;

/**
 * @author groegert
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class ContestTableItemProviderAdapterFactory extends
		ContestItemProviderAdapterFactory {

	/**
	 * 
	 */
	public ContestTableItemProviderAdapterFactory() {
		super ();
		supportedTypes.add(ITableItemLabelProvider.class);
		supportedTypes.add(ICellModifier.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.pls.mcds.library.ConfigBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AthletTableItemProvider athletTableItemProvider;
	protected TeamTableItemProvider teamTableItemProvider;
	protected ClassTableItemProvider classTableItemProvider;
	protected ChainTableItemProvider chainTableItemProvider;

	/* (non-Javadoc)
	 */
	@Override
	public Adapter createAthletTypeAdapter() {
		if (athletTableItemProvider == null) {
			athletTableItemProvider = new AthletTableItemProvider(this);
		}

		return athletTableItemProvider;
	}

	/* (non-Javadoc)
	 */
	@Override
	public Adapter createTeamTypeAdapter() {
		if (teamTableItemProvider == null) {
			teamTableItemProvider = new TeamTableItemProvider(this);
		}

		return teamTableItemProvider;
	}

	/* (non-Javadoc)
	 */
	@Override
	public Adapter createClassTypeAdapter() {
		if (classTableItemProvider == null) {
			classTableItemProvider = new ClassTableItemProvider(this);
		}
		return classTableItemProvider;
	}

	/* (non-Javadoc)
	 */
	@Override
	public Adapter createChainTypeAdapter() {
		if (chainTableItemProvider == null) {
			chainTableItemProvider = new ChainTableItemProvider(this);
		}
		return chainTableItemProvider;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.AdapterFactoryImpl#associate(org.eclipse.emf.common.notify.Adapter, org.eclipse.emf.common.notify.Notifier)
	 */
	@Override
	protected void associate(Adapter adapter, Notifier target) {
		super.associate(adapter, target);
		if (adapter instanceof IAssociateAdapter) {
			((IAssociateAdapter)adapter).associate(target);
		}
	}
	
}
