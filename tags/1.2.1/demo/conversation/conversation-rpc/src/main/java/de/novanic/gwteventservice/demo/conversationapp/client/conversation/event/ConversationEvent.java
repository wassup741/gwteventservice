/*
 * GWTEventService
 * Copyright (c) 2011 and beyond, strawbill UG (haftungsbeschränkt)
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 * Other licensing for GWTEventService may also be possible on request.
 * Please view the license.txt of the project for more information.
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
package de.novanic.gwteventservice.demo.conversationapp.client.conversation.event;

import de.novanic.gwteventservice.demo.conversationapp.client.conversation.Channel;
import de.novanic.eventservice.client.event.Event;

/**
 * @author sstrohschein
 *         <br>Date: 16.09.2008
 *         <br>Time: 00:05:41
 */
public abstract class ConversationEvent implements Event
{
    public static final String CONVERSATION_DOMAIN = "domain_conversation";

    private String myActor;
    private Channel myChannel;

    public ConversationEvent() {}

    public ConversationEvent(String anActor, Channel aChannel) {
        myActor = anActor;
        myChannel = aChannel;
    }

    public String getActor() {
        return myActor;
    }

    public Channel getChannel() {
        return myChannel;
    }

    public String getDomain() {
        return CONVERSATION_DOMAIN;
    }
}