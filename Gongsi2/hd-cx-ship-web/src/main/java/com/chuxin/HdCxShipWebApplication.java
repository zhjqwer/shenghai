package com.chuxin;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubboConfig
@SpringBootApplication
public class HdCxShipWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HdCxShipWebApplication.class, args);
    }

}
