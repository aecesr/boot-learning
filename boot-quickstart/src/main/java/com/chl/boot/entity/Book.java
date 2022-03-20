package com.chl.boot.entity;

import lombok.*;
import org.slf4j.LoggerFactory;

/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-07 16:21
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    private Integer id;
    private String name;
    
}
