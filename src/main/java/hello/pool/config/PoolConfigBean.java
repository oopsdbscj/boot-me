package hello.pool.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PoolConfigBean {
    @Bean
    @ConfigurationProperties(prefix = "app.datasource")
    public DataSource getDataSource() {
        return new HikariDataSource();
    }
}
