package com.chl.boot.datasource.repository;

import com.chl.boot.orm.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="articles")
public interface ArticleRepository extends JpaRepository<Article,Integer> {
    Article findByAuthor(String author);
}