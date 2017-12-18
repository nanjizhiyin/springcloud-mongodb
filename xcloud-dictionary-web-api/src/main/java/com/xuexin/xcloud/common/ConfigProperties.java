/**
 * Copyright (C) 2017/7/14 北京学信科技有限公司
 *
 * @author:kyq
 * @version:v1.0.0 Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017/7/14     kyq                       v1.0.0        create
 */
package com.xuexin.xcloud.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/*
* 自定义配置类
* spring boot1.5以上版本@ConfigurationProperties取消location注解
*
* */
@Component  //注册
@ConfigurationProperties(prefix = "properties")
@PropertySource("classpath:/application.properties")
public class ConfigProperties {

    private String allowOrigin; // 允许访问的地址

    public String getAllowOrigin() {
        return allowOrigin;
    }

    public void setAllowOrigin(String allowOrigin) {
        this.allowOrigin = allowOrigin;
    }
}
