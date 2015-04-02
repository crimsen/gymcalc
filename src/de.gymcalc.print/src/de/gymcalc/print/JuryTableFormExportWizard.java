package de.gymcalc.print;


public class JuryTableFormExportWizard extends ModelExportWizard {

	public void addPages() {
		dialogOptions.put( "templateName", "jurytableform" );
		super.addPages( );
	}

}