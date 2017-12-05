package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 举报
 * @author chao
 *
 */
public class RuleReport implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	是否提交调查*/
	private	String isSubmitInvestigate;
	/**	是否需要重新调查*/
	private	String isNeedReInvestigate;
	
	public String getIsSubmitInvestigate() {
		return isSubmitInvestigate;
	}
	public void setIsSubmitInvestigate(String isSubmitInvestigate) {
		this.isSubmitInvestigate = isSubmitInvestigate;
	}
	public String getIsNeedReInvestigate() {
		return isNeedReInvestigate;
	}
	public void setIsNeedReInvestigate(String isNeedReInvestigate) {
		this.isNeedReInvestigate = isNeedReInvestigate;
	}
	
	
	
}
