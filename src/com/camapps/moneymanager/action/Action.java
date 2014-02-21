/**
 * 
 */
package com.camapps.moneymanager.action;

import com.camapps.moneymanager.action.dispatcher.Dispatcher;
import com.camapps.moneymanager.action.dispatcher.DispatcherEvent;

/**
 * @author Camille
 *
 */
public abstract class Action {
	private Dispatcher m_dispatcher = null;
	
	private DispatcherEvent m_outEvent = null;
	
	public Action(Dispatcher dispatcher) {
		m_dispatcher = dispatcher;
	}
	
	public void process() {
		performProcessing();
		m_dispatcher.dispatch(m_outEvent);
	}
	
	protected abstract void performProcessing();

	protected void setOutEvent(String eventName) {
		m_outEvent = new DispatcherEvent(DispatcherEvent.EVENT_TYPE_TO_UI, eventName);
	}

	public abstract void setInput(Object object);
}
