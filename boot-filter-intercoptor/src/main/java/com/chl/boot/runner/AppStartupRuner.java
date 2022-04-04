package com.chl.boot.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 15:44
 **/
@Slf4j
@Component
public class AppStartupRuner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("AppStartupRuner参数名称：{}", args.getOptionNames());
        log.info("AppStartupRuner参数值：{}", args.getOptionValues("age"));
        log.info("AppStartupRuner参数：{}", Arrays.toString(args.getSourceArgs()));
    }
}
