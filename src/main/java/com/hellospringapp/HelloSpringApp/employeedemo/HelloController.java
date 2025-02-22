package com.hellospringapp.HelloSpringApp.employeedemo;

import com.hellospringapp.HelloSpringApp.employeedemo.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private ApplicationContext context;
    @GetMapping("/uc5")
    public String sayHelloUC3() {

        Employee employee = context.getBean(Employee.class);
        employee.showEmployeeDetails();
        return "Employee details logged successfully!";
    }
}
