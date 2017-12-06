package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * 人伤调解审核
 * @author chao
 *
 */
public class RulePresonMediateVerify implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	人伤调解金额*/
	private	Double	injuryMediateAmount;
	/**	是否自保车*/
	private	String	isSelfInsuranceCar;
	/** 风险等级*/
	private String riskLevel ;
	/** 人员调解审核权限金额*/
	private Double injuryMediateVerifyAmountAuthority ;
	/** 上一个调解处理人*/
	private String lastPersonMeediateHandler ;
	/** 上一个调解处理机构*/
	private String lastPersonMeediateCom ;
	/** 定损处理人*/
	private String lossApprovalHandler ;
	/** 定损处理机构*/
	private String lossApprovalCom ;

	public String getLastPersonMeediateHandler() {
		return lastPersonMeediateHandler;
	}
	public void setLastPersonMeediateHandler(String lastPersonMeediateHandler) {
		this.lastPersonMeediateHandler = lastPersonMeediateHandler;
	}
	public String getLastPersonMeediateCom() {
		return lastPersonMeediateCom;
	}
	public void setLastPersonMeediateCom(String lastPersonMeediateCom) {
		this.lastPersonMeediateCom = lastPersonMeediateCom;
	}
	public String getLossApprovalHandler() {
		return lossApprovalHandler;
	}
	public void setLossApprovalHandler(String lossApprovalHandler) {
		this.lossApprovalHandler = lossApprovalHandler;
	}
	public String getLossApprovalCom() {
		return lossApprovalCom;
	}
	public void setLossApprovalCom(String lossApprovalCom) {
		this.lossApprovalCom = lossApprovalCom;
	}
	public Double getInjuryMediateAmount() {
		return injuryMediateAmount;
	}
	public void setInjuryMediateAmount(Double injuryMediateAmount) {
		this.injuryMediateAmount = injuryMediateAmount;
	}
	public String getIsSelfInsuranceCar() {
		return isSelfInsuranceCar;
	}
	public void setIsSelfInsuranceCar(String isSelfInsuranceCar) {
		this.isSelfInsuranceCar = isSelfInsuranceCar;
	}
	public String getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public Double getInjuryMediateVerifyAmountAuthority() {
		return injuryMediateVerifyAmountAuthority;
	}
	public void setInjuryMediateVerifyAmountAuthority(
			Double injuryMediateVerifyAmountAuthority) {
		this.injuryMediateVerifyAmountAuthority = injuryMediateVerifyAmountAuthority;
	}
}
