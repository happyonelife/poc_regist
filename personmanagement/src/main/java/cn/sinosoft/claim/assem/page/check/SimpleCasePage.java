package cn.sinosoft.claim.assem.page.check;

import java.io.Serializable;

public class SimpleCasePage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//机构代码
	private	String comCode;
	//车辆总定损金额 			
	private double sumCarLoss;
	//物损总定损金额   
	private double sumPropLoss;
	//人伤定损金额	
	private double sumPersonLoss;
	//总定损金额
	private double sumLoss;
	//施救费金额	
	private double sumRescueFee;
	//报案时间
	private double registTime;
	//当前查勘人员的小额快赔权限金额 Y N 
	private String valueUpper; 
	//标的车责任（不能为无责）
	private String indemnityDuty;
	//出险次数
	private int dangerTimes;
	//涉案车辆数量
	private int involvedCars;
	public String getComCode() {
		return comCode;
	}
	public void setComCode(String comCode) {
		this.comCode = comCode;
	}
	public double getSumCarLoss() {
		return sumCarLoss;
	}
	public void setSumCarLoss(double sumCarLoss) {
		this.sumCarLoss = sumCarLoss;
	}
	public double getSumPropLoss() {
		return sumPropLoss;
	}
	public void setSumPropLoss(double sumPropLoss) {
		this.sumPropLoss = sumPropLoss;
	}
	public double getSumPersonLoss() {
		return sumPersonLoss;
	}
	public void setSumPersonLoss(double sumPersonLoss) {
		this.sumPersonLoss = sumPersonLoss;
	}
	public double getSumLoss() {
		return sumLoss;
	}
	public void setSumLoss(double sumLoss) {
		this.sumLoss = sumLoss;
	}
	public double getSumRescueFee() {
		return sumRescueFee;
	}
	public void setSumRescueFee(double sumRescueFee) {
		this.sumRescueFee = sumRescueFee;
	}
	public double getRegistTime() {
		return registTime;
	}
	public void setRegistTime(double registTime) {
		this.registTime = registTime;
	}

	public String getIndemnityDuty() {
		return indemnityDuty;
	}
	public void setIndemnityDuty(String indemnityDuty) {
		this.indemnityDuty = indemnityDuty;
	}
	public int getDangerTimes() {
		return dangerTimes;
	}
	public void setDangerTimes(int dangerTimes) {
		this.dangerTimes = dangerTimes;
	}
	public int getInvolvedCars() {
		return involvedCars;
	}
	public void setInvolvedCars(int involvedCars) {
		this.involvedCars = involvedCars;
	}
	public String getValueUpper() {
		return valueUpper;
	}
	public void setValueUpper(String valueUpper) {
		this.valueUpper = valueUpper;
	}
	
}
