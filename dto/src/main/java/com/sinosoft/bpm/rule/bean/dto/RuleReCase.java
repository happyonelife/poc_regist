package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 重开赔案信息
 * @author chao
 *
 */
public class RuleReCase implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	是否产生单证*/
	private	String  isCreateCertificate;
	/**	是否产生调度*/
	private	String  isCreateSchedule;
	/**	是否正常结案*/
	private	String  isNormalCase="Y";
	
	public String getIsNormalCase() {
		return isNormalCase;
	}
	public void setIsNormalCase(String isNormalCase) {
		this.isNormalCase = isNormalCase;
	}
	public String getIsCreateCertificate() {
		return isCreateCertificate;
	}
	public void setIsCreateCertificate(String isCreateCertificate) {
		this.isCreateCertificate = isCreateCertificate;
	}
	public String getIsCreateSchedule() {
		return isCreateSchedule;
	}
	public void setIsCreateSchedule(String isCreateSchedule) {
		this.isCreateSchedule = isCreateSchedule;
	}

	
	
}
