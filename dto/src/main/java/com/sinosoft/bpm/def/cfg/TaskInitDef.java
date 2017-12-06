package com.sinosoft.bpm.def.cfg;


public class TaskInitDef {
	/**
	 * 任务类型
	 */
	private String taskType;
	
	/**
	 * 任务分类
	 */
	private String taskCatalog;
	/**
	 * 理赔服务机构
	 */
	private String claimCom;
	/**
	 * 超时时长(单位：分钟) 支持表达式：60*2 表示两个小时;
	 */
	private String timeout;
	/**
	 * 临近任务超时时长(单位：分钟) 支持表达式：60*2 表示两个小时;
	 */
	private String vfield8;
	/**
	 * 超时执行事件重复次数
	 */
	private int repeatCount;
	/**
	 * 重复执行间隔时长
	 */
	private String duration;
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
	public String getClaimCom() {
		return claimCom;
	}
	public void setClaimCom(String claimCom) {
		this.claimCom = claimCom;
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
	
	
}
