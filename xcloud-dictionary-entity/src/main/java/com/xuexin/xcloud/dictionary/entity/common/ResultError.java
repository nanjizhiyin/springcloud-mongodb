/**
 * Copyright (C) 2013 北京学信科技有限公司
 *
 * @className:com.xuexin.fileserver.entity.ErrorBean
 * @version:v1.0.0 
 * @author:李大鹏
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2013-6-21       李大鹏                        v1.0.0        create
 *
 */
package com.xuexin.xcloud.dictionary.entity.common;

/**
* @Author: Gaojindan
* @Des: 错误结果,用于接口反馈
* @Param:
* @Return:
* @Create: 2017/6/20 15:34
*/
public class ResultError extends ResultBean {

    public ResultError(String errcode) {
        this.setErrcode(errcode);
    }
    /**
     * 错误结果
     * @param errcode 错误代码
     * @param errmsg 错误内容
     */
    public ResultError(String errcode,String errmsg) {
        this.setErrcode(errcode);
        this.setErrmsg(errmsg);
    }
}
