/**
 * 
 */
package com.camapps.moneymanager.action.dispatcher;

/**
 * @author Camille
 *
 */
public class DispatcherEvent {
	public static final Integer EVENT_TYPE_TO_ACTION = 0;
	public static final Integer EVENT_TYPE_TO_UI = 1;
	
	private Integer m_type = null;
	
	private String m_name = null;

	public DispatcherEvent(Integer eventType, String eventName) {
		m_name = eventName;
		m_type = eventType;
	}

	public Integer getType() {
		return m_type;
	}

	public void setType(Integer type) {
		this.m_type = type;
	}

	public String getName() {
		return m_name;
	}

	public void setName(String name) {
		this.m_name = name;
	}
}
