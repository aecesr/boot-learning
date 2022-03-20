package com.chl.boot.model;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
@RunWith(SpringRunner.class)
@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserTest {
    @Autowired
    private User user;

    @Resource
    private StringEncryptor encryptor;

    @Test
    void printUser(){
        String name = encryptor.encrypt(user.getName());
        System.out.println(name);
        System.out.println(user);
    }
}