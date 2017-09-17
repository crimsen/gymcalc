/**
 * 
 */
package de.gymcalc.contest.command;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.gymcalc.contest.provider.ContestEditPlugin;
import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.contest.AthletResultType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestFactory;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.ContestType;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.ResultType;
import de.gymcalc.contest.WinnerType;

/**
 * @author groegert
 *
 */
public class CreateDisziplineFinalsCommand extends AbstractOverrideableCommand
		implements CommandActionDelegate {

	protected class CompareWinner implements Comparator<WinnerType> {
		private String disziplineId;
		CompareWinner (String disziplineId) {
			this.disziplineId = disziplineId; 
		}
		public int compare (WinnerType w1, WinnerType w2) {
			int RetVal = Double.compare (getJuriResult (w2, this.disziplineId), 
				getJuriResult (w1, this.disziplineId));
			if (0 == RetVal) {
				/* 
				 * if juriresult is equal then the all-around result applies.
				 */ 
				RetVal = Double.compare(w2.getResult ().getPoints (), w1.getResult ().getPoints ());
			}
			return RetVal;
		}
	}
	/**
	 * This caches the label.
	 */
	protected static final String LABEL = ContestEditPlugin.INSTANCE.getString("_UI_CreateFinalsCommand_label");
	
	/**
	 * This cachaes the description.
	 */
	protected static final String DESCRIPTION = ContestEditPlugin.INSTANCE.getString("_UI_CreateFinalsCommand_description");


	DisziplineType diszipline;
	int nWinners = 6;
	int nReserve = 2;
	int winnerPerOrganization = 2;
	
	public static CreateDisziplineFinalsCommand create (EditingDomain domain, Collection<?> collection) {
		CreateDisziplineFinalsCommand RetVal = null;
		Iterator<?> i = collection.iterator ();
		while (i.hasNext ()) {
			Object o = i.next ();
			if (o instanceof DisziplineType) {
				RetVal = CreateDisziplineFinalsCommand.create (domain, (DisziplineType) o);
				break;
			}
		}
		if (null == RetVal) {
			RetVal = new CreateDisziplineFinalsCommand (domain, null);
		}
		return RetVal;
	}

	public static CreateDisziplineFinalsCommand create (EditingDomain domain, DisziplineType diszipline) {
		CreateDisziplineFinalsCommand RetVal = null;
		RetVal = new CreateDisziplineFinalsCommand (domain, diszipline);
		return RetVal;
	}
	/**
	 * @param domain
	 * @param label
	 * @param description
	 */
	public CreateDisziplineFinalsCommand(EditingDomain domain, DisziplineType diszipline) {
		super(domain, LABEL, DESCRIPTION);
		this.diszipline = diszipline;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doExecute()
	 */
	@Override
	public void doExecute() {
		ClassType originClass = (ClassType)diszipline.eContainer (); 
		String finalsName = ContestEditPlugin.INSTANCE.getString("_UI_Finals");
		finalsName += " " + originClass.getName () + " " + diszipline.getName ();
		ContestType contest = (ContestType)diszipline.eContainer ().eContainer ();
		ClassType finalsClass = getFinalsClass (contest, finalsName);
		if (null == finalsClass) {
			finalsClass = createFinalsClass (contest, finalsName);
			finalsClass.setCalculationkey ("finals");
		}
		String disziplineId = "allaround-" + diszipline.getId ();
		DisziplineType finalsDiszipline = getFinalsDiszipline (finalsClass, disziplineId);
		if (null == finalsDiszipline) {
			finalsDiszipline = createFinalsDiszipline (finalsClass, disziplineId);
			finalsDiszipline.setName (ContestEditPlugin.INSTANCE.getString("_UI_AllAround"));
		}
		String tdisziplineId = "finals-" + diszipline.getId ();
		DisziplineType tfinalsDiszipline = getFinalsDiszipline (finalsClass, tdisziplineId);
		if (null == tfinalsDiszipline) {
			tfinalsDiszipline = createFinalsDiszipline (finalsClass, tdisziplineId);
			tfinalsDiszipline.setName (ContestEditPlugin.INSTANCE.getString("_UI_Finals"));
			tfinalsDiszipline.setStation(diszipline.getStation ());
		}
		ChainType finalsChain = getFinalsChain (contest, finalsName);
		if (null == finalsChain) {
			finalsChain = createFinalsChain (contest, finalsName);
			finalsChain.getStation().add(tfinalsDiszipline.getStation());
		}
		WinnerType winners[] = (WinnerType[]) originClass.getWinner ().toArray ();
		Arrays.sort(winners, new CompareWinner (diszipline.getId ()));
		int start = 0;
		int count = nWinners;
		double lastPoints = 0.0; // the points that was added latest
		double lastSum = 0.0; // the all-around points that was added latest
		HashMap<OrganizationType,Integer> organizationMapCount = new HashMap<OrganizationType,Integer>();
		for (int j = 0; j < 2; ++j) {
			int i = start;
			int end = count;
			int countOfAthlets = 0;
			for (; i < winners.length; ++i) {
				if (winners[i] instanceof AthletType) {
					AthletType originAthlet = (AthletType) winners[i];
					double points = getJuriResult (originAthlet, diszipline.getId ());
					// TODO: what happens to the organizationchek
					// when multiple athlets of the same organization do have same points and same sum? 
					{
						/* apply the rule what happens if maximum number of athlets are in
						 * the finals and athlets do have the same value.
						 */
						double sum = originAthlet.getResult ().getPoints ();
						if (countOfAthlets >= end) {
							if (points < lastPoints) {
								break;
							}
							/*
							 * if the value is equal then the better result in all-arround is applyed
							 */
							if (sum < lastSum) {
								break;
							}
						}
						lastPoints = points;
						lastSum = sum;
					}
					boolean skipAthlet = false;
					{
						// apply the rule that only a restricted number of winners per organization
						// are allowed
						OrganizationType originOrganization = originAthlet.getOrganization();
						Integer organizationCount = organizationMapCount.get(originOrganization);
						if (null == organizationCount) {
							organizationCount = 0;
						}
						if (organizationCount >= winnerPerOrganization) {
							// if there are already maximum winners per organization in the final
							// then break the addition
							skipAthlet = true;
						} else {
							organizationCount++;
						}
						organizationMapCount.put(originOrganization, organizationCount);
					}
					if(!skipAthlet) {
						String athletId = winners[i].getId() + "-" + diszipline.getId ();
						AthletType finalsAthlet = getFinalsAthlet (finalsClass, athletId);
						if (null == finalsAthlet) {
							finalsAthlet = createFinalsAthlet (finalsClass, athletId);
							finalsAthlet.setPerson (originAthlet.getPerson ());
							finalsAthlet.setName(originAthlet.getName());
							finalsAthlet.setOrganization(originAthlet.getOrganization ());
						}
						if (1 == j) {
							// second pass is for reserve
							finalsAthlet.setDisable(ContestEditPlugin.INSTANCE.getString("_UI_Reserve"));
						}
						finalsChain.getAthlet ().add (finalsAthlet);
						countOfAthlets++;
						ResultType result = finalsAthlet.getResult ();
						if (null == result) {
							result = createFinalsResult (finalsAthlet);
						}
						JuriResultType juriResult = getFinalsJuriResult (result, disziplineId);
						if (null == juriResult) {
							juriResult = createFinalsJuriResult (result);
							juriResult.setDiszipline(finalsDiszipline);
						}
						juriResult.setValue(points);
					}
				}
			}
			// second pass is reserves
			start = i;
			count = nReserve;
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
		return diszipline != null;
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

	protected int calculateCountOfFinalsAthlet (WinnerType winners[], int start, int count) {
		int RetVal = 0;
		int i = start;
		int end = start + count;
		double lastPoints = 0.0;
		double lastSum = 0.0;
		while (i < winners.length) {
			if (winners[i] instanceof AthletType) {
				AthletType originAthlet = (AthletType) winners[i];
				/* apply the rule what happens if maximum number of athlets are in
				 * the finals and athlets do have the same value.
				 */
				double points = getJuriResult (originAthlet, diszipline.getId ());
				double sum = originAthlet.getResult ().getPoints ();
				if (i >= end) {
					if (points < lastPoints) {
						break;
					}
					/*
					 * if the value is equal then the better result in all-arround is applyed
					 */
					if (sum < lastSum) {
						break;
					}
				}
				lastPoints = points;
				lastSum = sum;
			}
			++i;
		}
		RetVal = i;
		return RetVal;
	}
	
	protected ClassType getFinalsClass (ContestType contest, String name) {
		ClassType RetVal = null;
		EList<?> classes = contest.getClass_();
		Iterator<?> iClass = classes.iterator ();
		while (iClass.hasNext ()) {
			ClassType class_ = (ClassType) iClass.next ();
			if (0 == class_.getName ().compareToIgnoreCase (name)) {
				RetVal = class_;
				break;
			}
		}
		return RetVal;
	}
	
	protected ClassType createFinalsClass (ContestType contest, String name) {
		ClassType RetVal = null;
		RetVal = ContestFactory.eINSTANCE.createClassType();
		RetVal.setName(name);
		Command cmd = AddCommand.create(getDomain (), contest, ContestPackage.Literals.CLASS_TYPE, RetVal);
		cmd.execute ();
		return RetVal;
	}

	protected ChainType getFinalsChain (ContestType contest, String name) {
		ChainType RetVal = null;
		EList<?> chaines = contest.getChain();
		Iterator<?> iChain = chaines.iterator ();
		while (iChain.hasNext ()) {
			ChainType chain = (ChainType) iChain.next ();
			if (0 == chain.getName ().compareToIgnoreCase (name)) {
				RetVal = chain;
				break;
			}
		}
		return RetVal;
	}
	
	protected ChainType createFinalsChain (ContestType contest, String name) {
		ChainType RetVal = null;
		RetVal = ContestFactory.eINSTANCE.createChainType();
		RetVal.setName(name);
		Command cmd = AddCommand.create(getDomain (), contest, ContestPackage.Literals.CHAIN_TYPE, RetVal);
		cmd.execute ();
		return RetVal;
	}

	protected DisziplineType getFinalsDiszipline (ClassType class_, String Id) {
		DisziplineType RetVal = null;
		EList<?> disziplines = class_.getDiszipline ();
		Iterator<?> iDiszipline = disziplines.iterator ();
		while (iDiszipline.hasNext ()) {
			DisziplineType diszipline = (DisziplineType)iDiszipline.next ();
			if (0 == diszipline.getId ().compareTo (Id)) {
				RetVal = diszipline;
				break;
			}
		}
		return RetVal;
	}
	
	protected DisziplineType createFinalsDiszipline (ClassType class_, String Id) {
		DisziplineType RetVal = null;
		RetVal = ContestFactory.eINSTANCE.createDisziplineType ();
		RetVal.setId(Id);
		Command cmd = AddCommand.create(getDomain (), class_, ContestPackage.Literals.DISZIPLINE_TYPE, RetVal);
		cmd.execute ();
		return RetVal;
	}
	
	protected AthletType getFinalsAthlet (ClassType class_, String Id) {
		AthletType RetVal = null;
		EList<?> winners = class_.getWinner ();
		Iterator<?> iWinner = winners.iterator ();
		while (iWinner.hasNext ()) {
			WinnerType winner = (WinnerType) iWinner.next ();
			if (0 == winner.getId ().compareTo (Id) &&
				winner instanceof AthletType) {
				RetVal = (AthletType) winner;
				break;
			}
		}
		return RetVal;
	}
	
	protected AthletType createFinalsAthlet (ClassType class_, String Id) {
		AthletType RetVal = null;
		RetVal = ContestFactory.eINSTANCE.createAthletType ();
		RetVal.setId(Id);
		Command cmd = AddCommand.create(getDomain (), class_, ContestPackage.Literals.ATHLET_TYPE, RetVal);
		cmd.execute ();
		return RetVal;
	}

	protected AthletResultType createFinalsResult (AthletType athlet) {
		AthletResultType RetVal = null;
		RetVal = ContestFactory.eINSTANCE.createAthletResultType ();
		Command cmd = AddCommand.create(getDomain (), athlet, ContestPackage.Literals.ATHLET_RESULT_TYPE, RetVal);
		cmd.execute ();
		return RetVal;
	}

	protected JuriResultType getFinalsJuriResult (ResultType result, String disziplineId) {
		JuriResultType RetVal = null;
		EList<?> juriResults = result.getJuriresult ();
		Iterator<?> iResult = juriResults.iterator ();
		while (iResult.hasNext ()) {
			JuriResultType juriResult = (JuriResultType) iResult.next ();
			DisziplineType diszipline = juriResult.getDiszipline ();
			if (null != diszipline && 
				0 == diszipline.getId ().compareTo(disziplineId)) {
				RetVal = juriResult;
				break;
			}
		}
		return RetVal;
	}

	protected JuriResultType createFinalsJuriResult (ResultType result) {
		JuriResultType RetVal = null;
		RetVal = ContestFactory.eINSTANCE.createJuriResultType ();
		Command cmd = AddCommand.create(getDomain (), result, ContestPackage.Literals.JURI_RESULT_TYPE, RetVal);
		cmd.execute ();
		return RetVal;
	}

	private double getJuriResult (WinnerType w, String disziplineId) {
		double RetVal = 0.0;
		ResultType result = w.getResult ();
		if (null != result) {
			EList<?> juriResults = result.getJuriresult ();
			Iterator<?> iJuriResult = juriResults.iterator ();
			while (iJuriResult.hasNext ()) {
				JuriResultType juriResult = (JuriResultType) iJuriResult.next ();
				DisziplineType diszipline = juriResult.getDiszipline (); 
				if (0 == diszipline.getId ().compareTo(disziplineId)) {
					RetVal = juriResult.getValue ();
					break;
				}
			}
		}
		return RetVal;
	}
}
