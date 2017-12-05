package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;

/**
 * 配件审验
 * @author chao
 *
 */
public class RuleAccessoriesforinspection implements Serializable{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		/**	是否修复验车*/
		private	String isverifyFlag;

		public String getIsverifyFlag() {
			return isverifyFlag;
		}

		public void setIsverifyFlag(String isverifyFlag) {
			this.isverifyFlag = isverifyFlag;
		}
	
	
}


