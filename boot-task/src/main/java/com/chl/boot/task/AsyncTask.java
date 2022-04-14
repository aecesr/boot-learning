package com.chl.boot.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-12 15:23
 **/
@Component
public class AsyncTask extends AbstractTask{

    @Override
    @Async//同步方法改为异步方法
    public void doTaskOne() throws Exception {
        super.doTaskOne();
    }

    @Override
    @Async
    public void doTaskTwo() throws Exception {
        super.doTaskTwo();
    }

    @Override
    @Async
    public void doTaskThree() throws Exception {
        super.doTaskThree();
    }
}
