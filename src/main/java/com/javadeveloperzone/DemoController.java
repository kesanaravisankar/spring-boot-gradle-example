package com.javadeveloperzone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "hello")
    public String hello(){
        System.out.println("Printing dummy message to console");
        return "Spring boot Gradle Example";
    }
}
