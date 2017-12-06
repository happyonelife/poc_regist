
package com.sinosoft.bpm.def;

import java.util.Date;

import com.sinosoft.bpm.def.cfg.TaskDef;
import com.sinosoft.bpm.def.type.BpmConStant;
import com.sinosoft.bpm.def.type.BpmConStant.TaskStatus;



public class Task{

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskCode() {
		return taskCode;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getTaskCatalog() {
		return taskCatalog;
	}

	public void setTaskCatalog(String taskCatalog) {
		this.taskCatalog = taskCatalog;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getRemarkTime() {
		return remarkTime;
	}

	public void setRemarkTime(Date remarkTime) {
		this.remarkTime = remarkTime;
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

	public String getEndUser() {
		return endUser;
	}

	public void setEndUser(String endUser) {
		this.endUser = endUser;
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getAssignTime() {
		return assignTime;
	}

	public void setAssignTime(Date assignTime) {
		this.assignTime = assignTime;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getBack() {
		return back;
	}

	public void setBack(String back) {
		this.back = back;
	}

	public String getStartBack() {
		return startBack;
	}

	public void setStartBack(String startBack) {
		this.startBack = startBack;
	}

	public String getAutoend() {
		return autoend;
	}

	public void setAutoend(String autoend) {
		this.autoend = autoend;
	}

	public String getCancel() {
		return cancel;
	}

	public void setCancel(String cancel) {
		this.cancel = cancel;
	}

	public String getNodeType() {
		return nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public Long getProcessId() {
		return processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getPrevTaskId() {
		return prevTaskId;
	}

	public void setPrevTaskId(Long prevTaskId) {
		this.prevTaskId = prevTaskId;
	}

	public String getCompleteAction() {
		return completeAction;
	}

	public void setCompleteAction(String completeAction) {
		this.completeAction = completeAction;
	}

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getTimeoutAction() {
		return timeoutAction;
	}

	public void setTimeoutAction(String timeoutAction) {
		this.timeoutAction = timeoutAction;
	}

	public Date getExecTime() {
		return execTime;
	}

	public void setExecTime(Date execTime) {
		this.execTime = execTime;
	}

	public Integer getRepeatCount() {
		return repeatCount;
	}

	public void setRepeatCount(Integer repeatCount) {
		this.repeatCount = repeatCount;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getReassignFlag() {
		return reassignFlag;
	}

	public void setReassignFlag(String reassignFlag) {
		this.reassignFlag = reassignFlag;
	}

	public String getTaskAction() {
		return taskAction;
	}

	public void setTaskAction(String taskAction) {
		this.taskAction = taskAction;
	}

	public String getSignResult() {
		return signResult;
	}

	public void setSignResult(String signResult) {
		this.signResult = signResult;
	}

	public String getSignResultType() {
		return signResultType;
	}

	public void setSignResultType(String signResultType) {
		this.signResultType = signResultType;
	}

	public Integer getSignCompleteNum() {
		return signCompleteNum;
	}

	public void setSignCompleteNum(Integer signCompleteNum) {
		this.signCompleteNum = signCompleteNum;
	}

	public String getLockOwner() {
		return lockOwner;
	}

	public void setLockOwner(String lockOwner) {
		this.lockOwner = lockOwner;
	}

	public Date getLockTime() {
		return lockTime;
	}

	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}

	public Date getProcessCreateTime() {
		return processCreateTime;
	}

	public void setProcessCreateTime(Date processCreateTime) {
		this.processCreateTime = processCreateTime;
	}

	public Integer getAuthLevel() {
		return authLevel;
	}

	public void setAuthLevel(Integer authLevel) {
		this.authLevel = authLevel;
	}

	public String getInBox() {
		return inBox;
	}

	public void setInBox(String inBox) {
		this.inBox = inBox;
	}

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public int getSign() {
		return sign;
	}

	public void setSign(int sign) {
		this.sign = sign;
	}

	public String getBusinessMainKey() {
		return businessMainKey;
	}

	public void setBusinessMainKey(String businessMainKey) {
		this.businessMainKey = businessMainKey;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getTrackId() {
		return trackId;
	}

	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}

	public String getBusinessStatus() {
		return businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getAnyPayFlag() {
		return anyPayFlag;
	}

	public void setAnyPayFlag(String anyPayFlag) {
		this.anyPayFlag = anyPayFlag;
	}

	public String getTaskCarItems() {
		return taskCarItems;
	}

	public void setTaskCarItems(String taskCarItems) {
		this.taskCarItems = taskCarItems;
	}

	public String getTaskPropItems() {
		return taskPropItems;
	}

	public void setTaskPropItems(String taskPropItems) {
		this.taskPropItems = taskPropItems;
	}

	public String getTaskPersonItems() {
		return taskPersonItems;
	}

	public void setTaskPersonItems(String taskPersonItems) {
		this.taskPersonItems = taskPersonItems;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getRegistNo() {
		return registNo;
	}

	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getAccidentNo() {
		return accidentNo;
	}

	public void setAccidentNo(String accidentNo) {
		this.accidentNo = accidentNo;
	}

	public Integer getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(Integer customerNo) {
		this.customerNo = customerNo;
	}

	public String getClaimCom() {
		return claimCom;
	}

	public void setClaimCom(String claimCom) {
		this.claimCom = claimCom;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public Date getDamageStartTime() {
		return damageStartTime;
	}

	public void setDamageStartTime(Date damageStartTime) {
		this.damageStartTime = damageStartTime;
	}

	public Date getDamageEndTime() {
		return damageEndTime;
	}

	public void setDamageEndTime(Date damageEndTime) {
		this.damageEndTime = damageEndTime;
	}

	public String getCaseType() {
		return caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public String getAccidentType() {
		return accidentType;
	}

	public void setAccidentType(String accidentType) {
		this.accidentType = accidentType;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getIsAnyPay() {
		return isAnyPay;
	}

	public void setIsAnyPay(String isAnyPay) {
		this.isAnyPay = isAnyPay;
	}

	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCustomerLevel() {
		return customerLevel;
	}

	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}

	public String getOverPower() {
		return overPower;
	}

	public void setOverPower(String overPower) {
		this.overPower = overPower;
	}

	public String getVfield1() {
		return vfield1;
	}

	public void setVfield1(String vfield1) {
		this.vfield1 = vfield1;
	}

	public String getVfield2() {
		return vfield2;
	}

	public void setVfield2(String vfield2) {
		this.vfield2 = vfield2;
	}

	public String getVfield3() {
		return vfield3;
	}

	public void setVfield3(String vfield3) {
		this.vfield3 = vfield3;
	}

	public String getVfield4() {
		return vfield4;
	}

	public void setVfield4(String vfield4) {
		this.vfield4 = vfield4;
	}

	public String getVfield5() {
		return vfield5;
	}

	public void setVfield5(String vfield5) {
		this.vfield5 = vfield5;
	}

	public String getVfield6() {
		return vfield6;
	}

	public void setVfield6(String vfield6) {
		this.vfield6 = vfield6;
	}

	public String getVfield7() {
		return vfield7;
	}

	public void setVfield7(String vfield7) {
		this.vfield7 = vfield7;
	}

	public String getVfield8() {
		return vfield8;
	}

	public void setVfield8(String vfield8) {
		this.vfield8 = vfield8;
	}

	public String getVfield9() {
		return vfield9;
	}

	public void setVfield9(String vfield9) {
		this.vfield9 = vfield9;
	}

	public String getVfield10() {
		return vfield10;
	}

	public void setVfield10(String vfield10) {
		this.vfield10 = vfield10;
	}

	public String getVfield11() {
		return vfield11;
	}

	public void setVfield11(String vfield11) {
		this.vfield11 = vfield11;
	}

	public String getVfield12() {
		return vfield12;
	}

	public void setVfield12(String vfield12) {
		this.vfield12 = vfield12;
	}

	public String getVfield13() {
		return vfield13;
	}

	public void setVfield13(String vfield13) {
		this.vfield13 = vfield13;
	}

	public String getVfield14() {
		return vfield14;
	}

	public void setVfield14(String vfield14) {
		this.vfield14 = vfield14;
	}

	public String getVfield15() {
		return vfield15;
	}

	public void setVfield15(String vfield15) {
		this.vfield15 = vfield15;
	}

	public String getVfield16() {
		return vfield16;
	}

	public void setVfield16(String vfield16) {
		this.vfield16 = vfield16;
	}

	public String getVfield17() {
		return vfield17;
	}

	public void setVfield17(String vfield17) {
		this.vfield17 = vfield17;
	}

	public String getVfield18() {
		return vfield18;
	}

	public void setVfield18(String vfield18) {
		this.vfield18 = vfield18;
	}

	public String getVfield19() {
		return vfield19;
	}

	public void setVfield19(String vfield19) {
		this.vfield19 = vfield19;
	}

	public String getVfield20() {
		return vfield20;
	}

	public void setVfield20(String vfield20) {
		this.vfield20 = vfield20;
	}

	public String getVfield21() {
		return vfield21;
	}

	public void setVfield21(String vfield21) {
		this.vfield21 = vfield21;
	}

	public String getVfield22() {
		return vfield22;
	}

	public void setVfield22(String vfield22) {
		this.vfield22 = vfield22;
	}

	public String getVfield23() {
		return vfield23;
	}

	public void setVfield23(String vfield23) {
		this.vfield23 = vfield23;
	}

	public String getVfield24() {
		return vfield24;
	}

	public void setVfield24(String vfield24) {
		this.vfield24 = vfield24;
	}

	public String getVfield25() {
		return vfield25;
	}

	public void setVfield25(String vfield25) {
		this.vfield25 = vfield25;
	}

	public String getVfield26() {
		return vfield26;
	}

	public void setVfield26(String vfield26) {
		this.vfield26 = vfield26;
	}

	public String getVfield27() {
		return vfield27;
	}

	public void setVfield27(String vfield27) {
		this.vfield27 = vfield27;
	}

	public String getVfield28() {
		return vfield28;
	}

	public void setVfield28(String vfield28) {
		this.vfield28 = vfield28;
	}

	public String getVfield29() {
		return vfield29;
	}

	public void setVfield29(String vfield29) {
		this.vfield29 = vfield29;
	}

	public String getVfield30() {
		return vfield30;
	}

	public void setVfield30(String vfield30) {
		this.vfield30 = vfield30;
	}

	public String getVfield31() {
		return vfield31;
	}

	public void setVfield31(String vfield31) {
		this.vfield31 = vfield31;
	}

	public String getVfield32() {
		return vfield32;
	}

	public void setVfield32(String vfield32) {
		this.vfield32 = vfield32;
	}

	public String getVfield33() {
		return vfield33;
	}

	public void setVfield33(String vfield33) {
		this.vfield33 = vfield33;
	}

	public String getVfield34() {
		return vfield34;
	}

	public void setVfield34(String vfield34) {
		this.vfield34 = vfield34;
	}

	public String getVfield35() {
		return vfield35;
	}

	public void setVfield35(String vfield35) {
		this.vfield35 = vfield35;
	}

	public String getVfield36() {
		return vfield36;
	}

	public void setVfield36(String vfield36) {
		this.vfield36 = vfield36;
	}

	public String getVfield37() {
		return vfield37;
	}

	public void setVfield37(String vfield37) {
		this.vfield37 = vfield37;
	}

	public String getVfield38() {
		return vfield38;
	}

	public void setVfield38(String vfield38) {
		this.vfield38 = vfield38;
	}

	public String getVfield39() {
		return vfield39;
	}

	public void setVfield39(String vfield39) {
		this.vfield39 = vfield39;
	}

	public String getVfield40() {
		return vfield40;
	}

	public void setVfield40(String vfield40) {
		this.vfield40 = vfield40;
	}

	public Date getDfield1() {
		return dfield1;
	}

	public void setDfield1(Date dfield1) {
		this.dfield1 = dfield1;
	}

	public Date getDfield2() {
		return dfield2;
	}

	public void setDfield2(Date dfield2) {
		this.dfield2 = dfield2;
	}

	public Date getDfield3() {
		return dfield3;
	}

	public void setDfield3(Date dfield3) {
		this.dfield3 = dfield3;
	}

	public Date getDfield4() {
		return dfield4;
	}

	public void setDfield4(Date dfield4) {
		this.dfield4 = dfield4;
	}

	public Date getDfield5() {
		return dfield5;
	}

	public void setDfield5(Date dfield5) {
		this.dfield5 = dfield5;
	}

	public Date getDfield6() {
		return dfield6;
	}

	public void setDfield6(Date dfield6) {
		this.dfield6 = dfield6;
	}

	public Date getDfield7() {
		return dfield7;
	}

	public void setDfield7(Date dfield7) {
		this.dfield7 = dfield7;
	}

	public Date getDfield8() {
		return dfield8;
	}

	public void setDfield8(Date dfield8) {
		this.dfield8 = dfield8;
	}

	public Date getDfield9() {
		return dfield9;
	}

	public void setDfield9(Date dfield9) {
		this.dfield9 = dfield9;
	}

	public Date getDfield10() {
		return dfield10;
	}

	public void setDfield10(Date dfield10) {
		this.dfield10 = dfield10;
	}

	public Double getNfield1() {
		return nfield1;
	}

	public void setNfield1(Double nfield1) {
		this.nfield1 = nfield1;
	}

	public Double getNfield2() {
		return nfield2;
	}

	public void setNfield2(Double nfield2) {
		this.nfield2 = nfield2;
	}

	public Double getNfield3() {
		return nfield3;
	}

	public void setNfield3(Double nfield3) {
		this.nfield3 = nfield3;
	}

	public Double getNfield4() {
		return nfield4;
	}

	public void setNfield4(Double nfield4) {
		this.nfield4 = nfield4;
	}

	public Double getNfield5() {
		return nfield5;
	}

	public void setNfield5(Double nfield5) {
		this.nfield5 = nfield5;
	}

	public Double getNfield6() {
		return nfield6;
	}

	public void setNfield6(Double nfield6) {
		this.nfield6 = nfield6;
	}

	public Double getNfield7() {
		return nfield7;
	}

	public void setNfield7(Double nfield7) {
		this.nfield7 = nfield7;
	}

	public Double getNfield8() {
		return nfield8;
	}

	public void setNfield8(Double nfield8) {
		this.nfield8 = nfield8;
	}

	public Double getNfield9() {
		return nfield9;
	}

	public void setNfield9(Double nfield9) {
		this.nfield9 = nfield9;
	}

	public Double getNfield10() {
		return nfield10;
	}

	public void setNfield10(Double nfield10) {
		this.nfield10 = nfield10;
	}

	public Double getNfield11() {
		return nfield11;
	}

	public void setNfield11(Double nfield11) {
		this.nfield11 = nfield11;
	}

	public Double getNfield12() {
		return nfield12;
	}

	public void setNfield12(Double nfield12) {
		this.nfield12 = nfield12;
	}

	public Double getNfield13() {
		return nfield13;
	}

	public void setNfield13(Double nfield13) {
		this.nfield13 = nfield13;
	}

	public Double getNfield14() {
		return nfield14;
	}

	public void setNfield14(Double nfield14) {
		this.nfield14 = nfield14;
	}

	public Double getNfield15() {
		return nfield15;
	}

	public void setNfield15(Double nfield15) {
		this.nfield15 = nfield15;
	}

	public Date getSuspendTime() {
		return suspendTime;
	}

	public TaskDef getTaskDef() {
		return taskDef;
	}
	/**
	 * 任务id
	 */
	private Long taskId;
	/**
	 * 任务类型
	 */ 
	private String taskType;
	/**
	 * 任务代码--可以删除
	 */
	private String taskCode;
	/**
	 * 任务分类
	 */
	private String taskCatalog;
	/**
	 * 任务拥有者(委托他人处理时记录最初任务归属)
	 */
	private String owner;
	/**
	 * 任务备注
	 */
	private String remark;
	/**
	 * 任务备注时间
	 */
	private Date remarkTime;
	/**
	 * 任务开始时间
	 */
	private Date startTime;
	/**
	 * 任务结束时间
	 */
	private Date endTime;                                    
	/**
	 *最终任务处理人                 
	 */
	private String endUser; 
	/**
	 * 任务操作时间
	 */
	private Date operateTime;
	/**
	 * 任务创建时间
	 */
	private Date createTime;
	/**
	 * 任务认领时间
	 */
	private Date assignTime;
	/**
	 * 任务超期时间
	 */
	protected Date dueDate;
	/**
	 * 任务状态
	 */
	private String taskStatus;
	/**
	 * 暂停时间--目前不提供暂停功能，字段先预留着
	 */
	private Date suspendTime;
	/**
	 * 紧急程度
	 */
	private Integer priority = TaskDef.PRIORITY_NORMAL;
	/**
	 * 是否被回退的任务
	 */
	private String back = BpmConStant.NO;
	/**
	 * 是否发起回退操作的任务
	 */
	private String startBack = BpmConStant.NO;
	/**
	 * 是否自动结束
	 */
	private String autoend = BpmConStant.NO;
	/**
	 * 是否注销标志位
	 */
	private String cancel = BpmConStant.TASK_NORMAL;
	/**
	 * 任务的结点类型
	 */
	private String nodeType;
	/**
	 * 任务所属流程id
	 */
	protected Long processId;
	/**
	 * 父任务(分支中所有结点的父结点均为分支开始结点)
	 */
	private Long parentId;
	/**
	 * 前一任务(记录该任务是由哪个任务触发创建的)
	 */
	private Long prevTaskId;

	/**
	 * 任务完成处理类--可以删除（放在定义类taskdef）
	 */
	private String completeAction;
	
	/****** 定时任务字段 ********/
	/**
	 * 超时时长(单位：分钟)
	 */
	private String timeout;
	/**
	 * 超时处理类--可以删除
	 */
	private String timeoutAction;
	/**
	 * 执行时间
	 */
	private Date execTime;
	/**
	 * 重复次数
	 */
	private Integer repeatCount;
	/**
	 * 间隔时长(如:5天，2小时，10分)
	 */
	private String duration;
	
	/**
	 * 任务改派移交标志
	 * 1-改派
	 * 2-移交
	 */
	private String reassignFlag;                                         
	/**
	 *任务操作类型--可以删除                       
	 */
	private String taskAction;                                        
	/**
	 *会签任务结果--目前的功能暂不用会签，预留                   
	 */
	private String signResult;                                             
	/**
	 *会签任务结果处理方式 --目前的功能暂不用会签，预留   
	 */
	private String signResultType;                                         
	/**
	 *会签完成需要完成的任务数量 --目前的功能暂不用会签，预留        
	 */
	private Integer signCompleteNum;                                       
	/**
	 *任务锁定人                         
	 */
	private String lockOwner;                                              
	/**
	 *锁定时间                           
	 */
	private Date lockTime;                                                 
	/**
	 *流程创建时间                       
	 */
	private Date processCreateTime;                                        
	/**
	 *代理权限级别--可以删除                       
	 */
	private Integer authLevel;                                             
	/**
	 *个人队列                           
	 */
	private String inBox;                                                  
	/**
	 *公共队列
	 */
	private String queueName;      
	
	/**
	 * 标志
	 */
	private int sign;
	

	/****** 固定业务字段 ********/                                             
	/**
	 *主业务号                       
	 */
	private String businessMainKey;                                        
	/**
	 *代理业务标识号                     
	 */
	private String businessKey;                                 
	/**
	 *业务轨迹表ID                     
	 */
	private String trackId;
	/**
	 *业务状态
	 * 0 未处理;1 正处理;2 完成;3 回退;4 提交通赔; 5 申请改派;6 撒销;7 申请注销
	 */
	private String businessStatus;
	/**
	 *受理标志                           
	 */
	private String acceptFlag;                                           
	/**
	 *通赔调度任务标志
	 */
	private String anyPayFlag = BpmConStant.NO;		                                           
	/**
	 *任务涉及(车)标的集                 
	 */
	private String taskCarItems;                                           
	/**
	 *任务涉及(财)标的集                 
	 */
	private String taskPropItems;                                          
	/**
	 *任务涉及(人)标的集
	 */
	private String taskPersonItems;                                        
	/**
	 *承保业务归属机构                   
	 */
	private String comCode;                                            
	/**
	 *险种代码                               
	 */
	private String riskCode ;                                    
	/**
	 *险类代码                               
	 */
	private String classCode ;
	/**
	 * 
	 *报案号                             
	 */
	private String registNo;
	/**
	 *保单号                             
	 */
	private String policyNo;                                               
	/**
	 *事故号                             
	 */
	private String accidentNo;
	/**
	 *客户号                             
	 */
	private Integer customerNo;                                           
	/**
	 *理赔服务机构                       
	 */
	private String claimCom;                                                                                    
	/**
	 *报案日期                      
	 */
	private Date reportDate;                                               
	/**
	 *出险起始时间                       
	 */
	private Date damageStartTime;                                          
	/**
	 *出险终止时间                       
	 */
	private Date damageEndTime;                                            
	/**
	 *案件类型                           
	 */
	private String caseType;                                               
	/**
	 *事故类型                           
	 */
	private String accidentType;                                           
	/**
	 *事故处理类型                       
	 */
	private String optionType;                                            
	/**
	 *是否重大案件标识                    
	 */
	private String isMajorCase;                                      
	/**
	 *车牌号码                                 
	 */
	private String licenseNo;                                      
	/**
	 *是否通赔案件                               
	 */
	private String isAnyPay = BpmConStant.NO;                                          
	/**
	 *被保险人名称                            
	 */
	private String insuredName;                                   
	/**
	 *项目                                        
	 */
	private String project;                                            
	/**
	 *客户类型                               
	 */
	private String customerType;                                        
	/**
	 *客户等级                              
	 */
	private String customerLevel;
	/**
	 * 是否超权限
	 */
	private String overPower = BpmConStant.NO;

	/*******  预留动态映射字段  **********/
	private String vfield1;
	private String vfield2;
	private String vfield3;
	private String vfield4;
	private String vfield5;
	private String vfield6;
	private String vfield7;
	private String vfield8;
	private String vfield9;
	private String vfield10;
	private String vfield11;
	private String vfield12;
	private String vfield13;
	private String vfield14;
	private String vfield15;
	private String vfield16;
	private String vfield17;
	private String vfield18;
	private String vfield19;
	private String vfield20;
	private String vfield21;
	private String vfield22;
	private String vfield23;
	private String vfield24;
	private String vfield25;
	private String vfield26;
	private String vfield27;
	private String vfield28;
	private String vfield29;
	private String vfield30;
	private String vfield31;
	private String vfield32;
	private String vfield33;
	private String vfield34;
	private String vfield35;
	private String vfield36;
	private String vfield37;
	private String vfield38;
	private String vfield39;
	private String vfield40;
	private Date dfield1;
	private Date dfield2;
	private Date dfield3;
	private Date dfield4;
	private Date dfield5;
	private Date dfield6;
	private Date dfield7;
	private Date dfield8;
	private Date dfield9;
	private Date dfield10;
	private Double nfield1;
	private Double nfield2;
	private Double nfield3;
	private Double nfield4;
	private Double nfield5;
	private Double nfield6;
	private Double nfield7;
	private Double nfield8;
	private Double nfield9;
	private Double nfield10;
	private Double nfield11;
	private Double nfield12;
	private Double nfield13;
	private Double nfield14;
	private Double nfield15;

	/**
	 * 关联的任务定义
	 */
	protected TaskDef taskDef;
	
	public Task() {
	}

	public Task(String taskName) {
		this.taskType = taskName;
	}

	public Task(String taskName, String userId) {
		this.taskType = taskName;
		this.inBox = userId;
	}

	public void setTaskDef(TaskDef taskDef) {
		this.taskDef = taskDef;
	}

	public boolean isSuspended() {
		return TaskStatus.STATUS_SUSPEND.equals(taskStatus);
	}

	public void setSuspended(boolean isSuspended) {
		this.taskStatus = isSuspended?TaskStatus.STATUS_SUSPEND:TaskStatus.STATUS_RUNING;
	}

	public boolean isFinish() {
		return TaskStatus.STATUS_COMPLETE.equals(taskStatus);
	}

	public void finish() {
		this.taskStatus = TaskStatus.STATUS_COMPLETE;
	}
	public boolean hasCancel() {
		if(null == this.cancel){
			return false;
		}else{
			if(BpmConStant.TASK_ALLCANCEL.equals(this.cancel) || BpmConStant.TASK_CANCEL.equals(this.cancel)){
				return true;
			}else{
				return false;
			}
		}
	}
	
	public String getIsMajorCase() {
		return isMajorCase;
	}

	public void setIsMajorCase(String isMajorCase) {
		this.isMajorCase = isMajorCase;
	}

	public Boolean isMajorCase(){
		Boolean result = false;
		if(isMajorCase == null){
			return null;
		}else{
			result = isMajorCase.equals("Y")?true:false;
			return result;
		}
	}

	public void setSuspendTime(Date suspendTime) {
		this.suspendTime = suspendTime;
	}
	public String getAcceptFlag(){
		return this.acceptFlag;
	}
	public void setAcceptFlag(String acceptFlag){
		this.acceptFlag = acceptFlag;
	}
}

