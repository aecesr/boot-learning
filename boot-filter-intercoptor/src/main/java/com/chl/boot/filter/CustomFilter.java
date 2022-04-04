package com.chl.boot.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 11:05
 **/
//@WebFilter(filterName = "customFilter",urlPatterns = {"/*"})
@Slf4j
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("customFilter初始化");
    }

    @Override
    public void destroy() {
        log.info("customFilter销毁");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("customFilter请求处理之前");
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("customFilter请求处理之后");
    }
}
