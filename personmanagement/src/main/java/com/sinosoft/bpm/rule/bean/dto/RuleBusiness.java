package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 简易案件信息
 * @author chao
 *
 */
public class RuleBusiness implements Serializable{
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
	private	String	customLevel;
	/**	是否特殊赔案*/
	private	String	isSpecialCase;
	/**	最高单车损失*/
	private	Double	maxCarLoss;
	/**	是否简易案件*/
	private	String	isSimpleCase="N";
	/**	是否全案核损通过*/
	private	String	isCaseLossPass="N";
	/**	是否单证收集齐全*/
	private	String	isCertificateCollection="N";
	/**	查勘是否已完成*/
	private	String	isCheckComplete="N";
	/**	是否录入支付信息*/
	private	String	isPayInput="N";
	/**	是否存在未处理完的理算*/
	private	String	isNotProcessedCompensate="N";
	/**	是否修复验车*/
	private	String	isRepairCheck="N";
	/**	是否配件审验*/
	private	String	isAccessory="N";
	/**车辆损失金额*/
	private double carSumLoss;
	/**施救费金额*/
	private double sumRescueFee;

	public String getIsPayInput() {
		return isPayInput;
	}
	public String getIsRepairCheck() {
		return isRepairCheck;
	}
	public void setIsRepairCheck(String isRepairCheck) {
		this.isRepairCheck = isRepairCheck;
	}
	public String getIsAccessory() {
		return isAccessory;
	}
	public void setIsAccessory(String isAccessory) {
		this.isAccessory = isAccessory;
	}
	public void setIsPayInput(String isPayInput) {
		this.isPayInput = isPayInput;
	}
	public String getIsNotProcessedCompensate() {
		return isNotProcessedCompensate;
	}
	public void setIsNotProcessedCompensate(String isNotProcessedCompensate) {
		this.isNotProcessedCompensate = isNotProcessedCompensate;
	}
	public String getIsSimpleCase() {
		return isSimpleCase;
	}
	public void setIsSimpleCase(String isSimpleCase) {
		this.isSimpleCase = isSimpleCase;
	}
	public String getIsCaseLossPass() {
		return isCaseLossPass;
	}
	public void setIsCaseLossPass(String isCaseLossPass) {
		this.isCaseLossPass = isCaseLossPass;
	}
	public String getIsCertificateCollection() {
		return isCertificateCollection;
	}
	public void setIsCertificateCollection(String isCertificateCollection) {
		this.isCertificateCollection = isCertificateCollection;
	}
	public String getIsCheckComplete() {
		return isCheckComplete;
	}
	public void setIsCheckComplete(String isCheckComplete) {
		this.isCheckComplete = isCheckComplete;
	}
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
	public String getCustomLevel() {
		return customLevel;
	}
	public void setCustomLevel(String customLevel) {
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
	public double getCarSumLoss() {
		return carSumLoss;
	}
	public void setCarSumLoss(double carSumLoss) {
		this.carSumLoss = carSumLoss;
	}
	public double getSumRescueFee() {
		return sumRescueFee;
	}
	public void setSumRescueFee(double sumRescueFee) {
		this.sumRescueFee = sumRescueFee;
	}
	
}
