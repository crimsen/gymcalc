package de.gymcalc.print.handler;

import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.wizard.WizardPage;

public abstract class WizardPageWithOptions extends WizardPage {

	public WizardPageWithOptions( String name ) {
		super( name );
	}
	public boolean isEnabled( ) {
		return enabled;
	}
	public void setEnabled( boolean enabled ) {
		this.enabled = enabled;
	}
	
	public abstract boolean updateOptions( DialogSettings options );
	public abstract void updatePage( DialogSettings options );
	
	private boolean enabled = false;
}
