package com.example;

import com.example.com.example.demo.dao.UserDAO;
import com.example.com.example.demo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {


        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        UserDAO bean = context.getBean(UserDAO.class);
        UserDAO bean1 = context.getBean(UserDAO.class);

        System.out.println(bean.hashCode());
        System.out.println(bean1.hashCode());

        UserService service = context.getBean(UserService.class);
        service.getUsername(100);
    }

}
