package com.mitewater.test;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created with IntelliJ IDEA.
 * User: MiteWater
 * Date: 2017/1/13
 * Time: 15:48
 * Description: class for JBlog try it self
 */
public class HttpRequest {
    public static void main(String[] args) {

        CloseableHttpClient httpClient = null;
        HttpUriRequest request = null;
        try {
            String encode = URLEncoder.encode("我的一天","utf-8");
            System.out.println(encode);
            System.out.println(URLDecoder.decode(encode,"UTF-8"));
            HttpClientBuilder clientBuilder = HttpClientBuilder.create();
            HttpHost proxy = new HttpHost("127.0.0.1", 1234);
            clientBuilder.setProxy(proxy);
            clientBuilder.setUserAgent("Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; .NET4.0C; .NET4.0E; .NET CLR 2.0.50727; .NET CLR 3.0.30729; .NET CLR 3.5.30729; InfoPath.3; rv:11.0) like Gecko");
//            request = new HttpGet("https://translate.google.com/translate_a/single?client=t&sl=zh-CN&tl=en&hl=zh-CN&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw&dt=rm&dt=ss&dt=t&ie=UTF-8&oe=UTF-8&otf=2&ssel=3&tsel=3&kc=1&tk=442490.35573&q=%E6%88%91%E4%BB%AC%E7%94%9F%E6%B4%BB%E7%9A%84%E5%9C%B0%E7%90%83%E4%B8%8A");
            request = new HttpGet("https://translate.googleapis.com/translate_a/single?client=gtx&sl=zh-CN&tl=en&dt=t&q="+encode);
            httpClient = clientBuilder.build();
            httpClient.execute(request);
            CloseableHttpResponse response = httpClient.execute(request);
            InputStream inputStream = response.getEntity().getContent();
            System.out.println(IOUtils.toString(inputStream,"utf-8"));
            response.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
