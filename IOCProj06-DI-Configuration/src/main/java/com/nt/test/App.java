package com.nt.test;

import com.nt.beans.Config;
import com.nt.service.WishMessageGenerator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
//        WishMessageGenerator wmg = ctx.getBean("wmg", WishMessageGenerator.class);
        WishMessageGenerator wmg = ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);

        String result = wmg.generateMessage("Raja");
        System.out.println(result);
        System.out.println("++++++++++++++++++++++");
        LocalDateTime ldt = ctx.getBean("getLdt", LocalDateTime.class);
        System.out.println(ldt);

        ctx.close();
    }
}
