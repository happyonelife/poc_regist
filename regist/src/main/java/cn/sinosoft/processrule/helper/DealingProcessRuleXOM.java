package cn.sinosoft.processrule.helper;

import java.io.Serializable;
import java.lang.reflect.Method;

import com.sinosoft.bpm.rule.bean.dto.RuleInputCommon;
import com.sinosoft.bpm.rule.bean.model.RuleProcessInputXOM;
import com.sinosoft.bpm.rule.bean.model.RuleProcessOutputXOM;

import cn.sinosoft.processrule.helper.bean.CheckFields;
import cn.sinosoft.processrule.helper.bean.ProcessRuleFields;
import cn.sinosoft.processrule.helper.bean.SyncRuleFields;

public class DealingProcessRuleXOM implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RuleProcessOutputXOM outPutXom = null;
	private RuleProcessInputXOM inPutXom = null;
	private CheckFields checkFields = new CheckFields();
	private ProcessRuleFields ruleFields = new ProcessRuleFields();
	private SyncRuleFields syncRuleFields = new SyncRuleFields();
	
	public DealingProcessRuleXOM() {
	}
	
	

	public DealingProcessRuleXOM(RuleProcessOutputXOM outPutXom,
			RuleProcessInputXOM inPutXom) {
		this.outPutXom = outPutXom;
		this.inPutXom = inPutXom;
	}

	//报案
	public void dealWithForAddTask(String taskType,String claimComCodeType,String claimComCode,String nodeType,String isAutoComplete,String taskCatalog){
		if(null!=inPutXom && null!=outPutXom){
			if(claimComCodeType!=null){
				
				if("0".endsWith(claimComCodeType)){//从规则文件中取
					outPutXom.setTaskList(taskType, claimComCode, "", inPutXom.getRuleInputCommon().getHandleCode(), nodeType, inPutXom.getBusinessMainKey(), inPutXom.getBusinessKey(), isAutoComplete,inPutXom.getRuleInputCommon().getCarItemsId(),inPutXom.getRuleInputCommon().getPropItemsId(),inPutXom.getRuleInputCommon().getPersonItemsId(),taskCatalog);
				}else if("1".equals(claimComCodeType)){//从输入对象中取
					if("DocCollect".equals(taskType)){
						outPutXom.setTaskList(taskType, inPutXom.getRuleInputCommon().getClaimComCode(), "", inPutXom.getRuleInputCommon().getHandleCode(), nodeType, inPutXom.getBusinessMainKey(), inPutXom.getBusinessKey(), isAutoComplete,inPutXom.getRuleInputCommon().getCarItemsId(),inPutXom.getRuleInputCommon().getPropItemsId(),inPutXom.getRuleInputCommon().getPersonItemsId(),taskCatalog);
					}else{
						outPutXom.setTaskList(taskType, inPutXom.getRuleRegist().getScheduleComCode(), "", inPutXom.getRuleInputCommon().getHandleCode(), nodeType, inPutXom.getBusinessMainKey(), inPutXom.getBusinessKey(), isAutoComplete,inPutXom.getRuleInputCommon().getCarItemsId(),inPutXom.getRuleInputCommon().getPropItemsId(),inPutXom.getRuleInputCommon().getPersonItemsId(),taskCatalog);
					}
				}
			}
		}
	}
	
	public void dealWithForAddBatchTask(String taskType,String nodeType,String isAutoComplete,String taskCatalog){
		if(null!=inPutXom && null!=outPutXom){
			if(taskType.equals("BIClaim")){
				outPutXom.setTaskBat(inPutXom.getRuleRegist().getBiClaimCount(), taskType, inPutXom.getRuleInputCommon().getClaimComCode(), "", inPutXom.getRuleInputCommon().getHandleCode(), nodeType, inPutXom.getBusinessMainKey(), inPutXom.getBusinessKey(), isAutoComplete, inPutXom.getRuleInputCommon().getCarItemsId(), inPutXom.getRuleInputCommon().getPropItemsId(), inPutXom.getRuleInputCommon().getPersonItemsId(), taskCatalog);
			}else if(taskType.equals("CIClaim")){
				outPutXom.setTaskBat(inPutXom.getRuleRegist().getCiClaimCount(), taskType, inPutXom.getRuleInputCommon().getClaimComCode(), "", inPutXom.getRuleInputCommon().getHandleCode(), nodeType, inPutXom.getBusinessMainKey(), inPutXom.getBusinessKey(), isAutoComplete, inPutXom.getRuleInputCommon().getCarItemsId(), inPutXom.getRuleInputCommon().getPropItemsId(), inPutXom.getRuleInputCommon().getPersonItemsId(), taskCatalog);
			}
		}
	}
	
	//查勘--setStandProces-独立流程
	public void dealWithForAddProcess(){
		String claimComCode = "";
		String handleCode = "";
		if("1".equals(checkFields.getHandleCode())){
			handleCode = inPutXom.getRuleInputCommon().getHandleCode();
		}else{
			handleCode = checkFields.getHandleCode();
		}
		if("1".equals(checkFields.getClaimBusinessDealingComCode())){
			claimComCode = inPutXom.getRuleInputCommon().getClaimComCode();
		}else{
			claimComCode = checkFields.getClaimBusinessDealingComCode();
		}
		outPutXom.setStandProces(checkFields.getIndependentProcessName(), inPutXom.getBusinessMainKey(), checkFields.getTaskType(), checkFields.getTaskClassification(), claimComCode, handleCode, checkFields.getNodeType(), inPutXom.getBusinessKey(), checkFields.getIsAutoComplete(), inPutXom.getRuleInputCommon().getCarItemsId(), inPutXom.getRuleInputCommon().getPropItemsId(), inPutXom.getRuleInputCommon().getPersonItemsId());
		checkFields = new CheckFields();
	}
	
	//查勘--setTaskBat-批量
	public void dealWithForAddBatchProcess(){
		RuleInputCommon ruleInputCommon = inPutXom.getRuleInputCommon();
		String claimComCode = "";//compensateClaimCom--理算机构
		if("1".equals(checkFields.getCompensateClaimCom())){
			if(ruleInputCommon.getIsAnyPayCase().equals("Y")){
				claimComCode = "00";
			}else{
				claimComCode = ruleInputCommon.getPrpallComCode();
			}
		}else{
			claimComCode = checkFields.getCompensateClaimCom();
		}
		outPutXom.setTaskBat(inPutXom.getRuleCompensate().getAutoCompensateCount(), checkFields.getTaskType(), claimComCode, "", checkFields.getUserCode(), checkFields.getNodeType(), inPutXom.getBusinessMainKey(), inPutXom.getBusinessKey(), checkFields.getIsAutoComplete(), ruleInputCommon.getCarItemsId(), ruleInputCommon.getPropItemsId(), ruleInputCommon.getPersonItemsId(), checkFields.getTaskClassification());
		checkFields = new CheckFields();
	}
	
	//新增任务方法--setTaskList
	public void addTask(){
		getDifferentInfo();
		outPutXom.setTaskList(ruleFields.getTaskType(), ruleFields.getClaimComCode(), "", ruleFields.getHandleCode(), ruleFields.getNodeType(), inPutXom.getBusinessMainKey(), inPutXom.getBusinessKey(),ruleFields.getIsAutoComplete(), inPutXom.getRuleInputCommon().getCarItemsId(), inPutXom.getRuleInputCommon().getPropItemsId(), inPutXom.getRuleInputCommon().getPersonItemsId(), ruleFields.getTaskCatalog());
		ruleFields = new ProcessRuleFields();
	}
	
	private void getDifferentInfo() {
		if("".equals(ruleFields.getTaskType())){
			if("Schedule".equals(ruleFields.getType())){
				ruleFields.setTaskType(inPutXom.getRuleSchedule().getScheduleTaskType());
			}
		}
		if("".equals(ruleFields.getClaimComCode())){
			ruleFields.setClaimComCode(inPutXom.getRuleInputCommon().getClaimComCode());
		}
		if("".equals(ruleFields.getHandleCode())){
			ruleFields.setHandleCode(inPutXom.getRuleInputCommon().getHandleCode());
		}
		if("".equals(ruleFields.getTaskCatalog())){
			if("Schedule".equals(ruleFields.getType())){
				ruleFields.setTaskCatalog(inPutXom.getRuleSchedule().getScheduleTaskClassify());
			}
		}
	}

	//新增流程任务--新增任务方法
	public void addProcess() throws Exception{
		initAddTaskList();
		outPutXom.setTaskList(ruleFields.getTaskType(), ruleFields.getClaimComCode(), "", ruleFields.getHandleCode(), ruleFields.getNodeType(), inPutXom.getBusinessMainKey(), inPutXom.getBusinessKey(), ruleFields.getIsAutoComplete(), inPutXom.getRuleInputCommon().getCarItemsId(), inPutXom.getRuleInputCommon().getPropItemsId(), inPutXom.getRuleInputCommon().getPersonItemsId(), ruleFields.getTaskCatalog());
		ruleFields = new ProcessRuleFields();
	}
	
	//新增流程任务--新增任务方法
	public void addProcessWithSmallCase() throws Exception{
		initAddTaskList();
		for(int i = 0;i<inPutXom.getAllTaskList().size();i++){
			String carId = "";
			String propId = "";
			String personId = "";
			String businessKey = inPutXom.getAllTaskList().get(i).getBusinessKey(); 
			if("CarLossApproval".equals(inPutXom.getAllTaskList().get(i).getTaskCatalog())){
				carId = inPutXom.getAllTaskList().get(i).getTaskCarItems();
			}
			if("PropLossApproval".equals(inPutXom.getAllTaskList().get(i).getTaskCatalog())){
				propId = inPutXom.getAllTaskList().get(i).getTaskPropItems();
			}
			if("PersonInvestigate".equals(inPutXom.getAllTaskList().get(i).getTaskCatalog())){
				personId = inPutXom.getAllTaskList().get(i).getTaskPersonItems();
			}
			outPutXom.setTaskList(inPutXom.getAllTaskList().get(i).getTaskType(), ruleFields.getClaimComCode(), "", ruleFields.getHandleCode(), ruleFields.getNodeType(), inPutXom.getBusinessMainKey(), businessKey, ruleFields.getIsAutoComplete(), carId, propId, personId, inPutXom.getAllTaskList().get(i).getTaskCatalog());
		}
		ruleFields = new ProcessRuleFields();
	}
	//批量新增流程--批量新增流程方法
	public void addBatchProcess() throws Exception{
		initAddTaskList();
		outPutXom.setTaskBat(ruleFields.getTaskCount(), ruleFields.getTaskType(), ruleFields.getClaimComCode(), "", ruleFields.getHandleCode(), ruleFields.getNodeType(), inPutXom.getBusinessMainKey(), inPutXom.getBusinessKey(), ruleFields.getIsAutoComplete(), inPutXom.getRuleInputCommon().getCarItemsId(), inPutXom.getRuleInputCommon().getPropItemsId(), inPutXom.getRuleInputCommon().getPersonItemsId(), ruleFields.getTaskCatalog());
		ruleFields = new ProcessRuleFields();
	}
	
	//新增子流程--新增子流程方法(是否超权限)
	public void addSubProcess() throws Exception{
		initAddTaskList();
		//outPutXom.addSubProcess(processName, businessMainKey, taskType, claimComCode, userCode, nodeType, businessKey, isAutoComplete, carItemsId, propItemsId, personItemsId, taskCatalog, powerLevel, inPower);
		outPutXom.addSubProcess(ruleFields.getProcessName(), inPutXom.getBusinessMainKey(), ruleFields.getTaskType(), ruleFields.getClaimComCode(), ruleFields.getHandleCode(), ruleFields.getNodeType(), inPutXom.getBusinessKey(), ruleFields.getIsAutoComplete(), inPutXom.getRuleInputCommon().getCarItemsId(), inPutXom.getRuleInputCommon().getPropItemsId(), inPutXom.getRuleInputCommon().getPersonItemsId(), ruleFields.getTaskCatalog(), ruleFields.getPowerLevel(), ruleFields.getInPower());
		ruleFields = new ProcessRuleFields();
	}
	// 新增子流程方法- 新增子流程方法
	public void setProces()throws Exception{
		initAddTaskList();
		outPutXom.setProces(ruleFields.getProcessName(), inPutXom.getBusinessMainKey(), ruleFields.getTaskType(), ruleFields.getClaimComCode(), "", ruleFields.getHandleCode(), ruleFields.getNodeType(), inPutXom.getBusinessKey(), ruleFields.getIsAutoComplete(), inPutXom.getRuleInputCommon().getCarItemsId(), inPutXom.getRuleInputCommon().getPropItemsId(), inPutXom.getRuleInputCommon().getPersonItemsId(), ruleFields.getTaskCatalog());
		ruleFields = new ProcessRuleFields();
	}
	
	//新增任务方法(含是否超权限)-新增任务方法(含是否超权限)
	public void addTaskWithPower() throws Exception{
		initAddTaskList();
		outPutXom.addTask(ruleFields.getTaskType(), ruleFields.getClaimComCode(), "", ruleFields.getHandleCode(), ruleFields.getNodeType(), inPutXom.getBusinessMainKey(), inPutXom.getBusinessKey(), ruleFields.getIsAutoComplete(), inPutXom.getRuleInputCommon().getCarItemsId(), inPutXom.getRuleInputCommon().getPropItemsId(), inPutXom.getRuleInputCommon().getPersonItemsId(), ruleFields.getTaskCatalog(), ruleFields.getInPower());
		ruleFields = new ProcessRuleFields();
	}
	
	//新增独流程任务-独立流程方法
	public void addIndependentProcess() throws Exception{
		initAddTaskList();
		outPutXom.setStandProces(ruleFields.getProcessName(), inPutXom.getBusinessMainKey(), ruleFields.getTaskType(), ruleFields.getTaskCatalog(), ruleFields.getClaimComCode(), ruleFields.getHandleCode(), ruleFields.getNodeType(), inPutXom.getBusinessKey(), ruleFields.getIsAutoComplete(), inPutXom.getRuleInputCommon().getCarItemsId(), inPutXom.getRuleInputCommon().getPropItemsId(), inPutXom.getRuleInputCommon().getPersonItemsId());
		ruleFields = new ProcessRuleFields();
	}
	
	//新增独流程任务-独立流程方法风险审核使用
	public void addIndependentProcessWithDescription(String description) throws Exception{
		initAddTaskList();
		outPutXom.setStandProcesWithDescription(ruleFields.getProcessName(), inPutXom.getBusinessMainKey(), ruleFields.getTaskType(), ruleFields.getTaskCatalog(), ruleFields.getClaimComCode(), ruleFields.getHandleCode(), ruleFields.getNodeType(), inPutXom.getBusinessKey(), ruleFields.getIsAutoComplete(), inPutXom.getRuleInputCommon().getCarItemsId(), inPutXom.getRuleInputCommon().getPropItemsId(), inPutXom.getRuleInputCommon().getPersonItemsId(),description);
		ruleFields = new ProcessRuleFields();
	}
	
	
	//新增流程任务-新增子流程方法(含最低审核级别)
	public void setProcesLevel() throws Exception{
		initAddTaskList();
		outPutXom.setProcesLevel(ruleFields.getProcessName(), inPutXom.getBusinessMainKey(), ruleFields.getTaskType(), ruleFields.getClaimComCode(), ruleFields.getHandleCode(), ruleFields.getNodeType(), inPutXom.getBusinessKey(), ruleFields.getIsAutoComplete(), inPutXom.getRuleInputCommon().getCarItemsId(), inPutXom.getRuleInputCommon().getPropItemsId(), inPutXom.getRuleInputCommon().getPersonItemsId(), ruleFields.getTaskCatalog(), ruleFields.getPowerLevel());
		ruleFields = new ProcessRuleFields();
	}
	
	//新增流程任务--新增任务方法 初始化
	private void initAddTaskList() throws Exception{
		try{
			Class clz = inPutXom.getClass();
			if(isAllEmpty(ruleFields.getTaskType()) && isAllNotEmpty(ruleFields.getTaskTypeObject(), ruleFields.getTaskTypeObjectMethod())){
				Method method = clz.getMethod(getMethodName(ruleFields.getTaskTypeObject()));
				Object invokeObject = method.invoke(inPutXom);
				Class clzType = Class.forName("com.sinosoft.bpm.rule.bean.dto." + toUpperCaseFirstOne(ruleFields.getTaskTypeObject()));
				Method methodType = clzType.getMethod(getMethodName(ruleFields.getTaskTypeObjectMethod()));
				Object invokeType = methodType.invoke(invokeObject);
				ruleFields.setTaskType(null == invokeType?"":invokeType.toString());
			}
			if(isAllEmpty(ruleFields.getTaskCatalog()) && isAllNotEmpty(ruleFields.getTaskCatalogObject(), ruleFields.getTaskCatalogObjectMethod())){
				Method method = clz.getMethod(getMethodName(ruleFields.getTaskCatalogObject()));
				Object invokeObject = method.invoke(inPutXom);
				Class clzType = Class.forName("com.sinosoft.bpm.rule.bean.dto." + toUpperCaseFirstOne(ruleFields.getTaskCatalogObject()));
				Method methodCatalog = clzType.getMethod(getMethodName(ruleFields.getTaskCatalogObjectMethod()));
				Object invokeCatalog = methodCatalog.invoke(invokeObject);
				ruleFields.setTaskCatalog(null == invokeCatalog?"":invokeCatalog.toString());
			}
			if(-1 == ruleFields.getTaskCount() && isAllNotEmpty(ruleFields.getTaskCountObject(), ruleFields.getTaskCountObjectMethod())){
				Method method = clz.getMethod(getMethodName(ruleFields.getTaskCountObject()));
				Object invokeObject = method.invoke(inPutXom);
				Class clzType = Class.forName("com.sinosoft.bpm.rule.bean.dto." + toUpperCaseFirstOne(ruleFields.getTaskCountObject()));
				Method methodCount = clzType.getMethod(getMethodName(ruleFields.getTaskCountObjectMethod()));
				Object invokeCount = methodCount.invoke(invokeObject);
				ruleFields.setTaskCount(null == invokeCount?0:Integer.parseInt(invokeCount.toString()));
			}
			if(isAllEmpty(ruleFields.getClaimComCode()) && isAllNotEmpty(ruleFields.getTaskClaimComCodeObject(), ruleFields.getTaskClaimComCodeObjectMethod())){
				if("compensateClaimCom".equals(ruleFields.getTaskClaimComCodeObjectMethod())){
					String code = "";
					if("Y".equals(inPutXom.getRuleInputCommon().getIsAnyPayCase())){
						code = inPutXom.getRuleInputCommon().getPrpallComCode();
					}else{
						code = inPutXom.getRuleInputCommon().getPrpallComCode();
					}
					ruleFields.setClaimComCode(code);
				}else if("claimNowComCode".equals(ruleFields.getTaskClaimComCodeObjectMethod())){
					ruleFields.setClaimComCode(inPutXom.getClaimNowComCode());
				}else{
					if(ruleFields.getTaskClaimComCodeObject().equals("ruleProcessInputXOM")){
						Method method = clz.getMethod(getMethodName(ruleFields.getTaskClaimComCodeObjectMethod()));
						Object invoke = method.invoke(outPutXom);
						ruleFields.setClaimComCode(null == invoke?"":invoke.toString());
					}else{
						Method method = clz.getMethod(getMethodName(ruleFields.getTaskClaimComCodeObject()));
						Object invokeObject = method.invoke(inPutXom);
						Class clzType = Class.forName("com.sinosoft.bpm.rule.bean.dto." + toUpperCaseFirstOne(ruleFields.getTaskClaimComCodeObject()));
						Method methodClaimComCode = clzType.getMethod(getMethodName(ruleFields.getTaskClaimComCodeObjectMethod()));
						Object invokeClaimComCode = methodClaimComCode.invoke(invokeObject);
						ruleFields.setClaimComCode(null == invokeClaimComCode?"":invokeClaimComCode.toString());
					}
				}
			}
			if(isAllEmpty(ruleFields.getHandleCode()) && isAllNotEmpty(ruleFields.getTaskHandleCodeObject(), ruleFields.getTaskHandleCodeObjectMethod())){
				Method method = clz.getMethod(getMethodName(ruleFields.getTaskHandleCodeObject()));
				Object invokeObject = method.invoke(inPutXom);
				Class clzType = Class.forName("com.sinosoft.bpm.rule.bean.dto." + toUpperCaseFirstOne(ruleFields.getTaskHandleCodeObject()));
				Method methodHandleCode = clzType.getMethod(getMethodName(ruleFields.getTaskHandleCodeObjectMethod() ));
				Object invokeHandleCode = methodHandleCode.invoke(invokeObject);
				ruleFields.setHandleCode(null == invokeHandleCode?"":invokeHandleCode.toString());
			}
		}catch(Exception e){
			throw new Exception("执行drools时候增加（任务或者流程的时候反射出错，检查决策表）相关信息->\n"+getErrorMessage());
		}
	}
	
	private boolean isAllEmpty(String...strs){
		if(null != strs){
			for(String str : strs){
				if(!"".equals(str)){
					return false;
				}
			}
		}
		return true;
	}
	
	private boolean isAllNotEmpty(String...strs){
		if(null != strs){
			for(String str : strs){
				if("".equals(str)){
					return false;
				}
			}
		}
		return true;
	}
	
	private String getMethodName(String str){
		return "get" + toUpperCaseFirstOne(str);
	}
	
	private String toUpperCaseFirstOne(String str){
		char [] ch = str.toCharArray();
		if(ch.length>0){
			ch[0] = Character.toUpperCase(ch[0]);
		}
		StringBuffer a = new StringBuffer();
		a.append(ch);
		return a.toString();
	}
	
	private String getErrorMessage(){
		StringBuffer error = new StringBuffer();
		error.append(ruleFields.getTaskTypeObject() + ":" + ruleFields.getTaskTypeObjectMethod() + "\n");
		error.append(ruleFields.getTaskCatalogObject() + ":" + ruleFields.getTaskCatalogObjectMethod() + "\n");
		error.append(ruleFields.getTaskHandleCodeObject() + ":" + ruleFields.getTaskHandleCodeObjectMethod() + "\n");
		error.append(ruleFields.getTaskClaimComCodeObject() + ":" + ruleFields.getTaskClaimComCodeObjectMethod() + "\n");
		error.append(ruleFields.getTaskCountObject() + ":" + ruleFields.getTaskCountObjectMethod() + "\n");
		return error.toString();
	}
	
	/**
	 * 技能组同步方法（可配置）
	 */
	public void skillGroupSyncConfigurable(){
		outPutXom.setTaskCatalog(syncRuleFields.getTaskCatalog(), syncRuleFields.getTaskCatalogName(), syncRuleFields.getTaskType(), syncRuleFields.getTaskTypeName(), syncRuleFields.getSkillGroupCode(), syncRuleFields.getSkillGroupName());
	}
	
	/**
	 * 技能组同步方法（默认）
	 */
	public void skillGroupSyncDefault(){
		outPutXom.setTaskCatalogDefault(syncRuleFields.getTaskCatalog(), syncRuleFields.getTaskCatalogName(), syncRuleFields.getTaskType(), syncRuleFields.getTaskTypeName(), syncRuleFields.getSkillGroupCode(), syncRuleFields.getSkillGroupName());
	}
	
	public RuleProcessOutputXOM getOutPutXom() {
		return outPutXom;
	}
	
	public void setOutPutXom(RuleProcessOutputXOM outPutXom) {
		this.outPutXom = outPutXom;
	}
	
	public RuleProcessInputXOM getInPutXom() {
		return inPutXom;
	}
	
	public void setInPutXom(RuleProcessInputXOM inPutXom) {
		this.inPutXom = inPutXom;
	}
	
	public CheckFields getCheckFields() {
		return checkFields;
	}
	
	public void setCheckFields(CheckFields checkFields) {
		this.checkFields = checkFields;
	}

	public ProcessRuleFields getRuleFields() {
		return ruleFields;
	}

	public void setRuleFields(ProcessRuleFields ruleFields) {
		this.ruleFields = ruleFields;
	}

	public SyncRuleFields getSyncRuleFields() {
		return syncRuleFields;
	}

	public void setSyncRuleFields(SyncRuleFields syncRuleFields) {
		this.syncRuleFields = syncRuleFields;
	}
	
}
