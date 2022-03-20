package com.chl.boot.restful.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;


/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-10 19:03
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reader implements Serializable {
    @Serial
    private static final long serialVersionUID = 4538237642144500631L;
    private String name;
    private Integer age;

}
