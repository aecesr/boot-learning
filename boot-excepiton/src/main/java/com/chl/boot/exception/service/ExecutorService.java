package com.chl.boot.exception.service;

import com.chl.boot.exception.consts.MsgConsts;
import com.chl.boot.exception.enums.CustomExceptionType;
import com.chl.boot.exception.exception.CustomException;
import org.springframework.stereotype.Service;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-11 10:43
 **/
@Service
public class ExecutorService implements MsgConsts{
    public void systemBizError() {
        try {
            Class.forName("com.chl.jdbc.cj.Driver");
        } catch (ClassNotFoundException e) {
            throw new CustomException(
                    CustomExceptionType.SYSTEM_ERRDR,
                    "在xxx业务，myBiz（）方法内，出现ClassNotFoundException，请将该信息告知管理员"
            );
        }
    }

    public void userBizError(int input){
        if (input < 0) {
            throw new CustomException(CustomExceptionType.USER_INPUT_ERRDR, MsgConsts.INPUT_ERROR
//                    CustomExceptionType.USER_INPUT_ERRDR,
//                    "您输入的数据不符合业务逻辑，请确认后重新输入！"
            );
        }
    }

}
