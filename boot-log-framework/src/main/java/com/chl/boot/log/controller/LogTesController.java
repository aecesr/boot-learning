package com.chl.boot.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-11 13:51
 **/
@RestController
@RequestMapping(value = "/log")
public class LogTesController {
    private static final Logger logger= LoggerFactory.getLogger(LogTesController.class);
    @GetMapping("/test")
    public void test(){
            logger.trace("trace日志");
            logger.debug("debug日志");
            logger.info("info日志");
            logger.warn("warn日志");
            logger.error("error日志");

    }

    @PostMapping("/logback")
    public void contextLoads() {
        logger.info("数据库日志info");
        logger.error("数据库日志error");
    }
}
