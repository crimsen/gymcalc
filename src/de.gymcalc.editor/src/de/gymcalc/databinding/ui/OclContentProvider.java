package de.gymcalc.databinding.ui;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectSource;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class OclContentProvider implements IStructuredContentProvider {

	public OclContentProvider( EObjectCondition condition, EObject empty ) {
		this.condition = condition;
		this.empty = empty;
	}
	public OclContentProvider( EObjectCondition condition ) {
		this.condition = condition;
	}
	@Override
	public void dispose() {
	}
	@Override
	public void inputChanged(Viewer viewer, Object oldInput,
			Object newInput) {
	}
	@Override
	public Object[] getElements(Object inputElement) {
		Object[] retVal = null;

		if( inputElement instanceof EObject ) {
			SELECT statement = new SELECT(SELECT.UNBOUNDED, false,
					new FROM( new EObjectSource( (EObject) inputElement ) ), new WHERE( condition ),
					new NullProgressMonitor());
			IQueryResult results = statement.execute();
			if( null != empty ) {
				results.add( empty );
			}
			retVal = results.toArray();
		}
		return retVal;
	}
	private EObjectCondition condition;
	private EObject empty = null;
}
