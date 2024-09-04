package com.nt;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.beans.WishMessageGenerator;

/**
 * 
 */
@SpringBootApplication
public class BootProj01StarterApplication {
	
	/**
	 * 
	 * @return
	 */
	@Bean()
	public Calendar createCalendar() {
		return Calendar.getInstance();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj01StarterApplication.class, args);
		
		WishMessageGenerator wmg = ctx.getBean(WishMessageGenerator.class);
		
		String result = wmg.wishGenerator("Raja");
		System.out.println(result);
	}

}
