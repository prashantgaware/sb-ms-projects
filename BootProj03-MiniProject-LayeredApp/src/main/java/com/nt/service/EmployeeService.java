package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployyeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private IEmployyeDAO empDAO;

	@Override
	public List<Employee> fetchEmpByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> listEmps = empDAO.getEmployeesByDesg(desg1, desg2, desg3);
		return listEmps;
	}

}
