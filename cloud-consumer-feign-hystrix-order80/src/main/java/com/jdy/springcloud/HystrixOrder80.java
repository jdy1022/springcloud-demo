package com.jdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Mr.jdy
 * @create 2020-06-07 20:00
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixOrder80.class,args);
    }
}
