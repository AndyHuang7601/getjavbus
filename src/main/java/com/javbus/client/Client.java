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

    public static String get() throws IOException {

        OkHttpClient client = new OkHttpClient.Builder()
                .proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort)))
                .build();

        String gid = "36787896855";
        Request request = new Request.Builder()
                .url("https://www.javbus.in/ajax/uncledatoolsbyajax.php?gid=" + gid + "&lang=zh&uc=0")
                .get()
                .addHeader("pragma", "no-cache")
                .addHeader("cookie", "__cfduid=d5d0ad495ab2106c3c26b42919609fc801520179612; HstCfa3159616=1520179617228; HstCmu3159616=1520179617228; PHPSESSID=36nk4k95v2kdf9aasdknidjej7; HstCnv3159616=4; HstCns3159616=4; __dtsu=D9E9B66B38F3C05A0F43328F02D98F83; HstCla3159616=1522594705635; HstPn3159616=10; HstPt3159616=69")
                .addHeader("dnt", "1")
                .addHeader("accept-encoding", "deflate")
                .addHeader("accept-language", "zh-CN,zh;q=0.9,en;q=0.8,zh-TW;q=0.7")
                .addHeader("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/65.0.3325.181 Chrome/65.0.3325.181 Safari/537.36")
                .addHeader("accept", "*/*")
                .addHeader("cache-control", "no-cache")
                .addHeader("authority", "www.javbus.in")
                .addHeader("x-requested-with", "XMLHttpRequest")
                .addHeader("referer", "https://www.javbus.in/")
                .addHeader("postman-token", "64ff1904-b9a3-6ef8-5e33-db924c6373f2")
                .build();


        Response response = client.newCall(request).execute();

        return new String(response.body().bytes(),"UTF8");//http://www.javaeerun.com/p/1461120389148.html

    }
}
