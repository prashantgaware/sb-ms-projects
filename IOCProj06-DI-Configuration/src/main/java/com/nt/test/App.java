package com.nt.test;

import com.nt.beans.Config;
import com.nt.service.WishMessageGenerator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        WishMessageGenerator wmg = ctx.getBean("wmg", WishMessageGenerator.class);

        String result = wmg.generateMessage("Raja");
        System.out.println(result);

        ctx.close();
    }
}
