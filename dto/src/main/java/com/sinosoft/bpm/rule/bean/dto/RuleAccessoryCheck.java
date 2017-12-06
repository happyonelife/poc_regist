package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 配件审验
 * @author chao
 *
 */
public class RuleAccessoryCheck  implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	是否修复验车*/
		private	String isRepairCheck;
		/**	审核人与验发起人是否为同一人*/
		private	String isAuditEqualSponsor;
		/**	最后一个核价处理人*/
		private	String lastLossPriceHandler;
		/**	最后一个核价处理机构*/
		private	String lastLossPriceCom;
		/**	最后一个定损员*/
		private	String lastLossApprovalHandler;
		/**	定损处理机构*/
		private	String lastLossApprovalCom;
		/**	上一个配件审验处理人*/
		private	String lastPartAuditHandler;
		/**	上一个配件审验机构*/
		private	String lastPartAuditCom;
		/**	上一个配件审验审核处理人*/
		private	String lastPartAuditVerHandler;
		/**	上一个配件审验审核机构*/
		private	String lastPartAuditVerCom;
		
		public String getLastLossPriceHandler() {
			return lastLossPriceHandler;
		}

		public String getLastPartAuditVerHandler() {
			return lastPartAuditVerHandler;
		}

		public void setLastPartAuditVerHandler(String lastPartAuditVerHandler) {
			this.lastPartAuditVerHandler = lastPartAuditVerHandler;
		}

		public String getLastPartAuditVerCom() {
			return lastPartAuditVerCom;
		}

		public void setLastPartAuditVerCom(String lastPartAuditVerCom) {
			this.lastPartAuditVerCom = lastPartAuditVerCom;
		}

		public void setLastLossPriceHandler(String lastLossPriceHandler) {
			this.lastLossPriceHandler = lastLossPriceHandler;
		}

		public String getLastLossPriceCom() {
			return lastLossPriceCom;
		}

		public void setLastLossPriceCom(String lastLossPriceCom) {
			this.lastLossPriceCom = lastLossPriceCom;
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

		public String getLastPartAuditHandler() {
			return lastPartAuditHandler;
		}

		public void setLastPartAuditHandler(String lastPartAuditHandler) {
			this.lastPartAuditHandler = lastPartAuditHandler;
		}

		public String getLastPartAuditCom() {
			return lastPartAuditCom;
		}

		public void setLastPartAuditCom(String lastPartAuditCom) {
			this.lastPartAuditCom = lastPartAuditCom;
		}

		public String getIsAuditEqualSponsor() {
			return isAuditEqualSponsor;
		}

		public void setIsAuditEqualSponsor(String isAuditEqualSponsor) {
			this.isAuditEqualSponsor = isAuditEqualSponsor;
		}

		public String getIsRepairCheck() {
			return isRepairCheck;
		}

		public void setIsRepairCheck(String isRepairCheck) {
			this.isRepairCheck = isRepairCheck;
		}

		

}


