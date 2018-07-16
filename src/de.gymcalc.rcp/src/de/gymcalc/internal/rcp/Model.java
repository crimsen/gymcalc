/*
 * adapted from org.gastro.rcp, an example of cdo distribution
 */
package de.gymcalc.internal.rcp;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.WrappedException;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.lifecycle.Lifecycle;

import de.gymcalc.contest.ContestFactory;
import de.gymcalc.contest.ContestType;
import de.gymcalc.rcp.IConfiguration;
import de.gymcalc.rcp.IModel;

/**
 */
public class Model extends Lifecycle implements IModel {

	private final ComposedAdapterFactory adapterFactory;

	private CDONet4jSession session;

	private CDOView view;

	private ContestType contest;

	public Model() {
		adapterFactory = new ComposedAdapterFactory(EMFEditPlugin.getComposedAdapterFactoryDescriptorRegistry());
	}

	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	public synchronized ContestType getContest() {
		if (contest == null) {
			String name = IConfiguration.INSTANCE.getContest();
			String path = name;
			if (!view.hasResource(path)) {
				CDOTransaction transaction = session.openTransaction();
				ContestType contest = ContestFactory.eINSTANCE.createContestType();
				contest.setName(name);

				try {
					CDOResource resource = transaction.createResource(path);
					resource.getContents().add(contest);
					transaction.commit();
				} catch (CommitException ex) {
					throw WrappedException.wrap(ex);
				} finally {
					transaction.close();
				}
			}

			CDOResource resource = view.getResource(path);
			contest = (ContestType) resource.getContents().get(0);
		}

		return contest;
	}

	@Override
	public boolean openConnection() {
		boolean retVal = isActive();
		if (!retVal) {
			try {
				activate();
			} catch( Exception e ) {
				
			}
			retVal = isActive();
		}
		return retVal;
	}

	@Override
	public boolean closeConnection() {
		boolean retVal = isActive();
		if (retVal) {
			try {
				deactivate();
			} catch( Exception e ) {
				
			}
			retVal = isActive();
		}
		return retVal;
	}

	@Override
	public boolean isConnected() {
		return isActive();
	}

	public <T extends CDOObject> Object modify(T object, ITransactionalOperation<T> operation) {
		CDOTransaction transaction = session.openTransaction();

		try {
			T transactionalObject = transaction.getObject(object);
			Object result = operation.execute(transactionalObject);
			transaction.commit();

			if (result instanceof CDOObject) {
				return view.getObject((CDOObject) result);
			}

			return result;
		} catch (CommitException ex) {
			throw WrappedException.wrap(ex);
		} finally {
			transaction.close();
		}
	}

	@Override
	protected void doActivate() throws Exception {
		super.doActivate();
		String server = IConfiguration.INSTANCE.getServer();
		String repository = IConfiguration.INSTANCE.getRepository();

		IConnector connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, "tcp", server);

		CDONet4jSessionConfiguration config = CDONet4jUtil.createNet4jSessionConfiguration();
		config.setConnector(connector);
		config.setRepositoryName(repository);

		session = config.openNet4jSession();
		view = session.openView();
		view.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
	}

	@Override
	protected void doDeactivate() throws Exception {
		session.close();
		session = null;
		view = null;
		contest = null;
		adapterFactory.dispose();
		super.doDeactivate();
	}
}
