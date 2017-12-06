package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * 人伤定损
 * @author chao
 *
 */
public class RulePersonLossApproval implements Serializable{
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
		/**	核损任务提交方式*/
		private	String	verifySubmitType;
		/**	上一次定损机构*/
		private	String	lastApprComCode;
		/**	上一个跟踪处理人*/
		private	String	lastPersonTraceHandler;
		/**	上一个跟踪处理机构*/
		private	String	lastPersonTraceCom;
		/**	上一个人伤调解审核处理人*/
		private	String	lastMeediateAuditHandler;
		/**	上一个人伤调解审核处理机构*/
		private	String	lastMeediateAuditCom;
		/**	上一个人伤核损员*/
		private	String	lastLossVerifyHandler;
		/**	上一个人伤核损处理机构*/
		private	String	lastLossVerifyCom;
		/**	上一个分公司人伤核损员*/
		private	String	lastBLossVerifyHandler;
		/**	上一个分公司人伤核损处理机构*/
		private	String	lastBLossVerifyCom;
		/**	上一个总公司人伤核损员*/
		private	String	lastHLossVerifyHandler;
		/**	上一个总公司人伤核损处理机构*/
		private	String	lastHLossVerifyCom;
		/**	是否经过调解*/
		private	String	isAfterMediate;
		/**	是否选择自动核损*/
		private	String	isChooseAutoLoss;
		/**	是否新增损失项*/
		private	String	isAddLossProject;
		/**	每一项定损金额是否高于调解金额*/
		private	String	lossApprovalAmountIsHigherMediateAmount;
		/**伤势程度*/
		private String injuryDegree = "";//住院-0、门诊-1、死亡-2、伤残3
		/**户口性质*/
		private String accountNature = "";//城镇户口-1、农村户口-2、经常居住在城镇-3
		/**月收入*/
		private Double monthlyIncome = 0d;
		/**日收入*/
		private Double dailyIncome = 0d;//月收入/30,保留一位小数
		/**预赔垫付审核通过案件*/
		private String isprePayAdvanceAuditAccrossCase = "";
		/**人伤定损（是否跟踪完毕选择“是”）*/
		private String isComplateTrack = "";
		/**是否为住院治疗*/
		private String hospitalFlag = "";
		public String getIsAfterMediate() {
			return isAfterMediate;
		}
		public void setIsAfterMediate(String isAfterMediate) {
			this.isAfterMediate = isAfterMediate;
		}
		public String getIsChooseAutoLoss() {
			return isChooseAutoLoss;
		}
		public void setIsChooseAutoLoss(String isChooseAutoLoss) {
			this.isChooseAutoLoss = isChooseAutoLoss;
		}
		public String getIsAddLossProject() {
			return isAddLossProject;
		}
		public void setIsAddLossProject(String isAddLossProject) {
			this.isAddLossProject = isAddLossProject;
		}
		public String getLossApprovalAmountIsHigherMediateAmount() {
			return lossApprovalAmountIsHigherMediateAmount;
		}
		public void setLossApprovalAmountIsHigherMediateAmount(
				String lossApprovalAmountIsHigherMediateAmount) {
			this.lossApprovalAmountIsHigherMediateAmount = lossApprovalAmountIsHigherMediateAmount;
		}
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
		public String getLastApprComCode() {
			return lastApprComCode;
		}
		public void setLastApprComCode(String lastApprComCode) {
			this.lastApprComCode = lastApprComCode;
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
		public String getLastLossVerifyHandler() {
			return lastLossVerifyHandler;
		}
		public void setLastLossVerifyHandler(String lastLossVerifyHandler) {
			this.lastLossVerifyHandler = lastLossVerifyHandler;
		}
		public String getLastLossVerifyCom() {
			return lastLossVerifyCom;
		}
		public void setLastLossVerifyCom(String lastLossVerifyCom) {
			this.lastLossVerifyCom = lastLossVerifyCom;
		}
		public String getInjuryDegree() {
			return injuryDegree;
		}
		public void setInjuryDegree(String injuryDegree) {
			this.injuryDegree = injuryDegree;
		}
		public String getAccountNature() {
			return accountNature;
		}
		public void setAccountNature(String accountNature) {
			this.accountNature = accountNature;
		}
		public Double getMonthlyIncome() {
			return monthlyIncome;
		}
		public void setMonthlyIncome(Double monthlyIncome) {
			this.monthlyIncome = monthlyIncome;
		}
		public Double getDailyIncome() {
			return dailyIncome;
		}
		public void setDailyIncome(Double dailyIncome) {
			this.dailyIncome = dailyIncome;
		}
		public String getIsprePayAdvanceAuditAccrossCase() {
			return isprePayAdvanceAuditAccrossCase;
		}
		public void setIsprePayAdvanceAuditAccrossCase(
				String isprePayAdvanceAuditAccrossCase) {
			this.isprePayAdvanceAuditAccrossCase = isprePayAdvanceAuditAccrossCase;
		}
		public String getIsComplateTrack() {
			return isComplateTrack;
		}
		public void setIsComplateTrack(String isComplateTrack) {
			this.isComplateTrack = isComplateTrack;
		}
		public String getHospitalFlag() {
			return hospitalFlag;
		}
		public void setHospitalFlag(String hospitalFlag) {
			this.hospitalFlag = hospitalFlag;
		}
		
	
}
