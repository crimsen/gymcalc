/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.contest.ClassType;

/**
 * @author thomas
 *
 */
public class ShuffleClassCommand extends ClassCommand {

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_ShuffleClassCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_ShuffleClassCommand_description");

	/**
	 * This creates a command to add a particular value to the specified feature of the owner.
	 * The feature will often be null because the domain will deduce it.
	 */
	public static Command create(EditingDomain domain, Collection<?> collection)
	{
		return new ShuffleClassCommand(domain, collection);
	}

	/**
	 * @param domain
	 */
	public ShuffleClassCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, LABEL, DESCRIPTION, collection );
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doExecute()
	 */
	@Override
	public void doExecute() {
		Iterator<?> i = collection.iterator ();
		while (i.hasNext ()) {
			Object owner = i.next ();
			if (owner instanceof ClassType) {
				ClassType c = (ClassType) owner;
				EList<?> e = c.getWinner ();
				int s = e.size();
				for( int k = 10 * s; k >= 0; --k ) {
					int from = ( int ) ( Math.random() * s );
					int to = ( int ) ( Math.random() * s );
					if( from != to ) {
						e.move( to, from );
					}
				}
			}
		}
	}

}
