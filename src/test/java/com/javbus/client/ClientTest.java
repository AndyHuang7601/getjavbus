package com.javbus.client;

import junit.framework.TestCase;

import java.io.IOException;

public class ClientTest extends TestCase {

    public void testClient() throws IOException {
        System.out.println(Client.get("https://www.javbus.in/"));
    }

    public void testClient2() throws IOException {
        System.out.println(Client.get("https://www.javbus.in/SCOP-502"));
    }
}