package com.chl.boot.exception.enums;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-11 10:28
 **/

public enum CustomExceptionType {
    USER_INPUT_ERRDR(400, "您输入的数据错误或您没有权限访问资源！"),


    SYSTEM_ERRDR(500,"系统出现异常，请您稍后再试或联系管理员"),

    OTHER_ERRDR(999,"系统出现未知异常，请联系管理员");

    CustomExceptionType(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    private final int code;
    private final String desc;

}
