package com.chl.boot.filter;

import com.chl.boot.service.TestService;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 11:03
 **/
//@WebFilter(filterName = "myFilter",urlPatterns = {"/*"})
@Slf4j
public class MyFilter implements Filter {
//    @Resource
//    private TestService testService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("MyFilter初始化");
    }

    @Override
    public void destroy() {
        log.info("MyFilter销毁");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("MyFilter请求处理之前");
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("MyFilter请求处理之后");
    }
}
