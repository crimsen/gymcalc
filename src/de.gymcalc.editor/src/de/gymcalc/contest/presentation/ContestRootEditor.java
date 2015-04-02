/**
 * 
 */
package de.gymcalc.contest.presentation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.ui.view.swt.DefaultReferenceService;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContextFactory;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.gymcalc.databinding.ui.Formkit;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;

/**
 * @author thomas
 *
 */
public class ContestRootEditor extends EmfMultiEditor {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl( parent );
		linkNavigator = new LinkNavigator( this );
	    toolkit = new FormToolkit(parent.getDisplay());
	    ScrolledForm f = toolkit.createScrolledForm(parent);
	    Form form = f.getForm();
	    toolkit.decorateFormHeading(form);
	    form.setText( ContestEditorPlugin.INSTANCE.getString("_UI_ContestRootEditor_label") );
//	    form.getBody().setLayout( new FillLayout( ) );
	    f.getBody().setLayout(new GridLayout( 1, true ) );
	    emfFormComposite = new Composite( form.getBody(), SWT.NONE);
	    emfFormComposite.setLayoutData( new GridData( SWT.FILL, SWT.FILL, true, true ) );
		emfFormComposite.setLayout( new GridLayout( ) );
		Composite tmpComposite = new Composite( form.getBody(), SWT.NONE );
		tmpComposite.setLayoutData( new GridData( SWT.FILL, SWT.BEGINNING, true, false ) );
	    tmpComposite.setLayout( new GridLayout(3, false));
//	    Formkit.createLink( toolkit, tmpComposite, ContestPackage.Literals.CLASS_TYPE, linkNavigator );
	    Formkit.createLink( toolkit, tmpComposite, ContestPackage.Literals.ATHLET_TYPE, linkNavigator );
	    Formkit.createLink( toolkit, tmpComposite, ContestPackage.Literals.TEAM_TYPE, linkNavigator );
	    Formkit.createLink( toolkit, tmpComposite, ContestPackage.Literals.JURIST_TYPE, linkNavigator );
	    Formkit.createLink( toolkit, tmpComposite, ContestPackage.Literals.JURI_RESULT_TYPE, linkNavigator );
	    updateInput();
	}

	private void updateInput( )
	{
		IFileEditorInput modelFile = (IFileEditorInput)this.getEditorInput();
		URI resourceURI = URI.createPlatformResourceURI( modelFile.getFile().getFullPath().toString(), true );;
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
			ContestType contest = ( ( ContestType ) resource.getContents().get( 0 ) );

			final VView view = ViewProviderHelper.getView( contest, null );
			DefaultReferenceService referenceService=new DefaultReferenceService();
			ViewModelContext viewContext = ViewModelContextFactory.INSTANCE.createViewModelContext(view,
					contest, referenceService );
			ECPSWTViewRenderer.INSTANCE.render(emfFormComposite, viewContext);

			//ECPSWTViewRenderer.INSTANCE.render(emfFormComposite, contest );
			
			String name = modelFile.getName();
		    name += " (" + ContestEditorPlugin.INSTANCE.getString("_UI_ContestRootEditor_label") + ")";
		    this.setPartName( name );
		} catch( Exception e ) {
			e.printStackTrace();
			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
		}
		
	}

	private FormToolkit toolkit;
    private LinkNavigator linkNavigator;
    private Composite emfFormComposite;
}
