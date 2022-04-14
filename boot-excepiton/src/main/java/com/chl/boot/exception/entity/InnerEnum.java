package com.chl.boot.exception.entity;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-12 10:43
 **/

public class InnerEnum {
    enum SEASON {
        SPRING, SUMMER, AUTUMN, WINTER;
    }

    public static void main(String[] args) {
        SEASON summer = SEASON.SUMMER;
        System.out.println(summer);
    }
}
