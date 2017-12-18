package com.xuexin.xcloud.dictionary.entity;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/6/30 9:56
 **/
public class DicCauseResult {
    private Long causeID;//错因ID
    private String causeName;//错因名称

    public Long getCauseID() {
        return causeID;
    }

    public void setCauseID(Long causeID) {
        this.causeID = causeID;
    }

    public String getCauseName() {
        return causeName;
    }

    public void setCauseName(String causeName) {
        this.causeName = causeName;
    }

}
