package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 风险审核
 * @author chao
 *
 */
public class RuleRiskAudit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	是否总公司任务*/
	private	String 	isHeadTask;
	/**	是否提交调查*/
	private	String 	isSubmitSurvey;
	/**	调查类型*/
	private	String 	surveyType;
	/**	上一个任务类型*/
	private	String 	beforTaskType;
	/**	上一个任务分类*/
	private	String 	beforTaskClassify;
	/**每个级别上的人的数量*/
	private Map<String,Integer> everyRiskLevelPersonCount = new HashMap<String, Integer>();
	/**下一个要触发的任务*/
	private String nextRiskTask = "";
	
	public String getIsHeadTask() {
		return isHeadTask;
	}
	public void setIsHeadTask(String isHeadTask) {
		this.isHeadTask = isHeadTask;
	}
	public String getIsSubmitSurvey() {
		return isSubmitSurvey;
	}
	public void setIsSubmitSurvey(String isSubmitSurvey) {
		this.isSubmitSurvey = isSubmitSurvey;
	}
	public String getSurveyType() {
		return surveyType;
	}
	public void setSurveyType(String surveyType) {
		this.surveyType = surveyType;
	}
	public String getBeforTaskType() {
		return beforTaskType;
	}
	public void setBeforTaskType(String beforTaskType) {
		this.beforTaskType = beforTaskType;
	}
	public String getBeforTaskClassify() {
		return beforTaskClassify;
	}
	public void setBeforTaskClassify(String beforTaskClassify) {
		this.beforTaskClassify = beforTaskClassify;
	}
	public Map<String,Integer> getEveryRiskLevelPersonCount() {
		return everyRiskLevelPersonCount;
	}
	public void setEveryRiskLevelPersonCount(
			Map<String,Integer> everyRiskLevelPersonCount) {
		this.everyRiskLevelPersonCount = everyRiskLevelPersonCount;
	}
	public String getNextRiskTask() {
		return nextRiskTask;
	}
	public void setNextRiskTask(String nextRiskTask) {
		this.nextRiskTask = nextRiskTask;
	}
	
}
