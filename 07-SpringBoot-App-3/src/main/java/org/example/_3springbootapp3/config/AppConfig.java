package org.example._3springbootapp3.config;

import org.example._3springbootapp3.support.AppSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig ::  0 - parameter argument constructor");
    }

    @Bean
    public AppSecurity createAppSecurity() {
        System.out.println("AppSecurity :: createAppSecurity");
        AppSecurity as = new AppSecurity();
        return as;
    }
}
