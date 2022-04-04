package com.chl.boot.datasource.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @description:
 * @author 曹红亮
 * @date 2022/4/1 22:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BootUser {
    private Integer id;
    private String name;
    private String detail;
}