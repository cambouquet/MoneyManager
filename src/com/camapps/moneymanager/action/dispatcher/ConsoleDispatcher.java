/**
 * 
 */
package com.camapps.moneymanager.action.dispatcher;

import com.camapps.moneymanager.ui.console.Console;

/**
 * @author Camille
 *
 */
public class ConsoleDispatcher extends Dispatcher {
	private Console m_console = null;
	
	public void setConsole(Console console) {
		m_console = console;
	}

	@Override
	protected void setOutput(Object output) {
		m_console.setOutput(output);
	}

}
