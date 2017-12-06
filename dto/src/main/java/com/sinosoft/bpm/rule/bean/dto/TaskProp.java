package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * User: jason
 * Date: 14-4-21
 * Time: 下午3:47
 */
public class TaskProp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**任务类型*/
	private String taskType;
	/**节点类型*/
	private String nodeType;
	/**指定处理人*/
	private String userCode;
	/**理赔业务处理机构*/
	private String claimComCode;
	/**业务标识号*/
	private String businessKey;
	/**主业务号 */
	private String businessMainKey;
	/**是否自动完成 */
	private String isAutoComplete;
	/**技能组分类代码 */
	private String groupsDetailId;
	/**任务分类 */
	private	String taskCatalog;
	/**车辆标的ID */
	private String carItemsId; 
	/**财产标的ID */
	private String propItemsId ; 
	/**人员标的ID */
	private String personItemsId ;
	/**是否产生新流程 */
	private String createNewProcess = "N";
	/**流程名称 */
	private String processName;
	/**是否是独立流程 */
	private String isStandProcess = "N";
	/**最低审核级别 */
	private String powerLevel ;
	/**是否超权限 */
	private String overPower;
	/**描述信息*/
	private String description = "";
	
	public String getPowerLevel() {
		return powerLevel;
	}
	public void setPowerLevel(String powerLevel) {
		this.powerLevel = powerLevel;
	}
	public String getTaskCatalog() {
		return taskCatalog;
	}
	public void setTaskCatalog(String taskCatalog) {
		this.taskCatalog = taskCatalog;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getCarItemsId() {
		return carItemsId;
	}
	public void setCarItemsId(String carItemsId) {
		this.carItemsId = carItemsId;
	}
	public String getPropItemsId() {
		return propItemsId;
	}
	public void setPropItemsId(String propItemsId) {
		this.propItemsId = propItemsId;
	}
	public String getPersonItemsId() {
		return personItemsId;
	}
	public void setPersonItemsId(String personItemsId) {
		this.personItemsId = personItemsId;
	}
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}
	public String getNodeType() {
		return nodeType;
	}
	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	
	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getBusinessMainKey() {
		return businessMainKey;
	}

	public void setBusinessMainKey(String businessMainKey) {
		this.businessMainKey = businessMainKey;
	}

	public String getGroupsDetailId() {
		return groupsDetailId;
	}

	public void setGroupsDetailId(String groupsDetailId) {
		this.groupsDetailId = groupsDetailId;
	}
	public String getIsAutoComplete() {
		return isAutoComplete;
	}
	public void setIsAutoComplete(String isAutoComplete) {
		this.isAutoComplete = isAutoComplete;
	}
	
	public String getCreateNewProcess() {
		return createNewProcess;
	}
	public void setCreateNewProcess(String createNewProcess) {
		this.createNewProcess = createNewProcess;
	}
	public String getIsStandProcess() {
		return isStandProcess;
	}
	public void setIsStandProcess(String isStandProcess) {
		this.isStandProcess = isStandProcess;
	}
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	public String getClaimComCode() {
		return claimComCode;
	}
	public void setClaimComCode(String claimComCode) {
		this.claimComCode = claimComCode;
	}
	public String getOverPower() {
		return overPower;
	}
	public void setOverPower(String overPower) {
		this.overPower = overPower;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
