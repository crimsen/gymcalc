package de.gymcalc.rcp.juriclient.handlers;

import javax.annotation.PostConstruct;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.widgets.Composite;

import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ContestType;

public class ChainToolControl extends ComboToolControl {
	@PostConstruct
	public void createGui(Composite parent) {
		super.createGui(parent, "Riege");
	}
	@Override
	protected void updateCombo(ContestType contest) {
		combo.removeAll();
		for(ChainType chain:contest.getChain()) {
			combo.add(chain.getName());
		}
	}

	@Override
	protected void updateActiveObject(int index) {
		Object contestObject = activeObjectService.getActiveObject(ContestType.class);
		ChainType chain = null;
		if( null != contestObject ) {
			ContestType contest = (ContestType) contestObject;
			EList<ChainType> chainList = contest.getChain();
			if( 0 <= index && chainList.size() > index ) {
				chain = chainList.get(index);
			}
		}
		activeObjectService.setActiveObject(ChainType.class, chain);
	}

}