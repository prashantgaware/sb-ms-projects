package com.nt.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
@ComponentScan("com.*")
public class Config {

    /**
     *
     */
    public Config() {
        System.out.println("Config.Config");
    }

    /**
     *
     * @return
     */
//    @Bean
    @Bean("getLdt")
    public LocalDateTime getLDT() {
        System.out.println("Config.getLDT");

        return LocalDateTime.now();
    }
}
