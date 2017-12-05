package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 财产核损
 * @author chao
 *
 */
public class RulePropLossAssessment implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	核损金额*/
		private	Double	lossaAmount;
		/**	风险评分*/
		private	Double	riskEvaluate;
		/**	项目名称*/
		private	String	projectName  ;
		/**	是否自保车*/
		private	String	selprecar  ;
		/**	有监督模型评分*/
		private	Double	supModelScore  ;
		/**	车辆品牌*/
		private	String	carBrand  ;
		/**	风险等级*/
		private	String	riskLevel  ;
		/**	无监督模型评分*/
		private	Double	unSupModelScore  ;
		/**	员工金额权限*/
		private	Double	employeeAmount  ;
		/**	是否损失在分公司权限内的案件*/
		private	String	isbranchautcase  ;
		/**	核价是否已提交*/
		private	String	isLossRetract  ;
		/**	核价任务提交意见*/
		private	String	lossTaskSubmitPinion  ;
		/**	是否配件审验*/
		private	String	isPartCheck  ;
		/**	是否修复验车*/
		private	String	isverifyFlag  ;
		/**	是否通赔案件*/
		private	String	isSubmitPayCase  ;
		/**车辆种类*/
		private	String	carKind  ;
		/**厂牌型号*/
		private	String	brandName  ;
		/**定损金额*/
		private	Double	totalLossAmount  ;
		/**	人员最小核损金额*/
		private	Double	userMinLossAssessment  ;
		/**	人员最大核损金额 */
		private	Double	userMaxLossAssessment  ;
		
		public Double getUserMinLossAssessment() {
			return userMinLossAssessment;
		}
		public void setUserMinLossAssessment(Double userMinLossAssessment) {
			this.userMinLossAssessment = userMinLossAssessment;
		}
		public Double getUserMaxLossAssessment() {
			return userMaxLossAssessment;
		}
		public void setUserMaxLossAssessment(Double userMaxLossAssessment) {
			this.userMaxLossAssessment = userMaxLossAssessment;
		}
		public Double getSupModelScore() {
			return supModelScore;
		}
		public void setSupModelScore(Double supModelScore) {
			this.supModelScore = supModelScore;
		}
		public Double getUnSupModelScore() {
			return unSupModelScore;
		}
		public void setUnSupModelScore(Double unSupModelScore) {
			this.unSupModelScore = unSupModelScore;
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
		public String getIsSubmitPayCase() {
			return isSubmitPayCase;
		}
		public void setIsSubmitPayCase(String isSubmitPayCase) {
			this.isSubmitPayCase = isSubmitPayCase;
		}
		public String getCarKind() {
			return carKind;
		}
		public void setCarKind(String carKind) {
			this.carKind = carKind;
		}
		public String getBrandName() {
			return brandName;
		}
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		public String getIsLossRetract() {
			return isLossRetract;
		}
		public void setIsLossRetract(String isLossRetract) {
			this.isLossRetract = isLossRetract;
		}
		public String getLossTaskSubmitPinion() {
			return lossTaskSubmitPinion;
		}
		public void setLossTaskSubmitPinion(String lossTaskSubmitPinion) {
			this.lossTaskSubmitPinion = lossTaskSubmitPinion;
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
		public Double getLossaAmount() {
			return lossaAmount;
		}
		public void setLossaAmount(Double lossaAmount) {
			this.lossaAmount = lossaAmount;
		}
		public Double getRiskEvaluate() {
			return riskEvaluate;
		}
		public void setRiskEvaluate(Double riskEvaluate) {
			this.riskEvaluate = riskEvaluate;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getSelprecar() {
			return selprecar;
		}
		public void setSelprecar(String selprecar) {
			this.selprecar = selprecar;
		}
		public String getCarBrand() {
			return carBrand;
		}
		public void setCarBrand(String carBrand) {
			this.carBrand = carBrand;
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
