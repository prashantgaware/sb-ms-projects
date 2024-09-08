package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller("controller")
public class PayrollSystemController {
	
	@Autowired
	private IEmployeeService empService;

	public List<Employee> showEmployeeDetailsByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> listEmps = empService.fetchEmpByDesg(desg1, desg2, desg3);
		return listEmps;
	}
}
