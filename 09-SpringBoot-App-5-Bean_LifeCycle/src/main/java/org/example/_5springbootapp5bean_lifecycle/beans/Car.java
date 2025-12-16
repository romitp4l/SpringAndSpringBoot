package org.example._5springbootapp5bean_lifecycle.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Car  implements InitializingBean, DisposableBean {


    public  void drive(){
        System.out.println("I am driving car .....");
    }

    @Override
    public void destroy() throws Exception {

        System.out.println(" Car stopped  ");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Car  starting .....");

    }
}
