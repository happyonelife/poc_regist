package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;
import java.util.List;

/**
 * User: jason
 * Date: 14-4-21
 * Time: 下午3:44
 */
public class RuleResponse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<TaskProp> taskProps;
	private ProcessProp processProp;

	public List<TaskProp> getTaskProps() {
		return taskProps;
	}

	public void setTaskProps(List<TaskProp> taskProps) {
		this.taskProps = taskProps;
	}

	public ProcessProp getProcessProp() {
		return processProp;
	}

	public void setProcessProp(ProcessProp processProp) {
		this.processProp = processProp;
	}
}
