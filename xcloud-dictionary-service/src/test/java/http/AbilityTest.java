package http;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Copyright (C) 北京学信科技有限公司
 *
 * @Des:
 * @Author: Gaojindan
 * @Create: 2017/7/3 9:48
 **/
public class AbilityTest {

    private static final Logger log = LoggerFactory.getLogger(AbilityTest.class);

    @Test
    public void select() {
        //POST方法 MAP传值
        String url = "http://localhost:11205/ability/info?abilityID=6860369779951616";
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httppost = new HttpGet(url);

            CloseableHttpResponse response = httpclient.execute(httppost);
            //发送Post,并返回一个HttpResponse对象
            String result = EntityUtils.toString(response.getEntity());
            log.debug("================= > " + result);
        } catch (IOException e) {
            e.printStackTrace();
            log.debug("================= > " + e);
        }
    }
}
