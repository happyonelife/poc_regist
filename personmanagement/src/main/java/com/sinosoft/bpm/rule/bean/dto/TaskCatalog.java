package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TaskCatalog implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**任务分类*/
	private	String  taskCatalog;
	/**任务分类名称*/
	private	String  taskCatalogName;
	/**任务类型信息*/
	private List<TaskType> TaskTypeList = new ArrayList<TaskType>(0);//新增任务任务列表
	
	public String getTaskCatalog() {
		return taskCatalog;
	}
	public void setTaskCatalog(String taskCatalog) {
		this.taskCatalog = taskCatalog;
	}
	public String getTaskCatalogName() {
		return taskCatalogName;
	}
	public void setTaskCatalogName(String taskCatalogName) {
		this.taskCatalogName = taskCatalogName;
	}
	public List<TaskType> getTaskTypeList() {
		return TaskTypeList;
	}
	public void setTaskTypeList(List<TaskType> taskTypeList) {
		TaskTypeList = taskTypeList;
	}

}
