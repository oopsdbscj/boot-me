package hello.config.pool;

import com.zaxxer.hikari.HikariConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tab chan 10/19/2017
 */
@Configuration
public class PoolConfigBean {
    @Bean
    @ConfigurationProperties(prefix = "app.datasource")
    public HikariConfig getDatasourceConfig(){
        return new HikariConfig();
    }

}
