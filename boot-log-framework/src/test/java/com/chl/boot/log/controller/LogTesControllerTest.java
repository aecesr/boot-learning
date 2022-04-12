package com.chl.boot.log.controller;

import org.slf4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class LogTesControllerTest {


    private final Logger logger = LoggerFactory.getLogger(LogTesControllerTest.class);

    @Test
    public void contextLoads() {
        logger.info("数据库日志info");
        logger.error("数据库日志error");
    }


}