package de.gymcalc.print;

import java.io.Writer;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;

import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.StationType;
import de.gymcalc.contest.WinnerType;
import de.gymcalc.contest.ClassType;

public class CreateJuryFormHtml {

	AdapterFactory factory;
	
	public CreateJuryFormHtml (AdapterFactory factory) {
		this.factory = factory;
	}
	
	void createReport (Object object, Writer writer) {
		try {
			if (object instanceof ContestType) {
				ContestType contest = (ContestType) object;
				EList<?> chains = contest.getChain();
				for (Iterator<?> c = chains.iterator (); c.hasNext ();) {
					ChainType chain = (ChainType) c.next ();
					EList<?> stations = chain.getStation ();
					for (Iterator<?> s = stations.iterator (); s.hasNext ();) {
						StationType station = (StationType) s.next ();
						writer.write("<h2>");
						writer.write(chain.getName ());
						writer.write(" ");
						writer.write(station.getName ());
						writer.write("</h2>");
						EList<?> winners = chain.getAthlet ();
						writer.write("<table border=\"1\" cellspacing=\"0\">");
						writer.write("<tr height=\"40\">");
						writer.write("<th>");
						writer.write("</th>");
						writer.write("<td width=\"200\">");
						writer.write("");
						writer.write("</td>");
						writer.write("<td width=\"50\">");
						writer.write("Kari 1");
						writer.write("</td>");
						writer.write("<td width=\"50\">");
						writer.write("Kari 2");
						writer.write("</td>");
						writer.write("<td width=\"50\">");
						writer.write("");
						writer.write("</td>");
						writer.write("</tr>");
						for (Iterator<?> w = winners.iterator (); w.hasNext ();){
							WinnerType winner = (WinnerType) w.next ();
							writer.write("<tr height=\"40\">");
							writer.write("<th>");
							writer.write(winner.getName ());
							String disable = winner.getDisable ();
							if (null != disable && 0 != disable.length ()) {
								writer.write (" (" + disable + ")");
							}
							writer.write("</th>");
							writer.write("<td>");
							writer.write(((ClassType)winner.eContainer ()).getName());
							writer.write("</td>");
							writer.write("<td>");
							writer.write("</td>");
							writer.write("<td>");
							writer.write("</td>");
							writer.write("<td>");
							writer.write("</td>");
							writer.write("</tr>");
						}
						writer.write("</table>");
					}
				}
			}
		} catch (Exception e) {
			
		}
	}
}
