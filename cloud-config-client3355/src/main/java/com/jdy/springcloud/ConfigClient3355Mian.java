package com.jdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Mr.jdy
 * @create 2020-06-14 11:15
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3355Mian {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3355Mian.class,args);
    }
}
