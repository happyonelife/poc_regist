package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import cn.sinosoft.claim.base.page.car.PrpLcarComponentPage;


/**
 * 车辆定损
 * @author chao
 *
 */
public class RuleCarLossApproval implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	核损是否回退*/
		private	String	isVerifyBack;
		/**	核价是否回退*/
		private	String	isVeripBack;
		/**	换件数量是否减少*/
		private	String	isCompLess;	
		/**	人员简易案件金额*/
		private	Double	simpleCaseAmountAuthority=0.0;
		/**	人员自动核价金额*/
		private	Double	autoVeripAmountAuthority=0.0;
		/**	是否同意核价意见*/
		private	String	isAgreePriceOpinion="N";
		/**	是否同意核损意见*/
		private	String	isAgreeVerifyOpinion="N";
		/**是否增补配件*/
		private String isAddAccessory="N";
		/**是否有新增换件*/
		private String isAddComp;
		/**是否调高换件金额*/
		private String isIncreaseComp;
		/**	管理费比例率（%）*/
		private	Double	manageFeeRate;
		/**车辆品牌**/
		private	String	carBrand ;
		/** 人员自动核损金额*/
		private Double autoVerifyAmountAuthority=0.0 ;
		/**总定损金额是否调高**/
		private	String	isIncreaseSumLoss ;
		/**车系**/
		private	String	cars ;
		/**单个换件的最高金额**/
		private	Double	maxUnitAmount ;
		/**是否超过参考价**/
		private	String	isExceedReferPrice ; 
		/**是否有新增项目**/
		private	String	isAddProject ;
		/**定损金额**/
		private	Double	lossApprovalAmount ;
		/**是否存在非外修换件**/
		private	String	isExistUnThirdFactoryChgComp ;
		/**换件金额**/
		private	Double	chgCompFee ;
		/**	是否存在分公司核价人员*/
		private	String	isBrachPriceUser;
		/**	是否存在分公司核损人员*/
		private	String	isBrachLossUser;
		/**	回退前核价任务分类*/
		private	String	backVeripTaskClassify;
		/**	回退前核价任务类型*/
		private	String	backVeripTaskType;
		/**	回退前核损任务分类*/
		private	String	backVerifyTaskClassify;
		/**	回退前核损任务类型*/
		private	String	backVerifyTaskType;
		/**车系管理费率**/
		private	Double	carManageRateAuth=0.0 ;
		/**车系单件金额**/
		private	Double	carUnitAmountAuth=0.0 ;
		/**车系换件金额**/
		private	Double	carChgCompFeeAuth=0.0 ;
		/**	是否渠道业务*/
		private	String	isBusinessChannel;
		/**	是否有自动核价权限*/
		private	String	isAutoAmountAuthority;
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
		/**	车系标志*/
		private	String	carsFlag="";
		/**	是否有项目权限*/
		private	String	isProjectAuthority="N";
		/** 核价任务提交方式 */
		private String priceSubmitType;
		/** 核损任务提交方式 */
		private String verifySubmitType;
		/**人员核价项目金额**/
		private	Double	userPriceProjectAmount=0.0 ;
		/**人员核损项目金额**/
		private	Double	userVerifyProjectAmount=0.0 ;
		/** 上一次定损机构 */
		private String lastApprComCode;
		/** 上次定损是否产生核价 */
		private String isPriceExists;
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
		/** 是否回退的定损 */
		private String isBackLossApproval;
		/** 车型国别 */
		private String carCountryNature="D";
		/** 定损时间*/
		private Date lossApprovalTime = new Date();
		/** 查勘时间*/
		private Date checkTime = new Date();
		/** 险别保额*/
		private Double riskInsured = 0d;
		/** 施救费金额*/
		private Double rescueFeeAmount = 0d;
		/** 车损险保额*/
		private Double carLossInsuranceCoverage = 0d;
		/** 自定义配件总金额*/
		private Double allCustomComponentAmount = 0d;
		/** 总配件金额*/
		private Double allComponentAmount = 0d;
		/** 配件信息*/
		private ArrayList<PrpLcarComponentPage> componentLists = new ArrayList<PrpLcarComponentPage>();
		/**自定义配件比例*/
		private Double customComponentProportion = 0d;
			
		public String getCarCountryNature() {
			return carCountryNature;
		}
		public void setCarCountryNature(String carCountryNature) {
			this.carCountryNature = carCountryNature;
		}
		public String getIsBackLossApproval() {
			return isBackLossApproval;
		}
		public void setIsBackLossApproval(String isBackLossApproval) {
			this.isBackLossApproval = isBackLossApproval;
		}
		public String getIsVerifyBack() {
			return isVerifyBack;
		}
		public void setIsVerifyBack(String isVerifyBack) {
			this.isVerifyBack = isVerifyBack;
		}
		public String getIsVeripBack() {
			return isVeripBack;
		}
		public void setIsVeripBack(String isVeripBack) {
			this.isVeripBack = isVeripBack;
		}
		public String getIsCompLess() {
			return isCompLess;
		}
		public void setIsCompLess(String isCompLess) {
			this.isCompLess = isCompLess;
		}
		public Double getSimpleCaseAmountAuthority() {
			return simpleCaseAmountAuthority;
		}
		public void setSimpleCaseAmountAuthority(Double simpleCaseAmountAuthority) {
			this.simpleCaseAmountAuthority = simpleCaseAmountAuthority;
		}
		public Double getAutoVeripAmountAuthority() {
			return autoVeripAmountAuthority;
		}
		public void setAutoVeripAmountAuthority(Double autoVeripAmountAuthority) {
			this.autoVeripAmountAuthority = autoVeripAmountAuthority;
		}
		public String getIsAgreePriceOpinion() {
			return isAgreePriceOpinion;
		}
		public void setIsAgreePriceOpinion(String isAgreePriceOpinion) {
			this.isAgreePriceOpinion = isAgreePriceOpinion;
		}
		public String getIsAgreeVerifyOpinion() {
			return isAgreeVerifyOpinion;
		}
		public void setIsAgreeVerifyOpinion(String isAgreeVerifyOpinion) {
			this.isAgreeVerifyOpinion = isAgreeVerifyOpinion;
		}
		public String getIsAddAccessory() {
			return isAddAccessory;
		}
		public void setIsAddAccessory(String isAddAccessory) {
			this.isAddAccessory = isAddAccessory;
		}
		public String getIsAddComp() {
			return isAddComp;
		}
		public void setIsAddComp(String isAddComp) {
			this.isAddComp = isAddComp;
		}
		public String getIsIncreaseComp() {
			return isIncreaseComp;
		}
		public void setIsIncreaseComp(String isIncreaseComp) {
			this.isIncreaseComp = isIncreaseComp;
		}
		public Double getManageFeeRate() {
			return manageFeeRate;
		}
		public void setManageFeeRate(Double manageFeeRate) {
			this.manageFeeRate = manageFeeRate;
		}
		public String getCarBrand() {
			return carBrand;
		}
		public void setCarBrand(String carBrand) {
			this.carBrand = carBrand;
		}
		public Double getAutoVerifyAmountAuthority() {
			return autoVerifyAmountAuthority;
		}
		public void setAutoVerifyAmountAuthority(Double autoVerifyAmountAuthority) {
			this.autoVerifyAmountAuthority = autoVerifyAmountAuthority;
		}
		public String getIsIncreaseSumLoss() {
			return isIncreaseSumLoss;
		}
		public void setIsIncreaseSumLoss(String isIncreaseSumLoss) {
			this.isIncreaseSumLoss = isIncreaseSumLoss;
		}
		public String getCars() {
			return cars;
		}
		public void setCars(String cars) {
			this.cars = cars;
		}
		public Double getMaxUnitAmount() {
			return maxUnitAmount;
		}
		public void setMaxUnitAmount(Double maxUnitAmount) {
			this.maxUnitAmount = maxUnitAmount;
		}
		public String getIsExceedReferPrice() {
			return isExceedReferPrice;
		}
		public void setIsExceedReferPrice(String isExceedReferPrice) {
			this.isExceedReferPrice = isExceedReferPrice;
		}
		public String getIsAddProject() {
			return isAddProject;
		}
		public void setIsAddProject(String isAddProject) {
			this.isAddProject = isAddProject;
		}
		public Double getLossApprovalAmount() {
			return lossApprovalAmount;
		}
		public void setLossApprovalAmount(Double lossApprovalAmount) {
			this.lossApprovalAmount = lossApprovalAmount;
		}
		public String getIsExistUnThirdFactoryChgComp() {
			return isExistUnThirdFactoryChgComp;
		}
		public void setIsExistUnThirdFactoryChgComp(String isExistUnThirdFactoryChgComp) {
			this.isExistUnThirdFactoryChgComp = isExistUnThirdFactoryChgComp;
		}
		public Double getChgCompFee() {
			return chgCompFee;
		}
		public void setChgCompFee(Double chgCompFee) {
			this.chgCompFee = chgCompFee;
		}
		public String getIsBrachPriceUser() {
			return isBrachPriceUser;
		}
		public void setIsBrachPriceUser(String isBrachPriceUser) {
			this.isBrachPriceUser = isBrachPriceUser;
		}
		public String getIsBrachLossUser() {
			return isBrachLossUser;
		}
		public void setIsBrachLossUser(String isBrachLossUser) {
			this.isBrachLossUser = isBrachLossUser;
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
		public Double getCarManageRateAuth() {
			return carManageRateAuth;
		}
		public void setCarManageRateAuth(Double carManageRateAuth) {
			this.carManageRateAuth = carManageRateAuth;
		}
		public Double getCarUnitAmountAuth() {
			return carUnitAmountAuth;
		}
		public void setCarUnitAmountAuth(Double carUnitAmountAuth) {
			this.carUnitAmountAuth = carUnitAmountAuth;
		}
		public Double getCarChgCompFeeAuth() {
			return carChgCompFeeAuth;
		}
		public void setCarChgCompFeeAuth(Double carChgCompFeeAuth) {
			this.carChgCompFeeAuth = carChgCompFeeAuth;
		}
		public String getIsBusinessChannel() {
			return isBusinessChannel;
		}
		public void setIsBusinessChannel(String isBusinessChannel) {
			this.isBusinessChannel = isBusinessChannel;
		}
		public String getIsAutoAmountAuthority() {
			return isAutoAmountAuthority;
		}
		public void setIsAutoAmountAuthority(String isAutoAmountAuthority) {
			this.isAutoAmountAuthority = isAutoAmountAuthority;
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
		public String getCarsFlag() {
			return carsFlag;
		}
		public void setCarsFlag(String carsFlag) {
			this.carsFlag = carsFlag;
		}
		public String getIsProjectAuthority() {
			return isProjectAuthority;
		}
		public void setIsProjectAuthority(String isProjectAuthority) {
			this.isProjectAuthority = isProjectAuthority;
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
		public Double getUserPriceProjectAmount() {
			return userPriceProjectAmount;
		}
		public void setUserPriceProjectAmount(Double userPriceProjectAmount) {
			this.userPriceProjectAmount = userPriceProjectAmount;
		}
		public Double getUserVerifyProjectAmount() {
			return userVerifyProjectAmount;
		}
		public void setUserVerifyProjectAmount(Double userVerifyProjectAmount) {
			this.userVerifyProjectAmount = userVerifyProjectAmount;
		}
		public String getLastApprComCode() {
			return lastApprComCode;
		}
		public void setLastApprComCode(String lastApprComCode) {
			this.lastApprComCode = lastApprComCode;
		}
		public String getIsPriceExists() {
			return isPriceExists;
		}
		public void setIsPriceExists(String isPriceExists) {
			this.isPriceExists = isPriceExists;
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
		public Date getLossApprovalTime() {
			return lossApprovalTime;
		}
		public void setLossApprovalTime(Date lossApprovalTime) {
			this.lossApprovalTime = lossApprovalTime;
		}
		public Date getCheckTime() {
			return checkTime;
		}
		public void setCheckTime(Date checkTime) {
			this.checkTime = checkTime;
		}
		public Double getRiskInsured() {
			return riskInsured;
		}
		public void setRiskInsured(Double riskInsured) {
			this.riskInsured = riskInsured;
		}
		public Double getRescueFeeAmount() {
			return rescueFeeAmount;
		}
		public void setRescueFeeAmount(Double rescueFeeAmount) {
			this.rescueFeeAmount = rescueFeeAmount;
		}
		public Double getCarLossInsuranceCoverage() {
			return carLossInsuranceCoverage;
		}
		public void setCarLossInsuranceCoverage(Double carLossInsuranceCoverage) {
			this.carLossInsuranceCoverage = carLossInsuranceCoverage;
		}
		public Double getAllCustomComponentAmount() {
			return allCustomComponentAmount;
		}
		public void setAllCustomComponentAmount(Double allCustomComponentAmount) {
			this.allCustomComponentAmount = allCustomComponentAmount;
		}
		public Double getAllComponentAmount() {
			return allComponentAmount;
		}
		public void setAllComponentAmount(Double allComponentAmount) {
			this.allComponentAmount = allComponentAmount;
		}
		public ArrayList<PrpLcarComponentPage> getComponentLists() {
			return componentLists;
		}
		public void setComponentLists(ArrayList<PrpLcarComponentPage> componentLists) {
			this.componentLists = componentLists;
		}
		public Double getCustomComponentProportion() {
			return customComponentProportion;
		}
		public void setCustomComponentProportion(
				Double customComponentProportion) {
			this.customComponentProportion = customComponentProportion;
		}
}
