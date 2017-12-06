package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * 车辆核损
 * @author chao
 *
 */
public class RuleCarLossAssessment implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	是否配件审验*/
		private	String	isPartCheck;
		/**	是否修复验车*/
		private	String	isverifyFlag;
		/**	是否损余回收*/
		private	String	lossBalanceRecycle;
		/**	核价是否已提交*/
		private	String	isLossPass;
		/**	核价任务提交意见*/
		private	String	lossTaskSubmitPinion;
		/**	核损金额*/
		private	Double	lossaAmount;
		/** 项目名称*/
		private String projectName;
		/**	项目金额*/
		private	Double	projectAmount ;
		/** 风险评分*/
		private Double riskEvaluate ;
		/**	有监督模型评分*/
		private	Double	supScoModel ;
		/** 是否自保车*/
		private String selprecar;
		/** 是否通赔*/
		private String isSubmitPay;
		/**核损人员金额权限*/
		private Double useramount;
		/**车辆品牌*/
		private String carBrand;
		/**风险等级*/
		private String riskLevel;
		/**是否监督模型*/
		private String issupemodel;
		/**反欺诈监督模型*/
		private Double antiFraudSupervisionModel;
		/**非监督模型*/
		private Double unsupervisedModel;
		/**员工金额权限*/
		private Double employeeAmount;
		/**是否损失在分公司权限内的案件*/
		private String isbranchautcase;
		/**是否通赔案件*/
		private String isSubmitPayCase;
		/**是否追偿*/
		private String isReplevy ;
		/**定损金额*/
		private Double totalLossAmount;
		/**有监督模型高风险评分*/
		private Double supHighScoModel;
		
		public Double getSupHighScoModel() {
			return supHighScoModel;
		}
		public void setSupHighScoModel(Double supHighScoModel) {
			this.supHighScoModel = supHighScoModel;
		}
		public Double getTotalLossAmount() {
			return totalLossAmount;
		}
		public void setTotalLossAmount(Double totalLossAmount) {
			this.totalLossAmount = totalLossAmount;
		}
		public String getRiskLevel() {
			return riskLevel;
		}
		public void setRiskLevel(String riskLevel) {
			this.riskLevel = riskLevel;
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
		public Double getLossaAmount() {
			return lossaAmount;
		}
		public void setLossaAmount(Double lossaAmount) {
			this.lossaAmount = lossaAmount;
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
		public String getLossBalanceRecycle() {
			return lossBalanceRecycle;
		}
		public void setLossBalanceRecycle(String lossBalanceRecycle) {
			this.lossBalanceRecycle = lossBalanceRecycle;
		}
		public String getIsLossPass() {
			return isLossPass;
		}
		public void setIsLossPass(String isLossPass) {
			this.isLossPass = isLossPass;
		}
		public String getLossTaskSubmitPinion() {
			return lossTaskSubmitPinion;
		}
		public void setLossTaskSubmitPinion(String lossTaskSubmitPinion) {
			this.lossTaskSubmitPinion = lossTaskSubmitPinion;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public Double getProjectAmount() {
			return projectAmount;
		}
		public void setProjectAmount(Double projectAmount) {
			this.projectAmount = projectAmount;
		}
		public Double getRiskEvaluate() {
			return riskEvaluate;
		}
		public void setRiskEvaluate(Double riskEvaluate) {
			this.riskEvaluate = riskEvaluate;
		}
		public Double getSupScoModel() {
			return supScoModel;
		}
		public void setSupScoModel(Double supScoModel) {
			this.supScoModel = supScoModel;
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
		public Double getUseramount() {
			return useramount;
		}
		public void setUseramount(Double useramount) {
			this.useramount = useramount;
		}
		public String getCarBrand() {
			return carBrand;
		}
		public void setCarBrand(String carBrand) {
			this.carBrand = carBrand;
		}
		public String getIssupemodel() {
			return issupemodel;
		}
		public void setIssupemodel(String issupemodel) {
			this.issupemodel = issupemodel;
		}
		public Double getAntiFraudSupervisionModel() {
			return antiFraudSupervisionModel;
		}
		public void setAntiFraudSupervisionModel(Double antiFraudSupervisionModel) {
			this.antiFraudSupervisionModel = antiFraudSupervisionModel;
		}
		public Double getUnsupervisedModel() {
			return unsupervisedModel;
		}
		public void setUnsupervisedModel(Double unsupervisedModel) {
			this.unsupervisedModel = unsupervisedModel;
		}
		public Double getEmployeeAmount() {
			return employeeAmount;
		}
		public void setEmployeeAmount(Double employeeAmount) {
			this.employeeAmount = employeeAmount;
		}
		public String getIsbranchautcase() {
			return isbranchautcase;
		}
		public void setIsbranchautcase(String isbranchautcase) {
			this.isbranchautcase = isbranchautcase;
		}
		

}
