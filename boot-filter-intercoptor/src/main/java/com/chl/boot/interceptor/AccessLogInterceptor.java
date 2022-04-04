package com.chl.boot.interceptor;

import com.chl.boot.domain.AccessLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 14:08
 **/
@Slf4j
@Component
public class AccessLogInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //创建日志实体
        AccessLog accessLog = new AccessLog();
        //设置IP地址
        accessLog.setIp(request.getRemoteAddr());
//        设置请求方法GET post
        accessLog.setHttpMethod(request.getMethod());
//        设置请求路径（端点）
        accessLog.setUrl(request.getRequestURI());
//        设置请求开始时间
        request.setAttribute("sendTime",System.currentTimeMillis());
//        设置请求实体到request内，方便afterCompletion方法调用
        request.setAttribute("accessLog",accessLog);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        获取本次请求日志实体
        AccessLog accessLog = (AccessLog) request.getAttribute("accessLog");

//        获取请求错误码，根据需求存入数据库，这里不保存
        int status = response.getStatus();
        accessLog.setHttpStatus(status);

//        设置访问者
        accessLog.setUsername(request.getParameter("username"));

//        当前时间
        long currentTime = System.currentTimeMillis();

//        请求开始时间
        long endTime = Long.parseLong(request.getAttribute("sendTime").toString());

//        设置请求时间差
        accessLog.setDuration(Integer.valueOf((currentTime-endTime)+""));
        accessLog.setCreateTime(new Date());

//        打印日志
        log.info(accessLog.toString());

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
