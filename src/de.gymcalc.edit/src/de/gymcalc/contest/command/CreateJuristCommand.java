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
import de.gymcalc.contest.ContestFactory;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.JuriType;
import de.gymcalc.contest.JuristType;

/**
 * @author groegert
 *
 */
public class CreateJuristCommand extends AbstractOverrideableCommand 
	implements CommandActionDelegate {

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CreateJuristCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CreateJuristCommand_description");

	EObject object = null;
	Object value = null;
	
	public static CreateJuristCommand create (EditingDomain domain, EObject object, Object value) {
		CreateJuristCommand RetVal = null;
		RetVal = new CreateJuristCommand (domain, object, value);
		return RetVal;
	}

	/**
	 * @param domain
	 */
	public CreateJuristCommand(EditingDomain domain, EObject object, Object value) {
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
			jurist = createJurist ((OrganizationType) this.object, null, null);
			jurist.getPerson().setName((String)value);
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

	public JuristType getJurist( ) {
		return this.jurist;
	}
	
	protected JuristType createJurist (OrganizationType organization, PersonType person, JuriType juri) {
		JuristType RetVal = null;
		ContestType contest = (ContestType)organization.eContainer().eContainer();
		if (null == person) {
			person = getorcreatePerson (contest.getAddressbook());
		}
		if (null == juri) {
			juri = getorcreateJuri (contest);
		}
		RetVal = ContestFactory.eINSTANCE.createJuristType();
		RetVal.setPerson(person);
		RetVal.setOrganization(organization);
		Command cmd = AddCommand.create(getDomain (), juri, ContestPackage.Literals.JURIST_TYPE, RetVal);
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
	
	protected JuriType getorcreateJuri (ContestType contest) {
		JuriType RetVal = null;
		EList<?> juries = contest.getJuri();
		Iterator<?> i = juries.iterator();
		while (i.hasNext ()) {
			JuriType juri = (JuriType)i.next();
			EList<?> disziplines = juri.getDiszipline();
			if (disziplines.isEmpty()) {
				RetVal = juri;
				break;
			}
		}
		if (null == RetVal) {
			RetVal = ContestFactory.eINSTANCE.createJuriType();
			Command cmd = AddCommand.create(getDomain (), contest, ContestPackage.Literals.JURI_TYPE, RetVal);
			cmd.execute ();
		}
		return RetVal;		
	}

	JuristType jurist = null;
}
