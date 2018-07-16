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
	public static final IModel INSTANCE = de.gymcalc.internal.rcp.Model.INSTANCE;

	public AdapterFactory getAdapterFactory();

	public ContestType getContest();

	public <T extends CDOObject> Object modify(T object, ITransactionalOperation<T> operation);

	/**
	 */
	public interface ITransactionalOperation<T extends CDOObject> {
		public Object execute(T object);
	}
}
