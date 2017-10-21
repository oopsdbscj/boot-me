package hello.config.crawl;

import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author tab chan 10/21/2017
 */
public class PicDownloadTask implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(PicDownloadTask.class);
    private static Object lock = new Object();
    public static List<String> pics = new ArrayList<>();

    public PicDownloadTask() {
//        this.lock = lock;
    }

    @Override
    public void run() {
        int j = 0;
        while (1 == 1) {
            synchronized (lock) {
                if (!CollectionUtils.isEmpty(pics)) {
                    for (int i = j; i < pics.size(); i++) {
                        if (pics.get(i) != null) {
                            String url = pics.get(i);

                            BufferedImage image = null;
                            try {
                                URL picurl = new URL(url);
                                image = ImageIO.read(picurl);

                            String ext = url.substring(url.length() - 3, url.length());
                            File file = new File("/home/tab/craw/" + UUID.randomUUID().toString() + "." + ext);
                            LOGGER.info("文件路径=" + file.getPath());
                            ImageIO.write(image, ext, file);
                            pics.remove(j);
                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        j++;
                    }
                }

            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
