package hello;

import hello.config.crawl.PicDownloadTask;
import hello.mapper.UserMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShiftApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiftApplication.class, args);
    }
    private final UserMapper userMapper;

    public ShiftApplication(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public static class Print{
        void out(Object args){
            System.out.println("============hah===================");
        }
    }

    @Bean
    CommandLineRunner sampleCommandLineRunner() {
        Print p = new ShiftApplication.Print();
        Thread run = new Thread(new PicDownloadTask());
        run.start();
        return p::out;
    }



}
