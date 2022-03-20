package com.chl.boot.restful.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-13 16:10
 **/
@Configuration
public class DpenAPIConfig {
    @Bean
    public GroupedOpenApi articleApi(){
        return GroupedOpenApi.builder().group("api-v1-articles").pathsToMatch("/api/v1/articles/**").build();
    }
    @Bean
    public GroupedOpenApi helloApi(){
        return GroupedOpenApi.builder().group("hello").pathsToMatch("/hello/**").build();
    }
}
