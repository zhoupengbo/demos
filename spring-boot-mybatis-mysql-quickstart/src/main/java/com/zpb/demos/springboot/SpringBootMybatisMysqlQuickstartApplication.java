package com.zpb.demos.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zpb.demos.springboot.mapper")
public class SpringBootMybatisMysqlQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisMysqlQuickstartApplication.class, args);
    }

}
