package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 垫付信息
 * @author chao
 *
 */
public class RuleAdvance implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	核赔金额*/
	private	Double  undwrtAmount;
	/**	核赔任务提交方式*/
	private	 String undwrtSubmitType;
	/**垫付类型1.商业2.交强*/
	private String currentAdvanceRiskType="";
	
	
	public String getUndwrtSubmitType() {
		return undwrtSubmitType;
	}

	public void setUndwrtSubmitType(String undwrtSubmitType) {
		this.undwrtSubmitType = undwrtSubmitType;
	}

	public Double getUndwrtAmount() {
		return undwrtAmount;
	}

	public void setUndwrtAmount(Double undwrtAmount) {
		this.undwrtAmount = undwrtAmount;
	}

	public String getCurrentAdvanceRiskType() {
		return currentAdvanceRiskType;
	}

	public void setCurrentAdvanceRiskType(String currentAdvanceRiskType) {
		this.currentAdvanceRiskType = currentAdvanceRiskType;
	}

}
