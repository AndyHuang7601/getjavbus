package com.javbus.client;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Page {

    public static void parse() throws IOException {
        String urlContent = Client.get();

        System.out.println(urlContent);
    }
}
