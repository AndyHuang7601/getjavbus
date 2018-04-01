package com.javbus.client;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class GetGidTest {
    @Test
    public void t1() throws IOException {
        GetGid getGid = new GetGid();

        String body = getGid.get();

        Optional<String> first = Arrays.stream(body.split("\n"))
                .filter(s -> s.contains("var gid = "))
                .peek(System.out::println)
                .findFirst()
                .map(s->{
                    String []i=s.split("=");
                    return StringUtils.strip(i[1]," ;\r");
                });

        String page = Client.get(first.get());
        System.out.println(page);
    }
}