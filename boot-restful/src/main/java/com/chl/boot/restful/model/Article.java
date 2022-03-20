package com.chl.boot.restful.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-10 16:27
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonPropertyOrder(value = {"content","title"}) //按照指定排序来
public class Article {

    //@JsonIgnore //忽略掉json的序列化过程
    private Long id;

   // @JsonProperty("writer")//更改客户端获取的名称，把author改成了writer
    private String author;

    private String title;

    private String content;

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss",timezone ="GMT+8")
    private Date createTime;

    private List<Reader> readerlist;

}
