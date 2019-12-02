package com.chuxin;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo
@SpringBootApplication
@MapperScan("com.chuxin.mapper")
public class HdCxShipServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HdCxShipServiceApplication.class, args);
    }

}
