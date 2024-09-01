package com.nt.vehicle;

import com.nt.engine.IEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

    @Autowired
    @Qualifier("diesel")
    private IEngine engine;

    public Vehicle() {
        System.out.println("Vehicle.Vehicle");
    }

    public void journey(String startPlace, String destination) {
        engine.start();
        System.out.println("journey started at " + startPlace);
        System.out.println("journey ended at " + destination);
        engine.stop();
    }
}
