package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * User: jason
 * Date: 14-4-21
 * Time: 下午3:47
 */
public class ProcessProp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String processName;//子流程名称
	private String businessMainKey;//主业务号
	private TaskProp taskProp = new TaskProp();//新增任务任务列表

	public TaskProp getTaskProp() {
		return taskProp;
	}

	public void setTaskProp(TaskProp taskProp) {
		this.taskProp = taskProp;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getBusinessMainKey() {
		return businessMainKey;
	}

	public void setBusinessMainKey(String businessMainKey) {
		this.businessMainKey = businessMainKey;
	}
	public String toString() {	
		StringBuffer buffer = new StringBuffer();
	buffer.append("*****子流程任务列表(ProcessProp)*****").append("\n");
	buffer.append("子流程名称(processName): ").append(processName).append("\n");
	buffer.append("主业务号(businessMainKey): ").append(businessMainKey).append("\n");
	buffer.append("新增任务任务列表(taskProp): ").append(taskProp).append("\n");
	return buffer.toString();
	}
	
}
