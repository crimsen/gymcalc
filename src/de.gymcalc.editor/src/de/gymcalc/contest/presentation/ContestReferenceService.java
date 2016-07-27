package de.gymcalc.contest.presentation;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.edit.spi.ReferenceService;
import org.eclipse.emf.ecp.internal.edit.ECPControlHelper;
import org.eclipse.emf.ecp.spi.common.ui.SelectModelElementWizardFactory;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.edit.spi.swt.util.ECPDialogExecutor;
import org.eclipse.emf.ecp.view.internal.swt.Activator;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContextFactory;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ContestReferenceService implements ReferenceService {

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.ecp.view.spi.context.ViewModelService#instantiate(org.eclipse.emf.ecp.view.spi.context.ViewModelContext)
	 */
	@Override
	public void instantiate(ViewModelContext context) {
		editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(context.getDomainModel());
	}
/**
	 * {@inheritDoc}
	 *
	 * @since 1.5
	 */

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.ecp.view.spi.context.ViewModelService#dispose()
	 */
	@Override
	public void dispose() {
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.ecp.view.spi.context.ViewModelService#getPriority()
	 */
	@Override
	public int getPriority() {
		return 2;
	}

	@Override
	public void addNewModelElements(EObject eObject, EReference eReference) {
		final EObject newMEInstance = getNewModelElementInstance(eReference);

		if (newMEInstance == null) {
			return;
		}

		if (eReference.isContainer()) {
			// TODO language
			MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", //$NON-NLS-1$
				"Operation not permitted for container references!");//$NON-NLS-1$
			return;
		}

		if (!eReference.isContainment()) {
			// TODO language
			MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", //$NON-NLS-1$
				"Hier kann kein neues Element angelegt werden. Verwende Button \'Link\' anstelle von \'Neu\'.");//$NON-NLS-1$
			return;
		}

		ECPControlHelper.addModelElementInReference(eObject, newMEInstance, eReference,
			editingDomain);
		openInNewContext(newMEInstance);
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.ecp.edit.spi.ReferenceService#addExistingModelElements(org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.EReference)
	 * @since 1.5
	 */
	@Override
	public void addExistingModelElements(EObject eObject, EReference eReference) {
		final Iterator<EObject> allElements = ItemPropertyDescriptor
			.getReachableObjectsOfType(eObject, eReference.getEType())
			.iterator();

		final Set<EObject> elements = new LinkedHashSet<EObject>();
		while (allElements.hasNext()) {
			elements.add(allElements.next());
		}

		ECPControlHelper.removeExistingReferences(eObject, eReference, elements);
		if( 0 == elements.size() ) {
			// TODO language
			MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", //$NON-NLS-1$
				"Es gibt keine Element zu denen verlinkt werden kann.\nSolche Elemente müssen erst (in einer anderen Liste) angelegt werden.");//$NON-NLS-1$
			return;
		}

		final Set<EObject> addedElements = SelectModelElementWizardFactory
			.openModelElementSelectionDialog(elements, eReference.isMany());

		ECPControlHelper.addModelElementsInReference(eObject, addedElements, eReference,
			editingDomain);

	}
	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.ecp.edit.spi.ReferenceService#openInNewContext(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public void openInNewContext(final EObject eObject) {

		final Dialog dialog = new CustomDialog(Display.getDefault().getActiveShell(), eObject);

		new ECPDialogExecutor(dialog) {
			@Override
			public void handleResult(int codeResult) {

			}
		}.execute();
	}

	protected EditingDomain editingDomain;

	/** Custom dialog used for displaying the provided EObject. */
	private class CustomDialog extends Dialog {

		private final EObject eObject;

		/**
		 * @param activeShell
		 * @param eObject
		 */
		CustomDialog(Shell activeShell, EObject eObject) {
			super(activeShell);
			this.eObject = eObject;
		}

		@Override
		protected void configureShell(Shell shell) {
			super.configureShell(shell);
			shell.setText(eObject.eClass().getName());
		}

		@Override
		protected boolean isResizable() {
			return true;
		}

		/**
		 * {@inheritDoc}
		 *
		 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
		 */
		@Override
		protected Control createDialogArea(Composite parent) {
			final Composite composite = (Composite) super.createDialogArea(parent);
			GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).hint(450, 250)
				.applyTo(composite);

			final ScrolledComposite scrolledComposite = new ScrolledComposite(composite, SWT.H_SCROLL
				| SWT.V_SCROLL);
			GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(scrolledComposite);
			scrolledComposite.setExpandVertical(true);
			scrolledComposite.setExpandHorizontal(true);

			final Composite content = new Composite(scrolledComposite, SWT.NONE);
			GridLayoutFactory.fillDefaults().applyTo(content);
			GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(content);

			final ViewModelContext vmc = ViewModelContextFactory.INSTANCE.createViewModelContext(
				ViewProviderHelper.getView(eObject, null), eObject, new ContestReferenceService());
			try {
				ECPSWTViewRenderer.INSTANCE.render(content, vmc);
			} catch (final ECPRendererException ex) {
				Activator.log(ex);
			}

			scrolledComposite.setContent(content);
			final Point point = content.computeSize(SWT.DEFAULT, SWT.DEFAULT);
			scrolledComposite.setMinSize(point);
			scrolledComposite.layout(true);

			return composite;
		}

	}
	private EObject getNewModelElementInstance(EReference eReference) {
		return eReference.getEReferenceType().getEPackage().getEFactoryInstance()
			.create(eReference.getEReferenceType());
	}
}
