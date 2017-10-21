package hello.config.crawl;

import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author tab chan 10/20/2017
 */
@Component
@ConfigurationProperties(prefix = "crawl.config")
public class CrawlConfigEnhance extends CrawlConfig {
    private int numberOfCrawlers=7;
    private String startsWith;

    public String getStartsWith() {
        return startsWith;
    }

    public void setStartsWith(String startsWith) {
        this.startsWith = startsWith;
    }

    public int getNumberOfCrawlers() {
        return numberOfCrawlers;
    }

    public void setNumberOfCrawlers(int numberOfCrawlers) {
        this.numberOfCrawlers = numberOfCrawlers;
    }

    @Override
    public String toString() {
        return "CrawlConfigEnhance{" +
                "numberOfCrawlers=" + numberOfCrawlers +
                ", startsWith='" + startsWith + '\'' +
                "} " + super.toString();
    }
}
