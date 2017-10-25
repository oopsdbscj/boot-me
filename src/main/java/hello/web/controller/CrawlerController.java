package hello.web.controller;

import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;
import hello.config.crawl.CrawlConfigEnhance;
import hello.config.crawl.factory.CsiCrawlerCrawlerControllerFactory;
import hello.config.crawl.seed.Seed;
import hello.web.util.RequestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author tab  10/19/2017
 */
@RestController()
public class CrawlerController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CrawlerController.class);
    @Value("${crawl.config.numberOfCrawlers}")
    private int numberOfCrawlers;
    @Autowired
    private CrawlConfigEnhance crawlConfig;

    private List<Seed> seeds;

    @RequestMapping("/start")
    public Object startCrawl(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap resutls = new HashMap();
        try {
            PageFetcher pageFetcher = new PageFetcher(crawlConfig);
            RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
            RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, pageFetcher);
            CrawlController controller = new CrawlController(crawlConfig, pageFetcher, robotstxtServer);

            if(CollectionUtils.isEmpty(seeds)){
                resutls.put("success", "failed");
                return resutls;
            }
            this.seeds.stream().forEach((seed) -> {
                controller.addSeed(seed.getUrl());
            });
            CsiCrawlerCrawlerControllerFactory factory = new CsiCrawlerCrawlerControllerFactory(crawlConfig);
            controller.startNonBlocking(factory,numberOfCrawlers);
        } catch (Exception e) {
            LOGGER.error("starting crwler error ... msg: {}", e.getMessage(), e);
        }
        resutls.put("success", "ok");
        return resutls;
    }

    /**
     * add seeds
     *
     * @return
     */
    @RequestMapping("add-seeds")
    public Object addSeeds(HttpServletRequest request, HttpServletResponse response) throws Exception {
        if (CollectionUtils.isEmpty(this.seeds)) {
            this.seeds = new ArrayList<>();
        }
        String name = RequestUtil.getString("name", request);
        String url = RequestUtil.getString("url", request);
        if (!StringUtils.isEmpty(url)) {
            this.seeds.add(new Seed(name, url));
        }
        HashMap resutls = new HashMap();
        resutls.put("success","ok");
        return resutls;
    }
}
