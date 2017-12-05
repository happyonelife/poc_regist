	package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * 车辆核损
 * @author chao
 *
 */
public class RuleCarVerify implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	是否配件审验*/
		private	String	isAccessory;
		/**	是否修复验车*/
		private	String	isRepairCheck;
		/**	核价是否已提交*/
		private	String	isVeripSubmit;
		/**	核价任务提交意见*/
		private	String	veripOpinion;
		/**车辆品牌*/
		private String carBrand;
		/**定损金额*/
		private Double lossApprovalAmount;
		/**人员最小核损金额*/
		private Double minVerifyAmountAuthority;
		/**人员最大核损金额 */
		private Double maxVerifyAmountAuthority;
		/**定损处理人员*/
		private String lossApprovalOperator;
		/**是否产生通赔评分*/
		private String isAnyPayEvaluate="N";
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
		public String getIsVeripSubmit() {
			return isVeripSubmit;
		}
		public void setIsVeripSubmit(String isVeripSubmit) {
			this.isVeripSubmit = isVeripSubmit;
		}
		public String getVeripOpinion() {
			return veripOpinion;
		}
		public void setVeripOpinion(String veripOpinion) {
			this.veripOpinion = veripOpinion;
		}
		public String getCarBrand() {
			return carBrand;
		}
		public void setCarBrand(String carBrand) {
			this.carBrand = carBrand;
		}
		public Double getLossApprovalAmount() {
			return lossApprovalAmount;
		}
		public void setLossApprovalAmount(Double lossApprovalAmount) {
			this.lossApprovalAmount = lossApprovalAmount;
		}
		public Double getMinVerifyAmountAuthority() {
			return minVerifyAmountAuthority;
		}
		public void setMinVerifyAmountAuthority(Double minVerifyAmountAuthority) {
			this.minVerifyAmountAuthority = minVerifyAmountAuthority;
		}
		public Double getMaxVerifyAmountAuthority() {
			return maxVerifyAmountAuthority;
		}
		public void setMaxVerifyAmountAuthority(Double maxVerifyAmountAuthority) {
			this.maxVerifyAmountAuthority = maxVerifyAmountAuthority;
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
