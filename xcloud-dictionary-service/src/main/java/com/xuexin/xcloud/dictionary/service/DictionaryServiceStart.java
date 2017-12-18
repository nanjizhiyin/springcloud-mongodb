/**
 * Copyright (C) 2017 北京学信科技有限公司
 *
 * @className:com.xuexin.xcloud.DictionaryServiceStart
 * @version:v1.0.0 
 * @author:李大鹏
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017年6月8日       李大鹏                        v1.0.0        create
 *
 */
package com.xuexin.xcloud.dictionary.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DictionaryServiceStart {
    public static void main(String[] args) {
        System.out.println("============ > service starting");
        SpringApplication.run(DictionaryServiceStart.class, args);
    }
}
