package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * 人伤调解审核
 * @author chao
 *
 */
public class RulePresonMediateApproval implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	人伤调解审核金额*/
	private	Double	presonMediateamount;
	/**	是否自保车*/
	private	String	selprecar;
	/** 风险等级*/
	private String riskLevel ;
	/** 人员调解审核权限金额*/
	private Double amountPersonmediation ;
	
	public String getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public Double getAmountPersonmediation() {
		return amountPersonmediation;
	}
	public void setAmountPersonmediation(Double amountPersonmediation) {
		this.amountPersonmediation = amountPersonmediation;
	}
	public Double getPresonMediateamount() {
		return presonMediateamount;
	}
	public void setPresonMediateamount(Double presonMediateamount) {
		this.presonMediateamount = presonMediateamount;
	}
	public String getSelprecar() {
		return selprecar;
	}
	public void setSelprecar(String selprecar) {
		this.selprecar = selprecar;
	}
}
