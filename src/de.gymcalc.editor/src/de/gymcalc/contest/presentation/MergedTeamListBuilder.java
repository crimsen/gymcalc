package de.gymcalc.contest.presentation;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import de.gymcalc.contest.TeamType;

public class MergedTeamListBuilder extends ListBuilder {

	static public MergedEList create( TeamType emptyTeam ) {
		MergedEList<TeamType> retVal = new MergedEList<TeamType>( TeamType.class, 0 );
		return retVal;
	}
	public MergedTeamListBuilder( TeamType emptyTeam )
	{
		m_emptyTeam = emptyTeam;
	}
	@Override
	public void updateList( MergedEList collection, EObject root ) {
		if( null != root ) {
			if( null != m_emptyTeam ) {
				collection.add( m_emptyTeam );
			}
			TreeIterator<EObject> i = root.eAllContents();
			while( i.hasNext() ) {
				EObject o = i.next();
				if( o instanceof TeamType ) {
					collection.addUnique( ( TeamType ) o );
				}
			}
		}
	}
	
	private final TeamType m_emptyTeam;
}
