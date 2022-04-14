package com.chl.boot.task;

import java.util.Random;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-12 15:31
 **/

public abstract class AbstractTask {
    private static final Random random=new Random();
    public void doTaskOne() throws  Exception{
        System.out.println("开始做任务一");
        long l = currentTimeMillis();
        sleep(random.nextInt(10000));
        long l1 = currentTimeMillis();
        System.out.println("完成任务一，耗时："+(l1-l)+"毫秒");
    }
    public void doTaskTwo() throws  Exception{
        System.out.println("开始做任务二");
        long l = currentTimeMillis();
        sleep(random.nextInt(10000));
        long l1 = currentTimeMillis();
        System.out.println("完成任务二，耗时："+(l1-l)+"毫秒");
    }
    public void doTaskThree() throws  Exception{
        System.out.println("开始做任务三");
        long l = currentTimeMillis();
        sleep(random.nextInt(10000));
        long l1 = currentTimeMillis();
        System.out.println("完成任务三，耗时："+(l1-l)+"毫秒");
    }
}
