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

import java.text.MessageFormat;

import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.jface.databinding.viewers.ObservableMapCellLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Image;


/**
 * Implementation of a cell label provider which provides support for formatting using {@link MessageFormat#format(String, Object...)}
 */
public class GenericMapCellLabelProvider extends ObservableMapCellLabelProvider
	implements ILabelProvider
{
  private IObservableMap[] attributeMaps;
  private String messagePattern;

  /**
   * Create a new label provider
   * @param messagePattern the message pattern
   * @param attributeMaps the values to observe
   */
  public GenericMapCellLabelProvider(String messagePattern, IObservableMap... attributeMaps)
  {
    super(attributeMaps);
    this.messagePattern = messagePattern;
    this.attributeMaps = attributeMaps;
  }

  @Override
  public void update(ViewerCell cell)
  {
    Object element = cell.getElement();
    cell.setText( getText( element ) );
  }

  /* (non-Javadoc)
   * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
   */
  @Override
  public Image getImage(Object element) {
	 return null;
  }

  /* (non-Javadoc)
   * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
   */
  @Override
  public String getText(Object element) {
	String retVal = null;
    Object[] values = new Object[ attributeMaps.length ];
    int i = 0;
    for( IObservableMap m : attributeMaps ) {
      values[ i++ ] = m.get( element );
      if( values[ i - 1 ] == null ) {
    	// if there are not enough values for the attributes
        retVal = "";
        break;
      }
    }
    if( null == retVal ) {
    	retVal = MessageFormat.format( messagePattern, values );
    }
	return retVal;
  }
  
}