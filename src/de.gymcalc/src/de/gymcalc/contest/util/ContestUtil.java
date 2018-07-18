package de.gymcalc.contest.util;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.StationType;

public abstract class ContestUtil {

	/** finds the juriresult that an athlet gets at a dedication station
	 * @param athlet
	 * @param station
	 * @return the found juriresult or null
	 */
	public static JuriResultType findResult(AthletType athlet, StationType station) {
		JuriResultType retVal = null;
		for( JuriResultType r:athlet.getResult().getJuriresult()) {
			DisziplineType diszipline = r.getDiszipline();
			if( station == diszipline.getStation() ) {
				retVal = r;
				break;
			}
		}
		return retVal;
	}
}
