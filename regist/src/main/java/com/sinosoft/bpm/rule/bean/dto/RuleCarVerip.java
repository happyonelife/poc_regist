package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * 车辆核价
 * @author chao
 *
 */
public class RuleCarVerip implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	是否配件审验*/
		private	String isAccessory;
		/**	是否修复验车*/
		private	String isRepairCheck;
		/**	核损是否已提交*/
		private	String isVerifyTaskEnd;
		/**	核损任务提交意见*/
		private	String verifyOpinion;
		/**	车辆品牌*/
		private	String carBrand;
		/**	是否增补配件*/
		private	String	isAddChgComp="N";
		/**	核价金额*/
		private	Double	veripAmount;
		/**	车辆种类*/
		private	String	carKind;
		/**	换件金额*/
		private	Double	chgCompFee;
		/**	单件金额*/
		private	Double	unitAmount;
		/**	管理费率(%)*/
		private	Double	manageRate;
		/**	定损金额*/
		private	Double	lossApprovalAmount  ;
		/**	人员换件金额*/
		private	Double	chgCompAmountAuthority  ;
		/**	人员单件换件金额*/
		private	Double	unitChgCompAmountAuthority  ;
		/**	人员管理费率(%)*/
		private	Double	manageRateAuthority;
		/**是否进口车型*/
		private	String	isImportCar;
		/**定损处理人员*/
		private	String	lossApprovalOperator;
		/**是否产生通赔评分*/
		private	String	isAnyPayEvaluate="N";
		/**是否追加定损*/
		private String isAppendLossApproval;
		/**配件审验人*/
		private String partAuditHandler;
		/**配件审验处理机构*/
		private String partAuditCom;
		/**最后一个定损员*/
		private String lastLossApprovalHandler;
		/**定损处理机构*/
		private String lastLossApprovalCom;
		/**修复验车人*/
		private String repairVehicleHandler;
		/**修复验车处理机构*/
		private String repairVehicleCom;
		/** 车型国别 */
		private String carCountryNature="D";
		
		public String getCarCountryNature() {
			return carCountryNature;
		}
		public void setCarCountryNature(String carCountryNature) {
			this.carCountryNature = carCountryNature;
		}
		public String getIsAccessory() {
			return isAccessory;
		}
		public void setIsAccessory(String isAccessory) {
			this.isAccessory = isAccessory;
		}
		public String getIsRepairCheck() {
			return isRepairCheck;
		}
		public void setIsRepairCheck(String isRepairCheck) {
			this.isRepairCheck = isRepairCheck;
		}
		public String getIsVerifyTaskEnd() {
			return isVerifyTaskEnd;
		}
		public void setIsVerifyTaskEnd(String isVerifyTaskEnd) {
			this.isVerifyTaskEnd = isVerifyTaskEnd;
		}
		public String getVerifyOpinion() {
			return verifyOpinion;
		}
		public void setVerifyOpinion(String verifyOpinion) {
			this.verifyOpinion = verifyOpinion;
		}
		public String getCarBrand() {
			return carBrand;
		}
		public void setCarBrand(String carBrand) {
			this.carBrand = carBrand;
		}
		public String getIsAddChgComp() {
			return isAddChgComp;
		}
		public void setIsAddChgComp(String isAddChgComp) {
			this.isAddChgComp = isAddChgComp;
		}
		public Double getVeripAmount() {
			return veripAmount;
		}
		public void setVeripAmount(Double veripAmount) {
			this.veripAmount = veripAmount;
		}
		public String getCarKind() {
			return carKind;
		}
		public void setCarKind(String carKind) {
			this.carKind = carKind;
		}
		public Double getChgCompFee() {
			return chgCompFee;
		}
		public void setChgCompFee(Double chgCompFee) {
			this.chgCompFee = chgCompFee;
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
		public Double getLossApprovalAmount() {
			return lossApprovalAmount;
		}
		public void setLossApprovalAmount(Double lossApprovalAmount) {
			this.lossApprovalAmount = lossApprovalAmount;
		}
		public Double getChgCompAmountAuthority() {
			return chgCompAmountAuthority;
		}
		public void setChgCompAmountAuthority(Double chgCompAmountAuthority) {
			this.chgCompAmountAuthority = chgCompAmountAuthority;
		}
		public Double getUnitChgCompAmountAuthority() {
			return unitChgCompAmountAuthority;
		}
		public void setUnitChgCompAmountAuthority(Double unitChgCompAmountAuthority) {
			this.unitChgCompAmountAuthority = unitChgCompAmountAuthority;
		}
		public Double getManageRateAuthority() {
			return manageRateAuthority;
		}
		public void setManageRateAuthority(Double manageRateAuthority) {
			this.manageRateAuthority = manageRateAuthority;
		}
		public String getIsImportCar() {
			return isImportCar;
		}
		public void setIsImportCar(String isImportCar) {
			this.isImportCar = isImportCar;
		}
		public String getLossApprovalOperator() {
			return lossApprovalOperator;
		}
		public void setLossApprovalOperator(String lossApprovalOperator) {
			this.lossApprovalOperator = lossApprovalOperator;
		}
		public String getIsAnyPayEvaluate() {
			return isAnyPayEvaluate;
		}
		public void setIsAnyPayEvaluate(String isAnyPayEvaluate) {
			this.isAnyPayEvaluate = isAnyPayEvaluate;
		}
		public String getIsAppendLossApproval() {
			return isAppendLossApproval;
		}
		public void setIsAppendLossApproval(String isAppendLossApproval) {
			this.isAppendLossApproval = isAppendLossApproval;
		}
		public String getPartAuditHandler() {
			return partAuditHandler;
		}
		public void setPartAuditHandler(String partAuditHandler) {
			this.partAuditHandler = partAuditHandler;
		}
		public String getPartAuditCom() {
			return partAuditCom;
		}
		public void setPartAuditCom(String partAuditCom) {
			this.partAuditCom = partAuditCom;
		}
		public String getLastLossApprovalHandler() {
			return lastLossApprovalHandler;
		}
		public void setLastLossApprovalHandler(String lastLossApprovalHandler) {
			this.lastLossApprovalHandler = lastLossApprovalHandler;
		}
		public String getLastLossApprovalCom() {
			return lastLossApprovalCom;
		}
		public void setLastLossApprovalCom(String lastLossApprovalCom) {
			this.lastLossApprovalCom = lastLossApprovalCom;
		}
		public String getRepairVehicleHandler() {
			return repairVehicleHandler;
		}
		public void setRepairVehicleHandler(String repairVehicleHandler) {
			this.repairVehicleHandler = repairVehicleHandler;
		}
		public String getRepairVehicleCom() {
			return repairVehicleCom;
		}
		public void setRepairVehicleCom(String repairVehicleCom) {
			this.repairVehicleCom = repairVehicleCom;
		}

		
}
