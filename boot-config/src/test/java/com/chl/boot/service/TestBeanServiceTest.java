package com.chl.boot.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.SpringBootExceptionReporter;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TestBeanServiceTest {
    @Resource
    private ConfigurableApplicationContext ico;

    @Test
    void testLoadService(){
        //從測試環境的上下文中去讀取xml配置文件，得到testBeanService
//        boolean flag = ico.containsBean("得到testBeanService");
//        assertTrue(flag);
        TestBeanService testBeanService = (TestBeanService) ico.getBean("testBeanService");
        TestBeanService testBeanService1111111 = (TestBeanService) ico.getBean("testBeanService1");
        System.out.println(testBeanService.getName());
        System.out.println(testBeanService1111111.getAge());

    }
}