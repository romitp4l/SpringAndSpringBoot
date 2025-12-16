package org.example._5springbootapp5bean_lifecycle;

import org.example._5springbootapp5bean_lifecycle.beans.Car;
import org.example._5springbootapp5bean_lifecycle.beans.Motor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        Car bean = context.getBean(Car.class);
        bean.drive();

        Motor beanMotor = context.getBean(Motor.class);

        System.out.println(beanMotor.hashCode());

        
        context.close();
    }

}
