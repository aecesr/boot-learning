package com.chl.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-07 15:02
 **/
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public static String getHello(){
        return "Hello wo";
    }
}
