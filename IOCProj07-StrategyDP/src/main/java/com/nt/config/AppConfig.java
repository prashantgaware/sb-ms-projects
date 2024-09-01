package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.*")
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig.AppConfig");
    }
}
