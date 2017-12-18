/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.dictionary.entity.DicPaperDifficulty
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
 * 试卷难度实体
 * 
 * @author zhangjingsi
 * @date 2017-06-21 13:26:24
 */
public class DicPaperDifficulty implements Serializable {

    private Integer diffID;//id
    private Integer phase;//学段
    private Integer grade;//年级
    private Integer subject;//学科
    private Integer scaleLevel5;//困难占比
    private Integer scaleLevel4;//较难占比
    private Integer scaleLevel3;//中等占比
    private Integer scaleLevel2;//较易占比
    private Integer scaleLevel1;//容易占比
    private String creator;//创建人
    private Date createDate;//创建时间
    private String modifier;//修改人
    private Date modifyDate;//修改时间
    private Integer isEffective;//是否有效

	public void setDiffID(Integer diffID) {
		this.diffID = diffID;
	}
	public Integer getDiffID() {
		return this.diffID;
	}
	public void setPhase(Integer phase) {
		this.phase = phase;
	}
	public Integer getPhase() {
		return this.phase;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Integer getGrade() {
		return this.grade;
	}
	public void setSubject(Integer subject) {
		this.subject = subject;
	}
	public Integer getSubject() {
		return this.subject;
	}
	public void setScaleLevel5(Integer scaleLevel5) {
		this.scaleLevel5 = scaleLevel5;
	}
	public Integer getScaleLevel5() {
		return this.scaleLevel5;
	}
	public void setScaleLevel4(Integer scaleLevel4) {
		this.scaleLevel4 = scaleLevel4;
	}
	public Integer getScaleLevel4() {
		return this.scaleLevel4;
	}
	public void setScaleLevel3(Integer scaleLevel3) {
		this.scaleLevel3 = scaleLevel3;
	}
	public Integer getScaleLevel3() {
		return this.scaleLevel3;
	}
	public void setScaleLevel2(Integer scaleLevel2) {
		this.scaleLevel2 = scaleLevel2;
	}
	public Integer getScaleLevel2() {
		return this.scaleLevel2;
	}
	public void setScaleLevel1(Integer scaleLevel1) {
		this.scaleLevel1 = scaleLevel1;
	}
	public Integer getScaleLevel1() {
		return this.scaleLevel1;
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

