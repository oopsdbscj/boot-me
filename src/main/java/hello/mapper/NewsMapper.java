package hello.mapper;

import hello.pojo.News;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NewsMapper {
    News getNews(int id);
}
