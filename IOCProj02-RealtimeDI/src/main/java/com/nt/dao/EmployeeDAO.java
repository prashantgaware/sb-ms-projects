package com.nt.dao;

import com.nt.bo.EmployeeBO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO implements IEmployeeDAO{

    private static final String EMP_INSERT_INTO = "INSERT INTO realtimedi_spring_employee(ENAME, DESG, BASICSALARY, NETSALARY, GROSSSALARY) VALUES(?, ?, ?, ?, ?)";
    private DataSource ds;

    int result = 0;

    public EmployeeDAO(DataSource ds){
        this.ds = ds;
    }

    @Override
    public int insertEmployee(EmployeeBO bo) throws Exception {
        try (
                Connection connectione = ds.getConnection();
                PreparedStatement preparedStatement = connectione.prepareStatement(EMP_INSERT_INTO)
        ) {
            preparedStatement.setString(1, bo.getEname());
            preparedStatement.setString(2, bo.getDesg());
            preparedStatement.setFloat(3, bo.getBasicSalary());
            preparedStatement.setFloat(4, bo.getNetSalary());
            preparedStatement.setFloat(5, bo.getGrossSalary());

            result = preparedStatement.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            throw sqlException;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return result;
    }

    /*
    @Override
    public int insertEmployee(EmployeeBO bo) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection= ds.getConnection();

            preparedStatement = connection.prepareStatement(EMP_INSERT_INTO);

            preparedStatement.setString(1, bo.getEname());
            preparedStatement.setString(2, bo.getDesg());
            preparedStatement.setFloat(3, bo.getBasicSalary());
            preparedStatement.setFloat(4, bo.getNetSalary());
            preparedStatement.setFloat(5, bo.getGrossSalary());

            result = preparedStatement.executeUpdate();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            throw sqlException;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
//            preparedStatement.close();
//            connection.close();
            try {
                if (preparedStatement != null)
                    preparedStatement.close();
            } catch (SQLException se){
                se.printStackTrace();
                throw se;
            }

            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se){
                se.printStackTrace();
                throw se;
            }
        }

        return result;
    }
    */
}
