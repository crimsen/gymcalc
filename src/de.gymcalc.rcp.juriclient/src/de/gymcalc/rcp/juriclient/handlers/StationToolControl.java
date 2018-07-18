package de.gymcalc.rcp.juriclient.handlers;

import javax.annotation.PostConstruct;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.widgets.Composite;

import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.StationType;

public class StationToolControl extends ComboToolControl {
	@PostConstruct
	public void createGui(Composite parent) {
		super.createGui(parent, "Station");
	}
	@Override
	protected void updateCombo(ContestType contest) {
		combo.removeAll();
		for(StationType station:contest.getStation()) {
			combo.add(station.getName());
		}
	}

	@Override
	protected void updateActiveObject(int index) {
		Object contestObject = activeObjectService.getActiveObject(ContestType.class);
		StationType station = null;
		if( null != contestObject ) {
			ContestType contest = (ContestType) contestObject;
			EList<StationType> stationList = contest.getStation();
			if( 0 <= index && stationList.size() > index ) {
				station = stationList.get(index);
			}
		}
		activeObjectService.setActiveObject(StationType.class, station);
	}

}