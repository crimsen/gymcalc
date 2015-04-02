package de.gymcalc.contest.command;

import java.util.Iterator;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.domain.EditingDomain;

public class DomainCompoundCommand extends CompoundCommand
	implements CommandActionDelegate {

	/**
	 * @param domain
	 */
	public DomainCompoundCommand(EditingDomain domain,
			String label, String description ) {
		super( LAST_COMMAND_ALL, label, description );
		this.domain = domain;
	}

	@Override
	public Object getImage() {
		return null;
	}

	@Override
	public String getText() {
		return this.getLabel();
	}

	@Override
	public String getToolTipText() {
		return this.getDescription();
	}

	protected EditingDomain getDomain( ) {
		return this.domain;
	}
	
	protected Object findInstanceInResource( Class<?> c ) {
		Object retVal = null;
		EList<Resource> resources = domain.getResourceSet().getResources();
		Iterator<Resource> i = resources.iterator();
		while( i.hasNext() && null == retVal ) {
			Resource r = i.next();
			EList<EObject> contents = r.getContents();
			Iterator<EObject> io = contents.iterator();
			while( io.hasNext() ) {
				EObject o = io.next();
				if( c.isInstance( o ) ) {
					retVal = o;
					break;
				}
			}
		}
		return retVal;
	}
	
	private EditingDomain domain;
}
