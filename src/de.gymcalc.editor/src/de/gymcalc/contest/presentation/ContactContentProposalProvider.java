package de.gymcalc.contest.presentation;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.swt.widgets.Text;

import de.spremberg.turnen.contact.ContactType;
import de.spremberg.turnen.contact.DatabaseType;

public class ContactContentProposalProvider implements
		IContentProposalProvider {

	public enum TYPE {
		name,
		firstname,
		dateOfBirth
	};
	
	public ContactContentProposalProvider( DatabaseType database, int maxsize, TYPE type, Text organization )
	{
		this.database = database;
		this.maxsize = maxsize;
		this.type = type;
		// TODO: should be IDialogSettings
		this.organization = organization;
	}
	
	public IContentProposal[] getProposals(String contents, int position) {
		IContentProposal [] retVal = null;
		if( TYPE.name == this.type ) {
			this.contactName = contents;
		} else if( TYPE.firstname == this.type ) {
			this.contactFirstname = contents;
		} else if( TYPE.dateOfBirth == this.type ) {
			this.dateOfBirth = contents;
		}
		String organizationName = organization.getText();
		EList<ContactType> proposals = 
			database.queryContactsOfOrganization( organizationName,
				this.contactName,
				this.contactFirstname,
				this.dateOfBirth,
				this.maxsize);
		ArrayList<ContactProposal> list = new ArrayList<ContactProposal>();
		Iterator<ContactType> i = proposals.iterator();
		while( i.hasNext() ) {
			ContactType o = i.next();
			list.add(new ContactProposal(o, this.type));
		}
		retVal = (IContentProposal[]) list.toArray(new IContentProposal[list
				.size()]);
		return retVal;
	}
	
	public TYPE getType( )
	{
		return this.type;
	}
	
	private DatabaseType database = null;
	private Text organization = null;
	private String contactName = null;
	private String contactFirstname = null;
	private String dateOfBirth = null;
	private TYPE type = TYPE.name;
	private int maxsize = 10;
}
