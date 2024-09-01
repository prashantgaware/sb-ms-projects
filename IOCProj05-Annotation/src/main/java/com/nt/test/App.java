package com.nt.test;

import com.nt.service.WishMessageGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new FileSystemXmlApplicationContext
                ("D:\\Practice\\sb-ms-projects-intelliJ\\IOCProj05-Annotation\\src\\main\\java\\com\\nt\\service\\applicationContext.xml");

        WishMessageGenerator wmg = (WishMessageGenerator) ctx.getBean("wmg");
        String result = wmg.generateMessage("Raja");
        System.out.println(result);
    }
}
