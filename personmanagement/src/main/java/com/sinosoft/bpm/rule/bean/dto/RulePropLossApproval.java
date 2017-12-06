package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 财产定损
 * @author chao
 *
 */
public class RulePropLossApproval implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	是否同意核损意见*/
		private	String	isAgreeVerifyOpinion;
		/**	定损金额*/
		private	Double	lossApprovalAmount;
		/**	人员自动核损金额*/
		private	Double	autoVerifyAmountAuthority;
		/**	集中核损金额*/
		private	Double	concentrateVerifyAmountAuthority;
		/**	上一个核损任务类型*/
		private	String	beforLossTaskType;
		/**	上一个核损任务处理人*/
		private	String	beforLossHandleCode;
		/**	上一个分公司核损处理人*/
		private	String	beforBrachLossHandleCode;
		/**	上一个总公司一级核损任务处理人*/
		private	String	beforHeahLossHandleCode;
		/**	核损任务提交方式*/
		private	String	verifySubmitType;
		/**	上一次定损机构*/
		private	String	lastApprComCode;
		/**	是否回退的定损*/
		private	String	isBackLossApproval;
		/**损失财产中最高的单价价格*/
		private Double individualPropertyPrice = 0d;
		/**受损财产残值综合*/
		private Double damagedAssetResidualValuecomprehensive = 0d;
		/**受损财产总值*/
		private Double damagedAssetGrossValue = 0d;
		
		public String getIsBackLossApproval() {
			return isBackLossApproval;
		}
		public void setIsBackLossApproval(String isBackLossApproval) {
			this.isBackLossApproval = isBackLossApproval;
		}
		public String getIsAgreeVerifyOpinion() {
			return isAgreeVerifyOpinion;
		}
		public void setIsAgreeVerifyOpinion(String isAgreeVerifyOpinion) {
			this.isAgreeVerifyOpinion = isAgreeVerifyOpinion;
		}
		public Double getLossApprovalAmount() {
			return lossApprovalAmount;
		}
		public void setLossApprovalAmount(Double lossApprovalAmount) {
			this.lossApprovalAmount = lossApprovalAmount;
		}
		public Double getAutoVerifyAmountAuthority() {
			return autoVerifyAmountAuthority;
		}
		public void setAutoVerifyAmountAuthority(Double autoVerifyAmountAuthority) {
			this.autoVerifyAmountAuthority = autoVerifyAmountAuthority;
		}
		public Double getConcentrateVerifyAmountAuthority() {
			return concentrateVerifyAmountAuthority;
		}
		public void setConcentrateVerifyAmountAuthority(
				Double concentrateVerifyAmountAuthority) {
			this.concentrateVerifyAmountAuthority = concentrateVerifyAmountAuthority;
		}
		public String getBeforLossTaskType() {
			return beforLossTaskType;
		}
		public void setBeforLossTaskType(String beforLossTaskType) {
			this.beforLossTaskType = beforLossTaskType;
		}
		public String getBeforLossHandleCode() {
			return beforLossHandleCode;
		}
		public void setBeforLossHandleCode(String beforLossHandleCode) {
			this.beforLossHandleCode = beforLossHandleCode;
		}
		public String getBeforBrachLossHandleCode() {
			return beforBrachLossHandleCode;
		}
		public void setBeforBrachLossHandleCode(String beforBrachLossHandleCode) {
			this.beforBrachLossHandleCode = beforBrachLossHandleCode;
		}
		public String getBeforHeahLossHandleCode() {
			return beforHeahLossHandleCode;
		}
		public void setBeforHeahLossHandleCode(String beforHeahLossHandleCode) {
			this.beforHeahLossHandleCode = beforHeahLossHandleCode;
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
		public Double getIndividualPropertyPrice() {
			return individualPropertyPrice;
		}
		public void setIndividualPropertyPrice(Double individualPropertyPrice) {
			this.individualPropertyPrice = individualPropertyPrice;
		}
		public Double getDamagedAssetResidualValuecomprehensive() {
			return damagedAssetResidualValuecomprehensive;
		}
		public void setDamagedAssetResidualValuecomprehensive(
				Double damagedAssetResidualValuecomprehensive) {
			this.damagedAssetResidualValuecomprehensive = damagedAssetResidualValuecomprehensive;
		}
		public Double getDamagedAssetGrossValue() {
			return damagedAssetGrossValue;
		}
		public void setDamagedAssetGrossValue(Double damagedAssetGrossValue) {
			this.damagedAssetGrossValue = damagedAssetGrossValue;
		}
		
		
}
