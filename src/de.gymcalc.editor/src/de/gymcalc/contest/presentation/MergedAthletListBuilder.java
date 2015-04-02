package de.gymcalc.contest.presentation;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import de.gymcalc.contest.AthletType;

public class MergedAthletListBuilder extends ListBuilder {

	static public MergedEList create( ) {
		MergedEList<AthletType> retVal = new MergedEList<AthletType>( AthletType.class, 0 );
		return retVal;
	}
	@Override
	public void updateList( MergedEList collection, EObject root ) {
		if( null != root ) {
			TreeIterator<EObject> i = root.eAllContents();
			while( i.hasNext() ) {
				EObject o = i.next();
				if( o instanceof AthletType ) {
					collection.addUnique( ( AthletType ) o );
				}
			}
		}
	}
}
