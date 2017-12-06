package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

public class RuleSubrogation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	代赔金额*/
	private	Double	subPayAmount;
	/**	清付金额*/
	private	Double	recoveryAmount;
	/**	是否面向致害人*/
	private	String	forInflicter;
	/**	是否有追回款*/
	private	String	hasRecoverFee;
	/**	是否有转向致害人的追款*/
	private	String	hasTurntoInflicter;
	/**	是否互审通过*/
	private	String	isPeerReviewPass;
	/**	代位类型*/
	private	String	subRogationType;
	/**	追偿金额*/
	private	Double	replevyAmount;
	/**清算码状态 1待互审 2无需互审 3互审中 4待清算 5已支付 6零清算 7失效 */
	private String recoveryCodeStatus;
	
	public String getRecoveryCodeStatus() {
		return recoveryCodeStatus;
	}
	public void setRecoveryCodeStatus(String recoveryCodeStatus) {
		this.recoveryCodeStatus = recoveryCodeStatus;
	}
	public Double getReplevyAmount() {
		return replevyAmount;
	}
	public void setReplevyAmount(Double replevyAmount) {
		this.replevyAmount = replevyAmount;
	}
	public Double getSubPayAmount() {
		return subPayAmount;
	}
	public void setSubPayAmount(Double subPayAmount) {
		this.subPayAmount = subPayAmount;
	}
	public Double getRecoveryAmount() {
		return recoveryAmount;
	}
	public void setRecoveryAmount(Double recoveryAmount) {
		this.recoveryAmount = recoveryAmount;
	}
	public String getForInflicter() {
		return forInflicter;
	}
	public void setForInflicter(String forInflicter) {
		this.forInflicter = forInflicter;
	}
	public String getHasRecoverFee() {
		return hasRecoverFee;
	}
	public void setHasRecoverFee(String hasRecoverFee) {
		this.hasRecoverFee = hasRecoverFee;
	}
	public String getHasTurntoInflicter() {
		return hasTurntoInflicter;
	}
	public void setHasTurntoInflicter(String hasTurntoInflicter) {
		this.hasTurntoInflicter = hasTurntoInflicter;
	}
	public String getIsPeerReviewPass() {
		return isPeerReviewPass;
	}
	public void setIsPeerReviewPass(String isPeerReviewPass) {
		this.isPeerReviewPass = isPeerReviewPass;
	}
	public String getSubRogationType() {
		return subRogationType;
	}
	public void setSubRogationType(String subRogationType) {
		this.subRogationType = subRogationType;
	}
	
	
}
