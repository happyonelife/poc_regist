package com.sinosoft.bpm.rule.bean.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sinosoft.bpm.def.Task;
import com.sinosoft.bpm.rule.bean.dto.RuleAccessoryCheck;
import com.sinosoft.bpm.rule.bean.dto.RuleAdvance;
import com.sinosoft.bpm.rule.bean.dto.RuleAnyPay;
import com.sinosoft.bpm.rule.bean.dto.RuleArbitration;
import com.sinosoft.bpm.rule.bean.dto.RuleAudit;
import com.sinosoft.bpm.rule.bean.dto.RuleBigCase;
import com.sinosoft.bpm.rule.bean.dto.RuleBusiness;
import com.sinosoft.bpm.rule.bean.dto.RuleCarAppendlossApproval;
import com.sinosoft.bpm.rule.bean.dto.RuleCarLossApproval;
import com.sinosoft.bpm.rule.bean.dto.RuleCarPriceAndVerify;
import com.sinosoft.bpm.rule.bean.dto.RuleCarVerify;
import com.sinosoft.bpm.rule.bean.dto.RuleCarVerip;
import com.sinosoft.bpm.rule.bean.dto.RuleCertificate;
import com.sinosoft.bpm.rule.bean.dto.RuleCheck;
import com.sinosoft.bpm.rule.bean.dto.RuleCompensate;
import com.sinosoft.bpm.rule.bean.dto.RuleDispute;
import com.sinosoft.bpm.rule.bean.dto.RuleEndCase;
import com.sinosoft.bpm.rule.bean.dto.RuleInitialize;
import com.sinosoft.bpm.rule.bean.dto.RuleInputCommon;
import com.sinosoft.bpm.rule.bean.dto.RuleInspection;
import com.sinosoft.bpm.rule.bean.dto.RulePayment;
import com.sinosoft.bpm.rule.bean.dto.RulePersonAppendLossApproval;
import com.sinosoft.bpm.rule.bean.dto.RulePersonArticleInvestigate;
import com.sinosoft.bpm.rule.bean.dto.RulePersonCheck;
import com.sinosoft.bpm.rule.bean.dto.RulePersonInvestigate;
import com.sinosoft.bpm.rule.bean.dto.RulePersonLossApproval;
import com.sinosoft.bpm.rule.bean.dto.RulePersonLossVerify;
import com.sinosoft.bpm.rule.bean.dto.RulePrePay;
import com.sinosoft.bpm.rule.bean.dto.RulePresonMediate;
import com.sinosoft.bpm.rule.bean.dto.RulePresonTrack;
import com.sinosoft.bpm.rule.bean.dto.RulePropLossApproval;
import com.sinosoft.bpm.rule.bean.dto.RulePropVerify;
import com.sinosoft.bpm.rule.bean.dto.RulePrpallFeedback;
import com.sinosoft.bpm.rule.bean.dto.RuleReCase;
import com.sinosoft.bpm.rule.bean.dto.RuleReClaim;
import com.sinosoft.bpm.rule.bean.dto.RuleRegist;
import com.sinosoft.bpm.rule.bean.dto.RuleRepairCheck;
import com.sinosoft.bpm.rule.bean.dto.RuleReplevy;
import com.sinosoft.bpm.rule.bean.dto.RuleReport;
import com.sinosoft.bpm.rule.bean.dto.RuleRiskAudit;
import com.sinosoft.bpm.rule.bean.dto.RuleRiskInfo;
import com.sinosoft.bpm.rule.bean.dto.RuleSchedule;
import com.sinosoft.bpm.rule.bean.dto.RuleSubrogation;
import com.sinosoft.bpm.rule.bean.dto.RuleTaskCancel;
import com.sinosoft.bpm.rule.bean.dto.RuleUndwrt;
import com.sinosoft.bpm.rule.bean.dto.Rulesurvey;

import cn.sinosoft.claim.assem.page.check.SimpleCasePage;
import cn.sinosoft.claim.base.entity.rulerisk.PrplAutoUndwrtRuleInfoEntity;




/**
 * 请求规则引擎入参
 * @author chaoll
 *
 */
public class RuleProcessInputXOM  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**版本号*/
	private String version ;
	/**数据存储开关*/
	private String smps = "Y";
	/**是否预热*/
	private String isWarmUp = "N";
	/**任务ID*/
	private String taskId ;
	/**主业务号*/
	private String businessMainKey ;
	/**业务标识号*/
	private String businessKey;
	/**任务类型*/
	private String taskType;
	/**任务分类*/
	private	String taskCatalog;
	/**操作员*/
	private String userCode;
	/**当前业务归属机构*/
	private String claimNowComCode;
	/**机构级别*/
	private String comLevel;
	/**险类*/
	private String classCode;
	/**险种*/
	private String riskCode;
	/**车辆定损信息*/
	private RuleCarLossApproval ruleCarLossApproval = new RuleCarLossApproval();
	/**车辆核损信息*/
	private RuleCarVerify ruleCarVerify = new RuleCarVerify();
	/**车辆核价信息*/
	private RuleCarVerip ruleCarVerip = new RuleCarVerip();
	/**单证信息*/
	private RuleCertificate ruleCertificate = new RuleCertificate();
	/**查勘信息*/
	private RuleCheck ruleCheck = new RuleCheck();
	/**理算信息*/
	private RuleCompensate ruleCompensate = new RuleCompensate();
	/**结案信息*/
	private RuleEndCase ruleEndCase = new RuleEndCase();
	/**支付信息*/
	private RulePayment rulePayment = new RulePayment();
	/**人伤专项调查信息*/
	private RulePersonArticleInvestigate rulePersonArticleInvestigate = new RulePersonArticleInvestigate();
	/**人伤首次调查信息*/
	private RulePersonInvestigate rulePersonInvestigate = new RulePersonInvestigate();
	/**人伤定损信息*/
	private RulePersonLossApproval rulePersonLossApproval = new RulePersonLossApproval();
	/**人伤核损信息*/
	private RulePersonLossVerify rulePersonLossVerify = new RulePersonLossVerify();
	/**人伤调解信息*/
	private RulePresonMediate rulePresonMediate = new RulePresonMediate();
	/**人伤跟踪信息*/
	private RulePresonTrack rulePresonTrack = new RulePresonTrack();
	/**财产定损信息*/
	private RulePropLossApproval rulePropLossApproval = new RulePropLossApproval();
	/**财产核损信息*/
	private RulePropVerify rulePropVerify = new RulePropVerify();
	/**报案信息*/
	private RuleRegist ruleRegist = new RuleRegist();
	/**追偿信息*/
	private RuleReplevy ruleReplevy = new RuleReplevy();
	/**举报信息*/
	private RuleReport ruleReport = new RuleReport();
	/**调度信息*/
	private RuleSchedule ruleSchedule = new RuleSchedule();
	/**核赔信息*/
	private RuleUndwrt ruleUndwrt = new RuleUndwrt();
	/**诉讼信息*/
	private RuleDispute ruleDispute = new RuleDispute();
	/**质检信息*/
	private RuleInspection ruleInspection = new RuleInspection();
	/**仲裁信息*/
	private RuleArbitration ruleArbitration = new RuleArbitration();
	/**配件审验信息*/
	private RuleAccessoryCheck ruleAccessoryCheck = new RuleAccessoryCheck();
	/**修复验车信息*/
	private RuleRepairCheck ruleRepairCheck = new RuleRepairCheck();
	/**损余回收信息*/
	private RuleReClaim ruleReClaim = new RuleReClaim();
	/**预赔信息*/
	private RulePrePay rulePrePay = new RulePrePay();
	/**调查信息*/
	private Rulesurvey rulesurvey = new Rulesurvey();
	/**风险审核信息*/
	private RuleRiskAudit ruleRiskAudit = new RuleRiskAudit();
	/**垫付信息*/
	private RuleAdvance ruleAdvance = new RuleAdvance();
	/**承保反馈信息*/
	private RulePrpallFeedback rulePrpallFeedback = new RulePrpallFeedback();
	/**任务注销信息*/
	private RuleTaskCancel ruleTaskCancel = new RuleTaskCancel();
	/**追加定损信息*/
	private RuleCarAppendlossApproval ruleCarAppendlossApproval = new RuleCarAppendlossApproval();
	/**重开赔案信息*/
	private RuleReCase ruleReCase = new RuleReCase();
	/**业务规则信息*/
	private RuleBusiness ruleBusiness = new RuleBusiness();
	/**初始化信息*/
	private RuleInitialize ruleInitialize = new RuleInitialize();
	/**人伤追加定损*/
	private RulePersonAppendLossApproval rulePersonAppendLossApproval = new RulePersonAppendLossApproval();
	/**公共参数*/
	private RuleInputCommon ruleInputCommon = new RuleInputCommon();
	/**代位求偿信息*/
	private RuleSubrogation ruleSubrogation = new RuleSubrogation();
	/**人伤查勘*/
	private RulePersonCheck rulePersonCheck = new RulePersonCheck();
	/** 小额快赔 */
	private SimpleCasePage simpleCasePage  = new SimpleCasePage();
	
	/** 风险信息*/
	private List<RuleRiskInfo> ruleRiskInfoLists = new ArrayList<RuleRiskInfo>();  
	/**是否生成风险审核标志*/
	private String riskProcessFlag = "N";
	/**风险信息用于生成流程*/
	private List<PrplAutoUndwrtRuleInfoEntity> prplAutoUndwrtRuleInfoEntityList = new ArrayList<PrplAutoUndwrtRuleInfoEntity>();
	/**当前业务归属机构*/
	private String riskInfoComLevel;

	private String caseType = "N";
	/**大案上报*/
	private RuleBigCase ruleBigCase = new RuleBigCase();
	
	/**财产定损提交核损的时候任务的最低审核级别*/
	private String propAuditLevel = "9";
	/**车辆定损提交核损的时候任务的最低审核级别*/
	private String carAuditLevel = "9";
	/**人伤定损提交核损的时候任务的最低审核级别*/
	private String personAuditLevel = "9";
	/**理算提交核赔的时候任务的最低审核级别*/
	private String undwrtAuditLevel = "9";
	/**每个审核级别的人数*/
	private Map<String,Integer> everyLevelPersonCountMap = new HashMap<String, Integer>();
	/**核赔回退*/
	private List<Task> allTaskList = new ArrayList<Task>();
	/**核损级别*/
	private Map<String, String> catalogss = new HashMap<String, String>();
	/**是否自动多次核损提交*/
	private String lossSingleIn = "Y";
	/**提交类型Y-提交上级N审核通过*/
	private String auditType = "Y";
	/**当前任务级别*/
	private String currentTaskPowerLevel = "1";
	/**定损理算等环节提交的时候确定审核任务类型*/
	private RuleAudit ruleAudit = new RuleAudit();
	/**追偿，仲裁，诉讼使用字段*/
	private String lawReplevyArbitrationFlag = "Y";
	
	private RuleCarPriceAndVerify ruleCarPriceAndVerify = new RuleCarPriceAndVerify();
	
	/**通赔*/
	private RuleAnyPay ruleAnyPay = new RuleAnyPay();
	
	public String getCurrentTaskPowerLevel() {
		return currentTaskPowerLevel;
	}
	public void setCurrentTaskPowerLevel(String currentTaskPowerLevel) {
		this.currentTaskPowerLevel = currentTaskPowerLevel;
	}
	public String getAuditType() {
		return auditType;
	}
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}
	public String getLossSingleIn() {
		return lossSingleIn;
	}
	public void setLossSingleIn(String lossSingleIn) {
		this.lossSingleIn = lossSingleIn;
	}
	public Map<String, String> getCatalogss() {
		return catalogss;
	}
	public void setCatalogss(Map<String, String> catalogss) {
		this.catalogss = catalogss;
	}
	public List<Task> getAllTaskList() {
		return allTaskList;
	}
	public void setAllTaskList(List<Task> allTaskList) {
		this.allTaskList = allTaskList;
	}
	public Map<String, Integer> getEveryLevelPersonCountMap() {
		return everyLevelPersonCountMap;
	}
	public void setEveryLevelPersonCountMap(
			Map<String, Integer> everyLevelPersonCountMap) {
		this.everyLevelPersonCountMap = everyLevelPersonCountMap;
	}
	public String getCaseType() {
		return caseType;
	}
	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public RuleSubrogation getRuleSubrogation() {
		return ruleSubrogation;
	}
	public void setRuleSubrogation(RuleSubrogation ruleSubrogation) {
		this.ruleSubrogation = ruleSubrogation;
	}
	public String getSmps() {
		return smps;
	}
	public void setSmps(String smps) {
		this.smps = smps;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getBusinessMainKey() {
		return businessMainKey;
	}
	public void setBusinessMainKey(String businessMainKey) {
		this.businessMainKey = businessMainKey;
	}
	public String getBusinessKey() {
		return businessKey;
	}
	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	public String getTaskCatalog() {
		return taskCatalog;
	}
	public void setTaskCatalog(String taskCatalog) {
		this.taskCatalog = taskCatalog;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getClaimNowComCode() {
		return claimNowComCode;
	}
	public void setClaimNowComCode(String claimNowComCode) {
		this.claimNowComCode = claimNowComCode;
	}
	public String getComLevel() {
		return comLevel;
	}
	public void setComLevel(String comLevel) {
		this.comLevel = comLevel;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public RuleCarLossApproval getRuleCarLossApproval() {
		return ruleCarLossApproval;
	}
	public void setRuleCarLossApproval(RuleCarLossApproval ruleCarLossApproval) {
		this.ruleCarLossApproval = ruleCarLossApproval;
	}
	public RuleCarVerify getRuleCarVerify() {
		return ruleCarVerify;
	}
	public void setRuleCarVerify(RuleCarVerify ruleCarVerify) {
		this.ruleCarVerify = ruleCarVerify;
	}
	public RuleCarVerip getRuleCarVerip() {
		return ruleCarVerip;
	}
	public void setRuleCarVerip(RuleCarVerip ruleCarVerip) {
		this.ruleCarVerip = ruleCarVerip;
	}
	public RuleCertificate getRuleCertificate() {
		return ruleCertificate;
	}
	public void setRuleCertificate(RuleCertificate ruleCertificate) {
		this.ruleCertificate = ruleCertificate;
	}
	public RuleCheck getRuleCheck() {
		return ruleCheck;
	}
	public void setRuleCheck(RuleCheck ruleCheck) {
		this.ruleCheck = ruleCheck;
	}
	public RuleCompensate getRuleCompensate() {
		return ruleCompensate;
	}
	public void setRuleCompensate(RuleCompensate ruleCompensate) {
		this.ruleCompensate = ruleCompensate;
	}
	public RuleEndCase getRuleEndCase() {
		return ruleEndCase;
	}
	public void setRuleEndCase(RuleEndCase ruleEndCase) {
		this.ruleEndCase = ruleEndCase;
	}
	public RulePayment getRulePayment() {
		return rulePayment;
	}
	public void setRulePayment(RulePayment rulePayment) {
		this.rulePayment = rulePayment;
	}
	public RulePersonArticleInvestigate getRulePersonArticleInvestigate() {
		return rulePersonArticleInvestigate;
	}
	public void setRulePersonArticleInvestigate(
			RulePersonArticleInvestigate rulePersonArticleInvestigate) {
		this.rulePersonArticleInvestigate = rulePersonArticleInvestigate;
	}
	public RulePersonInvestigate getRulePersonInvestigate() {
		return rulePersonInvestigate;
	}
	public void setRulePersonInvestigate(RulePersonInvestigate rulePersonInvestigate) {
		this.rulePersonInvestigate = rulePersonInvestigate;
	}
	public RulePersonLossApproval getRulePersonLossApproval() {
		return rulePersonLossApproval;
	}
	public void setRulePersonLossApproval(
			RulePersonLossApproval rulePersonLossApproval) {
		this.rulePersonLossApproval = rulePersonLossApproval;
	}
	public RulePersonLossVerify getRulePersonLossVerify() {
		return rulePersonLossVerify;
	}
	public void setRulePersonLossVerify(RulePersonLossVerify rulePersonLossVerify) {
		this.rulePersonLossVerify = rulePersonLossVerify;
	}
	public RulePresonMediate getRulePresonMediate() {
		return rulePresonMediate;
	}
	public void setRulePresonMediate(RulePresonMediate rulePresonMediate) {
		this.rulePresonMediate = rulePresonMediate;
	}
	public RulePresonTrack getRulePresonTrack() {
		return rulePresonTrack;
	}
	public void setRulePresonTrack(RulePresonTrack rulePresonTrack) {
		this.rulePresonTrack = rulePresonTrack;
	}
	public RulePropLossApproval getRulePropLossApproval() {
		return rulePropLossApproval;
	}
	public void setRulePropLossApproval(RulePropLossApproval rulePropLossApproval) {
		this.rulePropLossApproval = rulePropLossApproval;
	}
	public RulePropVerify getRulePropVerify() {
		return rulePropVerify;
	}
	public void setRulePropVerify(RulePropVerify rulePropVerify) {
		this.rulePropVerify = rulePropVerify;
	}
	public RuleRegist getRuleRegist() {
		return ruleRegist;
	}
	public void setRuleRegist(RuleRegist ruleRegist) {
		this.ruleRegist = ruleRegist;
	}
	public RuleReplevy getRuleReplevy() {
		return ruleReplevy;
	}
	public void setRuleReplevy(RuleReplevy ruleReplevy) {
		this.ruleReplevy = ruleReplevy;
	}
	public RuleReport getRuleReport() {
		return ruleReport;
	}
	public void setRuleReport(RuleReport ruleReport) {
		this.ruleReport = ruleReport;
	}
	public RuleSchedule getRuleSchedule() {
		return ruleSchedule;
	}
	public void setRuleSchedule(RuleSchedule ruleSchedule) {
		this.ruleSchedule = ruleSchedule;
	}
	public RuleUndwrt getRuleUndwrt() {
		return ruleUndwrt;
	}
	public void setRuleUndwrt(RuleUndwrt ruleUndwrt) {
		this.ruleUndwrt = ruleUndwrt;
	}
	public RuleDispute getRuleDispute() {
		return ruleDispute;
	}
	public void setRuleDispute(RuleDispute ruleDispute) {
		this.ruleDispute = ruleDispute;
	}
	public RuleInspection getRuleInspection() {
		return ruleInspection;
	}
	public void setRuleInspection(RuleInspection ruleInspection) {
		this.ruleInspection = ruleInspection;
	}
	public RuleArbitration getRuleArbitration() {
		return ruleArbitration;
	}
	public void setRuleArbitration(RuleArbitration ruleArbitration) {
		this.ruleArbitration = ruleArbitration;
	}
	public RuleAccessoryCheck getRuleAccessoryCheck() {
		return ruleAccessoryCheck;
	}
	public void setRuleAccessoryCheck(RuleAccessoryCheck ruleAccessoryCheck) {
		this.ruleAccessoryCheck = ruleAccessoryCheck;
	}
	public RuleRepairCheck getRuleRepairCheck() {
		return ruleRepairCheck;
	}
	public void setRuleRepairCheck(RuleRepairCheck ruleRepairCheck) {
		this.ruleRepairCheck = ruleRepairCheck;
	}
	public RuleReClaim getRuleReClaim() {
		return ruleReClaim;
	}
	public void setRuleReClaim(RuleReClaim ruleReClaim) {
		this.ruleReClaim = ruleReClaim;
	}
	public RulePrePay getRulePrePay() {
		return rulePrePay;
	}
	public void setRulePrePay(RulePrePay rulePrePay) {
		this.rulePrePay = rulePrePay;
	}
	public Rulesurvey getRulesurvey() {
		return rulesurvey;
	}
	public void setRulesurvey(Rulesurvey rulesurvey) {
		this.rulesurvey = rulesurvey;
	}
	public RuleRiskAudit getRuleRiskAudit() {
		return ruleRiskAudit;
	}
	public void setRuleRiskAudit(RuleRiskAudit ruleRiskAudit) {
		this.ruleRiskAudit = ruleRiskAudit;
	}
	public RuleAdvance getRuleAdvance() {
		return ruleAdvance;
	}
	public void setRuleAdvance(RuleAdvance ruleAdvance) {
		this.ruleAdvance = ruleAdvance;
	}
	public RulePrpallFeedback getRulePrpallFeedback() {
		return rulePrpallFeedback;
	}
	public void setRulePrpallFeedback(RulePrpallFeedback rulePrpallFeedback) {
		this.rulePrpallFeedback = rulePrpallFeedback;
	}
	public RuleTaskCancel getRuleTaskCancel() {
		return ruleTaskCancel;
	}
	public void setRuleTaskCancel(RuleTaskCancel ruleTaskCancel) {
		this.ruleTaskCancel = ruleTaskCancel;
	}
	public RuleCarAppendlossApproval getRuleCarAppendlossApproval() {
		return ruleCarAppendlossApproval;
	}
	public void setRuleCarAppendlossApproval(
			RuleCarAppendlossApproval ruleCarAppendlossApproval) {
		this.ruleCarAppendlossApproval = ruleCarAppendlossApproval;
	}
	public RuleReCase getRuleReCase() {
		return ruleReCase;
	}
	public void setRuleReCase(RuleReCase ruleReCase) {
		this.ruleReCase = ruleReCase;
	}
	public RuleBusiness getRuleBusiness() {
		return ruleBusiness;
	}
	public void setRuleBusiness(RuleBusiness ruleBusiness) {
		this.ruleBusiness = ruleBusiness;
	}
	public RuleInitialize getRuleInitialize() {
		return ruleInitialize;
	}
	public void setRuleInitialize(RuleInitialize ruleInitialize) {
		this.ruleInitialize = ruleInitialize;
	}
	public RulePersonAppendLossApproval getRulePersonAppendLossApproval() {
		return rulePersonAppendLossApproval;
	}
	public void setRulePersonAppendLossApproval(
			RulePersonAppendLossApproval rulePersonAppendLossApproval) {
		this.rulePersonAppendLossApproval = rulePersonAppendLossApproval;
	}
	public RuleInputCommon getRuleInputCommon() {
		return ruleInputCommon;
	}
	public void setRuleInputCommon(RuleInputCommon ruleInputCommon) {
		this.ruleInputCommon = ruleInputCommon;
	}
	public String getIsWarmUp() {
		return isWarmUp;
	}
	public void setIsWarmUp(String isWarmUp) {
		this.isWarmUp = isWarmUp;
	}
	public RulePersonCheck getRulePersonCheck() {
		return rulePersonCheck;
	}
	public void setRulePersonCheck(RulePersonCheck rulePersonCheck) {
		this.rulePersonCheck = rulePersonCheck;
	}
	public SimpleCasePage getSimpleCasePage() {
		return simpleCasePage;
	}
	public void setSimpleCasePage(SimpleCasePage simpleCasePage) {
		this.simpleCasePage = simpleCasePage;
	}
	public List<RuleRiskInfo> getRuleRiskInfoLists() {
		return ruleRiskInfoLists;
	}
	public void setRuleRiskInfoLists(List<RuleRiskInfo> ruleRiskInfoLists) {
		this.ruleRiskInfoLists = ruleRiskInfoLists;
	}
	public String getRiskProcessFlag() {
		return riskProcessFlag;
	}
	public void setRiskProcessFlag(String riskProcessFlag) {
		this.riskProcessFlag = riskProcessFlag;
	}
	public List<PrplAutoUndwrtRuleInfoEntity> getPrplAutoUndwrtRuleInfoEntityList() {
		return prplAutoUndwrtRuleInfoEntityList;
	}
	public void setPrplAutoUndwrtRuleInfoEntityList(
			List<PrplAutoUndwrtRuleInfoEntity> prplAutoUndwrtRuleInfoEntityList) {
		this.prplAutoUndwrtRuleInfoEntityList = prplAutoUndwrtRuleInfoEntityList;
	}
	public String getRiskInfoComLevel() {
		return riskInfoComLevel;
	}
	public void setRiskInfoComLevel(String riskInfoComLevel) {
		this.riskInfoComLevel = riskInfoComLevel;
	}
	public String getPropAuditLevel() {
		return propAuditLevel;
	}
	public void setPropAuditLevel(String propAuditLevel) {
		this.propAuditLevel = propAuditLevel;
	}
	public String getCarAuditLevel() {
		return carAuditLevel;
	}
	public void setCarAuditLevel(String carAuditLevel) {
		this.carAuditLevel = carAuditLevel;
	}
	public String getPersonAuditLevel() {
		return personAuditLevel;
	}
	public void setPersonAuditLevel(String personAuditLevel) {
		this.personAuditLevel = personAuditLevel;
	}
	public String getUndwrtAuditLevel() {
		return undwrtAuditLevel;
	}
	public void setUndwrtAuditLevel(String undwrtAuditLevel) {
		this.undwrtAuditLevel = undwrtAuditLevel;
	}
	public RuleAudit getRuleAudit() {
		return ruleAudit;
	}
	public void setRuleAudit(RuleAudit ruleAudit) {
		this.ruleAudit = ruleAudit;
	}
	public RuleCarPriceAndVerify getRuleCarPriceAndVerify() {
		return ruleCarPriceAndVerify;
	}
	public void setRuleCarPriceAndVerify(RuleCarPriceAndVerify ruleCarPriceAndVerify) {
		this.ruleCarPriceAndVerify = ruleCarPriceAndVerify;
	}
	public RuleBigCase getRuleBigCase() {
		return ruleBigCase;
	}
	public void setRuleBigCase(RuleBigCase ruleBigCase) {
		this.ruleBigCase = ruleBigCase;
	}
	public String getLawReplevyArbitrationFlag() {
		return lawReplevyArbitrationFlag;
	}
	public void setLawReplevyArbitrationFlag(String lawReplevyArbitrationFlag) {
		this.lawReplevyArbitrationFlag = lawReplevyArbitrationFlag;
	}
	public RuleAnyPay getRuleAnyPay() {
		return ruleAnyPay;
	}
	public void setRuleAnyPay(RuleAnyPay ruleAnyPay) {
		this.ruleAnyPay = ruleAnyPay;
	}
	
}
