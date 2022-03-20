package com.chl.boot.orm.dao;

import com.chl.boot.orm.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*
 * @description:JPA操作数据
 * @author 曹红亮
 * @date 2022/3/18 16:18
 */
public interface ArticleRepository extends JpaRepository<Article, Integer> {

    /**
     * 注意这个方法的名称，JPA会根据方法名自动生成SQL执行
     * 等同于：SELECT * FROM article WHERE author =?
     * @param author author
     * @return List<Article>
     */

    List<Article> findByAuthor(String author);
}
