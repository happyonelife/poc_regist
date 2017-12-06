package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 损余回收
 * @author chao
 *
 */
public class RuleReClaim implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**核赔金额*/
	private Double undwrtAmount;

	public Double getUndwrtAmount() {
		return undwrtAmount;
	}

	public void setUndwrtAmount(Double undwrtAmount) {
		this.undwrtAmount = undwrtAmount;
	}
}
