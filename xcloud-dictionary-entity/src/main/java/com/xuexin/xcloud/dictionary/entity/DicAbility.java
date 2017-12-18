/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.dictionary.entity.DicAbility
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
 * 能力类型表实体
 * 
 * @author zhangjingsi
 * @date 2017-06-21 13:26:20
 */
public class DicAbility implements Serializable {

	private Long abilityID;//能力id
	private String abilityName;//能力点名称
    private String modifier;//修改人
    private Date modifyDate;//修改时间
    private String creator;//创建人
    private Date createDate;//创建时间
    private Integer isEffective;//是否有效

	public void setAbilityID(Long abilityID) {
		this.abilityID = abilityID;
	}

	public Long getAbilityID() {
		return this.abilityID;
	}
	public void setAbilityName(String abilityName) {
		this.abilityName = abilityName;
	}
	public String getAbilityName() {
		return this.abilityName;
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
	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}
	public Integer getIsEffective() {
		return this.isEffective;
	}
}

