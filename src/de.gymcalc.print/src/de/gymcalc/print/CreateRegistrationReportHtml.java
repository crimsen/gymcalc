package de.gymcalc.print;

import java.io.Writer;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;

import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;

public class CreateRegistrationReportHtml {

	AdapterFactory factory;
	boolean useOrganization;
	
	public CreateRegistrationReportHtml (AdapterFactory factory, boolean useOrganization) {
		this.factory = factory;
		this.useOrganization = useOrganization;
	}
	
	void createReport (Object object, Writer writer) {
		try {
			if (object instanceof ContestType) {
				ContestType contest = (ContestType) object;
				EList<?> classes = contest.getClass_();
				for (Iterator<?> c = classes.iterator (); c.hasNext ();) {
					ClassType class_ = (ClassType) c.next ();
					writer.write("<h2>");
					writer.write(class_.getName ());
					writer.write("</h2>");
					EList<?> winners = class_.getWinner ();
					writer.write("<table>");
					for (Iterator<?> w = winners.iterator (); w.hasNext ();){
						WinnerType winner = (WinnerType) w.next ();
						if( winner instanceof AthletType) {
							AthletType athlet = (AthletType) winner;
							writer.write("<tr>");
							writer.write("<td>");
							writer.write(athlet.getName ());
							writer.write("</td>");
							writer.write("<td>");
							writer.write(athlet.getPerson ().getDateofbirth ().toString());
							writer.write("</td>");
							if (this.useOrganization) {
								writer.write("<td>");
								writer.write(athlet.getOrganization().getName ());
								writer.write("</td>");
							}
							writer.write("</tr>");
						} else if ( winner instanceof TeamType ) {
							TeamType team = (TeamType) winner;
							writer.write("<tr>");
							writer.write("<td>");
							writer.write(team.getName( ));
							writer.write("</td>");
							writer.write("<td>");
							EList<?> athlets = team.getAthlet();
							for (Iterator<?> i = athlets.iterator( ); i.hasNext( ); ){
								AthletType athlet = (AthletType) i.next( );
								writer.write(athlet.getName( ));
								writer.write("; ");
							}
							writer.write("</td>");
							writer.write("</tr>");
						}
					}
					writer.write("</table>");
					writer.write("Anzahl der Starter:");
					writer.write(Integer.toString(winners.size ()));
				}
				EList<?> juries = contest.getJuri();
				for (Iterator<?> j = juries.iterator (); j.hasNext ();) {
					JuriType juri = (JuriType) j.next ();
					writer.write("<h2>");
					writer.write("Kampfrichter ");
					writer.write( juri.getName() );
					writer.write("</h2>");
					EList<?> jurists = juri.getJurist ();
					String diszipline = "";
					EList<?> disziplines = juri.getDiszipline();
					Iterator<?> i = disziplines.iterator();
					while (i.hasNext()) {
						DisziplineType d = (DisziplineType) i.next();
						diszipline += d.getName()+ ", ";
					}
					writer.write (diszipline);
					writer.write("<table>");
					for (Iterator<?> j2 = jurists.iterator (); j2.hasNext ();) {
						JuristType jurist = (JuristType) j2.next ();
						writer.write("<tr>");
						writer.write("<td>");
						writer.write(jurist.getName ());
						writer.write("</td>");
						OrganizationType o = jurist.getOrganization();
						if (null != o) {
							writer.write("<td>");
							writer.write(jurist.getOrganization().getName ());
							writer.write("</td>");
						}
						
						writer.write("</tr>");
					}
					writer.write("</table>");
					writer.write("Anzahl:");
					writer.write(Integer.toString(jurists.size ()));
				}
			}
		} catch (Exception e) {
			
		}
	}
}
