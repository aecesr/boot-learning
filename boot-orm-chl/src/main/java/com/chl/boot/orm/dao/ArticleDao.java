package com.chl.boot.orm.dao;

import com.chl.boot.orm.entity.Article;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.List;

/*
 * @description:
 * @author 曹红亮
 * @date 2022/3/18 16:17
 */
@Repository
public class ArticleDao {
    @Resource
    JdbcTemplate jdbcTemplate;

    /**
     * @param article 入参
     */
    public int save(Article article) {
        String sql = "INSERT INTO article (author,title,content) VALUES (?,?,?)";
        return jdbcTemplate.update(sql, article.getAuthor(), article.getTitle(), article.getContent());
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM article WHERE id = ?", id);
    }

    public int updateById(Article article) {
        String sql = "UPDATE article SET author = ?, title = ?, content = ?, create_time = ?, WHERE id = ?";
        return jdbcTemplate.update(sql, article.getAuthor(), article.getTitle(), article.getContent(), article.getCreateTime());
    }

    public Article findById(int id) {
        String sql = "SELECT * FROM article WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Article.class), id);
    }

    public List<Article> findAll() {
        String sql = "SELECT * FROM article";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Article.class));
    }


}
