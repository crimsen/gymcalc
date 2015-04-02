/*
 * Created on 10.11.2006
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package de.gymcalc.contest.calcprovider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.swt.widgets.Widget;

import de.gymcalc.contest.provider.ChainTypeItemProvider;
import de.gymcalc.contest.AthletType;
import de.gymcalc.contest.ChainType;
import de.gymcalc.contest.ClassType;
import de.gymcalc.contest.DisziplineType;
import de.gymcalc.contest.StationType;
import de.gymcalc.contest.WinnerType;

/**
 * @author groegert
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class ChainTableItemProvider extends ChainTypeItemProvider
		implements ITableItemLabelProvider,
			IColumnMap
		{

	final static int fixedColumns = 4; 
	public final static int maxColumns = 15; 
	/**
	 * @param adapterFactory
	 */
	public ChainTableItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		wrappingNeeded = true;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ITableItemLabelProvider#getColumnImage(java.lang.Object, int)
	 */
	public Object getColumnImage(Object object, int columnIndex) {
		Object RetVal = null;
		String Name = getColumnText (object, columnIndex);
		if (null != Name) {
			if (0 == Name.compareTo("Boden")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/boden"));
			} else if (0 == Name.compareTo("Sprung")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/sprung"));
			} else if (0 == Name.compareTo("Balken")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/balken"));
			} else if (0 == Name.compareTo("Stuba")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/stuba"));
			} else if (0 == Name.compareTo("Pferd")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/pferd"));
			} else if (0 == Name.compareTo("Ringe")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/ringe"));
			} else if (0 == Name.compareTo("Barren")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/barren"));
			} else if (0 == Name.compareTo("Reck")) {
				RetVal = overlayImage(object, getResourceLocator().getImage("full/obj16/reck"));
			}
		}
		return RetVal;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ITableItemLabelProvider#getColumnText(java.lang.Object, int)
	 */
	public String getColumnText(Object object, int columnIndex) {
		String RetVal = "";
		switch (columnIndex) {
		case 0:	
			RetVal = ((ChainType)object).getName();
			break;
		case 1:
			RetVal = getString ("_UI_WinnerType_organization_feature");
			break;
		case 2:
			RetVal = getString ("_UI_ResultType_rank_feature");
			break;
		case 3:
			RetVal =  getString ("_UI_ResultType_points_feature");
			break;
		default:
			RetVal = getDisziplineName (object, columnIndex - fixedColumns);
			break;
		}
		return RetVal;
	}

	public List<Integer> getColumnMap(Object object, Object child) {
		ArrayList <Integer> RetVal = new ArrayList <Integer> (maxColumns);
		int Idx = 0;
		for (; fixedColumns > Idx; ++Idx) {
			RetVal.add(Idx);
		}
		if (object instanceof ChainType) {
			EList<StationType> stations = ((ChainType)object).getStation();
			ArrayList <StationType> winnerStations = new ArrayList <StationType> (maxColumns);
			Iterator<DisziplineType> iDiszipline = (getDisziplinesOfChild (child)).iterator ();
			while (iDiszipline.hasNext ()) {
				winnerStations.add(iDiszipline.next ().getStation ());
			}
			Iterator<StationType> iStation = stations.iterator();
			while (iStation.hasNext()) {
				StationType station = iStation.next ();
				int stationIdx = winnerStations.indexOf(station);
				if (stationIdx >= 0) {
					RetVal.add(stationIdx + fixedColumns);
				} else {
					RetVal.add (-1);
				}
				++Idx;
			}
		}
		for (; maxColumns > Idx; ++Idx) {
			RetVal.add(-1);
		}
		return RetVal;
	}

	String getDisziplineName (Object object, int columnIndex) {
		String RetVal = null;
		EObject eObject = getEobject (object);
		if (eObject instanceof ChainType) {
			Collection<String> disziplines = getDisziplines ((ChainType) eObject);
			if (disziplines.size () > columnIndex) {
				RetVal = (String)disziplines.toArray()[columnIndex];
			}
		}
		return RetVal;
	}
	
	Collection<String> getDisziplines (ChainType chain) {
		ArrayList<String> RetVal = new ArrayList<String> ();
		HashMap<StationType, HashSet <DisziplineType> > stationMap =
			new HashMap<StationType, HashSet <DisziplineType> > ();
		{
			// initialize the stationMap
			Iterator<StationType> iStations = chain.getStation ().iterator();
			while (iStations.hasNext ()) {
				stationMap.put(iStations.next(), new HashSet <DisziplineType> ());
			}
		}
		Collection<ClassType> classes = getClasses (chain);
		Iterator<ClassType> iClasses = classes.iterator ();
		while (iClasses.hasNext()) {
			ClassType class_ = iClasses.next ();
			EList<DisziplineType> disziplines = class_.getDiszipline();
			Iterator<DisziplineType> iDisziplines = disziplines.iterator ();
			for (; iDisziplines.hasNext ();) {
				DisziplineType diszipline = iDisziplines.next ();
				if (stationMap.containsKey(diszipline.getStation ())) {
					stationMap.get (diszipline.getStation()).add(diszipline);
				}
			}
		}
		// here all disziplines are collected in stationMap
		{
			// create the Names
			Iterator<StationType> iStations = chain.getStation ().iterator();
			while (iStations.hasNext ()) {
				String mergedDisziplineName = "";
				Iterator <DisziplineType> iDiszipline = stationMap.get(iStations.next()).iterator();
				while (iDiszipline.hasNext()) {
					String disziplineName = iDiszipline.next().getName();
					if (!mergedDisziplineName.contains(disziplineName)) {
						if (0 != mergedDisziplineName.length()) {
							mergedDisziplineName += "/";
						}
						mergedDisziplineName += disziplineName;
					}
				}
				RetVal.add(mergedDisziplineName);
			}
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

	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
//			childrenFeatures.add(ContestPackage.Literals.CLASS_TYPE__WINNER);
		}
		return childrenFeatures;
	}

	@Override
	protected Object createWrapper(EObject object, EStructuralFeature feature, Object value, int index) {
		return new ColumnMapItemProvider (value, object, feature, index, adapterFactory);
	}

	private Collection<ClassType> getClasses (ChainType chain) {
		// collecting all classes that are in the chain
		HashSet<ClassType> RetVal = new HashSet<ClassType> ();
		EList<AthletType> athlets = chain.getAthlet();
		Iterator<AthletType> iAthlets = athlets.iterator ();
		while (iAthlets.hasNext ()) {
			AthletType athlet = iAthlets.next();
			EObject object = athlet.eContainer ();
			if (object instanceof ClassType) {
				RetVal.add((ClassType) object);
			}
		}
		return RetVal;
	}

	Collection<DisziplineType> getDisziplinesOfChild (Object child) {
		Collection<DisziplineType> RetVal = null;
		if (child instanceof WinnerType) {
			WinnerType winner = (WinnerType) child;
			EObject object = winner.eContainer ();
			if (object instanceof ClassType) {
				RetVal = ((ClassType) object).getDiszipline();
			}
		}
		return RetVal;
	}
}
