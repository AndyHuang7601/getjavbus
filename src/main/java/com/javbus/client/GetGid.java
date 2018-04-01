package com.javbus.client;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

public class GetGid {
    private static String proxyHost="192.168.1.103";
    private static int proxyPort=8888;

    public String get() throws IOException {

        OkHttpClient client = new OkHttpClient.Builder()
                .proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort)))
                .build();

        Request request = new Request.Builder()
                .url("https://www.javbus.in/BF-537")
                .get()
                .addHeader("pragma", "no-cache")
                .addHeader("cookie", "__cfduid=d5d0ad495ab2106c3c26b42919609fc801520179612; HstCfa3159616=1520179617228; HstCmu3159616=1520179617228; PHPSESSID=36nk4k95v2kdf9aasdknidjej7; HstCnv3159616=4; __dtsu=D9E9B66B38F3C05A0F43328F02D98F83; HstCns3159616=5; HstCla3159616=1522596631155; HstPn3159616=16; HstPt3159616=75")
                .addHeader("dnt", "1")
                .addHeader("accept-encoding", "deflate")
                .addHeader("accept-language", "zh-CN,zh;q=0.9,en;q=0.8,zh-TW;q=0.7")
                .addHeader("upgrade-insecure-requests", "1")
                .addHeader("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/65.0.3325.181 Chrome/65.0.3325.181 Safari/537.36")
                .addHeader("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8")
                .addHeader("cache-control", "no-cache")
                .addHeader("authority", "www.javbus.in")
                .addHeader("referer", "https://www.javbus.in/genre/hd")
                .addHeader("postman-token", "f90b63ce-8429-7e40-ba86-718be74108d1")
                .build();

        Response response = client.newCall(request).execute();

        return response.body().string();

    }
}
