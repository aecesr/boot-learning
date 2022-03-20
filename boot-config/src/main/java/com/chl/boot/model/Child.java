package com.chl.boot.model;

import lombok.Data;

import java.util.List;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-14 11:06
 **/
@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friends;
}
