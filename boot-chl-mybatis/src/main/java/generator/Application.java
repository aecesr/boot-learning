package generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @description:
 * @author 曹红亮
 * @date 2022/3/18 16:18
 */
@SpringBootApplication
@MapperScan(basePackages = {"generator.mapper"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

