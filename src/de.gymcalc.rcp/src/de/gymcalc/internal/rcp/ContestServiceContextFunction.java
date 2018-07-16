package de.gymcalc.internal.rcp;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.osgi.service.component.annotations.Component;

import de.gymcalc.rcp.IModel;

@Component(name = "ContestServiceContextFunction", service = IContextFunction.class, property = "service.context.key=de.gymcalc.rcp.IModel")
public class ContestServiceContextFunction extends ContextFunction {

	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		IModel ContestService = ContextInjectionFactory.make(Model.class, context);

		MApplication app = context.get(MApplication.class);
		IEclipseContext appCtx = app.getContext();
		appCtx.set(IModel.class, ContestService);

		return ContestService;
	}

}
