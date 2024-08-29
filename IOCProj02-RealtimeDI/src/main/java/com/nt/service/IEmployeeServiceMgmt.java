package com.nt.service;

import com.nt.dto.EmployeeDTO;

public interface IEmployeeServiceMgmt {
    String registerEmployee(EmployeeDTO dto) throws Exception;
}
