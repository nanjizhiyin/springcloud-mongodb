/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.dictionary.entity.DicRSubjectQuestion
 * @version v1.0.0 
 * @author zhangjingsi
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017-06-23      zhangjingsi      v1.0.0      create
 *
 */
package com.xuexin.xcloud.dictionary.entity;

import java.io.Serializable;
import java.util.Date;



/** 
 * 学科题型关系实体
 * 
 * @author zhangjingsi
 * @date 2017-06-23 13:41:28
 */
public class DicRSubjectQuestion implements Serializable {

    private Integer typeID;//题型ID
    private Integer subjectID;//学科ID
    private String creator;//创建人
    private Date createDate;//创建时间
    private Integer isEffective;//是否有效(1:有效，0:无效)

	public void setTypeID(Integer typeID) {
		this.typeID = typeID;
	}
	public Integer getTypeID() {
		return this.typeID;
	}
	public void setSubjectID(Integer subjectID) {
		this.subjectID = subjectID;
	}
	public Integer getSubjectID() {
		return this.subjectID;
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

