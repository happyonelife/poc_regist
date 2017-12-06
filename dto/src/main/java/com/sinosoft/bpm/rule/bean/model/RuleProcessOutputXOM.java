package com.sinosoft.bpm.rule.bean.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.sinosoft.bpm.rule.bean.dto.Group;
import com.sinosoft.bpm.rule.bean.dto.RuleRiskInfo;
import com.sinosoft.bpm.rule.bean.dto.TaskCatalog;
import com.sinosoft.bpm.rule.bean.dto.TaskProp;
import com.sinosoft.bpm.rule.bean.dto.TaskType;

/**
 * 规则引擎返回结果对象
 * @author chao
 *
 */
public class RuleProcessOutputXOM  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**新增任务任务列表*/
	private List<TaskProp> taskList = new ArrayList<TaskProp>(0);
	/**同步技能组*/
	private List<TaskCatalog> taskCatalogList = new ArrayList<TaskCatalog>(0);
	/**总公司技能组分类*/
	private String groupsDetailId ;
	/**总公司人员技能组分类*/
	private List<String> groupsDetailcode = new ArrayList<String>(0);
	/**提交路径*/
	private List<String> subMit = new ArrayList<String>(0);
	/**是否简易案件*/
	private	String	isCaseType="N";
	/**状态标志*/
	private String state="01";  
	/**任务获取方式*/
	private String accessway; 
	/**提示信息*/
	private String reason="";
	/**是否结束流程*/
	private String isEndProcess;
	/**是否分支聚合*/
	private String isForkEnd;
	/**是否审核通过*/
	private String isAuditPass;
	/**是否自动理算*/
	private String isAutoCompensate="N";
	/** 风险信息*/
	/**是否具有通赔定核损金额权限*/
	private String isHasAnyPaySubmitPermission = "N";
	private List<RuleRiskInfo> ruleRiskInfoLists = new ArrayList<RuleRiskInfo>();  
	
	public List<RuleRiskInfo> getRuleRiskInfoLists() {
		return ruleRiskInfoLists;
	}
	public void setRuleRiskInfoLists(List<RuleRiskInfo> ruleRiskInfoLists) {
		this.ruleRiskInfoLists = ruleRiskInfoLists;
	}
	public String getIsAutoCompensate() {
		return isAutoCompensate;
	}
	public void setIsAutoCompensate(String isAutoCompensate) {
		this.isAutoCompensate = isAutoCompensate;
	}
	public String getIsAuditPass() {
		return isAuditPass;
	}
	public void setIsAuditPass(String isAuditPass) {
		this.isAuditPass = isAuditPass;
	}
	public String getIsEndProcess() {
		return isEndProcess;
	}
	public void setIsEndProcess(String isEndProcess) {
		this.isEndProcess = isEndProcess;
	}
	public List<String> getSubMit() {
		return subMit;
	}
	public void setSubMit(List<String> subMit) {
		this.subMit = subMit;
	}
	public List<String> getGroupsDetailcode() {
		return groupsDetailcode;
	}
	public void setGroupsDetailcode(List<String> groupsDetailcode) {
		this.groupsDetailcode = groupsDetailcode;
	}
	public String getGroupsDetailId() {
		return groupsDetailId;
	}
	public void setGroupsDetailId(String groupsDetailId) {
		this.groupsDetailId = groupsDetailId;
	}
	public String getAccessway() {
		return accessway;
	}
	public void setAccessway(String accessway) {
		this.accessway = accessway;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public List<TaskProp> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<TaskProp> taskList) {
		this.taskList = taskList;
	}
	
	public String getIsCaseType() {
		return isCaseType;
	}
	public void setIsCaseType(String isCaseType) {
		this.isCaseType = isCaseType;
	}
	public String getIsForkEnd() {
		return isForkEnd;
	}
	public void setIsForkEnd(String isForkEnd) {
		this.isForkEnd = isForkEnd;
	}
	public List<TaskCatalog> getTaskCatalogList() {
		return taskCatalogList;
	}
	public void setTaskCatalogList(List<TaskCatalog> taskCatalogList) {
		this.taskCatalogList = taskCatalogList;
	}
	/**
	 * 新增任务方法
	 * 
	 */
	public  void setTaskList(String taskType,String claimComCode,String groupsDetailId,String userCode,String nodeType,String businessMainKey,String businessKey,String isAutoComplete,String carItemsId,String propItemsId,String personItemsId,String taskCatalog){
		TaskProp taskTmp = new TaskProp();
		taskTmp.setTaskType(taskType);
		taskTmp.setClaimComCode(claimComCode);
		taskTmp.setGroupsDetailId(groupsDetailId);
		taskTmp.setUserCode(userCode);
		taskTmp.setNodeType(nodeType);
		taskTmp.setBusinessMainKey(businessMainKey);
		taskTmp.setBusinessKey(businessKey);
		taskTmp.setIsAutoComplete(isAutoComplete);
		taskTmp.setCarItemsId(carItemsId);
		taskTmp.setPropItemsId(propItemsId);
		taskTmp.setPersonItemsId(personItemsId);
		taskTmp.setTaskCatalog(taskCatalog);
		taskTmp.setCreateNewProcess("N");
		taskTmp.setIsStandProcess("N");
		taskList.add(taskTmp);
	}
	/**
	 * 批量新增任务方法
	 * 
	 */
	public  void setTaskBat(int taskNum,String taskType,String claimComCode,String groupsDetailId,String userCode,String nodeType,String businessMainKey,String businessKey,String isAutoComplete,String carItemsId,String propItemsId,String personItemsId,String taskCatalog){
		for(int i =0;i<taskNum;i++){
			TaskProp taskTmp = new TaskProp();
			taskTmp.setTaskType(taskType);
			taskTmp.setClaimComCode(claimComCode);
			taskTmp.setGroupsDetailId(groupsDetailId);
			taskTmp.setUserCode(userCode);
			taskTmp.setNodeType(nodeType);
			taskTmp.setBusinessMainKey(businessMainKey);
			taskTmp.setBusinessKey(businessKey);
			taskTmp.setIsAutoComplete(isAutoComplete);
			taskTmp.setCarItemsId(carItemsId);
			taskTmp.setPropItemsId(propItemsId);
			taskTmp.setPersonItemsId(personItemsId);
			taskTmp.setTaskCatalog(taskCatalog);
			taskTmp.setCreateNewProcess("N");
			taskTmp.setIsStandProcess("N");
			taskList.add(taskTmp);
			
		}
	}
	/**
	 * 新增子流程方法
	 * 
	 */
	public  void setProces(String processName,String businessMainKey,String taskType,String claimComCode,String groupsDetailId,String userCode,String nodeType,String businessKey,String isAutoComplete,String carItemsId,String propItemsId,String personItemsId,String taskCatalog){
		TaskProp taskTmp = new TaskProp();
		taskTmp.setBusinessMainKey(businessMainKey);
		taskTmp.setProcessName(processName);
		taskTmp.setTaskType(taskType);
		taskTmp.setClaimComCode(claimComCode);
		taskTmp.setGroupsDetailId(groupsDetailId);
		taskTmp.setUserCode(userCode);
		taskTmp.setNodeType(nodeType);
		taskTmp.setBusinessKey(businessKey);
		taskTmp.setIsAutoComplete(isAutoComplete);
		taskTmp.setCarItemsId(carItemsId);
		taskTmp.setPropItemsId(propItemsId);
		taskTmp.setPersonItemsId(personItemsId);
		taskTmp.setTaskCatalog(taskCatalog);
		taskTmp.setCreateNewProcess("Y");
		taskTmp.setIsStandProcess("N");
		taskList.add(taskTmp);
	}
	
	/**
	 * 新增独立流程方法
	 * @param processName
	 * @param businessMainKey
	 * @param taskType
	 * @param userCode
	 * @param nodeType
	 * @param businessKey
	 * @param isAutoComplete
	 * @param carItemsId
	 * @param propItemsId
	 * @param personItemsId
	 * @param taskCatalog
	 */
	public  void setStandProces(String processName,String businessMainKey,String taskType,String taskCatalog,String claimComCode,String userCode,String nodeType,String businessKey,String isAutoComplete,String carItemsId,String propItemsId,String personItemsId){
		TaskProp task =  new TaskProp();
		task.setProcessName(processName);
		task.setBusinessMainKey(businessMainKey);
		task.setTaskType(taskType);
		task.setTaskCatalog(taskCatalog);
		task.setClaimComCode(claimComCode);
		task.setUserCode(userCode);
		task.setNodeType(nodeType);
		task.setBusinessKey(businessKey);
		task.setCarItemsId(carItemsId);
		task.setPropItemsId(propItemsId);
		task.setPersonItemsId(personItemsId);
		task.setIsAutoComplete(isAutoComplete);
		task.setCreateNewProcess("Y");
		task.setIsStandProcess("Y");
		taskList.add(task);
	}
	
	
	
	/**
	 * 新增独立流程方法用于风险审核
	 * @param processName
	 * @param businessMainKey
	 * @param taskType
	 * @param userCode
	 * @param nodeType
	 * @param businessKey
	 * @param isAutoComplete
	 * @param carItemsId
	 * @param propItemsId
	 * @param personItemsId
	 * @param taskCatalog
	 * @param description
	 */
	public  void setStandProcesWithDescription(String processName,String businessMainKey,String taskType,String taskCatalog,String claimComCode,String userCode,String nodeType,String businessKey,String isAutoComplete,String carItemsId,String propItemsId,String personItemsId,String description){
		TaskProp task =  new TaskProp();
		task.setProcessName(processName);
		task.setBusinessMainKey(businessMainKey);
		task.setTaskType(taskType);
		task.setTaskCatalog(taskCatalog);
		task.setClaimComCode(claimComCode);
		task.setUserCode(userCode);
		task.setNodeType(nodeType);
		task.setBusinessKey(businessKey);
		task.setCarItemsId(carItemsId);
		task.setPropItemsId(propItemsId);
		task.setPersonItemsId(personItemsId);
		task.setIsAutoComplete(isAutoComplete);
		task.setCreateNewProcess("Y");
		task.setIsStandProcess("Y");
		task.setDescription(description);
		taskList.add(task);
	}
	/**
	 * 新增子流程方法(含最低审核级别)
	 * @param processName
	 * @param businessMainKey
	 * @param taskType
	 * @param userCode
	 * @param nodeType
	 * @param businessKey
	 * @param isAutoComplete
	 * @param carItemsId
	 * @param propItemsId
	 * @param personItemsId
	 * @param taskCatalog
	 */
	public  void setProcesLevel(String processName,String businessMainKey,String taskType,String claimComCode,String userCode,String nodeType,String businessKey,String isAutoComplete,String carItemsId,String propItemsId,String personItemsId,String taskCatalog,String powerLevel){
		TaskProp taskTmp = new TaskProp();
		taskTmp.setProcessName(processName);
		taskTmp.setBusinessMainKey(businessMainKey);
		taskTmp.setTaskType(taskType);
		taskTmp.setClaimComCode(claimComCode);
		taskTmp.setUserCode(userCode);
		taskTmp.setNodeType(nodeType);
		taskTmp.setBusinessKey(businessKey);
		taskTmp.setIsAutoComplete(isAutoComplete);
		taskTmp.setCarItemsId(carItemsId);
		taskTmp.setPropItemsId(propItemsId);
		taskTmp.setPersonItemsId(personItemsId);
		taskTmp.setTaskCatalog(taskCatalog);
		taskTmp.setPowerLevel(powerLevel);
		taskTmp.setCreateNewProcess("Y");
		taskTmp.setIsStandProcess("N");
		taskList.add(taskTmp);
	}

	/**
	 * 新增子流程方法(是否超权限)
	 * @param processName
	 * @param businessMainKey
	 * @param taskType
	 * @param claimComCode
	 * @param userCode
	 * @param nodeType
	 * @param businessKey
	 * @param isAutoComplete
	 * @param carItemsId
	 * @param propItemsId
	 * @param personItemsId
	 * @param taskCatalog
	 * @param powerLevel
	 */
	public  void addSubProcess(String processName,String businessMainKey,String taskType,String claimComCode,String userCode,String nodeType,String businessKey,String isAutoComplete,String carItemsId,String propItemsId,String personItemsId,String taskCatalog,String powerLevel,boolean inPower){
		TaskProp taskTmp = new TaskProp();
		taskTmp.setProcessName(processName);
		taskTmp.setBusinessMainKey(businessMainKey);
		taskTmp.setTaskType(taskType);
		taskTmp.setClaimComCode(claimComCode);
		taskTmp.setUserCode(userCode);
		taskTmp.setNodeType(nodeType);
		taskTmp.setBusinessKey(businessKey);
		taskTmp.setIsAutoComplete(isAutoComplete);
		taskTmp.setCarItemsId(carItemsId);
		taskTmp.setPropItemsId(propItemsId);
		taskTmp.setPersonItemsId(personItemsId);
		taskTmp.setTaskCatalog(taskCatalog);
		taskTmp.setPowerLevel(powerLevel);
		taskTmp.setCreateNewProcess("Y");
		taskTmp.setIsStandProcess("N");
		if(inPower){
			taskTmp.setOverPower("N");
		}else{
			taskTmp.setOverPower("Y");
		}
		taskList.add(taskTmp);
	}
	/**
	 * 新增任务方法(含是否超权限)
	 * 
	 */
	public  void addTask(String taskType,String claimComCode,String groupsDetailId,String userCode,String nodeType,String businessMainKey,String businessKey,String isAutoComplete,String carItemsId,String propItemsId,String personItemsId,String taskCatalog,boolean inPower){
		TaskProp taskTmp = new TaskProp();
		taskTmp.setTaskType(taskType);
		taskTmp.setClaimComCode(claimComCode);
		taskTmp.setGroupsDetailId(groupsDetailId);
		taskTmp.setUserCode(userCode);
		taskTmp.setNodeType(nodeType);
		taskTmp.setBusinessMainKey(businessMainKey);
		taskTmp.setBusinessKey(businessKey);
		taskTmp.setIsAutoComplete(isAutoComplete);
		taskTmp.setCarItemsId(carItemsId);
		taskTmp.setPropItemsId(propItemsId);
		taskTmp.setPersonItemsId(personItemsId);
		taskTmp.setTaskCatalog(taskCatalog);
		taskTmp.setCreateNewProcess("N");
		taskTmp.setIsStandProcess("N");
		if(inPower){
			taskTmp.setOverPower("N");
		}else{
			taskTmp.setOverPower("Y");
		}
		
		taskList.add(taskTmp);
	}
	
	/**
	 * 返回是否自动完成标志
	 * 
	 */
	public  String setAutoComplete(String isAutoComplete){
		return isAutoComplete;
	}
	/**
	 * 技能组同步方法（可配置）
	 */
	public  void setTaskCatalog(String taskCatalog,String taskCatalogName,String taskType,String taskName,String  groupCode,String  groupName){
		this.setTaskCatalogCore(taskCatalog, taskCatalogName, taskType, taskName, groupCode, groupName, "1");
	}
	/**
	 * 技能组同步方法（默认）
	 */
	public  void setTaskCatalogDefault(String taskCatalog,String taskCatalogName,String taskType,String taskName,String  groupCode,String  groupName){
		this.setTaskCatalogCore(taskCatalog, taskCatalogName, taskType, taskName, groupCode, groupName, "0");
	}
	/**
	 * 技能组同步实现方法
	
	 */
	private  void setTaskCatalogCore(String taskCatalog,String taskCatalogName,String taskType,String taskName,String  groupCode,String  groupName,String flag){
		if(null == taskCatalogList){
			taskCatalogList = new ArrayList<TaskCatalog>();
		}
		
		if(taskCatalogList.size() > 0){
			boolean flag1 = false;//flag为true任务分类存在，false任务分类为不存在；
			TaskCatalog taskCatalog1 = null;
			for(int i = 0 ;i<taskCatalogList.size();i++){
				taskCatalog1 = taskCatalogList.get(i);
				if(null !=  taskCatalog1 && taskCatalog1.getTaskCatalog().equals(taskCatalog)){
					flag1 = true;
					break;
				}
			}
			if(!flag1){
				TaskCatalog taskCatalog2 = new TaskCatalog();
				taskCatalog2.setTaskCatalog(taskCatalog);
				taskCatalog2.setTaskCatalogName(taskCatalogName);
				TaskType taskType2 = new TaskType();
				taskType2.setTaskType(taskType);
				taskType2.setTaskName(taskName);
				taskCatalog2.getTaskTypeList().add(taskType2);
				Group group = new Group();
				group.setGroupCode(groupCode);
				group.setGroupName(groupName);
				group.setFlag(flag);
				taskType2.getGroupList().add(group);
				this.taskCatalogList.add(taskCatalog2);
			}else{
				if(taskCatalog1.getTaskTypeList().size()>0){
					TaskType taskTypeObj = null;
					boolean flag2 = false;
						for(int j = 0;j<taskCatalog1.getTaskTypeList().size();j++){
						taskTypeObj = taskCatalog1.getTaskTypeList().get(j);
						if(taskTypeObj!=null&&taskTypeObj.getTaskType().equals(taskType)){
							flag2 = true;
							break;
						}
					}
					if(!flag2){
						TaskType taskType3 = new TaskType();
						taskType3.setTaskType(taskType);
						taskType3.setTaskName(taskName);
						Group group = new Group();
						group.setGroupCode(groupCode);
						group.setGroupName(groupName);
						group.setFlag(flag);
						taskType3.getGroupList().add(group);
						taskCatalog1.getTaskTypeList().add(taskType3);
					}else{
						if(taskTypeObj.getGroupList().size()>0){
							Group group = null;
							boolean flag3 = false;
							for(int k=0;k<taskTypeObj.getGroupList().size();k++){
								group = taskTypeObj.getGroupList().get(k);
								if(group!=null&&groupCode.equals(group.getGroupCode())){
									flag3 = true;
									break;
								}
							}
							if(!flag3){
								Group groupSave = new Group();
								groupSave.setGroupCode(groupCode);
								groupSave.setGroupName(groupName);
								groupSave.setFlag(flag);
								taskTypeObj.getGroupList().add(groupSave);
							}
						}
					}
				}else{
					TaskType taskType3 = new TaskType();
					taskType3.setTaskType(taskType);
					taskType3.setTaskName(taskName);
					Group group = new Group();
					group.setGroupCode(groupCode);
					group.setGroupName(groupName);
					group.setFlag(flag);
					taskType3.getGroupList().add(group);
					taskCatalog1.getTaskTypeList().add(taskType3);
				}
			
			}
		}else{
			TaskCatalog taskCatalog2 = new TaskCatalog();
			taskCatalog2.setTaskCatalog(taskCatalog);
			taskCatalog2.setTaskCatalogName(taskCatalogName);
			TaskType taskType2 = new TaskType();
			taskType2.setTaskType(taskType);
			taskType2.setTaskName(taskName);
			Group group = new Group();
			group.setGroupCode(groupCode);
			group.setGroupName(groupName);
			group.setFlag(flag);
			taskType2.getGroupList().add(group);
			taskCatalog2.getTaskTypeList().add(taskType2);
			this.taskCatalogList.add(taskCatalog2);
		}
	}
	/**
	 * 指定处理人方法
	 * 
	 */
	public  void setInbox(String userCode){
		for(TaskProp taskProp : this.taskList){
			
				taskProp.setUserCode(userCode);
			}
	}
	/**
	 * 设置返回信息
	 * @param reason
	 */
	public void SetReason(String reason){
		if(null == reason || "".equals(reason.trim()))return;
		if(null == this.reason || "".equals(reason)){
			this.reason = reason;
		}else{
			this.reason += "|"+reason;
		}
	}
	public String getIsHasAnyPaySubmitPermission() {
		return isHasAnyPaySubmitPermission;
	}
	public void setIsHasAnyPaySubmitPermission(String isHasAnyPaySubmitPermission) {
		this.isHasAnyPaySubmitPermission = isHasAnyPaySubmitPermission;
	}
	
	
}
