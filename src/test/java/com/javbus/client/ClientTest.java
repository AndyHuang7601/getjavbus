package com.javbus.client;

import junit.framework.TestCase;

import java.io.IOException;

public class ClientTest extends TestCase {

    public void testClient() throws IOException {
        System.out.println(Client.get("http://67.220.90.4/bbs/forumdisplay.php?fid=143&filter=digest"));
    }

    public void testClient2() throws IOException {
        String pagecontent = Client.get("http://67.220.90.4/bbs/forumdisplay.php?fid=143&filter=digest");
        byte[] bytes = pagecontent.getBytes(("ISO-8859-1"));
        String utf8 = new String(bytes, "GBK");
        System.out.println(utf8);
    }
}