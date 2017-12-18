package com.xuexin.xcloud.api;

import com.xuexin.xcloud.dictionary.entity.DicAbility;
import com.xuexin.xcloud.dictionary.entity.DicAbilityResult;
import com.xuexin.xcloud.dictionary.entity.common.ResultBean;
import com.xuexin.xcloud.dictionary.entity.common.ResultError;
import com.xuexin.xcloud.dictionary.service.api.IDicAbilityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/6/23 13:09
 **/
@RestController
public class DicAbilityWebAPI {
    private static final Logger log = LoggerFactory.getLogger(DicAbilityWebAPI.class);

    @Autowired
    IDicAbilityService iDicAbilityService;

    @RequestMapping(value = "/ability", method = RequestMethod.GET)
    public Object selectAbility(@RequestParam(value = "searchKey", required = false) String searchKey) {
        log.info("============= >能力列表查询");
        try {
            List<DicAbilityResult> tmpList = iDicAbilityService.selectAbilitySearch(searchKey);
            return tmpList;
        } catch (Exception e) {
            log.info("============= >" + e.toString());
            String msg = "服务器内部错误";
            ResultBean rb = new ResultError("DIC-00001", msg);
            return rb;
        }
    }

}
