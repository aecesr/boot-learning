package com.chl.boot.template.controller;


import com.chl.boot.template.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 09:55
 **/
@Controller
@RequestMapping("/template")
public class TemplateContorller {

    @GetMapping("/freemarker")
    public String freemakerIndex(Model model){
        List<Article> articles = Arrays.asList(
                new Article(1,"张三","JAVA")
                ,new Article(2,"张三锋","Spring")
                ,new Article(3,"张三风","SpringBoot")
        );
        model.addAttribute("articles",articles);
        System.out.println(articles);
        return  "freemaker-demo";
    }

    @GetMapping("/thymeleaf")
    public String thymeleafIndex(Model model){
        List<Article> articles = Arrays.asList(
                new Article(1,"张三","JAVA")
                ,new Article(2,"张三锋","Spring")
                ,new Article(3,"张三风","SpringBoot")
        );
        model.addAttribute("articles",articles);
        System.out.println(articles);
        return  "thymeleaf-demo";
    }
}
