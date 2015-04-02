/*
 * Created on 23.10.2006
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package de.gymcalc.contest.calcprovider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.jface.viewers.ICellModifier;

import de.gymcalc.contest.provider.IAssociateAdapter;


/**
 * @author groegert
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class TeamTableItemProvider extends WinnerTableItemProvider
		implements ITableItemLabelProvider, ICellModifier, IAssociateAdapter
{

	/**
	 * @param adapterFactory
	 */
	public TeamTableItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

/*
 * for paarturnen team values have to be modified
 * 	public void modify(Object element, String property, Object value) {
	}
 */
	
}
