package cn.sinosoft.processrule.helper.bean;

import com.sinosoft.bpm.rule.bean.model.RuleProcessInputXOM;

public class InitAfter {
	public static void initComplate(RuleProcessInputXOM inputXOM){
		
		if(null == inputXOM.getRuleCarAppendlossApproval().getIsAgreeVeripOpinion() || "".equals(inputXOM.getRuleCarAppendlossApproval().getIsAgreeVeripOpinion())){
			inputXOM.getRuleCarAppendlossApproval().setIsAgreeVeripOpinion("N");
		}
		if(null == inputXOM.getClaimNowComCode()){
			inputXOM.setClaimNowComCode("");
		}
		if(null == inputXOM.getRulePersonLossVerify().getLossApprovalAmount()){
			inputXOM.getRulePersonLossVerify().setLossApprovalAmount(0d);
		}
		if(null == inputXOM.getRulePersonLossApproval().getVerifyAmountAuthority()){
			inputXOM.getRulePersonLossApproval().setVerifyAmountAuthority(0d);
		}
		if(null ==  inputXOM.getRulePersonLossApproval().getIsAfterMediate()){
			inputXOM.getRulePersonLossApproval().setIsAfterMediate("");
		}
		if(null == inputXOM.getRulePersonLossApproval().getIsChooseAutoLoss()){
			inputXOM.getRulePersonLossApproval().setIsChooseAutoLoss("");
		}
		if(null == inputXOM.getRulePersonLossApproval().getIsAddLossProject()){
			inputXOM.getRulePersonLossApproval().setIsAddLossProject("");
		}
		if(null == inputXOM.getRulePersonLossApproval().getLossApprovalAmountIsHigherMediateAmount()){
			inputXOM.getRulePersonLossApproval().setLossApprovalAmountIsHigherMediateAmount("");
		}
		if(null == inputXOM.getRulePersonLossApproval().getLossApprovalAmount()){
			inputXOM.getRulePersonLossApproval().setLossApprovalAmount(0d);
		}
		if(null == inputXOM.getRuleInitialize().getInjuryAmount()){
			inputXOM.getRuleInitialize().setInjuryAmount(0d);
		}
		if(null == inputXOM.getRulePresonMediate().getInjuryMediateAmount()){
			inputXOM.getRulePresonMediate().setInjuryMediateAmount(0d);
		}
		if(null == inputXOM.getRuleInputCommon().getSubmitopinions()){
			inputXOM.getRuleInputCommon().setSubmitopinions("");
		}
 		if(null == inputXOM.getRulePersonLossApproval().getLossApprovalAmount()){
			inputXOM.getRulePersonLossApproval().setLossApprovalAmount(0d);
		}
 		if(null == inputXOM.getRuleInputCommon().getCarItemsId()){
 			inputXOM.getRuleInputCommon().setCarItemsId("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getPropItemsId()){
 			inputXOM.getRuleInputCommon().setPropItemsId("");;
 		}
 		if(null == inputXOM.getRuleInputCommon().getPersonItemsId()){
 			inputXOM.getRuleInputCommon().setPersonItemsId("");;
 		}
 		if(null == inputXOM.getRuleRegist().getIsRegistCancel()){
 			inputXOM.getRuleRegist().setIsRegistCancel("");
 		}
 		if(null == inputXOM.getRuleRegist().getIsRemoteDamage()){
 			inputXOM.getRuleRegist().setIsRemoteDamage("");
 		}
 		if(null == inputXOM.getRuleRegist().getIsCI()){
 			inputXOM.getRuleRegist().setIsCI("");
 		}
 		if(null == inputXOM.getRuleRegist().getIsBI()){
 			inputXOM.getRuleRegist().setIsBI("");
 		}
 		if(null == inputXOM.getRuleRegist().getIsAccept()){
 			inputXOM.getRuleRegist().setIsAccept("");
 		}
 		if(null == inputXOM.getRuleRegist().getScheduleComCode()){
 			inputXOM.getRuleRegist().setScheduleComCode("");
 		}
 		
 		if(null == inputXOM.getRuleInputCommon().getIsSelfInsuranceCar()){
 			inputXOM.getRuleInputCommon().setIsSelfInsuranceCar("");
 		}
 		if(null == inputXOM.getRuleInitialize().getPriceAmount()){
 			inputXOM.getRuleInitialize().setPriceAmount(0d);
 		}
 		//RuleCarLossApproval
 		if(null == inputXOM.getRuleCarLossApproval().getIsVerifyBack()){
 			inputXOM.getRuleCarLossApproval().setIsVerifyBack("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getIsVeripBack()){
 			inputXOM.getRuleCarLossApproval().setIsVeripBack("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getIsCompLess()){
 			inputXOM.getRuleCarLossApproval().setIsCompLess("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getIsAddComp()){
 			inputXOM.getRuleCarLossApproval().setIsAddComp("");
 		}
 		if(null ==inputXOM.getRuleCarLossApproval().getIsIncreaseComp()){
 			inputXOM.getRuleCarLossApproval().setIsIncreaseComp("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getManageFeeRate()){
 			inputXOM.getRuleCarLossApproval().setManageFeeRate(0d);
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getCarBrand()){
 			inputXOM.getRuleCarLossApproval().setCarBrand("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getIsIncreaseSumLoss()){
 			inputXOM.getRuleCarLossApproval().setIsIncreaseSumLoss("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getCars()){
 			inputXOM.getRuleCarLossApproval().setCars("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getMaxUnitAmount()){
 			inputXOM.getRuleCarLossApproval().setMaxUnitAmount(0d);
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getIsExceedReferPrice()){
 			inputXOM.getRuleCarLossApproval().setIsExceedReferPrice("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getIsAddProject()){
 			inputXOM.getRuleCarLossApproval().setIsAddProject("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getLossApprovalAmount()){
 			inputXOM.getRuleCarLossApproval().setLossApprovalAmount(0d);
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getIsExistUnThirdFactoryChgComp()){
 			inputXOM.getRuleCarLossApproval().setIsExistUnThirdFactoryChgComp("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getChgCompFee()){
 			inputXOM.getRuleCarLossApproval().setChgCompFee(0d);
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getIsBrachPriceUser()){
 			inputXOM.getRuleCarLossApproval().setIsBrachPriceUser("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getIsBrachLossUser()){
 			inputXOM.getRuleCarLossApproval().getIsBrachLossUser();
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getBackVeripTaskClassify()){
 			inputXOM.getRuleCarLossApproval().setBackVeripTaskClassify("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getBackVeripTaskType()){
 			inputXOM.getRuleCarLossApproval().setBackVeripTaskType("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getBackVerifyTaskClassify()){
 			inputXOM.getRuleCarLossApproval().setBackVerifyTaskClassify("");
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getBackVerifyTaskType()){
 			inputXOM.getRuleCarLossApproval().setBackVerifyTaskType("");
 		}
 		//RuleInitialize
 		if(null == inputXOM.getRuleInitialize().getLossAmount()){
 			inputXOM.getRuleInitialize().setLossAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getLossUnMassProjectAmount()){
 			inputXOM.getRuleInitialize().setLossUnMassProjectAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getLossMassProjectAmount()){
 			inputXOM.getRuleInitialize().setLossMassProjectAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getLossSupModelapprovalAmount()){
 			inputXOM.getRuleInitialize().setLossSupModelapprovalAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getLossUnSupModelapprovalAmount()){
 			inputXOM.getRuleInitialize().setLossUnSupModelapprovalAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getPriceAmount()){
 			inputXOM.getRuleInitialize().setPriceAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getPriceUnMassProjectAmount()){
 			inputXOM.getRuleInitialize().setPriceUnMassProjectAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getPriceMassProjectAmount()){
 			inputXOM.getRuleInitialize().setPriceMassProjectAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getPriceSupModelApprovalAmount()){
 			inputXOM.getRuleInitialize().setPriceSupModelApprovalAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getPriceUnSupModelApprovalAmount()){
 			inputXOM.getRuleInitialize().setPriceUnSupModelApprovalAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getClaimApprovalAmount()){
 			inputXOM.getRuleInitialize().setClaimApprovalAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getUndwrtAmountOne()){
 			inputXOM.getRuleInitialize().setUndwrtAmountOne(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getUndwrtAmountTwo()){
 			inputXOM.getRuleInitialize().setUndwrtAmountTwo(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getInjuryrLossAssessmentAmount()){
 			inputXOM.getRuleInitialize().setInjuryrLossAssessmentAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getInjuryAmount()){
 			inputXOM.getRuleInitialize().setInjuryAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getPropVerifyAmount()){
 			inputXOM.getRuleInitialize().setPropVerifyAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getPropVerifyUnMassProjectAmount()){
 			inputXOM.getRuleInitialize().setPropVerifyUnMassProjectAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getPropVerifyProjectAmount()){
 			inputXOM.getRuleInitialize().setPropVerifyProjectAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getPropVerifySupModelAmount()){
 			inputXOM.getRuleInitialize().setPropVerifySupModelAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getPropVerifyUnSupModelAmount()){
 			inputXOM.getRuleInitialize().setPropVerifyUnSupModelAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getPivotDisputeAmount()){
 			inputXOM.getRuleInitialize().setPivotDisputeAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getBrachDisputeAmount()){
 			inputXOM.getRuleInitialize().setBrachDisputeAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getHeahDisputeAmount()){
 			inputXOM.getRuleInitialize().setHeahDisputeAmount(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getCentrateVerifyAmountAuthority()){
 			inputXOM.getRuleInitialize().setCentrateVerifyAmountAuthority(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getDomesticCompFee()){
 			inputXOM.getRuleInitialize().setDomesticCompFee(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getImportCompFee()){
 			inputXOM.getRuleInitialize().setImportCompFee(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getImportUnitCompFee()){
 			inputXOM.getRuleInitialize().setImportUnitCompFee(0d);
 		}
 		if(null == inputXOM.getRuleInitialize().getRepairManageFeeRate()){
 			inputXOM.getRuleInitialize().setRepairManageFeeRate(0d);
 		}
 		//RuleInputCommon
 		if(null == inputXOM.getRuleInputCommon().getHandleCode()){
 			inputXOM.getRuleInputCommon().setHandleCode("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getClaimComCode()){
 			inputXOM.getRuleInputCommon().setClaimComCode("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getIsBackTask()){
 			inputXOM.getRuleInputCommon().setIsBackTask("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getIsAutoComplete()){
 			inputXOM.getRuleInputCommon().setIsAutoComplete("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getIsGetSubmitPath()){
 			inputXOM.getRuleInputCommon().setIsGetSubmitPath("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getTargetTaskType()){
 			inputXOM.getRuleInputCommon().setTargetTaskType("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getTargetTaskCatalog()){
 			inputXOM.getRuleInputCommon().setTargetTaskCatalog("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getCarItemsId()){
 			inputXOM.getRuleInputCommon().setCarItemsId("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getPropItemsId()){
 			inputXOM.getRuleInputCommon().setPropItemsId("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getPersonItemsId()){
 			inputXOM.getRuleInputCommon().setPersonItemsId("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getIsForkedTaskHasBack()){
 			inputXOM.getRuleInputCommon().setIsForkedTaskHasBack("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getRiskLevel()){
 			inputXOM.getRuleInputCommon().setRiskLevel("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getIsSelfInsuranceCar()){
 			inputXOM.getRuleInputCommon().setIsSelfInsuranceCar("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getIsReCase()){
 			inputXOM.getRuleInputCommon().setIsReCase("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getIsSimpleCase()){
 			inputXOM.getRuleInputCommon().setIsSimpleCase("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getProjectName()){
 			inputXOM.getRuleInputCommon().setProjectName("");
 		}
 		if(null == inputXOM.getRuleInputCommon().getPrpallComCode()){
 			inputXOM.getRuleInputCommon().setPrpallComCode("");
 		}
 		//RuleUndwrt
 		if(null == inputXOM.getRuleUndwrt().getCompensateType()){
 			inputXOM.getRuleUndwrt().setCompensateType("");
 		}
 		//RuleAdvance
 		if(null == inputXOM.getRuleAdvance().getUndwrtAmount()){
 			inputXOM.getRuleAdvance().setUndwrtAmount(0d);
 		}
 		if(null == inputXOM.getRuleAdvance().getUndwrtSubmitType()){
 			inputXOM.getRuleAdvance().setUndwrtSubmitType("");
 		}
 		//RulePropVerify
 		if(null == inputXOM.getRulePropVerify().getMinVerifyAmountAuthority()){
 			inputXOM.getRulePropVerify().setMinVerifyAmountAuthority(0d);
 		}
 		if(null == inputXOM.getRulePropVerify().getMaxVerifyAmountAuthority()){
 			inputXOM.getRulePropVerify().setMaxVerifyAmountAuthority(0d);;
 		}
 		if(null == inputXOM.getRulePropVerify().getLossApprovalAmount()){
 			inputXOM.getRulePropVerify().setLossApprovalAmount(0d);;
 		}
 		if(null == inputXOM.getRulePropVerify().getLastLossApprovalHandler()){
 			inputXOM.getRulePropVerify().setLastLossApprovalHandler("");;
 		}
 		if(null == inputXOM.getRulePropVerify().getLastLossApprovalCom()){
 			inputXOM.getRulePropVerify().setLastLossApprovalCom("");;
 		}
 		//RuleCompensate
 		if(null ==  inputXOM.getRuleCompensate().getUndwrtAmountAuthority()){
 			inputXOM.getRuleCompensate().setUndwrtAmountAuthority(0d);
 		}
 		if(null ==  inputXOM.getRuleCompensate().getUndwrtAmount()){
 			inputXOM.getRuleCompensate().setUndwrtAmount(0d);;
 		}
 		if(null ==  inputXOM.getRuleCompensate().getIsHeadcomp()){
 			inputXOM.getRuleCompensate().setIsHeadcomp("");;
 		}
 		if(null ==  inputXOM.getRuleCompensate().getUndwrtSubmitType()){
 			inputXOM.getRuleCompensate().setUndwrtSubmitType("");
 		}
 		if(null ==  inputXOM.getRuleCompensate().getIsCreateCertificate()){
 			inputXOM.getRuleCompensate().setIsCreateCertificate("");
 		}
 		if(null ==  inputXOM.getRuleCompensate().getIsInjury()){
 			inputXOM.getRuleCompensate().setIsInjury("");
 		}
 		if(null ==  inputXOM.getRuleCompensate().getIsLawsuit()){
 			inputXOM.getRuleCompensate().setIsLawsuit("");
 		}
 		if(null ==  inputXOM.getRuleCompensate().getEstimateLoss()){
 			inputXOM.getRuleCompensate().setEstimateLoss(0d);
 		}
 		//RuleCarVerify
 		if(null == inputXOM.getRuleCarVerify().getLossApprovalAmount()){
 			inputXOM.getRuleCarVerify().setLossApprovalAmount(0d);
 		}
 		//RuleCarAppendlossApproval
 		if(null == inputXOM.getRuleCarAppendlossApproval().getIsBrachPriceUser()){
 			inputXOM.getRuleCarAppendlossApproval().setIsBrachPriceUser("");
 		}
 		if(null == inputXOM.getRuleCarAppendlossApproval().getLossApprovalAmount()){
 			inputXOM.getRuleCarAppendlossApproval().setLossApprovalAmount(0d);
 		}
 		if(null == inputXOM.getRuleCarAppendlossApproval().getIsAddAccessory()){
 			inputXOM.getRuleCarAppendlossApproval().setIsAddAccessory("");
 		}
 		//ruleInput.getRuleReplevy().getRecoveryAmount()
 		if(null == inputXOM.getRuleReplevy().getRecoveryAmount()){
 			inputXOM.getRuleReplevy().setRecoveryAmount(0d);
 		}
 		if(null == inputXOM.getRuleBusiness().getCustomLevel()){
 			inputXOM.getRuleBusiness().setCustomLevel("");
 		}
 		//input.getRuleBusiness().setMaxCarLoss(4d);
 		if(null == inputXOM.getRuleBusiness().getMaxCarLoss()){
 			inputXOM.getRuleBusiness().setMaxCarLoss(0d);
 		}
 		//dispatcherrule
 		if(null == inputXOM.getRulePresonMediate().getInjuryMediateAmount()){
 			inputXOM.getRulePresonMediate().setInjuryMediateAmount(new Double(0d));
 		}
 		if(null == inputXOM.getRulePersonLossVerify().getLossApprovalAmount()){
 			inputXOM.getRulePersonLossVerify().setLossApprovalAmount(new Double(0d));
 		}
 		if(null == inputXOM.getRuleCarVerip().getChgCompFee()){
 			inputXOM.getRuleCarVerip().setChgCompFee(new Double(0d));
 		}
 		if(null == inputXOM.getRuleDispute().getDisputeAmount()){
 			inputXOM.getRuleDispute().setDisputeAmount(new Double(0d));
 		}
 		if(null == inputXOM.getRuleBusiness().getDamageTimes()){
 			inputXOM.getRuleBusiness().setDamageTimes(0);
 		}
 		if(null == inputXOM.getRuleCarLossApproval().getLossApprovalAmount()){
			inputXOM.getRuleCarLossApproval().setLossApprovalAmount(0d);
		}
		if(null == inputXOM.getRuleCarLossApproval().getRiskInsured()){
			inputXOM.getRuleCarLossApproval().setRiskInsured(1d);
		}
		if(null == inputXOM.getRulePropLossApproval().getIndividualPropertyPrice()){
			inputXOM.getRulePropLossApproval().setIndividualPropertyPrice(0d);
		}
		if(null == inputXOM.getRulePropLossApproval().getDamagedAssetResidualValuecomprehensive()){
			inputXOM.getRulePropLossApproval().setDamagedAssetResidualValuecomprehensive(0d);
		}
		if(null == inputXOM.getRulePropLossApproval().getDamagedAssetGrossValue()){
			inputXOM.getRulePropLossApproval().setDamagedAssetGrossValue(0d);
		}
		if(null == inputXOM.getRulePrePay().getUndwrtAmount()){
			inputXOM.getRulePrePay().setUndwrtAmount(0d);
		}
		if(null == inputXOM.getRulePropLossApproval().getLossApprovalAmount()){
			inputXOM.getRulePropLossApproval().setLossApprovalAmount(0d);
		}
	}
}
