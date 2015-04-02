package de.gymcalc.print;

import java.io.Writer;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;

public class CreateRegistrationTableHtml {

	AdapterFactory factory;
	
	public CreateRegistrationTableHtml (AdapterFactory factory) {
		this.factory = factory;
	}
	
	void createReport (Object object, Writer writer) {
		try {
			if (object instanceof ContestType) {
				writer.write("Vorname\tName\tGeburtstag\tKlasse\tVerein\n");
				ContestType contest = (ContestType) object;
				EList< ClassType > classes = contest.getClass_();
				for (Iterator<ClassType> c = classes.iterator (); c.hasNext ();) {
					ClassType class_ = (ClassType) c.next ();
					EList< WinnerType > winners = class_.getWinner ();
					for (Iterator< WinnerType > w = winners.iterator (); w.hasNext ();){
						WinnerType winner = w.next( );
						if( winner instanceof AthletType ) {
							AthletType athlet = (AthletType) winner;
							writer.write(athlet.getPerson().getFirstname());
							writer.write("\t");
							writer.write(athlet.getPerson().getName());
							writer.write("\t");
							writer.write(athlet.getPerson ().getDateofbirth ().toString());
							writer.write("\t");
							writer.write(class_.getName ());
							if( null != athlet.getOrganization() ) {
								writer.write("\t");
								writer.write(athlet.getOrganization().getName ());
							}
							writer.write("\n");
						}
					}
				}
				for (Iterator< ClassType > c = classes.iterator( ); c.hasNext ();) {
					boolean classHeadline = false;
					ClassType class_ = c.next ();
					EList< WinnerType > winners = class_.getWinner ();
					for (Iterator< WinnerType > w = winners.iterator (); w.hasNext ();){
						WinnerType winner = w.next( );
						if( winner instanceof TeamType ) {
							if( !classHeadline ) {
								writer.write( class_.getName( ) );
								writer.write( "\n" );
								classHeadline = true;
							}
							TeamType team = ( TeamType )winner;
							writer.write( "Mannschaft " );
							writer.write( team.getName( ) );
							writer.write( "\n" );
							EList< AthletType > athlets = team.getAthlet( );
							for( Iterator< AthletType > a = athlets.iterator( ); a.hasNext( ); ) {
								AthletType athlet = a.next( );
								writer.write( "  " );
								writer.write(athlet.getPerson().getFirstname());
								writer.write(" ");
								writer.write(athlet.getPerson().getName());
								writer.write( "\n" );
							}
						}
					}
				}
			}
		} catch (Exception e) {
			
		}
	}
}
