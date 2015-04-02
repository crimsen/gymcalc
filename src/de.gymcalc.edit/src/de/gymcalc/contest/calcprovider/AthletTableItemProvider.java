/*
 * Created on 23.10.2006
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package de.gymcalc.contest.calcprovider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;

import de.gymcalc.contest.provider.IAssociateAdapter;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.TeamJuriResultType;


/**
 * @author groegert
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class AthletTableItemProvider extends WinnerTableItemProvider
		implements ITableItemLabelProvider, ICellModifier, IAssociateAdapter
{

	/**
	 * @param adapterFactory
	 */
	public AthletTableItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/* (non-Javadoc)
	 * @see de.gymcalc.contest.calcprovider.WinnerTableItemProvider#getColumnImage(java.lang.Object, int)
	 */
	@Override
	public Object getColumnImage(Object object, int columnIndex) {
		Object retVal = null;
		Object o = this.getObject(object, columnIndex, GETMODE.get);
		if( null != o && o instanceof JuriResultType ) {
			TeamJuriResultType tr = this.getTeamJuriResult(object, columnIndex, GETMODE.get);
			if( null != tr ) {
				EList< JuriResultType> jrs = tr.getJuriResult();
				if( jrs.contains(o)) {
					retVal = overlayImage(object, getResourceLocator().getImage("full/obj16/team"));
				} else {
					retVal = overlayImage(object, getResourceLocator().getImage("full/obj16/team-none"));
				}
			}
		} 
		if( null == retVal ) {
			retVal = super.getColumnImage(object, columnIndex);
		}
		return retVal;
	}

	@Override
	protected String prepareEditValue(Object object, int columnIndex, String val) {
		String retVal = super.prepareEditValue( object, columnIndex, val );
		Object o = this.getObject(object, columnIndex, GETMODE.get);
		if( null != o && o instanceof JuriResultType ) {
			TeamJuriResultType tr = this.getTeamJuriResult(object, columnIndex, GETMODE.get);
			if( null != tr ) {
				EList< JuriResultType> jrs = tr.getJuriResult();
				if( jrs.contains(o)) {
					retVal += 'm';
				}
			}
		} 
		return retVal;
	}

}
