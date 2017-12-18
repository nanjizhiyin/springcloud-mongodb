package com.xuexin.xcloud.dictionary.service.controller;

import com.alibaba.fastjson.JSON;
import com.xuexin.xcloud.dictionary.entity.DicAbility;
import com.xuexin.xcloud.dictionary.entity.DicAbilityResult;
import com.xuexin.xcloud.dictionary.entity.DicCauseResult;
import com.xuexin.xcloud.dictionary.entity.common.ResultBean;
import com.xuexin.xcloud.dictionary.entity.common.ResultError;
import com.xuexin.xcloud.dictionary.entity.common.ResultSuccess;
import com.xuexin.xcloud.dictionary.service.mapper.dicAbility.DicAbilityMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import util.IdWorker;

import java.util.Date;
import java.util.List;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/6/21 12:43
 **/
@RestController
public class DicAbilityController {
    private static final Logger log = LoggerFactory.getLogger(DicAbilityController.class);

    @Autowired
    DicAbilityMapper dicAbilityMapper;

    private IdWorker idWorker = new IdWorker();

    /**
     * @Author: Gaojindan
     * @Des: 添加能力
     * @Param: dicAbility 资料
     * @Create: 2017/6/20 14:32
     */
    @RequestMapping(value = "/ability", method = RequestMethod.POST)
    public ResultBean insertAbility(@RequestBody DicAbility dicAbility) {
        log.info("============= >收到数据 dicAbility:" + dicAbility.toString());

        String errmsg = null;
        String errcode = null;
        ResultBean rb = new ResultSuccess();
        String tmpName = dicAbility.getAbilityName();
        if (StringUtils.isEmpty(tmpName)) {
            errcode = "DIC-00003";
            errmsg = "名称不能为空";
        }
        else if (tmpName.length() > 50){
            errcode = "DIC-30002";
            errmsg = "名称长度不能大于50";
        }
        else{
            DicAbilityResult oldAbility = dicAbilityMapper.selectAbilityInfo(null, tmpName, 1);
            if (oldAbility != null) {
                //已经存在这个名称了
                errcode = "DIC-00004";
                errmsg = "此名称已经存在";
            }
        }
        log.info("=========== >" + errmsg);
        if (errcode != null){
            rb = new ResultError(errcode, errmsg);
        }
        else{
            dicAbility.setAbilityID(idWorker.nextId());
            dicAbility.setCreateDate(new Date());
            dicAbilityMapper.insertAbility(dicAbility);
        }
        return rb;
    }

    /**
     * @Author: Gaojindan
     * @Des: 修改资料
     * @Param: dicAbility 资料
     * @Return:
     * @Create: 2017/6/21 10:29
     */
    @RequestMapping(value = "/ability", method = RequestMethod.PUT)
    public ResultBean updateAbility(@RequestBody DicAbility dicAbility) {
        log.info("============= >收到数据 dicAbility:" + JSON.toJSONString(dicAbility));

        String errmsg = null;
        String errcode = null;
        ResultBean rb = new ResultSuccess();

        Long tmpID = dicAbility.getAbilityID();
        String tmpName = dicAbility.getAbilityName();
        Integer isEffective = dicAbility.getIsEffective();
        DicAbilityResult tmpInfo = dicAbilityMapper.selectAbilityInfo(tmpID, null, 1);
        if (tmpInfo == null) {
            //不存在
            errmsg = "能力不存在";
            errcode = "DIC-30001";
        }
        //为空时,更新资料操作
        if (isEffective == null) {
            //更新资料
            if (StringUtils.isEmpty(tmpName)) {
                errmsg = "名称不能为空";
                errcode = "DIC-00003";
            }
            else if (tmpName.length() > 50){
                errcode = "DIC-30002";
                errmsg = "名称长度不能大于50";
            }
            else{
                tmpInfo = dicAbilityMapper.selectAbilityInfo(null, tmpName, 1);
                if (tmpInfo != null) {
                    //已经存在了,请返回错误
                    errmsg = "此能力已经存在";
                    errcode = "DIC-00004";
                }
            }
        }
        log.info("=========== >" + errmsg);
        if (errcode != null){
            rb = new ResultError(errcode, errmsg);
        }
        else{
            dicAbility.setModifyDate(new Date());
            dicAbilityMapper.updateAbility(dicAbility);
        }
        return rb;
    }

    /**
     * @Author: Gaojindan
     * @Des: 能力详情查询
     * @Param: searchKey 能力名称
     * @Return: 列表
     * @Create: 2017/6/20 11:54
     */

    @RequestMapping(value = "/ability/search", method = RequestMethod.GET)
    public List<DicAbilityResult> selectAbilitySearch(@RequestParam(value = "searchKey", required = false) String searchKey) {
        log.info("============= >收到数据 searchKey:" + searchKey);
        List<DicAbilityResult> tmpList = dicAbilityMapper.selectAbilitySearch(searchKey);
        return tmpList;
    }

    /**
     * @Author: Gaojindan
     * @Des: 读取资料
     * @Param: abilityID ID
     * @Param: abilityName 名称
     * @Param: isEffective 是否有效
     * @Return:
     * @Create: 2017/7/3 9:15
     */
    @RequestMapping(value = "/ability/info", method = RequestMethod.GET)
    public DicAbilityResult selectAbilityInfo(@RequestParam(value = "abilityID", required = true) Long abilityID,
                                              @RequestParam(value = "isEffective", required = false) Integer isEffective) {
        log.info("================ >收到数据 abilityID :" + abilityID);
        log.info("================ >收到数据 isEffective :" + isEffective);
        if (StringUtils.isEmpty(abilityID)) {
            log.info("================ >abilityID 不能为空");
            return null;
        }
        DicAbilityResult result = dicAbilityMapper.selectAbilityInfo(abilityID, null, isEffective);
        return result;
    }
}
