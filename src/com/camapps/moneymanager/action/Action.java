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
	
	private DispatcherEvent outEvent = null;
	
	public Action(Dispatcher dispatcher) {
		m_dispatcher = dispatcher;
	}
	
	public void process() {
		performProcessing();
		m_dispatcher.dispatch(outEvent);
	}
	
	protected abstract void performProcessing();

	public abstract void setInput(Object object);
}
