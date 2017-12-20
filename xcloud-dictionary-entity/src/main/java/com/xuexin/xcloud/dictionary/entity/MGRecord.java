package com.xuexin.xcloud.dictionary.entity;

import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Map;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/12/19 上午8:54
 **/
public class MGRecord {
    @Id
    private Long id;

    public String xuexinid;
    public float score;//总成绩
    public List<Map<String,Float>> info;

    public MGRecord(Long id, String xuexinid,float score, List<Map<String,Float>> info) {
        this.id = id;
        this.xuexinid = xuexinid;
        this.score = score;
        this.info = info;
    }
}
