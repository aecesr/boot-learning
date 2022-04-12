package com.chl.boot.exception.controller;

import com.chl.boot.exception.entity.Article;
import com.chl.boot.exception.service.ExecutorService;
import com.chl.boot.exception.utils.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-11 10:53
 **/
@RestController
public class ArticleController {

    @Resource
    private ExecutorService executorService;

    @GetMapping("/test/{id}")
    public Article test(@PathVariable("id") int id) {
        if (id == 0) {
            executorService.systemBizError();
        }
        executorService.userBizError(id);
        return Article.builder().id(id).title("SpringBoot").build();
    }


    @PostMapping("/articles")
    public Article saveArticle(@Valid @RequestBody Article article) {
        return article;
    }
}
