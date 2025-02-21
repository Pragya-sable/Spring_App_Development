package com.hellospringapp.HelloSpringApp.helloworldapp.controller;

import com.hellospringapp.HelloSpringApp.helloworldapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // curl localhost:8080/hello -w "\n"
    @RequestMapping(value = {"", "/", "/home"})
    public String syHello(){
        return "Hello From Pragya!!!";
    }

    // curl localhost:8080/hello/query?name=Pragya -w "\n"
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello" + name + "!";
    }

    // curl localhost:8080/hello/param/Pragya -w "\n"
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " + name +"!";
    }

    // curl -X POST -H "Content-Type: application/json"
    //      -d '{"firstName": "Lisa","lastName": "Harry"}'
    //      "http://localhost:8080/hello/put/Lisa/?lastName=Terrisa -w "\n"
    @PostMapping("/post")
    public String sayHello(@RequestParam User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    @PutMapping("/pu/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName){
        return "Hello "+ firstName + " " + lastName + "!";
    }

}
