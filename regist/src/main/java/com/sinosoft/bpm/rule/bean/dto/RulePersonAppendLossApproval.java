package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * 人伤追加定损
 * @author chao
 *
 */
public class RulePersonAppendLossApproval implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	定损金额*/
		private	Double	lossApprovalAmount;
		/**	人员定损金额*/
		private	Double	lossApprovalAmountAuthority;
		/**	是否小额人伤*/
		private	String	isSmallAmountInjury;
		/**	人伤任务类型*/
		private	String	injuryTaskType;
		/**	人员核损金额*/
		private	Double	verifyAmountAuthority;
		/**	是否有核损权限*/
		private	String	isLoss="N";
		/**	是核损任务提交方式*/
		private	String	verifySubmitType;
		/**	上一个分公司人伤核损员*/
		private	String	lastBLossVerifyHandler;
		/**	上一个分公司人伤核损处理机构*/
		private	String	lastBLossVerifyCom;
		/**	上一个总公司人伤核损员*/
		private	String	lastHLossVerifyHandler;
		/**	上一个总公司人伤核损处理机构*/
		private	String	lastHLossVerifyCom;
		
		public String getLastBLossVerifyHandler() {
			return lastBLossVerifyHandler;
		}
		public void setLastBLossVerifyHandler(String lastBLossVerifyHandler) {
			this.lastBLossVerifyHandler = lastBLossVerifyHandler;
		}
		public String getLastBLossVerifyCom() {
			return lastBLossVerifyCom;
		}
		public void setLastBLossVerifyCom(String lastBLossVerifyCom) {
			this.lastBLossVerifyCom = lastBLossVerifyCom;
		}
		public String getLastHLossVerifyHandler() {
			return lastHLossVerifyHandler;
		}
		public void setLastHLossVerifyHandler(String lastHLossVerifyHandler) {
			this.lastHLossVerifyHandler = lastHLossVerifyHandler;
		}
		public String getLastHLossVerifyCom() {
			return lastHLossVerifyCom;
		}
		public void setLastHLossVerifyCom(String lastHLossVerifyCom) {
			this.lastHLossVerifyCom = lastHLossVerifyCom;
		}
		public Double getLossApprovalAmount() {
			return lossApprovalAmount;
		}
		public void setLossApprovalAmount(Double lossApprovalAmount) {
			this.lossApprovalAmount = lossApprovalAmount;
		}
		public Double getLossApprovalAmountAuthority() {
			return lossApprovalAmountAuthority;
		}
		public void setLossApprovalAmountAuthority(Double lossApprovalAmountAuthority) {
			this.lossApprovalAmountAuthority = lossApprovalAmountAuthority;
		}
		public String getIsSmallAmountInjury() {
			return isSmallAmountInjury;
		}
		public void setIsSmallAmountInjury(String isSmallAmountInjury) {
			this.isSmallAmountInjury = isSmallAmountInjury;
		}
		public String getInjuryTaskType() {
			return injuryTaskType;
		}
		public void setInjuryTaskType(String injuryTaskType) {
			this.injuryTaskType = injuryTaskType;
		}
		public Double getVerifyAmountAuthority() {
			return verifyAmountAuthority;
		}
		public void setVerifyAmountAuthority(Double verifyAmountAuthority) {
			this.verifyAmountAuthority = verifyAmountAuthority;
		}
		public String getIsLoss() {
			return isLoss;
		}
		public void setIsLoss(String isLoss) {
			this.isLoss = isLoss;
		}
		public String getVerifySubmitType() {
			return verifySubmitType;
		}
		public void setVerifySubmitType(String verifySubmitType) {
			this.verifySubmitType = verifySubmitType;
		}
		
		
}
