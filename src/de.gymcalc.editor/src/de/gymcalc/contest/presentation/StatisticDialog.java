package de.gymcalc.contest.presentation;

import java.util.HashSet;
import java.util.Hashtable;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.addressbook.PersonType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;

public class StatisticDialog extends Dialog {


	public StatisticDialog( Shell shell, EditingDomain editingDomain ) {
		super( shell );
		ResourceSet rs = editingDomain.getResourceSet();
		setContest( (ContestType) rs.getResources().get( 0 ).getContents().get( 0 ) );
	}
	
	public void setContest( ContestType contest ) {
		m_contest = contest;
	}
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite retVal = (Composite) super.createDialogArea(parent);
		Layout topLayout = new GridLayout( );
		this.m_statistic = new Text( retVal, SWT.READ_ONLY | SWT.MULTI );
		this.m_statistic.setLayoutData( new GridData( GridData.FILL_BOTH ) );
		retVal.setLayout( topLayout );
		this.m_statistic.setText( getStatistic( ) );
		return retVal;
	}

	protected String getStatistic( ) {
		String retVal = "";
		if( null != m_contest ) {
			Hashtable< String, Object > statistic = new Hashtable< String, Object >( );
			updateStatistic( m_contest, statistic );
			retVal = statistic.toString();
		}
		return retVal;
	}
	protected void updateStatistic( ContestType contest, Hashtable<String, Object> statistic) {
		statistic.clear();
		statistic.put( "Teilnehmer", getCountOfAthlets( contest ) );
		statistic.put( "Mannschaften", getCountOfTeams( contest ) );
		statistic.put( "Kampfrichter", getCountOfJurists( contest ) );
		statistic.put( "Vereine", getCountOfOrganizations( contest ) );
		statistic.put( "Medaillen", getCountOfWinner( contest, 1, 3, true ) );
		statistic.put( "Gold", getCountOfWinner( contest, 1, 1, true ) );
		statistic.put( "Silber", getCountOfWinner( contest, 2, 2, true ) );
		statistic.put( "Bronze", getCountOfWinner( contest, 3, 3, true ) );
		statistic.put( "Urkunden", getCountOfWinner( contest, 1, 6, false ) );
	}
	static protected int getCountOfAthlets( ContestType contest ){
		int retVal = 0;
		HashSet<PersonType> persons = new HashSet<PersonType>();
		for( ClassType class_ : contest.getClass_() ){
			for( WinnerType winner : class_.getWinner() ) {
				if( winner instanceof AthletType ) {
					persons.add( ( ( AthletType ) winner ).getPerson( ) );
				}
			}
		}
		retVal = persons.size();
		return retVal;
	}
	static protected int getCountOfTeams( ContestType contest ){
		int retVal = 0;
		HashSet<TeamType> set = new HashSet<TeamType>();
		for( ClassType class_ : contest.getClass_() ){
			for( WinnerType winner : class_.getWinner() ) {
				if( winner instanceof TeamType ) {
					set.add( ( TeamType ) winner );
				}
			}
		}
		retVal = set.size();
		return retVal;
	}
	static protected int getCountOfJurists( ContestType contest ){
		int retVal = 0;
		HashSet<PersonType> persons = new HashSet<PersonType>();
		for( JuriType juri : contest.getJuri() ){
			for( JuristType j : juri.getJurist() ) {
				persons.add( j.getPerson( ) );
			}
		}
		retVal = persons.size();
		return retVal;
	}
	static protected int getCountOfWinner( ContestType contest, int minRank, int maxRank, boolean perAthlet ){
		/* Anzahl der Medaillen, wenn jedes Mannschaftmitglied eine Medaille erhält */
		int retVal = 0;
		for( ClassType class_ : contest.getClass_() ){
			for( WinnerType winner : class_.getWinner() ) {
				if( null != winner.getResult() && 
					maxRank >= winner.getResult().getRank() &&
					minRank <= winner.getResult().getRank() ) {
					if( perAthlet ) {
						if( winner instanceof AthletType ) {
							++retVal;
						} else if( winner instanceof TeamType ) {
							retVal += ( ( TeamType ) winner ).getAthlet().size();
						}
					} else {
						++retVal;
					}
				}
			}
		}
		return retVal;
	}
	static protected int getCountOfOrganizations( ContestType contest ){
		int retVal = 0;
		HashSet<OrganizationType> set = new HashSet<OrganizationType>();
		for( ClassType class_ : contest.getClass_() ){
			for( WinnerType winner : class_.getWinner() ) {
				set.add( winner.getOrganization() );
			}
		}
		retVal = set.size();
		return retVal;
	}
	private Text m_statistic;
	private ContestType m_contest;
}
