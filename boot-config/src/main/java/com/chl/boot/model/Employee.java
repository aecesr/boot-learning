package com.chl.boot.model;

import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @program: boot-learning
 * @description: @Configuration注解，表示本类是一个配置类
 * @Author: 曹红亮
 * @create: 2022-03-14 15:39
 **/
@Data
@Configuration
@PropertySource(name = "employeeProperties", value = "classpath:employee.properties", encoding = "UTF-8")
public class Employee {

    @Value("#{'${employee.name}'.split(',')}")
    private List<String> employeeNames;

    @Value("#{'${employee.type}'.split(',')}")
    private List<String> employeeTypes;

    @Value("#{${employee.age}}")
    private Map<String, Integer> employeeAge;

    @Value("#{'${employee.name}'.split(',')[0]}")
    private String employeeName;

    @Value("#{${employee.age}['one']!=null ? ${employee.age}['one']:80}")
    private Integer ageWithDefaultValue;

    @Value("#{{systemProperties['java.home']}}")
    private String javaHome;

    @Value("#{systemProperties['user.dir']}")
    private String userDir;


}
