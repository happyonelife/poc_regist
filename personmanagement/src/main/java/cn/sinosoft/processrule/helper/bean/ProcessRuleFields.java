package cn.sinosoft.processrule.helper.bean;

public class ProcessRuleFields {
	private String taskType = "";
	private String claimComCode = "";
	private String handleCode = "";
	private String taskCatalog = "";
	private String nodeType = "";
	private String isAutoComplete = "N";
	private String type = "";
	private String taskTypeObject = "";
	private String taskTypeObjectMethod = "";
	private String taskCatalogObject = "";
	private String taskCatalogObjectMethod = "";
	private String taskCountObject = "";
	private String taskCountObjectMethod = "";
	private String taskHandleCodeObject = "";
	private String taskHandleCodeObjectMethod = "";
	private String taskClaimComCodeObject = "";
	private String taskClaimComCodeObjectMethod = "";
	private int taskCount = -1;//-1表示从对象中取
	private String processName = "";
	private String powerLevel = "";
	private boolean inPower = false;
	
	public void initTask(String taskTypeObject, String taskTypeObjectMethod, String taskCatalogObject, String taskCatalogObjectMethod){
		this.taskTypeObject = taskTypeObject;
		this.taskTypeObjectMethod  = taskTypeObjectMethod;
		this.taskCatalogObject  = taskCatalogObject;
		this.taskCatalogObjectMethod  = taskCatalogObjectMethod;
	}
	
	public void initTaskType(String taskTypeObject, String taskTypeObjectMethod){
		this.taskTypeObject = taskTypeObject;
		this.taskTypeObjectMethod  = taskTypeObjectMethod;
	}
	
	public void initTaskCatalog(String taskCatalogObject, String taskCatalogObjectMethod){
		this.taskCatalogObject  = taskCatalogObject;
		this.taskCatalogObjectMethod  = taskCatalogObjectMethod;
	}
	
	public void initTaskCount(String taskCountObject, String taskCountObjectMethod){
		this.taskCountObject = taskCountObject;
		this.taskCountObjectMethod = taskCountObjectMethod;
	}
	
	public void initTaskHandleCode(String taskHandleCodeObject, String taskHandleCodeObjectMethod){
		this.taskHandleCodeObject = taskHandleCodeObject;
		this.taskHandleCodeObjectMethod = taskHandleCodeObjectMethod;
	}
	
	public void initTaskClaimComCode(String taskClaimComCodeObject, String taskClaimComCodeObjectMethod){
		this.setTaskClaimComCodeObject(taskClaimComCodeObject);
		this.setTaskClaimComCodeObjectMethod(taskClaimComCodeObjectMethod);
	}
	
	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getClaimComCode() {
		return claimComCode;
	}

	public void setClaimComCode(String claimComCode) {
		this.claimComCode = claimComCode;
	}

	public String getHandleCode() {
		return handleCode;
	}

	public void setHandleCode(String handleCode) {
		this.handleCode = handleCode;
	}

	public String getTaskCatalog() {
		return taskCatalog;
	}

	public void setTaskCatalog(String taskCatalog) {
		this.taskCatalog = taskCatalog;
	}
	

	public String getNodeType() {
		return nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getIsAutoComplete() {
		return isAutoComplete;
	}

	public void setIsAutoComplete(String isAutoComplete) {
		this.isAutoComplete = isAutoComplete;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTaskTypeObject() {
		return taskTypeObject;
	}

	public void setTaskTypeObject(String taskTypeObject) {
		this.taskTypeObject = taskTypeObject;
	}

	public String getTaskTypeObjectMethod() {
		return taskTypeObjectMethod;
	}

	public void setTaskTypeObjectMethod(String taskTypeObjectMethod) {
		this.taskTypeObjectMethod = taskTypeObjectMethod;
	}

	public String getTaskCatalogObject() {
		return taskCatalogObject;
	}

	public void setTaskCatalogObject(String taskCatalogObject) {
		this.taskCatalogObject = taskCatalogObject;
	}

	public String getTaskCatalogObjectMethod() {
		return taskCatalogObjectMethod;
	}

	public void setTaskCatalogObjectMethod(String taskCatalogObjectMethod) {
		this.taskCatalogObjectMethod = taskCatalogObjectMethod;
	}

	public String getTaskCountObject() {
		return taskCountObject;
	}

	public void setTaskCountObject(String taskCountObject) {
		this.taskCountObject = taskCountObject;
	}

	public String getTaskCountObjectMethod() {
		return taskCountObjectMethod;
	}

	public void setTaskCountObjectMethod(String taskCountObjectMethod) {
		this.taskCountObjectMethod = taskCountObjectMethod;
	}

	public int getTaskCount() {
		return taskCount;
	}

	public void setTaskCount(int taskCount) {
		this.taskCount = taskCount;
	}

	public String getTaskHandleCodeObject() {
		return taskHandleCodeObject;
	}

	public void setTaskHandleCodeObject(String taskHandleCodeObject) {
		this.taskHandleCodeObject = taskHandleCodeObject;
	}

	public String getTaskHandleCodeObjectMethod() {
		return taskHandleCodeObjectMethod;
	}

	public void setTaskHandleCodeObjectMethod(String taskHandleCodeObjectMethod) {
		this.taskHandleCodeObjectMethod = taskHandleCodeObjectMethod;
	}

	public String getTaskClaimComCodeObject() {
		return taskClaimComCodeObject;
	}

	public void setTaskClaimComCodeObject(String taskClaimComCodeObject) {
		this.taskClaimComCodeObject = taskClaimComCodeObject;
	}

	public String getTaskClaimComCodeObjectMethod() {
		return taskClaimComCodeObjectMethod;
	}

	public void setTaskClaimComCodeObjectMethod(String taskClaimComCodeObjectMethod) {
		this.taskClaimComCodeObjectMethod = taskClaimComCodeObjectMethod;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(String powerLevel) {
		this.powerLevel = powerLevel;
	}

	public boolean getInPower() {
		return inPower;
	}

	public void setInPower(boolean inPower) {
		this.inPower = inPower;
	}
	
}
