package config;
import entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 描述:
 *
 * @author Maserhe
 * @create 2021-01-11 1:21
 */
@Configuration
@ComponentScan("entity")
public class MaserheConfig {

    @Bean(name = "user")
    public User getUser(){
        return new User();
    }
}
