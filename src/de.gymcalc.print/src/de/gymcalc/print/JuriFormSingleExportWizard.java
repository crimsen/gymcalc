package de.gymcalc.print;

public class JuriFormSingleExportWizard extends ModelExportWizard {

	public void addPages() {
		dialogOptions.put( "additionalWinnerPerClass", 0 );
		dialogOptions.put( "additionalWinner", 3 );
		dialogOptions.put( "templateName", "juriformsingle" );
		super.addPages( );
	}
}
