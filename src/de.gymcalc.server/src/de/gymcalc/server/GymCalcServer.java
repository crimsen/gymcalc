package de.gymcalc.server;

import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.net4j.util.om.OSGiApplication;

import de.gymcalc.internal.server.OM;

public class GymCalcServer extends OSGiApplication
{
  public static final String ID = OM.BUNDLE_ID + ".app";

  public GymCalcServer()
  {
    super(ID);
  }

  public static IRepository getRepository()
  {
    return OM.repository;
  }
}
