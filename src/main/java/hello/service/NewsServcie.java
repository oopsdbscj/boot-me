package hello.service;

import hello.mapper.NewsMapper;
import hello.pojo.News;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author tab chan
 * @date 10/29/2017
 */
@Service
public class NewsServcie {
    private static final Logger LOGGER = LoggerFactory.getLogger(NewsServcie.class);
    @Autowired
    private NewsMapper newsMapper;

    public News getNews(int id) {
        return newsMapper.getNews(id);
    }
    public List<News> getFirstClass(){
        return newsMapper.firstClass();
    }
    public Map<String,News> getMap(int id){
        LOGGER.info(newsMapper.getMap(id).toString());
        newsMapper.getMap(id).keySet().forEach(key -> {
            LOGGER.info(key);});
        return newsMapper.getMap(id);
    }
}
