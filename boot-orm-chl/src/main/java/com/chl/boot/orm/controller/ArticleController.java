package com.chl.boot.orm.controller;

import com.chl.boot.orm.service.ArticleService;
import com.chl.boot.orm.entity.Article;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * @description:
 * @author 曹红亮
 * @date 2022/3/18 16:17
 */
@RestController
//@RequestMapping(value = "/api/v1/articles")
@AllArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

//    @GetMapping(value = "/all")
    public List<Article> selectAll() {
        return articleService.selectAll();
    }
}
