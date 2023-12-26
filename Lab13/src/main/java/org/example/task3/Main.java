package org.example.task3;

public class Main {
    public static void main(String[] args) {
        String url = "https://lpnu.ua/";

        WebScrapingFacade facade = new WebScrapingFacade(url);

        Company company = facade.scrapeCompany();

        if (company != null) {
            System.out.println("Company Name: " + company.getName());
            System.out.println("Logo URL: " + company.getLogo());
        }
    }
}
