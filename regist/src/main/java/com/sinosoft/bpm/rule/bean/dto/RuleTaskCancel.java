package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 任务注销信息
 * @author chao
 *
 */

public class RuleTaskCancel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	注销任务分类*/
	private	String  cancleTaskClassify;
	/**	注销任务类型*/
	private	String  cancleTaskType;
	/**	通赔调度任务分类*/
	private	String  AnyPayTaskClassify;
	/**	通赔调度任务类型*/
	private	String  AnyPayTaskType;
	
	public String getAnyPayTaskClassify() {
		return AnyPayTaskClassify;
	}
	public void setAnyPayTaskClassify(String anyPayTaskClassify) {
		AnyPayTaskClassify = anyPayTaskClassify;
	}
	public String getAnyPayTaskType() {
		return AnyPayTaskType;
	}
	public void setAnyPayTaskType(String anyPayTaskType) {
		AnyPayTaskType = anyPayTaskType;
	}
	public String getCancleTaskClassify() {
		return cancleTaskClassify;
	}
	public void setCancleTaskClassify(String cancleTaskClassify) {
		this.cancleTaskClassify = cancleTaskClassify;
	}
	public String getCancleTaskType() {
		return cancleTaskType;
	}
	public void setCancleTaskType(String cancleTaskType) {
		this.cancleTaskType = cancleTaskType;
	}
	
	
}
