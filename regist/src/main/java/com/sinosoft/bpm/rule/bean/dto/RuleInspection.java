package com.sinosoft.bpm.rule.bean.dto;


import java.io.Serializable;

/**
 * 质检
 * @author chao
 *
 */
public class RuleInspection implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	是否提交总公司审核*/
		private	String	isSubmitHead ;
		/**	是否问题案件*/
		private	String	isProblemCase ;
		/**	是否调查前任务*/
		private	String	isBeforeSurvey ;
		/**	是否需要发起调查*/
		private	String	isCreateSurvey ;
		/**	调查类型*/
		private	String	sruveyType ;
		
		public String getSruveyType() {
			return sruveyType;
		}
		public void setSruveyType(String sruveyType) {
			this.sruveyType = sruveyType;
		}
		public String getIsBeforeSurvey() {
			return isBeforeSurvey;
		}
		public void setIsBeforeSurvey(String isBeforeSurvey) {
			this.isBeforeSurvey = isBeforeSurvey;
		}
		public String getIsCreateSurvey() {
			return isCreateSurvey;
		}
		public void setIsCreateSurvey(String isCreateSurvey) {
			this.isCreateSurvey = isCreateSurvey;
		}
		public String getIsSubmitHead() {
			return isSubmitHead;
		}
		public void setIsSubmitHead(String isSubmitHead) {
			this.isSubmitHead = isSubmitHead;
		}
		public String getIsProblemCase() {
			return isProblemCase;
		}
		public void setIsProblemCase(String isProblemCase) {
			this.isProblemCase = isProblemCase;
		}		
}
