package org.example.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        PaymentProcessor processor = (PaymentProcessor) ctx.getBean("payment");
        processor.processPayment(3000.00);
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
