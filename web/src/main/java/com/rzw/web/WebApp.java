package com.rzw.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.rzw")
@MapperScan(basePackages = "com.rzw.dao")
public class WebApp {

    public static void main(String[] args) {
        SpringApplication.run(WebApp.class,args);
    }
}
