package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * 人伤专项调查
 * @author chao
 *
 */
public class RulePersonArticleInvestigate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	是否取消人伤专项调查*/
	private	String 	isCancelCheck;
	
	public String getIsCancelCheck() {
		return isCancelCheck;
	}
	public void setIsCancelCheck(String isCancelCheck) {
		this.isCancelCheck = isCancelCheck;
	}
}
