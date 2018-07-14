package de.gymcalc.cdo.bundle;

/*
 * taken from package org.eclipse.emf.cdo.explorer.ui.bundle.OM;
 */

import org.eclipse.emf.cdo.ui.OverlayImage;

import org.eclipse.net4j.util.om.OMBundle;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.log.OMLogger;
import org.eclipse.net4j.util.om.pref.OMPreference;
import org.eclipse.net4j.util.om.pref.OMPreferences;
import org.eclipse.net4j.util.om.trace.OMTracer;
import org.eclipse.net4j.util.ui.UIActivator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * The <em>Operations & Maintenance</em> class of this bundle.
 */
public abstract class OM
{
  public static final String BUNDLE_ID = "de.gymcalc.cdo"; //$NON-NLS-1$

  public static final OMBundle BUNDLE = OMPlatform.INSTANCE.bundle(BUNDLE_ID, OM.class);

  public static final OMTracer DEBUG = BUNDLE.tracer("debug"); //$NON-NLS-1$

  public static final OMLogger LOG = BUNDLE.logger();

  public static final OMPreferences PREFS = BUNDLE.preferences();

  public static final OMPreference<Integer> PREF_REPOSITORY_TIMEOUT_MINUTES = //
      PREFS.init("PREF_REPOSITORY_TIMEOUT_MINUTES", 5); //$NON-NLS-1$

  public static final OMPreference<Boolean> PREF_REPOSITORY_TIMEOUT_DISABLED = //
      PREFS.init("PREF_REPOSITORY_TIMEOUT_DISABLED", false); //$NON-NLS-1$

  public static final OMPreference<Integer> PREF_DASHBOARD_HEIGHT = //
      PREFS.init("PREF_DASHBOARD_HEIGHT", 0); //$NON-NLS-1$

  public static Image getOverlayImage(Object image, Object overlayImage, int x, int y)
  {
    ComposedImage composedImage = new OverlayImage(image, overlayImage, x, y);
    return ExtendedImageRegistry.INSTANCE.getImage(composedImage);
  }

  public static Image getImage(String imagePath)
  {
    return ExtendedImageRegistry.INSTANCE.getImage(getBundleURI(imagePath));
  }

  public static ImageDescriptor getImageDescriptor(String imagePath)
  {
    return ExtendedImageRegistry.INSTANCE.getImageDescriptor(getBundleURI(imagePath));
  }

  private static URI getBundleURI(String path)
  {
    return URI.createPlatformPluginURI(BUNDLE_ID + "/" + path, true);
  }

  /**
   * @author Eike Stepper
   */
  public static final class Activator extends UIActivator
  {
    public static Activator INSTANCE;

    public Activator()
    {
      super(BUNDLE);
      INSTANCE = this;
    }
  }
}
