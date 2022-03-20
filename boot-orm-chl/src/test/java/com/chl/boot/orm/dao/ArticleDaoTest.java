package com.chl.boot.orm.dao;

import com.chl.boot.orm.entity.Article;
import com.chl.boot.orm.service.impl.ArticleJpaServiceImpl;
import com.chl.boot.orm.service.impl.ArticleServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

/*
 * @description:
 * @author 曹红亮
 * @date 2022/3/18 16:19
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleDaoTest {

    @Resource
    private ArticleJpaServiceImpl articleJpaService;

    @Test
    void save() {
        Article article = Article.builder()
                .author("chl")
                .title("Java")
                .content("Java从入门到入土")
                .build();
        Object c=articleJpaService.saveArticle(article);
        assertEquals(1,c);

    }

    @Test
    void deleteById() {
    }

    @Test
    void updateById() {
    }

    @Test
    void findById() {
        int a=1;
        Object c=articleJpaService.findById(a);
        System.out.println(c);

    }
}