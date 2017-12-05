package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 人伤核损
 * @author chao
 *
 */
public class RulePersonLossVerify implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	是否小额人伤*/
	private	String	isSmallAmountInjury;
	/**	人伤任务类型*/
	private	String	injuryTaskType;
	/**	是否全案收集齐全*/
	private	String	isAllCollect;
	/**	人员核损金额*/
	private	Double	verifyAmountAuthority;
	/**	定损金额*/
	private	Double	lossApprovalAmount;
	/**	是否追加定损*/
	private	String	isAppendLossApproval;
	/**	上一个定损处理人*/
	private	String	lastLossApprovalHandler;
	/**	上一个定损处理机构*/
	private	String	lastLossApprovalCom;
	public String getIsSmallAmountInjury() {
		return isSmallAmountInjury;
	}
	public void setIsSmallAmountInjury(String isSmallAmountInjury) {
		this.isSmallAmountInjury = isSmallAmountInjury;
	}
	public String getInjuryTaskType() {
		return injuryTaskType;
	}
	public void setInjuryTaskType(String injuryTaskType) {
		this.injuryTaskType = injuryTaskType;
	}
	public String getIsAllCollect() {
		return isAllCollect;
	}
	public void setIsAllCollect(String isAllCollect) {
		this.isAllCollect = isAllCollect;
	}
	public Double getVerifyAmountAuthority() {
		return verifyAmountAuthority;
	}
	public void setVerifyAmountAuthority(Double verifyAmountAuthority) {
		this.verifyAmountAuthority = verifyAmountAuthority;
	}
	public Double getLossApprovalAmount() {
		return lossApprovalAmount;
	}
	public void setLossApprovalAmount(Double lossApprovalAmount) {
		this.lossApprovalAmount = lossApprovalAmount;
	}
	public String getIsAppendLossApproval() {
		return isAppendLossApproval;
	}
	public void setIsAppendLossApproval(String isAppendLossApproval) {
		this.isAppendLossApproval = isAppendLossApproval;
	}
	public String getLastLossApprovalHandler() {
		return lastLossApprovalHandler;
	}
	public void setLastLossApprovalHandler(String lastLossApprovalHandler) {
		this.lastLossApprovalHandler = lastLossApprovalHandler;
	}
	public String getLastLossApprovalCom() {
		return lastLossApprovalCom;
	}
	public void setLastLossApprovalCom(String lastLossApprovalCom) {
		this.lastLossApprovalCom = lastLossApprovalCom;
	}
	
}
