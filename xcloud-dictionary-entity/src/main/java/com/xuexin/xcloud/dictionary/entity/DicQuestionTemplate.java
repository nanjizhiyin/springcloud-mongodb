/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.dictionary.entity.DicQuestionTemplate
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
 * 试题模板表 原cp_template实体
 * 
 * @author zhangjingsi
 * @date 2017-06-21 13:26:25
 */
public class DicQuestionTemplate implements Serializable {

    private Integer templateID;//模板id
    private String templateName;//模板名称
    private Integer objectiveStem;//0：客观题    1：主观题
    private Integer multiSub;//0:不含小题  1:多小题不含三级标题  2:多小题含三级标题
    private Integer analyzeQue;//0:不解析题干   1:解析题干
    private String creator;//创建人
    private Date createDate;//创建时间
    private String modifier;//修改人
    private Date modifyDate;//修改时间
    private Integer isEffective;//是否有效

	public void setTemplateID(Integer templateID) {
		this.templateID = templateID;
	}
	public Integer getTemplateID() {
		return this.templateID;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateName() {
		return this.templateName;
	}
	public void setObjectiveStem(Integer objectiveStem) {
		this.objectiveStem = objectiveStem;
	}
	public Integer getObjectiveStem() {
		return this.objectiveStem;
	}
	public void setMultiSub(Integer multiSub) {
		this.multiSub = multiSub;
	}
	public Integer getMultiSub() {
		return this.multiSub;
	}
	public void setAnalyzeQue(Integer analyzeQue) {
		this.analyzeQue = analyzeQue;
	}
	public Integer getAnalyzeQue() {
		return this.analyzeQue;
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

