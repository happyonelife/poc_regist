package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 报案
 * @author chao
 *
 */
public class RuleRegist implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	是否注销报案	*/
	private	String	isRegistCancel;
	/**	是否异地出险 	*/
	private	String	isRemoteDamage;
	/**	是否产生交强立案	*/
	private	String	isCI;
	/**	是否产生商业立案	*/
	private	String	isBI;
	/**	是否受理	*/
	private	String	isAccept;
	/**	交强立案数量*/
	private	Integer	ciClaimCount=0;
	/**	商业立案数量*/
	private	Integer	biClaimCount=0;
	/**	调度任务机构	*/
	private	String	scheduleComCode;
	/** 报案时间*/
	private Date reportTime = new Date();
	/** 出险时间*/
	private Date registDamageTime = new Date();
	
	public String getIsRegistCancel() {
		return isRegistCancel;
	}
	public void setIsRegistCancel(String isRegistCancel) {
		this.isRegistCancel = isRegistCancel;
	}
	public String getIsRemoteDamage() {
		return isRemoteDamage;
	}
	public void setIsRemoteDamage(String isRemoteDamage) {
		this.isRemoteDamage = isRemoteDamage;
	}
	public String getIsCI() {
		return isCI;
	}
	public void setIsCI(String isCI) {
		this.isCI = isCI;
	}
	public String getIsBI() {
		return isBI;
	}
	public void setIsBI(String isBI) {
		this.isBI = isBI;
	}
	public String getIsAccept() {
		return isAccept;
	}
	public void setIsAccept(String isAccept) {
		this.isAccept = isAccept;
	}
	public Integer getCiClaimCount() {
		return ciClaimCount;
	}
	public void setCiClaimCount(Integer ciClaimCount) {
		this.ciClaimCount = ciClaimCount;
	}
	public Integer getBiClaimCount() {
		return biClaimCount;
	}
	public void setBiClaimCount(Integer biClaimCount) {
		this.biClaimCount = biClaimCount;
	}
	public String getScheduleComCode() {
		return scheduleComCode;
	}
	public void setScheduleComCode(String scheduleComCode) {
		this.scheduleComCode = scheduleComCode;
	}
	public Date getReportTime() {
		return reportTime;
	}
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}
	public Date getRegistDamageTime() {
		return registDamageTime;
	}
	public void setRegistDamageTime(Date registDamageTime) {
		this.registDamageTime = registDamageTime;
	}
	
	
}
