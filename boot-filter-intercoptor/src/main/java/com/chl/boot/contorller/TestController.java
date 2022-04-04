package com.chl.boot.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 10:44
 **/
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request, HttpSession session) {
//        request.setAttribute("a","a");
//        request.setAttribute("a","b");
//        request.getAttribute("a");
//        request.removeAttribute("a");
//
//        session.setAttribute("a", "a");
//        session.getAttribute("a");
//        session.invalidate();

        return  "Hello world";
    }
}
