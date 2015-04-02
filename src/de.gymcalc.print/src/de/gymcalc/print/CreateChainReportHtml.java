package de.gymcalc.print;

import java.io.Writer;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;

import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.StationType;
import de.gymcalc.contest.WinnerType;

public class CreateChainReportHtml {

	AdapterFactory factory;
	
	public CreateChainReportHtml (AdapterFactory factory) {
		this.factory = factory;
	}
	
	void createReport (Object object, Writer writer) {
		try {
			if (object instanceof ContestType) {
				ContestType contest = (ContestType) object;
				EList<?> chains = contest.getChain();
				for (Iterator<?> c = chains.iterator (); c.hasNext ();) {
					ChainType chain = (ChainType) c.next ();
					writer.write("<h2>");
					writer.write(chain.getName ());
					writer.write("</h2>");
					EList<?> stations = chain.getStation ();
					writer.write("<ol>");
					for (Iterator<?> s = stations.iterator (); s.hasNext ();) {
						StationType station = (StationType) s.next ();
						writer.write("<li>");
						writer.write(station.getName ());
						writer.write("</li>");
					}
					writer.write("</ol>");
					EList<?> winners = chain.getAthlet ();
					writer.write("<table>");
					for (Iterator<?> w = winners.iterator (); w.hasNext ();){
						WinnerType winner = (WinnerType) w.next ();
						writer.write("<tr>");
						writer.write("<td>");
						String disable = winner.getDisable ();
						if (null != disable) {
							writer.write(disable);
						}
						writer.write("</td>");
						writer.write("<td>");
						if (winner.eContainer() instanceof ClassType) {
							writer.write(((ClassType)winner.eContainer()).getName());
						}
						writer.write("</td>");
						writer.write("<td>");
						writer.write(winner.getName ());
						writer.write("</td>");
						writer.write("<td>");
						if (null != winner.getOrganization()) {
							writer.write(winner.getOrganization().getName ());
						}
						writer.write("</td>");
						writer.write("</tr>");
					}
					writer.write("</table>");
				}
			}
		} catch (Exception e) {
			
		}
	}
}
