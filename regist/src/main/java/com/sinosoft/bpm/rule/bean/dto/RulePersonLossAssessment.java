package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 人伤核损
 * @author chao
 *
 */
public class RulePersonLossAssessment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 风险等级*/
	private String riskLevel ;
	/**	是否小额人伤*/
	private	String	isSmallPeople;
	/**	是否自保车*/
	private	String	selprecar;
	/**	核损金额*/
	private	Double	lossaAmount;
	/**	人伤任务类型*/
	private	String	personLosstype;
	/**	员工金额权限*/
	private	Double	employeeAmount;
	/**	是否通赔案件*/
	private	String	isSubmitPayCase;
	/**	是否全案收集齐全*/
	private	String	isAllCase;
	/**	人员核损金额*/
	private	Double	userLossAssessmentAmount;
	/**	定损金额*/
	private	Double	totalLossAmount;

	public Double getTotalLossAmount() {
		return totalLossAmount;
	}
	public void setTotalLossAmount(Double totalLossAmount) {
		this.totalLossAmount = totalLossAmount;
	}
	public String getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public Double getUserLossAssessmentAmount() {
		return userLossAssessmentAmount;
	}
	public void setUserLossAssessmentAmount(Double userLossAssessmentAmount) {
		this.userLossAssessmentAmount = userLossAssessmentAmount;
	}
	
	public String getIsAllCase() {
		return isAllCase;
	}
	public void setIsAllCase(String isAllCase) {
		this.isAllCase = isAllCase;
	}
	public String getIsSubmitPayCase() {
		return isSubmitPayCase;
	}
	public void setIsSubmitPayCase(String isSubmitPayCase) {
		this.isSubmitPayCase = isSubmitPayCase;
	}
	public String getIsSmallPeople() {
		return isSmallPeople;
	}
	public void setIsSmallPeople(String isSmallPeople) {
		this.isSmallPeople = isSmallPeople;
	}
	public String getSelprecar() {
		return selprecar;
	}
	public void setSelprecar(String selprecar) {
		this.selprecar = selprecar;
	}
	public Double getLossaAmount() {
		return lossaAmount;
	}
	public void setLossaAmount(Double lossaAmount) {
		this.lossaAmount = lossaAmount;
	}
	public String getPersonLosstype() {
		return personLosstype;
	}
	public void setPersonLosstype(String personLosstype) {
		this.personLosstype = personLosstype;
	}
	public Double getEmployeeAmount() {
		return employeeAmount;
	}
	public void setEmployeeAmount(Double employeeAmount) {
		this.employeeAmount = employeeAmount;
	}
	
}
