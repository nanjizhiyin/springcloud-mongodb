/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.dictionary.entity.DicPaperType
 * @version v1.0.0 
 * @author zhangjingsi
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017-06-21      zhangjingsi      v1.0.0      create
 *
 */
package com.xuexin.xcloud.dictionary.entity;

import java.io.Serializable;
import java.util.Date;



/** 
 * 试卷类型实体
 * 
 * @author zhangjingsi
 * @date 2017-06-21 13:26:24
 */
public class DicPaperType implements Serializable {

    private Integer typeID;//试卷类型ID
    private Integer phaseID;//学段ID
    private Object typeName;//试卷类型名称
    private Object creator;//创建人
    private Date createDate;//创建时间
    private String modifier;//修改人
    private Date modifyDate;//修改时间
    private Integer isEffective;//是否有效
	private String phaseName;//学段名称

	public String getPhaseName() {
		return phaseName;
	}
	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}
	public void setTypeID(Integer typeID) {
		this.typeID = typeID;
	}
	public Integer getTypeID() {
		return this.typeID;
	}
	public void setPhaseID(Integer phaseID) {
		this.phaseID = phaseID;
	}
	public Integer getPhaseID() {
		return this.phaseID;
	}
	public void setTypeName(Object typeName) {
		this.typeName = typeName;
	}
	public Object getTypeName() {
		return this.typeName;
	}
	public void setCreator(Object creator) {
		this.creator = creator;
	}
	public Object getCreator() {
		return this.creator;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getCreateDate() {
		return this.createDate;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public String getModifier() {
		return this.modifier;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public Date getModifyDate() {
		return this.modifyDate;
	}
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	public Integer getIsEffective() {
		return this.isEffective;
	}
}

