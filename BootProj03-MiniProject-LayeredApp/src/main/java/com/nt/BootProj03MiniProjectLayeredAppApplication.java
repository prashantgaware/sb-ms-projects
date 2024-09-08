package com.nt;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.PayrollSystemController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03MiniProjectLayeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj03MiniProjectLayeredAppApplication.class, args);
		PayrollSystemController controller = ctx.getBean("controller", PayrollSystemController.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Desg1 : ");
		String desg1 = sc.next().toUpperCase();
		System.out.println("Enter Desg2 : ");
		String desg2 = sc.next().toUpperCase();
		System.out.println("Enter Desg3 : ");
		String desg3 = sc.next().toUpperCase();
		
		try {
			List<Employee> listEmps = controller.showEmployeeDetailsByDesg(desg1, desg2, desg3);
			listEmps.forEach(System.out::println);
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("Internal problem.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internal Database Problem.");
		} 
	}

}
