package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * 仲裁
 * @author chao
 *
 */
public class RuleArbitration implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	是否发起仲裁救济*/
		private	String	isInitiateArbitrationRelief;
		/**	最高审核级别*/
		private	String	maxVerifyLevel;
		/**	结案方式*/
		private	String	endCaseMode;
		/**	诉请金额*/
		private	Double disputeAmount;
		/**	案件状态*/
		private	 String caseStatus;
		/**	仲裁审核任务提交方式*/
		private	 String arbitrationAuditSubmitType;
		/**	人员仲裁金额*/
		private	Double userArbitrationAmount;
		/**	仲裁任务类型*/
		private	String	arbitrationTaskType;
		
		public String getArbitrationTaskType() {
			return arbitrationTaskType;
		}
		public void setArbitrationTaskType(String arbitrationTaskType) {
			this.arbitrationTaskType = arbitrationTaskType;
		}
		public Double getUserArbitrationAmount() {
			return userArbitrationAmount;
		}
		public void setUserArbitrationAmount(Double userArbitrationAmount) {
			this.userArbitrationAmount = userArbitrationAmount;
		}
		public String getArbitrationAuditSubmitType() {
			return arbitrationAuditSubmitType;
		}
		public void setArbitrationAuditSubmitType(String arbitrationAuditSubmitType) {
			this.arbitrationAuditSubmitType = arbitrationAuditSubmitType;
		}
		public String getIsInitiateArbitrationRelief() {
			return isInitiateArbitrationRelief;
		}
		public void setIsInitiateArbitrationRelief(String isInitiateArbitrationRelief) {
			this.isInitiateArbitrationRelief = isInitiateArbitrationRelief;
		}
		public String getMaxVerifyLevel() {
			return maxVerifyLevel;
		}
		public void setMaxVerifyLevel(String maxVerifyLevel) {
			this.maxVerifyLevel = maxVerifyLevel;
		}
		public String getEndCaseMode() {
			return endCaseMode;
		}
		public void setEndCaseMode(String endCaseMode) {
			this.endCaseMode = endCaseMode;
		}
		public Double getDisputeAmount() {
			return disputeAmount;
		}
		public void setDisputeAmount(Double disputeAmount) {
			this.disputeAmount = disputeAmount;
		}
		public String getCaseStatus() {
			return caseStatus;
		}
		public void setCaseStatus(String caseStatus) {
			this.caseStatus = caseStatus;
		}
		
}
