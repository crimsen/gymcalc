package de.gymcalc.contest.util;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.StationType;

public abstract class ContestUtil {

	/** finds the juriresult that an athlet gets at a dedication station
	 * when there are serveral results, then it returns the result, that depends on other results
	 * @param athlet
	 * @param station
	 * @return the found juriresult or null
	 */
	public static JuriResultType findRootResult(AthletType athlet, StationType station) {
		JuriResultType retVal = null;
		if( null != athlet.getResult()) {
			for( JuriResultType r:athlet.getResult().getJuriresult()) {
				DisziplineType diszipline = r.getDiszipline();
				if( station == diszipline.getStation() ) {
					retVal = r;
					if( null != diszipline.getCalculationFunction() ) {
						break;
					}
				}
			}
		}
		return retVal;
	}

	public static JuriResultType findJuriResult(AthletType athlet, DisziplineType diszipline) {
		JuriResultType retVal = null;
		for( JuriResultType r:athlet.getResult().getJuriresult()) {
			if( diszipline == r.getDiszipline() ) {
				retVal = r;
				break;
			}
		}
		return retVal;
	}
}
