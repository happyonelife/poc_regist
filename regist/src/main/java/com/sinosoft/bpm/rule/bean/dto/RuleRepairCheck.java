package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 修复验车
 * @author chao
 *
 */
public class RuleRepairCheck implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	定损处理机构*/
	private	String	lastLossApprovalCom;
	/**	上一个修复验车审核处理人*/
	private	String	lastrepairCheckAuer;
	/**	上一个修复验车审核机构*/
	private	String	lastrepairCheckAuCom;
	/**	上一个修复验车处理人*/
	private	String	lastRepairCheckHandler;
	/**	上一个修复验车机构*/
	private	String	lastRepairCheckCom;

	public String getLastLossApprovalCom() {
		return lastLossApprovalCom;
	}
	public void setLastLossApprovalCom(String lastLossApprovalCom) {
		this.lastLossApprovalCom = lastLossApprovalCom;
	}
	public String getLastrepairCheckAuer() {
		return lastrepairCheckAuer;
	}
	public void setLastrepairCheckAuer(String lastrepairCheckAuer) {
		this.lastrepairCheckAuer = lastrepairCheckAuer;
	}
	public String getLastrepairCheckAuCom() {
		return lastrepairCheckAuCom;
	}
	public void setLastrepairCheckAuCom(String lastrepairCheckAuCom) {
		this.lastrepairCheckAuCom = lastrepairCheckAuCom;
	}
	public String getLastRepairCheckHandler() {
		return lastRepairCheckHandler;
	}
	public void setLastRepairCheckHandler(String lastRepairCheckHandler) {
		this.lastRepairCheckHandler = lastRepairCheckHandler;
	}
	public String getLastRepairCheckCom() {
		return lastRepairCheckCom;
	}
	public void setLastRepairCheckCom(String lastRepairCheckCom) {
		this.lastRepairCheckCom = lastRepairCheckCom;
	}
	
}
