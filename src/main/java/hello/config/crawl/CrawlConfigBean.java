package hello.config.crawl;

import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tab chan 10/19/2017
 */
@Configuration
public class CrawlConfigBean {

    @Bean
    @ConfigurationProperties(prefix = "crawl.config")
    public CrawlConfig getCrawlConfigBean() {
        return new CrawlConfig();
    }
}
