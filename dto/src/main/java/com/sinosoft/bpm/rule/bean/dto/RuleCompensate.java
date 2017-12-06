package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * 理算
 * @author chao
 *
 */
public class RuleCompensate implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	人员核赔金额*/
	private	Double	undwrtAmountAuthority;
	/**	核赔金额*/
	private	Double	undwrtAmount;
	/**	是否总公司理算人员理算*/
	private	String	isHeadcomp;
	/**	是否产生理算*/
	private	String	isCreateCompensate ="N";
	/**	理算任务数量*/
	private	Integer	compensateTypeCount =0;
	/**	是否自动理算*/
	private	String	isAutoCompensate ="N";
	/**	自动理算任务数量*/
	private	Integer	autoCompensateCount =0;
	/**	是核赔任务提交方式*/
	private	String	undwrtSubmitType ;
	/**	是否产生单证*/
	private	String	isCreateCertificate ;
	/**	是否人伤*/
	private	String	isInjury ;
	/**	是否诉讼*/
	private	String	isLawsuit ;
	/**	估损金额*/
	private	Double	estimateLoss;
	/**理算金额*/
	private Double wholeCompensateAmount = 0d;
	/**是否为不足额投保*/
	private String isFullInsurance = "";
	/**理赔费用*/
	private Double compensateFee = 0d;
	/**责任类型*/
	private String indemnityDuty = "";
	/**责任比例*/
	private Double indemnityDutyRate = 0d;
	/**收款人户名与被保险人不一致*/
	private String isPayObjectType = "";
	
	
	
	public Double getUndwrtAmountAuthority() {
		return undwrtAmountAuthority;
	}
	public void setUndwrtAmountAuthority(Double undwrtAmountAuthority) {
		this.undwrtAmountAuthority = undwrtAmountAuthority;
	}
	public Double getUndwrtAmount() {
		return undwrtAmount;
	}
	public void setUndwrtAmount(Double undwrtAmount) {
		this.undwrtAmount = undwrtAmount;
	}
	public String getIsHeadcomp() {
		return isHeadcomp;
	}
	public void setIsHeadcomp(String isHeadcomp) {
		this.isHeadcomp = isHeadcomp;
	}
	public String getIsCreateCompensate() {
		return isCreateCompensate;
	}
	public void setIsCreateCompensate(String isCreateCompensate) {
		this.isCreateCompensate = isCreateCompensate;
	}
	public Integer getCompensateTypeCount() {
		return compensateTypeCount;
	}
	public void setCompensateTypeCount(Integer compensateTypeCount) {
		this.compensateTypeCount = compensateTypeCount;
	}
	public String getIsAutoCompensate() {
		return isAutoCompensate;
	}
	public void setIsAutoCompensate(String isAutoCompensate) {
		this.isAutoCompensate = isAutoCompensate;
	}
	public Integer getAutoCompensateCount() {
		return autoCompensateCount;
	}
	public void setAutoCompensateCount(Integer autoCompensateCount) {
		this.autoCompensateCount = autoCompensateCount;
	}
	public String getUndwrtSubmitType() {
		return undwrtSubmitType;
	}
	public void setUndwrtSubmitType(String undwrtSubmitType) {
		this.undwrtSubmitType = undwrtSubmitType;
	}
	public String getIsCreateCertificate() {
		return isCreateCertificate;
	}
	public void setIsCreateCertificate(String isCreateCertificate) {
		this.isCreateCertificate = isCreateCertificate;
	}
	public String getIsInjury() {
		return isInjury;
	}
	public void setIsInjury(String isInjury) {
		this.isInjury = isInjury;
	}
	public String getIsLawsuit() {
		return isLawsuit;
	}
	public void setIsLawsuit(String isLawsuit) {
		this.isLawsuit = isLawsuit;
	}
	public Double getEstimateLoss() {
		return estimateLoss;
	}
	public void setEstimateLoss(Double estimateLoss) {
		this.estimateLoss = estimateLoss;
	}
	public Double getWholeCompensateAmount() {
		return wholeCompensateAmount;
	}
	public void setWholeCompensateAmount(Double wholeCompensateAmount) {
		this.wholeCompensateAmount = wholeCompensateAmount;
	}
	public String getIsFullInsurance() {
		return isFullInsurance;
	}
	public void setIsFullInsurance(String isFullInsurance) {
		this.isFullInsurance = isFullInsurance;
	}
	public Double getCompensateFee() {
		return compensateFee;
	}
	public void setCompensateFee(Double compensateFee) {
		this.compensateFee = compensateFee;
	}
	public String getIndemnityDuty() {
		return indemnityDuty;
	}
	public void setIndemnityDuty(String indemnityDuty) {
		this.indemnityDuty = indemnityDuty;
	}
	public Double getIndemnityDutyRate() {
		return indemnityDutyRate;
	}
	public void setIndemnityDutyRate(Double indemnityDutyRate) {
		this.indemnityDutyRate = indemnityDutyRate;
	}
	public String getIsPayObjectType() {
		return isPayObjectType;
	}
	public void setIsPayObjectType(String isPayObjectType) {
		this.isPayObjectType = isPayObjectType;
	}

}
