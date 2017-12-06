package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

public class RuleAnyPay implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**定核损金额*/
	private double anyPayLossAmount = 0d;

	public double getAnyPayLossAmount() {
		return anyPayLossAmount;
	}

	public void setAnyPayLossAmount(double anyPayLossAmount) {
		this.anyPayLossAmount = anyPayLossAmount;
	}
}
