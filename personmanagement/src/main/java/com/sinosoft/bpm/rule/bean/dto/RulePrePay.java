package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 预赔
 * @author chao
 *
 */
public class RulePrePay implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**核赔金额*/
	private Double undwrtAmount;
	/**	核赔任务提交方式*/
	private	 String undwrtSubmitType;
	/**	是否总公司任务*/
	private	 String isHeadTask;
	/**	人员核赔金额*/
	private	 Double undwrtAmountAuthority;
	/**	是否产生单证*/
	private	 Double isCreateCertificate;
	public Double getUndwrtAmount() {
		return undwrtAmount;
	}
	public void setUndwrtAmount(Double undwrtAmount) {
		this.undwrtAmount = undwrtAmount;
	}
	public String getUndwrtSubmitType() {
		return undwrtSubmitType;
	}
	public void setUndwrtSubmitType(String undwrtSubmitType) {
		this.undwrtSubmitType = undwrtSubmitType;
	}
	public String getIsHeadTask() {
		return isHeadTask;
	}
	public void setIsHeadTask(String isHeadTask) {
		this.isHeadTask = isHeadTask;
	}
	public Double getUndwrtAmountAuthority() {
		return undwrtAmountAuthority;
	}
	public void setUndwrtAmountAuthority(Double undwrtAmountAuthority) {
		this.undwrtAmountAuthority = undwrtAmountAuthority;
	}
	public Double getIsCreateCertificate() {
		return isCreateCertificate;
	}
	public void setIsCreateCertificate(Double isCreateCertificate) {
		this.isCreateCertificate = isCreateCertificate;
	}
	

}
