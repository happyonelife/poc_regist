package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 核赔
 * @author chao
 *
 */
public class RuleUndwrt implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	是否总公司理算人员理算*/
		private	String  isHeadcomp;
		/**	是否追偿*/
		private	String  isReplevy ;
		/**核赔金额*/
		private Double undwrtAmount;
		/**	当前计算书金额*/
		private	Double	currentcomp ;
		/**	是否两年以上赔案*/
		private	String	isMoreThanTwoYearsCase;
		/**	业务渠道*/
		private	String	businessChannel;
		/**	计算书类型*/
		private	String	compensateType;
		/**	人员核赔金额*/
		private	Double	undwrtAmountAuthority;
		/**	是否交强险最后一张计算书　	*/
		private	String	isCILastcompensateOne;
		/**	是否商业险最后一张计算书*/
		private	String	isBILastcompensateOne;
		/**	是否大众项目*/
		private	String	isMassProject;
		/**	是否存在应交保费*/
		private	String	isOnShouldPay;
		/**	计算书标识*/
		private	String	compensateSign;
		
		public String getIsHeadcomp() {
			return isHeadcomp;
		}
		public void setIsHeadcomp(String isHeadcomp) {
			this.isHeadcomp = isHeadcomp;
		}
		public String getIsReplevy() {
			return isReplevy;
		}
		public void setIsReplevy(String isReplevy) {
			this.isReplevy = isReplevy;
		}
		public Double getUndwrtAmount() {
			return undwrtAmount;
		}
		public void setUndwrtAmount(Double undwrtAmount) {
			this.undwrtAmount = undwrtAmount;
		}
		public Double getCurrentcomp() {
			return currentcomp;
		}
		public void setCurrentcomp(Double currentcomp) {
			this.currentcomp = currentcomp;
		}
		public String getIsMoreThanTwoYearsCase() {
			return isMoreThanTwoYearsCase;
		}
		public void setIsMoreThanTwoYearsCase(String isMoreThanTwoYearsCase) {
			this.isMoreThanTwoYearsCase = isMoreThanTwoYearsCase;
		}
		public String getBusinessChannel() {
			return businessChannel;
		}
		public void setBusinessChannel(String businessChannel) {
			this.businessChannel = businessChannel;
		}
		public String getCompensateType() {
			return compensateType;
		}
		public void setCompensateType(String compensateType) {
			this.compensateType = compensateType;
		}
		public Double getUndwrtAmountAuthority() {
			return undwrtAmountAuthority;
		}
		public void setUndwrtAmountAuthority(Double undwrtAmountAuthority) {
			this.undwrtAmountAuthority = undwrtAmountAuthority;
		}
		public String getIsCILastcompensateOne() {
			return isCILastcompensateOne;
		}
		public void setIsCILastcompensateOne(String isCILastcompensateOne) {
			this.isCILastcompensateOne = isCILastcompensateOne;
		}
		public String getIsBILastcompensateOne() {
			return isBILastcompensateOne;
		}
		public void setIsBILastcompensateOne(String isBILastcompensateOne) {
			this.isBILastcompensateOne = isBILastcompensateOne;
		}
		public String getIsMassProject() {
			return isMassProject;
		}
		public void setIsMassProject(String isMassProject) {
			this.isMassProject = isMassProject;
		}
		public String getIsOnShouldPay() {
			return isOnShouldPay;
		}
		public void setIsOnShouldPay(String isOnShouldPay) {
			this.isOnShouldPay = isOnShouldPay;
		}
		public String getCompensateSign() {
			return compensateSign;
		}
		public void setCompensateSign(String compensateSign) {
			this.compensateSign = compensateSign;
		}
		
}
