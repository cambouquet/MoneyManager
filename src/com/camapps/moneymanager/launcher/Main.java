/**
 * 
 */
package com.camapps.moneymanager.launcher;

import com.camapps.moneymanager.action.StartAction;
import com.camapps.moneymanager.action.dispatcher.ConsoleDispatcher;
import com.camapps.moneymanager.action.dispatcher.Dispatcher;
import com.camapps.moneymanager.ui.console.Console;

/**
 * @author Camille
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello !");
		System.out.println("---------------------------------\n");

		ConsoleDispatcher dispatcher = new ConsoleDispatcher();
		Console console = new Console(dispatcher);
		
		StartAction startAction = new StartAction(dispatcher);
		startAction.process();
		
		System.out.println("\n---------------------------------");
		System.out.println("Thanks for using this beautiful programm");
	}

}
