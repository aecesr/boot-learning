package com.chl.boot.model;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import java.util.Map;

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)

class EmployeeTest {

    @Resource
    private Employee employee;



    @Test
    void testEmployee() throws Exception{
        log.info(String.valueOf(employee));
//        Map<String, Integer> map = employee.getEmployeeAge();
//        for(String key:map.keySet()){
//            System.out.println("key:"+key+" "+"Value:"+map.get(key));
//        }
    }

}