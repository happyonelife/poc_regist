/**
 * 
 */
package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 风险信息
 * 
 * @author JinBao
 * 
 */
public class RuleRiskInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 险类*/
	private String classCode = "";
	/** 业务节点*/
	private String businessNode = "";
	/** 业务节点名字*/
	private String businessNodeName ="";
	/** 规则类型*/
	private String ruleType = "";
	/** 规则要点*/
	private String rulePoint = "";
	/** 规则提示类容*/
	private String ruleReason = "";
	/** 备注1*/
	private String other1 = "";
	/** 备注2*/
	private String other2 = "";
	/** 备注3*/
	private String other3 = "";
	/** 备注4*/
	private String other4 = "";
	/** 备注5*/
	private String other5 = "";
	
	public RuleRiskInfo() {
	}
	public RuleRiskInfo(String classCode, String businessNode,
			String businessNodeName, String ruleType, String rulePoint,
			String ruleReason) {
		this.classCode = classCode;
		this.businessNode = businessNode;
		this.businessNodeName = businessNodeName;
		this.ruleType = ruleType;
		this.rulePoint = rulePoint;
		this.ruleReason = ruleReason;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getBusinessNode() {
		return businessNode;
	}
	public void setBusinessNode(String businessNode) {
		this.businessNode = businessNode;
	}
	public String getBusinessNodeName() {
		return businessNodeName;
	}
	public void setBusinessNodeName(String businessNodeName) {
		this.businessNodeName = businessNodeName;
	}
	public String getRuleType() {
		return ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}
	public String getRulePoint() {
		return rulePoint;
	}
	public void setRulePoint(String rulePoint) {
		this.rulePoint = rulePoint;
	}
	public String getRuleReason() {
		return ruleReason;
	}
	public void setRuleReason(String ruleReason) {
		this.ruleReason = ruleReason;
	}
	public String getOther1() {
		return other1;
	}
	public void setOther1(String other1) {
		this.other1 = other1;
	}
	public String getOther2() {
		return other2;
	}
	public void setOther2(String other2) {
		this.other2 = other2;
	}
	public String getOther3() {
		return other3;
	}
	public void setOther3(String other3) {
		this.other3 = other3;
	}
	public String getOther4() {
		return other4;
	}
	public void setOther4(String other4) {
		this.other4 = other4;
	}
	public String getOther5() {
		return other5;
	}
	public void setOther5(String other5) {
		this.other5 = other5;
	}
	
}
