/**
 * 
 */
package com.camapps.moneymanager.ui.console;

import com.camapps.moneymanager.action.CreateExpenseAction;

/**
 * @author Camille
 *
 */
public class Dispatcher {
	private Object m_input = null;
	
	private CreateExpenseAction createExpenseAction = new CreateExpenseAction();
	
	public void dispatch(String event) {
		System.out.println("..Dispatching event: " + event);
		createExpenseAction.process();
	}

	public void saveInput(Object input) {
		m_input = input;
	}
}
