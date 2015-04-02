/*
 * Created on 23.10.2006
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package de.gymcalc.contest.calcprovider;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.Widget;

import de.gymcalc.contest.provider.IAssociateAdapter;
import de.gymcalc.contest.provider.WinnerTypeItemProvider;
import de.gymcalc.addressbook.OrganizationType;
import de.gymcalc.contest.AthletResultType;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.ContestFactory;
import de.gymcalc.contest.ContestPackage;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.JuriResultType;
import de.gymcalc.contest.ResultType;
import de.gymcalc.contest.TeamJuriResultType;
import de.gymcalc.contest.TeamResultType;
import de.gymcalc.contest.TeamType;
import de.gymcalc.contest.WinnerType;


/**
 * @author groegert
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class WinnerTableItemProvider extends WinnerTypeItemProvider
		implements ITableItemLabelProvider, ICellModifier, IAssociateAdapter
{

	/**
	 * @param adapterFactory
	 */
	public WinnerTableItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}


	/* (non-Javadoc)
	 * @see de.gymcalc.contest.provider.AthletTypeItemProvider#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		Notifier notifier = (Notifier) notification.getNotifier ();
		if (notifier instanceof ResultType) {
			switch (notification.getFeatureID(ResultType.class)) {
				case ContestPackage.ATHLET_RESULT_TYPE__JURIRESULT:
					associate (((ResultType)notifier).eContainer());
				case ContestPackage.RESULT_TYPE__RANK:
				case ContestPackage.RESULT_TYPE__POINTS:
					fireNotifyChanged(new ViewerNotification(notification, ((ResultType)notifier).eContainer(), false, true));
					return;
			}
		} else if (notifier instanceof JuriResultType) {
			switch (notification.getFeatureID(JuriResultType.class)) {
				case ContestPackage.JURI_RESULT_TYPE__VALUE:
				case ContestPackage.JURI_RESULT_TYPE__DISZIPLINE:
					fireNotifyChanged(new ViewerNotification(notification, ((ResultType)((JuriResultType)notifier).eContainer()).eContainer(), false, true));
					return;
			}
		} else if (notifier instanceof AthletType) {
			switch (notification.getFeatureID(AthletType.class)) {
				case ContestPackage.WINNER_TYPE__RESULT:
					associate (notifier);
			}
		} else if (notifier instanceof TeamType) {
			switch (notification.getFeatureID(TeamType.class)) {
			case ContestPackage.WINNER_TYPE__RESULT:
				associate (notifier);
			}
		}
		super.notifyChanged(notification);
	}


	/*
	 * should not be displayed as tree
	 */
	public boolean hasChildren (Object object) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ITableItemLabelProvider#getColumnImage(java.lang.Object, int)
	 */
	public Object getColumnImage(Object object, int columnIndex) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ITableItemLabelProvider#getColumnText(java.lang.Object, int)
	 */
	public String getColumnText(Object object, int columnIndex) {
		String RetVal = "";
		switch (columnIndex) {
		case 0:	
			RetVal = ((WinnerType)object).getName();
			break;
		case 1:	
			{
				OrganizationType organization = ((WinnerType)object).getOrganization();
				if (null != organization) {
					RetVal = organization.getName();
				}
			}
			break;
		case 2:
			{
				String disable = ((WinnerType)object).getDisable ();
				if (null == disable || 0 == disable.length ()) {
					ResultType result = ((WinnerType)object).getResult();
					if (null != result) {
						RetVal = Integer.toString(result.getRank());
					}
				} else {
					RetVal = disable;
				}
			}
			break;
		case 3:
			{
				ResultType result = ((WinnerType)object).getResult();
				if (null != result) {
					RetVal = Double.toString(result.getPoints());
				}
			}
			break;
		default:
			if (0 < columnIndex) {
				JuriResultType result = getJuriresult (object, columnIndex - 4, GETMODE.get);
				if (null != result) {
					RetVal = Double.toString(result.getValue ());
				}
			}
			break;
		}
		return RetVal;
	}

	public boolean canModify(Object element, String property) {
		boolean RetVal = false;
		int columnIndex = Integer.valueOf (property).intValue ();
		switch( columnIndex ) {
		default:
			RetVal = true;
		}
		return RetVal;
	}

	public Object getValue(Object element, String property) {
		String RetVal = null;
		int columnIndex = Integer.valueOf (property).intValue ();
		RetVal = prepareEditValue( element, columnIndex, getColumnText (element, columnIndex) );
		return RetVal;
	}

	public void modify(Object element, String property, Object value) {
		int columnIndex = Integer.valueOf (property).intValue ();
		switch (columnIndex) {
		case 0:
			{
				EObject eObject = (EObject) element;
				EditingDomain editingDomain = getEditingDomain (eObject);
				editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, eObject, ContestPackage.Literals.WINNER_TYPE__NAME, value));
			}
		case 1:
			break;
		case 2:
			{
				ResultType result = getResult ((WinnerType)getEobject (element), GETMODE.create);
				EditingDomain editingDomain = getEditingDomain (result);
				try {
					int rank = ( Integer ) getColumnValue( columnIndex, ( String ) value );
					editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, result, ContestPackage.Literals.RESULT_TYPE__RANK, rank ) );
				}
				catch( Exception e )
				{ }
			}
			break;
		case 3:
			{
				ResultType result = getResult ((WinnerType)getEobject (element), GETMODE.create);
				EditingDomain editingDomain = getEditingDomain (result);
				try {
					double resValue = ( Double ) getColumnValue( columnIndex, ( String ) value );
					editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, result, ContestPackage.Literals.RESULT_TYPE__POINTS, resValue ) );
				}
				catch( Exception e )
				{ }
			}
			break;
		default:
			{
				try {
					Double d = ( Double )getColumnValue( columnIndex, adjustValue( ( String ) value ) );
					JuriResultType juriresult = getJuriresult (element, columnIndex - 4, GETMODE.create);
					EditingDomain editingDomain = getEditingDomain (juriresult);
					editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, juriresult, ContestPackage.Literals.JURI_RESULT_TYPE__VALUE, d));
					TeamJuriResultType teamJuriResult = getTeamJuriResult( element, columnIndex, GETMODE.create );
					if( null != teamJuriResult ) {
						if( isTeamValue( ( String ) value ) ) {
							editingDomain.getCommandStack().execute(AddCommand.create(editingDomain, teamJuriResult, ContestPackage.Literals.JURI_RESULT_TYPE, juriresult));
						} else {
							editingDomain.getCommandStack().execute(RemoveCommand.create(editingDomain, teamJuriResult, ContestPackage.Literals.JURI_RESULT_TYPE, juriresult));
						}
					}
				} catch (RuntimeException e) {
				}
			}
		}
	}
	
	enum GETMODE {
		get,
		create,
	}
	
	JuriResultType getJuriresult (Object object, int columnIndex, GETMODE mode) {
		JuriResultType RetVal = null;
		EObject eObject = getEobject (object);
		ResultType result = getResult ((WinnerType)eObject, mode);
		if (null != result) {
			DisziplineType diszipline = column2Diszipline (eObject, columnIndex);
			if (null != diszipline) {
				String name = diszipline.getName();
				RetVal = getJuriresult (result, name);
				if (null == RetVal && GETMODE.create == mode) {
					EditingDomain editingDomain = getEditingDomain (result);
					if( result instanceof AthletResultType ) {
						RetVal = ContestFactory.eINSTANCE.createJuriResultType();
					} else if( result instanceof TeamResultType ) {
						RetVal = ContestFactory.eINSTANCE.createTeamJuriResultType();						
					}
					RetVal.setDiszipline (diszipline);
					editingDomain.getCommandStack().execute(AddCommand.create(editingDomain, result, ContestPackage.Literals.RESULT_TYPE__JURIRESULT, RetVal));
				}
			}
		}
		return RetVal;
	}

	TeamJuriResultType getTeamJuriResult(Object object, int columnIndex, GETMODE mode) {
		TeamJuriResultType retVal = null;
		Object o = this.getObject(object, columnIndex, GETMODE.get);
		if( null != o && o instanceof JuriResultType ) {
			AthletType a = (AthletType)object;
			TeamType team = a.getTeam();
			if( null != team ) {
				JuriResultType teamJuriResult = this.getJuriresult(team, columnIndex - 4, mode);
				if( null != teamJuriResult && 
						teamJuriResult instanceof TeamJuriResultType ) {
					retVal = (TeamJuriResultType) teamJuriResult;
				}
			}
		}
		return retVal;
	}

	ResultType getResult (WinnerType winner, GETMODE mode) {
		ResultType RetVal = (ResultType) winner.getResult ();
		if (null == RetVal && GETMODE.create == mode) {
			EditingDomain editingDomain = getEditingDomain (winner);
			createResult (editingDomain, winner);
			RetVal = (ResultType) winner.getResult();
		}
		return RetVal;
	}
	
	EObject getEobject (Object object) {
		EObject RetVal = null;
		if (object instanceof Widget) {
			RetVal = (EObject) ((Widget) object).getData ();
		} else {
			RetVal = (EObject) object;
		}
		return RetVal;
	}

	public EditingDomain getEditingDomain(EObject eObject)
	  {
	    EditingDomain result = AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
	    if (result == null)
	    {
	      if (adapterFactory instanceof IEditingDomainProvider)
	      {
	        result = ((IEditingDomainProvider)adapterFactory).getEditingDomain();
	      }
	
	      if (result == null && adapterFactory instanceof ComposeableAdapterFactory)
	      {
	        AdapterFactory rootAdapterFactory = ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory();
	        if (rootAdapterFactory instanceof IEditingDomainProvider)
	        {
	          result = ((IEditingDomainProvider)rootAdapterFactory).getEditingDomain();
	        }
	      }
	    }
	    return result;
	  }

	protected void createResult (EditingDomain editingDomain, EObject eObject) {
		if( eObject instanceof AthletType ) {
			editingDomain.getCommandStack().execute(AddCommand.create(editingDomain, eObject, ContestPackage.Literals.ATHLET_RESULT_TYPE, ContestFactory.eINSTANCE.createAthletResultType()));
		} else if( eObject instanceof TeamType ) {
			editingDomain.getCommandStack().execute(AddCommand.create(editingDomain, eObject, ContestPackage.Literals.TEAM_RESULT_TYPE, ContestFactory.eINSTANCE.createTeamResultType()));			
		}
	}

	DisziplineType column2Diszipline (EObject eObject, int columnIndex) {
		DisziplineType RetVal = null;
		ClassType classType = (ClassType) eObject.eContainer();
		EList<?> disziplines = classType.getDiszipline ();
		if (disziplines.size () > columnIndex) {
			RetVal = (DisziplineType)(disziplines.get(columnIndex));
		}
		return RetVal;
	}
	
	JuriResultType getJuriresult (ResultType result, String name) {
		JuriResultType RetVal = null;
		Iterator<?> i = result.getJuriresult ().iterator ();
		while (i.hasNext ()) {
			JuriResultType juriresult = (JuriResultType)i.next ();
			if (name.equals(juriresult.getDiszipline ().getName ())) {
				RetVal = juriresult;
				break;
			}
		}
		return RetVal;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getChildren(java.lang.Object)
	 */
	public Collection<?> getChildren(Object object) {
		return Collections.EMPTY_LIST;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getElements(java.lang.Object)
	 */

	public Collection<?> getElements(Object object) {
		return null;
	}

	/* (non-Javadoc)
	 * @see de.gymcalc.contest.provider.IAssociateAdapter#associate(org.eclipse.emf.common.notify.Notifier)
	 */
	public void associate(Notifier target) {
		WinnerType winner = (WinnerType)target;
		ResultType result = (ResultType) winner.getResult();
		if (null != result) {
			result.eAdapters().add(this);
			EList<?> juriresults = result.getJuriresult();
			if (null != juriresults &&
				!juriresults.isEmpty ()) {
				Iterator<?> i = juriresults.iterator();
				while (i.hasNext()) {
					JuriResultType juriresult = (JuriResultType)i.next();
					juriresult.eAdapters().add(this);
				}
			}
		}
	}
	
	private Object getColumnValue( int col, String val )
	{
		Object retVal = null;
		switch( col ) {
		case 0:
			{
				retVal = val;
			}
		case 1:
			// organization not changeble
			break;
		case 2:
			{
				try {
					retVal = Integer.valueOf( val );
				} catch( Exception e ) {
				}
			}
			break;
		case 3:
			{
				try {
					retVal = Double.valueOf( val );
				}
				catch( Exception e ) {
				}
			}
			break;
		default:
			{
				try {
					retVal = Double.valueOf( val );
				} catch( Exception e ) {
				}
			}
		}
		return retVal;
	}
	
	Object getObject( Object o, int columnIndex, GETMODE mode ) {
		Object retVal = null;
		switch (columnIndex) {
		case -1:
		case 0:
		case 1:
			retVal = o;
			break;
		case 2:
		case 3:
			// rank and sum
			retVal = getResult ((WinnerType)getEobject (o), mode);
			break;
		default:
			retVal = getJuriresult (o, columnIndex - 4, mode);
		}
		return retVal;
	}
	
	boolean isTeamValue( String val ) {
		boolean retVal = val.matches( ".*[mM].*" );
		return retVal;
	}
	
	String adjustValue( String val ) {
		String retVal = val.replaceAll( "[^0-9\\.]*", "");
		return retVal;
	}
	
	protected String prepareEditValue(Object object, int columnIndex, String val) {
		String retVal = val;
		return retVal;
	}

}
