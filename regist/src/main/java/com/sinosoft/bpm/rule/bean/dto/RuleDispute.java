package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 诉讼
 * @author luo
 *
 */
public class RuleDispute implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	是否申请重审*/
		private	String	isApplyReview;
		/**	是否申请上诉*/
		private	String	isApplyAppeal;
		/**	是否申请再审*/
		private	String	isApplyRetrial;
		/**	结案方式*/
		private	String	endCaseMode;
		/**	诉讼任务类型*/
		private	String	lawsuitTaskType;
		/**	诉请金额*/
		private	 Double disputeAmount;
		/**	最高审核级别*/
		private	 String maxVerifyLevel ;
		/**	案件状态*/
		private	 String caseStatus;
		/**	是否申请转仲裁*/
		private	 String isApplyArbitrament ;
		/**	诉讼审核任务提交方式*/
		private	 String lawSuitAuditSubmitType ;
		/**	人员诉讼金额*/
		private	 Double userDisputeAmount;
		
		public Double getUserDisputeAmount() {
			return userDisputeAmount;
		}
		public void setUserDisputeAmount(Double userDisputeAmount) {
			this.userDisputeAmount = userDisputeAmount;
		}
		public String getLawSuitAuditSubmitType() {
			return lawSuitAuditSubmitType;
		}
		public void setLawSuitAuditSubmitType(String lawSuitAuditSubmitType) {
			this.lawSuitAuditSubmitType = lawSuitAuditSubmitType;
		}
		public String getIsApplyReview() {
			return isApplyReview;
		}
		public void setIsApplyReview(String isApplyReview) {
			this.isApplyReview = isApplyReview;
		}
		public String getIsApplyAppeal() {
			return isApplyAppeal;
		}
		public void setIsApplyAppeal(String isApplyAppeal) {
			this.isApplyAppeal = isApplyAppeal;
		}
		public String getIsApplyRetrial() {
			return isApplyRetrial;
		}
		public void setIsApplyRetrial(String isApplyRetrial) {
			this.isApplyRetrial = isApplyRetrial;
		}
		public String getEndCaseMode() {
			return endCaseMode;
		}
		public void setEndCaseMode(String endCaseMode) {
			this.endCaseMode = endCaseMode;
		}
		public String getLawsuitTaskType() {
			return lawsuitTaskType;
		}
		public void setLawsuitTaskType(String lawsuitTaskType) {
			this.lawsuitTaskType = lawsuitTaskType;
		}
		public Double getDisputeAmount() {
			return disputeAmount;
		}
		public void setDisputeAmount(Double disputeAmount) {
			this.disputeAmount = disputeAmount;
		}
		public String getMaxVerifyLevel() {
			return maxVerifyLevel;
		}
		public void setMaxVerifyLevel(String maxVerifyLevel) {
			this.maxVerifyLevel = maxVerifyLevel;
		}
		public String getCaseStatus() {
			return caseStatus;
		}
		public void setCaseStatus(String caseStatus) {
			this.caseStatus = caseStatus;
		}
		public String getIsApplyArbitrament() {
			return isApplyArbitrament;
		}
		public void setIsApplyArbitrament(String isApplyArbitrament) {
			this.isApplyArbitrament = isApplyArbitrament;
		}
			
}
