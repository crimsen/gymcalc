package de.gymcalc.rcp.juriclient.handlers;

import javax.inject.Inject;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.gymcalc.contest.ContestType;
import de.gymcalc.rcp.IActiveObjectListener;
import de.gymcalc.rcp.IActiveObjectService;

public class ComboToolControl {

	@Inject
	IActiveObjectService activeObjectService;

	public void createGui(Composite parent, String name) {
		Composite me = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		layout.marginHeight = 0;
		me.setLayout(layout);
		Label text = new Label(me,SWT.NONE);
		text.setText(name + ":");
		combo = new Combo(me, SWT.DROP_DOWN | SWT.READ_ONLY);
		GridDataFactory.fillDefaults().grab(true, false).minSize(300, SWT.DEFAULT).applyTo(combo);
		combo.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateActiveObject(combo.getSelectionIndex());
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
				updateCombo(contest);
				
			}
			
		});
	}

	protected void updateCombo(ContestType contest) {
	}
	protected void updateActiveObject(int index) {
	}
	protected Combo combo = null;

}