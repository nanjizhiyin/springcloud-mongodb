/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className com.xuexin.xcloud.itembank.entity.DicItemBankSchool
 * @version v1.0.0 
 * @author zhangjingsi
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017-06-19      zhangjingsi      v1.0.0      create
 *
 */
package com.xuexin.xcloud.dictionary.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * um_unit表实体
 *
 * @author zhangjingsi
 * @date 2017-06-19 11:29:50
 */
public class UmUnit implements Serializable {

    private Integer unitID;//学校ID
    private String unitName;//学校名称
//    private String avatar;//校微
//    private Integer unitType;//类型
//    private String address;//地址
//    private String phone;//电话
//    private String managerID;//管理员ID
//	private String country;
//	private String province;
//	private String city;
//	private String district;
//	private String keywords;
//	private String introduction;
//	private String publicID;
//	private Integer identification;
//	private Integer initClassLimit;//初始化班级默认成员数300
//	private Integer initSnsLimit;//初始化主题群默认成员数50
//	private String verifierID;
//	private String verifyImg;
//	private Date verifyDate;
//	private Integer attendance;//门禁功能
//	private Integer sports;
//	private Integer bizCard;//一卡通权限，有1即为开通
//	private Integer isEffective;
//	private String createDate;
//	private Integer isExpand;//0:未开发 1:开发过

	public Integer getUnitID() {
		return unitID;
	}

	public void setUnitID(Integer unitID) {
		this.unitID = unitID;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
}

