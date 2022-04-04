package com.chl.boot.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 16:03
 **/
@Component
@Slf4j
public class BeanInitListener implements InitializingBean {
    static {
        log.info("类初始化，静态代码块");
    }
    public BeanInitListener(){
        log.info("类初始化，构造方法");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("类初始化，afterPropertiesSet 方法");
    }
    @PostConstruct
    void method(){
        log.info("类初始化，PostConstruct注解方法");
    }
}
