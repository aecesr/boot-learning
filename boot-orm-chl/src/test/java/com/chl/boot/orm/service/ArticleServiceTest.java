package com.chl.boot.orm.service;

import com.chl.boot.orm.entity.Article;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @description:
 * @author 曹红亮
 * @date 2022/3/18 16:21
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleServiceTest {

    @Resource
    private ArticleService articleService;

    @Test
    public void saveArticle() {
        Article article = Article.builder()
                .author("mth")
                .title("Java")
                .content("Java从入门到入土")
                .build();
        Article saveAriticle = articleService.saveArticle(article);
        assertNotNull(saveAriticle);
    }
}