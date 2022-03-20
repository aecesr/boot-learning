package com.chl.boot.model;

import com.chl.boot.BootConfigApplication;
import com.chl.boot.util.MixPropertySourceFactory;
import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


/**
 * @program: boot-learning
 * @description:
 * @Author: 曹红亮
 * @create: 2022-03-14 14:13
 **/
@Data
@Component
@ConfigurationProperties(prefix = "user")
@PropertySource(value = {"classpath:user.yml"},factory = MixPropertySourceFactory.class)
@Validated
public class User {

    @NotNull
    private String name;
    @Min(value = 13)
    private Integer age;

    @Valid
    private Book book;
}
