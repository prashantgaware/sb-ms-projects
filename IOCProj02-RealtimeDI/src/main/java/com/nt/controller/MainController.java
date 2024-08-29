package com.nt.controller;

import com.nt.service.IEmployeeServiceMgmt;
import com.nt.vo.EmployeeVO;

public class MainController {
    private IEmployeeServiceMgmt service;

    public MainController(IEmployeeServiceMgmt service){
        this.service = service;
    }

    public String prcessEmployee(EmployeeVO vo) throws Exception{
        return null;
    }
}
