package cn.sinosoft.claim.base.entity.rulerisk;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@SuppressWarnings("serial")
public class PrplAutoUndwrtRuleInfoEntityId implements java.io.Serializable{
	/**序号*/
	private java.lang.String serialNo;
	/**事故号*/	
	private java.lang.String accidentNo;
	/**业务标志类型*/
	private java.lang.String nodeType;
	/**当前节点号*/
	private java.lang.String nodeNo;
	@Column(name ="SERIALNO",nullable=false,length=22)
	public java.lang.String getSerialNo() {
		return serialNo;
	}
	
	public void setSerialNo(java.lang.String serialNo) {
		this.serialNo = serialNo;
	}
	
	@Column(name ="ACCIDENTNO",nullable=false,length=22)
	public java.lang.String getAccidentNo() {
		return accidentNo;
	}
	
	public void setAccidentNo(java.lang.String accidentNo) {
		this.accidentNo = accidentNo;
	}
	
	@Column(name ="NODETYPE",nullable=false,length=30)
	public java.lang.String getNodeType() {
		return nodeType;
	}
	
	public void setNodeType(java.lang.String nodeType) {
		this.nodeType = nodeType;
	}
	
	@Column(name ="NODENO",nullable=false,length=22)
	public java.lang.String getNodeNo() {
		return nodeNo;
	}
	public void setNodeNo(java.lang.String nodeNo) {
		this.nodeNo = nodeNo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accidentNo == null) ? 0 : accidentNo.hashCode());
		result = prime * result + ((nodeNo == null) ? 0 : nodeNo.hashCode());
		result = prime * result
				+ ((nodeType == null) ? 0 : nodeType.hashCode());
		result = prime * result
				+ ((serialNo == null) ? 0 : serialNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrplAutoUndwrtRuleInfoEntityId other = (PrplAutoUndwrtRuleInfoEntityId) obj;
		if (accidentNo == null) {
			if (other.accidentNo != null)
				return false;
		} else if (!accidentNo.equals(other.accidentNo))
			return false;
		if (nodeNo == null) {
			if (other.nodeNo != null)
				return false;
		} else if (!nodeNo.equals(other.nodeNo))
			return false;
		if (nodeType == null) {
			if (other.nodeType != null)
				return false;
		} else if (!nodeType.equals(other.nodeType))
			return false;
		if (serialNo == null) {
			if (other.serialNo != null)
				return false;
		} else if (!serialNo.equals(other.serialNo))
			return false;
		return true;
	}
	
}
