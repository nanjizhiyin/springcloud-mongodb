package com.xuexin.xcloud.dictionary.entity;

import org.springframework.data.annotation.Id;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/12/19 上午9:00
 **/
public class MGUser {
    @Id
    private Long id;

    public String xuexinid;
    public String name;
    public Integer age;

    public MGUser(Long id, String xuexinid,String name, Integer age) {
        this.id = id;
        this.xuexinid = xuexinid;
        this.name = name;
        this.age = age;
    }

}
