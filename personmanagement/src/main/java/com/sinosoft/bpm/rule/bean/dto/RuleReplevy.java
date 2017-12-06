package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 追偿
 * @author chao
 *
 */
public class RuleReplevy implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	应追金额*/
		private	Double	recoveryAmount;
		/**	追偿意见*/
		private	String	recoveryOpinion;
		/**	最高审核级别*/
		private	String	maxVerifyLevel;
		/**	是否发起诉讼*/
		private	String	isLawsuits;
		/**	诉求金额*/
		private	Double	appealAmount;
		/**	是否结束追偿*/
		private	String	isEndRecovery="N";
		
		public String getIsEndRecovery() {
			return isEndRecovery;
		}
		public void setIsEndRecovery(String isEndRecovery) {
			this.isEndRecovery = isEndRecovery;
		}
		public String getMaxVerifyLevel() {
			return maxVerifyLevel;
		}
		public void setMaxVerifyLevel(String maxVerifyLevel) {
			this.maxVerifyLevel = maxVerifyLevel;
		}
		public Double getRecoveryAmount() {
			return recoveryAmount;
		}
		public void setRecoveryAmount(Double recoveryAmount) {
			this.recoveryAmount = recoveryAmount;
		}
		public String getRecoveryOpinion() {
			return recoveryOpinion;
		}
		public void setRecoveryOpinion(String recoveryOpinion) {
			this.recoveryOpinion = recoveryOpinion;
		}
		public String getIsLawsuits() {
			return isLawsuits;
		}
		public void setIsLawsuits(String isLawsuits) {
			this.isLawsuits = isLawsuits;
		}
		public Double getAppealAmount() {
			return appealAmount;
		}
		public void setAppealAmount(Double appealAmount) {
			this.appealAmount = appealAmount;
		}
}
