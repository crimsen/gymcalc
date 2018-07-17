package de.gymcalc.rcp;

public interface IActiveObjectService {

	public void addListener( Object type, IActiveObjectListener listener );
	public void removeListener( Object type, IActiveObjectListener listener );
	public void setActiveObject( Object type, Object object );
	public Object getActiveObject( Object type );
}
