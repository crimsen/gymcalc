package de.gymcalc.print;

public class UrkundeExportWizard extends ModelExportWizard {

	public void addPages() {
		dialogOptions.put( "templateName", "urkunde" );
		dialogOptions.put( "firstNameFirst", true );
		dialogOptions.put( "maximumRank", 6 );
		super.addPages( );
	}

}
