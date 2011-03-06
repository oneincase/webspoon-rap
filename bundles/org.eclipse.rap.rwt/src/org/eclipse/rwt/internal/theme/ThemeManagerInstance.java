/*******************************************************************************
 * Copyright (c) 2007, 2011 Innoopract Informationssysteme GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Innoopract Informationssysteme GmbH - initial API and implementation
 *    EclipseSource - ongoing development
 *    Rüdiger Herrmann - bug 335112
 *    Frank Appel - replaced singletons and static fields (Bug 337787)
 ******************************************************************************/
package org.eclipse.rwt.internal.theme;


public class ThemeManagerInstance {
  private ThemeManager instance;
  
  public ThemeManager getInstance() {
    if( instance == null ) {
      instance = new ThemeManager();
    }
    return instance;
  }
  
  public void resetInstance() {
    instance = null;
  }
  
  private ThemeManagerInstance() {
    // prevent instance creation
  }
}