package com.chl.boot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-12 15:25
 **/
@Service
public class MailService {
    @Resource
    private JavaMailSender mailSender;

    @Value("1725942140@qq.com")
    private String fromEmail;

    //    发送文本邮件
    public void setFromEmail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmail);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        mailSender.send(message);
    }

    //发送HTML邮件

    public void setHtmlEmail(String to,String subject, String content)throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(fromEmail);
        helper.setTo(to);
        helper.setSubject(subject);
        //第二个参数表示是否是html，true代表是
        helper.setText(content, true);
        mailSender.send(message);
    }

    //发送带附件的邮件
    public void setAttachmentsEmail(String to,String subject, String content,String filePath)throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        //附带第二个参数true
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(fromEmail);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(content, true);
        //添加附件资源
        FileSystemResource file = new FileSystemResource(new File(filePath));
        String fileName = filePath.substring(filePath.lastIndexOf(File.separator));
        helper.addAttachment(fileName,file);
        //发送邮件
        mailSender.send(message);
    }
}
