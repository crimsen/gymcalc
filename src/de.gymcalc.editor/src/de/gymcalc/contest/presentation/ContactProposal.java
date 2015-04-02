/**
 * 
 */
package de.gymcalc.contest.presentation;

import org.eclipse.jface.fieldassist.IContentProposal;

import de.gymcalc.contest.presentation.ContactContentProposalProvider.TYPE;
import de.spremberg.turnen.contact.ContactType;

public class ContactProposal implements IContentProposal {

	public ContactProposal( ContactType contact, ContactContentProposalProvider.TYPE type )
	{
		this.contact = contact;
		this.type = type;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.jface.fieldassist.IContentProposal#getContent()
	 */
	public String getContent() {
		String retVal = "";
		// TODO use adapterfactory, or labelprovider
		if( this.type == ContactContentProposalProvider.TYPE.name ) {
			retVal = this.contact.getName();
		} else if( this.type == ContactContentProposalProvider.TYPE.firstname ) {
			retVal = this.contact.getFirstname();
		} else if( this.type == ContactContentProposalProvider.TYPE.dateOfBirth ) {
			retVal = this.contact.getDate_of_birth().toString();
		}
		return retVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.fieldassist.IContentProposal#getCursorPosition()
	 */
	public int getCursorPosition() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.fieldassist.IContentProposal#getLabel()
	 */
	public String getLabel() {
		String retVal = safeString( this.contact.getName() ) + ", "+
			safeString( this.contact.getFirstname() );
		if( null != this.contact.getDate_of_birth() ) {
			retVal += ": " + this.contact.getDate_of_birth().toString();
		}
		return retVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.fieldassist.IContentProposal#getDescription()
	 */
	public String getDescription() {
		return null;
	}

	public ContactType getContact() {
		return this.contact;
	}

	private String safeString( String s ) {
		String retVal = "";
		if( null != s ) {
			retVal = s;
		}
		return retVal;
	}
	
	private ContactType contact;
	private TYPE type;
}
