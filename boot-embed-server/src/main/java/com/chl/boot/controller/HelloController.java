package com.chl.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-08 09:57
 **/
@RestController
public class HelloController {
    @PostMapping(value = "/hello/")
    public String sayHello(){
        return "hello";
    }
}
