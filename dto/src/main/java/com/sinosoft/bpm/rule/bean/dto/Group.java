package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


public class Group implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	技能组代码*/
	private	String  groupCode;
	/**技能组名称*/
	private	String  groupName;
	/**标志位*/
	private String  flag;
	
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
