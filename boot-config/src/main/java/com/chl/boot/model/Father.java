package com.chl.boot.model;

import lombok.Data;



/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-14 11:07
 **/
@Data
public class Father {


    private String name;

//    @Min(value=22,message = "爸爸的年龄不能少于22")
    private Integer age;

//    @Email
    private String email;
}

