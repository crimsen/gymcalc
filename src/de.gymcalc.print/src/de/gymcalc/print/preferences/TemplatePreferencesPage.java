package de.gymcalc.print.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;

public class TemplatePreferencesPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public final static String TEMPLATE_DIR_PREFERENCE = "de.turnen.spremberg.contest.templatedirectory";
	public final static String GENERATION_DIR_PREFERENCE = "de.turnen.spremberg.contest.generationdirectory";

	public static String getTemplateDir( )
	{
		String retVal = null;
		IPreferenceStore s = PlatformUI.getPreferenceStore();
		if( null != s ) {
			retVal = s.getString( TEMPLATE_DIR_PREFERENCE );
		}
		return retVal;
	}
	public static String getGenerationDir( )
	{
		String retVal = null;
		IPreferenceStore s = PlatformUI.getPreferenceStore();
		if( null != s ) {
			retVal = s.getString( GENERATION_DIR_PREFERENCE );
		}
		return retVal;
	}
	public TemplatePreferencesPage()
	{
		IPreferenceStore s = PlatformUI.getPreferenceStore();
		this.setPreferenceStore( s );
	}

	public void init(IWorkbench workbench) {
		
	}
	
	@Override
	protected void createFieldEditors( ) {
		DirectoryFieldEditor tempdir = new DirectoryFieldEditor(
				TEMPLATE_DIR_PREFERENCE,
				"&Template Directory:",
		 		getFieldEditorParent( ) );
			addField( tempdir );	
		DirectoryFieldEditor gendir = new DirectoryFieldEditor(
				GENERATION_DIR_PREFERENCE,
				"&Generation Directory:",
				getFieldEditorParent( ) );
			addField( gendir );	
	}

}
