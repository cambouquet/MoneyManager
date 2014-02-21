/**
 * 
 */
package com.camapps.moneymanager.ui.console;

import com.camapps.moneymanager.action.dispatcher.ConsoleDispatcher;
import com.camapps.moneymanager.action.dispatcher.DispatcherEvent;

/**
 * @author Camille
 *
 */
public class Console {	
	private ConsoleDispatcher m_dispatcher = null;
	
	private Object m_output = null;
	
	public Console(ConsoleDispatcher dispatcher) {
		m_dispatcher = dispatcher;
		m_dispatcher.setConsole(this);
	}
	
	public void askForExpense() {
		System.err.println("Working or not?");
		dispatch("createExpense", "Yes");
	}
	
	protected void dispatch(String event, Object input) {
		m_dispatcher.saveInput(input);
		m_dispatcher.dispatch(new DispatcherEvent(DispatcherEvent.EVENT_TYPE_TO_ACTION, event));
	}

	public void setOutput(Object output) {
		m_output = output;
	}
}
