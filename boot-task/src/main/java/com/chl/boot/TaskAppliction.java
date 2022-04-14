package com.chl.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-12 15:38
 **/
@SpringBootApplication
@EnableAsync
@EnableScheduling
public class TaskAppliction {
    public static void main(String[] args) {
        SpringApplication.run(TaskAppliction.class);
    }
}
