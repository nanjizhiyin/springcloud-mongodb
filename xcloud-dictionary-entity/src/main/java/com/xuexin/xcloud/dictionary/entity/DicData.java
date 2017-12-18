/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.dictionary.entity.DicData
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
 * 包含学段、文理性、综合性、教材版本、难易度、文件用途、试卷归属、试卷类型实体
 * 
 * @author zhangjingsi
 * @date 2017-06-21 13:26:22
 */
public class DicData implements Serializable {

    private Integer id;//目录ID
    private Integer catalogID;//目录ID
    private Integer dataID;//字典ID
    private String dataValue;//字典值
    private String creator;//创建人
    private Date createDate;//创建时间
    private String modifier;//修改人
    private Date modifyDate;//修改时间
    private Integer isEffective;//是否有效

	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}
	public void setCatalogID(Integer catalogID) {
		this.catalogID = catalogID;
	}
	public Integer getCatalogID() {
		return this.catalogID;
	}
	public void setDataID(Integer dataID) {
		this.dataID = dataID;
	}
	public Integer getDataID() {
		return this.dataID;
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}
	public String getDataValue() {
		return this.dataValue;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreator() {
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

