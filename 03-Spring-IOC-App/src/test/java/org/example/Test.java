package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        // creating the IOC container , it will directly
        //  create the object of all the classes mentioned in the spring-beans.xml file.
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-beans.xml");
    }
}
