package hello.config.crawl.seed;

/**
 * @author tab chan 10/19/2017
 */
public class Seed {
    private String name;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Seed{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
