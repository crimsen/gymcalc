/**
 * <copyright>
 *
 * Copyright (c) 2009 Bestsolution.at and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   Tom Schindl<tom.schindl@bestsolution.at> - Initial API and implementation
 *
 * </copyright>
 *
 * $Id$
 */
package de.gymcalc.contest.presentation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.AbstractSourceProvider;
import org.eclipse.ui.ISources;


/**
 * Adds special variables to the application context
 */
public class ApplicationContext extends AbstractSourceProvider
{
  /**
   * The editing domain variable
   */
  public static final String EDITING_DOMAIN = "de.gymcalc.contest.editingdomain";

  private HashMap<String, Object> map = new HashMap<String, Object>();

  public void dispose()
  {
    map = null;
  }

  public Map< ? , ? > getCurrentState()
  {
    return map;
  }

  public String[] getProvidedSourceNames()
  {
    return new String []{ EDITING_DOMAIN };
  }

  /**
   * Set the current model resource
   * @param contactResourceImpl the resource
   */
  public void setEditingDomain(EditingDomain editingDomain)
  {
    map.put(EDITING_DOMAIN, editingDomain);
    fireSourceChanged(ISources.ACTIVE_PART, EDITING_DOMAIN, editingDomain);
  }
}
