package com.nt.test;

import com.nt.config.AppConfig;
import com.nt.vehicle.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);
        vehicle.journey("Bengaluru" , "Mysuru");

        ctx.close();
    }
}
