package com.xuexin.xcloud.dictionary.service.controller;

import com.xuexin.xcloud.dictionary.entity.MGUser;
import com.xuexin.xcloud.dictionary.service.repository.UserRepository;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/12/18 上午11:30
 **/
@RestController
public class MongoDBController {
    private static final Logger log = LoggerFactory.getLogger(DicAbilityController.class);

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/mongodb/user", method = RequestMethod.GET)
    public void user() throws Exception {

        userRepository.deleteAll();

        // 创建三个User，并验证User总数
        userRepository.save(new MGUser(1L, "100001", "didi", 30));
        userRepository.save(new MGUser(2L, "100002", "mama", 40));
        userRepository.save(new MGUser(3L, "100003", "kaka", 50));

        List<MGUser> userlist = userRepository.findByAgeGreaterThan(30);
        for (MGUser mgUser : userlist){
            log.info("=========== >" + mgUser.xuexinid);
        }





//        // 删除一个User，再验证User总数
//        MGUser user = userRepository.findOne(1L);
//        log.info("=========== >" + user.toString());
//        userRepository.delete(user);
//        log.info("=========== >" + userRepository.findAll().size());
//
//        // 删除一个User，再验证User总数
//        user = userRepository.findByXuexinid("100001");
//        userRepository.delete(user);
//        Assert.assertEquals(1, userRepository.findAll().size());

    }

}
