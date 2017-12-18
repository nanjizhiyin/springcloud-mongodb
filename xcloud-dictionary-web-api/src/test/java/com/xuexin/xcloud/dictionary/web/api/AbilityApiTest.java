package com.xuexin.xcloud.dictionary.web.api;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/6/23 13:37
 **/
public class AbilityApiTest {

    private static final Logger log = LoggerFactory.getLogger(AbilityApiTest.class);

    /**
     * @Author: Gaojindan
     * @Des: 添加
     * @Param:
     * @Return:
     * @Create: 2017/6/22 13:55
     */
    @Test
    public void insertabi() {
        String url = "http://localhost:10505/dictionary-api/ability";
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        params.add(new BasicNameValuePair("abilityName", "能力1"));

        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpPost httppost = new HttpPost(url);
            httppost.setEntity(new UrlEncodedFormEntity(params, "utf-8"));
            CloseableHttpResponse response = httpclient.execute(httppost);
            //发送Post,并返回一个HttpResponse对象
            String result = EntityUtils.toString(response.getEntity());
            log.info("================= > " + result);
        } catch (IOException e) {
            e.printStackTrace();
            log.info("================= > " + e);
        }
    }

    /**
     * @Author: Gaojindan
     * @Des: 修改
     * @Param:
     * @Return:
     * @Create: 2017/6/22 13:55
     */
    @Test
    public void update() {
        String url = "http://localhost:10505/dictionary-api/ability/6860369779951616";
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        params.add(new BasicNameValuePair("abilityName", "能力11"));

        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpPut httppost = new HttpPut(url);

            httppost.setEntity(new UrlEncodedFormEntity(params, "utf-8"));
            CloseableHttpResponse response = httpclient.execute(httppost);
            //发送Post,并返回一个HttpResponse对象
            String result = EntityUtils.toString(response.getEntity());
            log.info("================= > " + result);
        } catch (IOException e) {
            e.printStackTrace();
            log.info("================= > " + e);
        }
    }

    /**
     * @Author: Gaojindan
     * @Des: 删除
     * @Param:
     * @Return:
     * @Create: 2017/6/30 14:07
     */
    @Test
    public void delete() {
        String url = "http://localhost:10505/dictionary-api/ability/6860369779951616";
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpDelete httppost = new HttpDelete(url);
            CloseableHttpResponse response = httpclient.execute(httppost);
            String result = EntityUtils.toString(response.getEntity());
            log.info("================= > " + result);
        } catch (IOException e) {
            e.printStackTrace();
            log.info("================= > " + e);
        }
    }

    @Test
    public void select() {
        String xtoken = "NKEjbckj0UVALNllSz5372lLRl7kzUunncuQEifxc5T_xxgO9LeE90u0XSjWl-AwJv1pGmLFziB6-UhF456yn3YssGuTFdjL9Z8ODWWyRCLrL1ulPRyV7pyR-xbJcX3MEOLw1Q8Z98yPJdwP9XlVaTpiR97UeALbqOMJK75giueSW5IkKbZkYAPQLLxPY5XmD47071uLnKFaS4LmcJxPYHR87v1CWuZoLey0lJ18eAlsWCqC7GjYbw79wozlaqB_nThSNghSZf2ngAhYB5BBKkDJDmYrtk4nYqY-QCCkWLw4RJwRngyaZUz6h8M2cxnx7AyJTkCURW8MeumoDHuH-_P9G6FIqcOhHcXFAv1OR6iJWs1g9AAa-t058M50gTpms2rmistc-zHYUP5fZSrt6ChO692o6kyKgfC7vUzSOJ2VUogC-kaEx4wCc19muJdBlS84rybe5MFyLbsYS17lzCqbBhGVaX8mzWOouA..";
        //POST方法 MAP传值
        String url = "http://my.test.com:10505/dictionary-api/ability";
        try {
//            // 创建CookieStore实例
//            CookieStore cookieStore = new BasicCookieStore();
//            // 新建一个Cookie
//            BasicClientCookie cookie = new BasicClientCookie("xtoken", xtoken);
//            cookie.setDomain(".test.com");
//            cookie.setPath("/");
//            cookieStore.addCookie(cookie);
//            // 新建一个Cookie
//            BasicClientCookie cookie2 = new BasicClientCookie("JSESSIONID", "7DA0F3B4E355BC77C7ED211EC5539CE4");
//            cookie2.setDomain("login.test.com");
//            cookie2.setPath("/");
//            cookieStore.addCookie(cookie2);
//
//            CloseableHttpClient httpclient = HttpClients.custom()
//                    .setDefaultCookieStore(cookieStore)
//                    .build();

            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httppost = new HttpGet(url);
            CloseableHttpResponse response = httpclient.execute(httppost);


            //发送Post,并返回一个HttpResponse对象
            String result = EntityUtils.toString(response.getEntity());
            log.info("================= > " + result);
        } catch (IOException e) {
            e.printStackTrace();
            log.info("================= > " + e);
        }
    }

    @Test
    public void search() {
        //POST方法 MAP传值
        String url = "http://localhost:10505/dictionary-api/ability?action=search&abilityName=能力1";
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httppost = new HttpGet(url);

            CloseableHttpResponse response = httpclient.execute(httppost);
            //发送Post,并返回一个HttpResponse对象
            String result = EntityUtils.toString(response.getEntity());
            log.info("================= > " + result);
        } catch (IOException e) {
            e.printStackTrace();
            log.info("================= > " + e);
        }
    }
}
