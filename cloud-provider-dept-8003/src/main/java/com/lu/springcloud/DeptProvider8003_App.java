package com.lu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(value = "com.lu.springcloud.dao")
@ComponentScan(value = "com.lu.springcloud.*")
@EnableEurekaClient
public class DeptProvider8003_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003_App.class,args);
    }
}
