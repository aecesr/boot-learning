package com.chl.boot.model;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.Resource;

/*
 * @description:JUnit5
 * @author 曹红亮
 * @date 2022/3/14 11:12
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
class FamilyTest {
    @Resource
    private Family family;



    @Test
    void printFamily(){


        System.out.println(family);
    }

}