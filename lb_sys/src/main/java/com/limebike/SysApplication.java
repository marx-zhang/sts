package com.limebike;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.limebike.*.dao")
public class SysApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysApplication.class, args);
    }

}
