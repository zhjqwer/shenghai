package com.cx.hd.sea.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@MapperScan("com.cx.hd.mapper")
@SpringBootApplication
public class HdSeaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HdSeaServiceApplication.class, args);
    }

}
