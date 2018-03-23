package com.javbus.client;

import junit.framework.TestCase;

import java.io.IOException;

import static org.junit.Assert.*;

public class ClientTest extends TestCase {

    public void testClient() throws IOException {
        System.out.println(Client.get());
    }
}