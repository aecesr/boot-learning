package com.chl.boot.task;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.concurrent.Future;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ScheduledJobsTest {
    @Resource
    private ScheduledJobs scheduledJobs;


    @Test
    public void test() throws Exception{
        scheduledJobs.cronJob();
        scheduledJobs.fixedDelayJob();
        scheduledJobs.fixedRateJob();
        scheduledJobs.mailJob();
    }


}