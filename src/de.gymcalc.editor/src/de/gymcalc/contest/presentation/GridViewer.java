package de.gymcalc.contest.presentation;

import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.nebula.jface.gridviewer.GridTreeViewer;
import org.eclipse.nebula.jface.gridviewer.GridViewerEditor;
import org.eclipse.nebula.widgets.grid.Grid;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Composite;

public class GridViewer extends GridTreeViewer {

	public GridViewer(Composite parent, int style) {
		super(parent, style);
		// TODO Auto-generated constructor stub
	}

	public GridViewer(Composite parent) {
		super(parent);
		// TODO Auto-generated constructor stub
	}

	public GridViewer(Grid grid) {
		super(grid);
		// TODO Auto-generated constructor stub
	}

	protected ColumnViewerEditor createViewerEditor() {
		GridViewerEditor.create(this, 
			new ColumnViewerEditorActivationStrategy(this) {
				protected boolean isEditorActivationEvent(
						ColumnViewerEditorActivationEvent event) {
					boolean singleSelect = ((IStructuredSelection)getViewer().getSelection()).size() == 1;
					boolean isLeftMouseSelect = event.eventType == ColumnViewerEditorActivationEvent.MOUSE_CLICK_SELECTION && ((MouseEvent)event.sourceEvent).button == 1;
					boolean isKeyBoardSelect = event.eventType == ColumnViewerEditorActivationEvent.KEY_PRESSED && -1 != editChars.indexOf(event.character);
					
					return singleSelect && (isLeftMouseSelect
							|| event.eventType == ColumnViewerEditorActivationEvent.PROGRAMMATIC
							|| event.eventType == ColumnViewerEditorActivationEvent.TRAVERSAL
							|| isKeyBoardSelect);
				}
			}, ColumnViewerEditor.TABBING_VERTICAL | ColumnViewerEditor.KEYBOARD_ACTIVATION);
		
		return getColumnViewerEditor();
	}

	@Override
	protected void internalRefresh(Object element, boolean updateLabels) {
		// if the changed element is a parent of root then do a full refresh
/*
		Object o = getRoot ();
		if (o instanceof EObject) {
			EObject e = (EObject) o;
			EObject et = e;
			while (null != et) {
				if (equals (et, element)) {
					element = null;
					break;
				}
				e = et;
				et = e.eContainer ();
			}
			Resource r = e.eResource();
			if (null == r || equals (r, element)) {
				if (element instanceof Resource) {
					Object newInput = ((Resource)element).getContents().get(0);
					setInput (newInput);
				}
				element = null;
			}
		} else {
			IContentProvider cp = getContentProvider();
			if (cp instanceof ITreeContentProvider) {
				while (null != o) {
					ITreeContentProvider tcp = (ITreeContentProvider) cp;
					if (equals(o, element)) {
						element = null;
						break;
					}
					o = tcp.getParent(o);
				}
			}
		}

		// If element is null, do a full refresh.
		if (element == null) {
			internalRefresh(getControl(), getRoot(), true, updateLabels);
			return;
		}
		Widget[] items = findItems(element);
		if (items.length != 0) {
			for (int i = 0; i < items.length; i++) {
				// pick up structure changes too
				internalRefresh(items[i], element, true, updateLabels);
			}
		}
		*/
		super.internalRefresh(element, updateLabels);
	}
	static String editChars = new String("0123456789abcdefghijklmnopqrstuvwxyzäöüßABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ.,-_;:µ<>|@€+*~#'´`\\?}=])[({/&%$³§²\"!^°");
}
