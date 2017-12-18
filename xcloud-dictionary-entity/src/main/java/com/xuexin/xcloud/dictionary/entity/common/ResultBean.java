/**
 * Copyright (C) 2013 北京学信科技有限公司
 *
 *
 */
package com.xuexin.xcloud.dictionary.entity.common;

/**
 * @Description : 结果bean父类
 * @author : 郜金丹
 * @Creation Date : 2016-6-21 上午9:01:45
 */
public class ResultBean {

    //内部错误码
    private String errcode;
    //错误描述
    private String errmsg;



    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

}
