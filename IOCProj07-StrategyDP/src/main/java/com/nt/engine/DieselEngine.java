package com.nt.engine;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements IEngine{

    public DieselEngine() {
        System.out.println("DieselEngine.PetrolEngine");
    }

    @Override
    public void start() {
        System.out.println("DieselEngine.start");
    }

    @Override
    public void stop() {
        System.out.println("DieselEngine.stop");
    }
}
