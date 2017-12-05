package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 追加定损信息
 * @author chao
 *
 */
public class RuleCarAppendlossApproval implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	是否存在非外修换件*/
		private	String	isExistUnThirdFactoryChgComp;
		/**	分公司是否有核价人员*/
		private	String	isBrachLossUser;
		/**	定损金额*/
		private	Double	lossApprovalAmount;
		/**	总定损金额是否调高*/
		private	String	isIncreaseSumLoss;
		/**	是否增补配件*/
		private	String	isAddAccessory;
		/**	车辆品牌*/
		private	String	carBrand;
		/**	核价是否回退*/
		private	String	isVeripBack;
		/**	是否同意核价意见*/
		private	String	isAgreeVeripOpinion;
		/**	是否调高换件金额*/
		private	String	isIncreaseComp;
		/**	是否存在分公司核价人员*/
		private	String	isBrachPriceUser;
		/**核损是否回退*/
		private	String	isVerifyBack;
		/**是否同意核损意见*/
		private	String	isAgreeVerifyOpinion;
		/**回退前核价任务分类*/
		private	String	backVeripTaskClassify;
		/**回退前核价任务类型*/
		private	String	backVeripTaskType;
		/**回退前核损任务分类*/
		private	String	backVerifyTaskClassify;
		/**回退前核损任务类型*/
		private	String	backVerifyTaskType;
		/**是否有新增项目*/
		private	String	isAddProject;
		/**是否有新增换件*/
		private	String	isAddComp;
		/**上一个核价是否自动通过*/
		private	String	isbeforPriceAutoComplete;
		/**	上一个核价任务类型*/
		private	String	beforPriceTaskType;
		/**	上一个核价任务处理人*/
		private	String	beforPriceHandleCode;
		/**	上一个分公司核价处理人*/
		private	String	beforBrachPriceHandleCode;
		/**上一个核损是否自动通过*/
		private	String	isbeforLossAutoComplete ;
		/**	上一个核损任务类型*/
		private	String	beforLossTaskType;
		/**	上一个核损任务处理人*/
		private	String	beforLossHandleCode;
		/**	上一个分公司核损处理人*/
		private	String	beforBrachLossHandleCode;
		/**	上一个总公司一级核损任务处理人*/
		private	String	beforHeahLossHandleCode;
		/** 核价任务提交方式 */
		private String priceSubmitType;
		/** 核损任务提交方式 */
		private String verifySubmitType;
		/** 是否调高单件换件金额 */
		private String isAdjustUntilHighChgComp;
		/** 单项工时是否调高 */
		private String isIncreaseRepariFee;
		/** 辅料单价是否调高 */
		private String isIncreaseMaterialFee;
		/** 非外修换件是否变化 */
		private String isCompChange;
		/** 非外修换件数量是否有变化 */
		private String isCompCountChange;
		/** 是否调高换件单价 */
		private String isIncreaseUntComp;
		/** 其它费用项目是否有变化 */
		private String isOtherProjectChange;
		/** 其它费用项目金额是否有变化 */
		private String isOtherFeeChange;
		/** 辅料数量是否调高 */
		private String isIncreaseMaterialCount;
	
		public String getIsExistUnThirdFactoryChgComp() {
			return isExistUnThirdFactoryChgComp;
		}
		public void setIsExistUnThirdFactoryChgComp(String isExistUnThirdFactoryChgComp) {
			this.isExistUnThirdFactoryChgComp = isExistUnThirdFactoryChgComp;
		}
		public String getIsBrachLossUser() {
			return isBrachLossUser;
		}
		public void setIsBrachLossUser(String isBrachLossUser) {
			this.isBrachLossUser = isBrachLossUser;
		}
		public Double getLossApprovalAmount() {
			return lossApprovalAmount;
		}
		public void setLossApprovalAmount(Double lossApprovalAmount) {
			this.lossApprovalAmount = lossApprovalAmount;
		}
		public String getIsIncreaseSumLoss() {
			return isIncreaseSumLoss;
		}
		public void setIsIncreaseSumLoss(String isIncreaseSumLoss) {
			this.isIncreaseSumLoss = isIncreaseSumLoss;
		}
		public String getIsAddAccessory() {
			return isAddAccessory;
		}
		public void setIsAddAccessory(String isAddAccessory) {
			this.isAddAccessory = isAddAccessory;
		}
		public String getCarBrand() {
			return carBrand;
		}
		public void setCarBrand(String carBrand) {
			this.carBrand = carBrand;
		}
		public String getIsVeripBack() {
			return isVeripBack;
		}
		public void setIsVeripBack(String isVeripBack) {
			this.isVeripBack = isVeripBack;
		}
		public String getIsAgreeVeripOpinion() {
			return isAgreeVeripOpinion;
		}
		public void setIsAgreeVeripOpinion(String isAgreeVeripOpinion) {
			this.isAgreeVeripOpinion = isAgreeVeripOpinion;
		}
		public String getIsIncreaseComp() {
			return isIncreaseComp;
		}
		public void setIsIncreaseComp(String isIncreaseComp) {
			this.isIncreaseComp = isIncreaseComp;
		}
		public String getIsBrachPriceUser() {
			return isBrachPriceUser;
		}
		public void setIsBrachPriceUser(String isBrachPriceUser) {
			this.isBrachPriceUser = isBrachPriceUser;
		}
		public String getIsVerifyBack() {
			return isVerifyBack;
		}
		public void setIsVerifyBack(String isVerifyBack) {
			this.isVerifyBack = isVerifyBack;
		}
		public String getIsAgreeVerifyOpinion() {
			return isAgreeVerifyOpinion;
		}
		public void setIsAgreeVerifyOpinion(String isAgreeVerifyOpinion) {
			this.isAgreeVerifyOpinion = isAgreeVerifyOpinion;
		}
		public String getBackVeripTaskClassify() {
			return backVeripTaskClassify;
		}
		public void setBackVeripTaskClassify(String backVeripTaskClassify) {
			this.backVeripTaskClassify = backVeripTaskClassify;
		}
		public String getBackVeripTaskType() {
			return backVeripTaskType;
		}
		public void setBackVeripTaskType(String backVeripTaskType) {
			this.backVeripTaskType = backVeripTaskType;
		}
		public String getBackVerifyTaskClassify() {
			return backVerifyTaskClassify;
		}
		public void setBackVerifyTaskClassify(String backVerifyTaskClassify) {
			this.backVerifyTaskClassify = backVerifyTaskClassify;
		}
		public String getBackVerifyTaskType() {
			return backVerifyTaskType;
		}
		public void setBackVerifyTaskType(String backVerifyTaskType) {
			this.backVerifyTaskType = backVerifyTaskType;
		}
		public String getIsAddProject() {
			return isAddProject;
		}
		public void setIsAddProject(String isAddProject) {
			this.isAddProject = isAddProject;
		}
		public String getIsAddComp() {
			return isAddComp;
		}
		public void setIsAddComp(String isAddComp) {
			this.isAddComp = isAddComp;
		}
		public String getIsbeforPriceAutoComplete() {
			return isbeforPriceAutoComplete;
		}
		public void setIsbeforPriceAutoComplete(String isbeforPriceAutoComplete) {
			this.isbeforPriceAutoComplete = isbeforPriceAutoComplete;
		}
		public String getBeforPriceTaskType() {
			return beforPriceTaskType;
		}
		public void setBeforPriceTaskType(String beforPriceTaskType) {
			this.beforPriceTaskType = beforPriceTaskType;
		}
		public String getBeforPriceHandleCode() {
			return beforPriceHandleCode;
		}
		public void setBeforPriceHandleCode(String beforPriceHandleCode) {
			this.beforPriceHandleCode = beforPriceHandleCode;
		}
		public String getBeforBrachPriceHandleCode() {
			return beforBrachPriceHandleCode;
		}
		public void setBeforBrachPriceHandleCode(String beforBrachPriceHandleCode) {
			this.beforBrachPriceHandleCode = beforBrachPriceHandleCode;
		}
		public String getIsbeforLossAutoComplete() {
			return isbeforLossAutoComplete;
		}
		public void setIsbeforLossAutoComplete(String isbeforLossAutoComplete) {
			this.isbeforLossAutoComplete = isbeforLossAutoComplete;
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
		public String getPriceSubmitType() {
			return priceSubmitType;
		}
		public void setPriceSubmitType(String priceSubmitType) {
			this.priceSubmitType = priceSubmitType;
		}
		public String getVerifySubmitType() {
			return verifySubmitType;
		}
		public void setVerifySubmitType(String verifySubmitType) {
			this.verifySubmitType = verifySubmitType;
		}
		public String getIsAdjustUntilHighChgComp() {
			return isAdjustUntilHighChgComp;
		}
		public void setIsAdjustUntilHighChgComp(String isAdjustUntilHighChgComp) {
			this.isAdjustUntilHighChgComp = isAdjustUntilHighChgComp;
		}
		public String getIsIncreaseRepariFee() {
			return isIncreaseRepariFee;
		}
		public void setIsIncreaseRepariFee(String isIncreaseRepariFee) {
			this.isIncreaseRepariFee = isIncreaseRepariFee;
		}
		public String getIsIncreaseMaterialFee() {
			return isIncreaseMaterialFee;
		}
		public void setIsIncreaseMaterialFee(String isIncreaseMaterialFee) {
			this.isIncreaseMaterialFee = isIncreaseMaterialFee;
		}
		public String getIsCompChange() {
			return isCompChange;
		}
		public void setIsCompChange(String isCompChange) {
			this.isCompChange = isCompChange;
		}
		public String getIsCompCountChange() {
			return isCompCountChange;
		}
		public void setIsCompCountChange(String isCompCountChange) {
			this.isCompCountChange = isCompCountChange;
		}
		public String getIsIncreaseUntComp() {
			return isIncreaseUntComp;
		}
		public void setIsIncreaseUntComp(String isIncreaseUntComp) {
			this.isIncreaseUntComp = isIncreaseUntComp;
		}
		public String getIsOtherProjectChange() {
			return isOtherProjectChange;
		}
		public void setIsOtherProjectChange(String isOtherProjectChange) {
			this.isOtherProjectChange = isOtherProjectChange;
		}
		public String getIsOtherFeeChange() {
			return isOtherFeeChange;
		}
		public void setIsOtherFeeChange(String isOtherFeeChange) {
			this.isOtherFeeChange = isOtherFeeChange;
		}
		public String getIsIncreaseMaterialCount() {
			return isIncreaseMaterialCount;
		}
		public void setIsIncreaseMaterialCount(String isIncreaseMaterialCount) {
			this.isIncreaseMaterialCount = isIncreaseMaterialCount;
		}
		
	
}
