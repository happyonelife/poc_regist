package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 支付
 * @author chao
 *
 */
public class RulePayment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	是否修改支付信息*/
	private	 String isPaymentModify;
	/**	是否修改账户名*/
	private	 String isAccountModify;
	public String getIsPaymentModify() {
		return isPaymentModify;
	}
	public void setIsPaymentModify(String isPaymentModify) {
		this.isPaymentModify = isPaymentModify;
	}
	public String getIsAccountModify() {
		return isAccountModify;
	}
	public void setIsAccountModify(String isAccountModify) {
		this.isAccountModify = isAccountModify;
	}

}
