package cn.sinosoft.claim.base.entity.rulerisk;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "prplautoundwrtruleinfo", schema = "")
@SuppressWarnings("serial")
public class PrplAutoUndwrtRuleInfoEntity implements java.io.Serializable{
	
	/**id*/
	private PrplAutoUndwrtRuleInfoEntityId id;
	/**规则编号*/
	private java.lang.String ruleId;
	/**规则提示信息*/
	private java.lang.String description;
	/**规则种类*/
	private java.lang.String ruleStatus;
	/**所属规则集名称*/
	private java.lang.String rulesetName;
	/**规则所属风险级别*/
	private java.lang.String ruleRiskLevel;
	/**所属规则类别*/
	private java.lang.String ruleType;
	/**附加参数*/
	private java.lang.String argument;
	/**标志*/
	private java.lang.String flag;
	/**简单评价内容*/
	private java.lang.String evaluateContent;
	/**评价人*/
	private java.lang.String evaluateCode;
	
	
	@EmbeddedId
	@AttributeOverrides( {
		@AttributeOverride(name = "serialNo", column = @Column(name = "SERIALNO")),
		@AttributeOverride(name = "accidentNo", column = @Column(name = "ACCIDENTNO")),
		@AttributeOverride(name = "nodeType", column = @Column(name = "NODETYPE")),
		@AttributeOverride(name = "nodeNo", column = @Column(name = "NODENO")) })
	public PrplAutoUndwrtRuleInfoEntityId getId() {
		return id;
	}

	public void setId(PrplAutoUndwrtRuleInfoEntityId id) {
		this.id = id;
	}

	@Column(name ="RULEID",nullable=false,length=32)
	public java.lang.String getRuleId() {
		return ruleId;
	}
	
	public void setRuleId(java.lang.String ruleId) {
		this.ruleId = ruleId;
	}
	
	@Column(name ="DESCRIPTION",nullable=false,length=200)
	public java.lang.String getDescription() {
		return description;
	}
	
	public void setDescription(java.lang.String description) {
		this.description = description;
	}
	
	@Column(name ="RULESTATUS",nullable=false,length=5)
	public java.lang.String getRuleStatus() {
		return ruleStatus;
	}
	
	public void setRuleStatus(java.lang.String ruleStatus) {
		this.ruleStatus = ruleStatus;
	}
	
	@Column(name ="RULESETNAME",nullable=false,length=100)
	public java.lang.String getRulesetName() {
		return rulesetName;
	}
	
	public void setRulesetName(java.lang.String rulesetName) {
		this.rulesetName = rulesetName;
	}
	
	@Column(name ="RULERISKLEVEL",nullable=false,length=1)
	public java.lang.String getRuleRiskLevel() {
		return ruleRiskLevel;
	}
	
	public void setRuleRiskLevel(java.lang.String ruleRiskLevel) {
		this.ruleRiskLevel = ruleRiskLevel;
	}
	
	@Column(name ="RULETYPE",nullable=false,length=2)
	public java.lang.String getRuleType() {
		return ruleType;
	}
	
	public void setRuleType(java.lang.String ruleType) {
		this.ruleType = ruleType;
	}
	
	@Column(name ="ARGUMENT",nullable=false,length=22)
	public java.lang.String getArgument() {
		return argument;
	}
	
	public void setArgument(java.lang.String argument) {
		this.argument = argument;
	}
	
	@Column(name ="FLAG",nullable=false,length=1)
	public java.lang.String getFlag() {
		return flag;
	}
	
	public void setFlag(java.lang.String flag) {
		this.flag = flag;
	}
	
	@Column(name ="EVALUATECONTENT",nullable=false,length=255)
	public java.lang.String getEvaluateContent() {
		return evaluateContent;
	}
	
	public void setEvaluateContent(java.lang.String evaluateContent) {
		this.evaluateContent = evaluateContent;
	}
	
	@Column(name ="EVALUATECODE",nullable=false,length=12)
	public java.lang.String getEvaluateCode() {
		return evaluateCode;
	}
	
	public void setEvaluateCode(java.lang.String evaluateCode) {
		this.evaluateCode = evaluateCode;
	}
}
