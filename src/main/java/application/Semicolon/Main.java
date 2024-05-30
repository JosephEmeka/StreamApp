package application.Semicolon;

import application.config.ProjectConfig;
import application.sevices.HelloService;
import application.sevices.MailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("bean in context: " + Arrays.toString(context.getBeanDefinitionNames()));

//        HelloService helloService1 = context.getBean(HelloService.class);
//        helloService.sayHello("Aramide");

        //TODO:HelloService helloService2 = context.getBean(HelloService.class);
        //TODO:helloService1.sayHello("Aramide");

        MailService mailService = context.getBean(MailService.class);
        mailService.sendMailTo("joe@example.com");
    }


}