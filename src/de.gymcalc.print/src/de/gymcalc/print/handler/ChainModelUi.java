package de.gymcalc.print.handler;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.gymcalc.printdatamodel.ChainModel;

public class ChainModelUi extends PrintModelUi {

	ChainModelUi( DialogSettings options ) {
		super( options );
	}
	@Override
	public String getModelName() {
		return ChainModel.modelName;
	}

	@Override
	public Object getModel(Object src, IStructuredSelection selection,
			AdapterFactory adapter) {
		Object retVal = null;
		ChainModel m = new ChainModel( dialogOptions );
		retVal = m.getSelectedModel(src, selection, adapter);
		return retVal;
	}

	@Override
	protected WizardPageWithOptions createModelPage(DialogSettings dialogOptions) {
		return null;
	}

}
