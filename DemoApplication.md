There is a demo application called "DemoConversationApp" for GWTEventService available. It shows a small conversation application with a channel-system to demonstrate the "EventFilter" functionality. There is only one domain for the conversation context and an EventFilter to divide the conversation into different channels. The EventFilter is processed on the server side and checks the channels to decide if an event is important for the particular user. If not, the connection is still active, otherwise the events are returned to the client/user. Global events like "NewChannelEvent" or "CloseChannelEvent" are processed by the EventFilter without a check for a channel.
The most important functionality is contained in the class "ConversationControl" (de.novanic.gwteventservice.demo.conversationapp.client.conversation.control.ConversationControl) and should be a good entry point to study the usage in practice.

Project-SVN-URL: http://gwteventservice.googlecode.com/svn/trunk/

Demo-SVN-URL: http://gwteventservice.googlecode.com/svn/trunk/demo/