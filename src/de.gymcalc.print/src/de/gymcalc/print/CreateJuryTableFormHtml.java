package de.gymcalc.print;

import java.io.Writer;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;

import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.StationType;
import de.gymcalc.contest.WinnerType;

public class CreateJuryTableFormHtml {

	AdapterFactory factory;
	
	public CreateJuryTableFormHtml (AdapterFactory factory) {
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
					writer.write("<table border=\"1\" cellspacing=\"0\">");
					writer.write("<tr height=\"20\"><td>&nbsp;</td>");
					for (Iterator<?> s = stations.iterator (); s.hasNext ();) {
						StationType station = (StationType) s.next ();
						writer.write("<th>");
						writer.write(station.getName ());
						writer.write("</th>");
					}
					writer.write("</tr>");
					EList<?> winners = chain.getAthlet ();
					for (Iterator<?> w = winners.iterator (); w.hasNext ();){
						WinnerType winner = (WinnerType) w.next ();
						writer.write("<tr height=\"20\">");
						writer.write("<td>");
						writer.write(winner.getName ());
						writer.write("</td>");
						for (Iterator<?> s = stations.iterator (); s.hasNext (); s.next()) {
							writer.write("<td>&nbsp;</td>");
						}
						writer.write("</tr>");
					}
					// provide 3 additional empty rows
					for (int i = 0; 3 > i; ++i) {
						writer.write("<tr height=\"20\">");
						writer.write("<td>&nbsp;</td>");
						for (Iterator<?> s = stations.iterator (); s.hasNext (); s.next()) {
							writer.write("<td>&nbsp;</td>");
						}
						writer.write("</tr>");
					}
					writer.write("</table>");
				}
			}
		} catch (Exception e) {
			
		}
	}
}
