package com.jdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Mr.jdy
 * @create 2020-06-14 14:55
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3366Mian {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3366Mian.class,args);
    }
}
