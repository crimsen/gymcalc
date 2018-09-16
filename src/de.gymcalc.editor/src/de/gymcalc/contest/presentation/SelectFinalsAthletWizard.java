/**
 * 
 */
package de.gymcalc.contest.presentation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.FinalChainType;
import de.gymcalc.contest.command.ContestCommandParam;

/**
 * @author thomas
 *
 */
public class SelectFinalsAthletWizard extends Wizard {


	public SelectFinalsAthletWizard( EditingDomain editingDomain, IStructuredSelection selection ) {
		super();
		setDialogSettings( new DialogSettings( "athlet" ) );
		this.editingDomain = editingDomain; // used to create adapters
		this.selection = selection;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		selectFinalsAthletPage = new SelectFinalsAthletPage( ContestEditorPlugin.INSTANCE.getString("_UI_ContestSelectFinalsAthletWizard"), adapterFactory );
		FinalChainType chain = EmfUtil.findTypeInSelection(FinalChainType.class, selection);
		selectFinalsAthletPage.setFinalChain( chain );
		addPage( selectFinalsAthletPage );
		super.addPages();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		boolean retVal = false;
		// TODO: idialogsettings should be used
		this.param.put("athlet", selectFinalsAthletPage.getAthlet( ) );
		retVal = validateParam( param );
		return retVal;
	}

	public ContestCommandParam getParam( ){
		return param;
	}
	
	boolean validateParam( ContestCommandParam param )
	{
		boolean retVal = false;
		Object o = param.get("athlet");
		if( null != o && o instanceof AthletType) {
			retVal = true;
		}
		return retVal;
	}
	
	private EditingDomain editingDomain;
	private IStructuredSelection selection;
	private AdapterFactory adapterFactory;
	private SelectFinalsAthletPage selectFinalsAthletPage;
	
	private ContestCommandParam param = new ContestCommandParam( );
}
