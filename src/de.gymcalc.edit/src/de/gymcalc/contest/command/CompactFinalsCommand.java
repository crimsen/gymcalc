/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.FinalClassType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.ResultType;
import de.gymcalc.contest.WinnerType;
import de.gymcalc.contest.provider.ContestEditPlugin;

/**
 * @author groegert
 *
 */
public class CompactFinalsCommand extends ContestCompoundCommand 
	implements CommandActionDelegate {

	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CompactFinalsCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CompactFinalsCommand_description");
	
	public static CompactFinalsCommand create (EditingDomain domain, Collection<?> collection) {
		CompactFinalsCommand RetVal = null;
		RetVal = new CompactFinalsCommand (domain, collection);
		return RetVal;
	}

	/**
	 * @param domain
	 */
	public CompactFinalsCommand(EditingDomain domain, Collection<?> collection) {
		super(domain, collection, LABEL, DESCRIPTION);
		this.resultIndex = LAST_COMMAND_ALL;
	}

	@Override
	public void execute() {
		for( Object o:this.collection) {
			if( o instanceof FinalClassType) {
				FinalClassType finalClass = ( FinalClassType ) o;
				compactClass( finalClass );
				compactDisziplines( finalClass );
				compactWinner( finalClass );
			}
		}
	}

	@Override
	public boolean prepare() {
		boolean retVal = false;
		for( Object o:this.collection) {
			if( o instanceof FinalClassType) {
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

	private void compactClass( FinalClassType finalClass ) {
		ArrayList<WinnerType> removableAthlets = new ArrayList<WinnerType>();
		for( WinnerType w : finalClass.getWinner( ) ) {
			if( null != w.getDisable() && !w.getDisable().isEmpty() ) {
				removableAthlets.add( w );
			}
		}
		Command cmd = RemoveCommand.create(getDomain(), finalClass, ContestPackage.Literals.CLASS_TYPE__WINNER, removableAthlets);
		this.appendAndExecute(cmd);
	}

	private void compactDisziplines( FinalClassType finalClass ) {
		ArrayList< DisziplineType > removableDisziplines = new ArrayList<DisziplineType>();
		for( DisziplineType d : finalClass.getDiszipline( ) ) {
			if( isIntermediate( d ) ) {
				removableDisziplines.add( d );
			}
		}
		Command cmd = RemoveCommand.create(getDomain(), finalClass, ContestPackage.Literals.CLASS_TYPE__DISZIPLINE, removableDisziplines );
		this.appendAndExecute( cmd );
	}
	private void compactWinner( FinalClassType finalClass ) {
		for( WinnerType w : finalClass.getWinner( ) ) {
			ResultType r = w.getResult();
			if( null != r ) {
				compactResult( r );
			}
		}
	}
	private void compactResult( ResultType result ) {
		ArrayList< JuriResultType > removableJuriResults = new ArrayList<JuriResultType>();
		for( JuriResultType j : result.getJuriresult( ) ) {
			DisziplineType d = j.getDiszipline();
			if( null == d || isIntermediate( d ) ) {
				removableJuriResults.add( j );
			}
		}
		Command cmd = RemoveCommand.create(getDomain(), result, ContestPackage.Literals.RESULT_TYPE__JURIRESULT, removableJuriResults );
		this.appendAndExecute( cmd );
	}
}
