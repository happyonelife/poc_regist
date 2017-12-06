package com.sinosoft.bpm.def;

import java.util.Date;

import com.sinosoft.bpm.def.type.BpmConStant;

public class Process{

	/**
	 * 流程id
	 */
	private Long processId;
	/**
	 * 流程名称
	 */
	private String processName;
	/**
	 * 流程版本号
	 */
	private String version;
	/**
	 * 流程发起人
	 */
	private String startUserId;
	/**
	 * 主业务号
	 */
	private String businessMainKey;
	/**
	 * 记录流程开始任务id
	 */
	private Long startTaskId;
	/**
	 * 记录流程结束任务id
	 */
	private Long endTaskId;
	/**
	 * 记录流程开始时间
	 */
	private Date startTime;
	/**
	 * 记录流程结束时间
	 */
	private Date endTime;
	/**
	 * 开启 1, 关闭 0 , 暂停 2
	 */
	private String processStatus;
	/**
	 * 是否子流程
	 */
	protected String isSubProcess = BpmConStant.NO;
	/**
	 * 记录流程创建时间
	 */
	private Date createTime;
	/**
	 * 记录流程最后更新时间
	 */
	private Date lastUpdateTime;
	/**
	 * 记录父流程id
	 */
	private Long parentId;
	/**
	 * 注销标志
	 */
	private String cancel;
	public Long getProcessId() {
		return processId;
	}
	public void setProcessId(Long processId) {
		this.processId = processId;
	}
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getStartUserId() {
		return startUserId;
	}
	public void setStartUserId(String startUserId) {
		this.startUserId = startUserId;
	}
	public String getBusinessMainKey() {
		return businessMainKey;
	}
	public void setBusinessMainKey(String businessMainKey) {
		this.businessMainKey = businessMainKey;
	}
	public Long getStartTaskId() {
		return startTaskId;
	}
	public void setStartTaskId(Long startTaskId) {
		this.startTaskId = startTaskId;
	}
	public Long getEndTaskId() {
		return endTaskId;
	}
	public void setEndTaskId(Long endTaskId) {
		this.endTaskId = endTaskId;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getProcessStatus() {
		return processStatus;
	}
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	public String getIsSubProcess() {
		return isSubProcess;
	}
	public void setIsSubProcess(String isSubProcess) {
		this.isSubProcess = isSubProcess;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getCancel() {
		return cancel;
	}
	public void setCancel(String cancel) {
		this.cancel = cancel;
	}
}
