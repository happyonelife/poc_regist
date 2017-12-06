package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


public class RuleBigCase implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//定损环节手动
	private String bigCaseType = "";

	//自动环节
	private Double carPropLossApprovalAmount = 0d;
	private Double personLossApprovalAmount = 0D;
	//11月28日新增
	//人员归属机构等级
	private String bigCaseComLevel = "";
	//大案提交类型1是大案通过0是大案上报 
	private String bigCaseBtnType = "";
	//中支公司审核限额
	private Double centerLimitAmount = 0d;
	//分公司审核限额
	private Double branchLimitAmount = 0d;
	//总公司审核限额
	private Double headLimitAmount = 0d;

	//大案提交类型
	//是否通过机构金额判定
	private String submitPassOfBigCaseFlag ="";
	public String getBigCaseComLevel() {
		return bigCaseComLevel;
	}

	public void setBigCaseComLevel(String bigCaseComLevel) {
		this.bigCaseComLevel = bigCaseComLevel;
	}

	public String getBigCaseBtnType() {
		return bigCaseBtnType;
	}

	public void setBigCaseBtnType(String bigCaseBtnType) {
		this.bigCaseBtnType = bigCaseBtnType;
	}

	public String getSubmitPassOfBigCaseFlag() {
		return submitPassOfBigCaseFlag;
	}

	public void setSubmitPassOfBigCaseFlag(String submitPassOfBigCaseFlag) {
		this.submitPassOfBigCaseFlag = submitPassOfBigCaseFlag;
	}

	public String getBigCaseType() {
		return bigCaseType;
	}

	public void setBigCaseType(String bigCaseType) {
		this.bigCaseType = bigCaseType;
	}

	public Double getCarPropLossApprovalAmount() {
		return carPropLossApprovalAmount;
	}

	public void setCarPropLossApprovalAmount(Double carPropLossApprovalAmount) {
		this.carPropLossApprovalAmount = carPropLossApprovalAmount;
	}

	public Double getPersonLossApprovalAmount() {
		return personLossApprovalAmount;
	}

	public void setPersonLossApprovalAmount(Double personLossApprovalAmount) {
		this.personLossApprovalAmount = personLossApprovalAmount;
	}
	public Double getCenterLimitAmount() {
		return centerLimitAmount;
	}

	public void setCenterLimitAmount(Double centerLimitAmount) {
		this.centerLimitAmount = centerLimitAmount;
	}

	public Double getBranchLimitAmount() {
		return branchLimitAmount;
	}

	public void setBranchLimitAmount(Double branchLimitAmount) {
		this.branchLimitAmount = branchLimitAmount;
	}

	public Double getHeadLimitAmount() {
		return headLimitAmount;
	}

	public void setHeadLimitAmount(Double headLimitAmount) {
		this.headLimitAmount = headLimitAmount;
	}
	
}
