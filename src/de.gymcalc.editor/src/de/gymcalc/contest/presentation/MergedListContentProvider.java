package de.gymcalc.contest.presentation;

import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.set.WritableSet;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ContestPackage;

@SuppressWarnings("rawtypes")
public class MergedListContentProvider implements IStructuredContentProvider {

	public MergedListContentProvider( ListBuilder listBuilder ) {
		this.listBuilder = listBuilder;
		this.knownElements = new WritableSet();
		this.collection = new MergedEList<AthletType>( AthletType.class, ContestPackage.CLASS_TYPE__WINNER );
	}
	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer arg0, Object arg1, Object arg2) {
		if( !( arg1 instanceof EObject ) ) {
			arg1 = null;
		}
		listBuilder.updateList( collection, ( EObject ) arg2 );
		knownElements.clear();
		knownElements.addAll( collection );
	}

	@Override
	public Object[] getElements(Object arg0) {
		return collection.toArray();
	}

	public IObservableSet getKnownElements( ) {
		return knownElements;
	}
	private WritableSet knownElements;
	private MergedEList collection;
	final ListBuilder listBuilder;
}
