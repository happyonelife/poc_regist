package cn.sinosoft.processrule.helper.bean;

/**
 * 勘察drools赋值使用类
 * 
 * @author JinBao
 *
 */
public class CheckFields {
	private String independentProcessName = "";
	private String taskType = "";
	private String taskClassification = "";
	private String claimBusinessDealingComCode = "1";// 1表示从输入对象中取值
	private String compensateClaimCom = "1";//
	private String handleCode = "1";// 1表示从输入对象中取值
	private String nodeType = "";
	private String isAutoComplete = "N";
	private String userCode = "";
	

	public String getIndependentProcessName() {
		return independentProcessName;
	}

	public void setIndependentProcessName(String independentProcessName) {
		this.independentProcessName = independentProcessName;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskClassification() {
		return taskClassification;
	}

	public void setTaskClassification(String taskClassification) {
		this.taskClassification = taskClassification;
	}

	public String getClaimBusinessDealingComCode() {
		return claimBusinessDealingComCode;
	}

	public void setClaimBusinessDealingComCode(String claimBusinessDealingComCode) {
		this.claimBusinessDealingComCode = claimBusinessDealingComCode;
	}

	
	public String getCompensateClaimCom() {
		return compensateClaimCom;
	}

	public void setCompensateClaimCom(String compensateClaimCom) {
		this.compensateClaimCom = compensateClaimCom;
	}

	public String getHandleCode() {
		return handleCode;
	}

	public void setHandleCode(String handleCode) {
		this.handleCode = handleCode;
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

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	
}
