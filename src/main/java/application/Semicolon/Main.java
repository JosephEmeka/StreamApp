package application.Semicolon;

import application.config.ProjectConfig;
import application.sevices.HelloService;
import application.sevices.MailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("bean in context: " + Arrays.toString(context.getBeanDefinitionNames()));

//        HelloService helloService1 = context.getBean(HelloService.class);
//        helloService.sayHello("Aramide");

        //TODO:HelloService helloService2 = context.getBean(HelloService.class);
        //TODO:helloService1.sayHello("Aramide");

        MailService mailService = context.getBean(MailService.class);
        mailService.sendMailTo("joe@example.com");

        Class<? extends MailService> mailServiceClass = mailService.getClass();
        Method declaredMethod = mailServiceClass.getDeclaredMethods()[1];
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(mailService,  new HelloService());
    }


}