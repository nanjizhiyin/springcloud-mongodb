package com.xuexin.xcloud.dictionary.service.repository;

import com.xuexin.xcloud.dictionary.entity.MGUser;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/12/18 下午3:14
 **/
public interface UserRepository extends MongoRepository<MGUser, Long> {

    public MGUser findByXuexinid(String xuexinid);
    public List<MGUser> findByAgeGreaterThan(int age) ;
    public List<MGUser> findByAgeBetween(int from, int to);
    public MGUser findByName(String name);
    public List<MGUser> findByNameLike(String name);

}