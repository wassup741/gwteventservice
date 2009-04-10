/*
 * GWTEventService
 * Copyright (c) 2008, GWTEventService Committers
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package de.novanic.eventservice.config.loader;

import de.novanic.eventservice.config.EventServiceConfiguration;

/**
 * @author sstrohschein
 *         <br>Date: 23.10.2008
 *         <br>Time: 20:55:14
 */
public class TestCustomConfigurationLoader implements ConfigurationLoader
{
    private EventServiceConfiguration myEventServiceConfiguration;

    public TestCustomConfigurationLoader(EventServiceConfiguration anEventServiceConfiguration) {
        myEventServiceConfiguration = anEventServiceConfiguration;
    }

    public boolean isAvailable() {
        return myEventServiceConfiguration != null;
    }

    public EventServiceConfiguration load() {
        return myEventServiceConfiguration;
    }
}