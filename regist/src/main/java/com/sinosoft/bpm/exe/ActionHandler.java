package com.sinosoft.bpm.exe;

import java.io.Serializable;

import com.sinosoft.bpm.ExecutionContext;

/**
 * action动作处理接口
 */
public interface ActionHandler extends Serializable {
	  
	  void execute( ExecutionContext executionContext ) throws Exception;
}
