/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.dictionary.entity.DicQuestionType
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
 * 测评-题库-题型 对应cp_type实体
 * 
 * @author zhangjingsi
 * @date 2017-06-21 13:26:25
 */
public class DicQuestionType implements Serializable {

    private Integer typeID;//题型ID
    private String typeName;//题型名称
    private Integer templateID;//word模板类型
    private Integer optionCount;//选项个数
    private Integer sort;//排序号
    private String creator;//创建人
    private Date createDate;//创建时间
    private String modifier;//修改人
    private Date modifyDate;//修改时间
    private Integer isEffective;//是否有效(1、有效，0、无效)

	private Integer phaseID; //学段ID
	private Integer subjectID;//学科ID
	private String subjectName;//学科Name
	private String phaseName;//学段Name
	private Integer objectiveStem;//0：客观题    1：主观题
	private String templateName;//模板名称

	public void setTypeID(Integer typeID) {
		this.typeID = typeID;
	}
	public Integer getTypeID() {
		return this.typeID;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getTypeName() {
		return this.typeName;
	}
	public Integer getTemplateID() {
		return templateID;
	}
	public void setTemplateID(Integer templateID) {
		this.templateID = templateID;
	}
	public void setOptionCount(Integer optionCount) {
		this.optionCount = optionCount;
	}
	public Integer getOptionCount() {
		return this.optionCount;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getSort() {
		return this.sort;
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

	public Integer getPhaseID() {
		return phaseID;
	}

	public void setPhaseID(Integer phaseID) {
		this.phaseID = phaseID;
	}

	public Integer getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(Integer subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getPhaseName() {
		return phaseName;
	}

	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}

	public Integer getObjectiveStem() {
		return objectiveStem;
	}

	public void setObjectiveStem(Integer objectiveStem) {
		this.objectiveStem = objectiveStem;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
}

