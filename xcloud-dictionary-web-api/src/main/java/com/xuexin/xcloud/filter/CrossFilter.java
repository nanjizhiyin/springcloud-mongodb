package com.xuexin.xcloud.filter;

import com.xuexin.xcloud.common.ConfigProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Copyright (C) 2017/7/14 北京学信科技有限公司
 *
 * @author:kyq
 * @version:v1.0.0 Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017/7/14     kyq                       v1.0.0        create
 */
public class CrossFilter implements Filter{

    @Autowired
    private ConfigProperties configProperties;
    /**
     * 日志
     */
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 初始化过滤器
     *
     * @author kyq
     * @version v1.0
     * @date 2017/7/14 14:38
     */
    @Override
    public void init(FilterConfig arg0) throws ServletException
    {
        logger.debug(this.getClass().getName()+"=============================>过滤器初始化！");
    }


    /**
     * 用于支持跨域访问
     *
     * @author kyq
     * @version v1.0
     * @date 2017/7/14 14:39
     */
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException
    {
        HttpServletResponse httpRes = (HttpServletResponse) res;
        httpRes.setHeader("Access-Control-Allow-Origin", ((HttpServletRequest) req).getHeader("Origin"));
        httpRes.setHeader("Access-Control-Allow-Methods", "GET, PUT, POST, DELETE, OPTIONS");
        httpRes.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Accept,X-Requested-With");
        httpRes.setHeader("Access-Control-Allow-Credentials", "true");
        httpRes.setHeader("Access-Control-Max-Age", "43200");
        httpRes.setHeader("Access-Control-Allow-Credentials","true");
        chain.doFilter(req, res);
    }

    /**
     * 销毁过滤器
     *
     * @author kyq
     * @version v1.0
     * @date 2017/7/14 14:38
     */
    @Override
    public void destroy()
    {
        logger.debug(this.getClass().getName()+"=============================>过滤器销毁！");
    }
}
