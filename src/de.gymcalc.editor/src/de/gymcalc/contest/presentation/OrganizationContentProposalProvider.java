package de.gymcalc.contest.presentation;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.fieldassist.ContentProposal;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.IContentProposalProvider;

import de.spremberg.turnen.contact.DatabaseType;
import de.spremberg.turnen.contact.OrganizationType;

public class OrganizationContentProposalProvider implements
		IContentProposalProvider {

	public OrganizationContentProposalProvider( DatabaseType database, int maxsize )
	{
		this.database = database;
		this.maxsize = maxsize;
	}
	
	public IContentProposal[] getProposals(String contents, int position) {
		IContentProposal [] retVal = null;
		EList<OrganizationType> proposals = database.queryOrganizations(contents, this.maxsize);
		ArrayList<ContentProposal> list = new ArrayList<ContentProposal>();
		Iterator<OrganizationType> i = proposals.iterator();
		while( i.hasNext() ) {
			OrganizationType o = i.next();
			list.add(new ContentProposal(o.getName()));
		}
		retVal = (IContentProposal[]) list.toArray(new IContentProposal[list
				.size()]);
		return retVal;
	}
	
	private DatabaseType database = null;
	private int maxsize = 10;
}
