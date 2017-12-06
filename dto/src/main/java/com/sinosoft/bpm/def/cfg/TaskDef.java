package com.sinosoft.bpm.def.cfg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



import com.sinosoft.bpm.ExecutionContext;
import com.sinosoft.bpm.def.Task;

public class TaskDef {

	public static final int PRIORITY_HIGHEST = 1;
	public static final int PRIORITY_HIGH = 2;
	public static final int PRIORITY_NORMAL = 3;
	public static final int PRIORITY_LOW = 4;
	public static final int PRIORITY_LOWEST = 5;

	private String taskName;
	private String taskType;
	private String taskCatalog;
	private String catalogName;
	private String autoCompleteAction;
	private String endCallbackHandler;
	private String createCallbackHandler;
	private String receiveable;
	private String powerTaskCode;
	private int priority;
	private String remark;
	private String timeout;
    private String vfield8;
	private String timeoutAction;
	private int repeatCount;
	private String duration;
	private String nodeLevel;
	private String showIndex;
	private List<Event> events;

	private Map<String, Event> eventMap = new HashMap<String, Event>();

	public TaskDef() {
	}

	public TaskDef(String name) {
		this.taskType = name;
	}


	static final String[] supportedEventTypes = {Event.EVENTTYPE_TASK_CREATE, Event.EVENTTYPE_TASK_ASSIGN,
			Event.EVENTTYPE_TASK_START, Event.EVENTTYPE_TASK_END};

	public String[] getSupportedEventTypes() {
		return supportedEventTypes;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
		for (Event event : events) {
			eventMap.put(event.getEventName(), event);
		}
	}

	public Event getEvent(String eventType) {
		return eventMap.get(eventType);
	}

	/**
	 * 触发任务动作事件
	 * @param eventType
	 * @param executionContext
	 */
	public void fireEvent(String eventType, ExecutionContext executionContext) {
		Task task = executionContext.getTask();//获得当前任务实例
		Event event = task.getTaskDef().getEvent(eventType);//获得当前任务模板对应的事件类型的事件
		try {
			if (event != null && !event.getActions().isEmpty()) {
				executeActions(event.getActions(), executionContext);//执行事件的所有动作
			}
		} finally {
		}
	}

	/**
	 * 执行action集合中的动作
	 * @param actions action集合
	 * @param executionContext
	 */
	@SuppressWarnings("rawtypes")
	void executeActions(List actions, ExecutionContext executionContext) {
		if (actions != null) {
			Iterator iter = actions.iterator();//迭代所有动作
			while (iter.hasNext()) {
				Action action = (Action) iter.next();
				executeAction(action, executionContext);//执行动作
			}
		}
	}

	/**
	 * 执行action中的动作
	 * @param action 一个具体的action
	 * @param executionContext
	 */
	public void executeAction(Action action, ExecutionContext executionContext) {


		try {
			//更新执行上下文
			executionContext.setAction(action);

			//执行action
			action.execute(executionContext);


		} catch (Exception exception) {

		} finally {
			executionContext.setAction(null);
		}
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskCatalog() {
		return taskCatalog;
	}

	public void setTaskCatalog(String taskCatalog) {
		this.taskCatalog = taskCatalog;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public String getAutoCompleteAction() {
		return autoCompleteAction;
	}

	public void setAutoCompleteAction(String autoCompleteAction) {
		this.autoCompleteAction = autoCompleteAction;
	}

	public String getEndCallbackHandler() {
		return endCallbackHandler;
	}

	public void setEndCallbackHandler(String endCallbackHandler) {
		this.endCallbackHandler = endCallbackHandler;
	}

	public String getCreateCallbackHandler() {
		return createCallbackHandler;
	}

	public void setCreateCallbackHandler(String createCallbackHandler) {
		this.createCallbackHandler = createCallbackHandler;
	}

	public String getReceiveable() {
		return receiveable;
	}

	public void setReceiveable(String receiveable) {
		this.receiveable = receiveable;
	}

	public String getPowerTaskCode() {
		return powerTaskCode;
	}

	public void setPowerTaskCode(String powerTaskCode) {
		this.powerTaskCode = powerTaskCode;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getVfield8() {
		return vfield8;
	}

	public void setVfield8(String vfield8) {
		this.vfield8 = vfield8;
	}

	public String getTimeoutAction() {
		return timeoutAction;
	}

	public void setTimeoutAction(String timeoutAction) {
		this.timeoutAction = timeoutAction;
	}

	public int getRepeatCount() {
		return repeatCount;
	}

	public void setRepeatCount(int repeatCount) {
		this.repeatCount = repeatCount;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getNodeLevel() {
		return nodeLevel;
	}

	public void setNodeLevel(String nodeLevel) {
		this.nodeLevel = nodeLevel;
	}

	public String getShowIndex() {
		return showIndex;
	}

	public void setShowIndex(String showIndex) {
		this.showIndex = showIndex;
	}

	public Map<String, Event> getEventMap() {
		return eventMap;
	}

	public void setEventMap(Map<String, Event> eventMap) {
		this.eventMap = eventMap;
	}

	public List<Event> getEvents() {
		return events;
	}
	

}
