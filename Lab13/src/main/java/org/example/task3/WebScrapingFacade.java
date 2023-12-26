package org.example.task3;


public class WebScrapingFacade {
    private String url;

    public WebScrapingFacade(String url) {
        this.url = url;
    }

    public Company scrapeCompany() {
        try {
            WebScraper scraper = new WebScraper(url);
            Company company = scraper.scrape();
            return company;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    }