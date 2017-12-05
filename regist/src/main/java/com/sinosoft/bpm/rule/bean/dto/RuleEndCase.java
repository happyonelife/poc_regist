 package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 结案
 * @author chao
 *
 */
public class RuleEndCase implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	是否重开*/
	private	String  isReopen;
	/**	是否产生集中录入*/
	private	String  isGroupInput="N";
	/** 是否商业险*/
	private String isHasBICase = "N";
	/** 是否交强险*/
	private String isHasCICase = "N";
	public String getIsGroupInput() {
		return isGroupInput;
	}

	public void setIsGroupInput(String isGroupInput) {
		this.isGroupInput = isGroupInput;
	}

	public String getIsReopen() {
		return isReopen;
	}

	public void setIsReopen(String isReopen) {
		this.isReopen = isReopen;
	}

	public String getIsHasBICase() {
		return isHasBICase;
	}

	public void setIsHasBICase(String isHasBICase) {
		this.isHasBICase = isHasBICase;
	}

	public String getIsHasCICase() {
		return isHasCICase;
	}

	public void setIsHasCICase(String isHasCICase) {
		this.isHasCICase = isHasCICase;
	}
	
	
	
}
