package com.chl.boot.runner;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 15:48
 **/
@Slf4j
@Configuration
public class BeanRunner {
    @Bean
    @Order(1)
    public CommanddLIneStartupRunner runner1() {
        return new CommanddLIneStartupRunner() {
            @Override
            public void run(String... args) {
                log.info("CommanddLIneStartupRunner run1" + Arrays.toString(args));
            }
        };
    }

    @Bean
    @Order(2)
    public CommanddLIneStartupRunner runner2() {
        return new CommanddLIneStartupRunner() {
            @Override
            public void run(String... args) {
                log.info("CommanddLIneStartupRunner run2" + Arrays.toString(args));
            }
        };
    }

    @Bean
    @Order(3)
    public ApplicationRunner runner3() {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                log.info("ApplicationRunner run3" + Arrays.asList(args));
            }

//            public void run(String... args) {
//                log.info("ApplicationRunner run3" + Arrays.toString(args));
//            }
        };
    }

}
