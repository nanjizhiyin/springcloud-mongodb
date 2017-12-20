package com.xuexin.xcloud.dictionary.service.controller;

import com.xuexin.xcloud.dictionary.entity.MGRecord;
import com.xuexin.xcloud.dictionary.entity.MGUser;
import com.xuexin.xcloud.dictionary.service.repository.MGRecordRepository;
import com.xuexin.xcloud.dictionary.service.repository.UserRepository;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private MGRecordRepository mgRecordRepository;

    @RequestMapping(value = "/mongodb/record", method = RequestMethod.GET)
    public void record() throws Exception {

        mgRecordRepository.deleteAll();

        // 创建三个总数
        for (int i = 0; i < 3; i++){

            Map<String,Float> infoItem0 = new HashMap<>();
            infoItem0.put("1",12f+i);
            infoItem0.put("2",13f+i);
            infoItem0.put("3",15f+i);

            Map<String,Float> infoItem1 = new HashMap<>();
            infoItem1.put("1",22f+i);
            infoItem1.put("2",23f+i);
            infoItem1.put("3",25f+i);

            List<Map<String,Float>> info = new ArrayList<>();
            info.add(infoItem0);
            info.add(infoItem1);


            mgRecordRepository.save(new MGRecord(1L+i, "100001", 57f+i*3,info));
        }

        MGRecord mgRecord = mgRecordRepository.findOne(1L);
        log.info("findOne=========== >" + mgRecord.info);

    }



    @RequestMapping(value = "/mongodb/user", method = RequestMethod.GET)
    public void user() throws Exception {

        userRepository.deleteAll();

        // 创建三个User，并验证User总数
        userRepository.save(new MGUser(1L, "100001", "didi", 30));
        userRepository.save(new MGUser(2L, "100002", "mama", 40));
        userRepository.save(new MGUser(3L, "100003", "kaka", 50));

        List<MGUser> userlist = userRepository.findByAgeGreaterThan(30);
        for (MGUser mgUser : userlist){
            log.info("findByAgeGreaterThan=========== >" + mgUser.xuexinid);
        }

        userlist = userRepository.findByAgeBetween(32,45);
        for (MGUser mgUser : userlist){
            log.info("findByAgeBetween=========== >" + mgUser.xuexinid);
        }

        MGUser tmpMgUser = userRepository.findByName("mama");
        log.info("findByName=========== >" + tmpMgUser.xuexinid);

        userlist = userRepository.findByNameLike("a");
        for (MGUser mgUser : userlist){
            log.info("findByNameLike=========== >" + mgUser.xuexinid);
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
