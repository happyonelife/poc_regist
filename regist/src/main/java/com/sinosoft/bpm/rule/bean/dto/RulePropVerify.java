package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 财产核损
 * @author chao
 *
 */
public class RulePropVerify implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	人员最小核损金额*/
		private	Double	minVerifyAmountAuthority  ;
		/**	人员最大核损金额*/
		private	Double	maxVerifyAmountAuthority  ;
		/**	定损金额*/
		private	Double	lossApprovalAmount  ;
		/**	是否产生通赔评分*/
		private	String	isAnyPayEvaluate="N" ;
		/**	上一个定损处理人*/
		private	String	lastLossApprovalHandler;
		/**	上一个定损处理机构*/
		private	String	lastLossApprovalCom ;
		public Double getMinVerifyAmountAuthority() {
			return minVerifyAmountAuthority;
		}
		public void setMinVerifyAmountAuthority(Double minVerifyAmountAuthority) {
			this.minVerifyAmountAuthority = minVerifyAmountAuthority;
		}
		public Double getMaxVerifyAmountAuthority() {
			return maxVerifyAmountAuthority;
		}
		public void setMaxVerifyAmountAuthority(Double maxVerifyAmountAuthority) {
			this.maxVerifyAmountAuthority = maxVerifyAmountAuthority;
		}
		public Double getLossApprovalAmount() {
			return lossApprovalAmount;
		}
		public void setLossApprovalAmount(Double lossApprovalAmount) {
			this.lossApprovalAmount = lossApprovalAmount;
		}
		public String getIsAnyPayEvaluate() {
			return isAnyPayEvaluate;
		}
		public void setIsAnyPayEvaluate(String isAnyPayEvaluate) {
			this.isAnyPayEvaluate = isAnyPayEvaluate;
		}
		public String getLastLossApprovalHandler() {
			return lastLossApprovalHandler;
		}
		public void setLastLossApprovalHandler(String lastLossApprovalHandler) {
			this.lastLossApprovalHandler = lastLossApprovalHandler;
		}
		public String getLastLossApprovalCom() {
			return lastLossApprovalCom;
		}
		public void setLastLossApprovalCom(String lastLossApprovalCom) {
			this.lastLossApprovalCom = lastLossApprovalCom;
		}
		
		
}
