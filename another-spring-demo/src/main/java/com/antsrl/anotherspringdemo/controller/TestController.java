package com.antsrl.anotherspringdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "/hello")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(value = "/anotherHello")
    public String anotherHelloWorld() {
        return "Another Hello World";
    }


}
