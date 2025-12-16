package org.example._3springbootapp3.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class EmailService {
    public boolean sendEmail(String to, String subject , String body){
        // logic to send email

        System.out.println("Sending email to " + to);

        return true;
    }
}
