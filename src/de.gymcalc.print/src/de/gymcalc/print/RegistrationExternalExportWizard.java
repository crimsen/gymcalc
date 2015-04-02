package de.gymcalc.print;


public class RegistrationExternalExportWizard extends ModelExportWizard
{
	public void addPages() {
		dialogOptions.put( "templateName", "registration-no-group" );
		super.addPages( );
	}
}
