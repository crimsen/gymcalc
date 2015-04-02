/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package de.gymcalc.editor.importWizards;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.eclipse.datatools.sqltools.core.DatabaseIdentifier;
import org.eclipse.datatools.sqltools.core.profile.NoSuchProfileException;
import org.eclipse.datatools.sqltools.core.profile.ProfileUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;

public class SqlImportWizardPage extends WizardPage {
	
	public SqlImportWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		this.selection = selection;
		setTitle(pageName); //NON-NLS-1
		setDescription("Import SGE chaines"); //NON-NLS-1
	}

	public void createControl(Composite parent) {
		
	}
	
	public boolean performFinish() {
		boolean retVal = false;
/*
 * 		Iterator i = selection.iterator();
 		while( i.hasNext( ) ) {
			Object o = i.next( );
			if( o instanceof ChainType ) {
				ChainType chain = ( ChainType ) o;
				String chainName = chain.getName( );
				ResultSet res = querySgeChain( chainName );
				AddressBookType addressbook = ((ContestType) chain.eContainer( )).getAddressbook();
				EList<PersonType> persons = addressbook.getPerson();
				EList<ClassType> classes = ((ContestType) chain.eContainer( )).getClass_();
				ClassType class_ = classes.get(classes.size() - 1);
				try {
					while( res.next( )) {
						String dateOfBirth;
						try {
							dateOfBirth = res.getString(5);
						} catch (SQLException e) {
							dateOfBirth = "0001-01-01";
						}
						Contact c = new Contact (res.getLong (1), res.getString (2), res.getString (3), res.getString (4), dateOfBirth, "");
						PersonType person = AddressBookFactory.eINSTANCE.createPersonType();
						person.setName( c.getName());
						person.setFirstname(c.getFirstname());
						person.setDateofbirth(c.getDateOfBirth());
						String id = c.getName() + "-" + c.getFirstname();
						id = id.replace(' ', '-');
						person.setId(id);
						persons.add( person );
						AthletType athlet = ContestFactory.eINSTANCE.createAthletType();
						athlet.setName( c.getName() + ", " + c.getFirstname());
						athlet.setId("athlet-" + id);
						athlet.setPerson(person);
						EList<WinnerType> winners = class_.getWinner();
						winners.add(athlet);
						EList<AthletType> athlets = chain.getAthlet();
						athlets.add(athlet);
					}
				} catch (SQLException e) {
					System.err.print(e.getMessage());
				}
//				CreateAthletCommand cmd = CreateAthletCommand.create(chain., organization, name);
				
			}
			retVal = true;
		}
*/
		return retVal;
	}
	
	private ResultSet querySgeChain( String name ) {
		ResultSet retVal = null;
		String query = "select contact.id_contact, contact.name, contact.firstname, contact.sex, contact.date_of_birth from contact inner join contact_organization using(id_contact) inner join organization using(id_organization) where organization.name=\"" + 
			name + "\";";
		try {
			Connection connection = ProfileUtil.getOrCreateReusableConnection(new DatabaseIdentifier ("sge"));
			PreparedStatement statement = connection.prepareStatement( query );
			retVal = statement.executeQuery();
		} catch (SQLException e) {
		} catch (NoSuchProfileException e) {
		}
		return retVal;
	}
	private IStructuredSelection selection;
}
