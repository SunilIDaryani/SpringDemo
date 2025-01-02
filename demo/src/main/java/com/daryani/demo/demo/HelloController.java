package com.daryani.demo.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    
    @GetMapping("test")
    public String getTest() {
        return "Test";
    }
    
}
