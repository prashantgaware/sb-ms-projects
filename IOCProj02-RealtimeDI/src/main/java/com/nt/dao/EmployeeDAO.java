package com.nt.dao;

import com.nt.bo.EmployeeBO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class EmployeeDAO implements IEmployeeDAO{

    private DataSource ds;

    public EmployeeDAO(DataSource ds){
        this.ds = ds;
    }

    @Override
    public int insertEmployee(EmployeeBO bo) throws Exception {
        try {
            Connection connection= ds.getConnection();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            throw sqlException;
        } finally {

        }

        return 0;
    }
}
