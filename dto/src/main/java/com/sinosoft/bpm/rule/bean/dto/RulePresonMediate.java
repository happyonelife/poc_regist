package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 人伤调解
 * @author chao
 *
 */
public class RulePresonMediate implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	人伤调解金额*/
		private	Double	injuryMediateAmount;
		/**	人员调解审核金额*/
		private	Double	injuryMediateVerifyAmountAuthority = 0.0;
		/**	人员调解金额*/
		private	Double	injuryMediateAmountAuthority ;
		/**	调解审核任务提交方式*/
		private	String	meediateAuditSubmitType ;
		/**	上一个跟踪处理人*/
		private	String	lastPersonTraceHandler ;
		/**	上一个跟踪处理机构*/
		private	String	lastPersonTraceCom ;
		/**	上一个调解审核处理人*/
		private	String	lastMeediateAuditHandler ;
		/**	上一个调解审核机构*/
		private	String	lastMeediateAuditCom ;
		/**	定损金额*/
		private	Double	lossApprovalAmount;
		/**	上一个调解处理人*/
		private	String	lastPersonMeediateHandler ;
		/**	上一个调解处理机构*/
		private	String	lastPersonMeediateCom ;
		/**	定损处理人*/
		private	String	lossApprovalHandler ;
		/**	定损处理机构*/
		private	String	lossApprovalCom ;
		/**	上一个分公司调解审核处理人*/
		private	String	lastBMeediateAuditHandler ;
		/**	上一个分公司调解审核机构*/
		private	String	lastBMeediateAuditCom ;
		/**	上一个总公司调解审核处理人*/
		private	String	lastHMeediateAuditHandler ;
		/**	上一个总公司调解审核机构*/
		private	String	lastHMeediateAuditCom ;
		
		public Double getLossApprovalAmount() {
			return lossApprovalAmount;
		}
		public void setLossApprovalAmount(Double lossApprovalAmount) {
			this.lossApprovalAmount = lossApprovalAmount;
		}
		public String getLastPersonMeediateHandler() {
			return lastPersonMeediateHandler;
		}
		public void setLastPersonMeediateHandler(String lastPersonMeediateHandler) {
			this.lastPersonMeediateHandler = lastPersonMeediateHandler;
		}
		public String getLastPersonMeediateCom() {
			return lastPersonMeediateCom;
		}
		public void setLastPersonMeediateCom(String lastPersonMeediateCom) {
			this.lastPersonMeediateCom = lastPersonMeediateCom;
		}
		public String getLossApprovalHandler() {
			return lossApprovalHandler;
		}
		public void setLossApprovalHandler(String lossApprovalHandler) {
			this.lossApprovalHandler = lossApprovalHandler;
		}
		public String getLossApprovalCom() {
			return lossApprovalCom;
		}
		public void setLossApprovalCom(String lossApprovalCom) {
			this.lossApprovalCom = lossApprovalCom;
		}
		public String getLastBMeediateAuditHandler() {
			return lastBMeediateAuditHandler;
		}
		public void setLastBMeediateAuditHandler(String lastBMeediateAuditHandler) {
			this.lastBMeediateAuditHandler = lastBMeediateAuditHandler;
		}
		public String getLastBMeediateAuditCom() {
			return lastBMeediateAuditCom;
		}
		public void setLastBMeediateAuditCom(String lastBMeediateAuditCom) {
			this.lastBMeediateAuditCom = lastBMeediateAuditCom;
		}
		public String getLastHMeediateAuditHandler() {
			return lastHMeediateAuditHandler;
		}
		public void setLastHMeediateAuditHandler(String lastHMeediateAuditHandler) {
			this.lastHMeediateAuditHandler = lastHMeediateAuditHandler;
		}
		public String getLastHMeediateAuditCom() {
			return lastHMeediateAuditCom;
		}
		public void setLastHMeediateAuditCom(String lastHMeediateAuditCom) {
			this.lastHMeediateAuditCom = lastHMeediateAuditCom;
		}
		public Double getInjuryMediateAmount() {
			return injuryMediateAmount;
		}
		public void setInjuryMediateAmount(Double injuryMediateAmount) {
			this.injuryMediateAmount = injuryMediateAmount;
		}
		public Double getInjuryMediateVerifyAmountAuthority() {
			return injuryMediateVerifyAmountAuthority;
		}
		public void setInjuryMediateVerifyAmountAuthority(
				Double injuryMediateVerifyAmountAuthority) {
			this.injuryMediateVerifyAmountAuthority = injuryMediateVerifyAmountAuthority;
		}
		public Double getInjuryMediateAmountAuthority() {
			return injuryMediateAmountAuthority;
		}
		public void setInjuryMediateAmountAuthority(Double injuryMediateAmountAuthority) {
			this.injuryMediateAmountAuthority = injuryMediateAmountAuthority;
		}
		public String getMeediateAuditSubmitType() {
			return meediateAuditSubmitType;
		}
		public void setMeediateAuditSubmitType(String meediateAuditSubmitType) {
			this.meediateAuditSubmitType = meediateAuditSubmitType;
		}
		public String getLastPersonTraceHandler() {
			return lastPersonTraceHandler;
		}
		public void setLastPersonTraceHandler(String lastPersonTraceHandler) {
			this.lastPersonTraceHandler = lastPersonTraceHandler;
		}
		public String getLastPersonTraceCom() {
			return lastPersonTraceCom;
		}
		public void setLastPersonTraceCom(String lastPersonTraceCom) {
			this.lastPersonTraceCom = lastPersonTraceCom;
		}
		public String getLastMeediateAuditHandler() {
			return lastMeediateAuditHandler;
		}
		public void setLastMeediateAuditHandler(String lastMeediateAuditHandler) {
			this.lastMeediateAuditHandler = lastMeediateAuditHandler;
		}
		public String getLastMeediateAuditCom() {
			return lastMeediateAuditCom;
		}
		public void setLastMeediateAuditCom(String lastMeediateAuditCom) {
			this.lastMeediateAuditCom = lastMeediateAuditCom;
		}
		
		
}
