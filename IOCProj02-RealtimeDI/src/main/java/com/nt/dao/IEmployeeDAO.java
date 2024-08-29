package com.nt.dao;

import com.nt.bo.EmployeeBO;

public interface IEmployeeDAO {
    int insertEmployee(EmployeeBO bo) throws Exception;
}
