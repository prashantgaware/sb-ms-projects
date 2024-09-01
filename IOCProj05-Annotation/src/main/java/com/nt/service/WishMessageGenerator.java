package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class WishMessageGenerator {

    @Autowired
    private Date date;

    public WishMessageGenerator() {
        System.out.println("WishMessageGenerator.WishMessageGenerator");
    }

    public String generateMessage(String user) {
        System.out.println("WishMessageGenerator.generateMessage = " + date);

        @SuppressWarnings("deprecation")
        int hour = date.getHours();
        if (hour < 12)
            return "Good Morning " + user;
        else if (hour < 16)
            return "Good Afternoon " + user;
        else if (hour < 20)
            return "Good Evening " + user;
        else
            return "Good Night " + user;
    }

}
