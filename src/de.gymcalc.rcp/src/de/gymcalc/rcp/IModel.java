/*
 * adapted from org.gastro.rcp, an example of cdo distribution
 */
package de.gymcalc.rcp;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.notify.AdapterFactory;

import de.gymcalc.contest.ContestType;

/**
 */
public interface IModel {

	public ContestType getContest();

	// cdo connection handling
	public boolean openConnection();
	public boolean closeConnection();
	public boolean isConnected();

	public AdapterFactory getAdapterFactory();
	public <T extends CDOObject> Object modify(T object, ITransactionalOperation<T> operation);
	public interface ITransactionalOperation<T extends CDOObject> {
		public Object execute(T object);
	}
}
