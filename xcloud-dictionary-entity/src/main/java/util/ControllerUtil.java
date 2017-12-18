package util;


/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: mayong
 * @Create: 2017/6/20 15:24
 **/
public class ControllerUtil {

    /**
     * 返回当前页
     * @param page
     * @param countNum
     * @param onePageSize
     * @return
     */
    public static Integer getCurrenPage(Integer page, Integer countNum,
                                        Integer onePageSize) {
        Integer page1 = 1;
        Integer countPage = 1;
        if (page != null) {
            page1 = page;
            if (page1 == 0) {
                page1 = 1;
            }
        }
        if (countNum > 0) {
            if (countNum % onePageSize == 0) {
                countPage = countNum / onePageSize;
            } else {
                countPage = countNum / onePageSize + 1;
            }
        }
        if (page1 > countPage && countPage > 0) {
            page1 = countPage;
        }
        return page1;
    }

}
