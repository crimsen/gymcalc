package de.gymcalc.internal.rcp;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.osgi.service.component.annotations.Component;

import de.gymcalc.rcp.IActiveObjectService;

@Component(name = "ActiveObjectServiceContextFunction", service = IContextFunction.class, property = "service.context.key=de.gymcalc.rcp.IActiveObjectService")
public class ActiveObjectServiceContextFunction extends ContextFunction {

	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		IActiveObjectService retVal = ContextInjectionFactory.make(ActiveObjectService.class, context);

		MApplication app = context.get(MApplication.class);
		IEclipseContext appCtx = app.getContext();
		appCtx.set(IActiveObjectService.class, retVal);

		return retVal;
	}

}
