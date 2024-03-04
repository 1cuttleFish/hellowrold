package com.example.hellowrold;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello()
    {
        return "<h1>Hello World，2023309056 张忠杰</h1>";
    }
}
