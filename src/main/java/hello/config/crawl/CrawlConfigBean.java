package hello.config.crawl;

/**
 * @author tab chan 10/19/2017
 */
public class CrawlConfigBean{
    private String startsWith;

    private String crawlStorageFolder;

    private int maxDepthOfCrawling = -1;

    private int maxPagesToFetch = -1;

    public String getCrawlStorageFolder() {
        return crawlStorageFolder;
    }

    public void setCrawlStorageFolder(String crawlStorageFolder) {
        this.crawlStorageFolder = crawlStorageFolder;
    }

    public int getMaxDepthOfCrawling() {
        return maxDepthOfCrawling;
    }

    public void setMaxDepthOfCrawling(int maxDepthOfCrawling) {
        this.maxDepthOfCrawling = maxDepthOfCrawling;
    }

    public int getMaxPagesToFetch() {
        return maxPagesToFetch;
    }

    public void setMaxPagesToFetch(int maxPagesToFetch) {
        this.maxPagesToFetch = maxPagesToFetch;
    }

    public String getStartsWith() {
        return startsWith;
    }

    public void setStartsWith(String startsWith) {
        this.startsWith = startsWith;
    }

    @Override
    public String toString() {
        return "CrawlConfigBean{" +
                "startsWith='" + startsWith + '\'' +
                ", crawlStorageFolder='" + crawlStorageFolder + '\'' +
                ", maxDepthOfCrawling=" + maxDepthOfCrawling +
                ", maxPagesToFetch=" + maxPagesToFetch +
                '}';
    }
}
