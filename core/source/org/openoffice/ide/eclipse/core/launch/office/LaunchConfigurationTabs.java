/*************************************************************************
 *
 * $RCSfile:  $
 *
 * $Revision:  $
 *
 * last change: $Author:  $ $Date:  $
 *
 * The Contents of this file are made available subject to the terms of
 * the GNU Lesser General Public License Version 2.1
 *
 * Sun Microsystems Inc., October, 2000
 *
 *
 * GNU Lesser General Public License Version 2.1
 * =============================================
 * Copyright 2000 by Sun Microsystems, Inc.
 * 901 San Antonio Road, Palo Alto, CA 94303, USA
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 * MA 02111-1307 USA
 * 
 * The Initial Developer of the Original Code is: Sun Microsystems, Inc..
 *
 * Copyright: 2002 by Sun Microsystems, Inc.
 *
 * All Rights Reserved.
 *
 * Contributor(s): Cedric Bosdonnat, Dan Corneanu
 *
 *
 ************************************************************************/
package org.openoffice.ide.eclipse.core.launch.office;

import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;

/**
 * Creates tabs in the OpenOffice launcher.
 * 
 * @author cdan
 * 
 */
public class LaunchConfigurationTabs extends AbstractLaunchConfigurationTabGroup {

    /**
     * {@inheritDoc}
     */
    public void createTabs(ILaunchConfigurationDialog pDialog, String pMode) {
        ILaunchConfigurationTab[] tabs =  null;
        if (ILaunchManager.DEBUG_MODE.equals(pMode)) {
            tabs = new ILaunchConfigurationTab[] { 
                new OfficeTab(), 
                new SourceLookupTab(),
                new CommonTab() };
        } else {
            tabs = new ILaunchConfigurationTab[] { 
                new OfficeTab(), 
                new CommonTab() };
        }

        setTabs(tabs);
    }

}
