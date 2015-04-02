package de.gymcalc.print;


public class CalcReportExportWizard extends ModelExportWizard {

	public void addPages() {
		dialogOptions.put( "templateName", "protokoll" );
		super.addPages( );
	}

}
