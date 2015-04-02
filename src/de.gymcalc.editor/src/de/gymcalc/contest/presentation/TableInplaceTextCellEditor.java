package de.gymcalc.contest.presentation;

import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Composite;

public class TableInplaceTextCellEditor extends TextCellEditor {

	public TableInplaceTextCellEditor() {
		super();
	}

	public TableInplaceTextCellEditor(Composite parent, int style) {
		super(parent, style);
	}

	public TableInplaceTextCellEditor(Composite parent) {
		super(parent);
	}

	@Override
	public void activate(ColumnViewerEditorActivationEvent activationEvent) {
		super.activate(activationEvent);
		if( activationEvent.sourceEvent instanceof KeyEvent ) {
			KeyEvent e = ( KeyEvent ) activationEvent.sourceEvent;
			String a = "0123456789abcdefghijklmnopqrstuvwxyzäöüßABCDEFGHIJKLMNOPQRSTUVWXYZÄÖÜ^°!\"§$%&/()=?´`+*#'<>,;.:-_²³\\@€~µ1";
			if( -1 != a.indexOf( e.character ) ) {
				doSetValue( String.valueOf( e.character ) );
				inActivation = true;
			}
		}
	}

	@Override
	protected void doSetFocus() {
		super.doSetFocus();
		if( inActivation ) {
			text.setSelection( text.getCharCount() );
		}
	}
	
	boolean inActivation = false;

}
