package com.chl.boot.restful.mapper;

import com.chl.boot.restful.model.Article;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-10 19:47
 **/

public class mapper {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        Article a=Article.builder().author("chl").content("qqq").title("TI").build();
        String s = mapper.writeValueAsString(a);
        System.out.println(s);
        Article article = mapper.readValue(s, Article.class);
        System.out.println(article);

    }
}
