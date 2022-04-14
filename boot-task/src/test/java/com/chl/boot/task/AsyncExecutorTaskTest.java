package com.chl.boot.task;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.concurrent.Future;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class AsyncExecutorTaskTest {
    @Resource
    private AsyncExecutorTask asyncExecutorTask;


    @Test
    public void testSyncTasks() throws Exception {
        Future<String> task1 = asyncExecutorTask.doTaskOneCallback();
        Future<String> task2 = asyncExecutorTask.doTaskTwoCallback();
        Future<String> task3 = asyncExecutorTask.doTaskThreeCallback();

        sleep(30 * 1000L);
    }
}