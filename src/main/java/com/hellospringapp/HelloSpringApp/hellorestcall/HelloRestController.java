package com.hellospringapp.HelloSpringApp.hellorestcall;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/")
    public String index(){
        return "Hello from BridgeLabz";
    }

}
