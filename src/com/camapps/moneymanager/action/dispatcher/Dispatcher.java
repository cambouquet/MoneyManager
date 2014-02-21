/**
 * 
 */
package com.camapps.moneymanager.action.dispatcher;

import com.camapps.moneymanager.action.CreateExpenseAction;

/**
 * @author Camille
 *
 */
public abstract class Dispatcher {
	private Object m_input = null;

	private Object m_output = null;
	
	private CreateExpenseAction createExpenseAction = new CreateExpenseAction(this);
	
	public void dispatch(DispatcherEvent event) {
		if (event == null) {
			return;
		}
		
		System.out.println("..Dispatching event: " + event.getName());
		
		switch (event.getType()) {
		case DispatcherEvent.EVENT_TYPE_TO_ACTION:
			createExpenseAction.setInput(m_input);
			createExpenseAction.process();
			break;
		case DispatcherEvent.EVENT_TYPE_TO_UI:
			setOutput(m_output);
			processUIUpdate();
			break;
		}
	}

	protected abstract void processUIUpdate();

	protected abstract void setOutput(Object output);
	
	public void saveInput(Object input) {
		m_input = input;
	}

	public void saveOutput(Object output) {
		m_output = output;
	}
}
