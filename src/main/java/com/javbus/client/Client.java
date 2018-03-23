package com.javbus.client;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

public class Client {

    private static String proxyHost="192.168.1.103";
    private static int proxyPort=8888;

    public static String get(String url) throws IOException {

        OkHttpClient client = new OkHttpClient.Builder()
                .proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort)))
                .build();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("dnt", "1")
                .addHeader("accept-encoding", "plain text")
                .addHeader("accept-language", "zh-CN,zh;q=0.9,en;q=0.8,zh-TW;q=0.7")
                .addHeader("upgrade-insecure-requests", "1")
                .addHeader("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/64.0.3282.167 Chrome/64.0.3282.167 Safari/537.36")
                .addHeader("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8")
                .addHeader("cache-control", "no-cache")
                .addHeader("cookie", "__utma=1.1653959757.1520007802.1520007802.1520007802.1; __utmc=1; __utmz=1.1520007802.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); cdb3_sid=RiZLvJ")
                .addHeader("proxy-connection", "keep-alive")
                .addHeader("postman-token", "154708c8-0206-13d7-6b19-c32192dd920a")
                .build();


        Response response = client.newCall(request).execute();

        return new String(response.body().bytes(),"GBK");//http://www.javaeerun.com/p/1461120389148.html

    }
}
