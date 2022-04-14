package com.chl.boot.exception.entity;



import static java.awt.Color.*;


/**
 * @program: boot-learning
 * @description: 在switch中使用枚举
 * @Author: 曹红亮
 * @create: 2022-04-12 10:50
 **/

public class SwitchEnum {
    public static void main(String[] args) {
        Color c = Color.RED;
        switch (c) {
            case RED -> System.out.println("红色");
            case GREEN -> System.out.println("绿色");
            case BLUE -> System.out.println("蓝色");
            default -> System.out.println("默认颜色");
        }
    }
}
