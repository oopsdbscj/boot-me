package hello.service;

import hello.mapper.NewsMapper;
import hello.pojo.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tab chan
 * @date 10/29/2017
 */
@Service
public class NewsServcie {
    @Autowired
    private NewsMapper newsMapper;

    public News getNews(int id) {
        return newsMapper.getNews(id);
    }
}
