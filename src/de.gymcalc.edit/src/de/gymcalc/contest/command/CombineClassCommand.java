/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.WinnerType;

/**
 * @author groegert
 *
 */
public class CombineClassCommand extends CompoundCommand 
	implements CommandActionDelegate {

	
	public static CombineClassCommand create (EditingDomain domain, Collection<?> collection) {
		CombineClassCommand RetVal = null;
		RetVal = new CombineClassCommand (domain, collection);
		return RetVal;
	}

	/**
	 * @param domain
	 */
	public CombineClassCommand(EditingDomain domain, Collection<?> collection) {
		super(LABEL, DESCRIPTION);
		this.editingDomain = domain;
		this.collection = collection; 
	}

	@Override
	public Object getImage() {
		return null;
	}

	@Override
	public String getText() {
		return this.getLabel();
	}

	@Override
	public String getToolTipText() {
		return this.getDescription();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.CompoundCommand#execute()
	 */
	@Override
	public void execute() {
		Iterator<?> i = this.collection.iterator();
		ClassType c = (ClassType) i.next();
		Command cmd = CopyCommand.create( this.editingDomain, c );
		appendAndExecute( cmd );
		Collection<?> o = cmd.getResult();
		if( 1 == o.size() ) {
			ClassType newClass = ( ClassType ) o.iterator().next();
			appendAndExecute( AddCommand.create( this.editingDomain, c.eContainer(), ContestPackage.CONTEST_TYPE__CLASS, newClass ) );
			while( i.hasNext( ) ) {
				ClassType c1 = ( ClassType ) i.next();
				EList<WinnerType> winners = c1.getWinner();
				Command cc = CopyCommand.create( this.editingDomain, winners );
				appendAndExecute( cc );
				Collection<?> res = cc.getResult();
				appendAndExecute( AddCommand.create( this.editingDomain, newClass, ContestPackage.CLASS_TYPE__WINNER, res));
			}
		}
	}

	/**
	 * command is prepared if the selection is at least 2 classtypes.
	 */
	@Override
	protected boolean prepare() {
		boolean retVal = false;
		if( this.collection.size() > 1 ) {
			retVal = true;
			Iterator<?> i = this.collection.iterator();
			while( i.hasNext( ) ) {
				Object o = i.next();
				if( ! ( o instanceof ClassType ) ) {
					retVal  = false;
					break;
				}
			}
		}
		return retVal;
	}

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CombineClassCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CombineClassCommand_description");

	final EditingDomain editingDomain;
	final Collection<?> collection;
}
