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
	private CreateExpenseAction createExpenseAction = new CreateExpenseAction();
	
	public void dispatch(String event) {
		createExpenseAction.process();
	}
}
