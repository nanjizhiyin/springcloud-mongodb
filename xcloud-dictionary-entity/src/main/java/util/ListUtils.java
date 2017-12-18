/**
 * Copyright (C) 2015 北京学信科技有限公司
 *
 * @className:com.xuexin.bizserver.util.ListUtils
 * @version:v1.0.0 
 * @author:zxl
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-9-15       zxl                        v1.0.0        create
 *
 */
package util;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 *  类描述
 *
 *  @Author        : zxl
 *  @Creation Date : 2015-9-15 上午11:02:49 
 */
public class ListUtils {

    /**
     * 判断List是否为空
     * 方法描述
     *
     * @param list
     * @return
     * @version:v1.0
     * @author:zxl
     * @date:2015-9-15 上午11:06:29
     */
    public static boolean isNull(List list) {
        if (list != null && !list.isEmpty() && list.size() > 0) {
            return false;
        }
        return true;
    }

    /**
     * 根据要排序的字段给List排序,要排序的字段值必须为数字
     * 方法描述
     *
     * @param orderList     要进行排序的List
     * @param keysMap       要进行排序的字段(key:字段排序的顺序;value:字段名称)
     * @param ordersMap     要进行排序的字段的规则：1:降序;-1:升序;0:不变(key:字段排序的顺序,与keysMap一一对应，不可错位;value:排序规则)
     * 
     * eg: Map<Integer, String> keysMap = new HashMap<Integer, String>();
        keysMap.put(0, "phaseID");
        keysMap.put(1, "grade");
        keysMap.put(2, "classID");
        Map<Integer, Integer> ordersMap = new HashMap<Integer, Integer>();
        ordersMap.put(0, -1);//升序
        ordersMap.put(1, 1);//降序
        ordersMap.put(2, -1);
     * 
     * 
     * 
     * 
     * @version:v1.0
     * @author:zxl
     * @date:2016-3-2 上午11:32:03
     */
    public static void orderListMapByParams(
            List<Map<String, Object>> orderList,
            final Map<Integer, String> keysMap,
            final Map<Integer, Integer> ordersMap) {
        Collections.sort(orderList, new Comparator<Map<String, Object>>() {

            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                int keysLen = keysMap.keySet().size();
                for (int i = 0; i < keysLen; i++) {
                    int orderPara1 = Integer.valueOf(o1.get(keysMap.get(i))
                            .toString());
                    int orderPara2 = Integer.valueOf(o2.get(keysMap.get(i))
                            .toString());
                    int order = ordersMap.get(i);
                    if (orderPara1 - orderPara2 == 0) {
                        continue;
                    }
                    return (orderPara1 - orderPara2) * order * -1;
                }
                return 0;
            }

        });
    }

    public static void orderListLetterStringByDictionarySorting(
            List<String> orderList, final String orderSort) {
        Collections.sort(orderList, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                int order = 1;//升序
                if (!StringUtils.isNull(orderSort)
                        && "desc".equals(orderSort.toLowerCase())) {
                    order = -1;//降序
                }
                if (o1.matches("[^A-Z]+")) {
                    return 1;
                } else if (o2.matches("[^A-Z]+")) {
                    return -1;
                }
                int orderPara1 = o1.length();
                int orderPara2 = o2.length();
                if (orderPara1 - orderPara2 != 0) {
                    return (orderPara1 - orderPara2) * order;
                }
                return o1.compareTo(o2) * order;
            }

        });
    }

    /**
     * 
     * 对List里边类型为POJO的对象排序
     *
     * @param orderList
     * @param keysMap
     * @param ordersMap
     * @version:v1.0
     * @author:zxl
     * @date:2017-4-18 下午5:43:56
     */
    public static <T> void orderListPojoByParams(List<T> orderList,
            final Map<Integer, String> keysMap,
            final Map<Integer, Integer> ordersMap) {
        Collections.sort(orderList, new Comparator<T>() {

            @Override
            public int compare(T o1, T o2) {
                int keysLen = keysMap.keySet().size();
                for (int i = 0; i < keysLen; i++) {

                    String o1Value;
                    String o2Value;
                    try {
                        o1Value = o1
                                .getClass()
                                .getMethod(getMethodNameFromKey(keysMap.get(i)))
                                .invoke(o1).toString();
                        o2Value = o2
                                .getClass()
                                .getMethod(getMethodNameFromKey(keysMap.get(i)))
                                .invoke(o2).toString();
                        int orderPara1 = Integer.valueOf(o1Value);
                        int orderPara2 = Integer.valueOf(o2Value);
                        int order = ordersMap.get(i);
                        if (orderPara1 - orderPara2 == 0) {
                            continue;
                        }
                        return (orderPara1 - orderPara2) * order * -1;
                    } catch (IllegalArgumentException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (SecurityException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                return 0;
            }

        });
    }

    private static String getMethodNameFromKey(String key) {
        StringBuffer method = new StringBuffer();
        if (!StringUtils.isNull(key)) {
            method.append("get");
            method.append(key.substring(0, 1).toUpperCase());
            method.append(key.substring(1));
        }
        return method.toString();
    }
}
