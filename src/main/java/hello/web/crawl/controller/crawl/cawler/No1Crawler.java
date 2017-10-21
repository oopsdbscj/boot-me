package hello.web.crawl.controller.crawl.cawler;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;
import hello.config.crawl.CrawlConfigEnhance;
import hello.config.crawl.PicDownloadTask;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

/**
 * @author tab chan 10/19/2017
 */
public class No1Crawler extends WebCrawler {
    private static final Logger LOGGER = LoggerFactory.getLogger(No1Crawler.class);
    private CrawlConfigEnhance crawlConfig;
    private List<String> pics = new ArrayList<>();

    private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|mp3|mp4|zip|gz))$");

    public No1Crawler() {
    }

    public No1Crawler(CrawlConfigEnhance crawlConfig) {
        this.crawlConfig = crawlConfig;
    }

    @Override
    public boolean shouldVisit(Page referringPage, WebURL url) {
        String href = url.getURL().toLowerCase();
        return !FILTERS.matcher(href).matches()
                && href.startsWith(crawlConfig.getStartsWith());
    }

    @Override
    public void visit(Page page) {
        String url = page.getWebURL().getURL();
        LOGGER.info("URL: " + url);
//        String start_point = "http://127.0.0.1:8080/start";

        if (page.getParseData() instanceof HtmlParseData) {
            HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
            String text = htmlParseData.getText();
            String html = htmlParseData.getHtml();
            Set<WebURL> links = htmlParseData.getOutgoingUrls();
            if (!CollectionUtils.isEmpty(links)) {
                for (WebURL link : links) {
                    String curUrl = link.getURL();
                    LOGGER.info("handling:" + curUrl);
//                    if (curUrl.endsWith(".jpg") || curUrl.endsWith(".gif") || curUrl.endsWith(".png")) {
                    if (curUrl.endsWith(".mp4")){
//                        LOGGER.info("got a picture!=" + curUrl);
                        LOGGER.info("got a vedio!=" + curUrl);
                        String start_point = "curUrl";
                        FileOutputStream fos = null;
                        InputStream is = null;
                        try {
                            /*try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }*/
                            //deal pic
                            PicDownloadTask.pics.add(curUrl);
                            //deal pic
                        } catch (Exception e) {
                            LOGGER.error("重新跳转到开启爬取接口失败:{}", e.getMessage(), e);
                        } finally {
                            if (is != null) {
                                try {
                                    is.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            if (fos != null) {
                                try {
                                    fos.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    } else {
//                        LOGGER.info("not a picture!=" + curUrl);

                        /*CloseableHttpClient httpclient = HttpClients.createDefault();
                        HttpGet httpGet = new HttpGet(start_point);
                        CloseableHttpResponse httpResponse = null;
                        try {
                            httpResponse = httpclient.execute(httpGet);
                            LOGGER.info(""+httpResponse.getStatusLine());
                            HttpEntity entity = httpResponse.getEntity();
                            EntityUtils.consume(entity);
                        } catch (IOException e) {
                            LOGGER.error("重新跳转到开启爬取接口失败:{}",e.getMessage(),e);
                        }*/
                    }
                }
            }

            System.out.println("Text length: " + text.length());
            System.out.println("Html length: " + html.length());
            System.out.println("Number of outgoing links: " + links.size());
        }
    }

    public static void main(String[] args) throws IOException {
        URL picurl = new URL("https://www.dorcel.com/productions/files/00/00/53/00005309-93fa1b3ce1ce2200d13950ef45dc682f3ad43f2f/_88C7435.jpg");
        BufferedImage image = ImageIO.read(picurl);
        File file = new File("/home/tab/craw/" + UUID.randomUUID().toString() + ".jpg");
        ImageIO.write(image,"jpg",file);
    }
}
