package com.nt.test;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Scanner;

public class RealtimeDITest {
    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext
                        ("D:\\Practice\\sb-ms-projects-intelliJ\\IOCProj02-RealtimeDI\\src\\main\\java\\com\\nt\\cfgs\\applicationContext.xml") ;

        MainController controller = ctx.getBean("controller", MainController.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name : ");
        String name = scanner.next();
        System.out.println("Enter Employee Designation : ");
        String desg = scanner.next();
        System.out.println("Enter Employee Basic Salary : ");
        String basicSalary = scanner.next();

        EmployeeVO vo = new EmployeeVO();
        vo.setEname(name);
        vo.setDesg(desg);
        vo.setBasicSalary(basicSalary);

        try{
            String result = controller.processEmployee(vo);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
