package de.gymcalc.contest.command;

import java.util.Collection;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.FinalChainType;
import de.gymcalc.contest.provider.ContestEditPlugin;

public class AddFinalsAthletCommand extends ContestCompoundCommand 
implements CommandActionDelegate {
	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_AddFinalsAthletCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_AddFinalsAthletCommand_description");
	
	public static AddFinalsAthletCommand create (EditingDomain domain, Collection<?> collection) {
		AddFinalsAthletCommand retVal = null;
		retVal = new AddFinalsAthletCommand (domain, collection);
		return retVal;
	}

	/**
	 * @param domain
	 */
	public AddFinalsAthletCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, collection, LABEL, DESCRIPTION);
		this.resultIndex = LAST_COMMAND_ALL;
	}

	@Override
	public void execute() {
		Object athlet = param.get("athlet");
		if( athlet instanceof AthletType ) {
			for( Object o:this.collection) {
				if( o instanceof FinalChainType) {
					this.appendAndExecute(AddCommand.create(getDomain(), o, ContestPackage.Literals.CHAIN_TYPE__ATHLET, athlet));
					this.appendAndExecute(SetCommand.create(getDomain(), athlet, ContestPackage.Literals.WINNER_TYPE__DISABLE, ""));
				}
			}
		}
	}

	@Override
	public boolean prepare() {
		boolean retVal = false;
		for( Object o:this.collection) {
			if( o instanceof FinalChainType) {
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
