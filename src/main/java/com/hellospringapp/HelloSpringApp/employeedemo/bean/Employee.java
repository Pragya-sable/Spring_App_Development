package com.hellospringapp.HelloSpringApp.employeedemo.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Employee {
    private static final Logger logger = LoggerFactory.getLogger(Employee.class);

    public void showEmployeeDetails() {
        logger.info("Employee belongs to: Software Development");

    }
}
