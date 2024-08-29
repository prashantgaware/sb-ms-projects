package com.nt.service;

import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceMgmt implements IEmployeeServiceMgmt{

    IEmployeeDAO dao;

    public EmployeeServiceMgmt(IEmployeeDAO dao){
        this.dao = dao;
    }

    @Override
    public String registerEmployee(EmployeeDTO dto) throws Exception {
        return "";
    }
}
