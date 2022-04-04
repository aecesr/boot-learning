package com.chl.boot.listener;

import com.chl.boot.event.MyEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class CustomListenerTest {
    @Resource
    private ApplicationContext context;

    @Test
    void testEven(){
        context.publishEvent(new MyEvent("测试事件"));
    }
}