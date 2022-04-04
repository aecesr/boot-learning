package com.chl.boot.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 15:44
 **/
@Component
@Slf4j
public class CommanddLIneStartupRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("CommanddLIneStartupRunner传入参数：{}", Arrays.toString(args));
    }
}
