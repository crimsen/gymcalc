package de.gymcalc.contest.presentation;

import org.eclipse.emf.common.command.BasicCommandStack;

public class SharedCommandStack extends BasicCommandStack {


	  public void saveIsDone()
	  {
		  super.saveIsDone();
		  notifyListeners();
	  }

}
