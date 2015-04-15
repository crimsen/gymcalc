package de.gymcalc.printdatamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.StationType;

public class ChainModel {
	public static String modelName = "http://www.gymcalc.de/ChainModel";

	public ChainModel( DialogSettings options ) {
		this.options = options;
	}
	public Object getSelectedModel( Object src, IStructuredSelection selection,
			AdapterFactory adapter ) {
		Object retVal = null;
		setSelection( selection );
		retVal = getModel(src, adapter);
		return retVal;
	}
	public void setSelection( IStructuredSelection selection ) {
		this.selected = new ArrayList<Object>();
		/* TODO: selection currently not supported, look at protocolmodel to do so */
	}

	Object getModel( Object src, AdapterFactory factory ) {
		/*
		 * contest
		 * +-chain
		 *   +-name
		 *   +-station
		 *   | +-name
		 *   +-winner
		 *     +-name
		 *     +-disable
		 *     +-class
		 *     +-organization
		 *     +-team
		 */
		Map<String, Object> retVal = null;
		if (src instanceof ContestType) {
			ContestType contestSrc = (ContestType) src;
			retVal = new HashMap<String, Object>();
			Map<String, Object> contest = new HashMap<String, Object>();
			retVal.put("contest", contest);
			contest.put("name", contestSrc.getName());
			List<Object> chains = new ArrayList<Object>();
			contest.put("chain", chains);
			EList<ChainType> chainsSrc = contestSrc.getChain();
			for (Iterator<ChainType> iChain = chainsSrc.iterator( ); iChain.hasNext ();) {
				ChainType chainSrc = iChain.next ();
				Map<String, Object> chain = new HashMap<String, Object>();
				chains.add( chain );
				chain.put( "name", chainSrc.getName ());
				EList<StationType> stationsSrc = chainSrc.getStation ();
				List<Object> stations = new ArrayList<Object>();
				chain.put( "station", stations );
				for (Iterator<StationType> iStation = stationsSrc.iterator (); iStation.hasNext ();) {
					StationType stationSrc = iStation.next ();
					Map<String, Object> station = new HashMap<String, Object>();
					stations.add(station);
					station.put( "name", stationSrc.getName () );
				}
				EList<AthletType> winnersSrc = chainSrc.getAthlet ();
				List<Object> winners = new ArrayList<Object>();
				chain.put( "winner", winners );
				for( Iterator<AthletType> iWinner = winnersSrc.iterator (); iWinner.hasNext (); ){
					AthletType winnerSrc = iWinner.next ();
					Map<String, Object> winner = new HashMap<String, Object>();
					winners.add( winner );
					String disable = winnerSrc.getDisable ();
					if (null == disable) {
						disable = "";
					}
					winner.put( "disable", disable );
					String className = "";
					if (winnerSrc.eContainer() instanceof ClassType) {
						className = ((ClassType)winnerSrc.eContainer()).getName();
					}
					winner.put( "class", className );
					winner.put( "name", winnerSrc.getName () );
					String organizationName = "";
					if (null != winnerSrc.getOrganization()) {
						organizationName = winnerSrc.getOrganization().getName ();
					}
					winner.put( "organization", organizationName );
					String teamName = "";
					if (null != winnerSrc.getTeam()) {
						teamName = winnerSrc.getTeam().getName ();
					}
					winner.put( "team", teamName );
				}
			}
		}
		return retVal;
	}
	@SuppressWarnings("unused")
	private Collection<Object> selected;
	@SuppressWarnings("unused")
	private DialogSettings options;
}
