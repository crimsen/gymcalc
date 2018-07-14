package de.gymcalc.cdo;

/*
 * derived from package org.eclipse.emf.cdo.explorer.ui.checkouts.CDOModelEditorOpener
 */

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.explorer.CDOExplorerUtil;
import org.eclipse.emf.cdo.explorer.checkouts.CDOCheckout;
import de.gymcalc.cdo.bundle.OM;
import org.eclipse.emf.cdo.internal.ui.CDOEditorInputImpl;
import org.eclipse.emf.cdo.internal.ui.InteractiveConflictHandlerSelector;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.ui.CDOEditorInput;
import org.eclipse.emf.cdo.ui.CDOEditorOpener;
import org.eclipse.emf.cdo.ui.CDOEditorUtil;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.util.CDOUtil;
import org.eclipse.emf.cdo.view.CDOView;

import org.eclipse.emf.internal.cdo.transaction.CDOHandlingConflictResolver;

import org.eclipse.net4j.util.om.OMPlatform;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.spi.cdo.CDOMergingConflictResolver;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;

public class RootEditorOpener extends CDOEditorOpener.Default
{
  private static final boolean INTERACTIVE_CONFLICT_RESOLUTION = !"false"
      .equalsIgnoreCase(OMPlatform.INSTANCE.getProperty("cdo.interactive.conflict.resolution"));

  public RootEditorOpener()
  {
  }

  @Override
  protected IEditorPart doOpenEditor(final IWorkbenchPage page, URI uri)
  {
    CDOCheckout checkout = CDOExplorerUtil.getCheckout(uri);
    if (checkout == null)
    {
      MessageDialog.openError(page.getWorkbenchWindow().getShell(), "Error", "The checkout for " + uri + " could not be found.");
      return null;
    }

    final CDOView view = checkout.openView();

    if (view instanceof CDOTransaction)
    {
      configureTransaction((CDOTransaction)view);
    }

    CDOID objectID = null;
    if (uri.hasFragment())
    {
      CDOObject cdoObject = CDOUtil.getCDOObject(view.getResourceSet().getEObject(uri, true));
      if (cdoObject != null)
      {
        objectID = cdoObject.cdoID();
      }
    }

    final IEditorPart editor = openEditor(page, view, CDOURIUtil.extractResourcePath(uri), objectID);
    page.addPartListener(new IPartListener()
    {
      public void partClosed(IWorkbenchPart part)
      {
        if (part == editor)
        {
          try
          {
            view.close();
          }
          catch (Exception ex)
          {
            OM.LOG.error(ex);
          }
          finally
          {
            page.removePartListener(this);
          }
        }
      }

      public void partOpened(IWorkbenchPart part)
      {
        // Do nothing.
      }

      public void partDeactivated(IWorkbenchPart part)
      {
        // Do nothing.
      }

      public void partBroughtToTop(IWorkbenchPart part)
      {
        // Do nothing.
      }

      public void partActivated(IWorkbenchPart part)
      {
        // Do nothing.
      }
    });

    return editor;
  }

  protected void configureTransaction(CDOTransaction transaction)
  {
    addConflictResolver(transaction);
  }

  private IEditorPart openEditor(IWorkbenchPage page, CDOView view, String resourcePath, CDOID objectID)
  {
    try
    {
      String editorID = "de.gymcalc.contest.presentation.ContestRootEditorID";

      IEditorReference[] references = CDOEditorUtil.findEditor(page, view, resourcePath);
      for (IEditorReference reference : references)
      {
        if (editorID.equals(reference.getId()))
        {
          IEditorPart editor = references[0].getEditor(true);
          page.activate(editor);
          return editor;
        }
      }

      CDOEditorInput input = CDOEditorUtil.createCDOEditorInput(view, resourcePath, false);
      ((CDOEditorInputImpl)input).setObjectID(objectID);
      return page.openEditor(input, editorID);
    }
    catch (Exception ex)
    {
      OM.LOG.error(ex);
    }

    return null;
  }

  public static void addConflictResolver(CDOTransaction transaction)
  {
    if (INTERACTIVE_CONFLICT_RESOLUTION)
    {
      CDOHandlingConflictResolver conflictResolver = new CDOHandlingConflictResolver();
      conflictResolver.setConflictHandlerSelector(new InteractiveConflictHandlerSelector());

      transaction.options().addConflictResolver(conflictResolver);
    }
    else
    {
      transaction.options().addConflictResolver(new CDOMergingConflictResolver());
    }
  }
}
