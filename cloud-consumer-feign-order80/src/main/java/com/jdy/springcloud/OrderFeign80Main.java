package com.jdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Mr.jdy
 * @create 2020-06-06 15:56
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeign80Main {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeign80Main.class,args);

    }
}
