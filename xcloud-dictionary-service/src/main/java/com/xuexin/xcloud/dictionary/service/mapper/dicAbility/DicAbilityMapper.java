package com.xuexin.xcloud.dictionary.service.mapper.dicAbility;

import com.xuexin.xcloud.dictionary.entity.DicAbility;
import com.xuexin.xcloud.dictionary.entity.DicAbilityResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/6/21 12:39
 **/
public interface DicAbilityMapper {


    /**
     * @Author: Gaojindan
     * @Des: 添加能力
     * @Param: dicAbility 数据
     * @Return:
     * @Create: 2017/6/20 14:44
     */
    public void insertAbility(@Param("dicAbility") DicAbility dicAbility);

    /**
     * @Author: Gaojindan
     * @Des: 更新能力资料
     * @Param: dicAbility 资料
     * @Return:
     * @Create: 2017/6/21 10:33
     */
    public void updateAbility(@Param("dicAbility") DicAbility dicAbility);

    /**
     * @Author: Gaojindan
     * @Des: 读取资料
     * @Param: abilityID ID
     * @Param: abilityName 名称
     * @Param: isEffective 是否有效
     * @Return:
     * @Create: 2017/6/23 15:55
     */
    public DicAbilityResult selectAbilityInfo(@Param("abilityID") Long abilityID,
                                              @Param("abilityName") String abilityName,
                                              @Param("isEffective") Integer isEffective);

    /**
     * @Author: Gaojindan
     * @Des: 模糊搜索
     * @Param: abilityName 名称
     * @Return:
     * @Create: 2017/6/23 15:55
     */
    public List<DicAbilityResult> selectAbilitySearch(@Param("searchKey") String searchKey);

}
