/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.addressbook.AddressBookType;
import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.addressbook.PersonType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.TeamType;

/**
 * @author groegert
 *
 */
public class EnterAthletCommand extends ContestCompoundCommand {


	public static EnterAthletCommand create( EditingDomain domain, Collection<?> collection ) {
		EnterAthletCommand retVal = new EnterAthletCommand( domain, collection );
		return retVal;
	}

	/**
	 * @param domain
	 */
	public EnterAthletCommand( EditingDomain domain, Collection<?> collection ) {
		super( domain, collection, LABEL, DESCRIPTION );
	}

	@Override
	public void execute() {
		Object o = null;
		if( 1 <= this.collection.size() ){
			o = this.collection.iterator().next();
		} else if( 0 == this.collection.size( ) ) {
			o = findInstanceInResource( ContestType.class );
		}
		if( null != o ) {
			AddressBookType addressBook = getOrCreateAddressBook( o );
			ContestType contest = getContest( o );
			OrganizationType organization = getOrCreateOrganization( addressBook );
			PersonType person = getOrCreatePerson( addressBook );
			ClassType class_ = getOrCreateClass( contest, param.getClass_() );
			athlet = createAthlet( organization, person, class_ );
			if( ( null != param.getTeam() ) &&
				(! param.getTeam().isEmpty() ) ) {
				TeamType team = getOrCreateTeam( contest );
				appendAndExecute( AddCommand.create(getDomain (), team, ContestPackage.Literals.TEAM_TYPE__ATHLET, athlet) );
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.CompoundCommand#prepare()
	 */
	@Override
	public boolean prepare() {
		boolean retVal = false;
		Iterator<?> i = this.collection.iterator();
		while( i.hasNext() ) {
			Object o = i.next();
			if( o instanceof OrganizationType ) {
				retVal = true;
				break;
			} else if( o instanceof ClassType ) {
				retVal = true;
				break;
			} else if( o instanceof TeamType ) {
				retVal = true;
				break;
			} else if( o instanceof PersonType ) {
				retVal = true;
				break;
			} else if( o instanceof ChainType ) {
				retVal = true;
				break;
			} else if( o instanceof ContestType ) {
				retVal = true;
				break;
			} else if( o instanceof AthletType ) {
				retVal = true;
				break;
			}
		}
		if( false == retVal ) {
			Object c = this.findInstanceInResource( ContestType.class );
			if( null != c ) {
				retVal = true;
			}
		}
		return retVal;
	}

	public Object getImage() {
		return null;
	}

	public String getText() {
		return label;
	}

	public String getToolTipText() {
		return description;
	}

	public AthletType getAthlet( ) {
		return this.athlet;
	}

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_EnterAthletCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_EnterAthletCommand_description");

	AthletType athlet = null;
}
