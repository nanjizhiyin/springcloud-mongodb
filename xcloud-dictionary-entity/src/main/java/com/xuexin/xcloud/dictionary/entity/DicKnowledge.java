/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.dictionary.entity.DicKnowledge
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
 * 测评-题库-知识点实体
 * 
 * @author zhangjingsi
 * @date 2017-06-21 13:26:24
 */
public class DicKnowledge implements Serializable {

	public static final int ISLEAF_YES = 1;//叶子节点
	public static final int ISLEAF_NO = 0;//非叶子节点

    private Long knowledgeID;//知识点ID
    private String knowledgeName;//知识点名称
    private Long knowledgePID;//父知识点
    private Integer subjectID;//所属学科ID
    private Integer phaseID;//所属学段ID
    private Integer sort;//排序号
    private Integer isLeaf;//是否是叶子节点，0不是，1是
    private String creator;//创建人
    private Date createDate;//创建时间
    private String modifier;//修改人
    private Date modifyDate;//修改时间
    private Integer isEffective;//是否有效(1、有效，0、无效)

	public void setKnowledgeID(Long knowledgeID) {
		this.knowledgeID = knowledgeID;
	}
	public Long getKnowledgeID() {
		return this.knowledgeID;
	}
	public void setKnowledgeName(String knowledgeName) {
		this.knowledgeName = knowledgeName;
	}
	public String getKnowledgeName() {
		return this.knowledgeName;
	}
	public void setKnowledgePID(Long knowledgePID) {
		this.knowledgePID = knowledgePID;
	}
	public Long getKnowledgePID() {
		return this.knowledgePID;
	}
	public void setSubjectID(Integer subjectID) {
		this.subjectID = subjectID;
	}
	public Integer getSubjectID() {
		return this.subjectID;
	}
	public void setPhaseID(Integer phaseID) {
		this.phaseID = phaseID;
	}
	public Integer getPhaseID() {
		return this.phaseID;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getSort() {
		return this.sort;
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
}

