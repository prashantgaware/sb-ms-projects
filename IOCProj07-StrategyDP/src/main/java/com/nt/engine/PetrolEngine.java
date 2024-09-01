package com.nt.engine;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrol")
@Primary
public class PetrolEngine implements IEngine{

    public PetrolEngine() {
        System.out.println("PetrolEngine.PetrolEngine");
    }

    @Override
    public void start() {
        System.out.println("PetrolEngine.start");
    }

    @Override
    public void stop() {
        System.out.println("PetrolEngine.stop");
    }
}
