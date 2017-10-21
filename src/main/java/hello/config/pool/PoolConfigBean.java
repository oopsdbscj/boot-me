package hello.config.pool;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author tab chan 10/19/2017
 */
@Configuration
public class PoolConfigBean {
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "app.datasource")
    public HikariConfig getDatasourceConfig(){
        return new HikariConfig();
    }

    @Bean
    public DataSource getDataSource(HikariConfig hikariConfig){
        return new HikariDataSource(hikariConfig);
    }

}
