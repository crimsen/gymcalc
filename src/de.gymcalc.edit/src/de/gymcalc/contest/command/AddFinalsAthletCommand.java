package de.gymcalc.contest.command;

import java.util.Collection;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.command.CommandParameter;
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
					int index = CommandParameter.NO_INDEX;
					FinalChainType finalChain = ( FinalChainType ) o;
					if( null != finalChain.getOrderMap( ) ) {
						Integer jokerIndex = finalChain.getOrderMap( ).getEntries( ).get( new Integer( -1 ) );
						 if( null != jokerIndex ) {
							 index = jokerIndex.intValue();
							 // OrderMap index is 1 based but we do need a 0 based index
							 --index;
						 }
					}
					this.appendAndExecute(AddCommand.create(getDomain(), o, ContestPackage.Literals.CHAIN_TYPE__ATHLET, athlet, index));
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
