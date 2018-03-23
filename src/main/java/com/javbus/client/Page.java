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
        String urlContent = Client.get("http://67.220.90.4/bbs/forumdisplay.php?fid=143&filter=digest");

        Document parse = Jsoup.parse(urlContent);
        Elements select = parse.select("#wrapper > div > div > form > table > tbody");
        List<Element> collect = select.stream()
                .filter(f -> f.attr("id").startsWith("normal"))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
