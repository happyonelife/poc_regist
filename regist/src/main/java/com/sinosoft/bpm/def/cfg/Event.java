package com.sinosoft.bpm.def.cfg;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Event {

	public static final String EVENTTYPE_TASK_CREATE = "task-create";
	public static final String EVENTTYPE_TASK_ASSIGN = "task-assign";
	public static final String EVENTTYPE_TASK_START = "task-start";
	public static final String EVENTTYPE_TASK_END = "task-end";
	public static final String EVENTTYPE_TASK_SUSPEND = "task-suspend";
	public static final String EVENTTYPE_TASK_RESUME = "task-resume";
	public static final String EVENTTYPE_TIMER_CREATE = "timer-create";
	public static final String EVENTTYPE_TASK_TIMEOUT = "task-timeout";
	public static final String EVENTTYPE_TIMER = "timer";

	@XmlTransient
	private String eventId;
	@XmlAttribute
	private String eventName;//事件名称
	@XmlTransient
	private List<Action> actions;
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public List<Action> getActions() {
		return actions;
	}
	public void setActions(List<Action> actions) {
		this.actions = actions;
	}
}
