package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 初始信息
 * @author chao
 *
 */
public class RuleInitialize implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**核损金额权限**/
	private	Double	lossAmount ;
	/**核损有监督模型评分**/
	private	Double	lossSupModelScore=0.0 ;
	/**核损无监督模型评分**/
	private	Double	lossUnSupModelScore=0.0 ;
	/**核损非大众项目金额**/
	private	Double	lossUnMassProjectAmount ;
	/**核损大众项目金额**/
	private	Double	lossMassProjectAmount ;
	/**核损有监督模型定损金额**/
	private	Double	lossSupModelapprovalAmount ;
	/**核损无监督模型定损金额**/
	private	Double	lossUnSupModelapprovalAmount ;
	/**核价金额权限**/
	private	Double	priceAmount ;
	/**核价有监督模型评分**/
	private	Double	priceSupModelScore=0.0 ;
	/**核价无监督模型评分**/
	private	Double	priceUnSupModelScore=0.0 ;
	/**核价非大众项目金额**/
	private	Double	priceUnMassProjectAmount ;
	/**核价大众项目金额**/
	private	Double	priceMassProjectAmount ;
	/**核价有监督模型定损金额**/
	private	Double	priceSupModelApprovalAmount ;
	/**核价无监督模型定损金额**/
	private	Double	priceUnSupModelApprovalAmount ;
	/**	核赔金额权限*/
	private	Double	claimApprovalAmount;
	/**	一级核赔金额权限*/
	private	Double	undwrtAmountOne;
	/**	二级核赔金额权限*/
	private	Double	undwrtAmountTwo;
	/**	人伤核损金额*/
	private	Double	injuryrLossAssessmentAmount;
	/**	人伤金额权限*/
	private	Double	injuryAmount ;
	/**	财产核损金额权限*/
	private	Double	propVerifyAmount  ;
	/**	财产核损有监督模型评分*/
	private	Double	propVerifysupModelScore=0.0  ;
	/**	财产核损无监督模型评分*/
	private	Double	propVerifyunSupModelScore=0.0  ;
	/**	财产核损非大众项目金额*/
	private	Double	propVerifyUnMassProjectAmount  ;
	/**	财产核损大众项目金额*/
	private	Double	propVerifyProjectAmount  ;
	/**	财产核损有监督模型定损金额*/
	private	Double	propVerifySupModelAmount  ;
	/**	财产核损无监督模型定损金额*/
	private	Double	propVerifyUnSupModelAmount  ;
	/**	中支诉请金额*/
	private	 Double pivotDisputeAmount;
	/**	分公司诉请金额*/
	private	 Double brachDisputeAmount;
	/**	总公司诉请金额*/
	private	 Double heahDisputeAmount;
	/**	集中核损金额*/
	private	 Double centrateVerifyAmountAuthority;
	/**	报案有监督模型评分*/
	private	 Double regSupModelScore=0.0;
	/**	报案无监督模型评分*/
	private	 Double regUnSupModelScore=0.0;
	/**	查勘有监督模型评分*/
	private	 Double cheSupModelScore=0.0;
	/**	查勘无监督模型评分*/
	private	 Double cheUnSupModelScore=0.0;
	/**	国产车型换件金额*/
	private	 Double domesticCompFee;
	/**	进口车型换件金额*/
	private	 Double importCompFee;
	/**	进口车型单件换件金额*/
	private	 Double importUnitCompFee;
	/**	市场维修配件管理费比例*/
	private	 Double repairManageFeeRate;
	/**非渠道车系管理费率**/
	private	Double	theChannelCarManageRateAuth=0.0 ;
	/**非渠道车系单件金额**/
	private	Double	theChannelCarUnitAmountAuth=0.0 ;
	/**非渠道车系换件金额**/
	private	Double	theChannelCarChgCompFeeAuth=0.0 ;
	
	public Double getTheChannelCarManageRateAuth() {
		return theChannelCarManageRateAuth;
	}
	public void setTheChannelCarManageRateAuth(Double theChannelCarManageRateAuth) {
		this.theChannelCarManageRateAuth = theChannelCarManageRateAuth;
	}
	public Double getTheChannelCarUnitAmountAuth() {
		return theChannelCarUnitAmountAuth;
	}
	public void setTheChannelCarUnitAmountAuth(Double theChannelCarUnitAmountAuth) {
		this.theChannelCarUnitAmountAuth = theChannelCarUnitAmountAuth;
	}
	public Double getTheChannelCarChgCompFeeAuth() {
		return theChannelCarChgCompFeeAuth;
	}
	public void setTheChannelCarChgCompFeeAuth(Double theChannelCarChgCompFeeAuth) {
		this.theChannelCarChgCompFeeAuth = theChannelCarChgCompFeeAuth;
	}
	public Double getRepairManageFeeRate() {
		return repairManageFeeRate;
	}
	public void setRepairManageFeeRate(Double repairManageFeeRate) {
		this.repairManageFeeRate = repairManageFeeRate;
	}
	public Double getDomesticCompFee() {
		return domesticCompFee;
	}
	public void setDomesticCompFee(Double domesticCompFee) {
		this.domesticCompFee = domesticCompFee;
	}
	public Double getImportCompFee() {
		return importCompFee;
	}
	public void setImportCompFee(Double importCompFee) {
		this.importCompFee = importCompFee;
	}
	public Double getImportUnitCompFee() {
		return importUnitCompFee;
	}
	public void setImportUnitCompFee(Double importUnitCompFee) {
		this.importUnitCompFee = importUnitCompFee;
	}
	public Double getRegSupModelScore() {
		return regSupModelScore;
	}
	public void setRegSupModelScore(Double regSupModelScore) {
		this.regSupModelScore = regSupModelScore;
	}
	public Double getRegUnSupModelScore() {
		return regUnSupModelScore;
	}
	public void setRegUnSupModelScore(Double regUnSupModelScore) {
		this.regUnSupModelScore = regUnSupModelScore;
	}
	public Double getCheSupModelScore() {
		return cheSupModelScore;
	}
	public void setCheSupModelScore(Double cheSupModelScore) {
		this.cheSupModelScore = cheSupModelScore;
	}
	public Double getCheUnSupModelScore() {
		return cheUnSupModelScore;
	}
	public void setCheUnSupModelScore(Double cheUnSupModelScore) {
		this.cheUnSupModelScore = cheUnSupModelScore;
	}
	public Double getCentrateVerifyAmountAuthority() {
		return centrateVerifyAmountAuthority;
	}
	public void setCentrateVerifyAmountAuthority(
			Double centrateVerifyAmountAuthority) {
		this.centrateVerifyAmountAuthority = centrateVerifyAmountAuthority;
	}
	public Double getPropVerifySupModelAmount() {
		return propVerifySupModelAmount;
	}
	public void setPropVerifySupModelAmount(Double propVerifySupModelAmount) {
		this.propVerifySupModelAmount = propVerifySupModelAmount;
	}
	public Double getLossAmount() {
		return lossAmount;
	}
	public void setLossAmount(Double lossAmount) {
		this.lossAmount = lossAmount;
	}
	public Double getLossSupModelScore() {
		return lossSupModelScore;
	}
	public void setLossSupModelScore(Double lossSupModelScore) {
		this.lossSupModelScore = lossSupModelScore;
	}
	public Double getLossUnSupModelScore() {
		return lossUnSupModelScore;
	}
	public void setLossUnSupModelScore(Double lossUnSupModelScore) {
		this.lossUnSupModelScore = lossUnSupModelScore;
	}
	public Double getLossUnMassProjectAmount() {
		return lossUnMassProjectAmount;
	}
	public void setLossUnMassProjectAmount(Double lossUnMassProjectAmount) {
		this.lossUnMassProjectAmount = lossUnMassProjectAmount;
	}
	public Double getLossMassProjectAmount() {
		return lossMassProjectAmount;
	}
	public void setLossMassProjectAmount(Double lossMassProjectAmount) {
		this.lossMassProjectAmount = lossMassProjectAmount;
	}
	public Double getLossSupModelapprovalAmount() {
		return lossSupModelapprovalAmount;
	}
	public void setLossSupModelapprovalAmount(Double lossSupModelapprovalAmount) {
		this.lossSupModelapprovalAmount = lossSupModelapprovalAmount;
	}
	public Double getLossUnSupModelapprovalAmount() {
		return lossUnSupModelapprovalAmount;
	}
	public void setLossUnSupModelapprovalAmount(Double lossUnSupModelapprovalAmount) {
		this.lossUnSupModelapprovalAmount = lossUnSupModelapprovalAmount;
	}
	public Double getPriceAmount() {
		return priceAmount;
	}
	public void setPriceAmount(Double priceAmount) {
		this.priceAmount = priceAmount;
	}
	public Double getPriceSupModelScore() {
		return priceSupModelScore;
	}
	public void setPriceSupModelScore(Double priceSupModelScore) {
		this.priceSupModelScore = priceSupModelScore;
	}
	public Double getPriceUnSupModelScore() {
		return priceUnSupModelScore;
	}
	public void setPriceUnSupModelScore(Double priceUnSupModelScore) {
		this.priceUnSupModelScore = priceUnSupModelScore;
	}
	public Double getPriceUnMassProjectAmount() {
		return priceUnMassProjectAmount;
	}
	public void setPriceUnMassProjectAmount(Double priceUnMassProjectAmount) {
		this.priceUnMassProjectAmount = priceUnMassProjectAmount;
	}
	public Double getPriceMassProjectAmount() {
		return priceMassProjectAmount;
	}
	public void setPriceMassProjectAmount(Double priceMassProjectAmount) {
		this.priceMassProjectAmount = priceMassProjectAmount;
	}
	public Double getPriceSupModelApprovalAmount() {
		return priceSupModelApprovalAmount;
	}
	public void setPriceSupModelApprovalAmount(Double priceSupModelApprovalAmount) {
		this.priceSupModelApprovalAmount = priceSupModelApprovalAmount;
	}
	public Double getPriceUnSupModelApprovalAmount() {
		return priceUnSupModelApprovalAmount;
	}
	public void setPriceUnSupModelApprovalAmount(
			Double priceUnSupModelApprovalAmount) {
		this.priceUnSupModelApprovalAmount = priceUnSupModelApprovalAmount;
	}
	public Double getClaimApprovalAmount() {
		return claimApprovalAmount;
	}
	public void setClaimApprovalAmount(Double claimApprovalAmount) {
		this.claimApprovalAmount = claimApprovalAmount;
	}
	public Double getUndwrtAmountOne() {
		return undwrtAmountOne;
	}
	public void setUndwrtAmountOne(Double undwrtAmountOne) {
		this.undwrtAmountOne = undwrtAmountOne;
	}
	public Double getUndwrtAmountTwo() {
		return undwrtAmountTwo;
	}
	public void setUndwrtAmountTwo(Double undwrtAmountTwo) {
		this.undwrtAmountTwo = undwrtAmountTwo;
	}
	public Double getInjuryrLossAssessmentAmount() {
		return injuryrLossAssessmentAmount;
	}
	public void setInjuryrLossAssessmentAmount(Double injuryrLossAssessmentAmount) {
		this.injuryrLossAssessmentAmount = injuryrLossAssessmentAmount;
	}
	public Double getInjuryAmount() {
		return injuryAmount;
	}
	public void setInjuryAmount(Double injuryAmount) {
		this.injuryAmount = injuryAmount;
	}
	public Double getPropVerifyAmount() {
		return propVerifyAmount;
	}
	public void setPropVerifyAmount(Double propVerifyAmount) {
		this.propVerifyAmount = propVerifyAmount;
	}
	public Double getPropVerifysupModelScore() {
		return propVerifysupModelScore;
	}
	public void setPropVerifysupModelScore(Double propVerifysupModelScore) {
		this.propVerifysupModelScore = propVerifysupModelScore;
	}
	public Double getPropVerifyunSupModelScore() {
		return propVerifyunSupModelScore;
	}
	public void setPropVerifyunSupModelScore(Double propVerifyunSupModelScore) {
		this.propVerifyunSupModelScore = propVerifyunSupModelScore;
	}
	public Double getPropVerifyUnMassProjectAmount() {
		return propVerifyUnMassProjectAmount;
	}
	public void setPropVerifyUnMassProjectAmount(
			Double propVerifyUnMassProjectAmount) {
		this.propVerifyUnMassProjectAmount = propVerifyUnMassProjectAmount;
	}
	public Double getPropVerifyProjectAmount() {
		return propVerifyProjectAmount;
	}
	public void setPropVerifyProjectAmount(Double propVerifyProjectAmount) {
		this.propVerifyProjectAmount = propVerifyProjectAmount;
	}
	public Double getPropVerifyUnSupModelAmount() {
		return propVerifyUnSupModelAmount;
	}
	public void setPropVerifyUnSupModelAmount(Double propVerifyUnSupModelAmount) {
		this.propVerifyUnSupModelAmount = propVerifyUnSupModelAmount;
	}
	public Double getPivotDisputeAmount() {
		return pivotDisputeAmount;
	}
	public void setPivotDisputeAmount(Double pivotDisputeAmount) {
		this.pivotDisputeAmount = pivotDisputeAmount;
	}
	public Double getBrachDisputeAmount() {
		return brachDisputeAmount;
	}
	public void setBrachDisputeAmount(Double brachDisputeAmount) {
		this.brachDisputeAmount = brachDisputeAmount;
	}
	public Double getHeahDisputeAmount() {
		return heahDisputeAmount;
	}
	public void setHeahDisputeAmount(Double heahDisputeAmount) {
		this.heahDisputeAmount = heahDisputeAmount;
	}
	
}
