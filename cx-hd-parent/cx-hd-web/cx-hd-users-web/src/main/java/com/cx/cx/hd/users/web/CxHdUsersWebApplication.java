package com.cx.cx.hd.users.web;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class CxHdUsersWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CxHdUsersWebApplication.class, args);
    }

}
