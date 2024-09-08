package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empDAO")
public class EmployeeDAO {
	
	/**
	 * 
	 */
	private static final String GET_EMP_COUNT = "SELECT COUNT(*) FROM realtimedi_spring_employee";
	
	/**
	 * 
	 */
	@Autowired
	private DataSource ds;
	
	/**
	 * 
	 */
	public EmployeeDAO() {
		System.out.println("EmployeeDAO.EmployeeDAO()");
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public int getEmpCount() throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(GET_EMP_COUNT);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		
		ps.close();
		con.close();
		
		return count;
	}
}
