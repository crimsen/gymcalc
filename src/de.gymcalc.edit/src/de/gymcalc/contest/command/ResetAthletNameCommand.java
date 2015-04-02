/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.addressbook.PersonType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;

/**
 * @author groegert
 *
 */
public class ResetAthletNameCommand extends ContestCompoundCommand {


	public static ResetAthletNameCommand create (EditingDomain domain, Collection<?> collection) {
		ResetAthletNameCommand RetVal = null;
		RetVal = new ResetAthletNameCommand (domain, collection);
		return RetVal;
	}

	/**
	 * @param domain
	 */
	public ResetAthletNameCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, collection, LABEL, DESCRIPTION);
		this.collection = collection; 
	}

	@Override
	public void execute() {
		Object o = null;
		Iterator<?> i = null;
		if( 1 <= this.collection.size() ){
			i = this.collection.iterator();
			o = i.next();
		} else if( 0 == this.collection.size( ) ) {
			o = findInstanceInResource( ContestType.class );
		}
		while( null != o ) {
			if( o instanceof ContestType ) {
				resetAthletName( ( ContestType ) o );
			} else if( o instanceof ClassType ) {
				resetAthletName( ( ClassType ) o );				
			} else if( o instanceof TeamType ) {
				resetAthletName( ( TeamType ) o );				
			} else if( o instanceof ChainType ) {
				resetAthletName( ( ChainType ) o );				
			} else if( o instanceof AthletType ) {
				resetAthletName( ( AthletType ) o );				
			}
			if( null != i && i.hasNext() ) {
				o = i.next();
			} else {
				o = null;
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

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_SetTeamNameFromAthletCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_SetTeamNameFromAthletCommand_description");

	private void resetAthletName( ContestType contest ) {
		EList< ClassType > classes = contest.getClass_();
		Iterator< ClassType > iClass = classes.iterator();
		while( iClass.hasNext() ) {
			resetAthletName( iClass.next() );
		}
	}
	private void resetAthletName( ClassType class_ ) {
		EList< WinnerType > winners = class_.getWinner();
		Iterator< WinnerType > iWinner = winners.iterator();
		while( iWinner.hasNext() ) {
			WinnerType winner = iWinner.next();
			if( winner instanceof AthletType ) {
				resetAthletName( ( AthletType ) winner );
			}
		}
	}
	private void resetAthletName( TeamType team ) {
		EList< AthletType > athlets = team.getAthlet();
		Iterator< AthletType > iAthlet = athlets.iterator();
		while( iAthlet.hasNext() ) {
			resetAthletName( iAthlet.next() );
		}
	}
	private void resetAthletName( ChainType chain ) {
		EList< AthletType > athlets = chain.getAthlet();
		Iterator< AthletType > iAthlet = athlets.iterator();
		while( iAthlet.hasNext() ) {
			resetAthletName( iAthlet.next() );
		}
	}
	private void resetAthletName( AthletType athlet ) {
		PersonType person = athlet.getPerson ();
		String name = "";
		if (null != person.getName()) {
			name += person.getName();
		}
		if (null != person.getFirstname ()) {
			if (0 != name.length ()) {
				name += ", ";
			}
			name += person.getFirstname ();
		}
		appendAndExecute( SetCommand.create( getDomain( ), athlet, ContestPackage.Literals.WINNER_TYPE__NAME, name) );		
	}
}
