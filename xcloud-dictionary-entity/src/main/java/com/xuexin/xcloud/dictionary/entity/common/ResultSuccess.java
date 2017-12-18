/**
 * Copyright (C) 2013 北京学信科技有限公司
 *
 * @className:com.xuexin.fileserver.entity.SuccessBean
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
* @Des:成功结果
* @Create: 2017/5/15 11:35
*/
public class ResultSuccess extends ResultBean {

    public ResultSuccess() {
        this.setErrcode("0");
        this.setErrmsg("ok");
    }
}
