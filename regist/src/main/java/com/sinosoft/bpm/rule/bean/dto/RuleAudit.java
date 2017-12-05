package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.sinosoft.bpm.rule.bean.model.RuleProcessInputXOM;

public class RuleAudit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 非小额案件(车物人)定损,理算完成后，核损，核赔案件的起始任务类型,等其他审核类型*/
	private String nextAuditTaskType = "";
	/** 车辆核价下一个任务*/
	private String nextCarPriceAuditTaskType = "";
	/** 人伤首掉审核最低审核级别*/
	private String personInvestigateLevel = "9";
	/** 人伤跟踪审核最低审核级别*/
	private String presonTrackLevel = "9";
	/** 预赔最低审核通过级别*/
	private String prePayLevel = "9";
	/** 垫付最低审核通过级别*/
	private String advanceLevel = "9";
	/** 理算通融赔付最低审核通过级别*/
	private String gratiaPayLevel = "9";
	/** 是否通融赔付 1是 0否 */
	private String isGratiaPay = "1";
	/** 是否通融赔付、预赔、垫付案件*/
	private String isGratiaPayOrPrePayOrAdvanceCase = "N";
	/** 车辆核价最低审核通过级别*/
	private String carLossPriceLevel = "9";
	/** 车辆核价对应级别*/
	private Map<String, String> catalogssCarOfLossPrice = new HashMap<String, String>();
	/** 车辆核价是否自动完成*/
	private String isAutoComplateCarLossPrice = "N";
	/** 车辆核价审核是否自动完成*/
	private String isAutoSubmitCarLossPriceAudit = "N";
	/** 车辆核价审核是否自动逐级提交*/
	private String isAutoSubmitCarLossPriceGradually = "N";
	/** 车辆核损审核是否自动逐级提交*/
	private String isAutoComplateCarLossVerify = "N";
	/** 人伤调解审核通过级别*/
	private String presonMediateLevel = "9";
	/** 通融案件的每个级别伤分配的人*/
	private Map<String, Integer> everyCountIngratiaPay = new HashMap<String, Integer>();
	public Map<String, Integer> getEveryCountIngratiaPay() {
		return everyCountIngratiaPay;
	}

	public void setEveryCountIngratiaPay(Map<String, Integer> everyCountIngratiaPay) {
		this.everyCountIngratiaPay = everyCountIngratiaPay;
	}

	public String getNextAuditTaskType() {
		return nextAuditTaskType;
	}

	public void setNextAuditTaskType(String nextAuditTaskType) {
		this.nextAuditTaskType = nextAuditTaskType;
	}

	public String getPersonInvestigateLevel() {
		return personInvestigateLevel;
	}

	public void setPersonInvestigateLevel(String personInvestigateLevel) {
		this.personInvestigateLevel = personInvestigateLevel;
	}

	public String getPresonTrackLevel() {
		return presonTrackLevel;
	}

	public void setPresonTrackLevel(String presonTrackLevel) {
		this.presonTrackLevel = presonTrackLevel;
	}

	public String getPrePayLevel() {
		return prePayLevel;
	}

	public void setPrePayLevel(String prePayLevel) {
		this.prePayLevel = prePayLevel;
	}

	public String getAdvanceLevel() {
		return advanceLevel;
	}

	public void setAdvanceLevel(String advanceLevel) {
		this.advanceLevel = advanceLevel;
	}

	public String getGratiaPayLevel() {
		return gratiaPayLevel;
	}

	public void setGratiaPayLevel(String gratiaPayLevel) {
		this.gratiaPayLevel = gratiaPayLevel;
	}

	public String getIsGratiaPay() {
		return isGratiaPay;
	}

	public void setIsGratiaPay(String isGratiaPay) {
		this.isGratiaPay = isGratiaPay;
	}

	public String getIsGratiaPayOrPrePayOrAdvanceCase() {
		return isGratiaPayOrPrePayOrAdvanceCase;
	}

	public void setIsGratiaPayOrPrePayOrAdvanceCase(
			String isGratiaPayOrPrePayOrAdvanceCase) {
		this.isGratiaPayOrPrePayOrAdvanceCase = isGratiaPayOrPrePayOrAdvanceCase;
	}

	public String getCarLossPriceLevel() {
		return carLossPriceLevel;
	}

	public void setCarLossPriceLevel(String carLossPriceLevel) {
		this.carLossPriceLevel = carLossPriceLevel;
	}

	public String getNextCarPriceAuditTaskType() {
		return nextCarPriceAuditTaskType;
	}

	public void setNextCarPriceAuditTaskType(String nextCarPriceAuditTaskType) {
		this.nextCarPriceAuditTaskType = nextCarPriceAuditTaskType;
	}

	public String getIsAutoComplateCarLossPrice() {
		return isAutoComplateCarLossPrice;
	}

	public void setIsAutoComplateCarLossPrice(String isAutoComplateCarLossPrice) {
		this.isAutoComplateCarLossPrice = isAutoComplateCarLossPrice;
	}

	public String getIsAutoSubmitCarLossPriceAudit() {
		return isAutoSubmitCarLossPriceAudit;
	}

	public void setIsAutoSubmitCarLossPriceAudit(
			String isAutoSubmitCarLossPriceAudit) {
		this.isAutoSubmitCarLossPriceAudit = isAutoSubmitCarLossPriceAudit;
	}

	public String getIsAutoSubmitCarLossPriceGradually() {
		return isAutoSubmitCarLossPriceGradually;
	}

	public void setIsAutoSubmitCarLossPriceGradually(
			String isAutoSubmitCarLossPriceGradually) {
		this.isAutoSubmitCarLossPriceGradually = isAutoSubmitCarLossPriceGradually;
	}
	
	public Map<String, String> getCatalogssCarOfLossPrice() {
		return catalogssCarOfLossPrice;
	}

	public void setCatalogssCarOfLossPrice(
			Map<String, String> catalogssCarOfLossPrice) {
		this.catalogssCarOfLossPrice = catalogssCarOfLossPrice;
	}

	public boolean isPass(RuleProcessInputXOM input){
		String powerLevel = input.getRuleInputCommon().getPowerLevel();
		if("".equals(powerLevel) || null == powerLevel){
			return true;
		}else{
			String currentLevelStr = input.getRuleAudit().getCatalogssCarOfLossPrice().get(input.getTaskType());
			if(currentLevelStr == null || "".equals(currentLevelStr)){
				return true;
			}else{
				return Integer.parseInt(powerLevel) <= Integer.parseInt(currentLevelStr);
			}
		}
	}

	public String getPresonMediateLevel() {
		return presonMediateLevel;
	}

	public void setPresonMediateLevel(String presonMediateLevel) {
		this.presonMediateLevel = presonMediateLevel;
	}

	public String getIsAutoComplateCarLossVerify() {
		return isAutoComplateCarLossVerify;
	}

	public void setIsAutoComplateCarLossVerify(String isAutoComplateCarLossVerify) {
		this.isAutoComplateCarLossVerify = isAutoComplateCarLossVerify;
	}
	
}
