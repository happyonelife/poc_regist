package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;
import java.util.Date;


/**
 * 查勘
 * @author chao
 *
 */
public class RuleCheck implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	整案估损金额*/
		private	Double	sumEstimateLoss;
		/**	报案风险等级*/
		private	String	registRiskLevel;
		/**	报案有监督模型风险评分*/
		private	Double	registSupModelScore=0.0;
		/**	报案无监督模型风险评分*/
		private	Double	registUnsupModelScore=0.0;
		/**	查勘风险等级*/
		private	String	checkRiskLevel;
		/**	查勘有监督模型风险评分*/
		private	Double	checkSupModelScore=0.0;
		/**	查勘无监督模型风险评分*/
		private	Double	checkUnsupModelScore=0.0;
		/**	标的车损失*/
		private	Double	itemCarLoss;
		/**	是否有盗抢损失*/
		private	String	isRobOrTheft;
		/**	是否有水淹损失*/
		private	String	isInundation;
		/**	三者车财损失*/
		private	Double	thirdPartyVehiclePropLoss;
		/**	是否有火烧(自燃)损失*/
		private	String	isNatureLoss;
		/**	风险审核标志*/
		private	String	riskAuditFlag="";
		/**	高保额车型车损保额*/
		private Double highCoverageCarDamageInsurance = 0d;
		/**	保单起期*/
		private Date policyStartTime = new Date();
		/**	保单止期*/
		private Date policyEndTime = new Date();
		/**	事故时间*/
		private Date accidentOccurTime = new Date();
		/**	事故详细时间*/
		private String accidentDetailsTime = "";
		/**	出险车辆使用多少年*/
		private Integer manyYearsUseOfOutDangerCar = 0;
		/**	出险地点*/
		private String placesOfOutDanger = "";
		/**	事故处理部门*/
		private String accidentHandlingDepartment = "";
		/**	报案信息有修改*/
		private String isRegistModify = "";
		/**	非现场报案*/
		private String isReportOnThespot = "";
		/**	过户车辆提示*/
		private String isTransferVehicle = "";
		public String getRiskAuditFlag() {
			return riskAuditFlag;
		}
		public void setRiskAuditFlag(String riskAuditFlag) {
			this.riskAuditFlag = riskAuditFlag;
		}
		public String getIsRobOrTheft() {
			return isRobOrTheft;
		}
		public void setIsRobOrTheft(String isRobOrTheft) {
			this.isRobOrTheft = isRobOrTheft;
		}
		public String getIsInundation() {
			return isInundation;
		}
		public void setIsInundation(String isInundation) {
			this.isInundation = isInundation;
		}
		public Double getThirdPartyVehiclePropLoss() {
			return thirdPartyVehiclePropLoss;
		}
		public void setThirdPartyVehiclePropLoss(Double thirdPartyVehiclePropLoss) {
			this.thirdPartyVehiclePropLoss = thirdPartyVehiclePropLoss;
		}
		public String getIsNatureLoss() {
			return isNatureLoss;
		}
		public void setIsNatureLoss(String isNatureLoss) {
			this.isNatureLoss = isNatureLoss;
		}
		public Double getSumEstimateLoss() {
			return sumEstimateLoss;
		}
		public void setSumEstimateLoss(Double sumEstimateLoss) {
			this.sumEstimateLoss = sumEstimateLoss;
		}
		public String getRegistRiskLevel() {
			return registRiskLevel;
		}
		public void setRegistRiskLevel(String registRiskLevel) {
			this.registRiskLevel = registRiskLevel;
		}
		public Double getRegistSupModelScore() {
			return registSupModelScore;
		}
		public void setRegistSupModelScore(Double registSupModelScore) {
			this.registSupModelScore = registSupModelScore;
		}
		public Double getRegistUnsupModelScore() {
			return registUnsupModelScore;
		}
		public void setRegistUnsupModelScore(Double registUnsupModelScore) {
			this.registUnsupModelScore = registUnsupModelScore;
		}
		public String getCheckRiskLevel() {
			return checkRiskLevel;
		}
		public void setCheckRiskLevel(String checkRiskLevel) {
			this.checkRiskLevel = checkRiskLevel;
		}
		public Double getCheckSupModelScore() {
			return checkSupModelScore;
		}
		public void setCheckSupModelScore(Double checkSupModelScore) {
			this.checkSupModelScore = checkSupModelScore;
		}
		public Double getCheckUnsupModelScore() {
			return checkUnsupModelScore;
		}
		public void setCheckUnsupModelScore(Double checkUnsupModelScore) {
			this.checkUnsupModelScore = checkUnsupModelScore;
		}
		public Double getItemCarLoss() {
			return itemCarLoss;
		}
		public void setItemCarLoss(Double itemCarLoss) {
			this.itemCarLoss = itemCarLoss;
		}
		public Double getHighCoverageCarDamageInsurance() {
			return highCoverageCarDamageInsurance;
		}
		public void setHighCoverageCarDamageInsurance(
				Double highCoverageCarDamageInsurance) {
			this.highCoverageCarDamageInsurance = highCoverageCarDamageInsurance;
		}
		public Date getPolicyStartTime() {
			return policyStartTime;
		}
		public void setPolicyStartTime(Date policyStartTime) {
			this.policyStartTime = policyStartTime;
		}
		public Date getPolicyEndTime() {
			return policyEndTime;
		}
		public void setPolicyEndTime(Date policyEndTime) {
			this.policyEndTime = policyEndTime;
		}
		public Date getAccidentOccurTime() {
			return accidentOccurTime;
		}
		public void setAccidentOccurTime(Date accidentOccurTime) {
			this.accidentOccurTime = accidentOccurTime;
		}
		public String getAccidentDetailsTime() {
			return accidentDetailsTime;
		}
		public void setAccidentDetailsTime(String accidentDetailsTime) {
			this.accidentDetailsTime = accidentDetailsTime;
		}
		public Integer getManyYearsUseOfOutDangerCar() {
			return manyYearsUseOfOutDangerCar;
		}
		public void setManyYearsUseOfOutDangerCar(Integer manyYearsUseOfOutDangerCar) {
			this.manyYearsUseOfOutDangerCar = manyYearsUseOfOutDangerCar;
		}
		public String getPlacesOfOutDanger() {
			return placesOfOutDanger;
		}
		public void setPlacesOfOutDanger(String placesOfOutDanger) {
			this.placesOfOutDanger = placesOfOutDanger;
		}
		public String getAccidentHandlingDepartment() {
			return accidentHandlingDepartment;
		}
		public void setAccidentHandlingDepartment(String accidentHandlingDepartment) {
			this.accidentHandlingDepartment = accidentHandlingDepartment;
		}
		public String getIsRegistModify() {
			return isRegistModify;
		}
		public void setIsRegistModify(String isRegistModify) {
			this.isRegistModify = isRegistModify;
		}
		public String getIsReportOnThespot() {
			return isReportOnThespot;
		}
		public void setIsReportOnThespot(String isReportOnThespot) {
			this.isReportOnThespot = isReportOnThespot;
		}
		public String getIsTransferVehicle() {
			return isTransferVehicle;
		}
		public void setIsTransferVehicle(String isTransferVehicle) {
			this.isTransferVehicle = isTransferVehicle;
		}
}
