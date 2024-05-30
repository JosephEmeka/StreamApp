package application.config;

import application.sevices.HelloService;
import application.sevices.MailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "application")
public class ProjectConfig {
    @Bean
    @Primary
    public HelloService helloService1() {
        return new HelloService();
    }

    @Bean
    public HelloService helloService2() {
        return new HelloService();
    }

}



