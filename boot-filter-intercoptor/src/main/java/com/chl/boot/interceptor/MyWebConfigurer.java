package com.chl.boot.interceptor;

import com.chl.boot.interceptor.CustomHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 11:41
 **/
@Configuration
public class MyWebConfigurer implements WebMvcConfigurer {

//    @Resource
//    CustomHandlerInterceptor customHandlerInterceptor;

    @Resource
    AccessLogInterceptor accessLogInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//       registry.addInterceptor(customHandlerInterceptor).addPathPatterns("/*");
       registry.addInterceptor(accessLogInterceptor).addPathPatterns("/**");
    }
}
