package org.example.task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class WebScraper {
    public static void main(String[] args) {
        String url = "https://lpnu.ua/";

        WebScraper scraper = new WebScraper(url);

        scraper.scrape();
    }

    private String url;

    public WebScraper(String url) {
        this.url = url;
    }

    public Company scrape() {
        try {
            Document document = Jsoup.connect(url).get();

            String title = document.title();

            Elements logoElements = document.select("meta[property=og:image]");
            String logoUrl = logoElements.attr("content");

            Company company = new Company(title, logoUrl);
            return company;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
