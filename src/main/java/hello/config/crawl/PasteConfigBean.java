package hello.config.crawl;

import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tab chan 10/20/2017
 */
@Configuration
public class PasteConfigBean {

    @Bean
    @ConfigurationProperties(prefix = "crawl.config")
    public CrawlConfigBean getCrawlConfigBean(){
        return new CrawlConfigBean();
    }

//    @Bean
    public CrawlConfig getCrawlConfig(CrawlConfigBean configBean){
        CrawlConfig config = new CrawlConfig();
        BeanUtils.copyProperties(configBean,config);
        return config;
    }
}
