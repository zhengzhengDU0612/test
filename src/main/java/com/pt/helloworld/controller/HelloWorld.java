package com.pt.helloworld.controller;


import com.pt.helloworld.service.HelloWorldService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloWorld {

    @Resource
    private HelloWorldService helloWorldService;


    @ResponseBody
    @RequestMapping("/hello")
    public  String hello() {
        return  "Hello World...";
    }
}
