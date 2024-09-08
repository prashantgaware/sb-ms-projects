package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.dao.EmployeeDAO;

@SpringBootApplication
public class BootProj02AutoConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj02AutoConfigurationApplication.class, args);
		EmployeeDAO emp = ctx.getBean(EmployeeDAO.class);
		try {
			System.out.println("Employee Count : " + emp.getEmpCount());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
