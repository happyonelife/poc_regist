package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 调度
 * @author chao
 *
 */
public class RuleSchedule implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String anyPayTaskClassify;//通赔任务分类
	private String anyPayTaskType;//通赔任务类型
	private String scheduleTaskClassify ;//调度任务分类
	private String scheduleTaskType ;//调度任务类型
	
	public String getAnyPayTaskClassify() {
		return anyPayTaskClassify;
	}
	public void setAnyPayTaskClassify(String anyPayTaskClassify) {
		this.anyPayTaskClassify = anyPayTaskClassify;
	}
	public String getAnyPayTaskType() {
		return anyPayTaskType;
	}
	public void setAnyPayTaskType(String anyPayTaskType) {
		this.anyPayTaskType = anyPayTaskType;
	}
	public String getScheduleTaskClassify() {
		return scheduleTaskClassify;
	}
	public void setScheduleTaskClassify(String scheduleTaskClassify) {
		this.scheduleTaskClassify = scheduleTaskClassify;
	}
	public String getScheduleTaskType() {
		return scheduleTaskType;
	}
	public void setScheduleTaskType(String scheduleTaskType) {
		this.scheduleTaskType = scheduleTaskType;
	}
}
