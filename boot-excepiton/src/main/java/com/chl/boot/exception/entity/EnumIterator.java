package com.chl.boot.exception.entity;

/**
 * @program: 枚举迭代
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-12 10:45
 **/

public class EnumIterator {
    public static void main(String[] args) {
        for (Color color : Color.values()) {
            System.out.println(color);
        }
    }
}
