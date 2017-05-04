/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.TeamJuriResultType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.provider.ContestEditPlugin;

/**
 * @author groegert
 *
 */
public class CalculateSelectionCommand extends ContestCompoundCommand {


	public static CalculateSelectionCommand create (EditingDomain domain, Collection<?> collection) {
		CalculateSelectionCommand retVal = null;
		retVal = new CalculateSelectionCommand (domain, collection);
		return retVal;
	}

	/**
	 * @param domain
	 */
	public CalculateSelectionCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, collection, LABEL, DESCRIPTION);
		this.collection = collection; 
	}

	@Override
	public void execute() {
		Object o = null;
		Iterator<?> i = null;
		if( 1 <= this.collection.size() ){
			i = this.collection.iterator();
			o = i.next();
		} else if( 0 == this.collection.size( ) ) {
			o = findInstanceInResource( ContestType.class );
		}
		while( null != o ) {
			if( o instanceof ContestType ) {
				calculateContest( ( ContestType ) o );
			} else if( o instanceof ClassType ) {
				calculateClass( ( ClassType ) o );				
			} else if( o instanceof TeamType ) {
				calculateTeam( ( TeamType ) o );				
			} else if( o instanceof AthletType ) {
				calculateAthlet( ( AthletType ) o );				
			} else if( o instanceof TeamJuriResultType ) {
				caclulateTeamJuriResult( ( TeamJuriResultType ) o );				
			}
			if( null != i && i.hasNext() ) {
				o = i.next();
			} else {
				o = null;
			}
		}
	}


	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.CompoundCommand#prepare()
	 */
	@Override
	public boolean prepare() {
		boolean retVal = false;
		Iterator<?> i = this.collection.iterator();
		while( i.hasNext() ) {
			Object o = i.next();
			if( o instanceof ClassType ) {
				retVal = true;
				break;
			} else if( o instanceof TeamType ) {
				retVal = true;
				break;
			} else if( o instanceof TeamJuriResultType ) {
				retVal = true;
				break;
			} else if( o instanceof ContestType ) {
				retVal = true;
				break;
			} else if( o instanceof AthletType ) {
				retVal = true;
				break;
			}
		}
		if( false == retVal ) {
			Object c = this.findInstanceInResource( ContestType.class );
			if( null != c ) {
				retVal = true;
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

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CalculateSelectionCommand_label");
	
	/**
	 * This caches the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CalculateSelectionCommand_description");

	private void calculateContest( ContestType o )
	{
		appendAndExecute( new CalculateClassCommand( getDomain( ), o.getClass_() ) );			
	}
	private void calculateClass( ClassType o )
	{
		ArrayList<ClassType> collection = new ArrayList<ClassType>();
		collection.add( o );
		appendAndExecute( new CalculateClassCommand( getDomain( ), collection ) );		
	}
	private void calculateTeam( TeamType o )
	{
		appendAndExecute( new CalculateTeamCommand( getDomain( ), o ) );		
	}
	private void calculateAthlet( AthletType o )
	{
		appendAndExecute( new CalculateWinnerCommand( getDomain( ), o ) );
	}
	private void caclulateTeamJuriResult( TeamJuriResultType o )
	{
		appendAndExecute( new CalculateTeamJuriResultCommand( getDomain( ), o ) );				
	}
}
