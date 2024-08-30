package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeServiceMgmt;
import com.nt.vo.EmployeeVO;

public class MainController {

    private IEmployeeServiceMgmt service;

    public MainController(IEmployeeServiceMgmt service){
        this.service = service;
    }

    public String processEmployee(EmployeeVO vo) throws Exception{
        EmployeeDTO dto = new EmployeeDTO();
        dto.setEname(vo.getEname());
        dto.setDesg(vo.getDesg());
        dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));

        return service.registerEmployee(dto);
    }
}
