package org.example._5springbootapp5bean_lifecycle.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Motor {
    @PostConstruct
    public void init(){
        System.out.println(" Motor started  - init () method ");
    }

    @PreDestroy
    public void destroy(){
        System.out.println(" Motor stopped  ");
    }
}
