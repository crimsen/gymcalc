package de.gymcalc.rcp.juriclient.handlers;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.StationType;
import de.gymcalc.rcp.IActiveObjectListener;
import de.gymcalc.rcp.IActiveObjectService;

public class StationToolControl {
		
	@PostConstruct
	public void createGui(Composite parent) {
		Composite me = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		me.setLayout(layout);
		Text text = new Text(me,SWT.READ_ONLY);
		//GridDataFactory.fillDefaults().hint(130, SWT.DEFAULT).applyTo(text);
		text.setText("Station:");
		combo = new Combo(me, SWT.DROP_DOWN | SWT.READ_ONLY);
		GridDataFactory.fillDefaults().hint(200, SWT.DEFAULT).applyTo(combo);
		combo.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateStation(combo.getSelectionIndex());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
			
		});
		activeObjectService.addListener(ContestType.class, new IActiveObjectListener() {

			@Override
			public void onActiveObjectChanged(Object type, Object object) {
				ContestType contest = null;
				if( null != object ) {
					contest = (ContestType)object;
				}
				updateContest(contest);
				
			}
			
		});
	}
	protected void updateContest(ContestType contest) {
		combo.removeAll();
		for(StationType station:contest.getStation()) {
			combo.add(station.getName());
		}
	}
	protected void updateStation(int index) {
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
	@Inject
	IActiveObjectService activeObjectService;
	protected Combo combo = null;
}