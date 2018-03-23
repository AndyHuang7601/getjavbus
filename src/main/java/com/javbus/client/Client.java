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
                .addHeader("accept-encoding", "deflate")
                .addHeader("accept-language", "zh-CN,zh;q=0.9,en;q=0.8,zh-TW;q=0.7")
                .addHeader("upgrade-insecure-requests", "1")
                .addHeader("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/64.0.3282.167 Chrome/64.0.3282.167 Safari/537.36")
                .addHeader("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8")
                .addHeader("cache-control", "no-cache")
                .addHeader("authority", "www.javbus.in")
                .addHeader("cookie", "__cfduid=d5d0ad495ab2106c3c26b42919609fc801520179612; PHPSESSID=l4cuq78ul414dsaofsmgmju0d1; HstCfa3159616=1520179617228; HstCmu3159616=1520179617228; __dtsu=2DE7B66BA3199C5ACB0C108602E20703; HstCnv3159616=3; HstCns3159616=3; HstCla3159616=1520612205132; HstPn3159616=10; HstPt3159616=59")
                .addHeader("postman-token", "5c4f16b7-3ac9-2de6-5964-69416f1f6618")
                .build();

        Response response = client.newCall(request).execute();

        return response.body().string();

    }
}
