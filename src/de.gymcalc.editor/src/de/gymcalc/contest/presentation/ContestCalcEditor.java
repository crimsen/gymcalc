/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.presentation;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableFontProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.nebula.widgets.grid.Grid;
import org.eclipse.nebula.widgets.grid.GridColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.calcprovider.ChainTableItemProvider;
import de.gymcalc.contest.calcprovider.ContestChainItemProviderAdapterFactory;
import de.gymcalc.contest.calcprovider.ContestClassItemProviderAdapterFactory;
import de.gymcalc.contest.provider.ContestTableItemProviderAdapterFactory;


/**
 */
public class ContestCalcEditor
	extends EmfMultiEditor
	implements IMenuListener, IViewerProvider {

	/**
	 * This is the content outline page.
	 */
	protected IContentOutlinePage contentOutlinePage;

	/**
	 * This is a kludge...
	 */
	protected IStatusLineManager contentOutlineStatusLineManager;
	
	protected TreeViewer contentOutlineViewer;

	protected GridViewer classViewer;
	protected GridViewer chainViewer;
	
	/**
	 * This keeps track of the active content viewer, which may be either one of the viewers in the pages or the content outline viewer.
	 */
	protected Viewer currentViewer;

	/**
	 * This listens to which ever viewer is active.
	 */
	protected ISelectionChangedListener selectionChangedListener;

	/**
	 * This listens for when the outline becomes active
	 */
	protected IPartListener partListener =
		new IPartListener() {
			public void partActivated(IWorkbenchPart p) {
				if (p instanceof ContentOutline) {
					if (((ContentOutline)p).getCurrentPage() == contentOutlinePage) {
						getActionBarContributor().setActiveEditor(ContestCalcEditor.this);

						setCurrentViewer(contentOutlineViewer);
					}
				}
				else if (p == ContestCalcEditor.this) {
					handleActivate();
				}
			}
			public void partBroughtToTop(IWorkbenchPart p) {
			}
			public void partClosed(IWorkbenchPart p) {
			}
			public void partDeactivated(IWorkbenchPart p) {
			}
			public void partOpened(IWorkbenchPart p) {
			}
		};

	protected void handleActivate() {
		setSelection(getSelection());
	}
		
	/**
	 * This creates a model editor.
	 */
	public ContestCalcEditor() {
		super();
	}

	/**
	 * This is here for the listener to be able to call it.
	 */
	protected void firePropertyChange(int action) {
		super.firePropertyChange(action);
	}

	/**
	 * This sets the selection into whichever viewer is active.
	 */
	public void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			// I don't know if this should be run this deferred
			// because we might have to give the editor a chance to process the viewer update events
			// and hence to update the views first.
			//
			//
			Runnable runnable =
				new Runnable() {
					public void run() {
						// Try to select the items in the current content viewer of the editor.
						//
						if (currentViewer != null) {
							currentViewer.setSelection(new StructuredSelection(theSelection.toArray()), true);
						}
					}
				};
			runnable.run();
		}
	}

	public class AdapterFactoryFaceLabelProvider extends AdapterFactoryLabelProvider implements ITableFontProvider {
		Font font;
		public AdapterFactoryFaceLabelProvider(AdapterFactory adapterFactory, Composite composite) {
			super(adapterFactory);
			Font font = composite.getFont();
			FontData[] fontDatas = font.getFontData();
			for (int i = 0; i < fontDatas.length; i++) {
				fontDatas[i].setStyle(SWT.BOLD);
			}
			this.font = new Font(composite.getDisplay(), fontDatas);
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.ITableFontProvider#getFont(java.lang.Object, int)
		 */
		public Font getFont(Object element, int columnIndex) {
			Font RetVal = null;
			if (element instanceof ClassType || element instanceof ChainType) {
				RetVal = font;
			}
			return RetVal;
		}
	}

	/**
	 * This makes sure that one content viewer, either for the current page or the outline view, if it has focus,
	 * is the current one.
	 */
	public void setCurrentViewer(Viewer viewer) {
		// If it is changing...
		//
		if (currentViewer != viewer) {
			if (selectionChangedListener == null) {
				// Create the listener on demand.
				//
				selectionChangedListener =
					new ISelectionChangedListener() {
						// This just notifies those things that are affected by the section.
						//
						public void selectionChanged(SelectionChangedEvent selectionChangedEvent) {
							ISelection selection = selectionChangedEvent.getSelection();
							setSelection(selection);
						}
					};
			}

			// Stop listening to the old one.
			//
			if (currentViewer != null) {
				currentViewer.removeSelectionChangedListener(selectionChangedListener);
			}

			// Start listening to the new one.
			//
			if (viewer != null) {
				viewer.addSelectionChangedListener(selectionChangedListener);
			}

			// Remember it.
			//
			currentViewer = viewer;

			if( null != contentOutlinePage ) {
				((MyContentOutlinePage) contentOutlinePage).updateInput(this.currentPage);
			}
			// Set the editors selection based on the current viewer's selection.
			//
			setSelection(currentViewer == null ? StructuredSelection.EMPTY : currentViewer.getSelection());
		}
	}

	/**
	 * This returns the viewer as required by the {@link IViewerProvider} interface.
	 */
	public Viewer getViewer() {
		return currentViewer;
	}

	/**
	 * This is the method used by the framework to install your own controls.
	 */
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl( parent );
		
		// Only creates the other pages if there is something that can be edited
		//
		if (!getEditingDomain().getResourceSet().getResources().isEmpty() &&
		    !((Resource)getEditingDomain().getResourceSet().getResources().get(0)).getContents().isEmpty()) {
			tabFolder = new TabFolder(parent,SWT.BOTTOM);
			tabFolder.addSelectionListener( new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					handlePageChange( tabFolder.getSelectionIndex() );
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});
			{
				TabItem tabItem = new TabItem(tabFolder,SWT.NONE);
				tabItem.setText(getString("_UI_CalcEditorClassPage_label"));
				classViewer = new GridViewer(tabFolder);
				tabItem.setControl(classViewer.getGrid());
				viewers.add(classViewer);

				Grid grid = classViewer.getGrid();
				grid.setLayoutData(new GridData(GridData.FILL_VERTICAL, GridData.FILL_HORIZONTAL, true, true));
				grid.setHeaderVisible(true);
				grid.setLinesVisible(true);
				grid.setCellSelectionEnabled(true);
				grid.setSelectionEnabled(false);

				TextCellEditor textCellEditor = new TableInplaceTextCellEditor (grid);
				ArrayList<CellEditor> editorList = new ArrayList<CellEditor> ();

				ArrayList<String> propertyList = new ArrayList<String> ();
				
				int i = 0;
				GridColumn column = new GridColumn(grid, SWT.NONE);
				column.setText(getString ("_UI_NameColumn_label"));
				column.setTree(true);
				column.setWidth(100);
				editorList.add(null);
				propertyList.add(Integer.toString(i));
				
				for (i = 1; ChainTableItemProvider.maxColumns > i; ++i) {
					column  = new GridColumn(grid, SWT.NONE);
					column.setText(Integer.toString(i));
					column.setWidth(100);
					editorList.add(textCellEditor);
					propertyList.add(Integer.toString(i));
				}

				classViewer.setColumnProperties(propertyList.toArray(new String[0]));
				classViewer.setCellEditors(editorList.toArray(new CellEditor[0]));

				List<AdapterFactoryImpl> factories = new ArrayList<AdapterFactoryImpl>();
				factories.add(new ResourceItemProviderAdapterFactory());
				factories.add(new ContestClassItemProviderAdapterFactory());
//				factories.add(new ContestTableItemProviderAdapterFactory());
				factories.add(new ReflectiveItemProviderAdapterFactory());

				ComposedAdapterFactory adapter = new ComposedAdapterFactory(factories);

				ITreeContentProvider contentProvider = new AdapterFactoryContentProvider(adapter); 
				
				classViewer.setContentProvider(contentProvider);
				classViewer.setLabelProvider(new AdapterFactoryFaceLabelProvider(adapter, grid));

				CellModifier cellModifier = new CellModifier (adapter);
				classViewer.setCellModifier (cellModifier);
				
				//setPageText(pageIndex, getString ("_UI_CalcEditorClassPage_label"));
			}
			{
				TabItem tabItem = new TabItem(tabFolder,SWT.NONE);
				tabItem.setText(getString("_UI_CalcEditorChainPage_label"));
				chainViewer = new GridViewer(tabFolder);
				tabItem.setControl(chainViewer.getGrid());
				viewers.add(chainViewer);

				Grid grid = chainViewer.getGrid();
				grid.setLayoutData(new FillLayout());
				grid.setHeaderVisible(true);
				grid.setLinesVisible(true);
				grid.setCellSelectionEnabled(true);
				grid.setSelectionEnabled(false);

				TextCellEditor textCellEditor = new TableInplaceTextCellEditor (grid);
				ArrayList<CellEditor> editorList = new ArrayList<CellEditor> ();

				ArrayList<String> propertyList = new ArrayList<String> ();
				
				int i = 0;
				GridColumn column = new GridColumn(grid, SWT.NONE);
				column.setText(getString ("_UI_NameColumn_label"));
				column.setTree(true);
				column.setWidth(100);
				editorList.add(null);
				propertyList.add(Integer.toString(i));
				
				for (i = 1; ChainTableItemProvider.maxColumns > i; ++i) {
					column  = new GridColumn(grid, SWT.NONE);
					column.setText(Integer.toString(i));
					column.setWidth(100);
					editorList.add(textCellEditor);
					propertyList.add(Integer.toString(i));
				}

				chainViewer.setColumnProperties(propertyList.toArray(new String[0]));
				chainViewer.setCellEditors(editorList.toArray(new CellEditor[0]));

				List<AdapterFactoryImpl> factories = new ArrayList<AdapterFactoryImpl>();
				factories.add(new ResourceItemProviderAdapterFactory());
				factories.add(new ContestChainItemProviderAdapterFactory());
				factories.add(new ReflectiveItemProviderAdapterFactory());

				ComposedAdapterFactory adapter = new ComposedAdapterFactory(factories);

				ITreeContentProvider contentProvider = new AdapterFactoryContentProvider(adapter); 
				
				chainViewer.setContentProvider(contentProvider);
				chainViewer.setLabelProvider(new AdapterFactoryFaceLabelProvider(adapter, grid));

				CellModifier cellModifier = new CellModifier (adapter);
				chainViewer.setCellModifier (cellModifier);
				
				//setPageText(pageIndex, getString ("_UI_CalcEditorChainPage_label"));
			}
		}
		updateInput();
	}

	/**
	 * This is used to track the active viewer.
	 */
	protected void handlePageChange(int pageIndex) {
		currentPage = pageIndex;
		setCurrentViewer(viewers.get(pageIndex));
	}

	/**
	 * This is how the framework determines which interfaces we implement.
	 */
	@SuppressWarnings("unchecked")
	public <T> T getAdapter(Class<T> key) {
		if (key.equals(IContentOutlinePage.class)) {
			return showOutlineView() ? (T)getContentOutlinePage() : null;
		}
		else {
			return super.getAdapter(key);
		}
	}

	class MyContentOutlinePage extends ContentOutlinePage {
		public void createControl(Composite parent) {
			super.createControl(parent);
			contentOutlineViewer = getTreeViewer();
			updateInput( getActivePage() );
			contentOutlineViewer.addSelectionChangedListener(this);

		}

		public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
			super.makeContributions(menuManager, toolBarManager, statusLineManager);
			contentOutlineStatusLineManager = statusLineManager;
		}

		public void setActionBars(IActionBars actionBars) {
			super.setActionBars(actionBars);
			getActionBarContributor().shareGlobalActions(this, actionBars);
		}
		
	    @Override
		public void selectionChanged(SelectionChangedEvent event) {
	    	if( !isChanging ) {
	        	super.selectionChanged(event);
	    	}
	    }

	    public void updateInput( int page ) {
			// Set up the tree viewer.
			//
			List<AdapterFactoryImpl> factories = new ArrayList<AdapterFactoryImpl>();
			factories.add( new ContestTableItemProviderAdapterFactory() );
			EStructuralFeature feature = null;
			switch ( page ) {
			case 0:
				feature = ContestPackage.Literals.CONTEST_TYPE__CLASS;
				break;
			case 1:
				feature = ContestPackage.Literals.CONTEST_TYPE__CHAIN;
				break;
			}
			final EStructuralFeature f = feature;
			IContentProvider contentProvider = new ITreeContentProvider( ) {
				@Override
				public Object[] getElements(Object inputElement) {
					if( inputElement instanceof ContestType ) {
						return (( EList<?> )(( ContestType )inputElement).eGet(f)).toArray();
					}
					return null;
				}
				@Override
				public Object[] getChildren(Object parentElement) {
					if( parentElement instanceof ContestType ) {
						return (( EList<?> )(( ContestType )parentElement).eGet(f)).toArray();
					}
					return null;
				}
				@Override
				public Object getParent(Object element) {
					if( element instanceof EObject ) {
						return (( EObject )element).eContainer();
					}
					return null;
				}
				@Override
				public boolean hasChildren(Object element) {
					if( element instanceof ContestType ) {
						return !((EList<?>)(( ContestType )element).eGet(f)).isEmpty();
					}
					return false;
				}
			};

			ComposedAdapterFactory factory = new ComposedAdapterFactory( factories );
			
			isChanging = true;
			contentOutlineViewer.setContentProvider(contentProvider);
			contentOutlineViewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));
			contentOutlineViewer.setInput( contest );
			isChanging = false;
			updateSelection();
		}
		
		public void updateSelection() {
			StructuredSelection selection = new StructuredSelection(currentViewer.getInput());
			setSelection(selection);
		}
		
		protected boolean isChanging = false;
	}
	/**
	 * This accesses a cached version of the content outliner.
	 */
	public IContentOutlinePage getContentOutlinePage() {
		if (contentOutlinePage == null) {
			// The content outline is just a tree.
			//

			contentOutlinePage = new MyContentOutlinePage();

			// Listen to selection so that we can handle it is a special way.
			//
			contentOutlinePage.addSelectionChangedListener
				(new ISelectionChangedListener() {
					 // This ensures that we handle selections correctly.
					 //
					 public void selectionChanged(SelectionChangedEvent event) {
						 handleContentOutlineSelection(event.getSelection());
					 }
				 });
		}

		return contentOutlinePage;
	}

	/**
	 * This deals with how we want selection in the outliner to affect the other views.
	 */
	public void handleContentOutlineSelection(ISelection selection) {
		if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
			Iterator<?> selectedElements = ((IStructuredSelection)selection).iterator();
			if (selectedElements.hasNext()) {
				// Get the first selected element.
				//
				Object selectedElement = selectedElements.next();
				updatePageInput( this.getActivePage(), selectedElement );
			}
		} else {
			updatePageInput( this.getActivePage(), null );
		}
	}

	/**
	 */
	public void setFocus() {
		if (currentViewer != null) {
			currentViewer.getControl().setFocus();
		}
	}
	
	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help fill the context menus with contributions from the Edit menu.
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener)getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
	}

	/**
	 */
	public EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor)getEditorSite().getActionBarContributor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	/**
	 */
	public void dispose() {

		if (getActionBarContributor().getActiveEditor() == this) {
			getActionBarContributor().setActiveEditor(null);
		}

		if (contentOutlinePage != null) {
			contentOutlinePage.dispose();
		}

		super.dispose();
	}

	/**
	 * Returns whether the outline view should be presented to the user.
	 */
	protected boolean showOutlineView() {
		return true;
	}
	
	protected void updateViewerColumn( GridViewer viewer ) {
		IBaseLabelProvider provider = viewer.getLabelProvider();
		if( provider instanceof ITableLabelProvider ) {
			ITableLabelProvider tableLabelProvider = ( ITableLabelProvider ) provider;
			Object element = viewer.getInput();
			Grid grid = viewer.getGrid();
			for( int i = 0; i < grid.getColumnCount(); ++i ) {
				GridColumn col = grid.getColumn( i );
				String text = tableLabelProvider.getColumnText( element, i );
				if( null == text ) {
					text = "";
				}
				col.setText( text );
				Image img = tableLabelProvider.getColumnImage( element, i );
				col.setImage( img );
			}
		}
	}
	
	protected void updatePageInput( int page, Object selectedElement )	{
		switch( page ) {
		case 0: 
			{ // classpage
				GridViewer gridViewer = classViewer;
				IContentProvider provider = gridViewer.getContentProvider();
				if( provider instanceof ITreeContentProvider ) {
					ITreeContentProvider treeContentProvider = ( ITreeContentProvider ) provider;
					Object element = selectedElement;
					while( !( element instanceof ClassType ) && null != element ) {
						element = treeContentProvider.getParent( element );
					}
					if( null == element && 0 < contest.getClass_().size( ) ) {
						element = contest.getClass_().get( 0 );
					}
					setViewerInput( gridViewer, selectedElement );
				}
			}
			break;
		case 1: 
			{ // chainpage 
				GridViewer gridViewer = chainViewer;
				IContentProvider provider = gridViewer.getContentProvider();
				if( provider instanceof ITreeContentProvider ) {
					ITreeContentProvider treeContentProvider = ( ITreeContentProvider ) provider;
					Object element = selectedElement;
					while( !( element instanceof ChainType ) && null != element ) {
						element = treeContentProvider.getParent( element );
					}
					if( null == element && 0 < contest.getChain().size( ) ) {
						element = contest.getChain().get( 0 );
					}
					setViewerInput( gridViewer, selectedElement );
				}
			}
			break;
		}
	}

	protected void setViewerInput( GridViewer viewer, Object input ) {
		if( null == input) {
			// force refresh
			viewer.setInput( null );
		}
		if( input != viewer.getInput() ) {
			viewer.setInput( input );
			updateViewerColumn( viewer );
		}
	}
	
	private void updateInput( )
	{
		try {
			contest = getRootElement(ContestType.class);
			ClassType class_ = contest.getClass_().isEmpty() ? null : contest.getClass_().get(0);
			setViewerInput( classViewer, class_ );
			ChainType chain = contest.getChain().isEmpty() ? null : contest.getChain().get(0);
			setViewerInput( chainViewer, chain );
			setCurrentViewer( viewers.get(currentPage) );
			String name = getInputName();
		    name += " (" + ContestEditorPlugin.INSTANCE.getString("_UI_ContestCalcEditor_label") + ")";
		    this.setPartName( name );
		} catch( Exception e ) {
			e.printStackTrace();
		}
		
	}
	protected int getActivePage() {
		return currentPage;
	}

	private ContestType contest = null;
	TabFolder tabFolder = null;
	int currentPage = 0;
	ArrayList< Viewer > viewers = new ArrayList<Viewer>();
}
