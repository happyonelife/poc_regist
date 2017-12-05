package com.sinosoft.bpm.rule.bean.dto;

public class RuleCarPriceAndVerify {
	//车辆核价提交方式，逐级G，只用提交一级E
	private String CarPriceSubmitType = "E";
	
	//车辆核价自动完成方式Y:自动,N:非自动
	private String carPriceisAutoEnd = "N";

	public String getCarPriceSubmitType() {
		return CarPriceSubmitType;
	}

	public void setCarPriceSubmitType(String carPriceSubmitType) {
		CarPriceSubmitType = carPriceSubmitType;
	}

	public String getCarPriceisAutoEnd() {
		return carPriceisAutoEnd;
	}

	public void setCarPriceisAutoEnd(String carPriceisAutoEnd) {
		this.carPriceisAutoEnd = carPriceisAutoEnd;
	}
	
}
