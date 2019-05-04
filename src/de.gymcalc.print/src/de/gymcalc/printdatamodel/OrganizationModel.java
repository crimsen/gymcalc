package de.gymcalc.printdatamodel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;

public class OrganizationModel {
	public static String modelName = "http://www.gymcalc.de/OrganizationModel";

	public OrganizationModel( DialogSettings options ) {
		this.options = options;
	}
	public Object getSelectedModel( Object src, IStructuredSelection selection,
			AdapterFactory adapter ) {
		Object retVal = null;
		setSelection( selection );
		retVal = getModel(src, adapter);
		return retVal;
	}
	public void setSelection( IStructuredSelection selection ) {
		this.selected = new ArrayList<Object>();
		/* TODO: selection currently not supported, look at protocolmodel to do so */
	}

	Object getModel( Object src, AdapterFactory factory ) {
		Map<String, Object> retVal = null;
		/*
		 * contest
		 * +-organization
		 *   +-name
		 *   +-winner
		 *     +-name
		 *     +-disable
		 *     +-class
		 *     +-team
		 *     +-data_of_birth?
		 *   +-jurist
		 *     +-name
		 *     +-jury
		 *     +-wishApparatus
		 *     +-license
		 */
		if( src instanceof ContestType ) {
			ContestType contestsrc = (ContestType) src;
			List<ClassType> teamClasses = getTeamClasses(contestsrc);
			List<ClassType> classessrc = getAthletClasses(contestsrc);						
			retVal = new HashMap<String, Object>( );
			Map<String, Object> contest = new HashMap<String, Object>();
			retVal.put("contest", contest);
			List<Object> organizations = new ArrayList<Object>();
			contest.put("organization", organizations);
			EList<OrganizationType> organizationssrc = contestsrc.getAddressbook().getOrganization();
			Iterator<OrganizationType> iorganization = organizationssrc.iterator();
			while(iorganization.hasNext()) {
				OrganizationType organizationsrc = iorganization.next();
				Map<String, Object> organization = new HashMap<String, Object>();
				organizations.add(organization);
				organization.put("name", organizationsrc.getName());
				List<Object> winners = new ArrayList<Object>();
				organization.put("winner", winners);
				Iterator<ClassType> iclass = classessrc.iterator();
				while( iclass.hasNext() ) {
					ClassType classsrc = iclass.next();
					String className = classsrc.getName();
					EList<WinnerType> winnerssrc = classsrc.getWinner();
					Iterator<WinnerType> iwinner = winnerssrc.iterator();
					while( iwinner.hasNext() ) {
						WinnerType winnersrc = iwinner.next();
						if( organizationsrc == winnersrc.getOrganization() ) {
							Map<String, Object> winner = new HashMap<String, Object>();
							winners.add(winner);
							winner.put("name", winnersrc.getName());
							winner.put("disable", winnersrc.getDisable() );
							winner.put("class", className);
							winner.put("team", getTeamName(teamClasses, winnersrc));
							if( winnersrc instanceof AthletType ) {
								Date d = ( (( AthletType )winnersrc).getPerson().getDateofbirth() );
								SimpleDateFormat f = new SimpleDateFormat( "dd.MM.yyyy" );
								String date = f.format( d );
								winner.put("date_of_birth", date );
							}
						}
					}
				}
				List<Object> jurists = new ArrayList<Object>();
				organization.put("jurist", jurists);
				Iterator<JuriType> iJury = contestsrc.getJuri().iterator();
				while( iJury.hasNext() ) {
					JuriType jurySrc = iJury.next();
					String juryName = jurySrc.getName();
					EList<JuristType> juristsSrc = jurySrc.getJurist();
					Iterator<JuristType> iJurist = juristsSrc.iterator();
					while( iJurist.hasNext() ) {
						JuristType juristSrc = iJurist.next();
						if( organizationsrc == juristSrc.getOrganization() ) {
							Map<String, Object> jurist = new HashMap<String, Object>();
							jurists.add(jurist);
							jurist.put("name", juristSrc.getName());
							jurist.put("jury", juryName);
							jurist.put("wishApparatus", juristSrc.getWishApparatus());
							jurist.put("license", juristSrc.getLicense());
						}
					}
				}
			}
		}
		return retVal;
	}
	List<ClassType> getTeamClasses(ContestType contest) {
		List<ClassType> retVal = new ArrayList<ClassType>();
		EList<ClassType> classes = contest.getClass_();
		Iterator<ClassType> iclass = classes.iterator();
		while( iclass.hasNext() ) {
			ClassType class_ = iclass.next();
			EList<WinnerType> winners = class_.getWinner();
			Iterator<WinnerType> iWinner = winners.iterator();
			if( iWinner.hasNext() ) {
				WinnerType winner = iWinner.next();
				if( winner instanceof TeamType ) {
					retVal.add(class_);
				}
			}
		}
		return retVal;
	}
	List<ClassType> getAthletClasses(ContestType contest) {
		List<ClassType> retVal = new ArrayList<ClassType>();
		EList<ClassType> classes = contest.getClass_();
		Iterator<ClassType> iclass = classes.iterator();
		while( iclass.hasNext() ) {
			ClassType class_ = iclass.next();
			EList<WinnerType> winners = class_.getWinner();
			Iterator<WinnerType> iWinner = winners.iterator();
			if( iWinner.hasNext() ) {
				WinnerType winner = iWinner.next();
				if( winner instanceof AthletType ) {
					retVal.add(class_);
				}
			}
		}
		return retVal;
	}
	String getTeamName(List<ClassType> teamClasses, WinnerType winnersrc) {
		String retVal = new String("");
		OrganizationType organization = winnersrc.getOrganization();
		Iterator<ClassType> iClass = teamClasses.iterator();
		while(iClass.hasNext() && retVal.isEmpty()) {
			ClassType class_ = iClass.next();
			EList<WinnerType> winners = class_.getWinner();
			Iterator<WinnerType> iWinner = winners.iterator();
			while( iWinner.hasNext() ) {
				WinnerType winner = iWinner.next();
				if( winner instanceof TeamType ) {
					TeamType team = (TeamType) winner;
					if( team.getOrganization() == organization ) {
						EList<AthletType> athlets = team.getAthlet();
						if( athlets.contains( winnersrc ) ) {
							retVal = team.getName();
							break;
						}
					}
				}
			}
		}
		return retVal;
	}
	@SuppressWarnings("unused")
	private Collection<Object> selected;
	@SuppressWarnings("unused")
	private DialogSettings options;
}
