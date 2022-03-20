package com.chl.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-14 10:58
 **/
@SpringBootApplication
@Slf4j
@ImportResource(locations = {"classpath:bean.xml","classpath:bean1.xml"})
public class BootConfigApplication  {
    public static void main(String[] args) {
        SpringApplication.run(BootConfigApplication.class,args);
        log.info("服务器启动成功");
    }

}
