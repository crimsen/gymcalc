package de.gymcalc.contest.command;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemProvider;

import de.gymcalc.contest.ClassType;

public class ClassCommand extends AbstractOverrideableCommand
	implements CommandActionDelegate {

	public static Command create(EditingDomain editingDomain,
			String label, String desc,
			Collection<?> collection) {
		return new ClassCommand( editingDomain, label, desc, collection );
	}

	/**
	 * @param domain
	 */
	public ClassCommand(EditingDomain domain, String label,
			String desc, Collection<?> collection) {
		super(domain);
		this.label = label;
		this.description = desc;
		for( Object o : collection ) {
			ClassType _class = findClass( o );
			if( null != _class ) {
				this.collection.add( _class );
			}
		}
	}

	@Override
	public void doExecute() {
	}

	@Override
	public void doRedo() {
	}

	@Override
	public void doUndo() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doCanUndo()
	 */
	@Override
	public boolean doCanUndo() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.edit.command.AbstractOverrideableCommand#doCanExecute()
	 */
	@Override
	public boolean doCanExecute() {
		return ! this.collection.isEmpty();
	}

	public Object getImage() {
		return null;
	}

	public String getText() {
		return label;
	}

	public String getToolTipText() {
		return description;
	}
	
	protected ClassType findClass( Object o )
	{
		ClassType retVal = null;
		EObject item = null;
		if( o instanceof EObject ) {
			item = ( EObject ) o;
		} else if( o instanceof ItemProvider ) {
			//item = ( ( ItemProvider ) o );
		}
		if( null != item ) {
			if( item instanceof ClassType ) {
				retVal = ( ClassType ) item;
			} else {
				// look upwards
				EObject container = item.eContainer();
				while( null != container ) {
					if( container instanceof ClassType ) {
						retVal = ( ClassType ) container;
						break;
					}
					container = container.eContainer();
				}
			}
			if( null == retVal ) {
				// look downwards
			}
		}
		return retVal;
	}

	protected ArrayList< ClassType > collection = new ArrayList< ClassType >();
	
}
