/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.dictionary.entity.DicContent
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
 * 测评-题库-教材目录实体
 * 
 * @author zhangjingsi
 * @date 2017-06-21 13:26:22
 */
public class DicContent implements Serializable {

    private Long contentID;//目录ID
    private String contentName;//目录名称
    private Integer textbookEdition;//教材版本
    private Long contentPID;//父目录ID
    private Integer phaseID;//所属学段
    private Integer subjectID;//所属学科
    private Integer sort;//排序号
    private Integer level;//目录级别
    private Integer isLeaf;//是否是叶子节点，0不是，1是
    private String creator;//创建人
    private Date createDate;//创建时间
    private String modifier;//修改人
    private Date modifyDate;//修改时间
    private Integer isEffective;//是否有效(1、有效，0、无效)

	private Integer gradeID;//年级ID

	public void setContentID(Long contentID) {
		this.contentID = contentID;
	}
	public Long getContentID() {
		return this.contentID;
	}
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}
	public String getContentName() {
		return this.contentName;
	}
	public void setTextbookEdition(Integer textbookEdition) {
		this.textbookEdition = textbookEdition;
	}
	public Integer getTextbookEdition() {
		return this.textbookEdition;
	}
	public void setContentPID(Long contentPID) {
		this.contentPID = contentPID;
	}
	public Long getContentPID() {
		return this.contentPID;
	}
	public void setPhaseID(Integer phaseID) {
		this.phaseID = phaseID;
	}
	public Integer getPhaseID() {
		return this.phaseID;
	}
	public void setSubjectID(Integer subjectID) {
		this.subjectID = subjectID;
	}
	public Integer getSubjectID() {
		return this.subjectID;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getSort() {
		return this.sort;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getLevel() {
		return this.level;
	}
	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf = isLeaf;
	}
	public Integer getIsLeaf() {
		return this.isLeaf;
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

	public Integer getGradeID() {
		return gradeID;
	}

	public void setGradeID(Integer gradeID) {
		this.gradeID = gradeID;
	}
}

