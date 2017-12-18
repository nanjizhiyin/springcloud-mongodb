/**
 * Copyright (C) 2017 北京学信科技有限公司
 *
 * @className:com.xuexin.xcloud.DictionaryAPIStart
 * @version:v1.0.0 
 * @author:李大鹏
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017年6月13日       李大鹏                        v1.0.0        create
 *
 */
package com.xuexin.xcloud;

import com.xuexin.xcloud.filter.CrossFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class DictionaryAPIStart {

    /**
     * 注入跨域请求过滤器
     * @author kyq
     * @return crossFilter
     * @date 2017/7/14 16:47
     */
    @Bean
    public CrossFilter crossFilter(){
        return new CrossFilter();
    }

    public static void main(String[] args) {
        System.out.println("============ > web api starting");
        SpringApplication.run(DictionaryAPIStart.class, args);
    }
}
