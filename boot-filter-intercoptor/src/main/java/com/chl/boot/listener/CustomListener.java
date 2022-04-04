package com.chl.boot.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 10:42
 **/
@Slf4j
@WebListener
public class CustomListener implements ServletContextListener , HttpSessionListener, ServletRequestAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("context创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("context销毁");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {

        if ("a".equals(srae.getName())) {
            log.info("attribute添加");
        }
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {

        if ("a".equals(srae.getName())) {
            log.info("attribute移除");
        }
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        log.info("attribute修改");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("session创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("session销毁");
    }
}
