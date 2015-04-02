package de.gymcalc.contest.presentation;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;

public class PreferencesPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public final static String CONTACT_URI = "de.turnen.spremberg.contest.contacturi";

	public static String getContactUri( )
	{
		String retVal = null;
		IPreferenceStore s = PlatformUI.getPreferenceStore();
		if( null != s ) {
			retVal = "file://" + s.getString( CONTACT_URI );
		}
		return retVal;
	}
	public PreferencesPage()
	{
		IPreferenceStore s = PlatformUI.getPreferenceStore();
		this.setPreferenceStore( s );
	}

	public void init(IWorkbench workbench) {
		
	}
	
	@Override
	protected void createFieldEditors( ) {
		FileFieldEditor tempdir = new FileFieldEditor(
				CONTACT_URI,
				"&Kontakt File:",
		 		getFieldEditorParent( ) );
			addField( tempdir );	
	}

}
