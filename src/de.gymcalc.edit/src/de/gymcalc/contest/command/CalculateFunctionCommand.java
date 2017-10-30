/**
 * 
 */
package de.gymcalc.contest.command;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.AverageFunctionType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.FunctionType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.ResultType;
import de.gymcalc.contest.WinnerType;

/**
 * @author groegert
 *
 */
public class CalculateFunctionCommand extends AbstractOverrideableCommand
{

	protected WinnerType winner = null;
	protected JuriResultType juriResult = null;
	protected Command cmd = null;
	/**
	 * @param domain
	 */
	public CalculateFunctionCommand(EditingDomain domain, WinnerType winner, JuriResultType juriResult) {
		super(domain);
		this.winner = winner;
		this.juriResult = juriResult;
	}

	@Override
	public void doExecute() {
		if( null != juriResult ) {
			FunctionType function = juriResult.getDiszipline().getCalculationFunction( ); 
			if( null != function ) {
				if( function instanceof AverageFunctionType ) {
					double sum = 0.0;
					int count = 0;
					AverageFunctionType averageFunction = ( AverageFunctionType ) function;
					for( DisziplineType diszipline : averageFunction.getDisziplines() ) {
						sum += getPoints( diszipline );
						++count;
					}
					if( 0 < count ) {
						sum = sum / count;
					}
					double round = Math.round(sum * 10000) / 10000.0;
					cmd = SetCommand.create(getDomain(), juriResult, ContestPackage.Literals.JURI_RESULT_TYPE__VALUE, round);
					if( !cmd.canExecute( ) ) {
						cmd = null;
					} else {
						cmd.execute();
					}
				}
			}
		}
	}

	@Override
	public void doRedo() {
	}

	@Override
	public void doUndo() {
		if( null != cmd &&
			cmd.canUndo( ) ) {
			cmd.undo( );
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doCanUndo()
	 */
	@Override
	public boolean doCanUndo() {
		boolean retVal = null != cmd &&	cmd.canUndo( );
		return retVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doCanExecute()
	 */
	@Override
	public boolean doCanExecute() {
		return null != winner && null != juriResult;
	}

	private double getPoints( DisziplineType diszipline )
	{
		double retVal = 0.0;
		JuriResultType result = getJuriResult( diszipline );
		if( null != result ) {
			retVal = result.getValue();
		}
		return retVal;
	}
	private JuriResultType getJuriResult( DisziplineType diszipline )
	{
		JuriResultType retVal = null;
		ResultType result = winner.getResult();
		for( JuriResultType juriResult: result.getJuriresult( ) ) {
			if( diszipline == juriResult.getDiszipline( ) ) {
				retVal = juriResult;
				break;
			}
		}
		return retVal;
	}
}
