package com.hellospringapp.HelloSpringApp.addloger.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    public static void main(String[]args){
        logger.debug("Welcome to spring concept demo");
        ApplicationContext context = (ApplicationContext) SpringApplication.run(HelloController.class,args);
        logger.debug("Checking Content: {}",context.getBean(DemoBean.class));
        logger.debug(("\n*** Example using @Autowire annotation on property ***"));
    }

}
