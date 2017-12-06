package cn.sinosoft.claim.base.page.car;

import java.math.BigDecimal;

/**   
 * @Title: Entity
 * @Description: 换件项目清单信息
 * @author onlineGenerator
 * @date 2014-06-14 15:21:49
 * @version V1.0   
 *
 */
public class PrpLcarComponentPage implements java.io.Serializable,Comparable<PrpLcarComponentPage>{
	private static final long serialVersionUID = 1L;
	/**页面显示险别*/
	private String lossApprovalKindNameLast;
	private String lossApprovalKindNameTempLast;
	private String lossApprovalKindNameTemp;
	
	private String lossApprovalKindCodeLast;
	private String lossApprovalKindCode;
	private String lossApprovalKindName;
	private String policyNo;
	/**环节*/
	private String source;
	/**数据来源*/
	private String dataSource;
	/**源表（公共表）ID*/
	private java.lang.String originalId;
	/**轨迹ID*/
	private java.lang.String trackId;
	/**任务小类---仅用于轨迹信息页面的展示*/
	private java.lang.String taskType;
	/**功能类型*/
	private java.lang.String funcType;
	/**数据状态：00-暂存,01-提交,99-无效*/
	private java.lang.String dataStatus;
	/**增量序号代码*/
	private java.lang.Integer serialNo;
	/**显示顺序序号*/
	private java.lang.Integer orderNo;
	/**币别兑换率*/
	private java.math.BigDecimal exchRate;
	/**修复验车标识*/
	private java.lang.String repairCheckFlag;
	/**配件核价标志*/
	private java.lang.String fitsVerifyFlag;
	/**核价材料数量*/
	private java.lang.Integer veripMaterQuantity;
	/**核价材料单价费*/
	private java.math.BigDecimal veripMaterUnitVerip;
	/**核价材料费*/
	private java.math.BigDecimal veripMaterialFee;
	/**备注(核价),*/
	private java.lang.String veripRemark;
	/**核价状态*/
	private java.lang.String veripStatus;
	/**修复验车价格*/
	private java.math.BigDecimal repairCheckAmount;
	/**修复验车备注*/
	private java.lang.String repairCheckRemark;
	/**换件回收价格*/
	private java.math.BigDecimal recyclePrice;
	/**第三方操作状态*/
	private java.lang.String operationStatus;
	/**有效标志*/
	private java.lang.String validFlag;
	/**系统本地价格*/
	private java.math.BigDecimal locPrice;
	/**系统4S店价*/
	private java.math.BigDecimal refPrice1;
	/**系统区域市场价*/
	private java.math.BigDecimal refPrice2;
	/**系统区域适用价*/
	private java.math.BigDecimal refPrice3;
	/**本地区域原厂价*/
	private java.math.BigDecimal locPrice1;
	/**本地区域市场价*/
	private java.math.BigDecimal locPrice2;
	/**本地区域适用价*/
	private java.math.BigDecimal locPrice3;
	/**修理厂价格*/
	private java.math.BigDecimal repairPrice;
	/**插入时间*/
	private java.util.Date insertTimeForHis;
	/**更新时间*/
	private java.util.Date operateTimeForHis;
	/**ID*/
	private java.lang.String id;
	/**定损单ID*/
	private java.lang.String lossApprovalId;
	/**定损工具编号*/
	private java.lang.String toolCode;
	/**定损工具名称*/
	private java.lang.String toolName;
	/**损失标的ID*/
	private java.lang.String itemId;
	/**是否外修厂标志 */
	private java.lang.String thirdFactoryFlag;
	/**修理厂代码*/
	private java.lang.String repairFactoryCode;
	/**修理厂名称*/
	private java.lang.String repairFactoryName;
	/**是否外修厂标志 */
	private java.lang.String verifyThirdFactoryFlag;
	/**修理厂代码*/
	private java.lang.String verifyRepairFactoryCode;
	/**修理厂名称*/
	private java.lang.String verifyRepairFactoryName;
	/**是否外修厂标志 */
	private java.lang.String veripThirdFactoryFlag;
	/**修理厂代码*/
	private java.lang.String veripRepairFactoryCode;
	/**修理厂名称*/
	private java.lang.String veripRepairFactoryName;
	/**经办人代码*/
	private java.lang.String handlerCode;
	/**经办人代码*/
	private java.lang.String handlerName;
	/**拖修日期*/
	private java.util.Date repairStartDate;
	/**修回日期*/
	private java.util.Date repairEndSate;
	/**管理费比例*/
	private java.math.BigDecimal manageFeeRate;
	/**管理费*/
	private java.math.BigDecimal manageFee;
	/**管理费折扣率*/
	private java.math.BigDecimal manageDisCountRate;
	/**损失部位代码*/
	private java.lang.String partCode;
	/**损失部位名称*/
	private java.lang.String partDesc;
	/**换件项目代码*/
	private java.lang.String compCode;
	/**换件项目名称*/
	private java.lang.String compName;
	/**碰撞部位代码*/
	private java.lang.String hitPartCode;
	/**碰撞部位名称*/
	private java.lang.String hitPartName;
	/**第三方定损系统零件唯一ID*/
	private java.lang.String systemCompCode;
	/**零配件原厂编码*/
	private java.lang.String originalCode;
	/**零配件原厂名称*/
	private java.lang.String originalName;
	/**配件标准代码*/
	private java.lang.String partStandardCode;
	/**配件标准名称*/
	private java.lang.String partStandard;
	/**配件部位代码*/
	private java.lang.String partGroupCode;
	/**配件部位名称*/
	private java.lang.String partGroupName;
	/**核损换件数量*/
	private java.lang.Integer veriQuantity;
	/**自定义配件标记*/
	private java.lang.String selfConfigFlag;
	/**是否新增设备 */
	private java.lang.String installEquipmentFlag;
	/**换件配件属性*/
	private java.lang.String itemKind;
	/**换件价格来源*/
	private java.lang.String priceSourceName;
	private java.lang.String priceSource;
	/**是否待检测标志*/
	private java.lang.String detectFlag;
	/**定损币别*/
	private java.lang.String currency;
	/**换件费折扣率*/
	private java.math.BigDecimal chgDisCountRate;
	/**换件价格方案*/
	private java.lang.String chgCompSetName;
	private java.lang.String chgCompSet;
	/**定损换件参考单价*/
	private java.math.BigDecimal reFunitPrice;
	/**参考类型*/
	private java.lang.String reFunitType;
	/**换件数量*/
	private java.lang.Integer quantity;
	/**定损换件单价*/
	private java.math.BigDecimal unitPrice;
	/**定损换件总计/换件损失*/
	private java.math.BigDecimal sumPrice;
	/**换件价格*/
	private java.math.BigDecimal lossFee;
	/**定损残值*/
	private java.math.BigDecimal remnant;
	/**定损换件价格修改标志*/
	private java.lang.String priceAdjustFlag;
	/**自付比例*/
	private java.math.BigDecimal selfRate;
	/**定损工时*/
	private java.math.BigDecimal manHour;
	/**定损工时单价*/
	private java.math.BigDecimal manHourUnitPrice;
	/**定损工时费*/
	private java.math.BigDecimal manHourFee;
	/**定损材料数量*/
	private java.lang.Integer materialQuantity;
	/**定损材料单价费*/
	private java.math.BigDecimal materialUnitPrice;
	/**定损材料费*/
	private java.math.BigDecimal materialFee;
	/**总定损金额*/
	private java.math.BigDecimal sumDefLoss;
	/**外部询价*/
	private java.math.BigDecimal quoPrice;
	/**喷漆价格*/
	private java.math.BigDecimal sprayPaintPrice;
	/**拆装价格*/
	private java.math.BigDecimal dismantlePrice;
	/**核准人*/
	private java.lang.String sanctioner;
	/**复核人代码*/
	private java.lang.String approverCode;
	/**操作员代码*/
	private java.lang.String operatorCode;
	/**备注（定损）*/
	private java.lang.String lossApprovalRemark;
	/**损余回收标识：1-是 0-否*/
	private java.lang.String recycleFlag;
	/**损余回收方式*/
	private java.lang.String recycleType;
	/**是否配件审验 */
	private java.lang.String accessoryCheckFlag;
	/**定损经办人审验/分公司核价经办人审验*/
	private java.lang.String accessoryPosition;
	/**配件审验项目*/
	private java.lang.String accessoryCheckItem;
	/**配件审验价格*/
	private java.math.BigDecimal accessoryCheckPrice;
	/**配件审验备注*/
	private java.lang.String accessoryCheckRemark;
	/**操作状态：A/U/D*/
	private java.lang.String operateStatus;
	/**核损价格方案*/
	private java.lang.String veriCompSet;
	/**核损配件属性*/
	private java.lang.String veriItemKind;
	/**核损价格来源*/
	private java.lang.String veriPriceSource;
	/**核损换件参考单价*/
	private java.math.BigDecimal veriRefUnitPrice;
	/**核损换件单价*/
	private java.math.BigDecimal veriUnitPrice;
	/**核损换件总价*/
	private java.math.BigDecimal veriSumPrice;
	/**核损换件价格修改标志*/
	private java.lang.String veriPriAdjustFlag;
	/**核损自付比例*/
	private java.math.BigDecimal veriSelfRate;
	/**核损工时*/
	private java.math.BigDecimal veriManHour;
	/**核损工时单价*/
	private java.math.BigDecimal veriManUnitPrice;
	/**核损工时费*/
	private java.math.BigDecimal veriManHourFee;
	/**核损材料数量*/
	private java.lang.Integer veriMaterQuantity;
	/**核损材料单价费*/
	private java.math.BigDecimal veriMaterUnitPrice;
	/**核损材料费*/
	private java.math.BigDecimal veriMaterialFee;
	/**核损总金额*/
	private java.math.BigDecimal sumVeriLoss;
	/**核损残值*/
	private java.math.BigDecimal veriRemnant;
	/**损余回收方式(核损)*/
	private java.lang.String veriRecycleType;
	/**修复验车标识(核损)*/
	private java.lang.String veriRepairCheckFlag;
	/**核损原因*/
	private java.lang.String veriCausation;
	/**备注(核损),*/
	private java.lang.String veriRemark;
	/**核损剔除金额*/
	private java.math.BigDecimal sumReject;
	/**核损剔除原因*/
	private java.lang.String rejectReason;
	/**核价价格方案*/
	private java.lang.String veripCompSet;
	/**核价配件属性*/
	private java.lang.String veripItemKind;
	/**核价价格来源*/
	private java.lang.String veripSource;
	/**核价换件数量*/
	private java.lang.Integer veripQuantity;
	/**核价换件参考单价*/
	private java.math.BigDecimal veripRefUnitVerip;
	/**核价换件单价*/
	private java.math.BigDecimal veripUnitVerip;
	/**核价残值*/
	private java.math.BigDecimal veripUnitRemnent;
	/**核价换件总价*/
	private java.math.BigDecimal veripSumVerip;
	/**核价换件价格修改标志*/
	private java.lang.String veripAdjustFlag;
	/**核价自付比例*/
	private java.math.BigDecimal veripSelfRate;
	/**核价工时*/
	private java.math.BigDecimal veripManHour;
	/**核价工时单价*/
	private java.math.BigDecimal veripManUnitVerip;
	/**核价工时费*/
	private java.math.BigDecimal veripManHourFee;
	/**碰撞程度代码*/
	private java.lang.String hitLevelCode;
	/**碰撞程度名称*/
	private java.lang.String hitLevelName;
	/**核价损余回收*/
	private java.lang.String veripRecycleType;
	/**定损人员代码*/
	private	java.lang.String  LossApprovalCode	;
	/**定损人员名称*/
	private java.lang.String lossApprovalName;
	/**定损人员名称*/
	private java.lang.String lossApprovalStartDate;
	/**	输入时间	*/                                                   
	private java.util.Date inputTime;                                
	/**审验人代码*/
	private java.lang.String accessoryPositionName;
	/**打印需要展示最后换件的费用     取值 修复验车-》配件审验-》核损--》定损*/
	private java.math.BigDecimal lossFeeForPrint;
    /**modify start by suyuanyuan 20150616 需求编号：新理赔20150508*/
    private String lossFeeStringForPrint;
    /**modify end by suyuanyuan 20150616 需求编号：新理赔20150508*/
	private java.lang.String isNewData;
	
	private int pageComponentRowMark;
	
	private String showVerify;
	
	private String showPrice;
	private String isRemark;
	private String isRepairCheck;
	private String isAccessoryCheck;
	private String isFilter;
	
	public String getIsFilter() {
		return isFilter;
	}
	public void setIsFilter(String isFilter) {
		this.isFilter = isFilter;
	}
	public String getIsAccessoryCheck() {
		return isAccessoryCheck;
	}
	public void setIsAccessoryCheck(String isAccessoryCheck) {
		this.isAccessoryCheck = isAccessoryCheck;
	}
	public String getIsRepairCheck() {
		return isRepairCheck;
	}
	public void setIsRepairCheck(String isRepairCheck) {
		this.isRepairCheck = isRepairCheck;
	}
	public String getIsRemark() {
		return isRemark;
	}
	public void setIsRemark(String isRemark) {
		this.isRemark = isRemark;
	}
	/**退回之前数据*/
	/**增量序号代码*/
	private java.lang.Integer serialNoLast;
	/**显示顺序序号*/
	private java.lang.Integer orderNoLast;
	/**币别兑换率*/
	private java.math.BigDecimal exchRateLast;
	/**修复验车标识*/
	private java.lang.String repairCheckFlagLast;
	/**配件核价标志*/
	private java.lang.String fitsVerifyFlagLast;
	/**核价材料数量*/
	private java.lang.Integer veripMaterQuantityLast;
	/**核价材料单价费*/
	private java.math.BigDecimal veripMaterUnitVeripLast;
	/**核价材料费*/
	private java.math.BigDecimal veripMaterialFeeLast;
	/**备注(核价),*/
	private java.lang.String veripRemarkLast;
	/**核价状态*/
	private java.lang.String veripStatusLast;
	/**修复验车价格*/
	private java.math.BigDecimal repairCheckAmountLast;
	/**修复验车备注*/
	private java.lang.String repairCheckRemarkLast;
	/**换件回收价格*/
	private java.math.BigDecimal recyclePriceLast;
	/**第三方操作状态*/
	private java.lang.String operationStatusLast;
	/**有效标志*/
	private java.lang.String validFlagLast;
	/**系统本地价格*/
	private java.math.BigDecimal locPriceLast;
	/**系统4S店价*/
	private java.math.BigDecimal refPrice1Last;
	/**系统区域市场价*/
	private java.math.BigDecimal refPrice2Last;
	/**系统区域适用价*/
	private java.math.BigDecimal refPrice3Last;
	/**本地区域原厂价*/
	private java.math.BigDecimal locPrice1Last;
	/**本地区域市场价*/
	private java.math.BigDecimal locPrice2Last;
	/**本地区域适用价*/
	private java.math.BigDecimal locPrice3Last;
	/**修理厂价格*/
	private java.math.BigDecimal repairPriceLast;
	/**插入时间*/
	private java.util.Date insertTimeForHisLast;
	/**更新时间*/
	private java.util.Date operateTimeForHisLast;
	/**ID*/
	private java.lang.String idLast;
	/**定损单ID*/
	private java.lang.String lossApprovalIdLast;
	/**定损工具编号*/
	private java.lang.String toolCodeLast;
	/**定损工具名称*/
	private java.lang.String toolNameLast;
	/**损失标的ID*/
	private java.lang.String itemIdLast;
	/**是否外修厂标志 */
	private java.lang.String thirdFactoryFlagLast;
	/**修理厂代码*/
	private java.lang.String repairFactoryCodeLast;
	/**修理厂名称*/
	private java.lang.String repairFactoryNameLast;
	/**经办人代码*/
	private java.lang.String handlerCodeLast;
	/**经办人代码*/
	private java.lang.String handlerNameLast;
	/**拖修日期*/
	private java.util.Date repairStartDateLast;
	/**修回日期*/
	private java.util.Date repairEndSateLast;
	/**管理费比例*/
	private java.math.BigDecimal manageFeeRateLast;
	/**管理费*/
	private java.math.BigDecimal manageFeeLast;
	/**管理费折扣率*/
	private java.math.BigDecimal manageDisCountRateLast;
	/**损失部位代码*/
	private java.lang.String partCodeLast;
	/**损失部位名称*/
	private java.lang.String partDescLast;
	/**换件项目代码*/
	private java.lang.String compCodeLast;
	/**换件项目名称*/
	private java.lang.String compNameLast;
	/**碰撞部位代码*/
	private java.lang.String hitPartCodeLast;
	/**碰撞部位名称*/
	private java.lang.String hitPartNameLast;
	/**第三方定损系统零件唯一ID*/
	private java.lang.String systemCompCodeLast;
	/**零配件原厂编码*/
	private java.lang.String originalCodeLast;
	/**零配件原厂名称*/
	private java.lang.String originalNameLast;
	/**配件标准代码*/
	private java.lang.String partStandardCodeLast;
	/**配件标准名称*/
	private java.lang.String partStandardLast;
	/**配件部位代码*/
	private java.lang.String partGroupCodeLast;
	/**配件部位名称*/
	private java.lang.String partGroupNameLast;
	/**换件数量*/
	private java.lang.Integer veriQuantityLast;
	/**自定义配件标记*/
	private java.lang.String selfConfigFlagLast;
	/**是否新增设备 */
	private java.lang.String installEquipmentFlagLast;
	/**换件配件属性*/
	private java.lang.String itemKindLast;
	/**换件价格来源*/
	private java.lang.String priceSourceLast;
	/**是否待检测标志*/
	private java.lang.String detectFlagLast;
	/**定损币别*/
	private java.lang.String currencyLast;
	/**换件费折扣率*/
	private java.math.BigDecimal chgDisCountRateLast;
	/**换件价格方案*/
	private java.lang.String chgCompSetLast;
	/**定损换件参考单价*/
	private java.math.BigDecimal reFunitPriceLast;
	/**参考类型*/
	private java.lang.String reFunitTypeLast;
	/**换件数量*/
	private java.lang.Integer quantityLast;
	/**定损换件单价*/
	private java.math.BigDecimal unitPriceLast;
	/**定损换件总计/换件损失*/
	private java.math.BigDecimal sumPriceLast;
	/**换件价格*/
	private java.math.BigDecimal lossFeeLast;
	/**定损残值*/
	private java.math.BigDecimal remnantLast;
	/**定损换件价格修改标志*/
	private java.lang.String priceAdjustFlagLast;
	/**自付比例*/
	private java.math.BigDecimal selfRateLast;
	/**定损工时*/
	private java.math.BigDecimal manHourLast;
	/**定损工时单价*/
	private java.math.BigDecimal manHourUnitPriceLast;
	/**定损工时费*/
	private java.math.BigDecimal manHourFeeLast;
	/**定损材料数量*/
	private java.lang.Integer materialQuantityLast;
	/**定损材料单价费*/
	private java.math.BigDecimal materialUnitPriceLast;
	/**定损材料费*/
	private java.math.BigDecimal materialFeeLast;
	/**总定损金额*/
	private java.math.BigDecimal sumDefLossLast;
	/**外部询价*/
	private java.math.BigDecimal quoPriceLast;
	/**喷漆价格*/
	private java.math.BigDecimal sprayPaintPriceLast;
	/**拆装价格*/
	private java.math.BigDecimal dismantlePriceLast;
	/**核准人*/
	private java.lang.String sanctionerLast;
	/**复核人代码*/
	private java.lang.String approverCodeLast;
	/**操作员代码*/
	private java.lang.String operatorCodeLast;
	/**备注（定损）*/
	private java.lang.String lossApprovalRemarkLast;
	/**损余回收标识：1-是 0-否*/
	private java.lang.String recycleFlagLast;
	/**损余回收方式*/
	private java.lang.String recycleTypeLast;
	/**是否配件审验 */
	private java.lang.String accessoryCheckFlagLast;
	/**定损经办人审验/分公司核价经办人审验*/
	private java.lang.String accessoryPositionLast;
	/**配件审验项目*/
	private java.lang.String accessoryCheckItemLast;
	/**配件审验价格*/
	private java.math.BigDecimal accessoryCheckPriceLast;
	/**配件审验备注*/
	private java.lang.String accessoryCheckRemarkLast;
	/**操作状态：A/U/D*/
	private java.lang.String operateStatusLast;
	/**核损价格方案*/
	private java.lang.String veriCompSetLast;
	/**核损配件属性*/
	private java.lang.String veriItemKindLast;
	/**核损价格来源*/
	private java.lang.String veriPriceSourceLast;
	/**核损换件参考单价*/
	private java.math.BigDecimal veriRefUnitPriceLast;
	/**核损换件单价*/
	private java.math.BigDecimal veriUnitPriceLast;
	/**核损换件总价*/
	private java.math.BigDecimal veriSumPriceLast;
	/**核损换件价格修改标志*/
	private java.lang.String veriPriAdjustFlagLast;
	/**核损自付比例*/
	private java.math.BigDecimal veriSelfRateLast;
	/**核损工时*/
	private java.math.BigDecimal veriManHourLast;
	/**核损工时单价*/
	private java.math.BigDecimal veriManUnitPriceLast;
	/**核损工时费*/
	private java.math.BigDecimal veriManHourFeeLast;
	/**核损材料数量*/
	private java.lang.Integer veriMaterQuantityLast;
	/**核损材料单价费*/
	private java.math.BigDecimal veriMaterUnitPriceLast;
	/**核损材料费*/
	private java.math.BigDecimal veriMaterialFeeLast;
	/**核损总金额*/
	private java.math.BigDecimal sumVeriLossLast;
	/**核损残值*/
	private java.math.BigDecimal veriRemnantLast;
	/**损余回收方式(核损)*/
	private java.lang.String veriRecycleTypeLast;
	/**修复验车标识(核损)*/
	private java.lang.String veriRepairCheckFlagLast;
	/**核损原因*/
	private java.lang.String veriCausationLast;
	/**备注(核损),*/
	private java.lang.String veriRemarkLast;
	/**核损剔除金额*/
	private java.math.BigDecimal sumRejectLast;
	/**核损剔除原因*/
	private java.lang.String rejectReasonLast;
	/**核价价格方案*/
	private java.lang.String veripCompSetLast;
	/**核价配件属性*/
	private java.lang.String veripItemKindLast;
	/**核价价格来源*/
	private java.lang.String veripSourceLast;
	/**核价换件数量*/
	private java.lang.Integer veripQuantityLast;
	/**核价换件参考单价*/
	private java.math.BigDecimal veripRefUnitVeripLast;
	/**核价换件单价*/
	private java.math.BigDecimal veripUnitVeripLast;
	/**核价残值*/
	private java.math.BigDecimal veripUnitRemnentLast;
	/**核价换件总价*/
	private java.math.BigDecimal veripSumVeripLast;
	/**核价换件价格修改标志*/
	private java.lang.String veripAdjustFlagLast;
	/**核价自付比例*/
	private java.math.BigDecimal veripSelfRateLast;
	/**核价工时*/
	private java.math.BigDecimal veripManHourLast;
	/**核价工时单价*/
	private java.math.BigDecimal veripManUnitVeripLast;
	/**核价工时费*/
	private java.math.BigDecimal veripManHourFeeLast;
	/**碰撞程度代码*/
	private java.lang.String hitLevelCodeLast;
	/**碰撞程度名称*/
	private java.lang.String hitLevelNameLast;
	/**	输入时间	*/                                                   
	private java.util.Date inputTimeLast;                                
	/**审验人代码*/
	private java.lang.String accessoryPositionNameLast;      
	/**外修换件费用*/
	private java.math.BigDecimal otherFee;
	private java.math.BigDecimal otherVeriSumPrice;   
	private String otherLossApprovalKindNameTemp;
	private String otherLossApprovalKindCode;
	private String otherLossApprovalKindName;
	private String otherPolicyNo;
	/**                                                              
	 *方法: 取得java.util.Date                                       
	 *@return: java.util.Date  输入日期                              
	 */                                                                                      
	public java.util.Date getInputTime() {                           
		if(this.inputTime  !=null){                                    
			return new java.util.Date(inputTime.getTime());              
		}else{                                                         
                                                                   
			return null;                                                 
                                                                   
		}                                                              
                                                                   
	}                                                                
	/**                                                              
	 *方法: 设置java.util.Date                                       
	 *@param:java.util.Date  输入日期                                
	 */                                                              
	public void setInputTime(java.util.Date inputTime) {             
		if(inputTime  !=null){                                         
			this.inputTime = new java.util.Date(inputTime.getTime());    
		}else{                                                         
			this.inputTime  =null;                                       
		}                                                              
	}	                                                               
	public java.lang.String getLossApprovalCode() {
		return LossApprovalCode;
	}
	public void setLossApprovalCode(java.lang.String lossApprovalCode) {
		LossApprovalCode = lossApprovalCode;
	}
	public java.lang.String getLossApprovalName() {
		return lossApprovalName;
	}
	public void setLossApprovalName(java.lang.String lossApprovalName) {
		this.lossApprovalName = lossApprovalName;
	}
	public java.lang.String getLossApprovalStartDate() {
		return lossApprovalStartDate;
	}
	public void setLossApprovalStartDate(java.lang.String lossApprovalStartDate) {
		this.lossApprovalStartDate = lossApprovalStartDate;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDataSource() {
		return dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public java.lang.String getOriginalId() {
		return originalId;
	}
	public void setOriginalId(java.lang.String originalId) {
		this.originalId = originalId;
	}
	public java.lang.String getDataStatus() {
		return dataStatus;
	}
	public void setDataStatus(java.lang.String dataStatus) {
		this.dataStatus = dataStatus;
	}
	public java.lang.Integer getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(java.lang.Integer serialNo) {
		this.serialNo = serialNo;
	}
	public java.lang.Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(java.lang.Integer orderNo) {
		this.orderNo = orderNo;
	}
	public java.math.BigDecimal getExchRate() {
		return exchRate;
	}
	public void setExchRate(java.math.BigDecimal exchRate) {
		this.exchRate = exchRate;
	}
	public java.lang.String getRepairCheckFlag() {
		return repairCheckFlag;
	}
	public void setRepairCheckFlag(java.lang.String repairCheckFlag) {
		this.repairCheckFlag = repairCheckFlag;
	}
	public java.lang.String getFitsVerifyFlag() {
		return fitsVerifyFlag;
	}
	public void setFitsVerifyFlag(java.lang.String fitsVerifyFlag) {
		this.fitsVerifyFlag = fitsVerifyFlag;
	}
	
	public java.math.BigDecimal getLossFeeForPrint() {
		return lossFeeForPrint;
	}
	public void setLossFeeForPrint(java.math.BigDecimal lossFeeForPrint) {
		this.lossFeeForPrint = lossFeeForPrint;
	}
    public String getLossFeeStringForPrint() {
        return lossFeeStringForPrint;
    }
    public void setLossFeeStringForPrint(String lossFeeStringForPrint) {
        this.lossFeeStringForPrint = lossFeeStringForPrint;
    }
    public java.lang.Integer getVeripMaterQuantity() {
		return veripMaterQuantity;
	}
	public void setVeripMaterQuantity(java.lang.Integer veripMaterQuantity) {
		this.veripMaterQuantity = veripMaterQuantity;
	}
	public java.math.BigDecimal getVeripMaterUnitVerip() {
		return veripMaterUnitVerip;
	}
	public void setVeripMaterUnitVerip(java.math.BigDecimal veripMaterUnitVerip) {
		this.veripMaterUnitVerip = veripMaterUnitVerip;
	}
	public java.math.BigDecimal getVeripMaterialFee() {
		return veripMaterialFee;
	}
	public void setVeripMaterialFee(java.math.BigDecimal veripMaterialFee) {
		this.veripMaterialFee = veripMaterialFee;
	}
	public java.lang.String getVeripRemark() {
		return veripRemark;
	}
	public void setVeripRemark(java.lang.String veripRemark) {
		this.veripRemark = veripRemark;
	}
	public java.lang.String getVeripStatus() {
		return veripStatus;
	}
	public void setVeripStatus(java.lang.String veripStatus) {
		this.veripStatus = veripStatus;
	}
	public java.math.BigDecimal getRepairCheckAmount() {
		return repairCheckAmount;
	}
	public void setRepairCheckAmount(java.math.BigDecimal repairCheckAmount) {
		this.repairCheckAmount = repairCheckAmount;
	}
	public java.lang.String getRepairCheckRemark() {
		return repairCheckRemark;
	}
	public void setRepairCheckRemark(java.lang.String repairCheckRemark) {
		this.repairCheckRemark = repairCheckRemark;
	}
	public java.math.BigDecimal getRecyclePrice() {
		return recyclePrice;
	}
	public void setRecyclePrice(java.math.BigDecimal recyclePrice) {
		this.recyclePrice = recyclePrice;
	}
	public java.lang.String getOperationStatus() {
		return operationStatus;
	}
	public void setOperationStatus(java.lang.String operationStatus) {
		this.operationStatus = operationStatus;
	}
	public java.lang.String getValidFlag() {
		return validFlag;
	}
	public void setValidFlag(java.lang.String validFlag) {
		this.validFlag = validFlag;
	}
	public java.math.BigDecimal getLocPrice() {
		return locPrice;
	}
	public void setLocPrice(java.math.BigDecimal locPrice) {
		this.locPrice = locPrice;
	}
	public java.math.BigDecimal getRefPrice1() {
		return refPrice1;
	}
	public void setRefPrice1(java.math.BigDecimal refPrice1) {
		this.refPrice1 = refPrice1;
	}
	public java.math.BigDecimal getRefPrice2() {
		return refPrice2;
	}
	public void setRefPrice2(java.math.BigDecimal refPrice2) {
		this.refPrice2 = refPrice2;
	}
	public java.math.BigDecimal getRefPrice3() {
		return refPrice3;
	}
	public void setRefPrice3(java.math.BigDecimal refPrice3) {
		this.refPrice3 = refPrice3;
	}
	public java.math.BigDecimal getLocPrice1() {
		return locPrice1;
	}
	public void setLocPrice1(java.math.BigDecimal locPrice1) {
		this.locPrice1 = locPrice1;
	}
	public java.math.BigDecimal getLocPrice2() {
		return locPrice2;
	}
	public void setLocPrice2(java.math.BigDecimal locPrice2) {
		this.locPrice2 = locPrice2;
	}
	public java.math.BigDecimal getLocPrice3() {
		return locPrice3;
	}
	public void setLocPrice3(java.math.BigDecimal locPrice3) {
		this.locPrice3 = locPrice3;
	}
	public java.math.BigDecimal getRepairPrice() {
		return repairPrice;
	}
	public void setRepairPrice(java.math.BigDecimal repairPrice) {
		this.repairPrice = repairPrice;
	}
	public java.util.Date getInsertTimeForHis() {
		if( insertTimeForHis!=null){
		    return new java.util.Date(insertTimeForHis.getTime());
		}else{
		   return null;
		   }
	}
	public void setInsertTimeForHis(java.util.Date insertTimeForHis) {
		if( insertTimeForHis!=null){
		    this.insertTimeForHis =new java.util.Date( insertTimeForHis.getTime());
		}else{
		   this.insertTimeForHis =null;
		   }
	}
	public java.util.Date getOperateTimeForHis() {
		if( operateTimeForHis!=null){
		    return new java.util.Date(operateTimeForHis.getTime());
		}else{
		   return null;
		   }
	}
	public void setOperateTimeForHis(java.util.Date operateTimeForHis) {
		if( operateTimeForHis!=null){
		    this.operateTimeForHis =new java.util.Date( operateTimeForHis.getTime());
		}else{
		   this.operateTimeForHis =null;
		   }
	}
	public java.lang.String getId() {
		return id;
	}
	public void setId(java.lang.String id) {
		this.id = id;
	}
	public java.lang.String getLossApprovalId() {
		return lossApprovalId;
	}
	public void setLossApprovalId(java.lang.String lossApprovalId) {
		this.lossApprovalId = lossApprovalId;
	}
	public java.lang.String getToolCode() {
		return toolCode;
	}
	public void setToolCode(java.lang.String toolCode) {
		this.toolCode = toolCode;
	}
	public java.lang.String getToolName() {
		return toolName;
	}
	public void setToolName(java.lang.String toolName) {
		this.toolName = toolName;
	}
	public java.lang.String getItemId() {
		return itemId;
	}
	public void setItemId(java.lang.String itemId) {
		this.itemId = itemId;
	}
	public java.lang.String getThirdFactoryFlag() {
		return thirdFactoryFlag;
	}
	public void setThirdFactoryFlag(java.lang.String thirdFactoryFlag) {
		this.thirdFactoryFlag = thirdFactoryFlag;
	}
	public java.lang.String getRepairFactoryCode() {
		return repairFactoryCode;
	}
	public void setRepairFactoryCode(java.lang.String repairFactoryCode) {
		this.repairFactoryCode = repairFactoryCode;
	}
	public java.lang.String getRepairFactoryName() {
		return repairFactoryName;
	}
	public void setRepairFactoryName(java.lang.String repairFactoryName) {
		this.repairFactoryName = repairFactoryName;
	}
	public java.lang.String getHandlerCode() {
		return handlerCode;
	}
	public void setHandlerCode(java.lang.String handlerCode) {
		this.handlerCode = handlerCode;
	}
	public java.lang.String getHandlerName() {
		return handlerName;
	}
	public void setHandlerName(java.lang.String handlerName) {
		this.handlerName = handlerName;
	}
	public java.util.Date getRepairStartDate() {
		if( repairStartDate!=null){
		    return new java.util.Date(repairStartDate.getTime());
		}else{
		   return null;
		   }
	}
	public void setRepairStartDate(java.util.Date repairStartDate) {
		if( repairStartDate!=null){
		    this.repairStartDate =new java.util.Date( repairStartDate.getTime());
		}else{
		   this.repairStartDate =null;
		   }
	}
	public java.util.Date getRepairEndSate() {
		if( repairEndSate!=null){
		    return new java.util.Date(repairEndSate.getTime());
		}else{
		   return null;
		   }
	}
	public void setRepairEndSate(java.util.Date repairEndSate) {
		if( repairEndSate!=null){
		    this.repairEndSate =new java.util.Date( repairEndSate.getTime());
		}else{
		   this.repairEndSate =null;
		   }
	}
	public java.math.BigDecimal getManageFeeRate() {
		return manageFeeRate;
	}
	public void setManageFeeRate(java.math.BigDecimal manageFeeRate) {
		this.manageFeeRate = manageFeeRate;
	}
	public java.math.BigDecimal getManageFee() {
		return manageFee;
	}
	public void setManageFee(java.math.BigDecimal manageFee) {
		this.manageFee = manageFee;
	}
	public java.math.BigDecimal getManageDisCountRate() {
		return manageDisCountRate;
	}
	public void setManageDisCountRate(java.math.BigDecimal manageDisCountRate) {
		this.manageDisCountRate = manageDisCountRate;
	}
	public java.lang.String getPartCode() {
		return partCode;
	}
	public void setPartCode(java.lang.String partCode) {
		this.partCode = partCode;
	}
	public java.lang.String getPartDesc() {
		return partDesc;
	}
	public void setPartDesc(java.lang.String partDesc) {
		this.partDesc = partDesc;
	}
	public java.lang.String getCompCode() {
		return compCode;
	}
	public void setCompCode(java.lang.String compCode) {
		this.compCode = compCode;
	}
	public java.lang.String getCompName() {
		return compName;
	}
	public void setCompName(java.lang.String compName) {
		this.compName = compName;
	}
	public java.lang.String getHitPartCode() {
		return hitPartCode;
	}
	public void setHitPartCode(java.lang.String hitPartCode) {
		this.hitPartCode = hitPartCode;
	}
	public java.lang.String getHitPartName() {
		return hitPartName;
	}
	public void setHitPartName(java.lang.String hitPartName) {
		this.hitPartName = hitPartName;
	}
	public java.lang.String getSystemCompCode() {
		return systemCompCode;
	}
	public void setSystemCompCode(java.lang.String systemCompCode) {
		this.systemCompCode = systemCompCode;
	}
	public java.lang.String getOriginalCode() {
		return originalCode;
	}
	public void setOriginalCode(java.lang.String originalCode) {
		this.originalCode = originalCode;
	}
	public java.lang.String getOriginalName() {
		return originalName;
	}
	public void setOriginalName(java.lang.String originalName) {
		this.originalName = originalName;
	}
	public java.lang.String getPartStandardCode() {
		return partStandardCode;
	}
	public void setPartStandardCode(java.lang.String partStandardCode) {
		this.partStandardCode = partStandardCode;
	}
	public java.lang.String getPartStandard() {
		return partStandard;
	}
	public void setPartStandard(java.lang.String partStandard) {
		this.partStandard = partStandard;
	}
	public java.lang.String getPartGroupCode() {
		return partGroupCode;
	}
	public void setPartGroupCode(java.lang.String partGroupCode) {
		this.partGroupCode = partGroupCode;
	}
	public java.lang.String getPartGroupName() {
		return partGroupName;
	}
	public void setPartGroupName(java.lang.String partGroupName) {
		this.partGroupName = partGroupName;
	}
	public java.lang.Integer getVeriQuantity() {
		return veriQuantity;
	}
	public void setVeriQuantity(java.lang.Integer veriQuantity) {
		this.veriQuantity = veriQuantity;
	}
	public java.lang.String getSelfConfigFlag() {
		return selfConfigFlag;
	}
	public void setSelfConfigFlag(java.lang.String selfConfigFlag) {
		this.selfConfigFlag = selfConfigFlag;
	}
	public java.lang.String getInstallEquipmentFlag() {
		return installEquipmentFlag;
	}
	public void setInstallEquipmentFlag(java.lang.String installEquipmentFlag) {
		this.installEquipmentFlag = installEquipmentFlag;
	}
	public java.lang.String getItemKind() {
		return itemKind;
	}
	public void setItemKind(java.lang.String itemKind) {
		this.itemKind = itemKind;
	}
	public java.lang.String getPriceSource() {
		return priceSource;
	}
	public void setPriceSource(java.lang.String priceSource) {
		this.priceSource = priceSource;
	}
	public java.lang.String getDetectFlag() {
		return detectFlag;
	}
	public void setDetectFlag(java.lang.String detectFlag) {
		this.detectFlag = detectFlag;
	}
	public java.lang.String getCurrency() {
		return currency;
	}
	public void setCurrency(java.lang.String currency) {
		this.currency = currency;
	}
	public java.math.BigDecimal getChgDisCountRate() {
		return chgDisCountRate;
	}
	public void setChgDisCountRate(java.math.BigDecimal chgDisCountRate) {
		this.chgDisCountRate = chgDisCountRate;
	}
	public java.lang.String getChgCompSet() {
		return chgCompSet;
	}
	public void setChgCompSet(java.lang.String chgCompSet) {
		this.chgCompSet = chgCompSet;
	}
	public java.math.BigDecimal getReFunitPrice() {
		return reFunitPrice;
	}
	public void setReFunitPrice(java.math.BigDecimal reFunitPrice) {
		this.reFunitPrice = reFunitPrice;
	}
	public java.lang.String getReFunitType() {
		return reFunitType;
	}
	public void setReFunitType(java.lang.String reFunitType) {
		this.reFunitType = reFunitType;
	}
	public java.lang.Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(java.lang.Integer quantity) {
		this.quantity = quantity;
	}
	public java.math.BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(java.math.BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public java.math.BigDecimal getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(java.math.BigDecimal sumPrice) {
		this.sumPrice = sumPrice;
	}
	public java.math.BigDecimal getLossFee() {
		return lossFee;
	}
	public void setLossFee(java.math.BigDecimal lossFee) {
		this.lossFee = lossFee;
	}
	public java.math.BigDecimal getRemnant() {
		return remnant;
	}
	public void setRemnant(java.math.BigDecimal remnant) {
		this.remnant = remnant;
	}
	public java.lang.String getPriceAdjustFlag() {
		return priceAdjustFlag;
	}
	public void setPriceAdjustFlag(java.lang.String priceAdjustFlag) {
		this.priceAdjustFlag = priceAdjustFlag;
	}
	public java.math.BigDecimal getSelfRate() {
		return selfRate;
	}
	public void setSelfRate(java.math.BigDecimal selfRate) {
		this.selfRate = selfRate;
	}
	public java.math.BigDecimal getManHour() {
		return manHour;
	}
	public void setManHour(java.math.BigDecimal manHour) {
		this.manHour = manHour;
	}
	public java.math.BigDecimal getManHourUnitPrice() {
		return manHourUnitPrice;
	}
	public void setManHourUnitPrice(java.math.BigDecimal manHourUnitPrice) {
		this.manHourUnitPrice = manHourUnitPrice;
	}
	public java.math.BigDecimal getManHourFee() {
		return manHourFee;
	}
	public void setManHourFee(java.math.BigDecimal manHourFee) {
		this.manHourFee = manHourFee;
	}
	public java.lang.Integer getMaterialQuantity() {
		return materialQuantity;
	}
	public void setMaterialQuantity(java.lang.Integer materialQuantity) {
		this.materialQuantity = materialQuantity;
	}
	public java.math.BigDecimal getMaterialUnitPrice() {
		return materialUnitPrice;
	}
	public void setMaterialUnitPrice(java.math.BigDecimal materialUnitPrice) {
		this.materialUnitPrice = materialUnitPrice;
	}
	public java.math.BigDecimal getMaterialFee() {
		return materialFee;
	}
	public void setMaterialFee(java.math.BigDecimal materialFee) {
		this.materialFee = materialFee;
	}
	
	public java.math.BigDecimal getSumDefLoss() {
		return sumDefLoss;
	}
	public void setSumDefLoss(java.math.BigDecimal sumDefLoss) {
		this.sumDefLoss = sumDefLoss;
	}
	public java.math.BigDecimal getQuoPrice() {
		return quoPrice;
	}
	public void setQuoPrice(java.math.BigDecimal quoPrice) {
		this.quoPrice = quoPrice;
	}
	public java.math.BigDecimal getSprayPaintPrice() {
		return sprayPaintPrice;
	}
	public void setSprayPaintPrice(java.math.BigDecimal sprayPaintPrice) {
		this.sprayPaintPrice = sprayPaintPrice;
	}
	public java.math.BigDecimal getDismantlePrice() {
		return dismantlePrice;
	}
	public void setDismantlePrice(java.math.BigDecimal dismantlePrice) {
		this.dismantlePrice = dismantlePrice;
	}
	public java.lang.String getSanctioner() {
		return sanctioner;
	}
	public void setSanctioner(java.lang.String sanctioner) {
		this.sanctioner = sanctioner;
	}
	public java.lang.String getApproverCode() {
		return approverCode;
	}
	public void setApproverCode(java.lang.String approverCode) {
		this.approverCode = approverCode;
	}
	public java.lang.String getOperatorCode() {
		return operatorCode;
	}
	public void setOperatorCode(java.lang.String operatorCode) {
		this.operatorCode = operatorCode;
	}
	public java.lang.String getLossApprovalRemark() {
		return lossApprovalRemark;
	}
	public void setLossApprovalRemark(java.lang.String lossApprovalRemark) {
		this.lossApprovalRemark = lossApprovalRemark;
	}
	public java.lang.String getRecycleFlag() {
		return recycleFlag;
	}
	public void setRecycleFlag(java.lang.String recycleFlag) {
		this.recycleFlag = recycleFlag;
	}
	public java.lang.String getRecycleType() {
		return recycleType;
	}
	public void setRecycleType(java.lang.String recycleType) {
		this.recycleType = recycleType;
	}
	public java.lang.String getAccessoryCheckFlag() {
		return accessoryCheckFlag;
	}
	public void setAccessoryCheckFlag(java.lang.String accessoryCheckFlag) {
		this.accessoryCheckFlag = accessoryCheckFlag;
	}
	public java.lang.String getAccessoryPosition() {
		return accessoryPosition;
	}
	public void setAccessoryPosition(java.lang.String accessoryPosition) {
		this.accessoryPosition = accessoryPosition;
	}
	public java.lang.String getAccessoryCheckItem() {
		return accessoryCheckItem;
	}
	public void setAccessoryCheckItem(java.lang.String accessoryCheckItem) {
		this.accessoryCheckItem = accessoryCheckItem;
	}
	public java.math.BigDecimal getAccessoryCheckPrice() {
		return accessoryCheckPrice;
	}
	public void setAccessoryCheckPrice(java.math.BigDecimal accessoryCheckPrice) {
		this.accessoryCheckPrice = accessoryCheckPrice;
	}
	public java.lang.String getAccessoryCheckRemark() {
		return accessoryCheckRemark;
	}
	public void setAccessoryCheckRemark(java.lang.String accessoryCheckRemark) {
		this.accessoryCheckRemark = accessoryCheckRemark;
	}
	public java.lang.String getOperateStatus() {
		return operateStatus;
	}
	public void setOperateStatus(java.lang.String operateStatus) {
		this.operateStatus = operateStatus;
	}
	public java.lang.String getVeriCompSet() {
		return veriCompSet;
	}
	public void setVeriCompSet(java.lang.String veriCompSet) {
		this.veriCompSet = veriCompSet;
	}
	public java.lang.String getVeriItemKind() {
		return veriItemKind;
	}
	public void setVeriItemKind(java.lang.String veriItemKind) {
		this.veriItemKind = veriItemKind;
	}
	public java.lang.String getVeriPriceSource() {
		return veriPriceSource;
	}
	public void setVeriPriceSource(java.lang.String veriPriceSource) {
		this.veriPriceSource = veriPriceSource;
	}
	public java.math.BigDecimal getVeriRefUnitPrice() {
		return veriRefUnitPrice;
	}
	public void setVeriRefUnitPrice(java.math.BigDecimal veriRefUnitPrice) {
		this.veriRefUnitPrice = veriRefUnitPrice;
	}
	public java.math.BigDecimal getVeriUnitPrice() {
		return veriUnitPrice;
	}
	public void setVeriUnitPrice(java.math.BigDecimal veriUnitPrice) {
		this.veriUnitPrice = veriUnitPrice;
	}
	public java.math.BigDecimal getVeriSumPrice() {
		return veriSumPrice;
	}
	public void setVeriSumPrice(java.math.BigDecimal veriSumPrice) {
		this.veriSumPrice = veriSumPrice;
	}
	public java.lang.String getVeriPriAdjustFlag() {
		return veriPriAdjustFlag;
	}
	public void setVeriPriAdjustFlag(java.lang.String veriPriAdjustFlag) {
		this.veriPriAdjustFlag = veriPriAdjustFlag;
	}
	public java.math.BigDecimal getVeriSelfRate() {
		return veriSelfRate;
	}
	public void setVeriSelfRate(java.math.BigDecimal veriSelfRate) {
		this.veriSelfRate = veriSelfRate;
	}
	public java.math.BigDecimal getVeriManHour() {
		return veriManHour;
	}
	public void setVeriManHour(java.math.BigDecimal veriManHour) {
		this.veriManHour = veriManHour;
	}
	public java.math.BigDecimal getVeriManUnitPrice() {
		return veriManUnitPrice;
	}
	public void setVeriManUnitPrice(java.math.BigDecimal veriManUnitPrice) {
		this.veriManUnitPrice = veriManUnitPrice;
	}
	public java.math.BigDecimal getVeriManHourFee() {
		return veriManHourFee;
	}
	public void setVeriManHourFee(java.math.BigDecimal veriManHourFee) {
		this.veriManHourFee = veriManHourFee;
	}
	public java.lang.Integer getVeriMaterQuantity() {
		return veriMaterQuantity;
	}
	public void setVeriMaterQuantity(java.lang.Integer veriMaterQuantity) {
		this.veriMaterQuantity = veriMaterQuantity;
	}
	public java.math.BigDecimal getVeriMaterUnitPrice() {
		return veriMaterUnitPrice;
	}
	public void setVeriMaterUnitPrice(java.math.BigDecimal veriMaterUnitPrice) {
		this.veriMaterUnitPrice = veriMaterUnitPrice;
	}
	public java.math.BigDecimal getVeriMaterialFee() {
		return veriMaterialFee;
	}
	public void setVeriMaterialFee(java.math.BigDecimal veriMaterialFee) {
		this.veriMaterialFee = veriMaterialFee;
	}
	public java.math.BigDecimal getSumVeriLoss() {
		return sumVeriLoss;
	}
	public void setSumVeriLoss(java.math.BigDecimal sumVeriLoss) {
		this.sumVeriLoss = sumVeriLoss;
	}
	
	public java.math.BigDecimal getVeriRemnant() {
		return veriRemnant;
	}
	public void setVeriRemnant(java.math.BigDecimal veriRemnant) {
		this.veriRemnant = veriRemnant;
	}
	public java.lang.String getVeriRecycleType() {
		return veriRecycleType;
	}
	public void setVeriRecycleType(java.lang.String veriRecycleType) {
		this.veriRecycleType = veriRecycleType;
	}
	public java.lang.String getVeriRepairCheckFlag() {
		return veriRepairCheckFlag;
	}
	public void setVeriRepairCheckFlag(java.lang.String veriRepairCheckFlag) {
		this.veriRepairCheckFlag = veriRepairCheckFlag;
	}
	public java.lang.String getVeriCausation() {
		return veriCausation;
	}
	public void setVeriCausation(java.lang.String veriCausation) {
		this.veriCausation = veriCausation;
	}
	public java.lang.String getVeriRemark() {
		return veriRemark;
	}
	public void setVeriRemark(java.lang.String veriRemark) {
		this.veriRemark = veriRemark;
	}
	public java.math.BigDecimal getSumReject() {
		return sumReject;
	}
	public void setSumReject(java.math.BigDecimal sumReject) {
		this.sumReject = sumReject;
	}
	public java.lang.String getRejectReason() {
		return rejectReason;
	}
	public void setRejectReason(java.lang.String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public java.lang.String getVeripCompSet() {
		return veripCompSet;
	}
	public void setVeripCompSet(java.lang.String veripCompSet) {
		this.veripCompSet = veripCompSet;
	}
	public java.lang.String getVeripItemKind() {
		return veripItemKind;
	}
	public void setVeripItemKind(java.lang.String veripItemKind) {
		this.veripItemKind = veripItemKind;
	}
	public java.lang.String getVeripSource() {
		return veripSource;
	}
	public void setVeripSource(java.lang.String veripSource) {
		this.veripSource = veripSource;
	}
	public java.math.BigDecimal getVeripRefUnitVerip() {
		return veripRefUnitVerip;
	}
	public void setVeripRefUnitVerip(java.math.BigDecimal veripRefUnitVerip) {
		this.veripRefUnitVerip = veripRefUnitVerip;
	}
	public java.math.BigDecimal getVeripUnitVerip() {
		return veripUnitVerip;
	}
	public void setVeripUnitVerip(java.math.BigDecimal veripUnitVerip) {
		this.veripUnitVerip = veripUnitVerip;
	}
	public java.math.BigDecimal getVeripUnitRemnent() {
		return veripUnitRemnent;
	}
	public void setVeripUnitRemnent(java.math.BigDecimal veripUnitRemnent) {
		this.veripUnitRemnent = veripUnitRemnent;
	}
	public java.math.BigDecimal getVeripSumVerip() {
		return veripSumVerip;
	}
	public void setVeripSumVerip(java.math.BigDecimal veripSumVerip) {
		this.veripSumVerip = veripSumVerip;
	}
	public java.lang.String getVeripAdjustFlag() {
		return veripAdjustFlag;
	}
	public void setVeripAdjustFlag(java.lang.String veripAdjustFlag) {
		this.veripAdjustFlag = veripAdjustFlag;
	}
	public java.math.BigDecimal getVeripSelfRate() {
		return veripSelfRate;
	}
	public void setVeripSelfRate(java.math.BigDecimal veripSelfRate) {
		this.veripSelfRate = veripSelfRate;
	}
	public java.math.BigDecimal getVeripManHour() {
		return veripManHour;
	}
	public void setVeripManHour(java.math.BigDecimal veripManHour) {
		this.veripManHour = veripManHour;
	}
	public java.math.BigDecimal getVeripManUnitVerip() {
		return veripManUnitVerip;
	}
	public void setVeripManUnitVerip(java.math.BigDecimal veripManUnitVerip) {
		this.veripManUnitVerip = veripManUnitVerip;
	}
	public java.math.BigDecimal getVeripManHourFee() {
		return veripManHourFee;
	}
	public void setVeripManHourFee(java.math.BigDecimal veripManHourFee) {
		this.veripManHourFee = veripManHourFee;
	}
	public java.lang.Integer getVeripQuantity() {
		return veripQuantity;
	}
	public void setVeripQuantity(java.lang.Integer veripQuantity) {
		this.veripQuantity = veripQuantity;
	}
	public java.lang.String getVerifyThirdFactoryFlag() {
		return verifyThirdFactoryFlag;
	}
	public void setVerifyThirdFactoryFlag(java.lang.String verifyThirdFactoryFlag) {
		this.verifyThirdFactoryFlag = verifyThirdFactoryFlag;
	}
	public java.lang.String getVerifyRepairFactoryCode() {
		return verifyRepairFactoryCode;
	}
	public void setVerifyRepairFactoryCode(java.lang.String verifyRepairFactoryCode) {
		this.verifyRepairFactoryCode = verifyRepairFactoryCode;
	}
	public java.lang.String getVerifyRepairFactoryName() {
		return verifyRepairFactoryName;
	}
	public void setVerifyRepairFactoryName(java.lang.String verifyRepairFactoryName) {
		this.verifyRepairFactoryName = verifyRepairFactoryName;
	}
	public java.lang.String getVeripThirdFactoryFlag() {
		return veripThirdFactoryFlag;
	}
	public void setVeripThirdFactoryFlag(java.lang.String veripThirdFactoryFlag) {
		this.veripThirdFactoryFlag = veripThirdFactoryFlag;
	}
	public java.lang.String getVeripRepairFactoryCode() {
		return veripRepairFactoryCode;
	}
	public void setVeripRepairFactoryCode(java.lang.String veripRepairFactoryCode) {
		this.veripRepairFactoryCode = veripRepairFactoryCode;
	}
	public java.lang.String getVeripRepairFactoryName() {
		return veripRepairFactoryName;
	}
	public void setVeripRepairFactoryName(java.lang.String veripRepairFactoryName) {
		this.veripRepairFactoryName = veripRepairFactoryName;
	}
	public java.lang.String getHitLevelCode() {
		return hitLevelCode;
	}
	public void setHitLevelCode(java.lang.String hitLevelCode) {
		this.hitLevelCode = hitLevelCode;
	}
	public java.lang.String getHitLevelName() {
		return hitLevelName;
	}
	public void setHitLevelName(java.lang.String hitLevelName) {
		this.hitLevelName = hitLevelName;
	}
	public java.lang.String getVeripRecycleType() {
		return veripRecycleType;
	}
	public void setVeripRecycleType(java.lang.String veripRecycleType) {
		this.veripRecycleType = veripRecycleType;
	}
	public java.lang.String getTrackId() {
		return trackId;
	}
	public void setTrackId(java.lang.String trackId) {
		this.trackId = trackId;
	}
	public java.lang.String getFuncType() {
		return funcType;
	}
	public void setFuncType(java.lang.String funcType) {
		this.funcType = funcType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getLossApprovalKindName() {
		return lossApprovalKindName;
	}
	public void setLossApprovalKindName(String lossApprovalKindName) {
		this.lossApprovalKindName = lossApprovalKindName;
	}
	public String getLossApprovalKindNameTemp() {
		return lossApprovalKindNameTemp;
	}
	public void setLossApprovalKindNameTemp(String lossApprovalKindNameTemp) {
		this.lossApprovalKindNameTemp = lossApprovalKindNameTemp;
	}
	public java.lang.String getTaskType() {
		return taskType;
	}
	public void setTaskType(java.lang.String taskType) {
		this.taskType = taskType;
	}
	public java.math.BigDecimal getOtherFee() {
		return otherFee;
	}
	public void setOtherFee(java.math.BigDecimal otherFee) {
		this.otherFee = otherFee;
	}
	public java.lang.String getAccessoryPositionName() {
		return accessoryPositionName;
	}
	public void setAccessoryPositionName(java.lang.String accessoryPositionName) {
		this.accessoryPositionName = accessoryPositionName;
	}
	public int getPageComponentRowMark() {
		return pageComponentRowMark;
	}
	public void setPageComponentRowMark(int pageComponentRowMark) {
		this.pageComponentRowMark = pageComponentRowMark;
	}
	public String getShowVerify() {
		return showVerify;
	}
	public void setShowVerify(String showVerify) {
		this.showVerify = showVerify;
	}
	public String getShowPrice() {
		return showPrice;
	}
	public void setShowPrice(String showPrice) {
		this.showPrice = showPrice;
	}
	public java.lang.Integer getSerialNoLast() {
		return serialNoLast;
	}
	public void setSerialNoLast(java.lang.Integer serialNoLast) {
		this.serialNoLast = serialNoLast;
	}
	public java.lang.Integer getOrderNoLast() {
		return orderNoLast;
	}
	public void setOrderNoLast(java.lang.Integer orderNoLast) {
		this.orderNoLast = orderNoLast;
	}
	public java.math.BigDecimal getExchRateLast() {
		return exchRateLast;
	}
	public void setExchRateLast(java.math.BigDecimal exchRateLast) {
		this.exchRateLast = exchRateLast;
	}
	public java.lang.String getRepairCheckFlagLast() {
		return repairCheckFlagLast;
	}
	public void setRepairCheckFlagLast(java.lang.String repairCheckFlagLast) {
		this.repairCheckFlagLast = repairCheckFlagLast;
	}
	public java.lang.String getFitsVerifyFlagLast() {
		return fitsVerifyFlagLast;
	}
	public void setFitsVerifyFlagLast(java.lang.String fitsVerifyFlagLast) {
		this.fitsVerifyFlagLast = fitsVerifyFlagLast;
	}
	public java.lang.Integer getVeripMaterQuantityLast() {
		return veripMaterQuantityLast;
	}
	public void setVeripMaterQuantityLast(java.lang.Integer veripMaterQuantityLast) {
		this.veripMaterQuantityLast = veripMaterQuantityLast;
	}
	public java.math.BigDecimal getVeripMaterUnitVeripLast() {
		return veripMaterUnitVeripLast;
	}
	public void setVeripMaterUnitVeripLast(
			java.math.BigDecimal veripMaterUnitVeripLast) {
		this.veripMaterUnitVeripLast = veripMaterUnitVeripLast;
	}
	public java.math.BigDecimal getVeripMaterialFeeLast() {
		return veripMaterialFeeLast;
	}
	public void setVeripMaterialFeeLast(java.math.BigDecimal veripMaterialFeeLast) {
		this.veripMaterialFeeLast = veripMaterialFeeLast;
	}
	public java.lang.String getVeripRemarkLast() {
		return veripRemarkLast;
	}
	public void setVeripRemarkLast(java.lang.String veripRemarkLast) {
		this.veripRemarkLast = veripRemarkLast;
	}
	public java.lang.String getVeripStatusLast() {
		return veripStatusLast;
	}
	public void setVeripStatusLast(java.lang.String veripStatusLast) {
		this.veripStatusLast = veripStatusLast;
	}
	public java.math.BigDecimal getRepairCheckAmountLast() {
		return repairCheckAmountLast;
	}
	public void setRepairCheckAmountLast(java.math.BigDecimal repairCheckAmountLast) {
		this.repairCheckAmountLast = repairCheckAmountLast;
	}
	public java.lang.String getRepairCheckRemarkLast() {
		return repairCheckRemarkLast;
	}
	public void setRepairCheckRemarkLast(java.lang.String repairCheckRemarkLast) {
		this.repairCheckRemarkLast = repairCheckRemarkLast;
	}
	public java.math.BigDecimal getRecyclePriceLast() {
		return recyclePriceLast;
	}
	public void setRecyclePriceLast(java.math.BigDecimal recyclePriceLast) {
		this.recyclePriceLast = recyclePriceLast;
	}
	public java.lang.String getOperationStatusLast() {
		return operationStatusLast;
	}
	public void setOperationStatusLast(java.lang.String operationStatusLast) {
		this.operationStatusLast = operationStatusLast;
	}
	public java.lang.String getValidFlagLast() {
		return validFlagLast;
	}
	public void setValidFlagLast(java.lang.String validFlagLast) {
		this.validFlagLast = validFlagLast;
	}
	public java.math.BigDecimal getLocPriceLast() {
		return locPriceLast;
	}
	public void setLocPriceLast(java.math.BigDecimal locPriceLast) {
		this.locPriceLast = locPriceLast;
	}
	public java.math.BigDecimal getRefPrice1Last() {
		return refPrice1Last;
	}
	public void setRefPrice1Last(java.math.BigDecimal refPrice1Last) {
		this.refPrice1Last = refPrice1Last;
	}
	public java.math.BigDecimal getRefPrice2Last() {
		return refPrice2Last;
	}
	public void setRefPrice2Last(java.math.BigDecimal refPrice2Last) {
		this.refPrice2Last = refPrice2Last;
	}
	public java.math.BigDecimal getRefPrice3Last() {
		return refPrice3Last;
	}
	public void setRefPrice3Last(java.math.BigDecimal refPrice3Last) {
		this.refPrice3Last = refPrice3Last;
	}
	public java.math.BigDecimal getLocPrice1Last() {
		return locPrice1Last;
	}
	public void setLocPrice1Last(java.math.BigDecimal locPrice1Last) {
		this.locPrice1Last = locPrice1Last;
	}
	public java.math.BigDecimal getLocPrice2Last() {
		return locPrice2Last;
	}
	public void setLocPrice2Last(java.math.BigDecimal locPrice2Last) {
		this.locPrice2Last = locPrice2Last;
	}
	public java.math.BigDecimal getLocPrice3Last() {
		return locPrice3Last;
	}
	public void setLocPrice3Last(java.math.BigDecimal locPrice3Last) {
		this.locPrice3Last = locPrice3Last;
	}
	public java.math.BigDecimal getRepairPriceLast() {
		return repairPriceLast;
	}
	public void setRepairPriceLast(java.math.BigDecimal repairPriceLast) {
		this.repairPriceLast = repairPriceLast;
	}
	public java.util.Date getInsertTimeForHisLast() {
		return insertTimeForHisLast;
	}
	public void setInsertTimeForHisLast(java.util.Date insertTimeForHisLast) {
		this.insertTimeForHisLast = insertTimeForHisLast;
	}
	public java.util.Date getOperateTimeForHisLast() {
		return operateTimeForHisLast;
	}
	public void setOperateTimeForHisLast(java.util.Date operateTimeForHisLast) {
		this.operateTimeForHisLast = operateTimeForHisLast;
	}
	public java.lang.String getIdLast() {
		return idLast;
	}
	public void setIdLast(java.lang.String idLast) {
		this.idLast = idLast;
	}
	public java.lang.String getLossApprovalIdLast() {
		return lossApprovalIdLast;
	}
	public void setLossApprovalIdLast(java.lang.String lossApprovalIdLast) {
		this.lossApprovalIdLast = lossApprovalIdLast;
	}
	public java.lang.String getToolCodeLast() {
		return toolCodeLast;
	}
	public void setToolCodeLast(java.lang.String toolCodeLast) {
		this.toolCodeLast = toolCodeLast;
	}
	public java.lang.String getToolNameLast() {
		return toolNameLast;
	}
	public void setToolNameLast(java.lang.String toolNameLast) {
		this.toolNameLast = toolNameLast;
	}
	public java.lang.String getItemIdLast() {
		return itemIdLast;
	}
	public void setItemIdLast(java.lang.String itemIdLast) {
		this.itemIdLast = itemIdLast;
	}
	public java.lang.String getThirdFactoryFlagLast() {
		return thirdFactoryFlagLast;
	}
	public void setThirdFactoryFlagLast(java.lang.String thirdFactoryFlagLast) {
		this.thirdFactoryFlagLast = thirdFactoryFlagLast;
	}
	public java.lang.String getRepairFactoryCodeLast() {
		return repairFactoryCodeLast;
	}
	public void setRepairFactoryCodeLast(java.lang.String repairFactoryCodeLast) {
		this.repairFactoryCodeLast = repairFactoryCodeLast;
	}
	public java.lang.String getRepairFactoryNameLast() {
		return repairFactoryNameLast;
	}
	public void setRepairFactoryNameLast(java.lang.String repairFactoryNameLast) {
		this.repairFactoryNameLast = repairFactoryNameLast;
	}
	public java.lang.String getHandlerCodeLast() {
		return handlerCodeLast;
	}
	public void setHandlerCodeLast(java.lang.String handlerCodeLast) {
		this.handlerCodeLast = handlerCodeLast;
	}
	public java.lang.String getHandlerNameLast() {
		return handlerNameLast;
	}
	public void setHandlerNameLast(java.lang.String handlerNameLast) {
		this.handlerNameLast = handlerNameLast;
	}
	public java.util.Date getRepairStartDateLast() {
		return repairStartDateLast;
	}
	public void setRepairStartDateLast(java.util.Date repairStartDateLast) {
		this.repairStartDateLast = repairStartDateLast;
	}
	public java.util.Date getRepairEndSateLast() {
		return repairEndSateLast;
	}
	public void setRepairEndSateLast(java.util.Date repairEndSateLast) {
		this.repairEndSateLast = repairEndSateLast;
	}
	public java.math.BigDecimal getManageFeeRateLast() {
		return manageFeeRateLast;
	}
	public void setManageFeeRateLast(java.math.BigDecimal manageFeeRateLast) {
		this.manageFeeRateLast = manageFeeRateLast;
	}
	public java.math.BigDecimal getManageFeeLast() {
		return manageFeeLast;
	}
	public void setManageFeeLast(java.math.BigDecimal manageFeeLast) {
		this.manageFeeLast = manageFeeLast;
	}
	public java.math.BigDecimal getManageDisCountRateLast() {
		return manageDisCountRateLast;
	}
	public void setManageDisCountRateLast(
			java.math.BigDecimal manageDisCountRateLast) {
		this.manageDisCountRateLast = manageDisCountRateLast;
	}
	public java.lang.String getPartCodeLast() {
		return partCodeLast;
	}
	public void setPartCodeLast(java.lang.String partCodeLast) {
		this.partCodeLast = partCodeLast;
	}
	public java.lang.String getPartDescLast() {
		return partDescLast;
	}
	public void setPartDescLast(java.lang.String partDescLast) {
		this.partDescLast = partDescLast;
	}
	public java.lang.String getCompCodeLast() {
		return compCodeLast;
	}
	public void setCompCodeLast(java.lang.String compCodeLast) {
		this.compCodeLast = compCodeLast;
	}
	public java.lang.String getCompNameLast() {
		return compNameLast;
	}
	public void setCompNameLast(java.lang.String compNameLast) {
		this.compNameLast = compNameLast;
	}
	public java.lang.String getHitPartCodeLast() {
		return hitPartCodeLast;
	}
	public void setHitPartCodeLast(java.lang.String hitPartCodeLast) {
		this.hitPartCodeLast = hitPartCodeLast;
	}
	public java.lang.String getHitPartNameLast() {
		return hitPartNameLast;
	}
	public void setHitPartNameLast(java.lang.String hitPartNameLast) {
		this.hitPartNameLast = hitPartNameLast;
	}
	public java.lang.String getSystemCompCodeLast() {
		return systemCompCodeLast;
	}
	public void setSystemCompCodeLast(java.lang.String systemCompCodeLast) {
		this.systemCompCodeLast = systemCompCodeLast;
	}
	public java.lang.String getOriginalCodeLast() {
		return originalCodeLast;
	}
	public void setOriginalCodeLast(java.lang.String originalCodeLast) {
		this.originalCodeLast = originalCodeLast;
	}
	public java.lang.String getOriginalNameLast() {
		return originalNameLast;
	}
	public void setOriginalNameLast(java.lang.String originalNameLast) {
		this.originalNameLast = originalNameLast;
	}
	public java.lang.String getPartStandardCodeLast() {
		return partStandardCodeLast;
	}
	public void setPartStandardCodeLast(java.lang.String partStandardCodeLast) {
		this.partStandardCodeLast = partStandardCodeLast;
	}
	public java.lang.String getPartStandardLast() {
		return partStandardLast;
	}
	public void setPartStandardLast(java.lang.String partStandardLast) {
		this.partStandardLast = partStandardLast;
	}
	public java.lang.String getPartGroupCodeLast() {
		return partGroupCodeLast;
	}
	public void setPartGroupCodeLast(java.lang.String partGroupCodeLast) {
		this.partGroupCodeLast = partGroupCodeLast;
	}
	public java.lang.String getPartGroupNameLast() {
		return partGroupNameLast;
	}
	public void setPartGroupNameLast(java.lang.String partGroupNameLast) {
		this.partGroupNameLast = partGroupNameLast;
	}
	public java.lang.Integer getVeriQuantityLast() {
		return veriQuantityLast;
	}
	public void setVeriQuantityLast(java.lang.Integer veriQuantityLast) {
		this.veriQuantityLast = veriQuantityLast;
	}
	public java.lang.String getSelfConfigFlagLast() {
		return selfConfigFlagLast;
	}
	public void setSelfConfigFlagLast(java.lang.String selfConfigFlagLast) {
		this.selfConfigFlagLast = selfConfigFlagLast;
	}
	public java.lang.String getInstallEquipmentFlagLast() {
		return installEquipmentFlagLast;
	}
	public void setInstallEquipmentFlagLast(
			java.lang.String installEquipmentFlagLast) {
		this.installEquipmentFlagLast = installEquipmentFlagLast;
	}
	public java.lang.String getItemKindLast() {
		return itemKindLast;
	}
	public void setItemKindLast(java.lang.String itemKindLast) {
		this.itemKindLast = itemKindLast;
	}
	public java.lang.String getPriceSourceLast() {
		return priceSourceLast;
	}
	public void setPriceSourceLast(java.lang.String priceSourceLast) {
		this.priceSourceLast = priceSourceLast;
	}
	public java.lang.String getDetectFlagLast() {
		return detectFlagLast;
	}
	public void setDetectFlagLast(java.lang.String detectFlagLast) {
		this.detectFlagLast = detectFlagLast;
	}
	public java.lang.String getCurrencyLast() {
		return currencyLast;
	}
	public void setCurrencyLast(java.lang.String currencyLast) {
		this.currencyLast = currencyLast;
	}
	public java.math.BigDecimal getChgDisCountRateLast() {
		return chgDisCountRateLast;
	}
	public void setChgDisCountRateLast(java.math.BigDecimal chgDisCountRateLast) {
		this.chgDisCountRateLast = chgDisCountRateLast;
	}
	public java.lang.String getChgCompSetLast() {
		return chgCompSetLast;
	}
	public void setChgCompSetLast(java.lang.String chgCompSetLast) {
		this.chgCompSetLast = chgCompSetLast;
	}
	public java.math.BigDecimal getReFunitPriceLast() {
		return reFunitPriceLast;
	}
	public void setReFunitPriceLast(java.math.BigDecimal reFunitPriceLast) {
		this.reFunitPriceLast = reFunitPriceLast;
	}
	public java.lang.String getReFunitTypeLast() {
		return reFunitTypeLast;
	}
	public void setReFunitTypeLast(java.lang.String reFunitTypeLast) {
		this.reFunitTypeLast = reFunitTypeLast;
	}
	public java.lang.Integer getQuantityLast() {
		return quantityLast;
	}
	public void setQuantityLast(java.lang.Integer quantityLast) {
		this.quantityLast = quantityLast;
	}
	public java.math.BigDecimal getUnitPriceLast() {
		return unitPriceLast;
	}
	public void setUnitPriceLast(java.math.BigDecimal unitPriceLast) {
		this.unitPriceLast = unitPriceLast;
	}
	public java.math.BigDecimal getSumPriceLast() {
		return sumPriceLast;
	}
	public void setSumPriceLast(java.math.BigDecimal sumPriceLast) {
		this.sumPriceLast = sumPriceLast;
	}
	public java.math.BigDecimal getLossFeeLast() {
		return lossFeeLast;
	}
	public void setLossFeeLast(java.math.BigDecimal lossFeeLast) {
		this.lossFeeLast = lossFeeLast;
	}
	public java.math.BigDecimal getRemnantLast() {
		return remnantLast;
	}
	public void setRemnantLast(java.math.BigDecimal remnantLast) {
		this.remnantLast = remnantLast;
	}
	public java.lang.String getPriceAdjustFlagLast() {
		return priceAdjustFlagLast;
	}
	public void setPriceAdjustFlagLast(java.lang.String priceAdjustFlagLast) {
		this.priceAdjustFlagLast = priceAdjustFlagLast;
	}
	public java.math.BigDecimal getSelfRateLast() {
		return selfRateLast;
	}
	public void setSelfRateLast(java.math.BigDecimal selfRateLast) {
		this.selfRateLast = selfRateLast;
	}
	public java.math.BigDecimal getManHourLast() {
		return manHourLast;
	}
	public void setManHourLast(java.math.BigDecimal manHourLast) {
		this.manHourLast = manHourLast;
	}
	public java.math.BigDecimal getManHourUnitPriceLast() {
		return manHourUnitPriceLast;
	}
	public void setManHourUnitPriceLast(java.math.BigDecimal manHourUnitPriceLast) {
		this.manHourUnitPriceLast = manHourUnitPriceLast;
	}
	public java.math.BigDecimal getManHourFeeLast() {
		return manHourFeeLast;
	}
	public void setManHourFeeLast(java.math.BigDecimal manHourFeeLast) {
		this.manHourFeeLast = manHourFeeLast;
	}
	public java.lang.Integer getMaterialQuantityLast() {
		return materialQuantityLast;
	}
	public void setMaterialQuantityLast(java.lang.Integer materialQuantityLast) {
		this.materialQuantityLast = materialQuantityLast;
	}
	public java.math.BigDecimal getMaterialUnitPriceLast() {
		return materialUnitPriceLast;
	}
	public void setMaterialUnitPriceLast(java.math.BigDecimal materialUnitPriceLast) {
		this.materialUnitPriceLast = materialUnitPriceLast;
	}
	public java.math.BigDecimal getMaterialFeeLast() {
		return materialFeeLast;
	}
	public void setMaterialFeeLast(java.math.BigDecimal materialFeeLast) {
		this.materialFeeLast = materialFeeLast;
	}
	public java.math.BigDecimal getSumDefLossLast() {
		return sumDefLossLast;
	}
	public void setSumDefLossLast(java.math.BigDecimal sumDefLossLast) {
		this.sumDefLossLast = sumDefLossLast;
	}
	public java.math.BigDecimal getQuoPriceLast() {
		return quoPriceLast;
	}
	public void setQuoPriceLast(java.math.BigDecimal quoPriceLast) {
		this.quoPriceLast = quoPriceLast;
	}
	public java.math.BigDecimal getSprayPaintPriceLast() {
		return sprayPaintPriceLast;
	}
	public void setSprayPaintPriceLast(java.math.BigDecimal sprayPaintPriceLast) {
		this.sprayPaintPriceLast = sprayPaintPriceLast;
	}
	public java.math.BigDecimal getDismantlePriceLast() {
		return dismantlePriceLast;
	}
	public void setDismantlePriceLast(java.math.BigDecimal dismantlePriceLast) {
		this.dismantlePriceLast = dismantlePriceLast;
	}
	public java.lang.String getSanctionerLast() {
		return sanctionerLast;
	}
	public void setSanctionerLast(java.lang.String sanctionerLast) {
		this.sanctionerLast = sanctionerLast;
	}
	public java.lang.String getApproverCodeLast() {
		return approverCodeLast;
	}
	public void setApproverCodeLast(java.lang.String approverCodeLast) {
		this.approverCodeLast = approverCodeLast;
	}
	public java.lang.String getOperatorCodeLast() {
		return operatorCodeLast;
	}
	public void setOperatorCodeLast(java.lang.String operatorCodeLast) {
		this.operatorCodeLast = operatorCodeLast;
	}
	public java.lang.String getLossApprovalRemarkLast() {
		return lossApprovalRemarkLast;
	}
	public void setLossApprovalRemarkLast(java.lang.String lossApprovalRemarkLast) {
		this.lossApprovalRemarkLast = lossApprovalRemarkLast;
	}
	public java.lang.String getRecycleFlagLast() {
		return recycleFlagLast;
	}
	public void setRecycleFlagLast(java.lang.String recycleFlagLast) {
		this.recycleFlagLast = recycleFlagLast;
	}
	public java.lang.String getRecycleTypeLast() {
		return recycleTypeLast;
	}
	public void setRecycleTypeLast(java.lang.String recycleTypeLast) {
		this.recycleTypeLast = recycleTypeLast;
	}
	public java.lang.String getAccessoryCheckFlagLast() {
		return accessoryCheckFlagLast;
	}
	public void setAccessoryCheckFlagLast(java.lang.String accessoryCheckFlagLast) {
		this.accessoryCheckFlagLast = accessoryCheckFlagLast;
	}
	public java.lang.String getAccessoryPositionLast() {
		return accessoryPositionLast;
	}
	public void setAccessoryPositionLast(java.lang.String accessoryPositionLast) {
		this.accessoryPositionLast = accessoryPositionLast;
	}
	public java.lang.String getAccessoryCheckItemLast() {
		return accessoryCheckItemLast;
	}
	public void setAccessoryCheckItemLast(java.lang.String accessoryCheckItemLast) {
		this.accessoryCheckItemLast = accessoryCheckItemLast;
	}
	public java.math.BigDecimal getAccessoryCheckPriceLast() {
		return accessoryCheckPriceLast;
	}
	public void setAccessoryCheckPriceLast(
			java.math.BigDecimal accessoryCheckPriceLast) {
		this.accessoryCheckPriceLast = accessoryCheckPriceLast;
	}
	public java.lang.String getAccessoryCheckRemarkLast() {
		return accessoryCheckRemarkLast;
	}
	public void setAccessoryCheckRemarkLast(
			java.lang.String accessoryCheckRemarkLast) {
		this.accessoryCheckRemarkLast = accessoryCheckRemarkLast;
	}
	public java.lang.String getOperateStatusLast() {
		return operateStatusLast;
	}
	public void setOperateStatusLast(java.lang.String operateStatusLast) {
		this.operateStatusLast = operateStatusLast;
	}
	public java.lang.String getVeriCompSetLast() {
		return veriCompSetLast;
	}
	public void setVeriCompSetLast(java.lang.String veriCompSetLast) {
		this.veriCompSetLast = veriCompSetLast;
	}
	public java.lang.String getVeriItemKindLast() {
		return veriItemKindLast;
	}
	public void setVeriItemKindLast(java.lang.String veriItemKindLast) {
		this.veriItemKindLast = veriItemKindLast;
	}
	public java.lang.String getVeriPriceSourceLast() {
		return veriPriceSourceLast;
	}
	public void setVeriPriceSourceLast(java.lang.String veriPriceSourceLast) {
		this.veriPriceSourceLast = veriPriceSourceLast;
	}
	public java.math.BigDecimal getVeriRefUnitPriceLast() {
		return veriRefUnitPriceLast;
	}
	public void setVeriRefUnitPriceLast(java.math.BigDecimal veriRefUnitPriceLast) {
		this.veriRefUnitPriceLast = veriRefUnitPriceLast;
	}
	public java.math.BigDecimal getVeriUnitPriceLast() {
		return veriUnitPriceLast;
	}
	public void setVeriUnitPriceLast(java.math.BigDecimal veriUnitPriceLast) {
		this.veriUnitPriceLast = veriUnitPriceLast;
	}
	public java.math.BigDecimal getVeriSumPriceLast() {
		return veriSumPriceLast;
	}
	public void setVeriSumPriceLast(java.math.BigDecimal veriSumPriceLast) {
		this.veriSumPriceLast = veriSumPriceLast;
	}
	public java.lang.String getVeriPriAdjustFlagLast() {
		return veriPriAdjustFlagLast;
	}
	public void setVeriPriAdjustFlagLast(java.lang.String veriPriAdjustFlagLast) {
		this.veriPriAdjustFlagLast = veriPriAdjustFlagLast;
	}
	public java.math.BigDecimal getVeriSelfRateLast() {
		return veriSelfRateLast;
	}
	public void setVeriSelfRateLast(java.math.BigDecimal veriSelfRateLast) {
		this.veriSelfRateLast = veriSelfRateLast;
	}
	public java.math.BigDecimal getVeriManHourLast() {
		return veriManHourLast;
	}
	public void setVeriManHourLast(java.math.BigDecimal veriManHourLast) {
		this.veriManHourLast = veriManHourLast;
	}
	public java.math.BigDecimal getVeriManUnitPriceLast() {
		return veriManUnitPriceLast;
	}
	public void setVeriManUnitPriceLast(java.math.BigDecimal veriManUnitPriceLast) {
		this.veriManUnitPriceLast = veriManUnitPriceLast;
	}
	public java.math.BigDecimal getVeriManHourFeeLast() {
		return veriManHourFeeLast;
	}
	public void setVeriManHourFeeLast(java.math.BigDecimal veriManHourFeeLast) {
		this.veriManHourFeeLast = veriManHourFeeLast;
	}
	public java.lang.Integer getVeriMaterQuantityLast() {
		return veriMaterQuantityLast;
	}
	public void setVeriMaterQuantityLast(java.lang.Integer veriMaterQuantityLast) {
		this.veriMaterQuantityLast = veriMaterQuantityLast;
	}
	public java.math.BigDecimal getVeriMaterUnitPriceLast() {
		return veriMaterUnitPriceLast;
	}
	public void setVeriMaterUnitPriceLast(
			java.math.BigDecimal veriMaterUnitPriceLast) {
		this.veriMaterUnitPriceLast = veriMaterUnitPriceLast;
	}
	public java.math.BigDecimal getVeriMaterialFeeLast() {
		return veriMaterialFeeLast;
	}
	public void setVeriMaterialFeeLast(java.math.BigDecimal veriMaterialFeeLast) {
		this.veriMaterialFeeLast = veriMaterialFeeLast;
	}
	public java.math.BigDecimal getSumVeriLossLast() {
		return sumVeriLossLast;
	}
	public void setSumVeriLossLast(java.math.BigDecimal sumVeriLossLast) {
		this.sumVeriLossLast = sumVeriLossLast;
	}
	public java.math.BigDecimal getVeriRemnantLast() {
		return veriRemnantLast;
	}
	public void setVeriRemnantLast(java.math.BigDecimal veriRemnantLast) {
		this.veriRemnantLast = veriRemnantLast;
	}
	public java.lang.String getVeriRecycleTypeLast() {
		return veriRecycleTypeLast;
	}
	public void setVeriRecycleTypeLast(java.lang.String veriRecycleTypeLast) {
		this.veriRecycleTypeLast = veriRecycleTypeLast;
	}
	public java.lang.String getVeriRepairCheckFlagLast() {
		return veriRepairCheckFlagLast;
	}
	public void setVeriRepairCheckFlagLast(java.lang.String veriRepairCheckFlagLast) {
		this.veriRepairCheckFlagLast = veriRepairCheckFlagLast;
	}
	public java.lang.String getVeriCausationLast() {
		return veriCausationLast;
	}
	public void setVeriCausationLast(java.lang.String veriCausationLast) {
		this.veriCausationLast = veriCausationLast;
	}
	public java.lang.String getVeriRemarkLast() {
		return veriRemarkLast;
	}
	public void setVeriRemarkLast(java.lang.String veriRemarkLast) {
		this.veriRemarkLast = veriRemarkLast;
	}
	public java.math.BigDecimal getSumRejectLast() {
		return sumRejectLast;
	}
	public void setSumRejectLast(java.math.BigDecimal sumRejectLast) {
		this.sumRejectLast = sumRejectLast;
	}
	public java.lang.String getRejectReasonLast() {
		return rejectReasonLast;
	}
	public void setRejectReasonLast(java.lang.String rejectReasonLast) {
		this.rejectReasonLast = rejectReasonLast;
	}
	public java.lang.String getVeripCompSetLast() {
		return veripCompSetLast;
	}
	public void setVeripCompSetLast(java.lang.String veripCompSetLast) {
		this.veripCompSetLast = veripCompSetLast;
	}
	public java.lang.String getVeripItemKindLast() {
		return veripItemKindLast;
	}
	public void setVeripItemKindLast(java.lang.String veripItemKindLast) {
		this.veripItemKindLast = veripItemKindLast;
	}
	public java.lang.String getVeripSourceLast() {
		return veripSourceLast;
	}
	public void setVeripSourceLast(java.lang.String veripSourceLast) {
		this.veripSourceLast = veripSourceLast;
	}
	public java.lang.Integer getVeripQuantityLast() {
		return veripQuantityLast;
	}
	public void setVeripQuantityLast(java.lang.Integer veripQuantityLast) {
		this.veripQuantityLast = veripQuantityLast;
	}
	public java.math.BigDecimal getVeripRefUnitVeripLast() {
		return veripRefUnitVeripLast;
	}
	public void setVeripRefUnitVeripLast(java.math.BigDecimal veripRefUnitVeripLast) {
		this.veripRefUnitVeripLast = veripRefUnitVeripLast;
	}
	public java.math.BigDecimal getVeripUnitVeripLast() {
		return veripUnitVeripLast;
	}
	public void setVeripUnitVeripLast(java.math.BigDecimal veripUnitVeripLast) {
		this.veripUnitVeripLast = veripUnitVeripLast;
	}
	public java.math.BigDecimal getVeripUnitRemnentLast() {
		return veripUnitRemnentLast;
	}
	public void setVeripUnitRemnentLast(java.math.BigDecimal veripUnitRemnentLast) {
		this.veripUnitRemnentLast = veripUnitRemnentLast;
	}
	public java.math.BigDecimal getVeripSumVeripLast() {
		return veripSumVeripLast;
	}
	public void setVeripSumVeripLast(java.math.BigDecimal veripSumVeripLast) {
		this.veripSumVeripLast = veripSumVeripLast;
	}
	public java.lang.String getVeripAdjustFlagLast() {
		return veripAdjustFlagLast;
	}
	public void setVeripAdjustFlagLast(java.lang.String veripAdjustFlagLast) {
		this.veripAdjustFlagLast = veripAdjustFlagLast;
	}
	public java.math.BigDecimal getVeripSelfRateLast() {
		return veripSelfRateLast;
	}
	public void setVeripSelfRateLast(java.math.BigDecimal veripSelfRateLast) {
		this.veripSelfRateLast = veripSelfRateLast;
	}
	public java.math.BigDecimal getVeripManHourLast() {
		return veripManHourLast;
	}
	public void setVeripManHourLast(java.math.BigDecimal veripManHourLast) {
		this.veripManHourLast = veripManHourLast;
	}
	public java.math.BigDecimal getVeripManUnitVeripLast() {
		return veripManUnitVeripLast;
	}
	public void setVeripManUnitVeripLast(java.math.BigDecimal veripManUnitVeripLast) {
		this.veripManUnitVeripLast = veripManUnitVeripLast;
	}
	public java.math.BigDecimal getVeripManHourFeeLast() {
		return veripManHourFeeLast;
	}
	public void setVeripManHourFeeLast(java.math.BigDecimal veripManHourFeeLast) {
		this.veripManHourFeeLast = veripManHourFeeLast;
	}
	public java.lang.String getHitLevelCodeLast() {
		return hitLevelCodeLast;
	}
	public void setHitLevelCodeLast(java.lang.String hitLevelCodeLast) {
		this.hitLevelCodeLast = hitLevelCodeLast;
	}
	public java.lang.String getHitLevelNameLast() {
		return hitLevelNameLast;
	}
	public void setHitLevelNameLast(java.lang.String hitLevelNameLast) {
		this.hitLevelNameLast = hitLevelNameLast;
	}
	public java.util.Date getInputTimeLast() {
		return inputTimeLast;
	}
	public void setInputTimeLast(java.util.Date inputTimeLast) {
		this.inputTimeLast = inputTimeLast;
	}
	public java.lang.String getAccessoryPositionNameLast() {
		return accessoryPositionNameLast;
	}
	public void setAccessoryPositionNameLast(
			java.lang.String accessoryPositionNameLast) {
		this.accessoryPositionNameLast = accessoryPositionNameLast;
	}
	public String getLossApprovalKindNameLast() {
		return lossApprovalKindNameLast;
	}
	public void setLossApprovalKindNameLast(String lossApprovalKindNameLast) {
		this.lossApprovalKindNameLast = lossApprovalKindNameLast;
	}
	public String getLossApprovalKindNameTempLast() {
		return lossApprovalKindNameTempLast;
	}
	public void setLossApprovalKindNameTempLast(String lossApprovalKindNameTempLast) {
		this.lossApprovalKindNameTempLast = lossApprovalKindNameTempLast;
	}
	public java.lang.String getIsNewData() {
		return isNewData;
	}
	public void setIsNewData(java.lang.String isNewData) {
		this.isNewData = isNewData;
	}
	public String getLossApprovalKindCode() {
		return lossApprovalKindCode;
	}
	public void setLossApprovalKindCode(String lossApprovalKindCode) {
		this.lossApprovalKindCode = lossApprovalKindCode;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public java.lang.String getPriceSourceName() {
		return priceSourceName;
	}
	public void setPriceSourceName(java.lang.String priceSourceName) {
		this.priceSourceName = priceSourceName;
	}
	public java.lang.String getChgCompSetName() {
		return chgCompSetName;
	}
	public void setChgCompSetName(java.lang.String chgCompSetName) {
		this.chgCompSetName = chgCompSetName;
	}
	public java.math.BigDecimal getOtherVeriSumPrice() {
		return otherVeriSumPrice;
	}
	public void setOtherVeriSumPrice(java.math.BigDecimal otherVeriSumPrice) {
		this.otherVeriSumPrice = otherVeriSumPrice;
	}
	public String getOtherLossApprovalKindNameTemp() {
		return otherLossApprovalKindNameTemp;
	}
	public void setOtherLossApprovalKindNameTemp(
			String otherLossApprovalKindNameTemp) {
		this.otherLossApprovalKindNameTemp = otherLossApprovalKindNameTemp;
	}
	public String getOtherLossApprovalKindCode() {
		return otherLossApprovalKindCode;
	}
	public void setOtherLossApprovalKindCode(String otherLossApprovalKindCode) {
		this.otherLossApprovalKindCode = otherLossApprovalKindCode;
	}
	public String getOtherLossApprovalKindName() {
		return otherLossApprovalKindName;
	}
	public void setOtherLossApprovalKindName(String otherLossApprovalKindName) {
		this.otherLossApprovalKindName = otherLossApprovalKindName;
	}
	public String getOtherPolicyNo() {
		return otherPolicyNo;
	}
	public void setOtherPolicyNo(String otherPolicyNo) {
		this.otherPolicyNo = otherPolicyNo;
	}
	public String getLossApprovalKindCodeLast() {
		return lossApprovalKindCodeLast;
	}
	public void setLossApprovalKindCodeLast(String lossApprovalKindCodeLast) {
		this.lossApprovalKindCodeLast = lossApprovalKindCodeLast;
	}
	@Override
	public int compareTo(PrpLcarComponentPage o) {
		if(null == this.getUnitPrice()){
			this.setUnitPrice(new BigDecimal(0));
		}
		if(null == o.getUnitPrice()){
			o.setUnitPrice(new BigDecimal(0));
		}
		return o.getUnitPrice().compareTo(this.getUnitPrice());
	}
	
}
