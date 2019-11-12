package com.chuxin.hd.cx.sea.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan("com.chuxin.mapper")
public class HdCxSeaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HdCxSeaServiceApplication.class, args);
    }

}
