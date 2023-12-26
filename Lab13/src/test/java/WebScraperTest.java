import org.example.task3.Company;
import org.example.task3.WebScraper;
import org.example.task3.WebScrapingFacade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebScraperTest {

    @Test
    void scrape_shouldReturnCompanyObject() {
        String url = "https://lpnu.ua/";
        WebScraper scraper = new WebScraper(url);

        Company company = scraper.scrape();

        assertNotNull(company);
        assertNotNull(company.getName());
        assertNotNull(company.getLogo());
    }

    @Test
    void scrapeCompany_shouldReturnCompanyObject() {
        String url = "https://lpnu.ua/";
        WebScrapingFacade facade = new WebScrapingFacade(url);

        Company company = facade.scrapeCompany();

        assertNotNull(company);
        assertNotNull(company.getName());
        assertNotNull(company.getLogo());
    }
}
