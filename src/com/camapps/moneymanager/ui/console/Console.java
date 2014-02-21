/**
 * 
 */
package com.camapps.moneymanager.ui.console;

import com.camapps.moneymanager.action.dispatcher.Dispatcher;
import com.camapps.moneymanager.action.dispatcher.DispatcherEvent;

/**
 * @author Camille
 *
 */
public class Console {
	
	private Dispatcher m_dispatcher = null;
	
	public Console(Dispatcher dispatcher) {
		m_dispatcher = dispatcher;
	}
	
	public void askForExpense() {
		System.out.println("Working or not?");
		dispatch("createExpense", "Yes");
	}
	
	protected void dispatch(String event, Object input) {
		m_dispatcher.saveInput(input);
		m_dispatcher.dispatch(new DispatcherEvent(DispatcherEvent.EVENT_TYPE_TO_ACTION, event));
	}
}
