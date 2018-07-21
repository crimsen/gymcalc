package de.gymcalc.rcp.juriclient.handlers;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.eclipse.swt.widgets.Composite;

import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.StationType;

public class StationToolControl extends ComboToolControl {
	@PostConstruct
	public void createGui(Composite parent) {
		super.createGui(parent, "Station", ContestType.class);
	}
	@Override
	protected void updateCombo(Object master) {
		combo.removeAll();
		stations.clear();
		if( null != master ) {
			ContestType contest = ( ContestType ) master;
			stations.addAll(contest.getStation());
			// do not sort here.
			// stations should be sorted olympic
			for(StationType station:stations) {
				combo.add(station.getName());
			}
		}
	}

	@Override
	protected void updateActiveObject(int index) {
		StationType station = null;
		if( 0 <= index && stations.size() > index ) {
			station = stations.get(index);
		}
		activeObjectService.setActiveObject(StationType.class, station);
	}

	protected ArrayList<StationType> stations = new ArrayList<StationType>();
}