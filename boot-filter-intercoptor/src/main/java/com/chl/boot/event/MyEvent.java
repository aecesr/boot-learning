package com.chl.boot.event;

import com.chl.boot.Application;
import org.springframework.context.ApplicationEvent;

import java.awt.desktop.AppEvent;

/**
 * @program: 自定义事件
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 15:06
 **/

public class MyEvent extends ApplicationEvent {
    public MyEvent (Object source){
        super(source);
    }

}
