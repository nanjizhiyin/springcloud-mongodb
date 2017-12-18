/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.dictionary.entity.DicItemBankRegion
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
 * 测评和题库中试卷和试题覆盖的地区 只到省一级实体
 * 
 * @author zhangjingsi
 * @date 2017-06-21 13:26:23
 */
public class DicItemBankRegion implements Serializable {

    private String regionCode;//地区编码
	private String regionName;//地区名称
	private Integer regionLevel;//地区级别
	private String parentCode;//低级地区编码
	private String creator;//创建人
	private Date createDate;//创建时间
    private Integer isEffective;//是否有效


	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getRegionCode() {
		return this.regionCode;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRegionName() {
		return this.regionName;
	}
	public void setRegionLevel(Integer regionLevel) {
		this.regionLevel = regionLevel;
	}
	public Integer getRegionLevel() {
		return this.regionLevel;
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

