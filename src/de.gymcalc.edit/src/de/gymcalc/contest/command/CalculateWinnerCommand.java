/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestFactory;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.LookupTableType;
import de.gymcalc.contest.ResultType;
import de.gymcalc.contest.WinnerType;

/**
 * @author groegert
 *
 */
public class CalculateWinnerCommand extends AbstractOverrideableCommand
{

	protected WinnerType winner = null;
	/**
	 * @param domain
	 */
	public CalculateWinnerCommand(EditingDomain domain, WinnerType winner) {
		super(domain);
		this.winner = winner;
	}

	@Override
	public void doExecute() {
		ResultType result = (ResultType) (winner).getResult();
		if (null != result) {
			String calculationKey =((ClassType) winner.eContainer ()).getCalculationkey (); 
			double sum = 0.0;
			ArrayList<Double> pointitems = new ArrayList<Double>();
			ArrayList< Double > forcepointitems = new ArrayList< Double >( );
			HashSet< DisziplineType > calculatedDisziplines = new HashSet< DisziplineType >( );
			{
				// first pass, legacy: iterate thru results
				/* in finals the allaround does not count */
				boolean finals = false;
				if (null != calculationKey && (0 == calculationKey.compareTo("finals"))) {
					finals = true;
				}
				Iterator<?> i = result.getJuriresult().iterator();
				while (i.hasNext()) {
					JuriResultType juriresult = (JuriResultType)i.next();
					DisziplineType diszipline = juriresult.getDiszipline( );
					calculatedDisziplines.add(diszipline);
					String disziplineCalculationKey = getDisziplineCalculationKey( diszipline );
					double points = juriresult.getValue();
					points = calculatePoints( diszipline, disziplineCalculationKey, juriresult );
					if( disziplineCalculationKey.contains( "force" ) ) {
						forcepointitems.add( new Double( points ) );
					} else if ( (!finals || disziplineCalculationKey.contains ("finals") ) &&
							!disziplineCalculationKey.contains ("skip") ) {
						pointitems.add(new Double(points));
					}
				}
			}
			{
				// second pass: iterate thru disziplines
				for( DisziplineType diszipline : ((ClassType) winner.eContainer ()).getDiszipline()) {
					if( !calculatedDisziplines.contains( diszipline ) ) {
						JuriResultType juriResult = null;
						if( null != diszipline.getCalculationFunction() ) {
							// do only create a juriresult if the juriresult is calculated
							juriResult = getOrCreateJuriResult( winner.getResult(), diszipline );
						} else {
							juriResult = getJuriResult(winner.getResult(), diszipline );
						}
						if( null != juriResult ) {
							String disziplineCalculationKey = getDisziplineCalculationKey( diszipline );
							double points = juriResult.getValue();
							points = calculatePoints( diszipline, disziplineCalculationKey, juriResult );
							if( disziplineCalculationKey.contains( "force" ) ) {
								forcepointitems.add( new Double( points ) );
							} else if ( !disziplineCalculationKey.contains ("skip") ) {
								pointitems.add(new Double(points));
							}
						}
					}
				}
			}
			int count = -1;
			if (null != calculationKey) {
				Collections.sort(pointitems, Collections.reverseOrder());
				java.util.regex.Pattern p = java.util.regex.Pattern.compile("best\\(([0-9]+)\\)");
				java.util.regex.Matcher m = p.matcher(calculationKey);
				if(m.matches()){
					String s = m.group(1);
					count = Integer.parseInt(s);
				}
			}
			Iterator< Double > j = pointitems.iterator();
			int k = 0;
			while(j.hasNext() && k != count) {
				sum += j.next( ).doubleValue();
				k += 1;
			}
			j = forcepointitems.iterator( );
			while( j.hasNext( ) ) {
				sum += j.next( ).doubleValue( );
			}
			double round = Math.round(sum * 10000);
			result.setPoints(round / 10000);
		}
	}

	@Override
	public void doRedo() {
	}

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
		return winner != null;
	}

	private String getDisziplineCalculationKey( DisziplineType diszipline )
	{
		String retVal = diszipline.getCalculationkey( );
		if( null == retVal ) {
			retVal = new String( );
			// try to evalute from legacy calculation keys
			String id = diszipline.getId ();
			if( id.contains( "force" ) ) {
				retVal += "force;";
			} else if ( id.contains ("finals") ) {
				retVal += "finals;";
			}
			LookupTableType table = diszipline.getLookuptable();
			if( null != table ) {
				retVal += "lookuptable;";
			}
		}
		return retVal;
	}
	
	private JuriResultType getOrCreateJuriResult( ResultType result, DisziplineType diszipline )
	{
		JuriResultType retVal = getJuriResult( result, diszipline );
		if( null == retVal ) {
			retVal = ContestFactory.eINSTANCE.createJuriResultType();
			retVal.setDiszipline(diszipline);
			Command cmd = AddCommand.create(getDomain(), result, ContestPackage.Literals.RESULT_TYPE__JURIRESULT, retVal);
			cmd.execute();
		}
		return retVal;
	}

	private static JuriResultType getJuriResult( ResultType result, DisziplineType diszipline )
	{
		JuriResultType retVal = null;
		for( JuriResultType juriResult: result.getJuriresult()) {
			if( diszipline.equals(juriResult.getDiszipline() ) ) {
				retVal = juriResult;
				break;
			}
		}
		return retVal;
	}
	
	private double calculatePoints( DisziplineType diszipline,
			String calculationKey, JuriResultType juriResult )
	{
		double retVal = 0.0;
		if( null != juriResult )
			retVal = juriResult.getValue();
		if( null != diszipline.getCalculationFunction( ) ) {
			CalculateFunctionCommand cmd = new CalculateFunctionCommand(getDomain(), winner, juriResult );
			cmd.doExecute();
			retVal = juriResult.getValue();
		} else if( calculationKey.contains( "lookuptable" ) ) {
			LookupTableType table = diszipline.getLookuptable();
			if (null != table) {
				retVal = table.getValue (retVal);
				double round = Math.round( retVal * 10 );
				retVal = round / 10;
			}
		} else if( calculationKey.contains( "bjs(" ) ) {
			// formeln gemaess bundesjugendspiele 2013
			//http://www.bundesjugendspiele.de/wai1/showcontent.asp?ThemaID=4521
			// daten habe folgendermassen eingegeben zu werden: bjs({lauf,sprung,stoss,wurf},a,c,D,Z)
			java.util.regex.Pattern p = java.util.regex.Pattern.compile("bjs\\(([a-z]+),([0-9\\.]+),([0-9\\.]+),([0-9\\.]+),([0-9\\.]+)\\)");
			java.util.regex.Matcher m = p.matcher(calculationKey);
			if(m.matches()){
				String vals = m.group( 1 );
				String valas = m.group( 2 );
				String valcs = m.group( 3 );
				String valds = m.group( 4 );
				String valzs = m.group( 5 );
				double valA = Double.parseDouble( valas ); 
				double valC = Double.parseDouble( valcs ); 
				double valD = Double.parseDouble( valds ); 
				double valZ = Double.parseDouble( valzs ); 
				if( 0 == vals.compareTo( "lauf") ) {
					// lauf
					retVal = ( int ) ( ( valD / ( retVal + valZ ) - valA ) / valC );
				} else {
					// sprung / stoss / wurf
					retVal = ( int ) ( ( Math.sqrt( retVal ) - valA ) / valC );
				}
			}
		}
		return retVal;
	}
}
