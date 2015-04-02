package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.addressbook.AddressBookType;
import de.gymcalc.addressbook.AddressType;
import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.addressbook.PersonType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.WinnerType;

public class CleanupContestCommand extends CompoundCommand implements CommandActionDelegate {

	static public CleanupContestCommand create( EditingDomain domain, Collection< Object > collection ) {
		CleanupContestCommand retVal = null;
		ContestType contest = null;
		if( 1 == collection.size( ) ) {
			Iterator< Object > i = collection.iterator();
			if( i.hasNext() ) {
				Object o = i.next();
				if( o instanceof ContestType ) {
					contest = ( ContestType ) o; 
				}
			}
		}
		retVal = new CleanupContestCommand( domain, contest );	
		return retVal;
	}
	
	/**
	 * @param domain
	 */
	public CleanupContestCommand(EditingDomain domain, ContestType contest) {
		super(0, "CleanupContest", "CleanupContest");
		this.domain = domain;
		this.contest = contest;
	}

	@Override
	public void execute() {
		{
			/* remove winner */
			EList<ClassType> classes = contest.getClass_();
			Iterator<ClassType> j = classes.iterator ();
			while (j.hasNext ()) {
				ClassType c = j.next ();
				EList<WinnerType> winners = c.getWinner();
				if( !winners.isEmpty() ) {
					appendAndExecute( DeleteCommand.create(getDomain (), winners) );
				}
			}
		}
		{
			/* remove jurist */
			EList<JuriType> juries = contest.getJuri();
			Iterator<JuriType> j = juries.iterator ();
			while (j.hasNext ()) {
				JuriType c = j.next ();
				EList<JuristType> jurists = c.getJurist();
				if( !jurists.isEmpty() ) {
					appendAndExecute( DeleteCommand.create(getDomain (), jurists) );
				}
			}
		}
		{
			/* cleanup addressbook */
			AddressBookType addressbook = contest.getAddressbook();
			{
				/* cleanup persons */
				EList<PersonType> persons = addressbook.getPerson();
				if( !persons.isEmpty() ) {
					appendAndExecute( DeleteCommand.create(getDomain (), persons) );
				}
			}
			{
				/* cleanup organizations */
				EList<OrganizationType> organizations = addressbook.getOrganization();
				if( !organizations.isEmpty() ) {
					appendAndExecute( DeleteCommand.create(getDomain (), organizations) );
				}
			}
			{
				/* cleanup addresses */
				EList<AddressType> addresses = addressbook.getAddress();
				if( !addresses.isEmpty() ) {
					appendAndExecute( DeleteCommand.create(getDomain (), addresses) );
				}
			}
		}
	}

	@Override
	public Object getImage() {
		return null;
	}

	@Override
	public String getText() {
		return CleanupContestCommand.LABEL;
	}

	@Override
	public String getToolTipText() {
		return CleanupContestCommand.DESCRIPTION;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.CompoundCommand#prepare()
	 */
	@Override
	protected boolean prepare() {
		return null != this.contest;
	}

	protected EditingDomain getDomain( ) {
		return this.domain;
	}

	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CleanupCommand_label");
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CleanupCommand_description");

	private EditingDomain domain;
	private ContestType contest = null;
	
}
