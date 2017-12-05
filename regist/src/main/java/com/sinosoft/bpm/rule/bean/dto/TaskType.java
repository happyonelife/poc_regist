package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TaskType implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**任务类型*/
	private	String  taskType;
	/**任务类型名称*/
	private	String  taskName;
	/**技能组信息*/
	private List<Group> GroupList = new ArrayList<Group>(0);//新增任务任务列表
	
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public List<Group> getGroupList() {
		return GroupList;
	}
	public void setGroupList(List<Group> groupList) {
		GroupList = groupList;
	}

}
