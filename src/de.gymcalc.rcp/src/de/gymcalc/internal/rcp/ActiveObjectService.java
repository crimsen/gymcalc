package de.gymcalc.internal.rcp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

import de.gymcalc.rcp.IActiveObjectListener;
import de.gymcalc.rcp.IActiveObjectService;

public class ActiveObjectService implements IActiveObjectService {

	public ActiveObjectService () {
	}
	@Override
	public void addListener(Object type, IActiveObjectListener listener) {
		ActiveObjectEntry objectEntry = null;
		if(!typeMap.containsKey(type)) {
			objectEntry = new ActiveObjectEntry();
			typeMap.put(type, objectEntry);
		} else {
			objectEntry = typeMap.get(type);
		}
		objectEntry.typeListener.add(listener);
	}

	@Override
	public void removeListener(Object type, IActiveObjectListener listener) {
		ActiveObjectEntry objectEntry = null;
		if(typeMap.containsKey(type)) {
			objectEntry = typeMap.get(type);
			objectEntry.typeListener.remove(listener);
			if( objectEntry.typeListener.isEmpty()) {
				typeMap.remove(type);
			}
		}
	}

	@Override
	public void setActiveObject(Object type, Object object) {
		changeQueue.add( new ChangeEntry( type, object ) );
		if( !inChange ) {
			processChangeQueue();
		}
	}
	protected void processChangeQueue() {
		inChange = true;
		while( !changeQueue.isEmpty() ) {
			ChangeEntry e = changeQueue.poll();
			ActiveObjectEntry objectEntry = null;
			if(!typeMap.containsKey(e.type)) {
				objectEntry = new ActiveObjectEntry();
				typeMap.put(e.type, objectEntry);
			} else {
				objectEntry = typeMap.get(e.type);
			}
			objectEntry.object = e.object;
			fireActiveObjectChanged( e.type, objectEntry );
		}
		inChange = false;
	}

	@Override
	public Object getActiveObject(Object type) {
		Object retVal = null;
		if(typeMap.containsKey(type)) {
			retVal = typeMap.get(type).object;
		}
		return retVal;
	}

	// types
	protected class ActiveObjectEntry {
		Object object = null;
		ArrayList<IActiveObjectListener> typeListener = new ArrayList<IActiveObjectListener>();
	}
	protected class ChangeEntry {
		protected ChangeEntry( Object aType, Object aObject ) {
			type = aType;
			object = aObject;
		}
		protected Object type;
		protected Object object;
	}
	// methodes
	protected void fireActiveObjectChanged( Object type, ActiveObjectEntry objectEntry ) {
		Object object = objectEntry.object;
		for(IActiveObjectListener e:objectEntry.typeListener){
			e.onActiveObjectChanged(type, object);
		}
	}
	// member
	protected HashMap<Object, ActiveObjectEntry> typeMap = new HashMap<Object, ActiveObjectEntry>();
	protected ArrayDeque<ChangeEntry> changeQueue = new ArrayDeque<ChangeEntry>();
	boolean inChange = false;
}
