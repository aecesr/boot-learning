package com.chl.boot.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.mail.MessagingException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class MailServiceTest {
//    @Resource
//    private MailService mailService;
//
//    @Test
//    public void sendSimpleMail() {
//        mailService.setFromEmail("1061595986@qq.com", "普通文本邮件", "普通文本邮件内容测试");
//    }
//
//
//    @Test
//    public void sendHtmlMail() throws MessagingException {
//        mailService.setHtmlEmail("16422802@qq.com", "HTML测试邮件", """
//
//                <body>
//                                                                                  <div style="text-align: center; margin: 0 auto"><h2>小曹发给小廖</h2></div>
//                                                                                  <p
//                                                                                    style="color: #c28743; float: left; font-size: 22px; margin: 0 0.2em 0 0"
//                                                                                  >
//                                                                                    我们日复一日地写下自身的命运，因为我们的所为，毫不留情地决定我们的命运。我相信这就是人生的最高逻辑和法则
//                                                                                  </p>
//                                                                                  <div style="clear: both"></div>
//                                                                                  <hr />
//                                                                                  <h3 style="white-space: nowrap; text-overflow: ellipsis; width: 200px">
//                                                                                    时间最会骗人，但也能让你明白，这个世界没有什么是不能失去的，留下的尽力珍惜，得不到的都不重要
//                                                                                  </h3>
//                                                                                  <div
//                                                                                    style="
//                                                                                      display: -webkit-box;
//                                                                                      -webkit-box-orient: vertical;
//                                                                                      /* -webkit-line-clamp: 2; */
//                                                                                      width: 200px;
//                                                                                    "
//                                                                                  >
//                                                                                    漫长人生中，什么都不是一眼看到头的，一时的春风得意算不了什么，一时的失败也不能算数。人生进退是常事，想要成功，关键在于能不能"熬"得住。
//                                                                                  </div>
//                                                                                  <hr />
//                                                                                  <img
//                                                                                    src="https://chl-bucket.oss-cn-hangzhou.aliyuncs.com/md/202204121843724.png"
//                                                                                    alt=""
//                                                                                  />
//                                                                                </body>
//                                                                             """);
//    }
//
//
//    @Test
//    public void sendAttachtsMail() throws MessagingException {
//        String filePath = "D:\\桌面\\web\\note\\资源\\头像\\Chl\\head4.jpg";
//        mailService.setAttachmentsEmail("1061595986@qq.com", "这是一封带附件的邮件--来自chl", "邮件中有附件，请注意查收", filePath);
//    }
}