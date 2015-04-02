/*
 * Created on 03.12.2006
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package de.gymcalc.contest.command;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.TeamJuriResultType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;

/**
 * @author thomas
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class CalculateCommand extends AbstractOverrideableCommand implements CommandActionDelegate {

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CalculateCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CalculateCommand_description");

	/**
	 * This is the owner object upon which the command will act.
	 * It could be null in the case that we are dealing with an {@link org.eclipse.emf.common.util.EList}.
	 */
	protected Collection<?> collection;

	/**
	 * This creates a command to add a particular value to the specified feature of the owner.
	 * The feature will often be null because the domain will deduce it.
	 */
	public static Command create(EditingDomain domain, Collection<?> collection)
	{
		return new CalculateCommand(domain, collection);
	}

	  /**
	 * @param domain
	 * @param label
	 * @param description
	 */
	public CalculateCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, LABEL, DESCRIPTION);
		this.collection = collection; 
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doExecute()
	 */
	@Override
	public void doExecute() {
		Iterator<?> i = collection.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof ClassType) {
				// TODO:
//				Command cmd = new CalculateClassCommand (domain, (ClassType) o);
//				cmd.execute ();
			} else if (o instanceof AthletType) {
				Command cmd = new CalculateWinnerCommand (domain, (AthletType) o);
				cmd.execute ();
			} else if (o instanceof TeamType) {
				Command cmd = new CalculateTeamCommand (domain, (TeamType) o);
				cmd.execute ();
			} else if (o instanceof TeamJuriResultType) {
				Command cmd = new CalculateTeamJuriResultCommand (domain, (TeamJuriResultType) o);
				cmd.execute ();
			}
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
		Iterator<?> i = collection.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			if (o instanceof ClassType ||
				o instanceof WinnerType ||
				o instanceof TeamJuriResultType) {
				RetVal = true;
				break;
			}
		}
		return RetVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.CommandActionDelegate#getImage()
	 */
	public Object getImage() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.CommandActionDelegate#getText()
	 */
	public String getText() {
		return LABEL;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.CommandActionDelegate#getToolTipText()
	 */
	public String getToolTipText() {
		return DESCRIPTION;
	}
}
