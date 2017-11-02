package hello.mapper;

import hello.pojo.News;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface NewsMapper {
    News getNews(int id);
    List<News> firstClass();
    Map<String,News> getMap(int id);
}
