package com.chl.boot.model;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Description: spring-boot-encrypt
 * User: jeikerxiao
 * Date: 2019/7/19 2:11 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DatabaseTest {

    @Resource
    private StringEncryptor encryptor;

    @Test
    public void getPass() {
        String url = encryptor.encrypt("jdbc:mysql://localhost:3306/mydb?autoReconnect=true&serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8");
        String name = encryptor.encrypt("root");
        String password = encryptor.encrypt("root");
        System.out.println("database url: " + url);
        System.out.println("database name: " + name);
        System.out.println("database password: " + password);
        Assert.assertTrue(url.length() > 0);
        Assert.assertTrue(name.length() > 0);
        Assert.assertTrue(password.length() > 0);
    }
}
