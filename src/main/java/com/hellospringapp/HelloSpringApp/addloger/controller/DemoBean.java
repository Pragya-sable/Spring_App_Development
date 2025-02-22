package com.hellospringapp.HelloSpringApp.addloger.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoBean {

    private static final Logger logger = LoggerFactory.getLogger(DemoBean.class);

    @GetMapping("/hello")
    public String getMessage() {
        logger.info("Inside DemoBean getMessage() method");
        return "Hello from DemoBean!";
    }
}
