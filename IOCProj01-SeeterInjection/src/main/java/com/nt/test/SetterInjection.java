package com.nt.test;

import com.nt.flipkart.Order;
import com.nt.flipkart.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SetterInjection {
    public static void main(String[] args) {
        ApplicationContext context =
                new FileSystemXmlApplicationContext(
                        "D:\\Practice\\sb-ms-projects-intelliJ\\IOCProj01-SeeterInjection\\src\\main\\resources\\applicationContext.xml");

        Order order1 = (Order) context.getBean("order1");
        System.out.println(order1.toString());
        Product product1 = order1.getProduct();
        System.out.println(product1.toString());

        Order order2 = (Order) context.getBean("order2");
        System.out.println(order2.toString());
        Product product2 = order2.getProduct();
        System.out.println(product2.toString());
    }
}
