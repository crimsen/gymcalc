package de.gymcalc.print;


public class RegistrationReportExportWizard extends ModelExportWizard {

	public void addPages() {
		dialogOptions.put( "templateName", "registration" );
		super.addPages( );
	}

}
