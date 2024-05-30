package application.sevices;

import org.springframework.stereotype.Component;

@Component
public class MailGunService implements MailService {
    @Override
    public void sendMailTo(String email){
        System.out.println("mail sent to " + email+ " using sendgrid");
    }
}
