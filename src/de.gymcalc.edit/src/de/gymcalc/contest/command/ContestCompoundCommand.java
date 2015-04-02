package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.addressbook.AddressBookFactory;
import de.gymcalc.addressbook.AddressBookPackage;
import de.gymcalc.addressbook.AddressBookType;
import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.addressbook.PersonType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestFactory;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;

public class ContestCompoundCommand extends DomainCompoundCommand {

	public ContestCompoundCommand(EditingDomain domain, Collection<?> collection,
			String label,
			String description) {
		super(domain, label, description);
		this.collection = collection;
	}
	public void setParam( ContestCommandParam param ) {
		this.param = param;
	}
	protected JuristType createJurist (OrganizationType organization, PersonType person, JuriType juri) {
		JuristType retVal = null;
		ContestType contest = (ContestType)organization.eContainer().eContainer();
		if (null == person) {
			person = getOrCreatePerson (contest.getAddressbook());
		}
		if (null == juri) {
			juri = getOrCreateJuri( contest, param.getJuri() );
		}
		retVal = ContestFactory.eINSTANCE.createJuristType();
		retVal.setPerson(person);
		retVal.setOrganization(organization);
		appendAndExecute( AddCommand.create(getDomain (), juri, ContestPackage.Literals.JURIST_TYPE, retVal) );
		return retVal;
	}

	protected AthletType createAthlet (OrganizationType organization, PersonType person, ClassType class_) {
		AthletType retVal = null;
		ContestType contest = (ContestType)organization.eContainer().eContainer();
		if (null == person) {
			person = getOrCreatePerson (contest.getAddressbook());
		}
		if (null == class_) {
			class_ = getOrCreateClass( contest, param.getClass_() );
		}
		retVal = ContestFactory.eINSTANCE.createAthletType();
		retVal.setPerson(person);
		retVal.setOrganization(organization);
		String name = person.getName() + ", " + person.getFirstname();
		retVal.setName( name );
		String id = "athlet-" + person.getName() + "-" + person.getFirstname();
		id = id.replaceAll("[ \\.]", "-");
		retVal.setId( id );
		appendAndExecute( AddCommand.create(getDomain (), class_, ContestPackage.Literals.ATHLET_TYPE, retVal) );
		return retVal;
	}

	protected AddressBookType createAddressBook( ContestType contest ) {
		AddressBookType retVal = null;
		retVal = AddressBookFactory.eINSTANCE.createAddressBookType();
		appendAndExecute( AddCommand.create( getDomain( ),  contest, AddressBookPackage.Literals.ADDRESS_BOOK_TYPE, retVal));
		return retVal;
	}
	protected PersonType getOrCreatePerson (AddressBookType addressbook) {
		PersonType retVal = null;
		EList< PersonType > list = addressbook.getPerson();
		Iterator< PersonType > i = list.iterator();
		while (i.hasNext ()) {
			PersonType person = i.next();
			if( null != person.getName( ) && 
				null != person.getFirstname( ) && 
				null != person.getDateofbirth() ) {
				if( ( 0 == person.getName( ).compareTo( param.getName() ) ) &&
					( 0 == person.getFirstname( ).compareTo( param.getFirstname() ) ) &&
					( null == param.getDateOfBirth() ||
						( 0 == person.getDateofbirth().toString().compareTo( param.getDateOfBirth().toString() ) ) ) ) {
					retVal = person;
					break;
				}
			}
			if (null == person.getName () || 0 == person.getName ().length()) {
				retVal = person;
				break;
			}
		}
		if (null == retVal) {
			retVal = AddressBookFactory.eINSTANCE.createPersonType();
			retVal.setName( param.getName() );
			retVal.setFirstname( param.getFirstname( ) );
			/* TODO: date */
/*
 * 			String d = "0001-01-01";
 			if( null != param.getDateOfBirth() ) {
				SimpleDateFormat df = new SimpleDateFormat( "yyyy-MM-dd" );
				d = df.format( param.getDateOfBirth() );
			}
*/			retVal.setDateofbirth( (Date) param.getDateOfBirth() );
			String name = "person-" + param.getName( ) + "-" +param.getFirstname();
			name = name.replace(" ", "-");
			retVal.setId(name);
			appendAndExecute( AddCommand.create(getDomain (), addressbook, AddressBookPackage.Literals.PERSON_TYPE, retVal) );
		}
		return retVal;		
	}
	
	protected JuriType getOrCreateJuri( ContestType contest, String juriName ) {
		JuriType retVal = null;
		EList< JuriType > juries = contest.getJuri();
		Iterator< JuriType > i = juries.iterator();
		while (i.hasNext ()) {
			JuriType juri = i.next();
			if( null != juri.getName( ) ) {
				if( 0 == juri.getName().compareTo( juriName ) ) {
					retVal = juri;
					break;
				}
			}
			if (null == juri.getName() || 0 == juri.getName ().length()) {
				retVal = juri;
				break;
			}
		}
		if (null == retVal) {
			retVal = ContestFactory.eINSTANCE.createJuriType();
			retVal.setName( juriName );
			appendAndExecute( AddCommand.create(getDomain (), contest, ContestPackage.Literals.JURI_TYPE, retVal) );
		}
		return retVal;
	}
	
	protected ClassType getOrCreateClass( ContestType contest, String className ) {
		ClassType retVal = null;
		EList< ClassType > classes = contest.getClass_();
		Iterator< ClassType > i = classes.iterator();
		while (i.hasNext ()) {
			ClassType class_ = i.next();
			if( null != class_.getName( ) ) {
				if( 0 == class_.getName().compareTo( className ) ) {
					retVal = class_;
					break;
				}
			}
			if (null == class_.getName() || 0 == class_.getName ().length()) {
				retVal = class_;
				break;
			}
		}
		if (null == retVal) {
			retVal = ContestFactory.eINSTANCE.createClassType();
			retVal.setName( className );
			appendAndExecute( AddCommand.create(getDomain (), contest, ContestPackage.Literals.CLASS_TYPE, retVal) );
		}
		return retVal;
	}
	
	protected TeamType getOrCreateTeam( ContestType contest ) {
		TeamType retVal = null;
		EList< ClassType > classes = contest.getClass_();
		Iterator< ClassType > i = classes.iterator();
		while (i.hasNext () && ( retVal == null ) ) {
			ClassType class_ = i.next();
			EList< WinnerType > winners = class_.getWinner( );
			Iterator< WinnerType > iWinner = winners.iterator();
			while( iWinner.hasNext() ) {
				WinnerType w = iWinner.next( );
				if( ( w instanceof TeamType ) &&
					( null != w.getName() ) &&
					( 0 == w.getName( ).compareTo( param.getTeam() ) ) ) {
					retVal = ( TeamType ) w;
					break;
				}
			}
		}
		if (null == retVal) {
			ClassType class_ = getOrCreateClass( contest, "" );
			OrganizationType organization = getOrCreateOrganization( contest.getAddressbook() );
			retVal = ContestFactory.eINSTANCE.createTeamType();
			retVal.setName( param.getTeam( ) );
			retVal.setOrganization( organization );
			String id = "team-" + param.getTeam();
			id = id.replaceAll("[ \\.]", "-");
			retVal.setId(id);
			appendAndExecute( AddCommand.create(getDomain (), class_, ContestPackage.Literals.TEAM_TYPE, retVal) );
		}
		return retVal;		
	}

	protected OrganizationType getOrCreateOrganization (AddressBookType addressbook) {
		OrganizationType retVal = null;
		EList< OrganizationType > list = addressbook.getOrganization();
		Iterator< OrganizationType > i = list.iterator();
		while (i.hasNext ()) {
			OrganizationType organization = i.next();
			if( null != organization.getName( ) ) {
				if( 0 == organization.getName( ).compareTo( param.getOrganization() ) ) {
					retVal = organization;
					break;
				}
			}
			if (null == organization.getName () || 0 == organization.getName ().length()) {
				retVal = organization;
				break;
			}
		}
		if (null == retVal) {
			retVal = AddressBookFactory.eINSTANCE.createOrganizationType();
			retVal.setName( param.getOrganization() );
			String id = "org-" + param.getOrganization();
			id = id.replaceAll("[ \\.]", "-");
			retVal.setId( id );
			appendAndExecute( AddCommand.create(getDomain (), addressbook, AddressBookPackage.Literals.ORGANIZATION_TYPE, retVal) );
		}
		return retVal;		
	}

	/*
	 * search the parent path of o for getting contest 
	 */
	protected ContestType getContest( Object o ) {
		ContestType retVal = null;
		if( o instanceof EObject ) {
			EObject e = ( EObject )o;
			while( null != e ) {
				if( e instanceof ContestType ) {
					retVal = ( ( ContestType )e );
					break;
				}
				e = e.eContainer( );
			}
		}
		return retVal;
	}
/*
	 * search the parent path of o for getting contest->addressbook 
	 */
	protected AddressBookType getOrCreateAddressBook( Object o ) {
		AddressBookType retVal = null;
		ContestType contest = getContest( o );
		if( null != contest ) {
			retVal = contest.getAddressbook( );
			if( null == retVal ) {
				retVal = createAddressBook( contest );
			}
		}
		return retVal;
	}

	protected ContestCommandParam param;
	protected Collection<?> collection = null;
}
