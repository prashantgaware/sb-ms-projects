package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("empDAO")
public class EmployeeDAO implements IEmployyeDAO {

	private static final String GET_EMP_BY_DESG = 
			"SELECT EMPNO, EMPNAME, JOB, EMPSALARY FROM EMPLOYEE WHERE JOB IN(?, ?, ?) ORDER BY JOB";

	@Autowired
	private DataSource ds;

	private List<Employee> listEmps;
	
	@Override
	public List<Employee> getEmployeesByDesg(String desg1, String desg2, String desg3) throws Exception {

		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_EMP_BY_DESG)) {
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			try(ResultSet rs = ps.executeQuery()) {
				listEmps = new ArrayList<Employee>();
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEmpNo(rs.getInt(1));
					emp.setEmpName(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setEmpSalary(rs.getFloat(4));
					listEmps.add(emp);
				}
			}
		}  catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		
		return listEmps;
	}

}
