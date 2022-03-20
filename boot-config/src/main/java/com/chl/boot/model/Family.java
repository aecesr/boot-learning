package com.chl.boot.model;

import lombok.Data;


import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-14 11:08
 **/
@Data
//@Component
// 配置整体前缀
//@ConfigurationProperties(prefix = "family")
@Validated
//@PropertySource(value = {"classpath:family.properties"})
public class Family {

    @Length(min = 5,max = 20,message = "家庭名称长度必须子5-20位之间")
    private String familyName;

    private Father father;

    private Mother mother;

    private Child child;

}
