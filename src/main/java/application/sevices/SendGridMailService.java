package application.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SendGridMailService  implements MailService{

    //Todo:First Approach(The field is made final)

    //Todo:@Autowired
    private HelloService helloService;

    //Todo:Second Approach
    @Autowired
    public SendGridMailService(HelloService helloService) {
        System.out.println("Creating sendGridMailService");
        this.helloService = helloService;
    }
    //Todo:Third Approach
    @Autowired
    private void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }



    @Override
    public void sendMailTo(String email){
        helloService.sayHello("Joe King");
        System.out.println("mail sent to " + email+ " using sendgrid");
    }
}
