package com.chl.boot.config;

import com.chl.boot.task.QuartzSimpleTask;
import org.quartz.*;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-12 15:25
 **/
//@Configuration
public class QuarizSimpleConfig {



    @Bean
    public JobDetail uploadTaskDetail() {
        return JobBuilder.newJob(QuartzSimpleTask.class).withIdentity("QuartzSimpleTask")
                .storeDurably().build();
    }


    @Bean
    public Trigger uploadTaskTrigger() {
        //这里设定触发执行的方式
        CronScheduleBuilder scheduleBuilder =CronScheduleBuilder.cronSchedule("*/2 * * * * ?");
        // 返回任务触发器
        return TriggerBuilder.newTrigger().forJob(uploadTaskDetail())
                .withIdentity("QuartzSimpleTask")
                .withSchedule(scheduleBuilder)
                .build();
    }

}
