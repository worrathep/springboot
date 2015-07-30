package thjug.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {

    @Bean
    HelloWorld helloWorld() {
        return new HelloWorld();
    }

}
