/**
 * 
 */
package com.camapps.moneymanager.action.dispatcher;

import com.camapps.moneymanager.action.CreateExpenseAction;

/**
 * @author Camille
 *
 */
public class Dispatcher {
	private Object m_input = null;
	
	private CreateExpenseAction createExpenseAction = new CreateExpenseAction(this);
	
	public void dispatch(DispatcherEvent outEvent) {
		System.out.println("..Dispatching event: " + outEvent);
		createExpenseAction.setInput(m_input);
		createExpenseAction.process();
	}

	public void saveInput(Object input) {
		m_input = input;
	}
}
