package de.gymcalc.print;

import java.io.Writer;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.WinnerType;

public class CreateCertificateReportTxt {

	AdapterFactory factory;
	
	public CreateCertificateReportTxt (AdapterFactory factory) {
		this.factory = factory;
	}
	
	void createReport (Object object, Writer writer) {
		try {
			ClassType class_ = (ClassType)object;
			String className = ((ClassType)object).getName();
			EList<?> winners = class_.getWinner();
			Iterator<?> i = winners.iterator();
			while (i.hasNext()) {
				WinnerType winner = (WinnerType) i.next();
				String name = "";
				if (winner instanceof AthletType) {
					name = ((AthletType)winner).getPerson().getFirstname();
					name += " ";
					name += ((AthletType)winner).getPerson().getName(); 
				} else {
					name = winner.getName();
				}
				writer.write ('"');
				writer.write(name);
				writer.write ("\";\"");
				writer.write (className);
				writer.write ("\";\"");
				writer.write (Integer.toString(winner.getResult().getRank()));
				writer.write ("\";\"");
				writer.write (Double.toString(winner.getResult().getPoints()));
				writer.write ("\"\n");
			}
		} catch (Exception e) {
			
		}
	}
}
