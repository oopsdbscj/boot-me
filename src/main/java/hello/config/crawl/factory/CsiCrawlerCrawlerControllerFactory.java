package hello.config.crawl.factory;

import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import hello.config.crawl.CrawlConfigEnhance;
import hello.service.impl.No1Crawler;

/**
 * @author tab chan 10/20/2017
 */
public class CsiCrawlerCrawlerControllerFactory implements CrawlController.WebCrawlerFactory {
    private CrawlConfigEnhance configEnhance;

    public CsiCrawlerCrawlerControllerFactory(CrawlConfigEnhance configEnhance) {
        this.configEnhance = configEnhance;
    }

    @Override
    public WebCrawler newInstance() throws Exception {
        return new No1Crawler(configEnhance);
    }
}
