package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 修复验车
 * @author chao
 *
 */
public class RulePartAudit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**	员工金额权限*/
	private	Double	employeeAmount;

	public Double getEmployeeAmount() {
		return employeeAmount;
	}

	public void setEmployeeAmount(Double employeeAmount) {
		this.employeeAmount = employeeAmount;
	}

	

	
	
}
