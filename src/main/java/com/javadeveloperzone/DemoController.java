package com.javadeveloperzone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "hello")
    public String hello(){
        System.out.println("Hello");
        System.out.println("Hello111");
        return "Spring boot Gradle Example";
    }
}
