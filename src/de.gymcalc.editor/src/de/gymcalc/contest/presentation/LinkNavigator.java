package de.gymcalc.contest.presentation;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.part.EditorPart;

import de.gymcalc.contest.ContestPackage;

public class LinkNavigator implements IHyperlinkListener {

	LinkNavigator( EditorPart context ) {
		this.context = context;
	}
	@Override
	public void linkEntered(HyperlinkEvent e) {
	}

	@Override
	public void linkExited(HyperlinkEvent e) {
	}

	@Override
	public void linkActivated(HyperlinkEvent e) {
		navigateTo( e.getHref( ) );
	}

	public void navigateTo( Object obj ) {
		
		IWorkbenchPage page = context.getSite().getPage();
		IEditorInput input = context.getEditorInput();
		try {
			if( obj.equals( ContestPackage.Literals.ATHLET_TYPE ) ) {
				page.openEditor( input,
					"de.gymcalc.contest.presentation.RegistrationEditorID",
					true,
					IWorkbenchPage.MATCH_ID );
			} else if( obj.equals( ContestPackage.Literals.TEAM_TYPE ) ) {
				page.openEditor( input,
						"de.gymcalc.contest.presentation.RegistrationTeamEditorID",
						true,
						IWorkbenchPage.MATCH_ID );
			} else if( obj.equals( ContestPackage.Literals.JURIST_TYPE ) ) {
				page.openEditor( input,
						"de.gymcalc.contest.presentation.RegistrationJuristEditorID",
						true,
						IWorkbenchPage.MATCH_ID );
			} else if( obj.equals( ContestPackage.Literals.JURI_RESULT_TYPE ) ) {
				page.openEditor( input,
						"de.gymcalc.contest.presentation.ContestCalcEditorID",
						true,
						IWorkbenchPage.MATCH_ID );
			} else if( obj.equals( ContestPackage.Literals.CLASS_TYPE ) ) {
				page.openEditor( input,
						"de.gymcalc.contest.presentation.ContestClassEditorID",
						true,
						IWorkbenchPage.MATCH_ID );
			}
		} catch ( PartInitException e ) {
			
		}
	}
	
	EditorPart context;
}
