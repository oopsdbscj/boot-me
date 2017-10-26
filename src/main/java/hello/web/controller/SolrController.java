package hello.web.controller;

import hello.pojo.News;
import hello.web.util.RequestUtil;
import hello.web.util.SolrResutlsToInstance;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.apache.solr.common.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tab chan 10/23/2017
 */
@RestController
public class SolrController {
    public static final Logger LOGGER = LoggerFactory.getLogger(SolrController.class);
    @Autowired
    private SolrClient solrClient;

    @RequestMapping("/put-doc")
    public Object putDoc(HttpServletRequest request, HttpServletResponse response) throws Exception {
        SolrInputDocument doc = new SolrInputDocument();
        doc.setField("test_name", "test_value");
        doc.setField("test_name_2", "test_value_2");
        Map<String, String> map = new HashMap<String, String>();
        try {
            solrClient.add(doc);
            solrClient.commit();
        } catch (SolrServerException e) {
            e.printStackTrace();
            map.put("success", "failed");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("success", "failed");
        }
        map.put("success", "ok");
        return map;
    }

    @RequestMapping("/search")
    public Object search(HttpServletRequest request, HttpServletResponse response) {
        String keyword = RequestUtil.getString("keyword", request);
        String start_str = RequestUtil.getString("start", request);
        String sort = RequestUtil.getString("sort", request);
        int start = 0;
        if (!StringUtils.isEmpty(start_str)) {
            start = Integer.parseInt(start_str);
        }
        LOGGER.info("keyword=" + keyword);
        //N0.1 simple query
//        String querySyntax = "*:"+keyword;
        String querySynstax = keyword;
        SolrQuery query = new SolrQuery(querySynstax);
        query.setStart(start);
        query.setSort(SolrQuery.SortClause.desc("id"));
        query.setHighlight(true).addHighlightField("title").addHighlightField("summary").setHighlightSimplePre("<span style=\"color:red\">");
        query.setHighlightSimplePost("</span>");
        query.setHighlightSnippets(2);//结果分片数，默认为1
        query.setHighlightFragsize(200);//每个分片的最大长度，默认为100

//        query.set
        QueryResponse queryResponse = null;
        try {
            queryResponse = solrClient.query(query);
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SolrDocumentList results = queryResponse.getResults();
        Class cls = News.class;
        List<News> news = (List<News>) SolrResutlsToInstance.instanceFromSolrDocuments(results, cls);
        SolrResutlsToInstance.setHighlighting(news,queryResponse.getHighlighting());
        List<Object> final_res = new ArrayList<>();
        final_res.add(results.getNumFound());
        if (CollectionUtils.isNotEmpty(news)) {
            final_res.addAll(news);
        }
        return final_res;
    }
}
