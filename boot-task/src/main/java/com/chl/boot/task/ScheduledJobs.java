package com.chl.boot.task;

import com.chl.boot.service.MailService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.util.Date;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-12 15:24
 **/
@Component
public class ScheduledJobs {

    @Resource
    private MailService mailService;

//    方法执行完成后5秒再开始执行定时任务
    @Scheduled(fixedDelay = 5000)
    public void fixedDelayJob() throws InterruptedException {
        System.out.println("fixedDelay====开始：" + new Date());
        Thread.sleep(10 * 1000);
        System.out.println("fixedDelay====结束：" + new Date());
    }

//每隔3秒，定时任务
    @Scheduled(fixedRate = 3000)
    public void fixedRateJob() throws InterruptedException {
        System.out.println("======fixedRate开始：" + new Date());
        Thread.sleep(10 * 1000);
        System.out.println("======fixedRate结束：" + new Date());
    }

//    每隔10秒执行一次，定时任务
    @Scheduled(cron = "0/10 * * * * ?")
    public void cronJob() {
        System.out.println("====================：...>>cron...." + new Date());
    }



//    @Scheduled(cron = " 0 0 20 12 4 ?")
    public  void mailJob() throws MessagingException {
        mailService.setHtmlEmail("2444359191@qq.com", "曹红亮HTML测试邮件", """ 
                                                                            
                <body>
                                                                                  <div style="text-align: center; margin: 0 auto"><h2>曹红亮HTML邮件测试</h2></div>
                                                                                  <p
                                                                                    style="color: #c28743; float: left; font-size: 22px; margin: 0 0.2em 0 0"
                                                                                  >
                                                                                    我们日复一日地写下自身的命运，因为我们的所为，毫不留情地决定我们的命运。我相信这就是人生的最高逻辑和法则
                                                                                  </p>
                                                                                  <div style="clear: both"></div>
                                                                                  <hr />
                                                                                  <h3 style="white-space: nowrap; text-overflow: ellipsis; width: 200px">
                                                                                    时间最会骗人，但也能让你明白，这个世界没有什么是不能失去的，留下的尽力珍惜，得不到的都不重要
                                                                                  </h3>
                                                                                  <div
                                                                                    style="
                                                                                      display: -webkit-box;
                                                                                      -webkit-box-orient: vertical;
                                                                                      /* -webkit-line-clamp: 2; */
                                                                                      width: 200px;
                                                                                    "
                                                                                  >
                                                                                    漫长人生中，什么都不是一眼看到头的，一时的春风得意算不了什么，一时的失败也不能算数。人生进退是常事，想要成功，关键在于能不能"熬"得住。
                                                                                  </div>
                                                                                  <hr />
                                                                                  <img
                                                                                    src="https://chl-bucket.oss-cn-hangzhou.aliyuncs.com/md/202204121843724.png"
                                                                                    alt=""
                                                                                    width="100%"
                                                                                  />
                                                                                </body>
                                                                             """);

    }
}
