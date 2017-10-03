/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Collection;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.FinalChainType;
import de.gymcalc.contest.FinalClassType;
import de.gymcalc.contest.provider.ContestEditPlugin;

/**
 * @author groegert
 *
 */
public class CreateFinalsChainCommand extends ContestCompoundCommand {

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CreateFinalsCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CreateFinalsCommand_description");


	public static CreateFinalsChainCommand create (EditingDomain domain, Collection<?> collection) {
		CreateFinalsChainCommand retVal = new CreateFinalsChainCommand( domain, collection );
		return retVal;
	}

	/**
	 * @param domain
	 * @param label
	 * @param description
	 */
	public CreateFinalsChainCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, collection, LABEL, DESCRIPTION);
	}

	@Override
	public void execute() {
		for( Object o:collection ) {
			if( o instanceof FinalClassType ) {
				FinalClassType finalsClass = ( FinalClassType ) o;
				String finalsName = finalsClass.getName ();
				FinalChainType finalsChain = createFinalChain( finalsName );
				finalsChain.setFinalClass(finalsClass);
				finalsChain.getStation().add( finalsClass.getOriginatingDiszipline().getStation( ) );
				appendAndExecute(AddCommand.create(getDomain (), getContest( finalsClass ), ContestPackage.Literals.FINAL_CHAIN_TYPE, finalsChain));
			}
		}
	}

	@Override
	public boolean prepare() {
		return true;
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
