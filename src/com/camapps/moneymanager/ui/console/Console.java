/**
 * 
 */
package com.camapps.moneymanager.ui.console;

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
		dispatch("createExpense", new Object());
	}
	
	protected void dispatch(String event, Object input) {
		m_dispatcher.saveInput(input);
		m_dispatcher.dispatch(event);
	}

}
