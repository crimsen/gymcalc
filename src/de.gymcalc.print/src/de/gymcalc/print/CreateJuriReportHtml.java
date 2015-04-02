package de.gymcalc.print;

import java.io.Writer;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;

import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;

public class CreateJuriReportHtml {

	AdapterFactory factory;
	
	public CreateJuriReportHtml (AdapterFactory factory) {
		this.factory = factory;
	}
	
	void createJuriReportHtml (Object object, Writer writer) {
		try {
			if (object instanceof JuriType) {
				JuriType jury = (JuriType) object;
				writer.write("<h1>");
				writer.write("Kampfrichter");
				writer.write("</h1>");
				writer.write("<ul>");
				EList<?> jurists = jury.getJurist();
				for (Iterator<?> i = jurists.iterator (); i.hasNext ();) {
					JuristType jurist = (JuristType) i.next();
					writer.write("<li>");
					writer.write(jurist.getPerson().getName() + ", " + jurist.getPerson().getFirstname());
					writer.write("</li>");
				}
				writer.write("</ul>");
			}
		} catch (Exception e) {
			
		}
	}
}
