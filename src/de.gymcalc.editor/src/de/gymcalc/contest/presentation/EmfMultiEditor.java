package de.gymcalc.contest.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.contexts.IContextActivation;
import org.eclipse.ui.contexts.IContextService;
import org.eclipse.ui.part.EditorPart;

import de.gymcalc.addressbook.provider.AddressBookItemProviderAdapterFactory;
import de.gymcalc.contest.provider.ContestItemProviderAdapterFactory;


/**
 * @author thomas
 * base class for editing an emf-model in multiple editors
 *
 */
/**
 * @author thomas
 *
 */
public abstract class EmfMultiEditor extends EditorPart implements
		IEditingDomainProvider, ISelectionProvider {

	@Override
	public EditingDomain getEditingDomain() {
		return this.editingDomain;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// Save only resources that have actually changed.
		//
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		saveOptions.put(Resource.OPTION_LINE_DELIMITER, Resource.OPTION_LINE_DELIMITER_UNSPECIFIED);

		// Do the work within an operation because this is a long running activity that modifies the workbench.
		//
		WorkspaceModifyOperation operation =
			new WorkspaceModifyOperation() {
				// This is the method that gets invoked when the operation runs.
				//
				@Override
				public void execute(IProgressMonitor monitor) {
					// Save the resources to the file system.
					//
					Resource resource = editingDomain.getResourceSet().getResources().get(0);
					try {
						resource.save(saveOptions);
					} catch (IOException e) {
						ContestEditorPlugin.INSTANCE.log(e);
					}
				}
			};

		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);

			// Refresh the necessary state.
			//
			((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
		catch (Exception exception) {
			// Something went wrong that shouldn't.
			//
			ContestEditorPlugin.INSTANCE.log(exception);
		}
		
	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite( site );
		setInput( input );
/* look thru all editors if input is already open and provides a editingdomain
 */ 	IWorkbenchWindow windows[] = site.getWorkbenchWindow().getWorkbench().getWorkbenchWindows();
 		String name = null;
 		if( input instanceof IFileEditorInput ) {
 			name = ( ( IFileEditorInput )input ).getFile().getRawLocationURI().toString();
 		} else {
 			name = input.getName();
 		}
 		EditingDomain foreignDomain = null;
 		for( IWorkbenchWindow window : windows ) {
			IWorkbenchPage pages[] = window.getPages();
			for( IWorkbenchPage page : pages ) {
				IEditorReference editors[] = page.getEditorReferences();
				for( IEditorReference editor : editors ) {
					IEditorInput foreignInput = editor.getEditorInput();
					String foreignName = null;
					if( foreignInput instanceof IFileEditorInput ) {
						foreignName = ( ( IFileEditorInput )foreignInput ).getFile().getRawLocationURI().toString();
					} else {
						foreignName = foreignInput.getName();
					}
					if( 0 == name.compareTo( foreignName ) ) {
						IEditorPart foreignEditor = editor.getEditor(false);
						if( null != foreignEditor &&
							foreignEditor instanceof IEditingDomainProvider &&
							null != ( ( IEditingDomainProvider )foreignEditor).getEditingDomain() ) {
							foreignDomain = ( ( IEditingDomainProvider )foreignEditor).getEditingDomain();
							break;
						}
					}
				}
				if( null != foreignDomain ) {
					break;
				}
			}
			if( null != foreignDomain ) {
				break;
			}
		}
    	IContextService bindingContextService = ( IContextService ) site.getService( IContextService.class );
    	activationContext = bindingContextService.activateContext( getBindingContextId( ) );

    	initializeEditingDomain( foreignDomain );
	    site.setSelectionProvider( this );
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		if( null != editingDomain && null != commandStackListener ) {
			editingDomain.getCommandStack().removeCommandStackListener( commandStackListener );
		}
		IWorkbenchPartSite site = this.getSite();
		IContextService bindingContextService = ( IContextService ) site.getService( IContextService.class );
    	bindingContextService.deactivateContext( activationContext );
		super.dispose();
	}

	@Override
	public boolean isDirty() {
		boolean retVal = false;
		if( null != editingDomain ) {
			retVal = ((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded();
		}
		return retVal;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		this.container = parent;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionProvider#addSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
	 */
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionProvider#removeSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
	 */
	@Override
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionProvider#getSelection()
	 */
	@Override
	public ISelection getSelection() {
		return editorSelection;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ISelectionProvider#setSelection(org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void setSelection(ISelection selection) {
		editorSelection = selection;
		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new SelectionChangedEvent(this, selection));
		}
	}

	protected Composite getContainer() {
		return container;
	}
	protected void initializeEditingDomain( EditingDomain editingDomain ) {
		this.editingDomain = editingDomain;
		if( null == editingDomain )	{
			createEditingDomain();
		}
		{
			commandStackListener = new CommandStackListener() {
				public void commandStackChanged(final EventObject event) {
					getContainer().getDisplay().asyncExec
						(new Runnable() {
							public void run() {
								firePropertyChange(IEditorPart.PROP_DIRTY);
							}
						});
				}
			};
			this.editingDomain.getCommandStack().addCommandStackListener( commandStackListener );
		}
	}
	
	protected void createEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ContestItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new AddressBookItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();
		this.editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
		createModel( );
	}
	
	protected String getBindingContextId( )
	{
		return bindingContextId;
	}

	public void createModel() {
		// Assumes that the input is a file object.
		//
		IFileEditorInput modelFile = (IFileEditorInput)getEditorInput();
		URI resourceURI = URI.createPlatformResourceURI( modelFile.getFile().getFullPath().toString(), true );;
		try {
			editingDomain.getResourceSet().getResource(resourceURI, true);
		}
		catch (Exception e) {
			editingDomain.getResourceSet().getResource(resourceURI, false);
		}

	}

	static final String bindingContextId = "de.gymcalc.contest.editor";
	protected EditingDomain editingDomain;            // the domain covering the model
    protected Composite container;                    // the main widget of this editor
	protected ComposedAdapterFactory adapterFactory;  // the adapter factory for this editor
    protected CommandStackListener commandStackListener = null;
	/**
	 * This keeps track of all the {@link org.eclipse.jface.viewers.ISelectionChangedListener}s that are listening to this editor.
	 */
	protected Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();
	/**
	 * This keeps track of the selection of the editor as a whole.
	 */
	protected ISelection editorSelection = StructuredSelection.EMPTY;
    protected IContextActivation activationContext; // token for keybinding

}
