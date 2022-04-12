package com.chl.boot.exception.handler;

import com.chl.boot.exception.enums.CustomExceptionType;
import com.chl.boot.exception.exception.CustomException;
import com.chl.boot.exception.utils.AjaxResponse;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-11 10:59
 **/
@ControllerAdvice
public class WebExceptionHandler {
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public AjaxResponse customerException(CustomException e) {
        if (e.getCode() == CustomExceptionType.SYSTEM_ERRDR.getCode()) {
            //400异常不需要持久化，将异常信息以友好的方式告知用户就可以
            //将50异常信息持久化处理，方便运维人员处理
        }
        return AjaxResponse.error(e);
    }


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public AjaxResponse exception(Exception e) {
        return  AjaxResponse.error(new CustomException(
                CustomExceptionType.OTHER_ERRDR
        ));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public AjaxResponse handleBindexception(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        assert fieldError!=null;
        return AjaxResponse.error(new CustomException(CustomExceptionType.USER_INPUT_ERRDR,fieldError.getDefaultMessage()));
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public AjaxResponse handleBindexception(BindException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        assert fieldError!=null;
        return AjaxResponse.error(new CustomException(CustomExceptionType.USER_INPUT_ERRDR,fieldError.getDefaultMessage()));
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public AjaxResponse handleIllegalArgumentExceeption(IllegalArgumentException e) {

        return AjaxResponse.error(new CustomException(CustomExceptionType.USER_INPUT_ERRDR,e.getMessage()));
    }


}
