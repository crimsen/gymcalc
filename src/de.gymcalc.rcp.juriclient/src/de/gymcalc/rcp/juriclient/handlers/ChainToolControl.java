package de.gymcalc.rcp.juriclient.handlers;

import java.util.ArrayList;
import java.util.Comparator;

import javax.annotation.PostConstruct;

import org.eclipse.swt.widgets.Composite;

import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.StationType;

public class ChainToolControl extends ComboToolControl {
	@PostConstruct
	public void createGui(Composite parent) {
		super.createGui(parent, "Riege", StationType.class);
	}
	@Override
	protected void updateCombo(Object master) {
		combo.removeAll();
		chains.clear();
		if( null != master ) {
			StationType station = ( StationType ) master;
			ContestType contest = ( ContestType ) station.eContainer();
	
			for(ChainType chain:contest.getChain()) {
				if( chain.getStation().contains(station) ) {
					chains.add(chain);
				}
			}
			chains.sort(new Comparator<ChainType>() {
				public int compare(ChainType o1, ChainType o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			for(ChainType chain:chains) {
				combo.add(chain.getName());
			}
		}
		// when we update the content, then no selectionevent is sent, so we do update manually
		updateActiveObject(-1);
	}

	@Override
	protected void updateActiveObject(int index) {
		ChainType chain = null;
		if( 0 <= index && chains.size() > index ) {
			chain = chains.get(index);
		}
		activeObjectService.setActiveObject(ChainType.class, chain);
	}

	protected ArrayList<ChainType> chains = new ArrayList<ChainType>();
}