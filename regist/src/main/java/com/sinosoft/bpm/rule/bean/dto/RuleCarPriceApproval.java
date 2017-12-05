package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * 车辆核价
 * @author chao
 *
 */
public class RuleCarPriceApproval implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	是否配件审验*/
		private	String isPartCheck;
		/**	是否修复验车*/
		private	String isverifyFlag;
		/**	核损是否已提交*/
		private	String isPricingRetract;
		/**	核损任务提交意见*/
		private	String pricTaskSubmitPinion;
		/**	项目名称*/
		private	String projectName;
		/**	车辆品牌*/
		private	String carBrand;
		/** 风险评分*/
		private Double riskEvaluate ;
		/**	是否增补配件*/
		private	String	supFittings;
		/**	是否自保车*/
		private	String	selprecar;
		/**	是否通赔*/
		private	String	isSubmitPay;
		/**	是否通赔任务*/
		private	String	isSubmitAllPayType;
		/**	核价金额*/
		private	Double	lossPrice;
		/**	核损金额*/
		private	Double	lossaAmount;
		/**	车辆使用性质*/
		private	String	carUseCode;
		/**	车辆种类*/
		private	String	carKind;
		/**	业务渠道*/
		private	String	businessChannel;
		/**	座位数*/
		private	Integer	seatCount;
		/**	国产车型*/
		private	String	domcars;
		/**	进口车型*/
		private	String	impcars;
		/**	换件金额*/
		private	Double	freedomamount;
		/**	单件金额*/
		private	Double	unitAmount;
		/**	市场维修配件管理费比例*/
		private	Double	manageRate;
		/**	项目金额*/
		private	Double	projectAmount;
		/**	有监督模型评分*/
		private	Double	supScoModel;
		/**	是否通赔案件*/
		private	String	isSubmitPayCase;
		/**	分公司金额权限*/
		private	Double	branchAmount ;
		/**	损余回收信息*/
		private	String	reClaim;
		/**	是否追偿*/
		private	String	isReplevy  ;
		/**	定损金额*/
		private	Double	totalLossAmount  ;
		
		
		public Double getTotalLossAmount() {
			return totalLossAmount;
		}
		public void setTotalLossAmount(Double totalLossAmount) {
			this.totalLossAmount = totalLossAmount;
		}
		public Double getBranchAmount() {
			return branchAmount;
		}
		public void setBranchAmount(Double branchAmount) {
			this.branchAmount = branchAmount;
		}
		public String getReClaim() {
			return reClaim;
		}
		public void setReClaim(String reClaim) {
			this.reClaim = reClaim;
		}
		public String getIsReplevy() {
			return isReplevy;
		}
		public void setIsReplevy(String isReplevy) {
			this.isReplevy = isReplevy;
		}
		public String getIsSubmitPayCase() {
			return isSubmitPayCase;
		}
		public void setIsSubmitPayCase(String isSubmitPayCase) {
			this.isSubmitPayCase = isSubmitPayCase;
		}
		public Double getProjectAmount() {
			return projectAmount;
		}
		public void setProjectAmount(Double projectAmount) {
			this.projectAmount = projectAmount;
		}
		public Double getSupScoModel() {
			return supScoModel;
		}
		public void setSupScoModel(Double supScoModel) {
			this.supScoModel = supScoModel;
		}
		public String getIsPartCheck() {
			return isPartCheck;
		}
		public void setIsPartCheck(String isPartCheck) {
			this.isPartCheck = isPartCheck;
		}
		public String getIsverifyFlag() {
			return isverifyFlag;
		}
		public void setIsverifyFlag(String isverifyFlag) {
			this.isverifyFlag = isverifyFlag;
		}
		public String getIsPricingRetract() {
			return isPricingRetract;
		}
		public void setIsPricingRetract(String isPricingRetract) {
			this.isPricingRetract = isPricingRetract;
		}
		public String getPricTaskSubmitPinion() {
			return pricTaskSubmitPinion;
		}
		public void setPricTaskSubmitPinion(String pricTaskSubmitPinion) {
			this.pricTaskSubmitPinion = pricTaskSubmitPinion;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getCarBrand() {
			return carBrand;
		}
		public void setCarBrand(String carBrand) {
			this.carBrand = carBrand;
		}
		public Double getRiskEvaluate() {
			return riskEvaluate;
		}
		public void setRiskEvaluate(Double riskEvaluate) {
			this.riskEvaluate = riskEvaluate;
		}
		public String getSupFittings() {
			return supFittings;
		}
		public void setSupFittings(String supFittings) {
			this.supFittings = supFittings;
		}
		public String getSelprecar() {
			return selprecar;
		}
		public void setSelprecar(String selprecar) {
			this.selprecar = selprecar;
		}
		public String getIsSubmitPay() {
			return isSubmitPay;
		}
		public void setIsSubmitPay(String isSubmitPay) {
			this.isSubmitPay = isSubmitPay;
		}
		public String getIsSubmitAllPayType() {
			return isSubmitAllPayType;
		}
		public void setIsSubmitAllPayType(String isSubmitAllPayType) {
			this.isSubmitAllPayType = isSubmitAllPayType;
		}
		public Double getLossPrice() {
			return lossPrice;
		}
		public void setLossPrice(Double lossPrice) {
			this.lossPrice = lossPrice;
		}
		public Double getLossaAmount() {
			return lossaAmount;
		}
		public void setLossaAmount(Double lossaAmount) {
			this.lossaAmount = lossaAmount;
		}
		public String getCarUseCode() {
			return carUseCode;
		}
		public void setCarUseCode(String carUseCode) {
			this.carUseCode = carUseCode;
		}
		public String getCarKind() {
			return carKind;
		}
		public void setCarKind(String carKind) {
			this.carKind = carKind;
		}
		public String getBusinessChannel() {
			return businessChannel;
		}
		public void setBusinessChannel(String businessChannel) {
			this.businessChannel = businessChannel;
		}
		public Integer getSeatCount() {
			return seatCount;
		}
		public void setSeatCount(Integer seatCount) {
			this.seatCount = seatCount;
		}
		public String getDomcars() {
			return domcars;
		}
		public void setDomcars(String domcars) {
			this.domcars = domcars;
		}
		public String getImpcars() {
			return impcars;
		}
		public void setImpcars(String impcars) {
			this.impcars = impcars;
		}
		public Double getFreedomamount() {
			return freedomamount;
		}
		public void setFreedomamount(Double freedomamount) {
			this.freedomamount = freedomamount;
		}
		public Double getUnitAmount() {
			return unitAmount;
		}
		public void setUnitAmount(Double unitAmount) {
			this.unitAmount = unitAmount;
		}
		public Double getManageRate() {
			return manageRate;
		}
		public void setManageRate(Double manageRate) {
			this.manageRate = manageRate;
		}	
}
