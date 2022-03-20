package com.chl.boot.restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-13 16:09
 **/
@RestController
@RequestMapping("hello")
public class HelloConteoller {
    @GetMapping("world")
    public String getHelloWorld(){
        return "hello world";
    }

}
