package looseVStightCoupling.Annotations_package.App_config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig_2 {
    @Bean
    public Human human(){
        return new Human("John",25);
    }
}
