package com.nt.service;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 *
 */
//@Component("wmg")
    @Component
public class WishMessageGenerator {

    /**
     *
     */
    private LocalDateTime ldt;

    /**
     *
     */
    public WishMessageGenerator(LocalDateTime ldt) {
        System.out.println("WishMessageGenerator.WishMessageGenerator");
        this.ldt = ldt;
    }

    /**
     *
     * @param user
     * @return
     */
    public String generateMessage(String user) {
        System.out.println("WishMessageGenerator.generateMessage");
        System.out.println(ldt);

        int hour = ldt.getHour();
        if (hour < 12)
            return "GM " + user;
        else if (hour < 16)
            return "GA " + user;
        else if (hour < 20)
            return "GE " + user;
        else
            return  "GN " + user;
    }
}
