package hello;

import hello.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    private final UserMapper userMapper;

    public DemoApplication(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public static class Print{
        void out(Object args){
            System.out.println("============hah===================");
        }
    }

    @Bean
    CommandLineRunner sampleCommandLineRunner() {
        Print p = new DemoApplication.Print();
        return p::out;
    }



}
