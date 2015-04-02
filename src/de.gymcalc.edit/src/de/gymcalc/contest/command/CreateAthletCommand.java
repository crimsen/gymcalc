/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
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

/**
 * @author groegert
 *
 */
public class CreateAthletCommand extends AbstractOverrideableCommand 
	implements CommandActionDelegate {

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CreateAthletCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CreateAthletCommand_description");

	EObject object = null;
	Object value = null;
	
	public static CreateAthletCommand create (EditingDomain domain, EObject object, Object value) {
		CreateAthletCommand RetVal = null;
		RetVal = new CreateAthletCommand (domain, object, value);
		return RetVal;
	}

	/**
	 * @param domain
	 */
	public CreateAthletCommand(EditingDomain domain, EObject object, Object value) {
		super(domain, LABEL, DESCRIPTION);
		this.object = object;
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doExecute()
	 */
	@Override
	public void doExecute() {
		if (this.object instanceof OrganizationType) {
			athlet = createAthlet ((OrganizationType) this.object, null, null);
			athlet.setName((String)value);
			athlet.getPerson().setName((String)value);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doRedo()
	 */
	@Override
	public void doRedo() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doUndo()
	 */
	@Override
	public void doUndo() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doCanUndo()
	 */
	@Override
	public boolean doCanUndo() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doCanExecute()
	 */
	@Override
	public boolean doCanExecute() {
		boolean RetVal = false;
		if (this.object instanceof OrganizationType) {
			RetVal = true;
		}
		return RetVal;
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
	
	protected AthletType createAthlet (OrganizationType organization, PersonType person, ClassType class_) {
		AthletType RetVal = null;
		ContestType contest = (ContestType)organization.eContainer().eContainer();
		if (null == person) {
			person = getorcreatePerson (contest.getAddressbook());
		}
		if (null == class_) {
			class_ = getorcreateClass (contest);
		}
		RetVal = ContestFactory.eINSTANCE.createAthletType();
		RetVal.setPerson(person);
		RetVal.setOrganization(organization);
		Command cmd = AddCommand.create(getDomain (), class_, ContestPackage.Literals.ATHLET_TYPE, RetVal);
		cmd.execute ();
		return RetVal;
	}

	protected PersonType getorcreatePerson (AddressBookType addressbook) {
		PersonType RetVal = null;
		EList<?> list = addressbook.getPerson();
		Iterator<?> i = list.iterator();
		while (i.hasNext ()) {
			PersonType person = (PersonType)i.next();
			if (null == person.getName () || 0 == person.getName ().length()) {
				RetVal = person;
				break;
			}
		}
		if (null == RetVal) {
			RetVal = AddressBookFactory.eINSTANCE.createPersonType();
			/* TODO: date */
			//RetVal.setDateofbirth("0001-01-01");
			Command cmd = AddCommand.create(getDomain (), addressbook, AddressBookPackage.Literals.PERSON_TYPE, RetVal);
			cmd.execute ();
		}
		return RetVal;		
	}
	
	protected ClassType getorcreateClass (ContestType contest) {
		ClassType RetVal = null;
		EList<?> classes = contest.getClass_();
		Iterator<?> i = classes.iterator();
		while (i.hasNext ()) {
			ClassType class_ = (ClassType)i.next();
			if (null == class_.getName() || 0 == class_.getName ().length()) {
				RetVal = class_;
				break;
			}
		}
		if (null == RetVal) {
			RetVal = ContestFactory.eINSTANCE.createClassType();
			Command cmd = AddCommand.create(getDomain (), contest, ContestPackage.Literals.CLASS_TYPE, RetVal);
			cmd.execute ();
		}
		return RetVal;		
	}

	AthletType athlet = null;
}
