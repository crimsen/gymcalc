package de.gymcalc.print.handler;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;

public abstract class PrintModelUi {

	public PrintModelUi( DialogSettings dialogOptions ) {
		this.dialogOptions = dialogOptions;
	}
	public WizardPage getPage( ) {
		WizardPage retVal = page;
		if( null == retVal ) {
			page = createModelPage( dialogOptions );
			retVal = page;
		}
		return retVal;
	}
	public void updatePage( DialogSettings dialogOptions ) {
		if( null != page ) {
			page.updatePage( dialogOptions );
		}
	}
	public void updateOptions( DialogSettings dialogOptions ) {
		if( null != page ) {
			page.updateOptions( dialogOptions );
		}
	}
	public void setEnabled( boolean enabled ) {
		if( null != page ) {
			page.setEnabled( enabled );
		}
	}
	public abstract String getModelName( );
	public abstract Object getModel( Object src, IStructuredSelection selection,
			AdapterFactory adapter );
	protected abstract WizardPageWithOptions createModelPage( DialogSettings dialogOptions );
	
	protected WizardPageWithOptions page = null;
	protected DialogSettings dialogOptions = null;
}
