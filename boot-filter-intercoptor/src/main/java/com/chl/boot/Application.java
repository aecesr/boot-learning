package com.chl.boot;

import com.chl.boot.event.MyEvent;
import com.chl.boot.listener.MyListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 10:41
 **/
@SpringBootApplication
@ServletComponentScan
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        context.addApplicationListener(new MyListener1());
        context.publishEvent(new MyEvent("测试事件"));
//        SpringApplication.run(Application.class, args);
    }
}
