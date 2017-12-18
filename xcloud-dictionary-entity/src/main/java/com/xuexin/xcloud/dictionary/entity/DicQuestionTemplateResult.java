package com.xuexin.xcloud.dictionary.entity;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/6/30 9:58
 **/
public class DicQuestionTemplateResult {
    private Integer templateID;//模板id
    private String templateName;//模板名称
    private Integer objectiveStem;//0：客观题    1：主观题
    private Integer multiSub;//0:不含小题  1:多小题不含三级标题  2:多小题含三级标题
    private Integer analyzeQue;//0:不解析题干   1:解析题干

    public Integer getTemplateID() {
        return templateID;
    }

    public void setTemplateID(Integer templateID) {
        this.templateID = templateID;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Integer getObjectiveStem() {
        return objectiveStem;
    }

    public void setObjectiveStem(Integer objectiveStem) {
        this.objectiveStem = objectiveStem;
    }

    public Integer getMultiSub() {
        return multiSub;
    }

    public void setMultiSub(Integer multiSub) {
        this.multiSub = multiSub;
    }

    public Integer getAnalyzeQue() {
        return analyzeQue;
    }

    public void setAnalyzeQue(Integer analyzeQue) {
        this.analyzeQue = analyzeQue;
    }

}
