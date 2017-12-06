package com.sinosoft.bpm.def.type;

/**
 * 工作流常量类
 * @author chao
 *
 */
public class BpmConStant {
	private BpmConStant(){};
	
	/**
	 * 标识结点类型
	 * Date: 14-4-28
	 * Time: 上午10:15
	 */
	public static class NodeType {
		private NodeType(){};
		

		
		/**
		 * 一般节点
		 */
		public static final String NORMAL_NODE = "NormalNode";
		
		
		/**
		 * 合并分支的触发结点
		 */
		public static final String FORK_START = "ForkStart";
		/**
		 * 合并分支中的结点
		 */
		public static final String FORK_NODE = "ForkNode";
		/**
		 * 合并分支的聚合结点
		 */
		public static final String FORK_CONVERGE = "ForkConverge";
		

		/**
		 * 合并分支子流程开始
		 */
		public static final String FORK_SUB_PROCESS_START = "ForkSubProcessStart";
		/**
		 * 合并分支子流程中的节点
		 */
		public static final String FORK_SUB_PROCESS_NODE = "ForkSubProcessNode";
		/**
		 * 合并分支子流程结束
		 */
		public static final String FORK_SUB_PROCESS_END = "ForkSubProcessEnd";
		
		
		/**
		 * 子流程开始
		 */
		public static final String SUB_PROCESS_START = "SubProcessStart";

		/**
		 * 子流程中的节点
		 */
		public static final String SUB_PROCESS_NODE = "SubProcessNode";
		/**
		 * 子流程结束
		 */
		public static final String SUB_PROCESS_END = "SubProcessEnd";


	}
	/**
	 * 任务操作类型
	 *
	 */
	public static class OperateType {
		private OperateType(){};
		/**
		 * 创建任务
		 */
		public static final String TASK_CREATE = "TaskCreate"; 
		/**
		 * 分配任务
		 */
		public static final String TASK_ASSIGN = "TaskAssign"; 
		/**
		 * 任务委托
		 */
		public static final String TASK_DELEGATE = "TaskDelegate";
		/**
		 * 任务提交
		 */
		public static final String TASK_COMPLETE = "TaskComplete";
		/**
		 * 结束任务
		 */
		public static final String TASK_END = "TaskEnd";
		/**
		 * 任务暂停
		 */
		public static final String TASK_SUSPEND = "TaskSuspend";
		/**
		 * 任务恢复
		 */
		public static final String TASK_RESUME = "TaskResume";

		/**
		 * 任务注销
		 */
		public static final String TASK_CANCEL = "TaskCancel";
		/**
		 * 任务撒回
		 */
		public static final String TASK_HAULBACK = "TaskHaulBack";
		/**
		 * 任务退回
		 */
		public static final String TASK_SENDBACK = "TaskSendBack";
		/**
		 * 
		 */
		public static final String TASK_BACKED = "TaskBacked";
		/**
		 * 任务锁定
		 */
		public static final String TASK_LOCK = "TaskLock";
		/**
		 * 任务保存并且解锁
		 */
		public static final String TASK_SAVEANDUNLOCK = "TaskSaveAndUnlock";
		/**
		 * 任务强制解锁
		 */
		public static final String TASK_FORCEUNLOCK = "TaskForceUnlock";

	}
	
	/**
	 * 任务状态定义
	 *
	 * 任务创建后为 0
	 * 分配到人后为 1
	 * 暂停后为    2
	 * 恢复后为    1
	 * 结束后为    9
	 */
	public static class TaskStatus {
		private TaskStatus(){};
		/**
		 * 创建
		 */
		public static final String STATUS_CREATE = "0";
		/**
		 * 运行状态
		 */
		public static final String STATUS_RUNING = "1";
		/**
		 * 暂停状态
		 */
		public static final String STATUS_SUSPEND = "2";
		/**
		 * 结束状态
		 */
		public static final String STATUS_COMPLETE = "9";

	}
	
	/**
	 * 字段映射类型
	 *
	 */
	public static class MappingType{
		private MappingType(){};
		public static final String INTEGER = "integer";
		public static final String DATE = "date";
		public static final String STRING = "string";
		public static final String DOUBLE = "double";
	}
	
	/**
	 * 会签意见
	 *
	 */
	public static final String SIGNOPINION_AGREE = "Y";//同意
	public static final String SIGNOPINION_DISAGREE = "N";//不同意
	
	/**
	 * 标的ID分隔符
	 */
	public static final String ITEM_SPLIT = ",";
	
	/**
	 * 任务轨迹分隔符
	 */
	public static final String TRACK_SPLIT =",";
	
	/**
	 * 是或否
	 */
	public static final String YES = "Y";
	public static final String NO = "N";

	
	/**
	 * 任务的注销状态
	 */
	public static final String TASK_NORMAL = "0";
	public static final String TASK_CANCEL = "1";
	public static final String TASK_ALLCANCEL = "2";
	
	/**
	 * 流程状态
	 */
	public static final String PROCESS_STATUS_OPEN = "1";//开启
	public static final String PROCESS_STATUS_CLOSE = "0";//关闭
	

	
	/**
	 * 任务提交意见
	 */
	public static final String SUBMITOPTION_BACK = "back";//回退
	public static final String SUBMITOPTION_UP = "up";//提交上级
	public static final String SUBMITOPTION_PASS = "pass";//审核通过
	public static final String SUBMITOPTION_REFUSE = "refuse";//拒绝
	public static final String SUBMITOPTION_CANCEL = "cancel";//注销
	public static final String SUBMITOPTION_ASSIGN = "assign";//改派
	public static final String SUBMITOPTION_REVOKE = "revoke";//撒销

	/**
	 * 任务业务状态
	 */
	public static final String BUSINESSSTATUS_INIT = "0";//初始状态
	public static final String BUSINESSSTATUS_PROCESS = "1";//正处理
	public static final String BUSINESSSTATUS_DONE = "2";//完成
	public static final String BUSINESSSTATUS_TOBACK = "3";//回退
	public static final String BUSINESSSTATUS_TOANYPAY = "4";//提交通赔
	public static final String BUSINESSSTATUS_TOASSIGN = "5";//申请改派
	public static final String BUSINESSSTATUS_REVOKE = "6";//撒消
	public static final String BUSINESSSTATUS_TOCANCEL = "7";//申请注销
	
}
