package com.xuexin.xcloud.dictionary.entity;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/6/30 9:59
 **/
public class DicSubjectResult {
    private Integer subjectID;//学科ID
    private String subjectName;//学科名称
    private Integer isComprehensive;//是否综合学科

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

    public Integer getIsComprehensive() {
        return isComprehensive;
    }

    public void setIsComprehensive(Integer isComprehensive) {
        this.isComprehensive = isComprehensive;
    }
}
