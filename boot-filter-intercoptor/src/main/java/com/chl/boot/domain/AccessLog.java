package com.chl.boot.domain;

import com.chl.boot.util.FormatUtil;
import lombok.Data;

import java.util.Date;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-04 14:06
 **/
@Data
public class AccessLog {
    /*
    * 访问者用户名
    */
    private String username;
    /*
     * 请求路径
     */
    private String url;

    /*
     * 请求消耗时长
     */
    private Integer duration;
    /*
     * 请求方法
     */
    private String httpMethod;
    /*
     * 请求状态码
     */
    private Integer httpStatus;
    /*
     * 访问者用户IP
     */
    private  String ip;
    /*
     * 记录创建时间
     */
    private Date createTime;

    @Override
    public String toString() {
        return "{" +
                "username='" + this.username + ',' +
                ", ip='" + this.ip + ',' +
                ", duration=" + this.duration +
                ", httpMethod='" + this.httpMethod + ',' +
                ", httpStatus=" + this.httpStatus +
                ", url='" + this.url + ',' +
                ", createTime=" + FormatUtil.forTime(this.createTime) +
                '}';
    }
    //    private

}
