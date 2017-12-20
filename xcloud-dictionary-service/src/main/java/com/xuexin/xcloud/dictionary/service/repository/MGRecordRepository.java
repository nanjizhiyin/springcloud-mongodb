package com.xuexin.xcloud.dictionary.service.repository;

import com.xuexin.xcloud.dictionary.entity.MGRecord;
import com.xuexin.xcloud.dictionary.entity.MGUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/12/20 上午10:25
 **/

public interface MGRecordRepository extends MongoRepository<MGRecord, Long> {

    public MGUser findByXuexinid(String xuexinid);

}