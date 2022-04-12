package com.chl.boot.exception.utils;

import com.chl.boot.exception.enums.CustomExceptionType;
import com.chl.boot.exception.exception.CustomException;
import lombok.Data;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-11 10:37
 **/
@Data
public class AjaxResponse {
    private int code;
    private String message;
    private Object data;

    private AjaxResponse() {

    }
    public static AjaxResponse error(CustomException e) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setCode(e.getCode());
        resultBean.setMessage(e.getMessage());
        return resultBean;
    }
    public static AjaxResponse error(CustomExceptionType customExceptionType ,String errotMessage) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setCode(customExceptionType.getCode());
        resultBean.setMessage(errotMessage);
        return resultBean;
    }
    public static AjaxResponse success(Object obj) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setCode(200);
        resultBean.setMessage("请求响应成功！");
        resultBean.setData(obj);
        return resultBean;
    }
    public static AjaxResponse success(Object obj,String message) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setCode(200);
        resultBean.setMessage(message);
        resultBean.setData(obj);
        return resultBean;
    }
}
