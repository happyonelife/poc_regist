package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 *
 */
public class RuleRequest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String taskCatalog;
	private String taskType;
	private Boolean isBack;
	private String processName;
	private String processType;
	private String businessMainKey;


	public Boolean getIsBack() {
		return isBack;
	}

	public void setIsBack(Boolean isBack) {
		this.isBack = isBack;
	}

	public String getTaskCatalog() {
		return taskCatalog;
	}

	public void setTaskCatalog(String taskCatalog) {
		this.taskCatalog = taskCatalog;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessType() {
		return processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}

	public String getBusinessMainKey() {
		return businessMainKey;
	}

	public void setBusinessMainKey(String businessMainKey) {
		this.businessMainKey = businessMainKey;
	}
}
