package com.chl.boot.exception.entity;

/**
 * @program: boot-learning
 * @description: 枚举成员
 * @Author: 曹红亮
 * @create: 2022-04-12 10:47
 **/

public class SwitchMember {
    public static void main(String[] args) {
        Platform android = Platform.ANDROID;
        System.out.println(android);
        android.platformInfo();
    }
    enum Platform{
        ANDROID, IOS ,WEB;

        private Platform() {
            System.out.println("构造方法被调用："+this);
        }
        public void platformInfo(){
            System.out.println("平台信息："+this);
        }
    }
}
