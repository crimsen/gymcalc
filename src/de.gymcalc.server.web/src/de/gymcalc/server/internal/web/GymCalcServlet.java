/*
 * Copyright (c) 2009-2012, 2015 Eike Stepper (Loehne, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 *
 *  Initial Publication:
 *    Eclipse Magazin - http://www.eclipse-magazin.de
 */
package de.gymcalc.server.internal.web;

import de.gymcalc.contest.ContestType;
import de.gymcalc.server.GymCalcServer;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.acceptor.IAcceptor;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.StringUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.io.IOUtil;
import org.eclipse.net4j.util.om.OMPlatform;

import templates.ContestTemplate;

/**
 * @author Eike Stepper
 */
public class GymCalcServlet extends HttpServlet
{
  private static final long serialVersionUID = 1L;

  private String contestName;

  private IAcceptor acceptor;

  private IConnector connector;

  private CDOView view;

  private ContestType contest;

  private ContestTemplate template = ContestTemplate.create(StringUtil.NL);

  private IRepository repository;

  public GymCalcServlet()
  {
  }

  @Override
  public void init() throws ServletException
  {
    repository = GymCalcServer.getRepository();
    if (repository == null)
    {
      return;
    }

    OM.LOG.info("GymCalc servlet initializing");
    String repositoryName = repository.getName();
    contestName = getContestName();

    acceptor = Net4jUtil.getAcceptor(IPluginContainer.INSTANCE, "jvm", repositoryName);
    connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, "jvm", repositoryName);

    CDONet4jSessionConfiguration config = CDONet4jUtil.createNet4jSessionConfiguration();
    config.setConnector(connector);
    config.setRepositoryName(repositoryName);

    CDONet4jSession session = config.openNet4jSession();
    view = session.openView();
    super.init();
    OM.LOG.info("GymCalc servlet initialized");
  }

  @Override
  public void destroy()
  {
    if (repository == null)
    {
      return;
    }

    OM.LOG.info("GymCalc servlet destroying");
    if (view != null)
    {
      CDONet4jSession session = (CDONet4jSession)view.getSession();
      if (session != null)
      {
        session.close();
      }
    }

    if (connector != null)
    {
      connector.close();
    }

    if (acceptor != null)
    {
      acceptor.close();
    }

    super.destroy();
    OM.LOG.info("GymCalc servlet destroyed");
  }

  public synchronized ContestType getContest()
  {
    if (contest == null)
    {
      String path = contestName;
      CDOResource resource = view.getResource(path);
      contest = (ContestType)resource.getContents().get(0);
    }

    return contest;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  {
    doPost(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
  {
    PrintWriter writer = resp.getWriter();

    try
    {
      String html = template.generate(getContest());
      writer.print(html);
    }
    finally
    {
      IOUtil.close(writer);
    }
  }

  public static String getContestName() throws ServletException
  {
    try
    {
      String configPath = OMPlatform.INSTANCE.getProperty("servlet.config", "config/gymcalc.properties");
      InputStream stream = new FileInputStream(configPath);
      // InputStream stream = OM.BUNDLE.getInputStream(configPath);

      try
      {
        Properties properties = new Properties();
        properties.load(stream);
        return properties.getProperty("contest");
      }
      finally
      {
        stream.close();
      }
    }
    catch (IOException ex)
    {
      throw new ServletException(ex);
    }
  }

  public static String html(String value)
  {
    return StringEscapeUtils.escapeHtml(value);
  }

  public static String html(double value)
  {
    return html(NumberFormat.getCurrencyInstance().format(value));
  }
}
