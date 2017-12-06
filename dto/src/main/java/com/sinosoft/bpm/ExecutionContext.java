package com.sinosoft.bpm;


import java.util.List;
import java.util.Map;


import com.sinosoft.bpm.def.Process;
import com.sinosoft.bpm.def.Task;
import com.sinosoft.bpm.def.cfg.Action;
import com.sinosoft.bpm.def.cfg.Event;
import com.sinosoft.bpm.def.cfg.TaskInitDef;

/**
 * action动作执行时,该动作相关的参数
 */
public class ExecutionContext {
	protected Event event;
	protected Action action;
	/**
	 * 当前提交的任务
	 */
	protected Task task;
	/**
	 * 任务提交时如果产生自动任务则调用自动任务处理action时存的自动任务
	 */
	protected Task newTask;
	/**
	 * 当前流程
	 */
	protected Process process;
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	public Task getNewTask() {
		return newTask;
	}
	public void setNewTask(Task newTask) {
		this.newTask = newTask;
	}
	public Process getProcess() {
		return process;
	}
	public void setProcess(Process process) {
		this.process = process;
	}
	public boolean isSendBack() {
		return sendBack;
	}
	public void setSendBack(boolean sendBack) {
		this.sendBack = sendBack;
	}
	public Map<String, Object> getDynamicParams() {
		return dynamicParams;
	}
	public void setDynamicParams(Map<String, Object> dynamicParams) {
		this.dynamicParams = dynamicParams;
	}
	public String getHandler() {
		return handler;
	}
	public void setHandler(String handler) {
		this.handler = handler;
	}
	public List<Task> getNewTaskList() {
		return newTaskList;
	}
	public void setNewTaskList(List<Task> newTaskList) {
		this.newTaskList = newTaskList;
	}
	public String getIsAuditPass() {
		return isAuditPass;
	}
	public void setIsAuditPass(String isAuditPass) {
		this.isAuditPass = isAuditPass;
	}
	public Map<String, String> getPowerLevelMap() {
		return powerLevelMap;
	}
	public void setPowerLevelMap(Map<String, String> powerLevelMap) {
		this.powerLevelMap = powerLevelMap;
	}
	public TaskInitDef getTaskInitDef() {
		return taskInitDef;
	}
	public void setTaskInitDef(TaskInitDef taskInitDef) {
		this.taskInitDef = taskInitDef;
	}
	public Map<String, Map<String, Object>> getBackProperties() {
		return backProperties;
	}
	public void setBackProperties(Map<String, Map<String, Object>> backProperties) {
		this.backProperties = backProperties;
	}
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	/**
	 * 是否发起回退
	 */
	private boolean sendBack;
	/**
	 * 任务提交时的传的动态Map
	 */
	private Map<String,Object> dynamicParams;
	/**
	 * 当前操作人员
	 */
	private String handler;
	/**
	 * 任务提交时新产生的任务列表
	 */
	private List<Task> newTaskList;
	/**
	 * 是否审核通过(三核提交时调用结束流程时调用)
	 */
	private String isAuditPass;
	/**
	 * 三核审核通过时的审核通过级别MAP，Key为任务类型
	 */
	private Map<String,String> powerLevelMap;
	/**
	 * 任务创建时调用回调方法时传的初始化属性
	 */
	private TaskInitDef taskInitDef;
	/**
	 * 任务结束时调用回调方法时回传的属性map
	 * @return
	 */
	private Map<String,Map<String,Object>> backProperties;
	/**
	 * 规则返回的信息
	 */
	private String messsage;
	}
