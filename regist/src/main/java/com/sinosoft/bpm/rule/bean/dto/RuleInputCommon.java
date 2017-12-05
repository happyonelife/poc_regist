package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 公共参数信息
 * @author chao
 *
 */
public class RuleInputCommon implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**指定处理人*/
	private String handleCode;
	/**业务归属机构*/
	private String claimComCode;
	/**业务归属机构所属分公司*/
	private String claimBranchCom = "";
	/**业务归属机构所属中支公司*/
	private String claimSubBranchCom = "";
	/**是否回退的任务*/
	private String isBackTask;
	/**审核通过级别*/
	private String powerLevel="1";
	/**业务代码*/
	private String businessCode="1";
	/**是否通赔案件*/
	private String isAnyPayCase="N";
	/**是否自动任务*/
	private String isAutoComplete ; 
	/**是否提交通赔调度*/
	private String isSubmitAnyPay="N" ;
	/**是否通赔调度任务(即：是否通赔）*/
	private String isAnyPayTask="N" ;
	/**是否获取提交路径*/
	private String isGetSubmitPath;
	/**提交意见*/
	private String submitopinions="pass";
	/**目标任务类型*/
	private String targetTaskType;
	/**目标任务分类*/
	private String targetTaskCatalog;
	/**车辆标的ID*/
	private String carItemsId;
	/**财产标的ID*/
	private String propItemsId ;
	/**人员标的ID*/
	private String personItemsId ;
	/**是否合并分支有回退*/
	private String isForkedTaskHasBack;
	/**风险等级*/
	private String riskLevel;
	/**是否自保车*/
	private String isSelfInsuranceCar;
	/**是否重开赔案*/
	private String isReCase;
	/**是否简易案件*/
	private String isSimpleCase;
	/**项目名称*/
	private String projectName;
	/**有监督模型评分*/
	private Double supModelScore=0.0;
	/**无监督模型评分*/
	private Double unSupModelScore=0.0;
	/**承保机构*/
	private String prpallComCode;
	
	public String getPrpallComCode() {
		return prpallComCode;
	}
	public void setPrpallComCode(String prpallComCode) {
		this.prpallComCode = prpallComCode;
	}
	public String getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getIsSelfInsuranceCar() {
		return isSelfInsuranceCar;
	}
	public void setIsSelfInsuranceCar(String isSelfInsuranceCar) {
		this.isSelfInsuranceCar = isSelfInsuranceCar;
	}
	public String getIsReCase() {
		return isReCase;
	}
	public void setIsReCase(String isReCase) {
		this.isReCase = isReCase;
	}
	public String getIsSimpleCase() {
		return isSimpleCase;
	}
	public void setIsSimpleCase(String isSimpleCase) {
		this.isSimpleCase = isSimpleCase;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Double getSupModelScore() {
		return supModelScore;
	}
	public void setSupModelScore(Double supModelScore) {
		this.supModelScore = supModelScore;
	}
	public Double getUnSupModelScore() {
		return unSupModelScore;
	}
	public void setUnSupModelScore(Double unSupModelScore) {
		this.unSupModelScore = unSupModelScore;
	}
	public String getHandleCode() {
		return handleCode;
	}
	public void setHandleCode(String handleCode) {
		this.handleCode = handleCode;
	}
	public String getClaimComCode() {
		return claimComCode;
	}
	public void setClaimComCode(String claimComCode) {
		this.claimComCode = claimComCode;
	}
	public String getClaimBranchCom() {
		return claimBranchCom;
	}
	public void setClaimBranchCom(String claimBranchCom) {
		this.claimBranchCom = claimBranchCom;
	}
	public String getClaimSubBranchCom() {
		return claimSubBranchCom;
	}
	public void setClaimSubBranchCom(String claimSubBranchCom) {
		this.claimSubBranchCom = claimSubBranchCom;
	}
	public String getIsBackTask() {
		return isBackTask;
	}
	public void setIsBackTask(String isBackTask) {
		this.isBackTask = isBackTask;
	}
	public String getPowerLevel() {
		return powerLevel;
	}
	public void setPowerLevel(String powerLevel) {
		this.powerLevel = powerLevel;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public String getIsAnyPayCase() {
		return isAnyPayCase;
	}
	public void setIsAnyPayCase(String isAnyPayCase) {
		this.isAnyPayCase = isAnyPayCase;
	}
	public String getIsAutoComplete() {
		return isAutoComplete;
	}
	public void setIsAutoComplete(String isAutoComplete) {
		this.isAutoComplete = isAutoComplete;
	}
	public String getIsSubmitAnyPay() {
		return isSubmitAnyPay;
	}
	public void setIsSubmitAnyPay(String isSubmitAnyPay) {
		this.isSubmitAnyPay = isSubmitAnyPay;
	}
	public String getIsAnyPayTask() {
		return isAnyPayTask;
	}
	public void setIsAnyPayTask(String isAnyPayTask) {
		this.isAnyPayTask = isAnyPayTask;
	}
	public String getIsGetSubmitPath() {
		return isGetSubmitPath;
	}
	public void setIsGetSubmitPath(String isGetSubmitPath) {
		this.isGetSubmitPath = isGetSubmitPath;
	}
	public String getSubmitopinions() {
		return submitopinions;
	}
	public void setSubmitopinions(String submitopinions) {
		this.submitopinions = submitopinions;
	}
	public String getTargetTaskType() {
		return targetTaskType;
	}
	public void setTargetTaskType(String targetTaskType) {
		this.targetTaskType = targetTaskType;
	}
	public String getTargetTaskCatalog() {
		return targetTaskCatalog;
	}
	public void setTargetTaskCatalog(String targetTaskCatalog) {
		this.targetTaskCatalog = targetTaskCatalog;
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
	public String getIsForkedTaskHasBack() {
		return isForkedTaskHasBack;
	}
	public void setIsForkedTaskHasBack(String isForkedTaskHasBack) {
		this.isForkedTaskHasBack = isForkedTaskHasBack;
	}
	
	
}


