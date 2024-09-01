package com.nt.test;

import com.nt.singleton.Printer;

import java.util.Date;

public class SingletonTest {
    public static void main(String[] args) {
        Printer p1 = Printer.getInstance();
        p1.print("Hello Singleton");
    }
}
