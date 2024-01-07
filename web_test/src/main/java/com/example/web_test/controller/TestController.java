package com.example.web_test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {


    @GetMapping({"/", ""})
    public String index(){

        System.out.println("index...");

        return "index";
    }


    @GetMapping("/test")
    public String test(){

        System.out.println("재미있넹~");

        return "test/test";
    }

}
