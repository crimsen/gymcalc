package de.gymcalc.contest.calcprovider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;

import de.gymcalc.contest.provider.ContestTypeItemProvider;
import de.gymcalc.contest.ContestType;

public class ContestClassItemProvider extends ContestTypeItemProvider {

	public ContestClassItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Collection<?> getChildren(Object object) {
		return ((ContestType)object).getClass_();
	}
}
