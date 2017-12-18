package com.xuexin.xcloud.dictionary.service.api;

import com.xuexin.xcloud.dictionary.entity.DicAbility;
import com.xuexin.xcloud.dictionary.entity.DicAbilityResult;
import com.xuexin.xcloud.dictionary.entity.common.ResultBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/6/23 13:09
 **/
@FeignClient("DICTIONARY-SRV")
@Service
public interface IDicAbilityService {
    /**
     * @Author: Gaojindan
     * @Des: 添加能力
     * @Param: dicAbility 资料
     * @Create: 2017/6/20 14:32
     */
    @RequestMapping(value = "/ability", method = RequestMethod.POST)
    public ResultBean insertAbility(@RequestBody DicAbility dicAbility);

    /**
     * @Author: Gaojindan
     * @Des: 修改资料
     * @Param: dicAbility 资料
     * @Return:
     * @Create: 2017/6/21 10:29
     */
    @RequestMapping(value = "/ability", method = RequestMethod.PUT)
    public ResultBean updateAbility(@RequestBody DicAbility dicAbility);

    /**
     * @Author: Gaojindan
     * @Des: 能力详情模糊搜索
     * @Param: abilityName 能力名称
     * @Return: 列表
     * @Create: 2017/6/20 11:54
     */

    @RequestMapping(value = "/ability/search", method = RequestMethod.GET)
    public List<DicAbilityResult> selectAbilitySearch(@RequestParam(value = "searchKey", required = false) String searchKey);

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
                                              @RequestParam(value = "isEffective", required = false) Integer isEffective);
}
