package com.chl.boot.orm.entity;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class TestATest {

    @Test
    void dozerTest2(){
        TestA zhangsan = new TestA("ZHANGSAN", "2020-03-28 12:12:12");
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        TestB map = mapper.map(zhangsan, TestB.class);
        log.info(String.valueOf(map));
    }

    @Test
    void dozerTest3(){
        Mapper build = DozerBeanMapperBuilder.create().withMappingFiles("dozer/dozer-mapping.xml").build();
        TestA zhangsan = new TestA("ZHANGSAN", "2020-03-28 12:12:12");

        log.info(String.valueOf(build.map(zhangsan, TestB.class)));
    }
}