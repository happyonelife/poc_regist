/**
 * 
 */
package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 人伤查勘
 * 
 * @author JinBao
 * 
 */
public class RulePersonCheck implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** 性别 */
	private String gender = "1";//1-男 2-女 
	/** 年龄 */
	private Integer age = 0;
	/** 误工费 */
	private Double chargeOfLossWork = 0d;
	/** 治疗情况住院治疗 */
	private String isHospitalization = "";

	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getChargeOfLossWork() {
		return chargeOfLossWork;
	}

	public void setChargeOfLossWork(Double chargeOfLossWork) {
		this.chargeOfLossWork = chargeOfLossWork;
	}

	public String getIsHospitalization() {
		return isHospitalization;
	}

	public void setIsHospitalization(String isHospitalization) {
		this.isHospitalization = isHospitalization;
	}
}
