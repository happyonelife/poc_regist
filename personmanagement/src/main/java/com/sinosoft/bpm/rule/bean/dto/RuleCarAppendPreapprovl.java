package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 追加定损信息
 * @author chao
 *
 */
public class RuleCarAppendPreapprovl implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	是否回退的定损*/
	private	String	isSendOfBackLoss;
	/**	是否存在非外修换件*/
	private	String	isInRepairedOutside;
	/**	任务提交方式*/
	private	String	taskSubmitType;
	/**	分公司是否有核价人员*/
	private	String	isBraPriPersonnel;
	/**	是否重开赔案*/
	private	String	isReCase;
	/**	定损金额*/
	private	Double	totalLossAmount;
	/**	原定损金额*/
	private	Double	ytotalLossAmount;
	/**	风险评分*/
	private	Double	riskEvaluate;
	/**	是否增补配件*/
	private	String	supFittings;
	/**	车辆品牌*/
	private	String	carBrand;
	/**	项目名称*/
	private	String	projectName;
	/**	项目金额*/
	private	Double	projectAmount;
	/**	是否自保车*/
	private	String	selprecar;
	/**	核价是否回退*/
	private	String	theNucPriceBack;
	/**	是否同意核价意见*/
	private	String	isAgrWitNucPrice;
	/**	是否有新增换件*/
	private	String	isInNew;
	/**	是否调高换件金额*/
	private	String	isIncTheAmountChange;
	/**	是否存在分公司核价人员*/
	private	String	isBrachPricePersonnel;
	/**核损是否回退*/
	private	String	theNucDamBack;
	/**是否同意核损意见*/
	private	String	isAgrWitTheNucDamage;
	/**是否有新增项目*/
	private	String	isNewProject;
	/**是否调整换件金额*/
	private	String	isAmountAdjustment;
	/**换件数量是否减少*/
	private	String	tochaQuaIsreduced;
	/**工时辅料金额是否调高*/
	private	String	worHouMatAmountHigher;
	/**回退前核价任务分类*/
	private	String	backLossTaskCatalog;
	/**回退前核价任务类型*/
	private	String	backLossTaskType;
	/**回退前核损任务分类*/
	private	String	backPriceTaskCatalog;
	/**回退前核损任务类型*/
	private	String	backPriceTaskType;
	/**分公司是否有核损人员*/
	private	String	isBraLossPersonnel;
	
	public String getIsReCase() {
		return isReCase;
	}
	public void setIsReCase(String isReCase) {
		this.isReCase = isReCase;
	}
	public String getIsBraLossPersonnel() {
		return isBraLossPersonnel;
	}
	public void setIsBraLossPersonnel(String isBraLossPersonnel) {
		this.isBraLossPersonnel = isBraLossPersonnel;
	}
	public String getIsSendOfBackLoss() {
		return isSendOfBackLoss;
	}
	public void setIsSendOfBackLoss(String isSendOfBackLoss) {
		this.isSendOfBackLoss = isSendOfBackLoss;
	}
	public String getIsInRepairedOutside() {
		return isInRepairedOutside;
	}
	public void setIsInRepairedOutside(String isInRepairedOutside) {
		this.isInRepairedOutside = isInRepairedOutside;
	}
	public String getTaskSubmitType() {
		return taskSubmitType;
	}
	public void setTaskSubmitType(String taskSubmitType) {
		this.taskSubmitType = taskSubmitType;
	}
	public String getIsBraPriPersonnel() {
		return isBraPriPersonnel;
	}
	public void setIsBraPriPersonnel(String isBraPriPersonnel) {
		this.isBraPriPersonnel = isBraPriPersonnel;
	}
	public Double getTotalLossAmount() {
		return totalLossAmount;
	}
	public void setTotalLossAmount(Double totalLossAmount) {
		this.totalLossAmount = totalLossAmount;
	}
	public Double getYtotalLossAmount() {
		return ytotalLossAmount;
	}
	public void setYtotalLossAmount(Double ytotalLossAmount) {
		this.ytotalLossAmount = ytotalLossAmount;
	}
	public Double getRiskEvaluate() {
		return riskEvaluate;
	}
	public void setRiskEvaluate(Double riskEvaluate) {
		this.riskEvaluate = riskEvaluate;
	}
	public String getSupFittings() {
		return supFittings;
	}
	public void setSupFittings(String supFittings) {
		this.supFittings = supFittings;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Double getProjectAmount() {
		return projectAmount;
	}
	public void setProjectAmount(Double projectAmount) {
		this.projectAmount = projectAmount;
	}
	public String getSelprecar() {
		return selprecar;
	}
	public void setSelprecar(String selprecar) {
		this.selprecar = selprecar;
	}
	public String getTheNucPriceBack() {
		return theNucPriceBack;
	}
	public void setTheNucPriceBack(String theNucPriceBack) {
		this.theNucPriceBack = theNucPriceBack;
	}
	public String getIsAgrWitNucPrice() {
		return isAgrWitNucPrice;
	}
	public void setIsAgrWitNucPrice(String isAgrWitNucPrice) {
		this.isAgrWitNucPrice = isAgrWitNucPrice;
	}
	public String getIsInNew() {
		return isInNew;
	}
	public void setIsInNew(String isInNew) {
		this.isInNew = isInNew;
	}
	public String getIsIncTheAmountChange() {
		return isIncTheAmountChange;
	}
	public void setIsIncTheAmountChange(String isIncTheAmountChange) {
		this.isIncTheAmountChange = isIncTheAmountChange;
	}
	public String getIsBrachPricePersonnel() {
		return isBrachPricePersonnel;
	}
	public void setIsBrachPricePersonnel(String isBrachPricePersonnel) {
		this.isBrachPricePersonnel = isBrachPricePersonnel;
	}
	public String getTheNucDamBack() {
		return theNucDamBack;
	}
	public void setTheNucDamBack(String theNucDamBack) {
		this.theNucDamBack = theNucDamBack;
	}
	public String getIsAgrWitTheNucDamage() {
		return isAgrWitTheNucDamage;
	}
	public void setIsAgrWitTheNucDamage(String isAgrWitTheNucDamage) {
		this.isAgrWitTheNucDamage = isAgrWitTheNucDamage;
	}
	public String getIsNewProject() {
		return isNewProject;
	}
	public void setIsNewProject(String isNewProject) {
		this.isNewProject = isNewProject;
	}
	public String getIsAmountAdjustment() {
		return isAmountAdjustment;
	}
	public void setIsAmountAdjustment(String isAmountAdjustment) {
		this.isAmountAdjustment = isAmountAdjustment;
	}
	public String getTochaQuaIsreduced() {
		return tochaQuaIsreduced;
	}
	public void setTochaQuaIsreduced(String tochaQuaIsreduced) {
		this.tochaQuaIsreduced = tochaQuaIsreduced;
	}
	public String getWorHouMatAmountHigher() {
		return worHouMatAmountHigher;
	}
	public void setWorHouMatAmountHigher(String worHouMatAmountHigher) {
		this.worHouMatAmountHigher = worHouMatAmountHigher;
	}
	public String getBackLossTaskCatalog() {
		return backLossTaskCatalog;
	}
	public void setBackLossTaskCatalog(String backLossTaskCatalog) {
		this.backLossTaskCatalog = backLossTaskCatalog;
	}
	public String getBackLossTaskType() {
		return backLossTaskType;
	}
	public void setBackLossTaskType(String backLossTaskType) {
		this.backLossTaskType = backLossTaskType;
	}
	public String getBackPriceTaskCatalog() {
		return backPriceTaskCatalog;
	}
	public void setBackPriceTaskCatalog(String backPriceTaskCatalog) {
		this.backPriceTaskCatalog = backPriceTaskCatalog;
	}
	public String getBackPriceTaskType() {
		return backPriceTaskType;
	}
	public void setBackPriceTaskType(String backPriceTaskType) {
		this.backPriceTaskType = backPriceTaskType;
	}
	
}
