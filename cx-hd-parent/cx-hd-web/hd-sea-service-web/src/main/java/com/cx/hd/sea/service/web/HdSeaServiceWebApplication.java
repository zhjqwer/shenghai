package com.cx.hd.sea.service.web;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class HdSeaServiceWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HdSeaServiceWebApplication.class, args);
    }

}
