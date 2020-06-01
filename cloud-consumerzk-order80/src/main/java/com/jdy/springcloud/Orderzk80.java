package com.jdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Mr.jdy
 * @create 2020-06-01 21:48
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Orderzk80 {
    public static void main(String[] args) {
        SpringApplication.run(Orderzk80.class,args);
    }
}
