package de.gymcalc.print.handler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.IWorkbench;

import de.spremberg.turnen.contact.print.TemplatePrintWizard;
import de.spremberg.turnen.contact.print.util.ITemplateModelProvider;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.calcprovider.ContestClassItemProviderAdapterFactory;

public class ContestPrintWizard extends TemplatePrintWizard implements ITemplateModelProvider {

	public ContestPrintWizard(EditingDomain editingDomain) {
		super(null);
		this.modelProvider = this;
		this.editingDomain = editingDomain;
	}

	/* (non-Javadoc)
	 * @see de.spremberg.turnen.contact.print.TemplatePrintWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		initProtocolModel( );
		initChainModel( );
		initOrganizationModel( );
	}

	@Override
	protected void addOptionsPage( )
	{
		addProtocolModelPage( );
		addChainModelPage( );
		addOrganizationModelPage( );
	}
	@Override
	public boolean performFinish() {
		String modelName = getModelName( );
		if( 0 == modelName.compareTo( protocolModelUi.getModelName( ) ) ) {
			protocolModelUi.updateOptions( dialogOptions );
		} else if( 0 == modelName.compareTo( chainModelUi.getModelName( ) ) ) {
			chainModelUi.updateOptions( dialogOptions );
		} else if( 0 == modelName.compareTo( organizationModelUi.getModelName( ) ) ) {
			organizationModelUi.updateOptions( dialogOptions );
		}
		return super.performFinish();
	}
	/* (non-Javadoc)
	 * @see de.spremberg.turnen.contact.print.util.ITemplateModelProvider#getTemplateNames()
	 */
	@Override
	public String[] getTemplateNames() {
		String[] retVal = new String[ 3 ];
		retVal[ 0 ] = protocolModelUi.getModelName( );
		retVal[ 1 ] = chainModelUi.getModelName( );
		retVal[ 2 ] = organizationModelUi.getModelName( );
		return retVal;
	}

	/* (non-Javadoc)
	 * @see de.spremberg.turnen.contact.print.util.ITemplateModelProvider#getDataModel(java.lang.String)
	 */
	@Override
	public Object getDataModel(String modelName) {
		Object retVal = null;
		List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ContestClassItemProviderAdapterFactory());
		ComposedAdapterFactory adapter = new ComposedAdapterFactory(factories);
		if( 0 == modelName.compareTo( protocolModelUi.getModelName( ) ) ) {
			retVal = protocolModelUi.getModel( getContest(), selection, adapter );
		} else if( 0 == modelName.compareTo( chainModelUi.getModelName( ) ) ) {
			retVal = chainModelUi.getModel( getContest( ), selection, adapter );
		} else if( 0 == modelName.compareTo( organizationModelUi.getModelName( ) ) ) {
			retVal = organizationModelUi.getModel( getContest( ), selection, adapter );
		}
		return retVal;
	}

	public String getFileName( ) {
		String retVal = this.dialogOptions.get( "filename" );
		return retVal;
	}
	@Override
	protected void optionChanged( String name )
	{
		super.optionChanged(name);
		if( "templateName" == name ) {
			protocolModelUi.setEnabled( false );
			chainModelUi.setEnabled( false );
			organizationModelUi.setEnabled( false );
			PrintModelUi p = null;
			String modelName = getModelName( );
			if( 0 == modelName.compareTo( protocolModelUi.getModelName( ) ) ) {
				p = protocolModelUi;
			} else if( 0 == modelName.compareTo( chainModelUi.getModelName( ) ) ) {
				p = chainModelUi;
			} else if( 0 == modelName.compareTo( organizationModelUi.getModelName( ) ) ) {
				p = organizationModelUi;
			}
			p.updatePage( dialogOptions );
			p.setEnabled( true );
		}
	}
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage retVal = super.getNextPage( page );
		while ( null != retVal && retVal instanceof WizardPageWithOptions ) {
			if( ( ( WizardPageWithOptions ) retVal ).isEnabled( ) ) {
				break;
			}
			retVal = super.getNextPage( retVal );
		}
		return retVal;
	}

	@Override
	public IWizardPage getPreviousPage(IWizardPage page) {
		IWizardPage retVal = super.getPreviousPage( page );
		while ( null != retVal && retVal instanceof WizardPageWithOptions ) {
			if( ( ( WizardPageWithOptions ) retVal ).isEnabled( ) ) {
				break;
			}
			retVal = super.getPreviousPage( retVal );
		}
		return retVal;
	}

	private void initProtocolModel( ) {
		protocolModelUi = new ProtocolModelUi( dialogOptions );
	}
	private void addProtocolModelPage( ) {
		WizardPage w = protocolModelUi.getPage( );
		if( null != w ) {
			addPage( w );
		}
	}
	private void initChainModel( ) {
		chainModelUi = new ChainModelUi( dialogOptions );
	}
	private void addChainModelPage( ) {
		WizardPage w = chainModelUi.getPage( );
		if( null != w ) {
			addPage( w );
		}
	}
	private void initOrganizationModel( ) {
		organizationModelUi = new OrganizationModelUi( dialogOptions );
	}
	private void addOrganizationModelPage( ) {
		WizardPage w = organizationModelUi.getPage( );
		if( null != w ) {
			addPage( w );
		}
	}
	private ContestType getContest( ) {
		ContestType retVal = ( ContestType ) editingDomain.getResourceSet().getResources().get(0).getContents().get( 0 );
		return retVal;
	}
	
	private EditingDomain editingDomain = null;
	private ProtocolModelUi protocolModelUi = null;
	private ChainModelUi chainModelUi = null;
	private OrganizationModelUi organizationModelUi = null;
}
