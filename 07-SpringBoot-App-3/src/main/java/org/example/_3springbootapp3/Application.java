package org.example._3springbootapp3;

import org.example._3springbootapp3.service.UserService;
import org.example._3springbootapp3.support.AppSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        UserService user = context.getBean(UserService.class);

        user.registerUser("Romit","romitpal4@gmail.com","abc@123");

        AppSecurity beanAnnotationDemonstration = context.getBean(AppSecurity.class);

        System.out.println(beanAnnotationDemonstration.hashCode() +"    Bean annotation demonstration");


    }

}
