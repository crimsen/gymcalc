package de.gymcalc.print.handler;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.gymcalc.printdatamodel.ProtocolModel;
import de.gymcalc.print.Activator;

public class ProtocolModelUi extends PrintModelUi {

	public ProtocolModelUi( DialogSettings dialogOptions ) {
		super( dialogOptions );
		dialogOptions.put( "useEmptyWinnerClasses", false );
		dialogOptions.put( "firstNameFirst", false );
		dialogOptions.put( "additionalWinner", 0 );
		dialogOptions.put( "additionalWinnerPerClass", 0 );
		dialogOptions.put( "maximumRank", -1 );
	}
	@Override
	public String getModelName( ) {
		return ProtocolModel.modelName;
	}
	@Override
	public Object getModel( Object src, IStructuredSelection selection,
			AdapterFactory adapter ) {
		Object retVal = null;
		ProtocolModel m = new ProtocolModel( dialogOptions );
		retVal = m.getSelectedModel(src, selection, adapter);
		return retVal;
	}
	@Override
	protected WizardPageWithOptions createModelPage( DialogSettings dialogOptions ) {
		ContestPrintParameterPage retVal = new ContestPrintParameterPage( "Whatever", dialogOptions );
		retVal.setTitle( Activator.getString( "ParameterPage_Title" ) );
		retVal.setDescription( Activator.getString( "ParameterPage_Description" ) );
		return retVal;
	}
	
}
