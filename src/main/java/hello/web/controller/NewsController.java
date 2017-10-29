package hello.web.controller;

import hello.service.NewsServcie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tab chan
 * @date 10/29/2017
 */
@RestController
public class NewsController {
    private static final Logger LOGGER = LoggerFactory.getLogger(NewsController.class);
    @Autowired
    private NewsServcie newsServcie;

    @RequestMapping("/get/news/{id}")
    public Object getNewsById(@PathVariable("id")int id){
        LOGGER.info(newsServcie.getNews(id)+"");
        return newsServcie.getNews(id);
    }
}
