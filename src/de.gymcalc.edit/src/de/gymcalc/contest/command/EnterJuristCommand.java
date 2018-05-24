/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.edit.command.SetCommand;
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
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.TeamType;

/**
 * @author groegert
 *
 */
public class EnterJuristCommand extends ContestCompoundCommand {

	public static EnterJuristCommand create( EditingDomain domain, Collection<?> collection ) {
		EnterJuristCommand retVal = new EnterJuristCommand( domain, collection );
		return retVal;
	}

	/**
	 * @param domain
	 */
	public EnterJuristCommand( EditingDomain domain, Collection<?> collection ) {
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
			JuriType juri = getOrCreateJuri( contest, param.getJuri() );
			jurist = createJurist( organization, person, juri );
			if( param instanceof EnterJuristCommandParam ) {
				EnterJuristCommandParam eParam = ( EnterJuristCommandParam ) param;
				if( eParam.getLicense( ) != null ) {
					this.appendAndExecute( new SetCommand(getDomain(), jurist, ContestPackage.Literals.JURIST_TYPE__LICENSE, eParam.getLicense()));
				}
				if( eParam.getWishApparatus( ) != null ) {
					this.appendAndExecute( new SetCommand(getDomain(), jurist, ContestPackage.Literals.JURIST_TYPE__WISH_APPARATUS, eParam.getWishApparatus()));
				}
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
			} else if( o instanceof JuristType ) {
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

	public JuristType getJurist( ) {
		return this.jurist;
	}

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_EnterJuristCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_EnterJuristCommand_description");

	JuristType jurist = null;
}
