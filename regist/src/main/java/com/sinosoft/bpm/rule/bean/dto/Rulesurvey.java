package com.sinosoft.bpm.rule.bean.dto;

/**
 * 调查
 * @author chao
 *
 */
public class Rulesurvey {
	/**	是否总公司质检任务*/
	private	String 	isHeadInspectionTask;
	/**	质检与调查结果是否一至*/
	private	String 	isInspectionSurveyAgreement;
	
	public String getIsHeadInspectionTask() {
		return isHeadInspectionTask;
	}
	public void setIsHeadInspectionTask(String isHeadInspectionTask) {
		this.isHeadInspectionTask = isHeadInspectionTask;
	}
	public String getIsInspectionSurveyAgreement() {
		return isInspectionSurveyAgreement;
	}
	public void setIsInspectionSurveyAgreement(String isInspectionSurveyAgreement) {
		this.isInspectionSurveyAgreement = isInspectionSurveyAgreement;
	}
	
	
}
