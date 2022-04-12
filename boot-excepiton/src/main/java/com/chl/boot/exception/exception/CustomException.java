package com.chl.boot.exception.exception;

import com.chl.boot.exception.enums.CustomExceptionType;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-11 10:33
 **/

public class CustomException extends RuntimeException{
    private int code;
    private String message;
    private CustomException(){

    }

    public CustomException(CustomExceptionType exceptionType) {
        this.code=exceptionType.getCode();
        this.message=exceptionType.getDesc();
    }
    public CustomException(CustomExceptionType customExceptionType,String message) {
        this.code=customExceptionType.getCode();
        this.message=message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
