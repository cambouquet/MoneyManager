/**
 * 
 */
package com.camapps.moneymanager.action;

import com.camapps.moneymanager.action.dispatcher.Dispatcher;

/**
 * @author Camille
 *
 */
public class StartAction extends Action {

	public StartAction(Dispatcher dispatcher) {
		super(dispatcher);
	}

	/* (non-Javadoc)
	 * @see com.camapps.moneymanager.action.Action#performProcessing()
	 */
	@Override
	protected void performProcessing() {
		setOutEvent("askForNewExpense");
	}

	@Override
	public void setInput(Object object) {
		// TODO Auto-generated method stub
		
	}

}
