package de.gymcalc.internal.rcp;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.osgi.service.component.annotations.Component;

import de.gymcalc.rcp.IContestService;

@Component(name = "ContestServiceContextFunction", service = IContextFunction.class, property = "service.context.key=de.gymcalc.rcp.IContestService")
public class ContestServiceContextFunction extends ContextFunction {

	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		IContestService contestService = ContextInjectionFactory.make(ContestService.class, context);

		MApplication app = context.get(MApplication.class);
		IEclipseContext appCtx = app.getContext();
		appCtx.set(IContestService.class, contestService);

		return contestService;
	}

}
