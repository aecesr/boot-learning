package com.chl.boot.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 11:05
 **/
//@Configuration
public class FilterRegistration {

    @Bean
   public FilterRegistrationBean  FilterRegistrationBean1(){
        FilterRegistrationBean registration = new FilterRegistrationBean();

        registration.setFilter(new CustomFilter());

        //过滤器名称
        registration.setName("cutomFilter");
        //过滤条件路径
        registration.addUrlPatterns("/*");
        //过滤等级顺序，数字越小优先级越高
        registration.setOrder(10);


        return registration;

    }

    @Bean
    public FilterRegistrationBean  FilterRegistrationBean2(){
        FilterRegistrationBean registration = new FilterRegistrationBean();

        registration.setFilter(new MyFilter());

        //过滤器名称
        registration.setName("myFilter");
        //过滤条件路径
        registration.addUrlPatterns("/*");
        //过滤等级顺序，数字越小优先级越高
        registration.setOrder(5);


        return registration;

    }
}
