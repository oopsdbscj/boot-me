package hello.web.controller.crawl.controller;

import com.zaxxer.hikari.HikariConfig;
import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;
import hello.config.crawl.seed.Seed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tab  10/19/2017
 */
@RestController("/crawl/")
public class CrawlerController {
    @Value("${crawl.config.numberOfCrawlers}")
    private int numberOfCrawlers;
    @Autowired
    private CrawlConfig crawlConfig;

    private List<Seed> seeds;

    @RequestMapping("/start")
    public Object startCrawl(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String crawlStorageFolder = "/data/crawl/root";

        /*
         * Instantiate the controller for this crawl.
         */
        PageFetcher pageFetcher = new PageFetcher(crawlConfig);
        RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
        RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, pageFetcher);
        CrawlController controller = new CrawlController(crawlConfig, pageFetcher, robotstxtServer);

        /*
         * For each crawl, you need to add some seed urls. These are the first
         * URLs that are fetched and then the crawler starts following links
         * which are found in these pages
         */
        controller.addSeed("https://en.wikipedia.org/wiki/Main_Page");
        controller.addSeed("http://www.ics.uci.edu/~welling/");
        controller.addSeed("http://www.ics.uci.edu/");

        /*
         * Start the crawl. This is a blocking operation, meaning that your code
         * will reach the line after this only when crawling is finished.
         */
        controller.start(MyCrawler.class, numberOfCrawlers);
    }

    /**
     * add seeds
     *
     * @return
     */
    @RequestMapping("addSeeds")
    public Object addSeeds(HttpServletRequest request, HttpServletResponse response) throws Exception {
        if (CollectionUtils.isEmpty(this.seeds)) {
            this.seeds = new ArrayList<>();
        }
        String name = request.getParameter("name");
        String url =
        if (!StringUtils.isEmpty(seed)) {
            this.seeds.add(seed);
        }
    }
}
