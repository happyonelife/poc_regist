package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 简易案件信息
 * @author chao
 *
 */
public class RuleSimpleCase implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	是否人伤案件*/
	private	String	isInjuryCase;
	/**	是否财产案件*/
	private	String	isPropCase;
	/**	风险等级*/
	private	String	riskLevel;
	/**	出险次数*/
	private	Integer	damageTimes;
	/**	是否诉讼案件*/
	private	String	isLawsuitCase;
	/**	涉案出险车辆数量*/
	private	Integer	involvedAccidentNoOfCar;
	/**	客户等级*/
	private	Integer	customLevel;
	/**	是否特殊赔案*/
	private	String	isSpecialCase;
	/**	最高单车损失*/
	private	Double	maxCarLoss;
	
	public String getRiskLevel() {
		return riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public String getIsInjuryCase() {
		return isInjuryCase;
	}
	public void setIsInjuryCase(String isInjuryCase) {
		this.isInjuryCase = isInjuryCase;
	}
	public String getIsPropCase() {
		return isPropCase;
	}
	public void setIsPropCase(String isPropCase) {
		this.isPropCase = isPropCase;
	}
	public Integer getDamageTimes() {
		return damageTimes;
	}
	public void setDamageTimes(Integer damageTimes) {
		this.damageTimes = damageTimes;
	}
	public String getIsLawsuitCase() {
		return isLawsuitCase;
	}
	public void setIsLawsuitCase(String isLawsuitCase) {
		this.isLawsuitCase = isLawsuitCase;
	}
	public Integer getInvolvedAccidentNoOfCar() {
		return involvedAccidentNoOfCar;
	}
	public void setInvolvedAccidentNoOfCar(Integer involvedAccidentNoOfCar) {
		this.involvedAccidentNoOfCar = involvedAccidentNoOfCar;
	}
	public Integer getCustomLevel() {
		return customLevel;
	}
	public void setCustomLevel(Integer customLevel) {
		this.customLevel = customLevel;
	}
	public String getIsSpecialCase() {
		return isSpecialCase;
	}
	public void setIsSpecialCase(String isSpecialCase) {
		this.isSpecialCase = isSpecialCase;
	}
	public Double getMaxCarLoss() {
		return maxCarLoss;
	}
	public void setMaxCarLoss(Double maxCarLoss) {
		this.maxCarLoss = maxCarLoss;
	}
	
}
