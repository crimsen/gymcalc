package de.gymcalc.print;


public class JuriReportExportWizard extends ModelExportWizard {
    public void addPages() {
		dialogOptions.put( "templateName", "jury" );
		super.addPages();
	}

}
