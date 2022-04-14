package com.chl.boot.exception.entity;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-12 10:57
 **/

public class EnumTest {
    public static void main(String[] args) {
//        调用values()
        Color[] values = Color.values();
//        迭代枚举
        for (Color color : values) {
//            查看索引
            System.out.println(color+"at index"+color.ordinal());
        }
        //使用valueof（）返回枚举常量，不存在的会报错
        System.out.println(Color.valueOf("RED"));
    }
}
