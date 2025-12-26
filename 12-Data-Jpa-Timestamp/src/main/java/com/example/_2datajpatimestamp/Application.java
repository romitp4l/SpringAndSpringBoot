package com.example._2datajpatimestamp;

import com.example._2datajpatimestamp.entity.ContactUsEntity;
import com.example._2datajpatimestamp.reop.ContactUsRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        ContactUsRepo bean = context.getBean(ContactUsRepo.class);

        ContactUsEntity entity = new ContactUsEntity();
        entity.setCemail("romitpal4@gmail.com");
        entity.setCname("Romit");
        entity.setCphoneNo("12345690089");
     //   entity.setContactId(1);


        bean.save(entity);
    }

}
