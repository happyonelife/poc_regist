package com.sinosoft.bpm.def.cfg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


import com.sinosoft.bpm.ExecutionContext;
import com.sinosoft.bpm.exe.ActionHandler;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Action implements ActionHandler {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlTransient
	private String actionId;
	@XmlAttribute
	private String actionName;//action名称
	@XmlAttribute
	private String handlerClass;//action的处理类名
	@XmlTransient
	private ActionHandler handler;//action处理的class实例

	public void execute(ExecutionContext executionContext) throws Exception {
		if(handler == null){
			handler = (ActionHandler) Class.forName(handlerClass).newInstance();//根据模版配置的对应的动作处理类实例化处理类实例
		}
		handler.execute(executionContext);//执行动作
	}

}
