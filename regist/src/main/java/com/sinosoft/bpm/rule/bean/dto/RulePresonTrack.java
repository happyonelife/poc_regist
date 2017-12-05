package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 人伤跟踪
 * @author chao
 *
 */
public class RulePresonTrack implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	人伤任务类型*/
	private	String	injuryTaskType;
	/**	是否有定损权限*/
	private	String	isPLossApproval="N";
	/**	是否有调解权限*/
	private	String	isInjuryMediate="N";
	/**	定损处理人*/
	private	String	lossApprovalHandler;
	/**	上一个定损处理机构（回退的跟踪时传）*/
	private	String	lastLossApprovalCom;
	/**	调解处理人*/
	private	String	PersonMeediateHandler;
	/**	上一个调解处理机构（回退的跟踪时传）*/
	private	String	lastPersonMeediateCom;
	/**单人伤跟踪合计金额*/
	private Double singlePersonTrackSumAmount = 0d;
	/** 是否用于人伤跟踪提交审核Y,还是产生定损N*/
	private String isSubmitFromPersonTrace = "N";
	
	public String getLossApprovalHandler() {
		return lossApprovalHandler;
	}

	public void setLossApprovalHandler(String lossApprovalHandler) {
		this.lossApprovalHandler = lossApprovalHandler;
	}

	public String getLastLossApprovalCom() {
		return lastLossApprovalCom;
	}

	public void setLastLossApprovalCom(String lastLossApprovalCom) {
		this.lastLossApprovalCom = lastLossApprovalCom;
	}

	public String getPersonMeediateHandler() {
		return PersonMeediateHandler;
	}

	public void setPersonMeediateHandler(String personMeediateHandler) {
		PersonMeediateHandler = personMeediateHandler;
	}

	public String getLastPersonMeediateCom() {
		return lastPersonMeediateCom;
	}

	public void setLastPersonMeediateCom(String lastPersonMeediateCom) {
		this.lastPersonMeediateCom = lastPersonMeediateCom;
	}

	public String getIsPLossApproval() {
		return isPLossApproval;
	}

	public void setIsPLossApproval(String isPLossApproval) {
		this.isPLossApproval = isPLossApproval;
	}

	public String getIsInjuryMediate() {
		return isInjuryMediate;
	}

	public void setIsInjuryMediate(String isInjuryMediate) {
		this.isInjuryMediate = isInjuryMediate;
	}
	public String getInjuryTaskType() {
		return injuryTaskType;
	}

	public void setInjuryTaskType(String injuryTaskType) {
		this.injuryTaskType = injuryTaskType;
	}

	public Double getSinglePersonTrackSumAmount() {
		return singlePersonTrackSumAmount;
	}

	public void setSinglePersonTrackSumAmount(Double singlePersonTrackSumAmount) {
		this.singlePersonTrackSumAmount = singlePersonTrackSumAmount;
	}

	public String getIsSubmitFromPersonTrace() {
		return isSubmitFromPersonTrace;
	}

	public void setIsSubmitFromPersonTrace(String isSubmitFromPersonTrace) {
		this.isSubmitFromPersonTrace = isSubmitFromPersonTrace;
	}
	
	
}
