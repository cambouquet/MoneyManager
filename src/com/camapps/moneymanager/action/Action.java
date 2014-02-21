/**
 * 
 */
package com.camapps.moneymanager.action;

/**
 * @author Camille
 *
 */
public abstract class Action {
	
	public void process() {
		performProcessing();
	}
	
	protected abstract void performProcessing();

}
