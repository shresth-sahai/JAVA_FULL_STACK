package looseVStightCoupling.Annotations_package.App_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("App_config")
public class AppConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld("World");
    }
}
