/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.contest.DisziplineType;

/**
 * @author groegert
 *
 */
public class CreateFinalsCommand extends ContestCompoundCommand 
	implements CommandActionDelegate {

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CreateFinalsCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CreateFinalsCommand_description");
	
	public static CreateFinalsCommand create (EditingDomain domain, Collection<?> collection) {
		CreateFinalsCommand RetVal = null;
		RetVal = new CreateFinalsCommand (domain, collection);
		return RetVal;
	}

	/**
	 * @param domain
	 */
	public CreateFinalsCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, collection, LABEL, DESCRIPTION);
		this.resultIndex = LAST_COMMAND_ALL;
	}

	@Override
	public void execute() {
		Command cmd = CreateDisziplineFinalsCommand.create (getDomain(), collection);
		this.appendAndExecute( cmd );
		Collection<?> collection = cmd.getResult();
		cmd = CreateFinalsChainCommand.create( getDomain(), collection );
		this.appendAndExecute( cmd );
	}

	@Override
	public boolean prepare() {
		boolean retVal = false;
		for( Object o:this.collection) {
			if( o instanceof DisziplineType) {
				retVal = true;
				break;
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

}
