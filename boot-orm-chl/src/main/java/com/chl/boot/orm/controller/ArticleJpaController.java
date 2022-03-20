package com.chl.boot.orm.controller;

import com.chl.boot.orm.common.AjaxResponse;
import com.chl.boot.orm.entity.Article;
import com.chl.boot.orm.service.impl.ArticleJpaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/*
 * @description:
 * @author 曹红亮
 * @date 2022/3/18 16:17
 */
@RestController
@RequestMapping(value = "/api/v1/articles")
public class ArticleJpaController {
    @Resource
    private ArticleJpaServiceImpl articleJpaService;


    @GetMapping(value = "/all")
    public AjaxResponse selectAll() {
        return AjaxResponse.success(articleJpaService.selectAll());
    }

    @PostMapping()
    public AjaxResponse addArticle(@RequestBody Article article) {
        return AjaxResponse.success(articleJpaService.saveArticle(article));
    }

    @PutMapping()
    public AjaxResponse updateArticle(@RequestBody Article article) {
        if (articleJpaService.saveArticle(article) != null) {
            return AjaxResponse.success("修改成功");
        } else {
            return AjaxResponse.failure();
        }
    }

    @GetMapping("{id}")
    public AjaxResponse findById(@PathVariable int id) {
        return AjaxResponse.success(articleJpaService.findById(id));
    }
}
