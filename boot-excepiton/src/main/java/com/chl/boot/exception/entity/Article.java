package com.chl.boot.exception.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-04-11 10:28
 **/
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    @Min(4)
    private int id;

    @NotNull(message="文章标题不能为空")
    private String title;


}
