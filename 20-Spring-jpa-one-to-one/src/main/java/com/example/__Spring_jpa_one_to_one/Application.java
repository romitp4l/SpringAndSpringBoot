package com.example.__Spring_jpa_one_to_one;

import com.example.__Spring_jpa_one_to_one.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        PersonService service = context.getBean(PersonService.class);
       service.savePerson();
//        service.getPerson();
//        service.getPassport();

   //     service.deletePerson();


    }

}
