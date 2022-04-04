package com.chl.boot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 14:35
 **/

public class FormatUtil {
    public static String forTime(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return simpleDateFormat.format(new Date());
    }
}
