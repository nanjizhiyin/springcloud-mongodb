package util;

/**
 * Copyright (C) 2017/5/15 北京学信科技有限公司
 *
 * @author:kyq
 * @version:v1.0.0 Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017/5/15     kyq                       v1.0.0        create
 */
public class LogTimeUtils {
    private long beginTime;
    private long endTime;

    public LogTimeUtils() {
        beginTime = System.currentTimeMillis();
        endTime = System.currentTimeMillis();
    }

    /**
     * 统计总时间
     *
     * @author kyq
     * @version v1.0
     * @date 2017/5/15 10:41
     */
    public Long countTotalTime() {
        return System.currentTimeMillis() - beginTime;
    }

    /**
     * 统计间隔时间
     *
     * @author kyq
     * @version v1.0
     * @date 2017/5/15 10:49
     */
    public Long countTime() {
        long time = System.currentTimeMillis() - endTime;
        endTime = System.currentTimeMillis();
        return time;
    }

}
